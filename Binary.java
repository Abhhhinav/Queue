package Queue;

import java.util.*;

public class Binary {
  static ArrayList<String> generate(int N) {
    ArrayList<String> list = new ArrayList<>();
    Queue<String> q = new LinkedList<String>();
    q.add("1");
    for (int i = 1; i <= N; i++) {
      String s1 = q.remove();
      list.add(s1);
      q.add(s1 + "0");
      q.add(s1 + "1");
    }
    return list;
  }

  public static void main(String[] args) {
    int N = 5;
    System.out.println(generate(N));
  }
}
