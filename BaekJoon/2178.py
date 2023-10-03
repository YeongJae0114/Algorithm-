import sys
from collections import deque
# input = sys.stdin.readline

n,m = map(int, input().split())

graph = []
for _ in range(n):    
    graph.append(list(map(int, input())))
def bfs(x, y):
    # 이동할 네 가지 방향 정의 (상, 하, 좌, 우)
    dx = [-1, 1, 0, 0] 
    dy = [0, 0, -1, 1]

    que = deque()
    que.append((x,y))

    while que:
       x, y = que.popleft()
       for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            # 위치가 벗어나면 안되기 때문에 조건 추가
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            # 벽이므로 진행 불가
            if graph[nx][ny] == 0:
                continue
            # 벽이 아니므로 이동
            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                que.append((nx, ny))
    return graph[n-1][m-1]

print(bfs(0, 0))