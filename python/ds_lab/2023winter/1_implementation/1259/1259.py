while True:
    N = int(input())
    if N == 0:
        break
    else:
        # 펠린드롬 수인지 확인
        if str(N) == str(N)[::-1]: # [::-1]를 통해 문자열을 뒤집은 후 비교
            print('yes')
        else:
            print('no')

'''
python에서의 slice
각각의 항목은 [start:stop:step]를 의미한다.
string[::-1]처럼 반대 방향으로 리스트의 데이터를 잘라 뒤집은 효과를 낼 수 있다.
'''
