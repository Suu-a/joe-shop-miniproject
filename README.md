# joe-shop-miniproject

A mini shopping mall project built with Bit Fullstack course.

[![codecov](https://codecov.io/gh/fish895623/joe_shop/branch/master/graph/badge.svg?token=KlvQQwQnPl)](https://codecov.io/gh/fish895623/joe_shop)

## 테스트 실행방법

Docker 설치 후 `./gradlew test --info` 작업 실행

## 코드 기여방법

### 1. 브랜치 만들기

`git checkout -b __브랜치 이름__`
`__브랜치 이름__` 대신에 영어 초성-기능설명 으로 이름짓기
ex) `bsh-authorization-button`

### 2. 코드 내용 적용

코드를 올리기 전 `./gradlew spotlessApply` 를 실행하여 코드 컨벤션 적용
`git add` 와 `git commit -m` 을 이용하여 수정한 파일 추가, 코드 변경내용 요약하여 기록하기
[상세 설명](https://hihiha2.tistory.com/4)

### 3. 코드 올리기

`git push`를 사용하여 코드 올리기.
올라가지 않을 경우 `git push -u origin` 적용

### 4. Pull Request 요청 (택 1)

#### 방법 1.

`git push` 작업후 페이지에서 `Pull Request` 작업 진행
[Pull Request Draft](https://github.blog/news-insights/product-news/introducing-draft-pull-requests/) 를 만들어 놓습니다.
개발 작업 도중에 수시로 커밋을 푸시하도록 합니다.
개발완료 후 [Ready For Review](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/changing-the-stage-of-a-pull-request) 버튼을 눌러줍니다.

#### 방법 2.

https://cli.github.com/ 툴을 설치 후
`gh pr create --web` 명령어로 코드 합치기 요청

### 5. 완료 작업

`git checkout master` 를 이용하여 원래 브랜치로 이동
`git pull`를 이용하여 업데이트 된 내용 받기
