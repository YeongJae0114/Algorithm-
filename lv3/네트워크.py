def dfs(x, computers, visited): #방문할 인덱스, 컴퓨터들, 방문 표시 배열
    visited[x] = True # 방문표시
    for a, b in enumerate(computers[x]):  #a가 인덱스 b가 값 ex) computers[1] => [1, 1, 0] (a=0,b=1)
        if b == 1 and visited[a] == False: # 연결되어 있는데 방문하지 않았을 때
            dfs(a,computers,visited)

def solution(n, computers):
    visited = [False] * n
    cnt =0
    for i in range(n):
        if visited[i] == False:
            dfs(i,computers,visited)
            cnt += 1 
    return cnt

print(solution(3,[[1, 1, 0], [1, 1, 0], [0, 0, 1]]))
