import java.util.Scanner;
public class StrongNumber{
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int temp=num,rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+factorial(rem);
            num/=10;
        }
        if(sum==temp){
            System.out.println("The "+temp+" is a Strong number.");
        }
        else{
            System.out.println("The "+temp+" is not a Strong number.");
        }
    }
}