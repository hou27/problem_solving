T = int(input())

ans = [0, 1, 1]  # 0 ~ 2번째 항까지는 미리 구해놓음

for _ in range(T):
    N = int(input())

    if N < len(ans):
        print(ans[N])
        continue

    for i in range(len(ans), N + 1):
        ans.append(ans[i - 3] + ans[i - 2])  # 전전 항 + 전 항 = 현재 항

    print(ans[N])
