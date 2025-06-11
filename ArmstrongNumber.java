import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int temp=num,rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+rem*rem*rem;
            num/=10;
        }
        if(sum==temp){
            System.out.println("The "+temp+" is a Armstrong number.");
        }
        else{
            System.out.println("The "+temp+" is not a Armstrong number.");
        }
    }
}
