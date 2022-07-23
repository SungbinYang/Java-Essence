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

### SimpleDateFormat
Date와 Calendar 클래스만 가지고 날짜 데이터를 원하는 형태로 다양하게 출력하는 것은 불편하고 복잡하다. 이 점을 고려하여 SimpleDateFormat 클래스가 출범하게 되었다.

> 💡 참고
DateFormat은 추상클래스로 SimpleDateFormat 클래스의 상위 클래스이다. DateFormat는 추상클래스이므로 직접 인스턴스를 생성할 수 없고 getDateInstance() 메서드를 통하여 인스턴스를 반환해야한다. 반환된 인스턴스는 SimpleDateFormat 인스턴스이다.

|기호|의미|
|------|---|
|G|연대 (BC, AD)|
|y|년도|
|M|월 (1~12 또는 1월~12월)|
|w|년의 몇 번째 주(1~53)|
|W|월의 몇 번째 주(1~5)|
|D|년의 몇 번째 일 (1~366)|
|d|월의 몇 번째 일 (1~31)|
|F|월의 몇 번째 요일(1~5)|
|E|요일|
|a|오전/오후(AM,PM)|
|H|시간(0~23)|
|k|시간(1~24)|
|K|시간(0~11)|
|h|시간(1~12)|
|m|분(0~59)|
|s|초(0~59)|
|S|천분의 일초(0~999)|
|z|Time zone(General time zone)|
|Z|Time zone(RFC 822 time zone)|
|'|escape문자(특수문자를 표현하는데 사용)|

SimpleDateFormat을 사용하는 방법은 간단하다. 먼저 원하는 출력형식의 패턴을 작성하여 SimpleDateFormat 인스턴스를 생성 후, 출력하고자 하는 Date 인스턴스를 가지고 format(Date d)를 호출하면 지정한 출력형식에 맞게 변환된 문자열을 얻게 된다.

또한 parse(String source)를 사용하여 날짜 데이터를 출력형식을 변환하는 방법이 있다.

> 💡 참고
parse(String source)는 SimpleDateFormat의 상위 클래스인 DateFormat에 정의되어 있다.
지정된 형식과 입력된 형식이 일치하지 않는 경우에는 예외가 발생함으로 적절히 예외처리가 필요하다.

### ChoiceFormat
ChoiceFormat은 특정 범위에 속하는 값을 문자열로 변환해준다.

ChoiceFormat 클래스는 파라미터로 limit와 변환할 문자열 배열이 들어가는데 limit은 double형 배열형으로 모두 오름차순으로 정렬되어야 하고 변환할 문자열 배열은 limit 배열의 개수와 일치해야한다. 그렇지 않으면 IllegalArgumentException이 발생한다.

또한 pattern형으로 정의도 가능한데 패턴 구분자로 '#'과 '<'가 있는데 #은 경계값을 포함시키고 <은 경계값을 포함시키지 않는다.

### MessageFormat
MessageFormat은 데이터를 정해진 양식에 맞게 출력할 수 있도록 도와준다.
데이터가 들어갈 자리를 마련해 놓은 양식을 미리 작성하고 프로그램을 이용해서 다수의 데이터를 같은 양식으로 출력할 때 사용하면 좋다.

MessageFormat에 사용할 양식인 문자열 msg를 작성할 때, '{숫자}'로 표신된 부분이 데이터가 출력할 자리이며 인덱스는 0부터 시작하고 여러번 반복해서 사용할 수 있다.

또한 객체배열 형태로 받기 때문에 String뿐만 아니라 다른 객체를 지정할 수 있으며 세부 옵션들을 이용하여 다양하게 출력이 가능하다.

