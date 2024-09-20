import sys

input = sys.stdin.readline

A, B, C = map(int, input().split())

N = pow(A, B, C)  # A^B를 C로 나눈 나머지

print(N)
