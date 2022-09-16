import java.util.Scanner;
public class zero_star_pattern {
    public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int col = 2*N + 1;
        int i=1;
        while(i<=N){
            int j=1;
            while(j<=col){
                if((j==i)||(j==(col/2)+1)||(j==col-i+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
                j++;
            }
            System.out.println("");
            i++;
        }
	}	

    
}
