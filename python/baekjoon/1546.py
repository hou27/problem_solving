N = int(input())
scores = list(map(int, input().split()))
average = 0
highestScore = max(scores)

for i in range(N):
    scores[i] = scores[i] / highestScore * 100

for i in range(N):
    average += scores[i]
average /= N

print(average)
