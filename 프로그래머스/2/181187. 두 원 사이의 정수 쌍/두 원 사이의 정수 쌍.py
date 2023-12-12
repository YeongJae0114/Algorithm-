import math

def solution(r1, r2):
    answer = 0
    # 바깥쪽 원의 x좌표를 나타내는 i
    for i in range(1, r2 + 1):
        # 원의 방정식을 이용해 y값을 찾음
        y_r2 = math.sqrt(r2**2 - i**2) # y_r2 = (r2**2 - i**2)**(0.5)

        if i <= r1: # r1보다 큰 범위만 계산
             # 원의 방정식을 이용해 y값을 찾음
            y_r1 = math.sqrt(r1**2 - i**2) # y_r1 = (r1**2 - i**2)**(0.5)
        else:
            y_r1 = 0
        
        answer += math.floor(y_r2) - math.ceil(y_r1) + 1 # floor : 내림, ceil : 올림
    return answer * 4