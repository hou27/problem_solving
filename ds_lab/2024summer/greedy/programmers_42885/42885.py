def solution(people, limit):
    answer = 0

    people.sort() # 오름차순 정렬
    while people:
        if len(people) == 1:
            answer += 1
            break
        if people[0] + people[-1] <= limit:
            people.pop(0)
            people.pop()
            answer += 1
        else:
            people.pop()
            answer += 1

    return answer

print(solution([70, 50, 80, 50], 100)) # 3
print(solution([70, 80, 50], 100)) # 3