import sys

input = sys.stdin.readline

def dfs(graph, v):
    visited = [False] * (N + 1)
    stack = [v]
    visited[v] = True

    while stack:
        v = stack.pop()
        visited[v] = True
        print(v, end=' ')
        graph[v].sort(reverse=True) # 문제 조건에 따라 작은 수부터 방문하기 위해
        for i in graph[v]:
            if not visited[i]:
                # stack 내에 i가 있다면 제거하고 추가
                if i in stack:
                    stack.remove(i)
                stack.append(i)

def bfs(graph, v):
    visited = [False] * (N + 1)
    queue = [v]
    visited[v] = True

    while queue:
        v = queue.pop(0)
        print(v, end=' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

N, M, V = map(int, input().split())

graph = [[] for _ in range(N + 1)] # 1 ~ N (0번은 사용하지 않음)

for _ in range(M):
    v1, v2 = map(int, input().split())
    graph[v1].append(v2)
    graph[v2].append(v1)

for i in range(1, N + 1):
    graph[i].sort()

dfs(graph, V)
print()
bfs(graph, V)
print()