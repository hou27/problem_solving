def bubble_sort(l):
    n = len(l)
    for i in range(n - 1):
        for j in range(n - 1, i, -1):
            if l[j] < l[j - 1]:
                l[j], l[j - 1] = l[j - 1], l[j]


if __name__ == "__main__":
    N = int(input())

    l = []

    for i in range(N):
        l.append(int(input()))
    bubble_sort(l)

    for i in l:
        print(i)
