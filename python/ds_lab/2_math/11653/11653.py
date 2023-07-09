N = int(input())

if N == 1:  # 1이면 아무것도 출력하지 않음.
    exit()

i = 2  # 2부터 시작

while N != 1:  # N이 1이 아닐 때까지 반복
    if N % i == 0:  # 나누어 떨어지면 출력하고 N을 i로 나눔.
        N = N // i
        print(i)
    else:  # 나누어 떨어지지 않으면 i를 1 증가시킴.
        i += 1
