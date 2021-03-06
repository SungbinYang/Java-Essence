## 연산자
연산자란, 연산을 수행하는 기호를 말한다. 프로그래밍 언어도 수학과 같이 사칙연산들을 제공을 한다.

### 연산자와 피연산자
- 연산자가 연산을 할려면 반드시 연산을 할려는 대상이 필요하다. 그 대상을 피연산자고 부른다.

> 연산자: 연산을 수행하는 기호 (+,-,*,/등)
피연산자: 연산자의 작업 대상 (변수, 상수, 리터럴, 상수)
ex. x+3이라는 수식에 +는 연산자이고, x와 3은 피연산자이다.

- 기본적으로 연산을 할려면 기본적으로 2개의 피연산자가 필요하지만,
  연산자의 종류에 따라 피연산자가 1개 혹은 3개가 필요할 수 있다.
- 연산자는 피연산자로 연산을 수행하고나면, 반드시 반환값을 리턴한다.

### 식과 대입 연산자
- 연산자와 피연산자를 조합하여 계산하고자 하는 바를 표현하는 것을 식이라고 한다.
- 그리고 식을 계산하고 결과 값을 얻은 것을 식의 평가라고 한다.
- 식을 사용하고나서 반드시 끝이 ;를 붙여줘야 하며, 그 결과 값을 저장하여
  다른데 사용할려고 하면 반드시 변수에 저장을 해줘야 한다. 그래야 비로소 의미가 있는 코드가 된다.

### 연산자의 종류

|종류|연산자|설명|
|------|---|---|
|산술 연산자|+ - * / % << >>|사칙 연산 (+, -, * , /)과 나머지 연산(%)|
|비교 연산자|> < >= <= == !=|크고 작음과 같음과 다름을 비교|
|논리 연산자|&& \|\| ! \| & ^ ~ |'그리고(AND)'와 '또는(OR)'으로 조건을 연결|
|대입 연산자|=|우변의 값을 좌변에 저장|
|기타|(type) ?: instanceof|형변환 연산자, 삼항 연산자, instanceof 연산자|

> (type)은 '형변환 연산자'를 의미한다.

#### 피연산자의 개수에 의한 분류
- 피연산자의 개수에 따라 연산자를 분류하는데 피연산자가 1개이면 단항연산자, 2개면 이항연산자, 3개면 삼항연산자라고 부른다.
- 대부분 연산자는 이항연산자가 많고 삼항연산자는 '?:' 오직 1개이다.
- 이렇게 연산자를 기능별 피연산자 개수별로 분류하는 것이 나중에 연산자의 우선순위때문에 학습을 하는것인데, 수학의 연산자 우선순위를 알면 배우기 쉬울것 같다.

### 연산자의 우선순위와 결합 규칙
- 식에 사용된 연산자가 2개 이상인 경우 연산자 우선순위에 의해서 연산순서가 결정된다.
- 수학시간에 배웠듯이 +,-보다는 * 와 /가 연산순위가 높다. 자세한건 아래의 표에서 살펴보면 이해가 가능할 것이다.

|식|설명|
|------|---|
|-x + 3|단항 연산자가 이항연산자보다 우선순위가 높다. <br />여기서 단항연산자는 -이고 +가 이항연산자이다.|
|x + 3 * y|곱셈과 나눗셈이 덧셈과 뺄셈보다 우선순위가 높다.|
|x + 3 > y - 2|비교연산자 (>)보다 산술연산자 '+', '-'가 먼저 수행한다.|
|x > 3 && x < 5|논리 연산자 '&&'보다 비교 연산자가 먼저 수행된다.|
|result = x + y * 3|대입 연산자는 연산자 중에서 제일 우선순위가 낮다.|

> 위의 표를 보면 우리가 학창시절 수학시간에 배웠던걸로 생각을 하면
쉽게 생각을 할 수 있을 것이다.

|식|설명|
|------|---|
|x << 2 + 1|쉬프트 연산자 (<<)는 덧셈 연산자보다 우선순위가 낮다.|
|data & 0xFF == 0|비트 연산자 (&)는 비교 연산자 (==)보다 우선순위가 <br /> 낮으므로 비교연산 후에 비트연산이 수행된다.|
|x < -1 \|\| x > 3 && x < 5|논리 연산자 중에 AND를 의미하는 &, &&가 OR를 의미하는 \|, \|\| <br />보다 우선순위가 높다.|

