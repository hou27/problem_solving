import sys

input = sys.stdin.readline

N = int(input())
P = list(map(int, input().split()))

P.sort()  # 오름차순 정렬

result = 0
for i in range(N):
    result += sum(P[: i + 1])  # 누적합

print(result)
