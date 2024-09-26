import java.util.Scanner;

public class nth_Bit {
    public static void main(String[] args) {
        int num ,n;
        int[] binary = new int[32];
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num = sc.nextInt();
        System.out.println("enter the nth bit to find");
         n = sc.nextInt();
        while(num!=0){
            int rem = num % 2;
            binary[index]=rem;
            num= num / 2;
            index++;
        }
        System.out.println("The binary number of num is: ");
        for(int i = index-1; i>=0;i--){
            System.out.print( binary[i]);
        }
        System.out.println("bit is :");
        for(int j=0; j< binary.length;j++){
            if(j==n){
             System.out.println(binary[j]);
            }
        }

    }
}