> 위의 표를 보면 수학시간에 배웠던걸로는 이해하기가 쉽지 않다. 하지만 위의 표를 잘 상기시키면 우선순위에 대한 문제는 해결될 것이다. 만약 아직도 헷갈린다면 먼저 계산되어야 하는 부분을 괄호로 처리해서 묶어주면 된다.

> ⚠️ 참고
괄호는 연산자가 아니다. 연산자의 우선순위를 임의로 지정할 때, 사용하는
기호일뿐이다.

#### 연산자의 결합 규칙
하나의 식에 연산자가 여러개 있는 경우 어떤 순서로 처리를 해야할까?
우선순위가 같다고 무작정 처리하는 것이 아니고, 나름의 규칙이 있는데
그것이 연산자의 결합 규칙이다.

- 연산자의 결합 규칙은 연산자마다 다르지만, 대부분 왼쪽에서 오른쪽에서 수행하며 단항 연산자와 대입 연산자만 그 반대로 수행한다.

> 💡 요점 정리
1. 산술 > 비교 > 논리 > 대입. 대입은 제일 마지막에 수행된다.
2. 단한 > 이항 > 삼항. 단항 연산자의 우선순위가 이항 연산자보다 높다.
3. 단항 연산자와 대입 연산자를 제외한 모든 연산자의 진행방향은 왼쪽에서 오른쪽이다.

