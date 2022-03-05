# 10828 stack
import sys

stack = []
p = -1


def push(n):
    global p
    stack.append(n)
    p += 1


# 전역변수 사용해봄
def pop():
    global p
    print(stack[-1])
    del stack[p]
    p -= 1


def is_empty():
    return False if stack else True


if __name__ == "__main__":
    # N = int(input()) # 시간 단축위해 sys패키지 사용
    N = int(sys.stdin.readline())
    for i in range(N):
        cmd = sys.stdin.readline().rstrip().split(" ")
        if cmd[0] == "push":
            push(cmd[1])
        elif cmd[0] == "pop":
            print("-1") if is_empty() else pop()
        elif cmd[0] == "size":
            print(len(stack))
        elif cmd[0] == "empty":
            print("1") if is_empty() else print("0")
        elif cmd[0] == "top":
            print("-1") if is_empty() else print(stack[-1])
