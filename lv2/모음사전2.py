def solution(word):
    answer = 0
    dic = ['A', 'E', 'I', 'O', 'U']
    li = [5**i for i in range(len(dic))]
    
    for i in range(len(word)-1,-1,-1):
        #print(i)
        idx = dic.index(word[i])
        print("idx ",idx)
        for j in range(5-i):
            print(answer)
            answer += li[j]*idx
        answer+=1
    return answer

print(solution('EIO'))