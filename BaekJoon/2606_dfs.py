n = int(input())
m = int(input())
graph = [[]*n for _ in range(n+1)]# 2차원 리스트를 초기화
for _ in range(m):
    a,b = map(int,input().split())
    graph[a].append(b) # a에 b 연결
    graph[b].append(a) # b에 a 연결 (양방향)
    
cnt = 0
visited = [0]*(n+1) # 방문한 컴퓨터인지 표시

def dfs(start):
    global cnt

    visited[start] = 1
    for i in graph[start]:
        if visited[i]==0:
            dfs(i)
            cnt +=1
 
dfs(1)
