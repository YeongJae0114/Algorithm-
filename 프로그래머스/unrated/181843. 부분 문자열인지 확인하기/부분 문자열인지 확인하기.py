def solution(my_string, target):
    # target 문자열이 my_strung에 포함되지 않는다면 다음 문장 실행
    if target not in my_string:
        answer = 0
    else:  # 반대의 경우 다음 문장 실행
        answer = 1

    return answer