from collections import deque

def solution(priorities, location):    
    answer = 0
    deque_priorities = deque(priorities)
    
    while deque_priorities:
        max_pri = max(deque_priorities)
        tmp = deque_priorities.popleft() # 대기중인 프로세스 하나를 꺼냄
        location -= 1 # 위치는 pop를 했기 때문에 -1 만큼 당겨짐

        if tmp != max_pri:
            deque_priorities.append(tmp) #우선순위가 더 높은 프로세스가 있으므로 다시 큐에 넣는다
            if location < 0:
                location = len(deque_priorities)-1 # 음수로 표현 하지 않도록 큐의 맨뒤의 위치로 다시 이동
        else:
            answer += 1 # 프로세스가 몇 번째로 실행되는지 카운트
            if location < 0: 
                break

    return answer
