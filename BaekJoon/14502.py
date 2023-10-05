from collections import deque
import copy
import sys
input = sys.stdin.readline

n, m = map(int,input().split())

# 그래프 입력 받기
graph = []
for _ in range(n):
    graph.append(list(map(int,input().split())))

# 매개변수
dx = [-1,1,0,0]
dy = [0,0,-1,1]

result = 0

# 벽 세우기
def make_well(cnt):
    if cnt == 3:
        bfs()
        return

    for i in range(n):
        for j in range(m):
            if graph[i][j]==0:
                graph[i][j]=1
                make_well(cnt+1)
                graph[i][j]=0
# 넓이 탐색
def bfs():
    # 벽을 세운 그래프를 깊은 복사를 통해서 만들고 바이러스를 퍼트린다
    test_graph = copy.deepcopy(graph)
    #test_graph = graph.copy()
    que = deque() 

    # 바이러스가 있는 좌표를 queue 에 넣는다
    for i in range(n):
        for j in range(m):
            if test_graph[i][j] == 2:
                que.append((i,j))

    while que:
        x, y = que.popleft()

        for i in range(4):
            nx = dx[i] + x
            ny = dy[i] + y
            if (0<=nx<n) and (0<=ny<m):
                # 정해진 그래프 내에서 바이러스 퍼트리기
                if test_graph[nx][ny] == 0:
                    test_graph[nx][ny] = 2
                    que.append((nx,ny))
    global result
    count = 0
    
    # 바이러스를 퍼트리고 안전지대 카운트
    for i in range(n):
        for k in range(m):
            if test_graph[i][k] == 0:
                count += 1

    result = max(result, count)

make_well(0)
print(result)