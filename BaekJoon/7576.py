import sys
from collections import deque

input = sys.stdin.readline

# 입력 처리, 토마토가 들어있는 상자 만들기
m, n = map(int, input().split())
box = []

for i in range(n):
    a = list(map(int, input().split()))
    box.append(a)

# queue 생성
que = deque()

# box안에 익은 토마토의 위치를 que에 넣는다
for i in range(n):
    for j in range(m):
        if box[i][j] == 1:
            que.append([i, j])
        
def dfs():
    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]

    while que:
        x, y = que.popleft()
        for i in range(4):
            nx = x+ dx[i]
            ny = y+ dy[i]
            if nx >-1 and nx <n and ny >-1 and ny <m: # 박스안 범위를 넘어가지 않는 조건
                if box[nx][ny] == 0: # 익지 않은 토마토가 있어야함
                    box[nx][ny] = box[x][y] +1 
                    que.append([nx,ny])
dfs()

res=[]
for i in box:
    for j in i:
        if j == 0:
            print(-1)
            exit(0)
    res.append(max(i))

print(max(res)-1)
