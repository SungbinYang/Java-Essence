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

### Arrays
Arrays 클래스에서는 배열을 다루는데 유용한 메서드가 정의되어 있다.

#### 배열의 복사 - copyOf(), copyOfRange()
copyOf()는 배열의 전체를, copyOfRange()는 배열의 일부를 복사해서 새로운 배열을 만들어 반환한다. copyOfRange()에 지정된 범위의 끝은 포함되지 않는다.

#### 배열 채우기 - fill(), setAll()
fill()은 배열의 모든 요소를 지정된 값으로 채운다. setAll()은 배열을 채우는데 사용할 함수형 인터페이스를 매개변수로 받는다. 매개변수 지정은 함수형 인터페이스를 대입한 변수를 넣거나 람다식을 구현하면 좋다.

#### 배열의 정렬과 검색 - sort(), binarySearch()
sort()는 배열을 정렬할 때, 그리고 배열에 저장된 요소를 검색할 때는 binarySearch()를 사용한다. binarySearch()는 배열에서 지정된 값이 저장된 위치를 찾아서 반환하는데 반드시 배열이 정렬된 상태여야 올바른 결과가 나온다.

#### 문자열의 비교와 출력 - equals(), toString()
toString()은 배열의 모든 요소를 문자열로 출력한다. toString()은 일차원 배열에서만 사용이 가능하고 다차원 배열 출력은 deepToString()을 사용해야 한다.

equals()는 두 배열에 저장된 모든 요소를 비교해서 같으면 true, 다르면 false를 반환한다. equals()도 일차원 배열에서만 사용이 가능하고 다차원 배열에서는 deepEquals()를 사용해야 한다.

#### 배열을 List로 변환 - asList(Object... a)
asList()는 배열을 List에 담아서 반환한다. 매개변수가 가변인수라 배열 생성없이 저장할 요소들만 나열하는것도 가능하다.

> ⚠️ 주의
한가지 주의할 점은 asList()가 반환한 List의 크기를 변경할 수 없다. 즉, 추가 또는 삭제가 불가능하다.

#### parallelXXX(), spliterator(), stream()
이 외에도 'parrallel'로 시작하는 이름의 메서드가 있는데 이 메서드들은 보다 빠른 결과를 얻기 위해 여러 쓰레드가 작업을 나누어 처리하도록 한다.

sp;iterator()은 여러 쓰레드가 처리할 수 있게 하나의 작업으로 나누는 Spliterator를 반환한다.

stream()은 컬렉션을 스트림으로 변환한다.

### Comparator와 Comparable
Arrays.sort()는 Character 클래스의 Comparable의 구현에 의해 정렬된다. Comparator와 Comparable은 모두 인터페이스로 컬렉션을 정렬하는데 필요한 메서드를 정의하고 있으며 Comparable을 구현하고 있는 클래스들은 같은 타입의 인스턴스끼리 비교할 수 있는 클래스들을 기본적으로 오름차순으로 정렬한다.

Comparable을 구현한 클래스들이 기본적으로 오름차순으로 정렬되어 있지만 내림차순으로 정렬한다던가 아니면 다른 기준으로 정렬하고 싶을 때 Comparator를 구현해서 정렬기준을 제공한다.

> Comparable 기본 정렬기준을 구현하는데 사용.
Comparator 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용

### HashSet
HashSet은 Set 인터페이스를 구현한 가장 대표적인 컬렉션이다. 특징으로는 HashSet은 중복된 요소를 저장하지 않는다. HashSet은 새로운 요소를 추가할때는 add()나 addAll()를 사용하는데 만약 중복된 요소를 추가할려고 하면 false를 반환한다. 이 특징을 통해 HashSet은 컬렉션 내의 중복요소를 쉽게 제거할 수 있다.

ArrayList와 같이 List인터페이스를 구현한 컬렉션과 달리 HashSet은 저장순서를 유지하지 않으므로 저장순서를 유지해야한다면 LinkedHashSet을 사용한다.

