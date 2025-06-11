import java.util.Scanner;
public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int evenCounter=0,oddCounter=0,temp=num;
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
                evenCounter+=1;
            }
            else{
                oddCounter+=1;
            }
            num/=10;
        }
        System.out.println("The Number "+temp+" has "+evenCounter+" even digits and "+oddCounter+" odd digits.");
    }
}
