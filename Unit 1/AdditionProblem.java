
//package Unit_1;

import textio.TextIO;

/**
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

	    public String getProblem() {
	    return "Compute the sum: " + x + " + " + y;
	    }

	    public int getAnswer() {
	    return answer;
	    }
public static void main(String args[]) {
	AdditionProblem exo = new AdditionProblem();
	int ans, answer;
	do{
	System.out.println(exo.getProblem());
	 answer = exo.getAnswer();
	 ans = TextIO.getInt();
	 System.out.println("Wrong answer.");
	 System.out.println("Please try again.\n");
	}
	while(ans != answer);

	if (ans == answer) {
		System.out.println("CONGRATULATIONS!!!");
		System.out.println("You won!");
		System.out.println("Because you got the answer!");
	}
}
}
