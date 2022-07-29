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

### ArrayList
ArrayList는  컬렉션 프레임워크에서 가장 많이 사용되는 컬렉션 클래스이다. List를 구현하기 때문에 데이터의 저장순서도 저장이 되고, 중복을 허용한다. 또한 ArrayList는 기존의 Vector 클래스를 개선한것이여서 기존의 Vector클래스의 구현원리와 기능적인 측면은 동일하다. 또한 ArrayList는 데이터를 저장할 때 Object 배열을 이용해서 데이터를 순차적으로 저장한다. 그리고 저장공간이 다 차면 그것보다 더 큰 새로운 배열을 생성 후, 기존의 배열을 복사하여 저장한다.

|메서드|설명|
|------|---|
|ArrayList()|크기가 10인 ArrayList를 생성|
|ArrayList(Collection c)|주어진 컬렉션이 저장된 ArrayList 생성|
|ArrayList(int initialCapacity)|지정된 초기용량을 갖는 ArrayList를 생성|
|boolean add(Object o)|ArrayList의 마지막에 객체를 추가. 성공하면 true|
|void add(int index, Object element)|지정된 위치(index)에 객체를 저장|
|boolean addAll(Collection c)|주어진 컬렉션의 모든 객체를 저장한다.|
|boolean addAll(int index, Collection c)|지정된 위치부터 주어진 컬렉션의 모든 객체를 저장한다.|
|void clear()|ArrayList를 완전히 비운다.|
|Object clone()|ArrayList를 복제한다.|
|boolean contains(Object o)|지정된 객체(o)가 ArrayList에 포함되어 있는지 확인|
|void ensureCapacity(int minCapacity)|ArrayList의 용량이 최소한 minCapacity가 되도록 한다.|
|Object get(int index)|지정된 위치(index)에 저장된 객체를 반환한다.|
|int indexOf(Object o)|지정된 객체가 저장된 위치를 찾아 반환한다.|
|boolean isEmpty()|ArrayList가 비어있는지 확인한다.|
|Iterator iterator()|ArrayList의 Iterator 객체를 반환한다.|
|int lastIndexOf(Object o)|객체(o)가 저장된 위치를 끝부터 역방향으로 검색해서 반환|
|ListIterator listIterator()|ArrayList의 ListIterator를 반환|
|ListIteraotr listIterator(int index)|ArrayList의 지정된 위치부터 시작하는 ListIterator를 반환|
|Object remove(int index)|지정된 위치 (index)에 있는 객체를 제거한다.|
|boolean remove(Object o)|지정한 객체를 제거한다. (성공하면 true, 실패하면 false)|
|boolean removeAll(Collection c)|지정한 컬렉션에 저장된 것과 동일한 객체들을 ArrayList에서 제거한다.|
|boolean retainAll(Collection c)|ArrayList에 저장된 객체 중에서 주어진 컬렉션과 공통된 것들만을 남기고 나머지는 삭제한다.|
|Object set(int index, Object element)|주어진 객체(element)를 지정된 위치(index)에 저장한다.|
|int size()|ArrayList에 저장된 객체의 개수를 반환한다.|
|void sort(Comparator c)|지정된 정렬기준(c)으로 ArrayList를 정렬|
|List subList(int fromIndex, int toIndex)|fromIndex부터 toIndex사이에 저장된 객체를 반환한다.|
|Object[] toArray()|ArrayList에 저장된 모든 객체들을 객체배열로 반환한다.|
|Object[] toArray(Object[] a)|ArrayList에 저장된 모든 객체들을 객체배열 a에 담아 반환한다.|
|void trimToSize()|용량을 크기에 맞게 줄인다. (빈 공간을 없앤다.)|

ArrayList를 생성할 때 저장할 요소의 개수를 고려해서 실제 저장할 개수보다 약간 여유있는 크기로 하는 것이 좋다. 생성할 때 지정한 크기보다 더 많은 객체를 저장하면 자동적으로 크기가 증가하지만 이 과정에 시간이 소요되기 때문이다.

