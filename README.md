# 시작하기

## Base Project 다운로드 및 실행
먼저, 새로운 브라우저 탭을 열고, base project 를 gitpod 로 접속합니다
https://gitpod.io/#https://github.com/msa-school/ddd-petstore-level6-layered-spring-jpa

GidPod 내에 터미널을 열고(왼쪽 상단의 햄버거 버튼 > Terminal > New Terminal), 프로젝트가 잘 컴파일 되는지 확인합니다:
```
mvn spring-boot:run
```

## 미션: Store 업무 영역의 추가
- 진열대에 Item 들이 진열됨
- 고객이 Item 의 세부 사항을 검색함
- 검색한 Item 을 Cart에 하나 이상 담음
- Cart Item 들을 구매함
- 구매방식은 신용카드와 현금 입금이 있음
- 구매상태는 지불대기, 지불완료, 실패가 있음

## 사용예

> http 도구설치: pip install httpie


```
# 회원등록
http localhost:8080/customers id="park@naver.com" address[zipcode]="123" address[detail]="용인"

# 카트에 뽀삐담기
http :8080/cartItems customer="http://localhost:8083/customers/park@naver.com" 
items[]="http://localhost:8080/pets/1"

# 카트에 담긴 뽀삐확인
http "http://localhost:8080/cartItems/2/items"
```

## 문제
- Pet 전문가와 쇼핑몰 프로세스 전문가 영역의 충돌
- Core Domain과 Supporting Domain 의 간섭, 장애전파, 복잡성의 범람
- Ubiquitous Language 의 손상 (Store Domain: Item 을 Item 이라 부르지 못하고 Pet 을 사용)

## 다음: 도메인 영역의 분리와 연동
- Pet <-> Store 도메인의 분리 (Bounded Context)
- 도메인간 연동 (Context Mapping, Anti-corruption)
- https://github.com/event-storming/ddd-petstore
