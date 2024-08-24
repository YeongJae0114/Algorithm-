import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        char[] ch = input.toCharArray();
        for (char c: ch) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            System.out.print(c);
        }
	}
}