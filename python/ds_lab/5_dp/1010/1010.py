import sys

input = sys.stdin.readline


# 비재귀적 팩토리얼 함수
def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result


T = int(input())

for _ in range(T):
    N, M = map(int, input().split())  # 서쪽과 동쪽 사이트의 개수 N < M

    # 동쪽 사이트가 M개일 때이고 서쪽 사이트가 N개일 때 다리를 지을 수 있는 경우의 수는 mCn이다.
    # mCn = m! / (n! * (m - n)!)
    print(factorial(M) // (factorial(N) * factorial(M - N)))
