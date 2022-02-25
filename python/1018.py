# 1018 체스판 다시 칠하기

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