|생성자 또는 메서드|설명|
|------|---|
|HashSet()|HashSet 객체를 생성한다.|
|HashSet(Collection c)|주어진 컬렉션을 포함하는 HashSet 객체를 생성한다.|
|HashSet(int initialCapacity)|주어진 값을 초기용량으로 하는 HashSet 객체를 생성한다.|
|HashSet(int initialCapacity, float loadFactor)|초기 용량과 load factor를 지정하는 생성자.|
|boolean add(Object o)|새로운 객체를 저장한다.|
|boolean addAll(Collection c)|주어진 컬렉션에 저장된 모든 객체들을 추가한다. (합집합)|
|void clear()|저장된 모든 객체를 삭제한다.|
|Object clone()|HashSet을 복제해서 반환한다. (얕은 복사)|
|boolean contains(Object o)|지정된 객체를 포함하고 있는지 알려준다.|
|boolean containsAll(Collection c)|주어진 컬렉션에 저장된 모든 객체들을 포함하고 있는지 알려준다.|
|boolean isEmpty()|HashSet이 비어있는지 알려준다.|
|Iterator iterator()|Iterator를 반환한다.|
|boolean remove(Object o)|지정된 객체를 HashSet에서 삭제한다. <br />(성공하면 true, 실패하면 false)|
|boolean removeAll(Collection c)|주어진 컬렉션에 저장된 모든 객체와 동일한 것들을 HashSet에서 모두 삭제한다. (차집합)|
|boolean retainAll(Collection c)|주어진 컬레션에 저장된 객체와 동일한 것만 남기고 삭제한다. (교집합)|
|int size()|저장된 객체의 개수를 반환한다.|
|Object[] toArray()|저장된 객체들을 객체배열의 형태로 반환한다.|
|Object[] toArray(Objecr[] a)|저장된 객체들을 주어진 객체배열(a)에 담는다.|

여기서 add 메서드는 메서드 안에 자체적으로 equals()와 hashCode()를 이용하여 중복객체인지 확인을 한다. 이 기준을 변경하려면 equals()와 hashCode()를 적절히 오버라이딩하면 된다.

여기서 hashCode()를 오버라이딩하려면 다음 3가지 조건을 만족시켜야 한다.

> 1. 실행중인 애플리케이션 내의 동일한 객체에 대해서 여러번 hashCode()를 호출해도 동일한 int값을 반환해야한다. 하지만 실행시마다 동일한 int값을 반환할 필요는 없다.
2. equlas() 메서드를 이용한 비교에 의해서 true를 얻은 두 객체에 대해 각각 hashCode()를 호출해서 얻은 결과는 반드시 같아야 한다.
3. equals() 메서드를 호출했을 때 false를 반환하는 두 객체는 hashCode() 호출에 대해 같은 int값을 반환하는 경우가 있어도 괜찮지만 해싱을 사용하는 컬렉션의 성능을 향상시키기 위해서는 다른 int값을 반환하는 것이 좋다.

### TreeSet
TreeSet은 이진 검색 트리라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스이다. 이진 검색 트리는 정렬, 검색, 범위검색에 넢은 성능을 보이는 자료구조이며 TreeSet은 이진 검색 트리의 성능을 향상시키는 레드-블랙 트리로 구현되어 있다.

그리고 Set인터페이스로 구현했으므로 중복된 데이터의 저장을 허용하지 않으며 정렬된 위치에 저장하므로 저장순서를 유지하지 않아도 된다.

이진 트리는 링크드리스트처럼 여러개의 노드가 서로 연결된 구조로, 각 노드에 최대 2개의 노드를 연결할 수 있으며, 루트라고 불리는 하나의 노드에서부터 시작해서 계속 확장해 나갈 수 있다.

또한 위 아래로 연결된 두 노드를 부모-자식 관계에 있다고 한다.

