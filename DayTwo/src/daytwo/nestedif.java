package daytwo;

public class nestedif {
	public static void main(String[] args) {
        int num = 15;

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is positive and even");
            } else {
                System.out.println(num + " is positive and odd");
            }
        } else {
            System.out.println(num + " is not positive");
        }
    }
}
