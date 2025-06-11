public class EvensinaDigit {
	public static void main(String[] args) {
		int startNum=50,endNum=100;
		for(int i=startNum;i<=endNum;i++){
		    int temp=i;
		    while(temp>0){
		        int rem=i%10;
		        if(rem%2==0){
		            System.out.print(i+" ");
                    break;
		        }
		        temp=temp/10;
		    }
		}
	}
}
