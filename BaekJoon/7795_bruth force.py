import sys
input = sys.stdin.readline

answer = []
t = int(input())

def compare(a,b):
    cnt=0
    for i in a:
        for j in b:
            if i>j:
                cnt += 1
    answer.append(cnt)            

for k in range(t):
    n, m = map(int, input().split())
    A_list = list(map(int, input().split()))
    B_list = list(map(int, input().split()))
    compare(A_list,B_list)

for i in answer:
    print(i)






