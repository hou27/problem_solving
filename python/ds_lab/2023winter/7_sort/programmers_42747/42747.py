def solution(citations):
    answer = 0

    citations.sort(reverse=True)

    for i in range(citations.__len__()):
        if citations[i] >= i + 1:  # h번 이상 인용된 논문이 h편 이상인지 확인
            answer = i + 1  # h의 최댓값으로 갱신
        else:
            break

    return answer


print(solution([3, 0, 6, 1, 5]))
print(solution([0, 0, 0, 0, 0]))
