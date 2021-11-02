package Exercise3;

import java.util.Scanner;
public class EmployeName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name:  ");
		String fname = sc.nextLine();
		System.out.println("Enter the last name:  ");
		String lastname = sc.nextLine();
		try {
			if (fname.isEmpty() || lastname.isEmpty()) {
				throw new validateNameException();

			}
		} catch (validateNameException v) {
			System.out.println("Firstname and lastName cannot be blank");
		} finally {
			System.out.println("your name is : " + fname + " " + lastname);

		}

	}

}
class validateNameException extends Exception {
}
