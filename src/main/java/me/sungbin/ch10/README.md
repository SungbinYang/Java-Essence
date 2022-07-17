> 참고
[자바의 정석](http://www.yes24.com/Product/Search?domain=ALL&query=%EC%9E%90%EB%B0%94%EC%9D%98%EC%A0%95%EC%84%9D&pid=123487&cosemkid=go16214999081121496&gclid=Cj0KCQjwmuiTBhDoARIsAPiv6L9xwP5-CSNKhbr9xyqRtRORbKj8Eo29uQrx6hkOyS5ruqrFnfFy_h8aAplzEALw_wcB)

## 날짜와 시간

### Calendar와 Date
Date는 날짜와 시간을 다루기 위해서 JDK1.0부터 제공되어온 클래스이다. 하지만 Date만으로 기능이 너무 부족하여 Calendar 클래스를 만들어 JDK1.1부터 제공해왔다. 하지만 이때까지 Date와 Calendar는 너무 기능이 부족했고 몇 가지 단점이 존재하여 JDK1.8부터 java.time 패키지에 단점을 개선하여 추가하였다.

#### Calendar와 GregorianCalendar
Calendar 클래스는 추상클래스이므로 직접 객체를 생성할 수 없는 구조이며 싱글톤 패턴과 비슷하게 메서드를 통해 인스턴스를 받아야한다.

``` java
Calendar cal = new Calendar(); // ERROR
Calendar cak = Calendar.getInstance();
```

Calendar를 상속받아 구현한 클래스로는 GregorianCalendar와 BuddhistCalendar가 있는데 getInstance()는 시스템의 국가와 지역설정을 확인해서 태국의 경우 BuddhistCalendar를 반환하고 그외에는 GregorianCalendar의 인스턴스를 반환한다.

현재, 태국을 제외하고 전 세계가 GregorianCalendar를 사용하고 있으니 GregorianCalendar를 사용하면 좋다.

그러면 왜 인스턴스를 직접 생성하지 않고 메서드를 통해 인스턴스를 받는 이유는 최소한의 변경으로 프로그램이 동작하기 위함이다.

#### Date와 Calendar간의 변환
Calendar 클래스가 생기고 나서 Date의 대부분 메서드는 'deprecated'되었다. 그럼에도 여전히 Date 클래스가 남아 있는 이유는 Calendar 클래스를 Date 클래스로 혹은 그 반대로 변환하려는 이유 때문이다. 변환하는 방법은 아래와 같다.

> 1. Calendar를 Date로 변환
``` java
Calendar cal = Calendar.getInstance();
Date d = new Date(cal.getTimeMillis());
```
2. Date를 Calendar로 변환
``` java
Date d = new Date();
Calendar cal = Calendar.getInstance();
cal.setTime(d);
```

getInstance()를 통해 얻은 인스턴스는 현재 시스템의 날짜와 시간에 대한 정보를 담고 있다. 만약 원하는 시간으로 변경을 하고 싶으면 set 메서드를 사용하면 된다.

> 💡 참고
Calendar 클래스에 clear() 메서드가 있는데 이 메서드는 모든 필드의 값을, clar(int field) 메서드는 지정된 필드의 값을 기본값으로 초기화 한다. 기본값은 JAVA API 문서를 확인해보자.

> ⚠️ 주의
두 날짜 간의 차이를 구할려면 getTimeMillis() 메서드를 사용하는데 이 메서드의 반환 값은 1/1000초 단위로 반환하기 때문에 초단위로 얻을려면 그 값에 1000으로 나눠야 한다.

> 💡 참고
시간상 전후만 알고 싶을 때는 두 날짜간의 차이가 음수인지 양수인지 확인을 한다던지, 아니면 after() 메서드, before() 메서드를 사용하면 좋다.

add(int field, int amount) 메서드를 사용하면 지정한 필드의 값을 원하는 만큼 증가 또는 감소시킬 수 있기 때문에 add 메서드를 이용하면 특정 날짜나 시간을 기점으로 일정 시간의 전 후의 날짜와 시간을 알 수 있다.

roll(int field, int amount) 메서드도 add 메서드와 비슷한 기능이지만 차이점은 다른 필드에 영향을 끼치지 않는다는 점이다. 예를 들어 날짜필드를 31증가 시켰다하면 add같은 경우는 월필드가 자동 증가가 되지만 roll 메서드는 날짜 필드만 증가가 되고 나머지는 증가가 되지 않는다. 만약 말일일 경우 roll 메서드로 월 필드를 변경하면 일 필드도 변경이 될 수도 있다.

### DecimalFormat
형식화 클래스중에서 숫자를 형식화하는데 사용되는 것이 DecimalFormat이다. DecimalFormat을 이용하면 숫자 데이터를 정수, 부종소수점, 금액등 다양한 형식으로 표현이 가능하며 반대의 역할도 할 수 있다.

![](https://velog.velcdn.com/images/roberts/post/79badbed-fae6-4f1b-9d59-2ad1d2a61944/image.png)

DecimalFormat을 사용하는 방법은 인스턴스를 생성한 다음에 참조변수를 통하여 format 메서드를 호출하면 패턴에 맞는 문자열을 얻게 된다. 패턴은 생성자 파라미터로 넣는다.

또한 parse 메서드를 통하여 기호와 문자가 포함된 문자열을 쉽게 숫자로 변환이 가능하다.