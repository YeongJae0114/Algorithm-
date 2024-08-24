import java.util.*;

public class Main {
    public static int maxEvents(List<int[]> schedule) {
        // 끝나는 시간을 기준으로 정렬
        schedule.sort(Comparator.comparingInt(a -> a[1]));

        int lastEndTime = -1;
        int count = 0;

        for (int[] event : schedule) {
            if (event[0] > lastEndTime) {  // 이전 행사 종료 시간보다 시작 시간이 크면 (시간 겹치지 않음)
                count++;
                lastEndTime = event[1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<int[]> schedule = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            schedule.add(new int[]{s, e});
        }

        int result = maxEvents(schedule);
        System.out.println(result);
    }
}
