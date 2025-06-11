import java.util.Scanner;
public class Day9 {
    public static boolean isPrime(int num){
        int count=0,i;
        for(i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }   
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isArmstrong(int num){
        int count=0,temp=num;
        while(num>0){
            int rem=num%10;
            count=count+rem*rem*rem;
            num/=10;
        }
        if(temp==count){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isPalindrome(int num){
        int count=0,i,temp=num;
        while(num>0){
            int rem=num%10;
            count=count*10+rem;
            num/=10;
        }
        if(temp==count){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int oddSum=0,evenSum=0,temp=num;
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
                evenSum+=rem;
            }
            else{
                oddSum+=rem;
            }
            num/=10;
        }
        if(evenSum>oddSum){
            if(isPrime(temp)){
                System.out.println(temp+" is Prime number.");
            }
            else{
                System.out.println(temp+" is not a Prime number.");
            }
        }
        else if(oddSum>evenSum){
            if(isArmstrong(temp)){
                System.out.println(temp+" is Armstrong.");
            }
            else{
                System.out.println(temp+" is not an Armstrong number.");
            }
        }
        else{
            if(isPalindrome(temp)){
                System.out.println(temp+" is Palindrome number.");
            }
            else{
                System.out.println(temp+" is not a Palindrome number.");
            }
        }
    }
}
