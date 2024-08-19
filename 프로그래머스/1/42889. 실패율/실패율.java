import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int user = stages.length;
        double[] failRate = new double[N];
        HashMap<Integer, Integer> fail = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            fail.put(i, count(stages, i));
        }

        //스테이지마다의 실패율을 계산
        int idx = 0;
        for (Integer key : fail.keySet()) {
            failRate[idx++] = (double) fail.get(key) / user;
            if (user == fail.get(key))
                user = 1;
            else
                user -= fail.get(key);
        }

        //실패율을 내림차순으로 정렬하기 위한 배열 생성
        Double[] temp = new Double[N];
        for (int i = 0; i < N; i++) {
            temp[i] = failRate[i];
        }
        Arrays.sort(temp, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (failRate[i] == temp[j]) {
                    if (answer[j] != 0)
                        continue;
                    answer[j] = i + 1;
                    break;
                }
            }
        }

        return answer;
    }

    public int count(int[] arr, int n) {
        int cnt = 0;

        for (int i : arr) {
            if (i == n)
                cnt++;
        }
        return cnt;
    }
}
