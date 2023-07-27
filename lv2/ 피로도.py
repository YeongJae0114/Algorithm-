def solution(k, dungeons):
    n = len(dungeons)  # 던전의 개수를 n에 저장
    visited = [0] * n  # 방문 여부를 기록하는 배열 초기화

    max_count = 0  # 최대로 방문할 수 있는 던전 개수를 저장하는 변수 초기화

    stack = [(k, 0, dungeons, visited)]  # 스택에 튜플 형태로 초기 상태를 저장
    # 튜플 구조: (현재 피로도, 방문한 던전의 개수, 던전 정보, 방문 여부 기록)

    while stack:
        k, cnt, dungeons, visited = stack.pop()  # 스택에서 상태 정보를 꺼냄
        max_count = max(max_count, cnt)  # 최대 던전 개수 갱신

        for i in range(len(dungeons)):
            if not visited==1 and k >= dungeons[i][0]:
                # 방문하지 않은 던전이고, 현재 피로도가 해당 던전을 방문하기 위한 최소 피로도보다 크면
                new_k = k - dungeons[i][1]  # 방문 후 남은 피로도 계산
                new_cnt = cnt + 1  # 방문한 던전 개수 증가
                new_visited = visited[:]  # 새로운 방문 여부 기록을 기존 상태 복사

                new_visited[i] = 1  # 새로운 던전을 방문했다고 기록
                stack.append((new_k, new_cnt, dungeons, new_visited))
                # 새로운 상태를 스택에 추가하여 다음 탐색을 위해 반복

    return max_count  # 최대 던전 개수 반환

print(solution(80, [[80, 20], [50, 40], [30, 10]]))
