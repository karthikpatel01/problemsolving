import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num,sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num/=10;
        }  
        //System.out.println(sum); 
        if(temp%sum==0){
            System.out.println(temp+" is a harshad number.");
        }
        else{
            System.out.println(temp+" is not a harshad number.");
        }
    }
}
