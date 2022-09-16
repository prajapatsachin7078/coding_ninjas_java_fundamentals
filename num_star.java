import java.util.Scanner;
public class num_star {
    public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = N;j >= 1; j--){
                if(i==j){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println("");
        }

	}
    
}
