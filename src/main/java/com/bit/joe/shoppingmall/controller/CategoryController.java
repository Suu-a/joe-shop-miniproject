package com.bit.joe.shoppingmall.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.joe.shoppingmall.dto.CategoryDto;
import com.bit.joe.shoppingmall.dto.response.Response;
import com.bit.joe.shoppingmall.service.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/create")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response> createCategory(@RequestBody CategoryDto categoryDto) {
        return ResponseEntity.ok(categoryService.createCategory(categoryDto));
    }

    @PostMapping("/get-by-name")
    public ResponseEntity<Response> getProductId(@RequestBody CategoryDto categoryDto) {
        return ResponseEntity.ok(categoryService.getCategoryByName(categoryDto));
    }

    @GetMapping("/get-all")
    public ResponseEntity<Response> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    // 일단 category는 update 기능을 막아두고, 꼭 필요한 경우에만 사용해야 함.
    //    @PutMapping("/update/{categoryId}")
    //    @PreAuthorize("hasAuthority('ADMIN')")
    //    public ResponseEntity<Response> updateCategory(
    //            @PathVariable Long categoryId, @RequestBody CategoryDto categoryDto) {
    //        return ResponseEntity.ok(categoryService.updateCategory(categoryId, categoryDto));
    //    }

    // Category only can be deleted when it has no child product.
    @DeleteMapping("/delete/{categoryId}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response> deleteCategory(@PathVariable Long categoryId) {
        return ResponseEntity.ok(categoryService.deleteCategory(categoryId));
    }

    @GetMapping("/get-category-by-id/{categoryId}")
    public ResponseEntity<Response> getCategoryById(@PathVariable Long categoryId) {
        return ResponseEntity.ok(categoryService.getCategoryById(categoryId));
    }
}