> ⚠️ 주의
홑 따옴표(')는 MessageFormat의 양식에 escape문자로 사용되기 때문에 문자열 msg에서 홑 따옴표를 사용하려면 연속 2번 작성해야한다.

또한 parse(String source)를 이용해서 출력된 데이터로부터 필요한 데이터만 뽑아낼 수 있다.

## java.time 패키지
Date와 Calendar 클래스의 단점들을 해소하기 위해 JDK1.8부터 java.time 패키지가 추가되었다.

|패키지|설명|
|------|---|
|java.time|날짜와 시간을 다루는데 필요한 핵심 클래스들을 제공|
|java.time.chrono|표준(ISO)이 아닌 달력 시스템을 위한 클래스들을 제공|
|java.time.format|날짜와 시간을 파싱하고, 형식화하기 위한 클래스들을 제공|
|java.time.temporal|날짜와 시간의 필드와 단위를 위한 클래스들을 제공|
|java.time.zone|시간대와 관련된 클래스들을 제공|

위의 패키지들에 속한 클래스들의 가장 큰 특징은 String 클래스처럼 불변이라는 것이다. 그래서 날짜와 시간을 변경하는 메서드들은 기존의 객체를 변경하는 것이 아니라 변경된 새로운 객체를 반환한다. 그런데 이 점에서 의문점이 들 수 있다. 새로운 객체를 반환하면 메모리 낭비가 심하지 않을까라는 생각을 할 수 있는데 기존의 객체를 변경하면 멀티쓰레드 환경이 안전하지 못한다는 점에서 이점이 있다.
멀티쓰레드 환경에서는 동시에 여러 쓰레드가 같은 객체에 접근할 수 있기 때문에 변경 가능한 객체는 데이터가 잘못될 가능성이 있으며, 이를 쓰레드에 안전하지 않다고 한다.

### java.time 패키지의 핵심 클래스
날짜와 시간을 하나로 표현하는 Calendar 클래스와 달리 java.time 패키지에서는 날짜와 시간을 별도의 클래스로 분리해 놓았다. 시간을 표현할 때는 LocalTime 클래스를 사용하고 날짜를 표현할 때는 LocalDate 클래스를 사용하며, 둘 다 사용할 때는 LocalDateTime 클래스를 사용한다. 여기에 시간대까지 다뤄야 한다면 ZonedDateTime 클래스를 사용하면 된다.

ZonedDateTime 클래스는 우리가 이전에 배운 Calendar 클래스와 유사하며 Date와 유사한 클래스로는 Instant 클래스가 있는데 이 클래스는 날짜와 시간을 초로 표현한다. 주로 이 클래스는 DB와 연동할 때 많이 사용된다.

#### Period와 Duration
날짜와 시간의 간격을 표현하기 위한 클래스도 있는데, Period 클래스는 두 날짜간의 차이를 표현하기 위한 것이고, Duration은 시간의 차이를 표현하기 위한 것이다.

#### 객체 생성하기 - now(), of()
java.time 패키지에 속한 클래스의 객체를 생성하는 가장 기본적인 방법은 now()와 of()를 사용하는 것이다.
* now()는 현재 날짜와 시간을 저장하는 객체를 생성한다.

  ``` java
  LocalDateTime date = LocalDateTime.now();
  ```
* of()는 단순히 해당 필드의 값을 순서대로 지정해주기만 하면 된다.

  ``` java
  LocalDateTime date = LocalDateTime.of(2015, 11, 23, 23, 59, 59);
  ```

#### Temporal과 TemporalAmount
LocalDate, LocalTime, LocalDateTime, ZonedDateTime등 날짜와 시간을 표현하기 위한 클래스들은 모두 Temporal, TemporalAccessor, TemporalAdjuster 인터페이스를 구현했고, Duration과 Period는 TemporalAmount 인터페이스를 구현하였다.

> Temporal, TemporalAccessor, TemporalAdjuster를 구현한 클래스
- LcoalDate, LocalTime, LocalDateTime, ZonedDateTime, instant등
TemporalAmount를 구현한 클래스
- Period, Duration

#### TemporalUnit과 TemporalField
날짜와 시간의 단위를 정의해 놓은 것이 TemporalUnit 인터페이스이고 이 인터페이스를 구현한 것이 enum형인 ChronoUnit이다. 그리고 TemporalField는 년, 월, 일등 날짜와 시간의 필드를 정의해 놓은 것으로, enum형인 ChronoField가 이 인터페이스를 구현하였다.

날짜와 시간에서 특정 필드 값을 얻을 때는 get() 메서드를 사용하면 되고, 특정 날짜나 시간을 더하거나 뺄때는 plus(), minus()를 사용하면 된다.

``` java
LocalDate tomorrow = LocalDate.now().plus(1, ChronoUnit.DAYS);
LocalDate tomorrow = LocalDate.now().plusDays(1);
```

또한 TemporalField나 TemporalUnit을 사용할 수 있는 지 확인 하는 메서드는 isSupported()를 사용하면 된다.

### LocalDate와 LocalTime
LocalDate와 LocalTime은 java.time 패키지의 가장 기본이 되는 클래스이고 나머지 클래스들은 이들의 확장이다.
객체를 생성하는 방법은 현재 날짜와 시간을 LocalDate와 LocalTime으로 반환하는 now() 메서드와 지정된 날짜와 시간으로 LocalDate와 LocalTime 객체를 생성하는 of() 메서드가 있으며 둘다 static 메서드다.

LocalDate와 LocalTime 클래스들은 일단위나 초단위로도 지정이 가능하다.

``` java
LocalDate birthDate = LocalDate.ofYearDay(1999, 365); // 1999년 12월 31일
LcoalTime birthTime = LocalTime.ofSecondDay(86399); // 23시 59분 59초
```

또는 parse() 메서드를 통하여 문자열을 날짜와 시간으로 변환이 가능하다.

``` java
LocalDate birthDate = LocalDate.parse("1999-12-31");
LocalTime birthTime = LocalTime.parse("23:59:59");
```

#### 특정 필드의 값 가져오기 - get(), getXXX()

|클래스|메서드|설명|
|------|---|---|
|LocalDate|int getYear()|년도(2022)|
|LocalDate|int getMonthValue()|월(12)|
|LocalDate|Month getMonth()|월(DECEMBER)|
|LocalDate|int getDayOfMonth()|일(31)|
|LocalDate|int getDayOfYear()|같은 해의 1월 1일부터 몇번째 일|
|LocalDate|DayOfWeek getDayOfWeek()|요일(SUNDAY)|
|LocalDate|int lengthOfMonth()|같은 달의 총 일수(31)|
|LocalDate|int lengthOfYear()|같은 해의 총 일수(365), 윤년이면 366|
|LocalDate|boolean isLeapYear()|윤년여부 확인|
|LocalTime|int getHour()|시|
|LocalTime|int getMinute()|분|
|LocalTime|int getSecond()|초|
|LocalTime|int getNano()|나노초|

위의 표의 메서들의 매개변수로 사용할 수 있는 목록은 아래와 같다.

|TemporalField(ChronoField)|성명|
|------|---|
|ERA|시대|
|YEAR_OF_ERA, YEAR|년|
|MONTH_OF_YEAR|월|
|DAY_OF_WEEK|요일|
|DAY_OF_MONTH|일|
|AMPM_OF_DAY|오전/오후|
|HOUR_OF_DAY|시간(0~23)|
|CLOCK_HOUR_OF_DAY|시간(1~24)|
|HOUR_OF_AMPM|시간(0~11)|
|CLOCK_HOUR_OF_AMPM|시간(1~12)|
|MINUTE_OF_HOUR|분|
|SECOND_OF_MINUTE|초|
|MILLI_OF_SECOND|천분의 일초|
|MICRO_OF_SECOND|백만분의 일초|
|NANO_OF_SECOND|10억분의 일초|
|DAY_OF_YEAR|그 해의 몇번째 날|
|EPOCH_DAY|EPOCH(1970.1.1)부터 몇번째 날|
|MINUTE_OF_DAY|그 날의 몇번째 분 (시간을 분으로 확산)|
|SECOND_OF_DAY|그 날의 몇번째 초 (시간을 초로 환산)|
|MILLI_OF_DAY|그 날의 몇번째 밀리초|
|MICRO_OF_DAY|그 날의 몇번째 마이크로초|
|NANO_OF_DAY|그 날의 몇번째 나노초|
|ALIGNED_WEEK_OF_MONTH|그 달의 n번째 주|
|ALIGNED_WEEK_OF_YEAR|그 해의 n번째 주|
|ALIGNED_DAY_OF_WEEK_IN_MONTH|요일 (그 달의 1일을 월요일로 간주하여 계산)|
|ALIGNED_DAY_OF_WEEK_IN_YEAR|요일 (그 해의 1월 2일을 월요일로 간주하여 계산)|
|INSTANT_SECONDS|년월일을 초단위로 환산 Instant에만 사용|
|OFFSET_SECONDS|UTC와의 시차. ZoneOffset에만 사용가능|
|PROLEPTIC_MONTH|년월을 월단위로 환산|

이 목록은 ChronoField에 정의된 모든 상수를 표현한것이고 클래스마다 사용가능한 상수가 다르다.

> 만일 해당 클래스가 지원하지 않는 필드를 사용하면 UnsupportedTemporalTypeException이 발생한다.

#### 필드 값 변경하기 - with(), plus(), minus()
날짜와 시간에서 특정 필드 값을 변경하려면 with으로 시작하는 메서드를 사용하면 된다. with으로 시작하는 메서드는 다음과 같다.

``` java
LocalDate withYear(int year);
LocalDate withMonth(int month);
LocalDate withDayOfMonth(int dayOfMonth);
LocalDate withDayOfYear(int dayOfYear);

LocalTime withHour(int hour);
LocalTime withMinute(int minute);
LocalTime withSecond(int second);
LocalTime withNano(int nanoSecond);
```

또한 with() 메서드를 통하여 직접 필드를 지정이 가능하다. 여기서 주의할 점은 필드를 변경하는 메서드들은 항상 새로운 객체를 생성해서 반환하므로 대입 연산자를 같이 사용해야한다.

이 외에도 특정 필드에 값을 더하거나 빼는 plus()와 minus()가 있다.

그리고 LocalTime의 truncatedTo() 메서드는 지정된 것보다 작은 단위의 필드를 0으로 만든다.

그런데 LocalTime과 달리 LocalDate에는 truncatedTo()가 없는데, 그 이유는 LocalDate의 필드인 년, 월, 일은 0이 될 수 없기 때문이다. 그리고 이 메서드의 매개변수로 아래의 표중에 시간과 관련된 필드만 사용가능하다.

|TemporalUnit(ChronoUnit)|설명|
|------|---|
|FOREVER|Long.MAX_VALUE초(약 3천억년)|
|ERAS|1,000,000,000년|
|MILLENNIA|1,000년|
|CENTURIES|100년|
|DECADES|10년|
|YEARS|년|
|MONTHS|월|
|WEEKS|주|
|DAYS|일|
|HALF_DAYS|반나절|
|HOURS|시|
|MINUTES|분|
|SECONDS|초|
|MILLIS|천분의 일초|
|MICROS|백만분의 일초|
|NANOS|10억분의 일초|

#### 날짜와 시간의 비교 - isAfter(), isBefore(), isEqual()

LocalDate와 LocalTime 클래스도 compareTo()가 적절히 오버라이딩되어 있어서 쉽게 비교가 가능하지만 더 편라힌 메서드들도 추가되었다.

``` java
boolean isAfter(ChronoLocalDate other)
boolean isBefore(ChronoLocalDate other)
boolean isEqual(ChronoLocalDate other)
```

물론 LocalDate와 LocalTime에는 equal() 메서드가 있지만 isEqual()을 제공하는 이유는 연표가 다른 두 날짜를 비교하기 위해서이다. 모든 필드를 일치하는지 알고 싶을때는 equal() 메서드를 사용하고 오직 날짜만 비교하고 싶을 때는 isEqual() 메서드를 사용한다.

### Instant
Instant 클래스는 에포크 타임부터 경과된 시간을 나노초 단위로 표현한다.

Instant를 생성할 때는 now()와 ofEpochSecond()를 사용한다.

``` java
long epochSec = Instant.now().getEpochSecond();
int nano = Instant.now().getNano();
```

Instant는 항상 UTC를 기준으로 하기 때문에 LocalTime과 차이가 있을 수 있다. 시간대를 고려할 때는 OffsetDateTime을 사용하는 것이 좋은 선택이다.

#### Instant와 Date간의 변환
Instant는 기존의 java.util.Date를 대체하기 위한것으로 JDK1.8부터 Date에 Instant로 변환할 수 있는 새로운 메서드가 추가되었다.

``` java
static Date from(Instant instant) // Instant -> Date
Instant toInstant() // Date -> Instant
```