import sys
from collections import deque
input = sys.stdin.readline



for _ in range(int(input())):
    que = deque()

    dx = [1,-1,0,0]
    dy = [0,0,1,-1]

    n,m,k=map(int,input().split())
    graph = [[0] * n for _ in range(m)]

    for i in range(k):
        x,y = map(int,input().split())
        que.append((x,y))
        
    print(que)

def bfs():
    pass

