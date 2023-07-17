T = int(input())

for _ in range(T):
    N = int(input()) # 날의 수
    stock =list(map(int, input().split())) # 날 별 주가
    sorted_stock = sorted(stock, reverse=True) # 주가 내림차순 정렬

    profit = 0
    bought = []

    for i in range(N):
        if stock[i] == sorted_stock[0]:
            if len(bought) > 0:
                for j in range(len(bought)):
                    profit += sorted_stock[0] - bought[j] # 샀던 주식들에 대한 이익 계산
                bought = []
            sorted_stock.pop(0) # 가장 비싼 주식 목록에서 제거
        else:
            bought.append(stock[i]) # 현재 남은 주식 가격 중 가장 비싼 주식이 아니면 구매

    print(profit)
