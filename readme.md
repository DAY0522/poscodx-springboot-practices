## 06. Spring Boot

전산에서 부트(Boot 또는 Booting)라는 용어는 컴퓨터(OS)가 전원이 켜지는 순간부터 사용자로 부터 명령을 받을 준비가 될 때까지 걷치는 일련의 과정을 일켣는다.
이 용어는 원래 가죽 신발에 발뒷꿈치를 넣기 쉽도록 하기위해 달려있는 부트스트랩(Bootstrap)에서 유래되었는데 "어떤 일을 시작하기 위해 필요한 모든 준비를 마친다" 는 의미로 사용된다.
스프링 부트(Spring Boot)의 부트의 의미도 이와 크게 다르지 않다. 스프링 부트는 스프링 애플리케이션이 시작되기 위한 모든 준비를 자동으로 마쳐주는 라이브러리 또는 도구(Tool)이다.

스프링 애플리케이션 뿐만 아니라 대부분의 애플리케이션이 실행(시작)되기 위해 필요한 것은 다음의 두 가지인 것 같다.

1. 애플리케이션 기능(비즈니스) 구현 코드
2. 애플리케이션 설정

자바 엔터프라이즈 개발에서는 스프링뿐만 아니라 많은 강력한 자바 라이브러리 또는 도구들이 존재한다. 하지만 현재까지는 이것들이 다양하고 복잡한 엔터프라이즈의 비즈니스 구현 코드를 자동으로 생성하거나 작성해 내지는 못한다.
하지만, 애플리케이션 설정은 자동으로 할 수 있다. 그 이유는 그 설정들이 복잡하기는 하지만 유사하고 반복적이며 상투적이기 때문이다. 스프링 자바 엔터프라이즈 개발에서는 POJO로 EJB 기능을 구현하기 때문에 작성 코드는 전반적으로 가볍다.
이에 반해 개발 과정과 애플리케이션 구성(설정)은 무겁고 복잡하다. 이를 극복하려는 노력은 꾸준히 되어 왔고 스프링 부트는 이 문제를 해결했다. 스프링 부트는 개발자가 직접 하던 스프링의 복잡하고 반복적인 설정을 관례에 따르는 "자동설정(Automatic Configuration)" 으로 제거했다.

한편, 스프링 개발뿐만 아니라 자바 엔터프라이즈 개발에서 자주 제기되고 있는 문제점은 프로젝트 또는 라이브러리들 간의 의존성 문제다. 이 문제는 여간 성가신게 아니다. 의존성 버전을 잘못 선택해서 빌드가 깨지거나 실행 중에 예외가 발생하는 것은 스프링 프로젝트에서는 흔한 일이라 세삼스러울 것도 없다.
개발자가 직접 의존성 이름과 버전을 명시함으로써 발생했던 이 문제를 스프링 부트는 "스타터 의존성(Stater Dependency)" 이라 불리는 것으로 스프링 부트가 직접 관리하고 개발자는 스타터 의존성만 명시만 하는 방식으로 깔끔히 해결했다.

앞의 내용을 정리 요약하면, 스프링 부트의 핵심 기술은 다음 두 가지다.

1.	스타터 의존성(Stater Dependency)
2.	자동설정(Automatic Configuration)

그런데, 모든 것이 자동으로 설정된다고 편리하고 좋은 것만은 아니다. 직접 Java 또는 XML로 설정 작업을 하던 전통적인 스프링은 의도한대로 그리고 설정한대로 작동하기 때문에 설정 작업이 복잡하고 귀챦기는 하지만 내부에서 어떤 일이 일어나는 지 알 수 있고 문제 대응도 쉽다.
스프링 부트의 자동설정은 처음에는 편리하게 느껴질지 모르겠지만 스프링 부트를 잘 이해하지 못하면 전통적인 스프링보다 더 어렵고 문제 대응도 어렵다. 스프링 부트를 잘 사용하려면 스프링 뿐만 아니라 스프링 부트 내부에서 일어나는 일들을 먼저 이해하고 있어야 한다.
또! 반드시 오해하지 말아야 할 것이 있다. 스프링 부트가 모든 설정을 알아서 다 해주는 만능의 설정도구가 아니라는 것이다.

1. 자동설정을 통해 장황하고 반복적인 설정을 간소화한 도구이지 모든 설정을 없앤 도구가 아니다. 복잡하고 무거운 스프링 설정은 그대로 존재한다.
2. 자동설정을 오버라이드 하거나 정밀하게 조정하는 "미세설정" 작업이 대부분의 개발에서 필요하다.
3. 자동설정과 미세설정으로 스프링의 모든 설정을 다 할 수 없다. 경우에 따라 전통적인 설정 방식이 필요한 경우도 많다.

### 00. Spring Initializr [springboot-helloworld]
### 01. Bootstrapping & Configuration Class [springboot-example]
### 02. @SpringBootApplication & @SpringBootTest [springboot-myapplication]
### 03. Spring Boot Web Application(Spring MVC) [springboot-webmvc]
# poscodx-springboot-practices
