# 완주하지 못한 선수


def solution(participant, completion):
    participant.sort()
    completion.sort()
    for i in range(len(completion)):
        if participant[i] != completion[i]:
            return participant[i]
    return participant[len(participant) - 1]


"""
다른 답

1. 
import collections


def solution(participant, completion):
    answer = collections.Counter(participant) - collections.Counter(completion)
    return list(answer.keys())[0] # 리스트 형태로 변환

2. 
def solution(participant, completion):
    participant.sort()
    completion.sort()
    # zip : 같은 인덱스끼리 짝지어준다.
    for p, c in zip(participant, completion):
        if p != c:
            print(p, c)
            return p
    return participant.pop()
"""
"""
# 효율성 통과 실패
def solution(participant, completion):
    answer = ""
    tmp = []
    for p in participant:
        for c in completion:
            if c == p:
                tmp.append(p)
                completion.remove(c)
                break
    for t in tmp:
        participant.remove(t)
    answer = participant[0]

    return answer
"""

# solution(
#     ["marina", "josipa", "nikola", "vinko", "filipa"],
#     ["josipa", "filipa", "marina", "nikola"],
# )

solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"])
