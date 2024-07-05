N, M = map(int, input().split())

# if N < 3 or M < 3:
#     print(-1)
#     exit()

metrixA = [[int(value) for value in list(input())] for _ in range(N)]
metrixB = [[int(value) for value in list(input())] for _ in range(N)]

# print(metrixA)
# def checkLeftLine(row, col):
#     global matrixA, matrixB
#     flag = 0 # 0 : 바꿀 필요 없음 1 : 바꿔야 함
#     for i in range(3):
#         if matrixA[row - i][col] != matrixB[row - i][col]:
#             flag = 1
#         else:
#             if flag == 1:
#                 flag = 0
#                 break

#     return flag

# def checkTopLine(row, col):
#     global matrixA, matrixB
#     flag = 0 # 0 : 바꿀 필요 없음 1 : 바꿔야 함
#     for i in range(3):
#         if matrixA[row][col - i] != matrixB[row][col - i]:
#             flag = 1
#         else:
#             if flag == 1:
#                 flag = 0
#                 break

#     return flag

def isSameNxM(metrixA, metrixB, row, col, n, m):
    for r in range(row, row + n):
        for c in range(col, col + m):
            if metrixA[r][c] != metrixB[r][c]:
                return False
    return True

# def isSameLeft(metrixA, metrixB, row, col):
#     for r in range(row, row + 3):
#         print("check left")
#         print(r, col)
#         if metrixA[r][col] != metrixB[r][col]:
#             return False
#     return True

def isSameTop(metrixA, metrixB, row, col):
    for c in range(col, col + 3):
        print("check top")
        print(row, c)
        if metrixA[row][c] != metrixB[row][c]:
            return False
    return True

def filp(metrix, row, col):
    for r in range(row, row + 3):
        for c in range(col, col + 3):
            # print("row, col : ", r, c)
            # print("기존")
            # print(metrix[r][c])
            # print("변환 후")
            # print(1 - (1 * metrix[r][c]))
            # print()
            metrix[r][c] = 1 - (1 * metrix[r][c])
    # print(metrix)

cnt = 0

for row in range(N - 2):
    for col in range(M - 2):
        # print(row, col)
        # print(isSameLeftTop(metrixA, metrixB, row, col))
        # if not isSameLeft(metrixA, metrixB, row, col):
        if metrixA[row][col] != metrixB[row][col]:
            filp(metrixA, row, col)
            cnt += 1
        else:
            continue
        # print(metrixA)

if isSameNxM(metrixA, metrixB, 0, 0, N, M):
    print(cnt)
else:
    print(-1)