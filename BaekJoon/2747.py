import sys
input = sys.stdin.readline

n = int(input())

def fib1(n): # 재귀
    if n == 0:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        return fib1(n - 1) + fib1(n - 2)

def fib2(n): # 단순 반복
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
    return a

print(fib2(n))