# ver2. sys.stdin.readline() 사용
import sys

# 입력
N = int(sys.stdin.readline())
nums = []
for _ in range(N):
    nums.append(int(sys.stdin.readline()))

# 산술평균
print(round(sum(nums) / N))

# 중앙값
nums.sort()
print(nums[N // 2])

# 최빈값

# ver1
# counter = []
# for num in nums:
#     for i in range(len(counter)):
#         if counter[i][0] == num:
#             counter[i][1] += 1
#             break
#     else:
#         counter.append([num, 1])
#
# count[i][1]을 기준으로 정렬
# counter.sort(key=lambda x: x[1], reverse=True)

# ver2. Counter를 사용한 버전
from collections import Counter
counter = Counter(nums).most_common()

# 최빈값이 여러 개인 경우, 두 번째로 작은 값 출력
if len(counter) > 1 and counter[0][1] == counter[1][1]:
    print(counter[1][0])
else:
    print(counter[0][0])

# 범위
print(nums[-1] - nums[0]) # 최대값 - 최소값