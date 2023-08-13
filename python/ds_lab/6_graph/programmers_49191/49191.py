# dfs로 다른 선수들과의 관계 탐색
def dfs(players, node, visited, flag):
    for i in players[node][flag]:
        if not visited[i]:
            visited[i] = True
            dfs(players, i, visited, flag)


def solution(n, results):
    players = [[[], []] for _ in range(n + 1)]

    # 각 선수들의 승패 관계 저장
    for result in results:
        players[result[0]][1].append(result[1])
        players[result[1]][0].append(result[0])

    answer = 0
    for i in range(1, n + 1):
        visited_0 = [False] * (n + 1)  # 내가 이긴 상대 탐색용
        visited_1 = [False] * (n + 1)  # 내가 진 상대 탐색용

        dfs(players, i, visited_0, 0)
        dfs(players, i, visited_1, 1)

        visited = visited_0 + visited_1  # 내가 이긴 상대 + 내가 진 상대
        cnt = visited.count(True)
        if cnt == n - 1:  # 나와의 관계가 정의된 선수들의 수가 n - 1이면 순위를 알 수 있음
            answer += 1

    return answer
