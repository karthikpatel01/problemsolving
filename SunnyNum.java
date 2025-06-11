import java.util.Scanner;
public class SunnyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt()+1;
        for(int i=1;i<=num;i++){
            if(Math.sqrt(num)==Math.pow(i,2)){
                System.out.print("True");
            }
        }
    }
}
