/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
public class TwinPrimes
{
    public static ArrayList<Integer> primeNumbers(int startNum,int endNum){
        ArrayList<Integer> primes=new ArrayList<Integer>();
        int count=0,i,j;
        for(i=startNum;i<=endNum;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
        if(count==2){
           primes.add(i); 
        }
    }
        return primes;
    }
	public static void main(String[] args) {
		ArrayList<Integer> a = primeNumbers(2,100);
		for(int i=0;i<a.size();i++){
		    for(int j=1;j<a.size();j++){
		        if(a.get(j)-a.get(i)==2){
		            System.out.println("("+a.get(i)+","+a.get(j)+")");
		        }
		    }
		}
	}
}
