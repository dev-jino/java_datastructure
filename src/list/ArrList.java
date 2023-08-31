package list;

public class ArrList <E> {
  // 인스턴스 변수
  private E a[]; // = private E[] a;
  private int size;

  // 생성자
  public ArrList() {
    a = (E[]) new Object[1];
    size = 0;
  }

  // 연산 메서드
  public int size() {
    return this.size;
  }

  public E get(int i) {
    if (i < 0 || i >= size || size == 0) {
      throw new IndexOutOfBoundsException();
    }
    return a[i];
  }

  public boolean add(E e) {
    if (a.length == size) {
//      throw new ArrayIndexOutOfBoundsException();
      resize(a.length * 2);
    }
    a[size++] = e;
    return true;
  }

  public boolean add(int index, E e) {
    if (a.length == size) {
//      throw new ArrayIndexOutOfBoundsException();
      resize(a.length * 2);
    }

    if (index <= size - 1) {
      for (int i = size - 1 ; i >= index; i--) {
        a[i + 1] = a[i];
      }
    }

    a[index] = e;
    size++;
    return true;
  }

  public E remove() { // removeLast
    if (size == 0) {
      throw new IndexOutOfBoundsException();
    }

    E toBeDeleted = a[size - 1];
    a[size - 1] = null;
    size--;

    if (size > 0 && a.length / 4 == size) {
      resize(a.length / 2);
    }

    return toBeDeleted;
  }

  public E remove(int index) {
    if (size == 0) {
      throw new IndexOutOfBoundsException();
    }

    E toBeDeleted = a[index];

    for (int i = index + 1; i < size; i++) {
      a[i - 1] = a[i];
    }

    a[size - 1] = null;

    size--;

    if (size > 0 && a.length / 4 == size) {
      resize(a.length / 2);
    }

    return toBeDeleted;
  }

  private void resize(int newSize) {
    System.out.println("resize가 호출됨(" + newSize + ")");
    E[] t = (E[]) new Object[newSize];
    for (int i = 0; i < size; i++) {
      t[i] = a[i];
    }
    a = t;
  }

  public <E> int indexOf(E e) {
    int index = -1;
    for (int i = 0; i < a.length; i++) {
      if (e == a[i]) {
        index = i;
        break;
      }
    }
    return index;
  }
}
