import java.util.Scanner;

public class experimentalPi{
	public static void main(String[] args) {
		long runs = 0;
        long onCircle = 0;
        double x;
        double y;
        double estimate = 0;
        
        //ask for the input of how many approximations
        Scanner in = new Scanner(System.in);
        System.out.println("How many times would you like to run this program?");
        runs = in.nextLong();
        
        //go through the number of runs and choose random coordinates
        for (int i = 0; i < runs; i++) {
        	System.out.println("Run " + (i + 1) + " of " + runs + " times.");
                x = Math.random();
                y = Math.random();
                //check if the point's distance from the center is less than the radius which would make it on the circle
                if (((x*x) - x + (y*y) - y )<= -.25) {
                    onCircle++;
                }
        }
        estimate = 4 * (double) onCircle / (double) runs;
        System.out.println("The estimated value of pi is " + estimate);
	}
}