ArrayList나 Vector 같이 배열을 이용한 자료구조는 데이터를 읽어오고 저장하는데는 효율이 좋지만 용량을 변경해야할 때는 새로운 배열을 생성한 후 기존의 배열로부터 새로 생성된 배열로 데이터를 복사해야하기 때문에 상당히 효율이 떨어진다는 단점을 가지고 있다.

> 인터페이스를 구현할 때 인터페이스에 정의된 모든 메서드를 구현해야 한다. 일부 메서드만 구현했다면 추상클래스로 선언해야한다. 그러나 JDK1.8부터 List 인터페이스에 3개의 디폴트 메서드가 추가되어서 이 들은 구현하지 않아도 된다.

### LinkedList
배배열은 가장 기본적인 형태의 자료구조며, 구조가 간단하며 사용하기 쉽고 데이터를 읽어오는데 걸리는 시간이 빠르다. 하지만 아래와 같은 단점을 가지고 있다.

> 1. 크기를 변경할 수 없다.
     - 크기를 변경할 수 없으므로 새로운 배열을 생성해서 데이터를 복사해야한다.
     - 실행속도를 향상시키기 위해서는 충분히 큰 크기의 배열을 생성해야 하므로 메모리가 낭비된다.
2. 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸린다.
    - 차례대로 데이터를 추가하고 마지막에서부터 데이터를 삭제하는 것은 빠르지만
    - 배열의 중간에 데이터를 추가하려면, 빈자리를 만들기 위해 다른 데이터들을 복사해서 이동해야한다.

이러한 배열의 단점을 보완하기 위해 링크드 리스트라는 자료구조가 고안되었다. 배열은 연속적인 데이터이지만 링크드 리스트는 불연속적으로 존재하는 데이터를 서로 연결한 형태로 구성되어 있다.

