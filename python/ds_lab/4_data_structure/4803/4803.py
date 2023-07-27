import itertools

for case_cnt in itertools.count():
    n, m = map(int, input().split())  # 정점의 개수와 간선의 개수
    cnt = 0  # 트리의 개수

    if n == 0 and m == 0:  # 종료 조건
        break

    graph = [[] for _ in range(n + 1)]  # 그래프

    # 그래프 입력
    for i in range(m):
        a, b = map(int, input().split())
        if a == b:  # 노드가 자기 자신을 가리키는 경우
            graph[a].append(b)
        else:
            graph[a].append(b)
            graph[b].append(a)

    visited = [False] * (n + 1)  # 방문 여부

    # 정점이 n개면 간선이 n-1개이고, 사이클이 없는 트리를 카운트
    # 즉, 탐색하다가 방문했던 정점을 다시 방문하면 사이클이 있는 것
    is_tree = True

    def dfs(v, prev):
        visited[v] = True
        for i in graph[v]:
            if not visited[i]:
                dfs(i, v)
            elif i != prev:
                global is_tree
                is_tree = False
                return

    # 모든 정점에 대해 dfs 수행
    for i in range(1, n + 1):
        if not visited[i]:
            is_tree = True
            dfs(i, 0)
            if is_tree:
                cnt += 1

    print(f"Case {case_cnt + 1}: ", end="")
    if cnt == 1:  # 트리가 1개면
        print("There is one tree.")
    elif cnt > 1:  # 트리가 1개보다 많으면
        print(f"A forest of {cnt} trees.")
    else:  # 트리가 없으면
        print("No trees.")
