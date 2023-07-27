from collections import deque

def solution(maps):
    answer=0

    #상하좌우로 이동하는 연산
    # 상:(-1, 0), 하:(1, 0), 좌:(0, -1), 우:(0, 1)
    dx = [0, 0, -1, 1]
    dy = [1, -1, 0, 0]

    def bfs(x,y):
        queue = deque()
        queue.append((x,y))

        while queue:
            x, y = queue.popleft()

            # 상하좌우 칸 확인하기
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                # 맵을 벗어나면 무시하기
                if nx < 0 or nx >= len(maps) or ny < 0 or ny >= len(maps[0]): 
                    continue
                # 벽이면 무시하기
                if maps[nx][ny] == 0:  
                    continue
                # 처음 지나가는 길이면 거리계산하고 다시 상하좌우 확인하기
                if maps[nx][ny] == 1:
                    maps[nx][ny] = maps[x][y] + 1
                    queue.append((nx, ny))    # 재귀
                # 상대 팀 진영(제일 오른쪽 아래 칸)까지의 거리 반환
        return maps[len(maps)-1][len(maps[0])-1]
    
    answer = bfs(0,0)
    if answer == 1:
        answer =- 1

    return answer

maps =[[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]
print(solution(maps))
