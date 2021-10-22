package Lab1;

public class SumofNaturalnumbers {
	public static void main(String args[]) {
		int n=10,sum=0;
        for (int i = 0; i <= n; i++) { 
        	if(i%3==0||i%5==0)
        		sum=sum+i;
        }
            System.out.print("Sum of n natural numbers divisible by 3 or 5=" +sum);
	}
}
