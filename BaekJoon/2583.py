from collections import deque

m, n, k= map(int,input().split())
graph = [[0]*n for _ in range(m)]

def bfs(x,y):
    dx = [1,-1,0,0]
    dy = [0,0,1,-1]
    cnt = 1
    que = deque()
    que.append((x,y))

    while que:
        x,y=que.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if (0 <= nx < m) and (0 <= ny < n) and graph[nx][ny] == 0:
                graph[nx][ny] = 1
                que.append((nx, ny))
                cnt += 1
    return cnt

# 그래프 그리기
for _ in range(k):
    x1,y1,x2,y2 = map(int,input().split())
    for i in range(y1,y2):
        for j in range(x1,x2):
            graph[i][j] += 1

result = []

for i in range(m):
    for j in range(n):
        if graph[i][j] == 0:
            graph[i][j] += 1
            result.append(bfs(i, j))

print(len(result))
print(*sorted(result))

