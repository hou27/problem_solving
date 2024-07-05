# max heap class(완전 이진 트리)
class MaxHeap:
    def __init__(self):
        self.heap = []
        self.size = 0

    def insert(self, n):
        self.heap.append(n) # 맨 뒤에 추가
        self.size += 1
        self.percolateup(self.size - 1) # 추가한 노드를 적절한 위치에 삽입

    def percolateup(self, idx):
        parent = (idx - 1) // 2 # 부모 노드의 인덱스
        if idx <= 0: # 루트 노드일 때
            return
        while parent >= 0 and self.heap[parent] < self.heap[idx]: # 부모 노드가 존재하고, 부모 노드의 값이 자식 노드의 값보다 작을 때까지
            self.heap[parent], self.heap[idx] = self.heap[idx], self.heap[parent]
            idx = parent
            parent = (idx - 1) // 2

    def pop(self):
        if self.size == 0:
            return 0
        else:
            self.heap[0], self.heap[-1] = self.heap[-1], self.heap[0] # 루트와 마지막 노드를 교환
            self.size -= 1
            self.percolatedown(0) # 루트를 기준으로 재정렬
            return self.heap.pop()

    def percolatedown(self, idx):
        while idx * 2 + 1 < self.size: # 왼쪽 자식 노드가 존재할 때까지
            left = idx * 2 + 1
            right = idx * 2 + 2

            # 왼쪽 자식 노드와 오른쪽 자식 노드 중 더 큰 값의 인덱스를 child에 저장
            if right < self.size and self.heap[left] < self.heap[right]: # 오른쪽 자식 노드가 존재하고, 오른쪽 자식 노드의 값이 왼쪽 자식 노드의 값보다 클 때
                child = right
            else:
                child = left

            if self.heap[idx] < self.heap[child]: # 부모 노드의 값이 자식 노드의 값보다 작을 때
                self.heap[idx], self.heap[child] = self.heap[child], self.heap[idx]
                idx = child
            else:
                break
import sys
input = sys.stdin.readline

N = int(input())

maxheap = MaxHeap()

for _ in range(N):
    x = int(input())
    if x == 0:
        if maxheap.size == 0:
            print(0)
        else:
            print(maxheap.pop())
    else:
        maxheap.insert(x)