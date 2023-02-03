package Unit_1;

import textio.TextIO;

public class excercises {
		
		/**
		 * Returns the larger of the two roots of the quadratic equation
		 * A*x*x + B*x + C = 0, provided it has any roots.  If A == 0 or
		 * if the discriminant, B*B - 4*A*C, is negative, then an exception
		 * of type IllegalArgumentException is thrown.
		 */
		
		static public Result root( double A, double B, double C )
		                              throws IllegalArgumentException {
		    if (A == 0) {
		      throw new IllegalArgumentException("A can't be zero.");
		    }
		    else {
		       double disc = B*B - 4*A*C;
		       if (disc < 0) {
		          throw new IllegalArgumentException("Discriminant < zero.");
		       }
		       double x1=(-B + Math.sqrt(disc)) / (2*A);
		       double x2= (-B - Math.sqrt(disc)) / (2*A);
		       Result result = new Result(x1,x2);
		       
		       return  result;
		       
		    }
	}
	
		
		public static void main(String[] args) {
		
			System.out.println("This program will ask you to enter three double "
				+ "values for the A, B, and C coefficients of a quadratic "
				+ "equation, and it will print the root.");
			System.out.println("It will allow you to continue entering "
				+ "equations until you do not want to continue.");
			System.out.println();
		
			double A;  // Leading coefficient
			double B;  // Linear coefficient
			double C;  // Constant term
			boolean wantToContinue = true;
		
		while (wantToContinue) {
			System.out.print("Enter value for A: ");
			A = TextIO.getDouble();
			System.out.println("Enter value for B: ");
			B = TextIO.getDouble();
			System.out.println("Enter value for C: ");
			C = TextIO.getDouble();
			
			Result result;  // Result of root() subroutine
			
			try {
				result = root(A, B, C);
				System.out.println();
				System.out.println("S = {" + result.X1() + "; " + result.X2()+"}");
			} 
			catch (IllegalArgumentException e) {
				System.out.println();
				System.out.println("Error: " + e.getMessage());
			}
			
			System.out.println();
			System.out.println("Would you like to continue? Y/N");
			wantToContinue = TextIO.getBoolean();
		} // end while
	}
}
