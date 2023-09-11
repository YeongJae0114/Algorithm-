import sys
input = sys.stdin.readline

def back():
    if len(check) == m:
        #print(' '.join(map(str, check)))
        for i in range(m):
            print(check[i], end=" ")
        print()
        return
   
    else:
        for i in range(1,n+1):
            if i not in check:
                check.append(i)
                back()
                check.pop()

n, m = map(int, input().split())
check = []
back()