def bfs(graph, start):
    queue = [start]
    visited = [False] * (len(graph) + 1)
    visited[start] = True
    passed_nodes = [1, *graph[1]]  # 지나온 노드 체크용
    result = [graph[1]]  # 각 depth별 노드 저장
    current_depth_nodes = []  # 현재 depth의 노드 저장

    while queue:
        v = queue.pop(0)

        if v not in passed_nodes:  # 지나온 노드가 아니면
            passed_nodes += current_depth_nodes  # 새로운 거리의 노드들이었던 것을 지나온 노드로 추가
            result.append(current_depth_nodes)  # 방금까지 탐색한 거리의 노드들을 해당 depth로 result에 추가
            current_depth_nodes = []  # 현재 depth의 노드들 초기화

        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True
                if i not in passed_nodes:  # 지나온 노드가 아니면
                    current_depth_nodes.append(i)  # 현재 depth의 노드들에 추가

    return result


def solution(n, edge):
    answer = 0
    graph = [[] for _ in range(n + 1)]

    for e in edge:
        graph[e[0]].append(e[1])
        graph[e[1]].append(e[0])

    result = bfs(graph, 1)

    # print(result)
    answer = len(result[-1])  # 가장 마지막 depth의 노드 개수(가장 1번 노드와 먼 노드 개수)

    return answer


print(solution(6, [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]))
