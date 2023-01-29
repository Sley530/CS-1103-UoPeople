
//package Unit_1;

import textio.TextIO;

/**
 * This program will help the user to execute
 * some simple addition operations based random numbers
 * the program will terminate only if the user provides
 * the good answer. Otherwise the program will keep asking
 * the same operation.
 *
 * @author Sley
 *
 */

public class AdditionProblem {

	    private int x,y,answer;

	    public AdditionProblem() {
	         x = (int)(10 + 40 * Math.random());
	         y = (int)(30 * Math.random());
	         answer = x + y;
	     }

		 /**
	     * This function will display the operation
	     * so that the user can answer.
	     *
	     * @return operation
	     */
	    public String getProblem() {
	    return "Compute the sum: " + x + " + " + y;
	    }

		/**
	     * This function executes the operation and
	     * return the good answer.
	     *
	     * @return answer
	     */
	    public int getAnswer() {
	    return answer;
	    }

public static void main(String args[]) {
	AdditionProblem exo = new AdditionProblem();
	int ans, answer;

	do {
	System.out.println(exo.getProblem());
	 answer = exo.getAnswer();
	 ans = TextIO.getInt();
	 System.out.println("Wrong answer.");
	 System.out.println("Please try again.\n");
	}
	while (ans != answer);

	if (ans == answer) {
		System.out.println("CONGRATULATIONS!!!");
		System.out.println("You won!");
		System.out.println("Because you got the answer!");
	}
}
}
