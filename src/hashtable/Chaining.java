package hashtable;

public class Chaining<K, V> {
  // 인스턴스 변수
  private int M = 13;
  private Node[] a = new Node[M];

  // 정적 중첩 클래스
  public static class Node {
    // 인스턴스 변수
    private Object key;
    private Object data;
    private Node next;

    // 생성자
    public Node(Object newKey, Object newData, Node ref) {
      this.key = newKey;
      this.data = newData;
      this.next = ref;
    }

    // getter
    public Object getKey() {
      return key;
    }

    public Object getData() {
      return data;
    }
  }

  // 메서드
  private int hash(K key) {
    return (key.hashCode() & 0x7fffffff) % M;
  }

  public V get(K key) {
    int index = hash(key);
    for (Node x = a[index]; x != null; x = x.next) {
      if (key.equals(x.key)) {
        return (V) x.data;
      }
    }
    return null;
  }

  public void put(K key, V data) {
    int index = hash(key);
    for (Node x = a[index]; x != null; x = x.next) {
      if (key.equals(x.key)) {
        x.data = data;
        return ;
      }
    }
    a[index] = new Node(key, data, a[index]);
  }

  public void printHash() {
    for (int i = 0; i < M; i++) {
      System.out.print(i);
      if (a[i] == null) {
        System.out.println();
        continue;
      }
      while (a[i] != null) {
        System.out.print("-->");
        System.out.print("[" + a[i].getKey() + ", " + a[i].getData() + "]");
        a[i] = a[i].next;
      }
      System.out.println();
    }
  }

  @Override
  public String toString() {
    String str = "";
    for (int i = 0; i < a.length; i++) {
      str += i;
      for (Node x = a[i] ; x != null ; x = x.next) {
        str += "-->[" + x.key + ", " + x.data + "]";
      }
      str += "\n";
    }
    return str;
  }
}
