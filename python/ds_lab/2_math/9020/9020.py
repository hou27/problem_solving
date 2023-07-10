from math import sqrt

T = int(input())

# 10000 이하의 소수를 모두 계산해둠. boolean값을 10000개 담은 리스트를 만들어서 구현할 것.
is_prime = [True] * 10001

is_prime[0] = False
is_prime[1] = False

for i in range(2, 10001):
    if is_prime[i]:
        for j in range(2, int(sqrt(i)) + 1):
            if i % j == 0:
                is_prime[i] = False
                break


# 2보다 큰 짝수를 더하면 본인이 되는 두 소수로 반환
def gold_bach(n):
    for i in range(n // 2, 1, -1):
        if is_prime[i] and is_prime[n - i]:
            return i, n - i


for _ in range(T):
    n = int(input())

    print(*gold_bach(n))
