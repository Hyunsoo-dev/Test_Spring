# Test_Spring

* Spring framework 를 이용하여 게시판을 만듭니다. 

### Day_01 
  * [01](https://github.com/Hyunsoo-dev/Test_Spring/tree/master/BoardWeb)
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
  * [02](https://github.com/Hyunsoo-dev/Test_Spring/tree/master/BoardWeb2)
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
