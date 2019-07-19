##### ** 저에게 필요한 내용만 정리합니다.

# 그래프

- 경로를 찾는 문제 : 그래프로 모델링을 다시!
- 주로 최단 경로를 찾음. 빠른길
- 차수 : 정점과 연결되어 있는 간선의 개수

## 그래프를 검색하는 방법 (BFS, DFS)

#### DFS

- Stack 을 이용하여 구현
  - 시작할 노드를 stack에 넣고, 해당 child노드를 모두 스택에 넣는다.
  - 한 번 스택에 담았던 노드는 다시 넣지 않는다.
  - 재귀함수를 이용하면 좋음
    - 일단 노드를 방문하면 출력하고, 자식노드를 호출
- dfs(x) : x를 방문

## #### BFS

```java
void dfs(int x) {
  check[x] = true;
  printf("%d ", x);
  for (int i = 0; i <a[x].size(); i++) {
    int y = a[x][i];
    if(check[y] == false) {
      dfs(y);
    }
  }
}
```
- Queue를 이용하여 구현
  - 시작할 노드를 queue에 넣고, 해당 child노드를 모두 큐에 넣는다.
  - 한 번 큐에 담았던 노드는 다시 넣지 않는다.
- Queue에 넣을 때 방문했다고 체크한다.

```java
queue<int> q;
check[1] = true; 
q.push(1);

while (!q.empty()) {
  int x = q.front(); 
  q.pop();
  printf("%d", x);
  
  //a[x]와 연결된 정점을 검사하고 queue에 넣어줌 (큐에 들어가면 방문한거임)
  //하나 검사 다하면 그다음 a[x]와 연결된 접점들에대하여 검사할거임
  for (int i=0; i<a[x].size(); i++){
    int y = a[x][i]; //a[x]와 연결된 접점 (인접 리스트니까 무조건 있고)
    if (check[y] == false) { //방문 안했으면
      check[y] = true; //방문했다고 표시해주고
      q.push(y);
    }
    
}
}
```

