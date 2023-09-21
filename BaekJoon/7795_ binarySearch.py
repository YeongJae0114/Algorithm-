# 이진 탐색 함수 정의
def binarySearch(a):
    start = 0
    end = M - 1
    result = 0

    # 이진 탐색을 반복하여 실행
    while start <= end:
        mid = (start + end) // 2  # 중간 인덱스 계산

        # 중간 값(mid)이 a보다 작으면, 더 큰 범위에서 찾음
        if B[mid] < a:
            start = mid + 1
            result = mid  # 현재 mid 값을 기록 (작은 값의 개수를 세기 위해)
        else:
            end = mid - 1

    # result에 저장된 값은 a보다 작은 값의 개수를 나타냄
    return result + 1  # 0부터 시작하는 인덱스를 1부터 시작하는 개수로 변환하여 반환

# 테스트 케이스 수 입력
for _ in range(int(input())):
    N, M = map(int, input().split())  # 배열의 크기 N과 M 입력
    A = sorted(list(map(int, input().split())))  # 배열 A 입력 및 정렬
    B = sorted(list(map(int, input().split())))  # 배열 B 입력 및 정렬
    answer = 0  # 결과를 저장할 변수 초기화

    # 배열 A의 각 원소에 대해 이진 탐색을 수행하고 결과를 누적
    for i in A:
        if i > B[0]:  # i가 B 배열의 최소값보다 큰 경우에만 탐색 수행
            t = binarySearch(i)  # i보다 작은 값의 개수를 이진 탐색으로 찾음
            answer += t  # 결과를 누적

    print(answer)  # 결과 출력
