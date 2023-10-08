import sys
from collections import deque
input = sys.stdin.readline

def bfs(y,x):
    que = deque()

    dx = [1,-1,0,0]
    dy = [0,0,1,-1]

    que.append((y,x))

    while que:
        y1, x1 = que.popleft()
        
        for i in range(4):
            ny = y1 + dy[i]
            nx = x1 + dx[i]
            if -1 < nx < m and -1 < ny < n:
                if graph[ny][nx] ==1:
                    graph[ny][nx] = 0
                    que.append((ny,nx))
        
res = []
for _ in range(int(input())):
    cnt = 0
    m, n, k = map(int,input().split()) 
   
    graph = [[0] * m for _ in range(n)]
    # 배추 입력
    for _ in range(k):
        x, y = map(int,input().split())
        graph[y][x]=1

    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1:
                graph[i][j]=0
                bfs(i,j)
                cnt += 1
    res.append(cnt)
    
for i in res:
    print(i)




