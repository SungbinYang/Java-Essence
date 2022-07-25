> 참고
[자바의 정석](http://www.yes24.com/Product/Search?domain=ALL&query=%EC%9E%90%EB%B0%94%EC%9D%98%EC%A0%95%EC%84%9D&pid=123487&cosemkid=go16214999081121496&gclid=Cj0KCQjwmuiTBhDoARIsAPiv6L9xwP5-CSNKhbr9xyqRtRORbKj8Eo29uQrx6hkOyS5ruqrFnfFy_h8aAplzEALw_wcB)
https://velog.io/@hyun_ha/JAVA-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%ACCollection-Framework
https://h2de6n.tistory.com/10
https://pridiot.tistory.com/63
https://catsbi.oopy.io/8f0f5192-3a06-405e-8076-dbc5ff9f2dfb

## 컬렉션 프레임워크
컬렉션 프레임워크이란, 데이터군을 저장하는 클래스들을 표준화한 설계를 뜻한다. 컬렉션은 다수의 데이터, 즉, 데이터 그룹을, 프레임워크는 표준화된 프로그래밍 방식을 의미한다.

> Java API 문서에서는 컬렉션 프레임워크를 데이터군을 다루고 표현하기 위한 단일화된 구조라고 정의하고 있다.

JDK1.2 이전에는 컬렉션 클래스, 다수의 데이터를 저장할 수 있는 클래스들을 서로 다른 각자의 방식으로 처리하여서 불편함이 존재하였다. 하지만 JDK1.2 이후부터 컬렉션 프레임워크가 등장하고 다양한 종류의 컬렉션 클래스가 추가되고 모든 컬렉션 클래스를 표준화된 방식으로 다룰 수 있도록 체계화 하였다.

컬렉션 프레임워크는 다수의 데이터를 다루는데 필요한 다양하고 풍부한 클래스들을 제공하고 인터페이스와 다형성을 이용한 객체지향 설계를 통해 표준화되어 있기 때문에 재사용성이 높은 코드를 작성 할 수 있다.

### 컬렉션 프레임워크의 핵심 인터페이스
컬렉션 프레임워크는 컬렉션 데이터 그룹을 크게 3가지 타입이 존재한다고 인식하고 각 컬렉션을 다루는데 필요한 기능을 가진 3개의 인터페이스를 정의하였다. 그리고 인터페이스 List, Set의 공통된 부분을 다시 뽑아 새로운 인터페이스인 Collection을 추가로 정의하였다.

![](https://velog.velcdn.com/images/roberts/post/4b492c68-4322-4554-9a9b-b6d4e4215068/image.png)

인터페이스 List와 Set을 구현한 컬렉션 클래스들은 서로 많은 공통부분이 있어서 공통부분을 뽑아 Collection 인터페이스를 정의할 수 있었지만 Map 인터페이스는 이들과는 전혀 다른 형태로 컬렉션을 다루기 때문에 상속계층도에는 포함을 못시킨다.

|인터페이스|특징|
|------|---|
|List|순서가 있는 데이터의 집합, 데이터 중복 허용 <br /> ex) 대기자 명단 <br /> 구현 클래스 : ArrayList, LinkedList, Stack, Vector 등|
|Set|순서를 우지하지 않는 데이터의 집합. 데이터 중복 허용 x <br /> ex) 양의 정수집합, 소수의 집합 <br /> 구현클래스: HashSet, TreeSet등|
|Map|키와 값의 쌍으로 이루어진 데이터의 집합 <br /> 순서는 유지되지 않으며, 키는 중복을 허용하지 않고 값은 중복을 허용한다. <br /> ex) 우편번호, 지역번호 <br /> 구현클래스: HashMap, TreeMap, Hashtable, Properties등|

컬렉션 프레임워크의 모든 컬렉션 클래스들은 List, Set, Map중의 하나를 구현하고 있으며 구현한 인터페이스의 이름이 클래스의 이름에 포함되어 있어서 이름만으로도 클래스의 특징을 쉽게 알 수 있다.
그러나 Vector, Stack, Hashtable, Properties와 같은 클래스들은 컬렉션 프레임워크가 만들어지기 이전부터 존재해서 컬렉션 프레임워크의 명명규칙을 따르지 않는다.
Vector나 Hashtable과 같은 기존의 컬렉션 클래스들은 가능하면 사용하지 말고 새로 추가된 ArrayList, HashMap을 이용하는 것이 좋다.


