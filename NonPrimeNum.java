import java.util.Scanner;
public class NonPrimeNum {
    public static void main(String[] args) {
        int count=0,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int start=sc.nextInt();
        System.out.println("Enter the ending number:");
        int end=sc.nextInt();
        for(i=start;i<=end;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count>2){
                System.out.print(i+" ");
            }
        }
    }
}