![](https://velog.velcdn.com/images/roberts/post/02b502e8-cf0b-4f89-9636-6d030d0f32f4/image.jpeg)

### 산술 변환
- 이항 연산자의 경우 두 피연산자의 타입이 일치해야 연산이 가능해야한데, 타입이 다르면 둘 중 하나의 타입으로 일치시켜줘야 한다.
- 그런데 보통 두 피연산자의 타입 중에서 더 큰 타입으로 일치시키는데, 그 이유는 작은 타입으로 형변환하면 원래의 값이 손실될 가능성이 있기 때문이다.
- 작은 타입에서 큰 타입으로 형변환하는 경우 자동적으로 형변환 되므로, 형변환 연산자를 생략할 수 있다. 이 처럼 피연산자 타입의 일치를 위해 자동 형변환되는 것을 산술변환 또는 일반 산술변환이라 하며, 이 변환은 이항 연산에만 일어나는것이 아니라 단항 연산에서도 일어난다.

> 규칙
1. 두 피연산자의 타입을 같게 일치 시킨다. (보다 큰 타입으로 일치)
2. 피연산자의 타입이 int보다 작은 타입이면, int로 모두 형변환한다.

> 모든 연산에서 산술 변환이 일어나지만, 쉬프트 연산자, 증감 연산자는 예외다.

> 정리
산술 변환이란? 연산 수행 직전에 발생하는 피연산자의 자동 형변환
1. 두 피연산자의 타입을 같게 일치 시킨다. (보다 큰 타입으로 일치)
2. 피연산자의 타입이 int보다 작은 타입이면, int로 모두 형변환한다.

## 단항 연산자
### 증감연산자 ++ --
- 증감 연산자는 피연산자에 저장된 값을 1 증가 또는 감소시킨다.
- 증감 연산자는 피연산자로 정수 또는 실수 둘다 가능하지만, 상수는 값을 변경 못 시키므로 상수는 불가능 하다.
- 대부분 연산자는 피연산자의 값을 읽어서 연산에서 사용할 뿐, 피연산자의 타입이나 값을 변경시키지 않는다. 하지만, 대입 연산자와 증감 연산자만 피연산자의 값을 변경한다.

> 증가연산자 (++) : 피연산자의 값을 1 증가 시킨다.
감소 연산자 (--) : 피연산자의 값을 1 감소 시킨다.

- 일반적으로 단항 연산자는 피연산자의 왼쪽에만 위치하지만, 증감연산자만 유일하게 왼쪽, 오른쪽 둘다 가능하다.
- 왼쪽에만 위치하면 전위형, 오른쪽에 위치하면 후위형이라고 부른다.

|타입|설명|사용 예|
|------|---|---|
|전위형|값이 참조되기 전에 증가시킨다.|j = ++i;|
|후위형|값이 참조된 후에 증가시킨다.|j = i++|

> 증감 연산자는 정말 편히 사용이 가능하며 우리의 연산의 효능을 높여줄 수 있다. 하지만 주의 할점이 식에 두번 이상 포함된 변수에 증감연산자를 사용하는 것은 피해야 한다.

### 부호 연산자
- 부호 연산자 '-'는 피연산의 부호를 반대로 변환 시키고 '+'는 피연산자의 부호를 그대로 유지 시킨다.

## 산술 연산자
산술 연산자에는 사칙 연산자 (+, -, * , /)와 나머지 연산자(%)가 있다.

### 사칙 연산자 + - * /
- 사칙 연산자는 프로그래밍에서 가장 많이 사용하는 연산자이다.
- 곱셈, 나눗셈, 나머지 연산자는 덧셈, 뺌셈 연산자보다 우선순위가 높다.
- 피연산자가 정수일 때, 나누는 수로 0을 사용할 수 없다.
  사용하게 된다면, 실행 시에 에러가 발생한다.

``` java
System.out.println(3/0); // ERROR: ArithemeticException
System.out.println(3/0.0) // Infinity 출력
```

|x|y|x/y|x%y|
|------|---|---|---|
|유한수|±0.0|±Infinity|NaN|
|유한수|±Infinity|±0.0|x|
|±0.0|±0.0|NaN|NaN|
|±Infinity|유한수|±Infinity|NaN|
|±Infinity|±Infinity|NaN|NaN|

> NaN은 'Not a Number'를 줄인 것으로 숫자가 아니라는 것을 의미한다.

> 그리고 사칙연산자를 하면서 주의를 해야할 것이 해당 타입의 범위를 넘어서는지 그것을 주의하자! 연산을 하는 도중에 순서위치에 따라 오버플로우나 값의 손실이 발생하여 값이 예상과 다르게 나올수도 있기때문이다.

- 또한 사칙연산자는 숫자뿐만 아니라 문자로도 가능하다. 왜냐하면 문자형이 실제로 저장될때는 유니코드로 저장되기 때문이다.
- 문자형 타입으로 연산을 할 때는 아래와 같이 주의해야 할 것이 있다.

``` java
char ch = 'a';
ch = ch + 1; // ERROR: 연산결과가 정수형인데 문자형 타입으로 저장하기 때문이다.
ch++; // SUCCESS: 단항연산자로 증가는 가능하다.
char ch2 = 'a' + 1; // 리터럴간 연산은 형변환 없이 가능하다.
```

- 위 처럼 상수 또는 리터럴 간의 연산은 실행과정동안 변하는 값이 아니기 때문에 컴파일 시 컴파일러가 계산해서 그 결과로 대체함으로써 효율적으로 만든다.
- 또한 실수연산을 할때 반올림을 쉽게 하는 방법이 없을까라는 생각이 있을것이다. 바로 아래와 같이 메소드로 처리하면 보다 원활한 개발이 가능할것이다.

``` java
Math.round(3.14) // OUTPUT: 4
```

### 나머지 연산자 %
- 나머지 연산자는 왼쪽의 피연산자를 오른쪽 피연산자로 나누고 난 나머지 값을 결과로 반환하는 연산자
- 주로 짝수 혹은 홀수 판별할 때 많이 사용된다.
- 나머지 연산자는 나누는 수로 음수도 허용된다. 그러나 부호는 무시되므로, 결과는 음수의 절대값으로 나눈 나머지와 결과가 같다.

## 비교 연산자
비교 연산자는 두 피연산자를 비교하는 데 사용되는 연산이다. 주로 조건문이나 반복문의 조건식에 많이 사용된다. 결과 값는 true or false로 반환이 된다. 비교 연산자도 이항 연산자이기 때문에 비교하는 피연산자의 타입이 서로 다를 경우에는 자료형의 범위가 큰 쪽으로 자동 형변환하여 피연산자의 타입을 일치시킨다.

### 대소비교 연산자 < > <= >=

|비교연산자|연산 결과|
|------|---|
|>|좌변의 값이 크면 true 아니면 false|
|<|좌변의 값이 작으면 true 아니면 false|
|>=|좌변의 값이 크거나 같으면 true 아니면 false|
|<=|좌변의 값이 작거나 같으면 true 아니면 false|

### 등가비교 연산자 == !=
- 대소비교 연산자와 달리 기본형은 물론 참조형 변수에도 사용이 가능하다.
- 기본형인 경우에는 저장되어 있는 값이 같은지 비교할수 있고, 참조형인 경우에는 객체의 주소값이 같은지 즉, 같은 객체인지 비교가 가능하다.
- 단, 기본형과 참조형은 서로 형변환이 가능하지 않기 때문에 등가비교 연산자로 기본형과 참조형을 비교할 수 없다.

|비교연산자|연산 결과|
|------|---|
|==|두 값이 같으면 true 아니면 fasle|
|!=|두 값이 다르면 true 아니면 fasle|

#### 문자열의 비교
- 두 문자열을 비교할 때는 비교 연산자 '=='대신 equals()라는 메서드를 사용해야 한다. 비교 연산자는 두 문자열이 완전히 같은 것인지 비교할 뿐이므로, 문자열의 내용이 같은지를 비교하려면 equals()를 사용해야한다.
- 만일 대소문자를 구별하지 않고 비교하고 싶으면 equals() 대신, equalsIgnoreCase()를 사용하면 된다.

## 논리 연산자
논리 연산자는 2개의 조건이 결합된 경우는 논리 연산자를 사용하여 사용한다.
보통 관계 혹은 비교 연산자와 함께 많이 사용하며 연산결과가 true 혹은 false를 반환한다.

### 논리 연산자 - &&, ||, !
- 논리 연산자 '&&'는 AND에 해당하며, 두 피연산자가 모두 true일 때만 true를 반환한다.
- 논리 연산자 '||'는 OR에 해당하며, 두 피연산자중 어느 한쪽만 true여도 true를 결과로 얻는다.
- 논리 연산자는 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만을 허용한다.

> || (OR) : 피연산자 중 어느 한쪽만 true이면, true를 결과로 얻는다.
&& (AND) : 피연산자 양쪽 모두 true이어야 true를 결과로 얻는다.

|x|y|x \|\| y|x && y|
|------|---|---|---|
|true|true|true|true|
|true|false|true|false|
|false|true|true|false|
|false|false|false|false|

> 💡 참고
단락 회로 평가 (short circuit evaluation)
- 논리 곱은 두 피연산자가 모두 true일때만 결과가 true
  - 앞의 항이 false이면 뒤 항의 결과를 평가하지 않아도 false
- 논리 합은 두 피연산자 모두 fasle일때만 결과가 false
  - 앞의 항이 true이면 뒤 항의 결과를 평가하지 않아도 true

#### 논리 부정 연산자 !
- 이 연산자는 피연산자가 true이면 false를, false면 true를 반환

|x|!x|
|------|---|
|true|false|
|false|true|

- 이 연산자를 반복적으로 적용하면 참과 거짓을 반복적으로 적용되므로, 토글버튼을 논리적으로 구현이 가능하다.
- 논리 부정연산자가 주로 사용하는 곳은 조건문이나 반복문에 조건식이다.

### 비트 연산자 & | ^ ~ << >>
- 비트 연산자는 피연산자를 비트단위로 논리 연산한다. 단, 피연산자는 실수는 허용하지 않으며, 정수만 허용한다.

> | (OR 연산자): 피연산자 중 한쪽의 값이 1이면 1을 결과로 얻고, 그외는 0으로 얻는다.
& (AND 연산자): 피연산자 양 쪽이 모두 1이어야만 1을 결과로 얻는다. 그외에는 0을 얻는다.
^ (XOR 연산자): 피연산자의 값이 서로 다를 때만 1을 결과로 얻는다. 같을 때에는 0을 얻는다.

|x|y|x \| y|x & y|x ^ y|
|---|---|---|---|---|
|1|1|1|1|0|
|1|0|1|0|1|
|0|1|1|0|1|
|0|0|0|0|1|

- 비트 OR 연산자 '|'는 주로 특정 비트의 값을 변경할 때 사용한다.
- 비트 AND 연산자 '&'는 주로 특정 비트의 값을 뽑아낼 때 사용한다.
- 비트 XOR 연산자 '^'는 두 피연산자의 비트가 다를때만 1이된다. 그리고 같은 값으로 두고 XOR연산을 수행하면 원래의 값으로 돌아오는 특징이 있어서 간단한 암호화에 사용된다.
- 비트 연산에도 피연산자의 타입을 일치시키는 '산술 변환'이 일어난다.

#### 비트 전환 연산자 ~
- 이 연산자는 피연산자를 2진수로 표현했을 때, 0은 1로 1은 0으로 바꾼다. 논리부정 연산자 '!'와 유사하다.

|x|~x|
|------|---|
|1|0|
|0|1|

- 비트 전환 연산자 '~'에 의해 비트 전환이 되고 나면 부호있는 타입의 피연산자는 부호가 반대로 변경된다.
- 비트 전환 연산자는 피연산자의 타입이 int 타입보다 작은 범위면 int로 자동 형변환 후에 연산하기 때문에 8자리 2진수로 표현했어도 결과는 32자리 2진수가 나온다.
- 참고로 위의 원칙때문에 쉬프트 연산자를 2번연속 써도 int형 타입으로 나온다.

#### 쉬프트 연산자 << >>
- 이 연산자는 피연산자의 각 자리 (2진수일때)를 오른쪽 (>>) 혹은 왼쪽 (<<)으로 이동한다고 해서 쉬프트 연산자라고 불린다.
- 예를 들어 8 << 2는 10진수 8을 2진수로 변환하여 왼쪽으로 2자리 이동한다는 말이다.
- << 연산같은 경우 부호에 상관없이 각 자리를 왼쪽으로 이동시키며 빈 칸을 0으로만 채우면 되지만, >> 연산자는 오른쪽으로 이동시키기 때문에 부호있는 정수는 부호를 유지시키기 위해 왼쪽 피연산자가 음수인 경우 빈자리를 1로 채운다. 물론, 양수일때는 0으로 채운다.
- 쉬프트 연산자는 좌측 피연산자가 int보다 작은 타입이면 타입을 int로 자동 형변환이 된다. 그러나, 쉬프트 연산자는 다른 이항 연산자와 달리 피연산자의 타입을 일치시킬 필요가 없으므로 우측 피연산자에는 산술 변환이 일어나지 않는다.

> x << n은 x * (2^n)의 결과와 같다.
x >> n은 x / (2^n)의 결과와 같다.

- 그럼 여기서 궁금한 사항이 쉬프트 연산을 안 쓰고 곱셉이나 나눗셈을 하면 되면 안될까? 굳이 왜 복잡한 쉬프트 연산을 써야할까?
- 이유는 바로 속도차이다. 쉬프트 연산이 속도가 굉장히 빠르다. 하지만 가독성이 곱셈, 나눗셈보다 현저히 떨어질 것이다. 그래서 결론은 되도록 곱셈이나 나눗셈을 사용하고 속도에 굉장히 민감한 프로그램은 쉬프트 연산을 사용하자.

## 그 외 연산자
### 조건 연산자 ? :
- 조건 연산자는 조건식, 식1, 식2 모두 3개의 피연산자를 필요로 하는 삼항 연산자이며, 삼항 연산자는 조건 연산자 1개뿐이다.
- 또한 자동 형변환이 가능하다.
- 조건식이 참이면 식1을 반환 거짓이면 식2를 반환한다.
- 간단한 조건문 대신에 사용할 수 있는 연산자이다.

### 대입 연산자 = op=
- 대입 연산자는 변수와 같은 저장공간에 값 또는 수식의 연산결과를 저장하는데 사용된다.

#### lvalue와 rvalue
- 대입 연산자의 왼쪽 피연산자를 lvalue라고 하며, 오른쪽 피연산자를 rvalue라고 한다.
- 대입 연산자의 rvalue는 변수뿐만 아니라 식이나 상수 등이 모두 가능하며 lvalue는 반드시 변수처럼 값을 변경할 수 있는 것이어야 한다.

#### 복합 대입 연산자

![](https://velog.velcdn.com/images/roberts/post/08e5530a-7aba-4b1b-9f0e-ea7bab79b518/image.png)