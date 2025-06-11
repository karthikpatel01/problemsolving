import java.util.Scanner;
public class LargestDigitInaNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=0,rem;
        while(num>0){
            rem=num%10;
            if(rem>=temp){
                temp=rem;
            }
            num=num/10;
        }
        System.out.println(temp);
    }
}