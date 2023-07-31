# def solution(N, number):
#     cnt = 0
#     if N == number:
#         return 1

#     # 각 1 ~ 9자리의 N을 이어붙인 숫자 저장
#     possible_nums = [set() for _ in range(9)]
#     # for i in range(9):
#     #     possible_nums[i].add(int(str(N) * (i + 1)))
#     possible_nums[0].add(N)

#     print(possible_nums)

#     while True:
#         cnt += 1
#         curr_possible_nums = set()
#         # tmp에 빈 set이 아닌 원소만 저장
#         tmp = list(filter(lambda x: x != set(), possible_nums))
#         for idx, nums in enumerate(tmp):
#             if cnt + idx + 1 > 8:
#                 return -1
#             for num1 in possible_nums[cnt - 1]:
#                 for num2 in nums:
#                     curr_possible_nums = get_possible_nums(num1, num2, N)
#                     if number in curr_possible_nums:
#                         return cnt + idx + 1
#                     else:
#                         possible_nums[cnt + idx] = possible_nums[cnt + idx].union(
#                             curr_possible_nums
#                         )


# # 주어진 숫자에 가능한 경우를 모두 반환하는 함수
# def get_possible_nums(num1, num2, N):
#     tmp = set()
#     # 정방향
#     # tmp.add(num1 * 10 + N)  # N을 하나 붙인 경우
#     tmp.add(num1 + num2)  # 더한 경우
#     tmp.add(num1 - num2)  # 뺀 경우
#     tmp.add(num1 * num2)  # 곱한 경우
#     tmp.add(num1 // num2)  # 나눈 경우

#     # 역방향
#     tmp.add(num2 + num1)  # 더한 경우
#     tmp.add(num2 - num1)  # 뺀 경우
#     tmp.add(num2 * num1)  # 곱한 경우

#     # set에서 0 아닌 정수만 남기고 제거
#     tmp = set(filter(lambda x: x != 0, tmp))

#     return tmp


def solution(N, number):
    if N == number:
        return 1

    possible_nums = [set() for _ in range(9)]

    for i in range(1, 9):
        possible_nums[i].add(int(str(N) * (i)))
        if number in possible_nums[i]:
            return i
        print(possible_nums)
        for j in range(i // 2 + 1):
            for num1 in possible_nums[j]:
                for num2 in possible_nums[i - j]:
                    curr_possible_nums = get_possible_nums(num1, num2)
                    if number in curr_possible_nums:
                        return i
                    else:
                        possible_nums[i] = possible_nums[i].union(curr_possible_nums)

    return -1


# 주어진 숫자에 가능한 경우를 모두 반환하는 함수
def get_possible_nums(num1, num2):
    tmp = set()
    # 정방향
    tmp.add(num1 + num2)  # 더한 경우
    tmp.add(num1 - num2)  # 뺀 경우
    tmp.add(num1 * num2)  # 곱한 경우
    if num2 != 0:
        tmp.add(num1 // num2)  # 나눈 경우

    # 역방향
    tmp.add(num2 - num1)  # 뺀 경우
    tmp.add(num2 * num1)  # 곱한 경우
    if num1 != 0:
        tmp.add(num2 // num1)

    return tmp


if __name__ == "__main__":
    N = 5
    number = 12
    print(solution(N, number))
    N = 2
    number = 11
    print(solution(N, number))
    N = 5
    number = 31168
    print(solution(N, number))
    N = 6
    number = 5
    print(solution(N, number))
    N = 5
    number = 26
    print(solution(N, number))
    N = 4
    number = 31
    print(solution(N, number))
