import java.util.Scanner;
public class sum_Pattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // System.out.println("WelCome!");
        for(int i=1;i<=N;i++){
            int sum=0;

            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j!=i){
                    System.out.print("+");
                }
                sum+=j;
            }
            System.out.println("="+sum);
        }
    }
}
