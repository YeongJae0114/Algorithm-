def solution(numbers):
    # 정수형 numbers를 문자열로 바꾸고 list형태로 저장
    list_num = list(map(str,numbers)) 
    # key 를 통하여 정렬할 기준을 정할 수 있다.
    # reverse 가 True이면 내림차순
    # 익명함수를 지칭한다. 함수 선언
    list_num.sort(key = lambda x : x*3,reverse = True) # x를 3번 반복한 문자열을 기준으로 정렬
    
    answer = ''
    for i in list_num:     
        answer += i
    
    # return answer으로 바로 반환 했을 떄 numbers = [0,0]일 때 가장 큰수는 00을 반환한다.(오류)    
    # return answer
    return str(int(answer))