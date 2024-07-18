def solution(number, k):
    number = list(map(int, number))
    
    answer = ''
    db = []
    for i in range(len(number)):
        while db and k > 0 and db[-1] < number[i]:
            db.pop()
            k -= 1
        db.append(number[i])

    while k > 0:
        db.pop()
        k -= 1

    for i in db:
        answer += str(i)

    return answer

print(solution("1924", 2)) # "94"
print(solution("1231234", 3)) # "3234"
print(solution("4177252841", 4)) # "775841"