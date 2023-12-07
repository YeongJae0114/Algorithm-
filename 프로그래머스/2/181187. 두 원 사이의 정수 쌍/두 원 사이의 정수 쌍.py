import math

def solution(r1, r2):
    answer = 0  
    
    # 바깥쪽 원의 x좌표를 나타내는 i
    for i in range(1, r2+1):
        y_r2 = math.sqrt(r2**2 - i**2)
        # y_r1 = (r2**2 - i**2)**(0.5)

        if i > r1:
            y_r1 = 0
        else:
            # x_r2 = (r1**2 - i**2)**(0.5)
            y_r1 = math.sqrt(r1**2 - i**2)
        answer += math.floor(y_r2) - math.ceil(y_r1) + 1
          
    return answer*4