> 참고
[자바의 정석](http://www.yes24.com/Product/Search?domain=ALL&query=%EC%9E%90%EB%B0%94%EC%9D%98%EC%A0%95%EC%84%9D&pid=123487&cosemkid=go16214999081121496&gclid=Cj0KCQjwmuiTBhDoARIsAPiv6L9xwP5-CSNKhbr9xyqRtRORbKj8Eo29uQrx6hkOyS5ruqrFnfFy_h8aAplzEALw_wcB)

## java.lang 패키지
java.lang 패키지는 자바 프로그래밍을 하면서 가장 기초가 되는 클래스들을 포함하고 있다. 그래서 우리가 String 클래스나 System 클래스들을 import문 없이 사용할 수 있었던 것이다.

### Object 클래스
Object 클래스는 모든 클래스의 가장 상위 클래스이기 때문에 Object 클래스의 모든 멤버들을 다른 클래스에서 사용이 가능하다.

|Object 클래스의 메서드|설 명|
|------------------|---|
|protected Object clone()|객체 자신의 복사본을 반환한다.|
|public boolean equals(Object obj)|객체 자신과 객체 obj가 같은 객체인지 알려준다. (같으면 true)|
|protected void finalize()|객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출된다. 이 때 <br /> 수행되어야하는 코드가 있을 때 오버라이딩 한다. (거의 사용안함)|
|public Class getClass()|객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환한다.|
|public int hashCode()|객체 자신의 해시코드를 반환한다.|
|public String toString()|객체 자신의 정보를 문자열로 반환한다.|
|public void notify()|객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다.|
|public void notifyAll()|객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다.|
|public void wait() <br /> public void wait(long timeout) <br /> public void wait(long timeout, int nanos)|다른 쓰레드가 notify()나 notifyAll()을 호출할 때 까지 현재 쓰레드를 무한히 또는 지정된 시간동안 기다리게 한다. (timeout은 1/1000초, nanos는 1/10^9초이다.)|

Object 클래스는 멤버변수는 없고 오직 11개의 메서드만 존재한다. 이 메서들은 모든 인스턴스들이 가져야할 기본적인 기능들이다.

#### **equals(Object obj)**
equals 메서드는 객체의 참조변수를 매개변수로 받아서 비교하여 그 결과를 boolean 값으로 알려주는 역할을 한다. 아래의 코드는 euqals 메서드의 실제 구현 내용이다.

``` java
public boolean equals(Object obj) {
	return (this == obj);
}
```

위의 코드를 확인해보면 두 객체의 같고 다름을 참조변수의 값으로 판단한다.

Object 클래스로부터 상속받은 equals 메서드는 결국 두 개의 참조변수가 같은 객체를 참조하는지 확인하는 메서드이다. 이런 equals 메서드를 참조변수로 비교를 말고 저장하고 있는 멤버의 값으로 비교하고 싶다면 오버라이딩을 하면 된다.

String 클래스 역시 Object 클래스의 equals 메서드를 오버라이딩한 것으로 문자열이 같으면 true를 반환하게 하였다. 그래서 우리가 String 클래스 비교연산자를 써서 활용을 할 수 있었던 것이다.

> 💡 참조
String 클래스뿐만 아니라 Date, File, wrapper 클래스들 (Integer, Long, Double등)의 equals 메서드도 주소 값이 아닌 내용을 비교하도록 오버라이딩을 하였다. 하지만 StringBuffer 클래스는 equals 메서드가 오버라이딩이 되어있지 않다.

#### **hashCode()**
이 메서드는 해싱기법에서 사용되는 해시함수를 사용한 것이다. 해시함수는 찾고자 하는 값을 입력하면, 그 값이 저장된 해시코드를 반환한다. 일반적으로는 해시코드가 같은 두 객체가 존재할 수 있지만, Object 클래스에 정의된 hashCode 메서드는 객체 주소 값을 통하여 해시코드를 생성하기 때문에 해시코드가 같은 객체는 존재하지 않는다.
위에서 살펴보듯이 객체의 주소 값이 아닌 실제 저장되어 있는 멤버의 값으로 비교를 할려면 equals 메서드 뿐만 아니라 hashCode 메서드도 적절히 오버라이딩 해야 한다. 같은 객체면 hashCode 값도 같아야 하기 때문이다.

String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 hashCode 메서드를 오버라이딩 하였기에 같은 문자열이면 같은 해시코드가 반환된다. 만약 원래의 hashCode를 알고 싶다면 ```System.identityHashCode(Object x)```를 사용하여 알 수 있다.

> System.identityHashCode(Object x)의 호출 결과는 실행 할 때마다 달라질 수 있다.

#### **toString()**
이 메서드는 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의한 것이다. 여기서 인스턴스 정보라는 것은 대부분 인스턴스 변수에 저장된 값들을 문자열로 표현한다는 의미이다. 구현 코드는 아래와 같다.

``` java
public String toString() {
	return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```

클래스를 작성할 때 toString()을 오버라이딩 하지 않으면 위의 코드와 같은 문자열이 반환될 것이다. 즉, full packageName + @ + 해시코드값이 반환될 것이다.

String 클래스의 toString()은 String 인스턴스가 가지고 있는 문자열을 반환하도록 오버라이딩되어 있고, Date 클래스같은 경우 Date 인스턴스가 갖고 있는 날짜와 시간을 문자열로 변환되어 반환하도록 오버라이딩되어 있다.

이처럼 toString()은 일반적으로 인스턴스나 클래스에 다한 정보 또는 인스턴스 변수들의 값을 문자열로 변환하여 반환하도록 하는 것이 보통이다.

#### **clone()**
이 메서드는 자신을 복제하여 새로운 인스턴스를 생성하는 일을 한다.
어떤 인스턴스에 대해 작업을 할 때, 원래의 인스턴스는 보존하고 clone 메서드를 이용해서 새로운 인스턴스를 생성하여 작업을 하면 작업이전의 값이 보존되므로 작업에 실패해서 원래의 상태로 되돌리거나 변경되기 전의 값을 참고하는데 도움이 된다.

Object 클래스에 정의된 clone()은 단순히 인스턴스의 변수 값만 복사하기 때문에 참조타입의 인스턴스 변수가 있는 클래스는 완전한 인스턴스 복제가 이루어지지 않는다.

예를 들면 배열의 경우 복제된 배열도 같은 배열의 주소를 갖기 때문에 복제된 배열에서 작업이 이루어지면 원래의 배열에도 영향을 끼친다.

> Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다. 이 인터페이스를 구현하지 않고 clone 메서드를 호출하면 예외가 발생한다.

clone 메서드를 사용하려면 먼저 복제할 클래스가 Cloneable 인터페이스를 구현해야 하고, clone 메서드를 오버라이딩하면서 접근 제어자를 protected에서 public으로 변경한다. 그래야 상속관계가 없는 다른 클래스에서 clone 메서드를 호출 할 수 있다. clone 메서드의 구현내용은 아래와 같다.

``` java
public class Object {
	protected native Object clone() throws CloneNotSupportedException;
}
```

Cloneable 인터페이스를 구현한 클래스의 인스턴스만 clone()을 통한 복제가 가능한데 그 이유는 인터페이스의 데이터를 보호하기 위해서이다. 즉, Cloneable 인터페이스를 구현한 클래스라는 것은 클래스 작성자가 복제를 허용한다는 의미이다.

#### 공변 반환타입
JDK1.5부터 공변 반환타입이라는 것이 추가되었는데, 이 기능은 오버라이딩할 때 상위 메서드의 반환타입을 하위 클래스의 타입으로 변경을 허용하는 것이다. 어떤 말인지 이해를 못할것 같으니 코드를 보자.

``` java
public Point clone() {
	Object obj = null;
    
    try {
    	obj = super.clone();
    } catch (CloneNotSupportedException e) {
    	e.printStackTrace();
    }
    
    return (Point) obj;
}
```

위의 코드를 보면 Object 클래스에 정의된 clone 메서드를 오버라이딩하였는데 공변타입으로 하여 반환타입을 하위클래스 타입으로 하였다. 이렇게 공변 반환타입을 사용하면 상위의 타입이 아닌, 실제로 반환되는 하위 인스턴스의 타입으로 반환할 수 있어서 번거로운 형변환이 줄어든다는 장점이 있다.

> 배열을 clone 메서드를 사용할 수 있지만 System.arraycopy() 를 사용할 수 있다. System.arraycopy()를 사용할때는 먼저 복사할려는 배열과 같은 길이의 배열이 있어야한다.

#### 얕은 복사와 깊은 복사
clone()은 단순히 객체에 저장된 값을 그대로 복사할 뿐, 객체가 참조하고 있는 객체까지는 복제하지 않는다. 즉, 복사할 클래스의 멤버로 다른 참조변수가 선언되어 있으면 그 참조변수는 제대로 복제가 되질 않는다. 즉, 완벽한 복제라고 볼 수 없다. 이러한 복제를 '얕은 복사'라고 한다. 얕은 복사같은 경우에는 원본을 변경하면 복사본도 변경이 된다. 반면에 원본이 참조하고 있는 객체까지 복제하는 것을 '깊은 복사'라고 하며, 깊은 복사에서는 원본과 복사본이 서로 다른 객체를 참조하기 때문에 원본의 변경이 복사본에 영향을 미치지 않는다.

#### getClass()
이 메서드는 자신이 속한 클래스의 Class 객체를 반환하는 메서드이다. 구현내용은 아래와 같다.

``` java
public final class Class implements ... {
	...
}
```

Class 객체는 클래스의 모든 정보를 담고 있으며, 클래스 당 1개만 존재한다. 그리고 클래스 파일이 클래스 로더에 의해 메모리에 올라갈 때, 자동으로 생성된다.

> 클래스 로더는 실행 시에 필요한 클래스를 동적으로 메모리에 로드하는 역할을 한다. 먼저 기존에 생성된 클래스 객체가 메모리에 존재하는지 확인하고, 있으면 객체의 참조를 반환하고 없으면 클래스 패스에 지정된 경로를 따라서 클래스 파일을 찾는다. 못 찾으면, ClassNotFoundException이 발생하고, 찾으면 해당 클래스 파일을 읽어서 Class 객체로 변환한다.

#### Class 객체를 얻는 방법
Class 객체를 얻는 방법은 아래와 같다.

``` java
Class cObj = new Card().getClass(); // 생성된 객체로 얻는 방법
Class cObj = Card.class; // 클래스 리터럴로부터 얻는 방법
Class cObj = Class.forName("Card"); // 클래스 이름으로부터 얻는 방법
```

특히 forName()은 특정 클래스 파일을 메모리에 올릴 때 주로 사용한다.
Class 객체를 이용하려면, 클래스에 정의된 멤버의 이름이나 개수 등, 클래스에 대한 모든 정보를 얻을 수 있기 때문에 Class 객체를 통해서 객체를 생성하고 메서드를 호출하는 등 보다 동적인 코드를 작성할 수 있다.