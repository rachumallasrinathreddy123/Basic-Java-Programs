package Lab2;

public class SecondSmallestArray {
	public static void main(String args[]) {
		 int [] arr = new int [] {1, 5, 6, 4, 3};  
	        System.out.println("Original array: ");  
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	    System.out.println("Second Smallest Element of the Array is = "+arr[1]);
	}
}
