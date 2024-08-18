import java.io.*;
import java.util.*;

public class Main {
    static class Student{
        String name;
        int kor;
        int eng;
        int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Student> line = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            line.add(new Student(name, kor, eng, math));
        }
        br.close();

        Collections.sort(line, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.kor == o2.kor){
                    if (o1.eng == o2.eng){
                        if (o1.math==o2.math){
                            return o1.name.compareTo(o2.name);
                        }
                        return o2.math - o1.math;
                    }
                    return o1.eng - o2.eng;
                }
                return o2.kor - o1.kor;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Student student : line) {
            sb.append(student.name).append('\n');
        }

        System.out.println(sb);
    }
}
