N = int(input())
numList = list(map(int, input().split()))

big = numList[0]
small = numList[0]

numList = numList[1:]

for n in numList:
    if big < n:
        big = n
    elif small > n:
        small = n

print(small, big)