![](https://velog.velcdn.com/images/roberts/post/b853c496-0655-49d9-a9e9-49fc61cd31e6/image.png)

이진 트리 동작을 살펴보면 첫번째로 저장되는 값을 루트가 되고 두번째 값은 트리의 루트부터 시작해서 값의 크기를 비교하면서 트리를 따라 내려간다. 작은 값은 왼쪽에 큰 값은 오른쪽에 저장한다.

코드로는 TreeSet에 저장되는 객체가 Comparable을 구현하던가 아니면 Comparator를 제공해서 두 객체를 비교할 방법을 알려줘야 한다.

이처럼 정렬된 상태를 유지하기 때문에 단일 값 검색과 범위검색에 매우 빠르다. 또한 검색효율이 배열에 비해 매우 뛰어나다. 하지만 링크드 리스트에 비해서 데이터의 추가/삭제는 시간이 더 걸린다.

> 이진 검색 트리
- 모든 노드는 최대 2개의 자식노드를 가질 수 있다.
- 왼쪽 자식노드의 값은 부모 노드의 값보다 작고 오른쪽 자식노드의 값은 부모노드의 값보다 커야한다.
- 노드의 추가 삭제에 시간이 걸린다.
- 검색과 정렬에 유리하다.
- 중복된 값을 저장하지 못한다.

|생성자 또는 메서드|설명|
|------|---|
|TreeSet()|기본 생성자|
|TreeSet(Collection c)|주어진 컬렉션을 저장하는 TreeSet 생성|
|TreeSet(Comparator comp)|주어진 정렬조건으로 정렬하는 TreeSet 생성|
|TreeSet(SortedSet s)|주어진 SortedSet을 구현한 컬렉션을 저장하는 TreeSet 생성|
|boolean add(Object o) <br /> boolean addAll(Collection c)|지정된 객체(o) 또는 Collection(c)의 객체들을 Collection에 추가|
|Object ceiling(Object o)|지정된 객체와 같은 객체를 반환 없으면 큰 값을 가지는 객체 중 <br /> 제일 가까운 값의 객체를 반환. 없으면 null|
|void clear()|저장된 모든 객체를 삭제|
|Object clone()|TreeSet을 복제하여 반환한다.|
|Comparator comparator()|TreeSet의 정렬기준(Comparator)를 반환한다.|
|boolean contains(Object o) <br /> boolean containsAll(Collection c)|지정된 객체(o) 또는 Collection의 <br /> 객체들이 포함되어 있는지 확인한다.|
|NavigableSet descendingSet()|TreeSet에 저장된 요소들을 역순으로 정렬해서 반환한다.|
|Object first()|정렬된 순서에서 첫번째 객체를 반환한다.|
|Object floor(Object o)|지정된 객체와 같은 객체를 반환. 없으면 작은 값을 가진 객체 중에서 <br /> 제일 가까운 값의 객체를 반환. 없으면 null|
|SortedSet headSet(Object toElement)|지정된 객체보다 작은 값의 객체를 반환한다.|
|NavigableSet headSet(Object toElement, boolean inclusice)|지정된 객체보다 작은 값의 객체들을 반환 <br /> inclusive가 true이면 같은 값의 객체도 포함|
|Object higher(Object o)|지정된 객체보다 큰 값을 가진 객체 중 제일 가까운 값의 객체를 반환, 없으면 null|
|boolean isEmpty()|TreeSet이 비어있는지 확인한다.|
|Iterator iterator()|TreeSet의 Iterator를 반환한다.|
|Object last()|정렬된 순서에서 마지막 객체를 반환한다.|
|Object lower(Object o)|지정된 객체보다 작은 값을 가진 객체 중 제일 가까운 값의 객체를 반환. 없으면 null|
|Object pollFirst()|TreeSet의 첫번째 요소(제일 작은 값의 객체)를 반환|
|Object pollLast()|TreeSet의 마지막 번째 요소(제일 큰 값의 객체)를 반환|
|boolean retainAll(Collection c)|주어진 컬렉션과 공통된 요소만을 남기고 삭제한다. <br /> (교집합)|
|int size()|저장된 객체의 개수를 반환한다.|
|Spliterator spliterator()|TreeSet의 spliterator를 반환|
|SortedSet subSet(Object fromElement, Object toElement)|범위 검색(fromElement와 toElement사이)의 결과를 반환한다.(끝 범위인 toElement는 범위에 포함되지 않음)|
|NavigableSet< E > subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)|범위 검색(fromElement와 toElement사이)의 결과를 반환한다. (fromInclusice가 true면 시작 값이 포함되고, toInclusive가 true면 끝값이 포함된다.)|
|SortedSet tailSet(Object fromElement)|지정된 객체보다 큰 값의 객체들을 반환한다.|
|Object[] toArray()|저장된 객체를 객체배열로 반환한다.|
|Object[] toArray(Object[] a)|저장된 객체를 주어진 객체배열에 저장하여 반환한다.|

### HashMap과 Hashtable
Hashtable과 HashMap의 관계는 Vector와 ArrayList의 관계와 같다. 즉, Hashtable보다는 HashMap을 사용할 것을 권한다.

