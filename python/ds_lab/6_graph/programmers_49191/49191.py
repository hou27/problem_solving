def solution(n, results):
    players = [[[], []] for _ in range(n + 1)]
    answer = 0
    for result in results:
        players[result[0]][0].append(result[1])
        players[result[1]][1].append(result[0])

    for i in range(1, n + 1):
        for j in players[i][0]:
            players[j][1] += players[i][1]
        for j in players[i][1]:
            players[j][0] += players[i][0]

    for i in range(1, n + 1):
        players[i][0] = set(players[i][0])
        players[i][1] = set(players[i][1])

        if len(players[i][0]) + len(players[i][1]) == n - 1:
            answer += 1

    return answer


print(solution(5, [[4, 3], [4, 2], [3, 2], [1, 2], [2, 5]]))
