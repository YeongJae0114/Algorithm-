n, m = map(int, input().split())
graph=[]
#그래프를 입력 받음
for i in range(n):
    graph.append(list(map(int, input()))) 
res=0

#상하좌우로 이동하는 연산을 위한
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def bfs(x,y):
    
    que = []
    que.append((x,y))
    while que:
        x, y = que.pop()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]

            if nx <= -1 or nx >= n or ny <= -1 or ny >= m:
                continue

            if graph[nx][ny]==0:
                graph[nx][ny]=1
                que.append((nx,ny))
    

for i in range(n):
    for j in range(m):
        if graph[i][j]==0:
            bfs(i, j)
            res +=1

print(res)



