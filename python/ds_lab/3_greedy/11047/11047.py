N, K = map(int, input().split())
coins = [int(input()) for _ in range(N)] # 개수만큼 코인 입력받음(오름차순)

cnt = 0 # 필요한 동전 개수 초기화

while K: # K가 0이 될 때까지
    coin = coins.pop() # 큰 코인부터 계산
    if K >= coin: # K가 코인보다 크면
        cur_cnt = K // coin # 현재 코인 사용 가능 개수
        K -= cur_cnt * coin # 현재 코인 사용 후 남은 K
        cnt += cur_cnt # 필요한 동전 개수에 더해줌
    else:
        continue

print(cnt)