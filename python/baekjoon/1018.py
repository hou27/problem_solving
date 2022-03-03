# 1018 체스판 다시 칠하기

# 8x8의 체스판을 계속해서 검사하는 과정에서 시작점이 되는 부분의 색도 바뀔 수 있으나 그 경우를 배제하고 풀이함. -> 개틀림.

N, M = map(int, input().split())

board = []
repaint = []

for i in range(N):
    board.append(input())

for i in range(N - 7):
    for j in range(M - 7):
        start_with_W = 0
        start_with_B = 0
        for k in range(i, i + 8):
            for l in range(j, j + 8):
                if (k + l) % 2 == 0:
                    if board[k][l] != "W":
                        start_with_W = start_with_W + 1
                    if board[k][l] != "B":
                        start_with_B = start_with_B + 1
                else:
                    if board[k][l] != "B":
                        start_with_W = start_with_W + 1
                    if board[k][l] != "W":
                        start_with_B = start_with_B + 1
        repaint.append(start_with_W)
        repaint.append(start_with_B)

print(min(repaint))
