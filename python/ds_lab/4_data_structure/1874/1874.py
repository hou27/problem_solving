n = int(input())

nums = [e for e in range(1, n + 1)]
goal = [int(input()) for _ in range(n)]
tmp = []
ans = []

for _ in range(n):
    tmp.append(nums.pop(0))
    ans.append('+')
    while tmp and tmp[-1] == goal[0]:
        tmp.pop()
        goal.pop(0)
        ans.append('-')

if tmp:
    print('NO')
else:
    for e in ans:
        print(e)