HashMap은 Map을 구현했으므로 키와 값을 묶어서 하나의 데이터로 저장한다는 특징을 갖는다. 그리고 해싱을 사용해서 많은 양의 데이터를 검색하는데 있어서 뛰어난 성능을 보인다. 아래의 코드는 HashMap의 구현코드이다.

``` java
public class HashMap extends AbstractMap implements Map, Cloneable, Serializable {
	transient Entry[] table;
    
    static class Entry implements Map.Entry {
    	final Object key;
        Object value;
    }
}
```

HashMap은 키와 값을 각각 Object타입으로 저장한다. 즉, 키와 값의 타입을 Object형태로 저장할 수 있어서 어떤 객체든 저장할 수 있지만 주로 String을 대문자 또는 소문자형태로 통일하여 사용한다.

> 키(key) : 컬렉션 내의 키중에서 유일해야 한다.
값(value) : 키와 달리 데이터의 중복을 허용한다.

키는 저장된 값을 찾는데 사용되는 것이기 때문에 컬렉션 내에서 유일해야한다.

|생성자 / 메서드|설명|
|------|---|
|HashMap()|HashMap 객체를 생성|
|HashMap(int initialCapacity)|지정된 값을 초기용량으로 하는 HashMap 객체를 생성|
|HashMap(int initialCapacity, float loadFactor)|지정된 초기용량과 load factor의 HashMap 객체를 생성|
|HashMap(Map m)|지정된 Map의 모든 요소를 포함하는 HashMap 생성|
|void clear()|HashMap에 저장된 모든 객체를 제거|
|Object clone()|현재 HashMap을 복제해서 반환|
|boolean containsKey(Object key)|HashMap에 지정된 키가 포함되어 있는지 알려준다. <br /> (포함되어 있으면 true)|
|boolean containsValue(Object value)|HashMap에 지정된 값이 포함되어 있는지 알려준다. <br /> (포함되어 있으면 true)|
|Set entrySet()|HashMap에 저장된 키와 값을 엔트리(키와 값의 결합)의 형태로 Set에 저장해서 반환|
|Object get(Object key)|지정된 키의 값(객체)을 반환 못찾으면 null|
|Object getOrDefault(Object key, Object defaultValue)|지정된 키의 값(객체)를 반환한다. 키를 못찾으면 기본값(defaultValue)로 지정된 객체를 반환한다.|
|boolean isEmpty()|HashMap이 비어있는지 알려준다.|
|Set keySet()|HashMap에 저장된 모든 키가 저장된 Set을 반환|
|Object put(Object key, Object value)|지정된 키와 값을 HashMap에 저장|
|void putAll(Map m)|Map에 저장된 모든 요소를 HashMap에 저장|
|Object remove(Object key)|HashMap에서 지정된 키로 저장된 값(객체)를 제거|
|Object replace(Object key, Object oldValue, Object newValue)|지정된 키와 값을 지정된 객체(value)로 대체|
|boolean replace(Object key, Object oldValue, Object newValue)|지정된 키와 객체(oldValue)가 모두 일치하는 경우에만 새로운 객체(newValue)로 대체|
|int size()|HashMap에 저장된 요소의 개수를 반환|
|Collection values()|HashMap에 저장된 모든 값을 컬렉션의 형태로 반환|

#### 해싱과 해시함수
해싱이란 해시함수를 이용해서 데이터를 해시테이블에 저장하고 검색하는 기법을 말한다. 이 기법을 사용하면 다량의 데이터 중에서도 원하는 데이터를 빠르게 찾을 수 있다. 해싱을 구현한 컬렉션 클래스로는 HashSet, HashMap, Hashtable등이 있다. 여기서 Hashtable은 HashMap으로 대체되었으므로 왠만하면 HashMap을 사용하는 것이 좋다.

해싱에서 사용하는 자료구조는 아래 그림과 같이 배열과 링크드리스트 조합으로 되어 있다.

