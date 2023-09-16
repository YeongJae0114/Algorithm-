import collections

answer = []  # 결과를 저장할 리스트
graph = collections.defaultdict(list)  # 그래프를 구현하기 위한 defaultdict 생성

# 깊이 우선 탐색(Depth-First Search) 함수 정의
def dfs(s):
    while graph[s]:
        a = graph[s].pop(0)  # 경로에서 다음 도착지를 추출하고 리스트에서 제거
        dfs(a)  # 다음 도착지에 대해 재귀적으로 탐색
    if not graph[s]:
        answer.append(s)  # 더 이상 갈 곳이 없으면 결과 리스트에 현재 도착지 추가
        return

# 주어진 항공권 정보를 사용하여 그래프 생성
def solution(tickets):
    for i, j in tickets:
        graph[i].append(j)  # 출발지 i에서 도착지 j로 가는 항공권 정보를 그래프에 추가
    print(graph)  # 그래프 출력
    for i, j in graph.items():
        graph[i].sort()  # 각 출발지에서의 도착지 목록을 알파벳 순으로 정렬
    print(graph)  # 정렬된 그래프 출력

    dfs('ICN')  # "ICN" 출발지에서 시작하여 깊이 우선 탐색 실행
    return answer[::-1]  # 결과 리스트를 뒤집어서 반환

# 테스트 케이스
a = [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL", "SFO"]]
print(solution(a))  # 결과 출력
