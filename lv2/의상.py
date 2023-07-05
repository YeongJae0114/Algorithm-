def solution(clothes):

    hash = {} # 딕셔너리 생성

    # 옷의 종류마다 나누기 
    for i, j in clothes:

        hash[j] = hash.get(j,0)+1 # none 반환 값을 0으로 바꿈 
        # +1을 해줌으로 의상 종류 개수 카운트 

    answer = 1 #곱셈 연산을 하기 위해서

    for j in hash:
        answer *=(hash[j]+1)

    #아무것도 입지 않았을 경우는 제외
    return answer-1