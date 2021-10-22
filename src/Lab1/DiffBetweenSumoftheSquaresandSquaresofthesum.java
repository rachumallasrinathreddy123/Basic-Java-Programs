package Lab1;

public class DiffBetweenSumoftheSquaresandSquaresofthesum {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int n = 10,diff,sumofsquares=0,squaresofsum=0;
		for(int i=1;i<=n;i++) {
			sumofsquares=sumofsquares+(i*i);
			return;
		}
		for(int i=1;i<=n;i++) {
			int sum=(n*(n+1)*(2*n+1))/6;
			squaresofsum=(sum*sum);
			return;
		}
		diff=(sumofsquares-squaresofsum);
		System.out.println("Diff Between Sum of Squares and Squares of Sum =" + diff);
	}
}
