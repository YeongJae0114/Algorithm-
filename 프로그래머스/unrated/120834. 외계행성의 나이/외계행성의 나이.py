def solution(age):
    age = list(map(int, str(age)))
    # 97 ~ 106
    answer = ""
    for i in age:
        answer += chr(i + 97)
    return answer