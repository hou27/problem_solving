n , m = map(int,input().split())

lst=[list(map(int,input().split())) for _ in range(n)]

dy=[0]*(m+1)
ch=[[] for _ in range(m+1)]

for i in range(n):
    chtmp = ch.copy()
    dytmp = dy.copy()
    for j in range(lst[i][1],m+1):
        if dy[j] < dy[j-lst[i][1]]+lst[i][0] and (i not in ch[j-lst[i][1]]):
            chtmp[j]=ch[j-lst[i][1]] + [i]
            dytmp[j] =dy[j-lst[i][1]]+lst[i][0]
            # print("dy[",j,"] = dy[",j-lst[i][1],"] + ",lst[i][0])
            # 이해를 위한 출력문
            # print(chtmp)
            # print(dy)
    ch = chtmp.copy()
    dy = dytmp.copy()
    # print(ch)
    # if i == 0:
    #     break
   

print(dy)
print(max(dy))
print(dy[-1])