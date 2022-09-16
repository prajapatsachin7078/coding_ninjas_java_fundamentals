import java.util.Scanner;
    public class h_diamond_Pattern 
    {

        public static void main(String[] args) 
        {
            // Write your code here
            Scanner scanner=new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.close();
            int i,temp;
            System.out.println("*");
            for(i=1;i<=N;i++){
                temp=i;
                System.out.print("*");

                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }

                for(int k=1;k<=temp-1;k++){
                    System.out.print(temp-k);
                }

                System.out.print("*");
                System.out.println("");
            }

            for(i=N-1;i>=1;i--){
                System.out.print("*");

                for(int p=1;p<=i;p++){
                    System.out.print(p);
                }

                for(int q=i-1;q>=1;q--){
                    System.out.print(q);
                }

                System.out.print("*");
                System.out.println("");
            }
            System.out.print("*");
            // scanner.close();
        }
    }
