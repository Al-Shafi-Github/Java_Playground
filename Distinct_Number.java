import java.util.Scanner;

public class Distinct_Number {

	public static void main(String[] args) {
		//TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int index = 0;
        System.out.print("Enter ten numbers: ");


        for (int i = 0; i < numbers.length; i++) {
            int num = input.nextInt();

            if (isNew(numbers, num)) {
                numbers[index++] = num;
            }
        }
        System.out.println("The number of distinct number is " + index);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean isNew(int[] numbers, int n) {

        for (int i : numbers){
            if (n == i) return false;
        }
        return true;
    }
}