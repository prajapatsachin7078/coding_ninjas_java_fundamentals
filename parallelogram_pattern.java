import java.util.Scanner;
public class parallelogram_pattern {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        // int space=0;
        for(int i=1;i<=num;i++){
            {
                if(i>0){
                    for(int spaces=1;spaces<i;spaces++){
                        {
                            System.out.print(" ");
                        }
                    }
                    for(int j=1;j<=num;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }
    }
}

