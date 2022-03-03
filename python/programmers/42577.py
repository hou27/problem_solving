# 전화번호 목록


def solution(phone_book):
    phone_book.sort()
    length = 0
    for i in range(len(phone_book) - 1):
        if len(phone_book[i]) < len(phone_book[i + 1]):
            if phone_book[i + 1].startswith(phone_book[i]):
                return False

    return True


solution(["119", "97674223", "1195524421"])
