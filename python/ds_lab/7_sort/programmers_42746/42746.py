def solution(numbers):
    answer = ""
    order = [[] for _ in range(10)]
    for number in numbers:
        order[int(str(number)[0])].append(number)  # 첫번째 자리수를 기준으로 정렬
    for i in range(10):
        if order[i].__len__() > 1:
            order[i].sort(reverse=True)
            if order[i][-2] == int(str(i) + "0"):
                order[i][-2], order[i][-1] = order[i][-1], order[i][-2]

    for i in range(9, -1, -1):
        for j in range(order[i].__len__()):
            answer += str(order[i][j])

    return answer


print(solution([6, 10, 2]))
print(solution([3, 30, 34, 5, 9]))
print(solution([1, 10, 100, 1000, 818, 81, 898, 89, 0, 0]))
