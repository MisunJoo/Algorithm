package More.baekjoon.DFS;

import java.util.ArrayList;

public class DfsAndBfs_list {
  public static void main(String[] args) throws Exception{
    int n = 3;
    ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
    ArrayList<Integer>[] b = (ArrayList<Integer>[]) new ArrayList[n+1];
    for (int i=1; i<=n; i++) {
      a[i] = new ArrayList<Integer>();
    }
    a[1].add(2);
    a[2].add(3);
  }
}
