package Lab2;

public class SumofArrayElements {
	public static void main(String[] args) {
        int[]  arr = {23,67,45,78,45};

        int sum = 0;

        for (int i=0;i<arr.length;i++) {
        	sum=sum+arr[i];
        }

        System.out.println("Sum of Array Elements = "+sum);
    }
}
