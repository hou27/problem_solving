T = int(input())

for _ in range(T):
    N = int(input())  # 날의 수
    stock = list(map(int, input().split()))  # 날 별 주가

    profit = 0
    curr_max = stock[-1]  # 역순으로 순회했을 때 가장 첫 값을 최댓값으로 설정

    for i in range(N - 2, -1, -1):  # 뒤에서부터 순회
        if stock[i] > curr_max:  # 현재 주가가 최댓값보다 크다면 최댓값 갱신
            curr_max = stock[i]

        else:  # 현재 주가가 최댓값보다 작다면 최댓값에서 현재 주가를 뺀 값을 이익에 더함
            profit += curr_max - stock[i]

    print(profit)
