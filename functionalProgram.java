package funcional;
import java.util.Scanner;
class functionalProgram{
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("COMPUTE DISTANCE FROM ORIGIN");
	        System.out.println("ENTER COORDINATES  X & Y");
	        // input point coordinates
	        int x = sc.nextInt();
	        int y = sc.nextInt();


	        
	        double distance = Math.sqrt(
	                Math.pow(x, 2) + Math.pow(y, 2));

	        System.out.println("Distance from (0, 0) to (" +
	                x + ", " + y + ") is " +
	                distance);

	    } 
   }