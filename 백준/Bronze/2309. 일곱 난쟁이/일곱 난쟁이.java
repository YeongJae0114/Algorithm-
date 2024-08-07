import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarves = new int[9]; 
        int sum = 0;
        for(int i = 0; i < dwarves.length; i++){
            dwarves[i] = Integer.parseInt(br.readLine());
            sum += dwarves[i];
        }
        int diff = sum - 100;
        int exclude1 = -1, exclude2 = -1;

        for(int i = 0; i < dwarves.length; i++){
            for(int j = i + 1; j < dwarves.length; j++){
                if(dwarves[i] + dwarves[j] == diff){
                    exclude1 = i;
                    exclude2 = j;
                    break;
                }
            }
            if(exclude1 != -1) break;
        }

        int[] result = new int[7];
        int idx = 0;
        for(int i = 0; i < dwarves.length; i++){
            if(i != exclude1 && i != exclude2){
                result[idx++] = dwarves[i];
            }
        }
        
        Arrays.sort(result);
        
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
