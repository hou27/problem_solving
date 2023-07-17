T = int(input())

for _ in range(T):
    N = int(input()) # 날의 수
    stock =list(map(int, input().split())) # 날 별 주가

    # 주가 별 dict 생성 (key: 주가, value: 해당 주가 개수)
    stock_dict = {e: stock.count(e) for e in stock}

    # 주가 별 dict을 주가를 기준으로 내림차순 정렬
    sorted_stock = sorted(stock_dict.items(), key=lambda x: x[0], reverse=True)

    profit = 0
    bought = []

    for i in range(N):
        if stock[i] == sorted_stock[0][0]:
            if len(bought) > 0:
                for j in range(len(bought)):
                    profit += sorted_stock[0][0] - bought[j] # 샀던 주식들에 대한 이익 계산
                bought = []
            # sorted_stock에서 현재 주가을 개수를 하나 빼줌
            if sorted_stock[0][1] == 1:
                sorted_stock.pop(0)
            else:
                sorted_stock[0] = (sorted_stock[0][0], sorted_stock[0][1] - 1)
        else:
            bought.append(stock[i]) # 현재 남은 주식 가격 중 가장 비싼 주식이 아니면 구매

        # 현재 stock[i]의 값을 가진 sorted_stock 내의 index를 찾아서 1을 빼줌
        for j in range(len(sorted_stock)):
            if sorted_stock[j][0] == stock[i]:
                if sorted_stock[j][1] == 1:
                    sorted_stock.pop(j)
                else:
                    sorted_stock[j] = (sorted_stock[j][0], sorted_stock[j][1] - 1)
                break


    print(profit)
