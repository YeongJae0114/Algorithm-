def solution(numbers, target):
    answer = 0
    stack_que = [[numbers[0],0], [-1*numbers[0],0]] #
    n = len(numbers)

    while stack_que:
        sum, idx = stack_que.pop()
        idx += 1
        if idx < n:
            stack_que.append([sum + numbers[idx], idx]) #여러개를 추가 할때는 꼭 리스트 형식으로 
            stack_que.append([sum - numbers[idx], idx])
        else:
            if sum == target:
                answer += 1
    return answer

numbers = [4, 1, 2, 1]
target = 2
print(solution(numbers, target))
