def custom_key(x):
    x_str = str(x)

    return (x_str * 4)[:4]  # 4자리수로 맞추기 위해 4번 반복 후 4자리만 반환


def solution(numbers):
    answer = ""
    order = [[] for _ in range(10)]
    for number in numbers:
        order[int(str(number)[0])].append(number)  # 첫번째 자리수를 기준으로 정렬

    for i in range(10):
        if order[i].__len__() > 1:
            order[i].sort(reverse=True, key=custom_key)

    for i in range(9, -1, -1):
        for j in range(order[i].__len__()):
            answer += str(order[i][j])

    if answer[0] == "0":
        answer = "0"

    return answer


print(solution([6, 10, 2]))
print(solution([3, 30, 34, 5, 9]))
print(solution([1, 10, 100, 1000, 818, 81, 898, 89, 0, 0]))
print(solution([555, 565, 566, 55, 56, 5, 54, 544, 549]))
