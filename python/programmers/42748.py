# K번째수


def solution(array, commands):
    answer = []

    for i in commands:
        sorted_arr = sorted(array[i[0] - 1 : i[1]])
        answer.append(sorted_arr[i[2] - 1])

    return answer