![](https://velog.velcdn.com/images/roberts/post/f03fd1a0-c8b2-4f1f-95ab-07b230e36cad/image.png)

#### Collection 인터페이스
List와 Set의 조상인 Collection 인터페이스에는 아래와 같은 메서드가 정의되어 있다.

|메서드|설명|
|------|---|
|boolean add(Object o) <br /> boolean addAll(Collection c)|지정된 객체(o) 또는 Collection(c)의 객체들을 Collection에 추가한다.|
|void clear()|Collection의 모든 객체를 삭제한다.|
|boolean contains(Object o) <br /> boolean containsAll(Collection c)|지정된 객체(o) 또는 Collection의 객체들이 Collection에 포함되어 있는지 확인한다.|
|boolean equals(Object o)|동일한 Collection인지 비교한다.|
|int hashCode()|Collection의 해시코드를 반환한다.|
|boolean isEmpty()|Collection이 비어있는지 확인한다.|
|Iterator iterator()|Collection의 Iterator를 얻어서 반환한다.|
|boolean remove(Object o)|지정된 객체를 삭제한다.|
|boolean removeAll(Collection c)|지정된 Collection에 포함된 객체들을 삭제한다.|
|boolean retainAll(Collection c)|지정된 Collection에 포함된 객체만을 남기고 다른 객체들은 <br /> Collection에서 삭제한다. 이 작업으로 인해 Collection에 변화가 <br /> 있으면 true, 아니면 false를 반환한다.|
|int size()|Collection에 저장된 객체의 수를 반환한다.|
|Object[] toArray()|Collection에 저장된 객체를 객체배열로 반환한다.|
|Object[] toArray(Object[] a)|지정된 배열에 Collection의 객체를 저장해서 반환한다.|

Collection 인터페이스는 컬렉션 클래스에 저장된 데이터를 읽고, 추가하고 삭제하는 등 컬렉션을 다루는데 가장 기본적인 메서드를 정의하고 있다.

#### List 인터페이스
List 인터페이스는 중복을 허용하며, 저장순서가 유지되는 컬렉션을 구현하는데 사용한다.

![](https://velog.velcdn.com/images/roberts/post/6b33cdd0-cd87-4e47-8ffd-e2a22829aeee/image.png)

|메서드|설명|
|------|---|
|void add(int index, Object element) <br /> boolean addAll(int index, Collection c)|지정된 위치(index)에 객체(element) 또는 컬렉션에 포함된 객체들을 추가한다.|
|Object get(int index)|지정된 위치(index)에 있는 객체를 반환한다.|
|int indexOf(Object o)|지정된 객체의 위치(index)를 반환한다. <br /> (List의 첫 번째 요소부터 순방향으로 찾는다.)|
|int lastIndexOf(Object o)|지정된 객체의 위치(index)를 반환한다. <br /> (List의 마지막 요소부터 역방향으로 찾는다.)|
|ListIterator listIterator() <br /> ListIterator listIterator(int index)|List의 객체이 접근 할 수 있는 ListIterator를 반환한다.|
|Object remove(int index)|지정된 위치(index)에 있는 객체를 삭제하고 삭제된 객체를 반환한다.|
|Object set(int index, Object element)|지정된 위치(index)에 객체(element)를 저장한다.|
|void sort(Comparator c)|지정된 비교자(comparator)로 List를 정렬한다.|
|List subList(int fromIndex, int toIndex)|지정된 범위(fromIndex부터 toIndex)에 있는 객체를 반환한다.|

#### Set 인터페이스
Set 인터페이스는 중복을 허용하지 않고 저장순서가 유지되지 않는 컬렉션 클래스를 구현하는데 사용된다.
Set 인터페이스를 구현한 클래스로는 HashSet, TreeSet등이 있다.

![](https://velog.velcdn.com/images/roberts/post/507dc4be-09be-4830-83dd-577a15fc18c5/image.png)

#### Map 인터페이스
Map 인터페이스는 키와 값을 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스를 구현하는데 사용된다. 키는 중복될 수 없지만 값은 중복이 가능하다. 만약 중복된 키와 값을 저장하면 기존의 값은 없어지고 마지막에 저장한 값만 남게 된다. Map 인터페이스를 구현한 클래스로는 Hashtable, HashMap, LinkedHashMap, SortedMap, TreeMap등이 있다.

![](https://velog.velcdn.com/images/roberts/post/5674ba39-6e2e-4531-be4e-b4ca491da904/image.png)


|메서드|설명|
|------|---|
|void clear()|Map의 모든 객체를 삭제한다.|
|boolean containsKey(Object key)|지정된 key객체와 일치하는 Map의 key객체가 있는지 확인한다.|
|boolean containsValue(Object value)|지정된 value객체와 일치하는 Map의 value객체가 있는지 확인한다.|
|Set entrySet()|Map에 저장되어 있는 key-value쌍을 Map.Entry타입의 객체로 저장한 Set으로 반환한다.|
|boolean equals(Object o)|동일한 Map인지 비교한다.|
|Object get(Object key)|지정한 key객체에 대응하는 value객체를 찾아서 반환한다.|
|int hashCode()|해시코드를 반환한다.|
|boolean isEmpty()|Map이 비어있는지 확인한다.|
|Set keySet()|Map에 저장된 모든 key객체를 반환한다.|
|Object put(Object key, Object value)|Map에 value 객체를 key 객체에 연결하여 저장한다.|
|void putAll(Map t)|지정된 Map의 모든 key-value 쌍을 추가한다.|
|Object remove(Object key)|지정한 key객체와 일치하는 key-value객체를 삭제한다.|
|int size()|Map에 저장된 key-value쌍의 개수를 반환한다.|
|Collection values()|Map에 저장된 모든 value 객체를 반환한다.|

#### Map.Entry 인터페이스
Map.Entry 인터페이스는 Map 인터페이스의 내부 인터페이스이다.
Map에 저장되는 key-value 쌍을 다루기 위해 내부적으로 Entry 인터페이스를 정의해놓았다. 이것은 보다 객체지향적으로 설계하도록 유조하기 위한 것으로 Map인터페이스를 구현하는 클래스에서는 Map.Entry 인터페이스도 함께 구현해야한다.

|메서드|설명|
|------|---|
|boolean equals(Object o)|동일한 Entry인지 비교한다.|
|Object getKey()|Entry의 key 객체를 반환한다.|
|Object getValue()|Entry의 value 객체를 반환한다.|
|int hashCode()|Entry의 해시코드를 반환한다.|
|Object setValue(Object value)|Entry의 value객체를 지정된 객체로 바꾼다.|