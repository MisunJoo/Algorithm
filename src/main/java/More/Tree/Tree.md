# 트리 (Tree) 🌴

### 트리의 표현

- 트리는 그래프이기 때문에 그래프와 같은 방식으로 저장

- 인접행렬로 표현하는 것은 비효율적

- **인접 리스트**로 표현한다

- 트리는 모든 노드의 **부모(0, 1)의 넘버를 저장하는 방식**으로 저장 

  - => 어떤 노드의 부모를 바로 찾을 수 있음 O(1)
  - => 자식을 찾는 것은 다 순회 해야함

- 이진트리

  - 배열로 표현 가능

    ```java
    		x
    	/   \
    2x		2x + 1
    ```

    ```
    			i
    		/ 	\
    A[i][0] A[i][1]
    ```

    ! 트리의 자식의 개수가 고정되어있는 경우에만 사용
