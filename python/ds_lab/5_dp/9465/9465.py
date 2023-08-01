import sys

input = sys.stdin.readline

T = int(input())
for _ in range(T):
    n = int(input())

    sticker = [2 * list(map(int, input().split())) for _ in range(2)]
    dp = [[0] * (n + 1) for _ in range(2)]
    # 첫번째 열 둘 중 하나는 무조건 선택하게 되어있음
    dp[0][1] = sticker[0][0]
    dp[1][1] = sticker[1][0]

    if n == 1:
        print(max(dp[0][1], dp[1][1]))
        continue

    # case 1(한 칸 건너뛰기)
    # 10 + 40 + 10 + 50 + 100 + 20 + 40 = 270
    # case 2(한 칸 건너뛰기)
    # 20 + 30 + 30 + 50 + 60 + 20 + 80 = 290
    # case 3(두 칸 건너뛰기)
    # 10 + 40 + 10 + 50 + 20 + 40 = 170
    # case 4(두 칸 건너뛰기)
    # 20 + 30 + 30 + 50 + 20 + 40 = 190

    # 즉, 대각선으로 한 칸 또는 두 칸 뛰는 경우를 고려해야 한다.
    # 세 칸 이상 뛰는 건 의미가 없다.

    # 가장 좌측에서 시작해서 특정 칸의 스티커를 떼는 시점에서의 점수의 최댓값을 구해가자.
    for i in range(2, n + 1):
        dp[0][i] = (
            max(dp[1][i - 1], dp[1][i - 2]) + sticker[0][i - 1]
        )  # sticker list는 0부터 시작하므로 i - 1
        dp[1][i] = max(dp[0][i - 1], dp[0][i - 2]) + sticker[1][i - 1]

    print(max(dp[0][n], dp[1][n]))
