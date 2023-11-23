# 티켓 시스템 구현 Learning-Case
- 선착순으로 티켓을 배부하는 시스템 구현
  - 이에 따른 동시성 처리 및 Redis 처리현
  - 동시성처리를 위한 대기열 처리
- 일정 시간 시 추천 시스템 구현
  - 여러 회원 요소로 인한 가산점에 기반한 추천 시스템 기 

## 예상 Model
- Member
- Ticket
- Ticket Mapping Model

## 기능구현 사항
- 우선적으로 동시성 처리하지 않고 티켓팅 처리하기
- **티켓팅 처리**
  - 한 회원은 여러 티켓을 구매할 수 있다.
  - 여러 회원이 동시에 티켓을 구매할 수 있다.
  - 재고에 대한 Runtime 처리를 해줘야한다.
- **대기열 처리**
  - 티켓 구매에 대한 처리를 위한 대기열 처리를 실행