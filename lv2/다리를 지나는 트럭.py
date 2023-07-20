#solution1 sum을 사용해 시간초과
def solution1(bridge_length, weight, truck_weights):

    answer = 0
    bridge_weight = [0 for _ in range(bridge_length)]

    while(bridge_weight):
        answer += 1
        bridge_weight.pop(0)
        
        if truck_weights:
            if(sum(bridge_weight) + truck_weights[0] <= weight):
                t = truck_weights.pop(0)
                bridge_weight.append(t)
            else:
                bridge_weight.append(0)

    return answer

#solution2 deque사용, sum사용x 
from collections import deque

def solution2(bridge_length, weight, truck_weights):
    answer = 0
    temp = 0
		# deque 객체 사용 
    truck_bridge_deque = deque(bridge_length * [0]) # 다리의 길이를 0으로 채움
    truck_weights_deque = deque(truck_weights) # 대기하고 있는 트럭

    while len(truck_bridge_deque): # 대기하고 있는 트럭이 없어질때 까지 반복 
        answer += 1 # 다리 1을 이동할 때마다 1초 소요
        temp -= truck_bridge_deque[0] # 다리위에 있는 트럭의 무게
        truck_bridge_deque.popleft() # 다리위를 지나간 트럭은 삭제
        
        if truck_weights_deque: # 대기하고 있는 트럭이 있다면
            if temp + truck_weights_deque[0] <= weight: # 다리위의 트럭의 무게가 견딜수 있는 무게이면
                temp += truck_weights_deque[0] # 다리위에 있는 트럭의 무게에 다음 트럭 추가
                truck_bridge_deque.append(truck_weights_deque.popleft()) # 대기 큐에 있는 다음 트럭을 삭제하고 
																																				 # 방금 삭제한 트럭을 다리위에 있는 트럭 큐에 추가한다.  
            else:
                truck_bridge_deque.append(0) # 견딜수 있는 무게이면 트럭을 보내지 않는다 -> 0 추가
    return answer

