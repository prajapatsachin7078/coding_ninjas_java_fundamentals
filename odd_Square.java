import java.util.Scanner;
public class odd_Square {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int flag = 0;

        for(int i=1;i<=(N*2-1);i+=2){
            flag++;
            for(int j=i;j<=(N*2-1);j+=2){
                System.out.print(j);
            }
            int temp =1;
            for(int p=1;p<=flag-1;p++){
                System.out.print(temp);
                temp=temp+2;
            }
            System.out.println("");
        }
        sc.close();

    }
}
