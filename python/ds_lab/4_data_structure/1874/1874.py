n = int(input())

# 초기 설정
nums = 2 # 1은 무조건 들어가니까 2부터 시작
tmp = [1] # stack
ans = ['+'] # 결과

for _ in range(n):
    goal = int(input()) # 복잡도를 줄이기 위해 매 반복마다 목표를 입력받음

    while nums <= goal: # 목표가 될 때까지
        tmp.append(nums) # 스택에 추가
        nums += 1
        ans.append('+') # 결과에 추가
    
    if tmp[-1] == goal: # 목표가 스택의 마지막 값과 같다면
        tmp.pop() # 스택에서 제거
        ans.append('-') # 결과에 추가
    else: # 목표가 스택의 마지막 값과 다르다면
        print('NO') # 불가능이므로 NO 출력 후 종료
        exit(0)

for e in ans:
    print(e)