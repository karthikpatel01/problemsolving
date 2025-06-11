import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mul=1;
        if(num==0){
            System.out.println("Factorial of "+num+" is "+1);
        }
        else if(num>0){
            for(int i=1;i<=num;i++){
                mul*=i;
            }
            System.out.println("Factorial of "+num+" is "+mul);
        }
        else{
            System.out.println("Enter the number a positive number.");

        }
    }
}
