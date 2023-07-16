NAME = input()

# 문자열을 리스트로 변환
NAME = list(NAME)

# 리스트를 겹치는 문자열 개수를 나타내는 dict으로 변환과 동시에 odd_dict에 홀수개인 문자를 저장
NAME_dict = {e: NAME.count(e) for e in NAME}

# 홀수개인 문자가 2개 이상이면 불가능
odd_list = []
for e in NAME_dict:
    if NAME_dict[e] % 2 == 1:
        odd_list.append(e)

if len(odd_list) >= 2:
    print("I'm Sorry Hansoo")
    exit()

# 문제 조건인 '정답이 여러 개일 경우에는 사전순으로 앞서는 것을 출력'하기 위해 문자열 순으로 정렬
NAME_dict = sorted(NAME_dict.items(), key=lambda x: x[0])

# 문자열을 정방향으로 순회하며 펠린드롬 문자열의 좌측을 구성
left = []

for e in NAME_dict:
    if e[1] % 2 == 0:
        left += [e[0]] * (e[1] // 2)
    else:
        left += [e[0]] * ((e[1] - 1) // 2)  # 홀수개인 문자는 1개를 빼고 나눈 후 그 개수만큼 추가

# 문자열의 우측을 구성(이후 뒤집어줌)
right = []
for e in NAME_dict:
    if e[1] % 2 == 0:
        right += [e[0]] * (e[1] // 2)
    else:
        right += [e[0]] * ((e[1] - 1) // 2)

# 펠린드롬 문자열 중간에 홀수개였던 것이 있다면 추가해서 출력
if len(odd_list) == 1:
    print("".join(left) + odd_list[0] + "".join(right[::-1]))
else:
    print("".join(left) + "".join(right[::-1]))
