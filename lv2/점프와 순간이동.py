def solution(n):
    ans = 1
    while n >= 2:
        
        if n % 2 == 0:
            n = n / 2
        else:  
            n = n - 1
            n = n / 2
            ans += 1

    return ans