![](https://velog.velcdn.com/images/roberts/post/e4f1c07e-d829-41d0-a3db-59371b25df13/image.png)

저장할 데이터의 키를 해시함수에 넣으면 배열의 한 요소를 얻게 되고, 다시 그곳에 연결되어 있는 링크드 리스트에 저장되게 된다.

> 1. 검색하고자 하는 값의 키로 해시함수를 호출한다.
2. 해시함수의 계산결과로 해당 값이 저장되어 있는 링크드 리스트를 찾는다.
3. 링크드 리스트에서 검색한 키와 일치하는 데이터를 찾는다.

### TreeMap
TreeMap은 이진검색트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 저장한다. 그래서 검색과 정렬에 적합한 컬렉션 클래스이다.

여기서 HashMap과 비교를 할 수 있는데 검색에 관련한것은 TreeMap보단 HashMap이 더 뛰어나다. 하지만 범위검색이나 정렬이 필요한 것은 TreeMap을 사용하는 것이 좋다.

|메서드|설명|
|------|---|
|TreeMap()|TreeMap 객체를 생성|
|TreeMap(Comparator c)|지정된 Comparator를 기준으로 정렬하는 TreeMap 객체 생성|
|TreeMap(Map m)|주어진 Map에 저장된 요소를 포함하는 TreeMap 생성|
|TreeMap(SortedMap m)|주어진 SortedMap에 저장된 모든 요소를 포함하는 TreeMap 생성|
|Map.Entry ceilingEntry(Object key)|지정된 key와 일치하거나 큰 것중 제일 작은 것의 키와 값의 쌍(Map.Entry)을 반환. 없으면 null|
|Object ceilingKey(Object key)|지정된 key와 일치하거나 큰 것중 제일 작은 것의 키를 반환 없으면 null을 반환|
|void clear()|TreeMap에 저장된 모든 객체를 제거|
|Object clone()|현재 TreeMap을 복제해서 반환|
|Comparator comparator()|TreeMap의 정렬기준이 되는 Comparator를 반환 <br /> Comparator가 지정되지 않았다면 null|
|boolean containsKey(Object key)|TreeMap에 지정된 키가 포함되었는지 알려줌 <br /> (포함되어 있으면 true)|
|boolean containsValue(Object value)|TreeMap에 지정된 값이 포함되어 있는지 알려줌 <br /> (포함되어 있으면 true)|
|NavigableSet descendingKeySet()|TreeMap에 저장된 키를 역순으로 정렬해서 NavigableSet에 담아서 반환|
|Set entrySet()|TreeMap에 저장된 키와 값을 엔트리 형태로 Set에 저장해서 반환|
|Map.Entry firstEntry()|TreeMap에 저장된 첫번째(가장 작은) 키와 값의 쌍을 반환|
|Object firstKey()|TreeMap에 저장된 첫번째(가장 작은) 키를 반환|
|Map.Entry floorEntry(Object key)|지정된 key와 일치하거나 작은 것중에서 제일 큰 키의 쌍(Map.Entry)를 반환. 없으면 null|
|Object floorKey(Object key)|지정된 key와 일치하거나 작은 것 중에서 제일 큰 키를 반환. 없으면 null 반환|
|Object get(Object key)|지정된 키의 값을 반환|
|SortedMap headMap(Object toKey)|TreeMap에 저장된 첫번째 요소부터 지정된 범위에 속한 모든 요소가 담긴 SortedMap을 반환(toKey는 미포함)|
|Navigable headMap(Object toKey, boolean inclusive)|TreeMap에 저장된 첫번째 요소부터 지정된 범위에 속한 모든 요소가 담긴 SortedMap을 반환. inclusive의 값이 true면 toKey도 포함|
|Map.Entry higherEntry(Object key)|지정된 key보다 큰 키중에서 제일 작은 키의 쌍(Map.Entry)을 반환. 없으면 null|
|Object higherKey(Object key)|지정돤 key보다 큰 키중에서 제일 작은 키의 쌍(Map.Entry)를 반환. 없으면 null|
|boolean isEmpty()|TreeMap이 비어있는지 확인한다.|
|Set keySet()|TreeMap에 저장된 모든 키가 저장돤 Set을 반환|
|Map.Entry lastEntry()|TreeMap에 저장된 마지막 키(가장 큰 키)의 쌍을 반환|
|Object lastEntry()|TreeMap에 저장된 마지막 키(가장 큰 키)를 반환|
|Map.Entry lowerEntry(Object key)|지정된 key보다 작은 키중에서 제일 큰 키의 쌍(Map.Entry)를 반환, 없으면 null|
|Object lowerEntry(Object key)|지정된 key보다 작은 키중에서 제일 큰 키를 반화느 없으면 null|
|NavigableSet navigableKeySet()|TreeMap에 모든 키가 담긴 NavigableSet을 반환|
|Map.Entry pollFirstEntry()|TreeMap의 제일 작은 키를 제거하면서 반환|
|Map.Entry pollLastEntry()|TreeMap의 제일 큰 키를 제거하면서 반환|
|Object put(Object key, Object value)|지정된 키와 값을 TreeMap에 저장|
|void putAll()|Map에 저장된 모든 요소를 TreeMapdp wjwkd|
|Object remove(Object key)|TreeMap에서 지정된 키로 저장된 값을 제거|
|Object replace(Object k, Object v)|기존의 키(k)의 값을 지정된 값(v)로 변경|
|boolean replace(Object key, Object oldValue, Object newValue)|기존의 키(key)의 값을 새로운 값(newValue)로 변경 <br /> 단, 기존의 값과 지정된 값(oldValue)가 일치해야함|
|int size()|TreeMap에 저장된 요소의 개수를 반환|
|NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive)|지정된 두개의 키 사이에 있는 모든 요소들이 담긴 NavagableMap을 반환. fromInclusive가 true면 범위에 fromKey를 포함 toInclusive가 true면 범위에 toKey 포함|
|SortedMap subMap(Object fromKey, Object toKey)|지정된 두개의 키 사이에 있는 모든 요소들이 담긴 SortedMap을 반환(toKey는 포함되지 않는다.)|
|SortedMap tailMap(Object fromKey)|지정된 키부터 마지막 요소의 범위에 속한 요소가 담긴 SortedMap을 반환|
|NavigableMap tailMap(Object fromKey, boolean inclusive)|지정된 키로부터 마지막 요소의 범위에 속한 요소가 담긴 NavigableMap을 반환. inclusive가 true면 fromKey 포함|
|Collection values()|TreeMap에 저장된 모든 값을 컬렉션의 형태로 반환|

