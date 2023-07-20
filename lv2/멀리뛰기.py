def solution(n):
    answer = 0
    
    n_list = [0] * (n+1) # n개로 리스트의 길이를 정하면 n=1일때 런타임 에러가 발생
    n_list[0]=1 
    n_list[1]=2 

    for i in range(2,n): 
        n_list[i] = n_list[i-2] + n_list[i-1] #피보나치 수열의 점화식
    
    answer = n_list[n-1] % 1234567

    return answer