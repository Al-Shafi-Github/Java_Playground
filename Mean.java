import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        double[] vals = new double[10];
        System.out.print("Please enter to double values: ");

        for (int i = 0; i < 10; i++) 
            vals[i] = in.nextDouble();
    
        System.out.printf("The average is: %.2f", average(vals));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double val : array) 
            sum += val;
        return sum / array.length;
    }

}
