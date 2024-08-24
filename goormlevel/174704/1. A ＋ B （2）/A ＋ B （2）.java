import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Double A = Double.parseDouble(st.nextToken());
		Double B = Double.parseDouble(st.nextToken());
		
		System.out.printf("%.6f", A+B);
	}
}