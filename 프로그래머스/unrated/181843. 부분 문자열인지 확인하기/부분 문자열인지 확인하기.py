def solution(my_string, target):
    if 100 > len(my_string) >= 0 & 100 > len(target) >= 0: 
        return
    # target 문자열이 my_strung에 포함되지 않는다면 다음 문자 실행
    if target not in my_string:
        answer = 0
    else:
        answer = 1

    return answer