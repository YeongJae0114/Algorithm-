from collections import deque
que = deque()

x1,y1,x2,y2 = map(int,input().split())
graph=[]

que.append((x1,y1))
que.append((x2,y2))
x,y=que.popleft()
print(x,y)