### Properties
Properties는 HashMap의 구버전인 Hashtable을 상속받아 구현한 것으로 (String, String)의 형태로 저장하는 보다 단순화된 컬렉션 클래스이다.

주로 애플리케이션의 환경설정과 관련된 속성을 저장하는데 사용되며 데이터를 파일로부터 읽고 쓰는 편리한 기능을 제공한다.

|메서드|설명|
|------|---|
|Properties()|Properties 객체를 생성한다.|
|Properties(Properties defaults)|지정된 Properties에 저장된 목록을 가진 Properties 객체를 생성한다.|
|String getProperty(String key)|지정된 키의 값을 반환한다.|
|String getProperty(String key, String defaultValue)|지정된 키의 값을 반환한다. 키를 못 찾으면 defaultValue를 반환한다.|
|void list(PrintStream out)|지정된 PrintStream에 저장된 목록을 출력한다.|
|void list(PrintWriter out)|지정된 PrintWriter에 저장된 목록을 출력한다.|
|void load(InputStream inStream)|지정된 InputStream으로부터 목록을 읽어서 저장한다.|
|void load(Reader reader)|지정된 Reader으로부터 목록을 읽어서 저장한다.|
|void loadFromXML(InputStream in)|지정된 InputStream으로부터 XML문서를 읽어서, XML문서에 저장된 목록을 읽어다 담는다. (load & store)|
|Enumeration propertyNames()|목록의 모든 키가 담긴 Enumeration을 반환한다.|
|void save(OutputStream out, String header)|deprecated되었으므로 store()를 사용한다.|
|Object setProperty(String key, String value)|지정된 키와 값을 저장한다. 이미 존재하는 키면 새로운 값으로 바뀐다.|
|void store(OutputStream out, String comments)|저장된 목록을 지정된 OutputStream에 출력(저장)한다. comments는 목록에 대한 설명(주석)으로 저장된다.|
|void store(Writer writer, String comments)|저장된 목록을 지정된 Writer에 출력(저장)한다. comments는 목록에 대한 설명(주석)으로 저장된다.|
|void storeToXML(OutputStream os, String comment)|저장된 목록을 지정된 출력스트림에 XML문서로 출력(저장)한다. comment는 목록에 대한 설명(주석)으로 저장된다.|
|void storeToXML(OutputStream os, String comment, String encoding)|저장된 목록을 지정된 출력 스트림에 해당 인코딩의 XML문서로 출력(저장)한다. comment는 목록에 대한 설명(주석)으로 저장된다.|
|Set stringPropertyNames()|Properties에 저장되어 있는 모든 키를 Set에 담아서 반환한다.|