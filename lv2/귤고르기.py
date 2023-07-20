def solution1(k, tangerine):
    
    tmp =[]
    answer = 0

    for i in tangerine:
        tmp.append(tangerine.count(i))
        tangerine.pop()
        

    tmp.sort(reverse=True)
    print(tmp)
    for i in tmp:
        if k <= 0:
            return answer
        k -= i
        answer += 1


def solution(k, tangerine):

    a={}
    answer=0
    for i in tangerine:
        if i in a: 
            a[i]+=1
        else:
            a[i]=1
        
    a = dict(sorted(a.items(), key=lambda x: x[1], reverse=True)) # value값을 내림차순으로 정렬

    for i in a:
        
        if k <= 0:
            return answer
        k -= a[i]
        answer += 1

    return answer
#1 2 2 1 2 

print(solution1(4,[1, 3, 2, 5, 4, 5, 2, 3]))