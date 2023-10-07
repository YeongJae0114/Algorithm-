import sys
input = sys.stdin.readline

# 런타임 에러가 난 코드
def solved():
    m = int(input())
    li = []
    for _ in range(m):
        li.append(int(input()))

    def fibo(n):
        if n==0:
            cnt.append(0)
            return 0
        elif n==1:
            cnt.append(1)
            return 1
        else:
            return fibo(n-2) + fibo(n-1)

    for i in li:
        cnt=[]
        fibo(i)
        print(cnt.count(0),cnt.count(1))
    return 0

# 정답 코드
def solved1():
    T = int(input())
    for _ in range(T):
        N = int(input())
        a, b = 1, 0 # 0과 1이 호출된 횟수
        for i in range(N):
        # 0은 1이 호출된 횟수만큼, 1은 0과 1이 호출된 합만큼 출력됨
            a,b = b, a+b 
        print(a,b)


