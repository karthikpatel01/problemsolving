public class Sumdigitsisprimeornot{
    public static boolean primeChecker(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int startNum=2,endNum=50,sum,temp,i;
        for(i=startNum;i<=endNum;i++){
            temp=i;
            //System.out.print(temp+" ");
            sum=0;
            while(temp>0){
                int rem=temp%10;
                sum=sum+rem;
                temp/=10;
            }
            //System.out.println(sum+" "+i);
            //int count=0;
            //for(int j=1;j<=sum;j++){
              //  if(sum%j==0){
                //    count++;
                //}
           // }
            //if(count==2){
              //  System.out.print(i+" ");
            //}
            if(primeChecker(sum)){
                System.out.print(i+" ");
            }
        }
    }
}
