def solution(numbers):
    list_num = list(map(str,numbers)) 
    list_num.sort(key = lambda x : x*3,reverse = True)

    answer = str(int(''.join(list_num)))
    return answer