import sys
from collections import deque

n = int(input())

graph = []
new_graph = [[0] * n for _ in range(n)]

que = deque()

for _ in range(n):
    graph.append(list(input()))

for i in range(n):
    for j in range(n):
        if graph[i][j] != ".":
            que.append((i, j, graph[i][j]))
            new_graph[i][j] = "*"

while que:
    y, x, k = que.popleft()

    for i in range(y - 1, y + 2):
        for j in range(x - 1, x + 2):
            if -1 < i < n and -1 < j < n:
                if i == y and j == x:
                    new_graph[i][j] = "*"
                elif new_graph[i][j] != "M" and new_graph[i][j] != "*":
                    new_graph[i][j] = new_graph[i][j] + int(k)
                    if new_graph[i][j] > 9:
                        new_graph[i][j] = "M"

for i in new_graph:
    print("".join(map(str, i)))
