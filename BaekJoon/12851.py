import sys
from collections import deque

input = sys.stdin.readline
N, K = map(int,input().split())

way = [0]*100001 
que=deque()
que.append(N)

cnt = 0
res = 0
while que:
    n = que.popleft()
    tmp = way[n]
    if n == K:
        res = tmp
        cnt += 1 
        continue
        
    for i in [n+1, n-1, n*2]:
        if 0 <= i < 100001 and (way[i] == 0 or way[i]== way[n] +1): #범위 안에있고 방문하지 않았거나, 다음 방문이 이전 방문+1이면
            way[i] = way[n] + 1
            que.append(i) 
print(res)
print(cnt)