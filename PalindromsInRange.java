import java.util.Scanner;
public class PalindromsInRange{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int start=sc.nextInt();
        System.out.println("Enter the ending number:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            int temp=i,sum=0;
            while(temp>0){
                int rem=temp%10;
                sum=rem+sum*10;
                temp/=10;
            }
            if(sum==i){
            System.out.print(i+" ");
            }
        }
    }
}
