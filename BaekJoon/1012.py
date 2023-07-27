import sys
sys.setrecursionlimit(10000) # 파이썬의 기본 재귀 깊이 제한 설정

def dfs(x,y):

    dx=[1,-1,0,0]
    dy=[0,0,1,-1]

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < m and 0 <= ny < n:
            if baechubat[ny][nx]==1:
                baechubat[ny][nx] = 0
                dfs(nx,ny)

for _ in range(int(sys.stdin.readline())): 
    count = 0 # 필요한 배추흰지렁이의 수
    m, n, k = map(int, sys.stdin.readline().split()) #m: 가로길이  , n: 세로 길이 ,  k: 배추 수

    baechubat = [[0 for _ in range(m)] for _ in range(n)] # m X n 의 0으로 초기화된 2차원 리스트를 만든다. 

    for _ in range(k):
        x ,y = map(int, sys.stdin.readline().split())
        baechubat[y][x]=1  # baechubat[x][y]가 아님!

    for x in range(m): #2차원 리스트를 돌면서 필요한 흰배추지렁이 개수 탐색
        for y in range(n):
            if baechubat[y][x] == 1:
                dfs(x, y)
                count += 1

print(count)




        






