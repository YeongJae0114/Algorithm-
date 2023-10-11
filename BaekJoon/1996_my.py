import sys
from collections import deque

n = int(input())

graph = []
que = deque()

for _ in range(n):
    a=list(input())
    for i in range(len(a)):
        if a[i]=='.':
            a[i]=0
        else:
            a[i]=int(a[i])
    graph.append(a)



for i in range(n):
    for j in range(n):
        if graph[i][j] != 0:
            que.append((i,j,graph[i][j]))
while que:
    y,x,k= que.popleft()

    for i in range(y-1,y+2):
        for j in range(x-1,x+2):
            if -1 < i < n and -1 < j < n:
                if i==y and j==x:
                    graph[i][j]='*'
                elif graph[i][j]=='*':
                    continue
                else:
                    graph[i][j]=graph[i][j]+k
                    if graph[i][j]>9:
                        graph[i][j]='M'

for i in (graph):
    print()
    for j in i:
        print(j, end='')