def solution(brown, yellow):
    #가로a 세로 b
    total = brown + yellow

    for b in range(1,total+1):
        if total % b == 0:
            a = total / b
            if a>=b:
                if 2*a + 2*b == brown +4:
                    return [a,b]