![](https://velog.velcdn.com/images/roberts/post/713323ab-1506-4213-a1da-9e7409d29f37/image.png)

위의 그림을 보면 링크드 리스트는 각 요소들을 자신과 연결된 다음 요소에 대한 참조와 데이터로 구성되어 있다.
링크드 리스트의 데이터 삭제는 삭제하고자 하는 요소의 이전요소가 삭제하고자 하는 요소의 다음요소를 참조하도록 변경하기만 하면 된다. 단 하나의 참조만 변경하면 되므로, 정말 간단하고 처리속도가 빠르다.

![](https://velog.velcdn.com/images/roberts/post/d4584674-0314-4e18-b281-96de22bafda2/image.png)

데이터를 추가할 때는 새로운 요소를 생성 후, 추가하고자 하는 위치의 이전 요소의 참조를 새로운 요소에 대한 참조로 변경해주고, 새로운 요소가 그 다음 요소를 참조하도록 변경하기만 하면 되므로, 처리속도가 빠르다.

![](https://velog.velcdn.com/images/roberts/post/9f7921d7-d09c-4f09-b0d2-826e62b6c15c/image.png)

링크드 리스트는 이동방향이 단방향이기 때문에 다음 요소에 대한 접근은 쉽지만 이전요소에 대한 접근은 어렵다. 이점을 보완한 것이 더블 링크드 리스트다. 더블 링크드 리스트는 단순히 링크드 리스트에 참조변수를 하나 더 추가하여 다음 요소에 대한 참조뿐 아니라 이전 요소에 대한 참조가 가능하도록 했다.

더블 링크드 리스트는 링크드 리스트보다 각 요소에 대한 접근과 이동이 쉽기 때문에 링크드 리스트보다 많아 사용된다.

![](https://velog.velcdn.com/images/roberts/post/ff8ddff7-6a96-44d3-84bf-27b700c27d0f/image.png)

더블 링크드 리스트의 접근성을 보다 향상시킨 것이 더블 써큘러 링크드 리스트이다. 단순히, 더블 링크드 리스트의 첫번째 요소와 마지막 요소를 서로 연결시킨 것이다.

실제로 LinkedList 클래스는 이름과 달리 링크드 리스트가 아닌 더블 링크드 리스트로 구현되어 있다. 이는 링크드 리스트의 단점인 낮은 접근성을 높이기 위한 것이다.

|생성자 또는 메서드|설명|
|------|---|
|LinkedList()|LinkedList 객체를 생성|
|LinkedList(Collection c)|주어진 컬렉션을 포함하는 LinkedList 객체를 생성|
|boolean add(Object o)|지정된 객체(o)를 LinkedList의 끝에 추가. 저장에 성공하면 true, 실패하면 false|
|void add(int index, Object element)|지정된 위치(index)에 객체(element)를 추가|
|boolean addAll(Collection c)|주어진 컬렉션에 포함된 모든 요소를 LinkedList의 끝에 추가한다. 성공하면 true, 실패하면 false|
|boolean addAll(int index, Collection c)|지정된 위치(index)에 주어진 컬렉션에 포함된 모든 요소를 추가. 성공하면 true, 실패하면 false|
|void clear()|LinkedList의 모든 요소 삭제|
|boolean contains(Object o)|지정된 객체가 LinkedList에 포함되어 있는지 알려줌|
|boolean containsAll(Collection c)|지정된 컬렉션의 모든 요소가 포함되어 있는지 알려줌|
|Object get(int index)|지정된 위치(index)의 객체를 반환|
|int indexOf(Object o)|지정된 객체가 저장된 위치(앞에서 몇번째)를 반환|
|boolean isEmpty()|LinkedList가 비어있는지 알려준다. 비어있으면 true|
|Iterator iterator()|Iterator를 반환한다.|
|int lastIndexOf(Object o)|지정된 객체의 위치(index)를 반환 (끝부터 역순으로 검색)|
|ListIterator listIterator()|ListIterator를 반환한다.|
|ListIterator listIterator(int index)|지정된 위치에서부터 시작하는 ListIterator를 반환|
|Object remove(int index)|지정된 위치(index)의 객체를 LinkedList에서 제거|
|boolean remove(Object o)|지정된 객체를 LinkedList에서 제거. 성공하면 true, 실패하면 false|
|boolean removeAll(Collection c)|지정된 컬렉션의 요소와 일치하는 요소를 모두 삭제|
|boolean retainAll(Collection c)|지정된 컬렉션의 모든 요소가 포함되어 있는지 확인|
|Object set(int index, Object element)|지정된 위치(index)의 객체를 주어진 객체로 바꿈|
|int size()|LinkedList에 저장된 객체의 수를 반환|
|List subList(int fromIndex, int toIndex)|LinkedList의 일부를 List로 반환|
|Object[] toArray()|LinkedList에 저장된 객체를 배열로 반환|
|Object[] toArray(Object[] a)|LinkedList에 저장된 객체를 주어진 배열에 저장하여 반환|
|Object element()|LinkedList의 첫 번째 요소를 반환|
|boolean offer(Object o)|지정된 객체(o)를 LinkedList의 끝에 추가. 성고하면 true, 실패하면 false|
|Object peek()|LinkedList의 첫 번째 요소를 반환|
|Object poll()|LinkedList의 첫번째 요소를 반환. LinkedList에서는 제거된다.|
|Object remove()|LinkedList의 첫번째 요소를 제거|
|void addFirst(Object o)|LinkedList의 맨 앞에 객체(o)를 추가|
|void addLast(Object o)|LinkedList의 맨 끝에 객체(o)를 추가|
|Iterator descendingIterator()|역순으로 조회하기 위한 DescendingIterator를 반환|
|Object getFirst()|LinkedList의 첫번째 요소를 반환|
|Object getLast()|LinkedList의 마지막 요소를 반환|
|boolean offerFirst(Object o)|LinkedList의 만 앞에 객체(o)를 추가. 성공하면 true|
|boolean offerLast(Object o)|LinkedList의 맨 끝에 객체(o)를 추가. 성공하면 true|
|Object peekFirst()|LinkedList의 첫번째 요소를 반환|
|Object peekLast()|LinkedList의 마지막 요소를 반환|
|Object pollFirst()|LinkedList의 첫번째 요소를 반환하면서 제거|
|Object pollLast()|LinkedList의 마지막 요소를 반환하면서 제거|
|Object pop()|removeFirst()와 동일|
|void push(Object o)|addFirst()와 동일|
|Object removeFirst()|LinkedList의 첫번째 요소를 제거|
|Object removeLast()|LinkedList의 마지막 요소를 제거|
|boolean removeFirstOccurence(Object o)|LinkedList에서 첫번재로 일치하는 객체를 제거|
|boolean removeLastOccurence(Object o)|LinkedList에서 마지막으로 일치하는 객체를 제거|

> 결론1. 순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다.
결론2. 중간 데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 빠르다.

배열의 경우 만일 인덱스가 n인 원소의 값을 얻어 오고자 한다면 단순히 아래와 같은 수식을 계산하면 된다.

> 인덱스가 n인 데이터의 주소 = 배열의 주소 + n * 데이터 타입의 크기

하지만 LinkedList는 불연속적으로 위치한 각 요소들이 서로 연결된 것이라 처음부터 n번째 데이터까지 차례대로 따라가야만 원하는 값을 얻을 수 있다. 즉, 접근시간이 길어진다.

|컬렉션|접근시간|추가/삭제|비고|
|------|---|---|---|
|ArrayList|빠르다|느리다|순차적인 추가삭제는 빠르다 <br /> 비효율적인 메모리 사용|
|LinkedList|느리다|빠르다|데이터가 많을수록 접근성이 떨어진다.|

#### 스택과 큐의 활용

> 스택의 활용  예 - 수식계산, 수식괄호검사, 워드프로세서의 undo/redo, 웹브라우저의 뒤로/앞으로
큐의 활용 - 최근 사용문서, 앤쇄작업 대기목록, 버퍼

#### PriorityQueue
Queue 인터페이스 구현체중 하나로 저장한 순서에 관계없이 우선순위가 높은 것부터 꺼내게 된다는 특징이 있다. 그리고 null은 저장할 수 없다. null을 저장하게 된다면 NullPointerException이 발생하게 된다.

PriorityQueue는 저장공간으로 배열을 사용하며 각 요소를 힙이라는 자료구조의 형태로 저장한다.

#### Deque
Queue의 변형으로, 한 쪽 끝으로만 추가/삭제할 수 있는 Queue와 달리 Deque는 양쪽 끝에 추가/삭제가 가능하다. 구현체로는 ArrayDeque와 LinkedList가 있다.

![](https://velog.velcdn.com/images/roberts/post/2dc15877-bf74-40e3-9630-2b7a2fc9359f/image.png)

덱은 스택과 큐를 하나로 합쳐놓은 것과 같으며 스택으로 사용할 수 있고 큐로 사용할 수 있다.

|Deque|Queue|Stack|
|------|---|---|
|offerLast()|offer()|push()|
|pollLast()|-|pop()|
|pollFirst()|poll()|-|
|peekFirst()|peek()|-|
|peekLast()|-|peek()|

### Iterator, ListIterator, Enumeration
Iterator, ListIterator, Enumeration은 모두 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스이다. Enumeration은 Iterator의 구번전이고, ListIterator은 Iterator의 기능을 향상시킨것이다.

#### Iterator
컬렉션 프레임워크에서는 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화하였다. 컬렉션에 저장된 각 요소에 접근하는 기능을 가진 Iterator 인터페이스를 정의하였고 Collection 인터페이스에서는 Iterator를 반환하는 iterator()를 정의하고 있다.

``` java
public interface Iterator {
	boolean hasNext();
    Object next();
    void remove();
}

public interface Collection {
	...
    public Iterator iterator();
    ...
}
```

iterator()은 Collection 인터페이스에 정의된 메서드이므로 Collection 인터페이스의 하위 타입인 List와 Set에도 포함되어 있다. 컬렉션 클래스에 대해 iterator()를 호출하여 Iterator르 얻은 다음 반복문을 이용하여 컬렉션 요소를 읽어 올 수 있다.

|메서드|설명|
|------|---|
|boolean hasNext()|읽어 올 요소가 남아있는지 확인한다. 있으면 true, 없으면 false를 반환한다.|
|Object next()|다음 요소를 읽어온다. next()를 호출하기 전에 hasNext()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전하다.|
|void remove()|next()로 읽어 온 요소를 삭제한다. next()를 호출한 다음에 remove()를 호출해야한다. (선택)|

Iterator를 이용해서 컬렉션의 요소를 읽어오는 방법을 표준화했기 때문에 코드의 재사용성을 높이는 것이 가능하다. 이처럼 공통 인터페이스를 정의해서 표준을 정의하고 구현하여 표준을 따르도록 함으로써 코드의 일관성을 유지하여 재사용성을 극대화하는 것이 객체지향의 목적이다.

Map 인터페이스를 구현한 컬렉션 클래스는 키와 값을 쌍으로 저장하고 있기 때문에 iterator()를 직접 호출할 수 없고, 그 대신 keySet()이나 entrySet()과 같은 메서드를 통해서 키와 값을 각각 따로 Set의 형태로 받아온 후 다시 iterator()를 호출해야한다.

#### ListIterator와 Enumeration

> Enumeration: Iterator의 구버전
ListIterator: Iterator에 양방향 조회기능 추가 (List를 구현한 경우에만 사용가능)

아래의 표는 Enumeration 메서드이다. 알아만 두자.

|메서드|설명|
|------|---|
|boolean hasMoreElements()|읽어 올 요소가 남아있는지 확인한다. 있으면 true, 없으면, false를 반환한다. Iterator의 hasNext()와 같다.|
|Object nextElement()|다음 요소를 읽어온다. nextElement()를 호출하기 전에 hasMoreElements()를 호출해서 읽어올 요소가 남아있는지 확인하는 것이 안전하다. Iterator의 next()와 같다.|

아래의 표는 ListIterator 메서드이다.

|메서드|설명|
|------|---|
|void add(Object o)|컬렉션에 새로운 객체(o)를 추가한다. (선택)|
|boolean hasNext()|읽어 올 다음 요소가 남아있는지 확인한다. 있으면 true, 없으면 false를 반환한다.|
|boolean hasPrevious()|읽어 올 이전 요소가 남아있는지 확인한다. 있으면 true, 없으면 false를 반환|
|Object next()|다음 요소를 읽어 온다. next()를 호출하기 전에 hasNext()를 호출해서 <br /> 읽어 올 요소가 있는지 확인하는 것이 안전하다.|
|Object previous()|이전 요소를 읽어온다. previous()를 호출하기 전에 hasPrevious()를 호출해서 <br /> 읽어 올 요소가 있는지 확인하는 것이 안전하다.|
|int nextIndex()|다음 요소의 index를 반환한다.|
|int previousIndex()|이전 요소의 index를 반환한다.|
|void remove()|next() 또는 previous()로 읽어 온 요소를 삭제한다. 반드시 next()나 <br /> previous()를 먼저 호출한 다음에 이 메서드를 호출해야 하는 것은 아니다.|
|void set(Object o)|next() 또는 previous()로 읽어 온 요소를 지정된 객체(o)로 변경한다. <br /> 반드시 next()나 previous()를 먼저 호출한 다음에 이 메서드를 호출해야한다.|