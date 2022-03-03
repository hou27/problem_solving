# 위장


def solution(clothes):
    ans = 1
    closet = {}

    for i in range(len(clothes)):
        if closet.get(clothes[i][1]):
            closet[clothes[i][1]] += 1
        else:
            closet[clothes[i][1]] = 2

    for val in closet.values():
        ans *= val

    return ans - 1


# solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]])
solution(
    [
        ["yellowhat", "headgear"],
        ["bluesunglasses", "eyewear"],
        ["green_turban", "headgear"],
    ]
)
