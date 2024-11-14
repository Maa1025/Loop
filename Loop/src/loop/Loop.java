package loop;

public class Loop { //class name

    public static void main(String[] args) {
        //Declare the varaible
        int sumEven = 0;
        int sumOdd = 0;

        //formula for even number
        System.out.println("Even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sumEven += i;
            }
        }
        //Output for even number
        System.out.println("\nSum of even numbers: " + sumEven);

        //Formula for odd number
        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumOdd += i;
            }
        }
        //Output for odd number
        System.out.println("\nSum of odd numbers: " + sumOdd);
    }
}