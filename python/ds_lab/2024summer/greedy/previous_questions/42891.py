def solution(food_times: list, k):
    answer = 0
    maxIdx = len(food_times) - 1
    if sum(food_times) <= k:
        return -1
    
    while k > 0:
        decreaseCnt = maxIdx + 1 - food_times.count(0)
        if k < decreaseCnt:
            break
        k -= decreaseCnt
        for i in range(maxIdx + 1):
            if food_times[i] > 0:
                food_times[i] -= 1
    
    idx = 0
    for i in range(maxIdx + 1):
        if k == 0:
            break
        if food_times[i] > 0:
            food_times[i] -= 1
            k -= 1
        idx += 1
        
    while food_times[idx] == 0:
        idx += 1
        idx = idx if idx <= maxIdx else 0
    
    return answer + idx + 1


print(solution([3, 1, 2], 5))
# food_times=[4,2,3,6,7,1,5,8] k=16 answer = 3
# food_times=[4,2,3,6,7,1,5,8] k=27 answer = 5
print(solution([4, 2, 3, 6, 7, 1, 5, 8], 16))
print(solution([4, 2, 3, 6, 7, 1, 5, 8], 27))
print(solution([1], 3))