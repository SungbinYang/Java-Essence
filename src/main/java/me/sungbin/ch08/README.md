> 참고
[자바의 정석](http://www.yes24.com/Product/Search?domain=ALL&query=%EC%9E%90%EB%B0%94%EC%9D%98%EC%A0%95%EC%84%9D&pid=123487&cosemkid=go16214999081121496&gclid=Cj0KCQjwmuiTBhDoARIsAPiv6L9xwP5-CSNKhbr9xyqRtRORbKj8Eo29uQrx6hkOyS5ruqrFnfFy_h8aAplzEALw_wcB)
https://itmining.tistory.com/9

## 예외 처리

### 프로그램 오류
프로그램이 실행 중 어떤 원인에 의해 오작동을 하거나 프로그램이 종료되는 경우가 있다. 이것을 프로그래밍의 에러 또는 오류라고 한다.
발생시점에 따라 컴파일 에러와 런타임 에러로 나눌 수 있다. 컴파일 에러는 단순히 컴파일 시점에 나타나는 오류로 문법적인 오류가 대다수이고, 런타임 에러는 프로그램의 실행 도중에 발생하는 에러를 런타임 에러라고 한다. 그 외에 논리적 에러도 존재하는데 컴파일도 잘 되고 실행도 잘 되지만, 내가 의도한 로직과 다르게 작동하는 것을 말한다.

> 컴파일 에러: 컴파일 시에 발생하는 에러
런타임 에러: 실행 시에 발생하는 에러
논리적 에러: 실행은 되지만, 의도와 다르게 동작하는 것

소스코드를 컴파일 하면 컴파일러가 소스코드를 분석하고 오타나 잘못된 구문, 자료형 체크등 기본적인 검사를 진행하고 이상이 없으면 .class파일이 생성되고 생성된 클래스 파일을 실행할 수 있게 된다.

하지만 컴파일단계에서 에러가 없다고 해서 에러가 다시는 발생 안 하는것은 아니다. 바로 실행 도중에 발생할 수 있다. 컴파일러는 실행도중에 발생할 수 있는 잠재적인 오류까지 검사할 수 없기 때문에 컴파일은 잘 되었어도 실행 중에 에러에 의해 잘못된 결과를 얻거나 프로그램이 비정상적으로 종료될 수도 있다. 아마 여러분도 런타임 에러를 겪어보았을 것이다. 갑자기 프로그램을 멈추고 종료되는 경우가 이 경우이다.

이런 런타임 에러를 대비하여 우리 소스코드에서 이런 처리를 대비하는 것이 중요하다. 자바에서는 실행 시 발생 할 수 있는 프로그램 오류를 에러와 예외 2가지로 구분하였다.

> 에러: 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
예외: 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류

에러가 발생하면 프로그램의 갑작스러운 종료를 막을 길이 없지만 예외는 우리 개발자가 대비할 수 있다. 적절하게 예외처리를 함으로 비정상적인 종료를 막을 수 있다.

### 예외 클래스의 계층 구조
오류와 예외 클래스들이 자바에서는 제공을 해준다. 이 클래스들 역시 Object 클래스의 하위 클래스이다. 아래의 그림은 예외 클래스가 어떻게 구성이 되었는지 계층 구도이다.

![](https://velog.velcdn.com/images/roberts/post/07330085-613f-43d8-8a45-2a1b237793c6/image.jpeg)

위의 그림을 보면 예외 클래스들은 2가지 그룹으로 나눠지는 것을 볼 수 있다. 바로 Checked Exception과 Runtime Exception으로 나눠진다.

> Checked Exception : 예외를 반드시 처리해야 하는 예외
RuntimeException: 예외를 명시적으로 처리를 안 해줘도 되는 예외


RuntimeException 클래스들은 주로 개발자의 실수에 의해 발생될 수 있는 예외들로 자바의 프로그래밍 요소들과 관계가 깊다. 예를들어 배열의 범위를 벗어나면 발생하는 ArrayIndexOutOfBoundsException과 null인 참조변수를 접근하거나 호출할려는 NullPointerException등 이런 예외클래스들이 RuntimeException 클래스들이다.

CheckedException 클래스들은 외부의 영향으로 발생할 수 있는것으로 사용자들의 동작에 의해 발생하는 경우가 많다. 예를들어, 존재하지 않는 파일들을 접근하려는 FileNotFoundException, 입력한 데이터 형식이 잘못된 DataFormatException등이 있다.

> CheckedException: 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
RuntimeException: 개발자의 실수로 발생하는 예외

### 예외처리하기 - try-catch문
프로그램의 실행 도중에 발생하는 에러는 어쩔 수 없지만, 예외는 반드시 개발자가 예외처리를 해줘야한다.

예외처리는 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는 것이며, 예외처리의 목적은 예외의 발생으로 인해 실행중인 프로그램의 갑작스러운 비정상 종료를 막고, 정상적인 실행상태를 유지할 수 있도록 하는 것이다.

> 예외처리
- 정의: 프로그램의 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것
- 목적: 프로그램의 비정상적인 종료를 막고 정상적인 실행상태를 유지하는 것

예외를 처리하기 위해서 try~catch문을 이용한다. 그 구조는 다음과 같다.

``` java
try {
	// 예외 발생 가능성이 있는 코드 작성
} catch (Exception e) {
	// 예외가 발생 할 경우 실행할 코드를 작성해준다.
}
```

먼저 try 블록에 예외가 발생 할 수 있는 코드를 작성해준다. 그리고 catch 블록에 예외가 발생 할 시, 처리할 코드를 작성해준다. catch 블록은 여러개가 가능하며 catch 파라미터로 예외클래스의 종류를 적어주면 된다. 단, 해당하는 예외가 없으면 실행하지 않는다.

또한 하나의 메서드 안에 여러 try~catch 블록이 존재할 수 있으며, catch 블록 안에 또 하나의 try~catch 블록이 존재할 수 있다.

### try~catch문에서의 흐름
try~catch문에서 예외가 발생한 경우와 예외가 발생하지 않은 경우가 있는데 이 2가지 케이스는 흐름자체가 다르게 흐른다.

> try블록에서 예외가 발생한 경우
* 발생한 예외와 일치하는 catch 블록이 있는지 찾는다.
* 일치하는 catch블록을 찾은 경우, catch블록 내의 코드를 수행하고 전체 try~catch문을 빠져나가고 그 다음 코드들을 실행한다. 만약 일치하는 catch블록을 찾지 못한 경우 예외를 처리하지 못한다.

> try 블록 내 예외가 발생하지 않은 경우
* catch 블록을 거치지 않고 try~catch문을 빠져나가서 수행을 계속한다.

try블록에서 예외가 발생하면 예외가 발생한 위치 이후에 있는 try블록의 문장들은 실행되지 않으므로 try블록에 포함시킬 코드의 범위를 잘 선택하야 한다.

### 예외의 발생과 catch블럭
catch블럭은 괄호와 블럭으로 나눠지는데 괄호에는 처리하고자 하는 예외와 같은 타입의 참조변수를 선언해야 한다.
예외가 발생하면 발생한 예외에 해당하는 클래스의 인스턴스가 만들어진다.
try블록에 예외가 발생한다면, 그 예외를 처리할 catch 블록을 찾는다. catch블록이 여러개인 경우 예외인스턴스와 catch 괄호안에 있는 참조변수와 instanceof 연산자를 통해 차례대로 비교하고 비교 결과각 true인 경우까지 계속 수행하며 true가 되면 해당하는 catch문을 수행하고 빠져나간다. 만약 비교 결과가 true가 없으면 예외는 처리되지 않는다. 또한 Exception클래스는 모든 예외의 상위 클래스이므로, catch 괄호안에 Exception 참조변수를 선언해주면 예외 발생 시, 반드시 실행하게 된다.

혹시 여러 예외가 발생할 것 같은데 어떤 예외인지 모를 경우 여러 catch 블록을 선언해주는데 마지막 catch 블록 괄호에 Exception 클래스를 선언해주면 어떤 예외든 반드시 처리하게 된다.

#### printStackTrace()와 getMessage()
예외가 발생하였을 때, 생성되는 예외 클래스의 인스턴스에는 발생한 예외에 대한 정보가 담겨 있으며, getMessage()와 printStackTrace()를 통해 이 정보에 접근할 수 있다. 이 메서드들은 catch블록에서만 사용가능하며 catch 괄호 안에 예외클래스의 참조변수를 통하여 접근이 가능하다.

> printStackTrace(): 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메세지를 화면에 출력한다.
getMessage(): 발생한 예외 클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.

> 💡 참고
printStackTrace(PrintStream s) 또는 printStackTrace(PrintWriter s)를 사용하면 발생한 예외에 대한 정보를 파일에 저장 할 수 있다.

#### 멀티 catch 블록
JDK1.7부터 여러 catch 블럭을 | 기호를 통해 하나의 catch블럭으로 합칠 수 있다. 이를 멀티 catch 블록이라고 부른다. 멀티 catch 블록을 이용하게 된다면 중복된 코드를 줄일 수 있다.

``` java
try {
	// code..
} catch (ExceptionA | Exception e) {
	e.printStackTrace();
}
```

그런데 멀티 catch블록을 사용할 때 주의할 점이 있다. 멀티 catch 블록의 | 기호로 연결된 예외 클래스가 상위와 하위 관계가 있다면 컴파일 에러가 발생한다. 왜냐하면 두 예외 클래스가 상위와 하위의 관계가 있다면 그냥 상위 클래스로만 감싸주는것과 같기 때문이다.
그리고 멀티 catch는 하나의 catch 블럭으로 여러 예외를 처리하는 것이기 때문에, 발생한 예외를 멀티 catch 블록으로 처리하게 되었을 때 어떤 예외가 발생했는지 알수가 없다. 그래서 참조변수 e를 통하여 멀티 catch 블록에 | 기호로 연결된 예외 클래스들의 공통 분모인 상위 예외 클래스에 선언된 멤버만 사용이 가능하다. 뭔 말인지 모르겠다는 독자가 있을 것 같아서 코드로 보여주겠다.

``` java
try {
	// code..
} catch (ExceptionA | ExceptionB e) {
	e.methodA(); // ERROR: ExceptionA에 선언된 methodA()는 호출 불가
    
    if (e instanceof ExceptionA) {
    	ExceptionA e1 = (ExceptionA) e;
        e1.methodA();
    } else {
    	// ...
    }
    
    e.printStackTrace();
}
```

필요하다면 위의 코드처럼 instanceof 연산자를 통해 어떤 예외인지 확인 후, 개별적으로 처리를 할 수 있다. 하지만 이렇게 할꺼면 멀티 catch 블록의 본질이 사라진다.

마지막으로 멀티 catch블록에 선언된 참조변수 e는 상수이므로 값을 변경이 불가능하다.

### 예외 발생시키기
키워드 throw를 통하여 개발자가 고의로 예외를 발생 시킬 수 있다.

> 1. 먼저 연산자 new를 이용하여 발생시키려는 예외 클래스의 객체를 만든다.
     * Exception e = new Exception("고의로 발생시킴");
2. 키워드 throw를 이용하여 예외를 발생시킨다.
   * throw e;

Exception 인스턴스를 생성할 때 생성자 파리미터로 String 타입의 문자열을 넣어주면 이 문자열이 예외 메세지로 저장된다.

또한 다시한번 강조하지만 try 블록처럼 예외발생가능성이 있는곳에 예외처리를 하지 않으면 컴파일 조차 되지 않는다.

하지만 예외적인 부분이 있다. 아래의 코드를 보자.

``` java
public class ExceptionEx11 {
    public static void main(String[] args) {
        throw new RuntimeException();
    }
}
```

위의 코드는 따로 예외처리를 해주지 않았지만 컴파일은 성공한다. 그 이유는 예외를 던진게 RuntimeExeption이기 때문이다. RuntimeException은 예외처리를 강제하지 않는다. 단지 CheckedException만 예외를 강제한다. 그 이유는 RuntimeException은 개발자의 실수에 의해서 발생하는 예외이기 때문에 강제로 예외처리를 강제하지 않는 것이고, CheckedException은 외부에 의해서 발생하는 예외이기 때문에 예외처리를 강제하는 것이다.

하지만 내 생각에는 어떤 예외든 예외처리를 해줘야 한다고 생각한다. 그래야 나중에 관리 및 유지보수 측면에서 좋다고 생각하기 때문이다.

### 메서드에 예외 선언하기
예외처리 방법에는 try~catch문 말고 다른 방법이 존재한다.
메서드에 예외를 선언하고 싶으면 메서드의 선언부에 키워드 throws를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어주기만 하면 된다.

``` java
void method() throws Exception1, Exception2 {

}
```

> ⚠️ 주의
예외를 발생시키는 키워드 thorw와 예외를 메서드에 선언할 때 쓰이는 throws를 잘 구별하자.

만일 예외 상위 클래스인 Exception클래스를 메서드에 선언하면 모든 예외가 발생할 가능성이 있다는 의미이다.

``` java
void method() throws Exception {

}
```

이렇게 메서드 선언부에 예외를 선언해줌으로 이 메서드를 사용하는 입장에서는 이 메서드를 사용하기 위해서는 어떤 예외를 처리해줘야하는지 알 수 있고 그 예외들을 강제로 처리하게 할 수 있어서 개발자의 짐을 조금 덜 수 있다.

또한 throws 뒤에 적는 예외 클래스들은 일반적으로 CheckedException 클래스들만 적어준다. 그 이유는 RuntimeException은 굳이 예외처리를 강제하지 않아도 되어서 throws로 굳이 강제할 이유는 없기 때문이다. 하지만 CheckException 클래스들은 예외를 강제하기 때문에 throws 뒤에 적어주는것이 논리적으로도 적절하다.

그런데 사실 throws는 예외처리가 아니라 throws가 선언된 메서드를 사용하는 곳에 예외처리를 떠맡기는 것이다. 예외를 전달하는 메서드가 또 다시 자신을 호출한 메서드에게 전달이 가능하며, 이런식을 계속 호출스택에 쌓였다가 제일 마지막에 main메서드에서도 예외가 처리가 되지 않으면 main 메서드마저 종료되어 프로그램이 전체가 종료된다.

그럼 언제 try~catch로 처리하고 언제 예외를 던져야 할까?
예외가 발생한 메서드 내에서 자체적으로 처리해도 되는 것은 메서드 내에서 try-catch문을 사용해서 처리하고, 메서드 호출 시 넘겨야 할 값을 다시 받아야 하는 경우 예외를 메서드에 선언해서 호출한 메서드에서 처리해야 한다.

### finally 블록
finally블록은 예외의 발생여부에 상관없이 실행되어야 할 코드를 포함시킬 목적으로 사용된다. 그 구조는 다음과 같다.

``` java
try {
	// code..
} catch (Exception e) {
	// Exception process code
} finally {
	// must perform code
}
```

예외가 발생하는 경우 try -> catch -> finally순으로 실행이 되고, 예외가 발생하지 않는 경우에는 try -> finally 순으로 실행된다.

finally블록은 try나 catch블록에 return 키워드가 있더라도 수행되고 return이 실행된다.

### 자동 자원 반환 - try~with~resources문
JDK1.7부터 try~with~resouces문이라는 try~catch문의 변형이 생겼다.
주로 입출력에 사용되는 클래스중에서는 사용한 후에 꼭 자원을 반환해줘야하는 것들이 있다. 이럴 때 자주 사용되는 구문이다.

``` java
try (FileInputStream fis = new FileInputStream("score.dat");
DataInputStream dis = new DataInputStream(fis);) {
	
    while (true) {
    	score = dis.readInt();
        System.out.println(score);
        sum += score;
    }
} catch (EOFException e) {
	System.out.println("점수의 총합은 " + sum + "입니다.");
} catch (IOException ie) {
	ie.printStackTrace();
}
```

try~with~resources문의 괄호 안에 객체를 생성하는 문장을 넣으면 이 객체는 close() 메서드를 호출하지 않아도 된다. try 블럭을 벗어나는 순간 자동적으로 close()가 호출되면서 그 다음에 catch 블럭 혹은 finally블럭을 실행한다. 물론 close() 메서드를 가진 모든 클래스가 try~with~resources를 쓸 수 있는 것은 아니다. try~with~resources를 쓸려면 AutoCloseable이라는 인터페이스를 구현된 클래스여야 한다.

``` java
public interface AutoCloseable {
	void close() throws Exception;
}
```

또한 예외가 동시에 2가지 이상 발생할 수 있다. 이럴 때 한 가지는 억제된 예외 표시로 뜨는 상황이 있다. 억제된 예외에 대한 정보는 먼저 뜬 예외정보에 담긴다.

> void addSuppressed(Throwable exception) 억제된 예외 추가
Throwable[] getSuppressed() 억제된 예외(배열)을 반환한다.

만일 기존 try~catch를 썼으면 억제된 예외만 표시되고 먼저 호출된 예외는 무시가 되었을 것이다.

### 사용자 예외
기존에 정의된 예외외에도 개발자가 필요에따라 입맛에 맞는 예외클래스를 만들 수 있다. 보통 Exception클래스나 RuntimeException클래스로부터 상속받아 클래스를 만들지만 필요에 따라 알맞은 예외 클래스를 선택할 수 있다.

``` java
class MyException extends Exception {
	MyException(String message) {
    	super(message); // 상위 클래스의 생성자 호출
    }
}
```

초기에는 사용자 예외를 만들 때 Excetion 클래스를 상속받아 작성하곤 했지만 요즘은 예외처리를 선택적으로 하기 위해 RuntimeException을 상속받아서 작성하는 쪽으로 바뀌어가고 있다. CheckedException은 반드시 예외처리를 해줘야함으로 예외처리가 불필요한 경우에도 try~catch문을 넣어서 코드를 복잡하게 만들 수 있기 때문이다.

예외처리를 강제하도록 한 이유는 개발경험이 적은 사람들도 보다 견고한 코드를 작성하기 위함이였지만 지금은 기술이 발전하면서 자바를 사용하는 환경이 달라짐으로 예외를 강제처리보단 선택적 처리하는 상황으로 바뀌어가고 있다. 그래서 요즘은 CheckedException보단 RuntimeException이 환영받고 있고 웹에서 유명한 Spring Framework도 RuntimeException을 사용하곤 한다.

### 예외 되던지기
한 메서드에서 여러 예외가 발생될 것으로 예상이 된다면 몇개는 try~catch문으로 몇개는 메서드 선언부에 선언하여 처리할 수 있다. 그리고 심지어는 하나의 예외에 대해서도 예외가 발생한 메서드와 호출한 메서드, 양쪽에서 처리하도록 할 수 있다. 이것은 예외를 처리할 후에 인위적으로 다시 발생시키는 방법을 통해서 가능한데 이것을 예외 되던지기라고 한다. 이 방법은 하나의 예외에 대해서 발생한 메서드와 이를 호출한 메서드 양쪽 모두에서 처리해줘야 할 작업이 있을 때 사용된다. 이 때 주의할 점은 예외가 발생할 메서드에서는 try~catch문을 사용해서 예외처리를 해줌과 동시에 메서드의 선언부에 발생할 예외를 throws에 지정해줘야한다.

만약 반환값이 있는 메서드라면 try블록뿐만아니라 catch블록에서도 return문이 있어야 한다. 예외가 발생했을 경우에도 반환은 해줘야 하기 때문이다. 또는 catch블록에서 예외 되던지기를 해서 호출한 메서드로 예외를 전달하면, return문이 없어도 된다. 그래서 검증에서도 assert문 대신에 AssertError를 생성해서 던진다.

> assert문은 검증을 수행하기 위한 문장이다.

또한 finally블록에 return문이 있을 경우 try~catch블록에 있는 return문은 무시된다. 그 이유는 finally블록이 가장 마지막에 호출되기 때문이다.

### 연결된 예외
한 예외가 다른 예외를 발생시킬 수 있다. 예를 들어 A예외가 B예외를 발생시켰다면 A를 B의 '원인 예외'라고 한다. 그럼 어떻게 원인 예외를 등록시킬까? 바로 아래의 메서드를 사용하여 등록이 가능하다.

> Throwable initCause(Throwable cause) 지정한 예외를 원인 예외로 등록
Throwable getCause() 원인 예외를 반환

발생한 예외를 그냥 처리하면 될텐데 왜 원인예외로 등록을 하여 다시 예외를 발생시킬까? 그 이유는 여러가지 예외를 하나의 큰 분류의 예외로 묶어서 다루기 위해서이다. 또 다른 이유는 CheckedException을 RuntimeException으로 바꿀수 있도록 하기 위해서이다. CheckedException으로 예외처리를 강제한 이유는 프로그래밍 경험이 적은 사람도 견고한 코드를 작성할 수 있도록 한 것이지만 지금은 환경이 많이 발전되었다.
그래서 CheckedException이 발생해도 예외를 처리할 수 없는 상황이 발생하였고 그저 우리는 의미없는 try~catch를 하였다. 하지만 이런 CheckedException을 RuntimeException으로 변경함으로 억지로 예외처리를 하지않아도 된다. CheckedException에서 RuntimeException으로 변경하는 방법은 아래와 같다.

``` java
throw new RuntimeException(체크 예외 생성자);
```