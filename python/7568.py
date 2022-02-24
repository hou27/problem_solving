n = int(input())

info = []
rank = []

for i in range(n):
    w, h = map(int, input().split())
    info.append((w, h))
 
for i in range(n):
    cnt = 1
    for j in range(n):
        if info[i][0] < info[j][0] and info[i][1] < info[j][1]:
            cnt += 1
						
    rank.append(cnt)
 
for info in rank:
    print(info, end=" ")
