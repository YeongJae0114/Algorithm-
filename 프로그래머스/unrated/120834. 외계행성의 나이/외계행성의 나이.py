def solution(age):
    # 자릿수 별로 나눠 list 형식으로 저장  ex)[1,2,3]
    age = list(map(int, str(age)))
    # 아스키코드 10진수 : a ~ j -> 97 ~ 106
    
    answer = "" # 변환한 행성의 나이를 저장할 변수
    for i in age:
        # 변환할 숫자에 아스키 코드 값을 더해서 다시 문자로 변환
        answer += chr(i + 97)
    return answer