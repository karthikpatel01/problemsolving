import java.util.Scanner;
public class NeonNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int squareNum=num*num,sum=0,rem;
        while(squareNum>0){
            rem=squareNum%10;
            sum+=rem;
            squareNum/=10;
        }
        if(sum==num){
            System.out.println(num+" is a neon number.");
        }
        else{
            System.out.println(num+" is not a neon number.");
        }
    }
}