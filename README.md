# Test_Spring

* Spring framework 를 이용하여 게시판을 만듭니다. 

### Day_01 
  * [BoardWeb1](https://github.com/Hyunsoo-dev/Test_Spring/tree/master/BoardWeb)
  * 스프링 컨테이너 설정 및 구동
  * 의존성 주입
    * 생성자 인젝션, setter 인젝션, Collection 객체 설정
  * 어노테이션 기반 설정
    * Component
      * Controller
      * Service
      * Repository
    * Autowired
    * Qualifier
    * Resource
    * inject 
  * 비즈니스 컴포넌트 작성

---
### Day_02
  * [BoardWeb2](https://github.com/Hyunsoo-dev/Test_Spring/tree/master/BoardWeb2)
  * 스프링 AOP
  * AOP 용어 
    * JoinPoint
    * Pointcut 
    * Advice
    * Aspect or Advisor 
  
  * AOP 엘리먼트
    * <aop:config>
    * <aop:pointcut>
    * <aop:aspect>
    * <aop:advisor>
   
  * Advice 동작 시점
    * Before
    * After
    * After Throwing
    * After Returning
    * Around
   
  * JoinPoint 
  * 바인드 변수
  
  * 어노테이션 기반 AOP
    * xml ->  <aop:aspectj-autoproxy>
    * 어노테이션 기반 AOP 설정
    * 어드바이스 동작 시점 
    * 외부 Pointcut 참조
 
 * 스프링 JDBC 
   * JDBC 를 사용하기 위해 dbcp 설정 추가
   * DataSource 설정 
   * DAO 클래스에서 JdbcTemplate 객체 얻기 
     * JdbcDaoSupport 상속 
     * JdbcTemplate 클래스 <bean> 등록, 의존성 주입
 
 ---
 ### Day_03
  * [BoardWeb03](https://github.com/Hyunsoo-dev/Test_Spring/tree/master/BoardWeb3)
  * 트랜잭션 처리
  * 트랜잭션 네임스페이스 등록 
  * 트랜잭션 관리자 등록 
  * 트랜잭션 어드바이스 설정 
  * AOP 설정을 통한 트랜잭션 적용 



---
### Day_04
  * [BoardWeb04](https://github.com/Hyunsoo-dev/Test_Spring/tree/master/BoardWeb4)
  * Model 1 방식 게시판 구현 
  
  * [BoardWeb05](https://github.com/Hyunsoo-dev/Test_Spring/tree/master/BoardWeb5)
  * Model 2 방식 게시판 구현 
  * DispatcherServlet 구현
  * HandlerMapping 구현
  * Controller 구현
  * viewResolver 구현
  * JSTL, EL 을 이용해 view 페이지에 자바 코드 제거
  
  
  ---
  ### Day_05
  
   * [BoardWeb06](https://github.com/Hyunsoo-dev/Test_Spring/commits/master/BoardWeb6)
   * 스프링 프레임워크가 지원해주는 DispatcherServlet 설정 및 인코딩 설정
   * 스프링 설정 파일에 Controller , HandlerMapping, ViewResolver 구현
    
   * [BoardWeb07](https://github.com/Hyunsoo-dev/Test_Spring/commits/master/BoardWeb7) 
   * @Controller 와 @RequestMapping을 이용하여 Controller 구현 
   * 어노테이션으로 게시판 구현하기
    
   * [BoardWeb08](https://github.com/Hyunsoo-dev/Test_Spring/tree/master/BoardWeb8)
   * 프레젠테이션 레이어와 비즈니스 레이어 통합하기



---
 ### Day_06
  
  * [BoardWeb09](https://github.com/Hyunsoo-dev/Test_Spring/tree/master/BoardWeb9)
  * 다국어 처리
  * JSON, XML 로 데이터 변환 
