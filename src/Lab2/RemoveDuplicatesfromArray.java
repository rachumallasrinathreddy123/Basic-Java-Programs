package Lab2;

public class RemoveDuplicatesfromArray {
	public static void main(String[] args) {
		int[] a = new int[] { 4, 7, 6, 7, 8, 3, 2 };
		System.out.println("Duplicate elements in given array: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.println(a[i]);
			}
		}
	}
}
