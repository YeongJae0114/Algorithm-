import sys
input = sys.stdin.readline

def back(start):
    if len(check) == m:
        #print(' '.join(map(str, check)))
        for i in range(m):
            print(check[i], end=" ")
        print()
        return
    else:
        for i in range(start,n+1):
            if i not in check:
                check.append(i)
                back(i+1)
                check.pop()

n, m = map(int, input().split())
check = []
back(1)