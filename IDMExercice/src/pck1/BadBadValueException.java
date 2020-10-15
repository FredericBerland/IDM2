package pck1;

import java.io.PrintStream;
import java.io.PrintWriter;

public class BadBadValueException extends Exception {

	@Override
	public void printStackTrace() {
		System.out.println("You gave a bad bad value !");
	}

	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		System.out.println("You gave a bad bad value !");
	}

	@Override
	public void printStackTrace(PrintWriter s) {
		// TODO Auto-generated method stub
		System.out.println("You gave a bad bad value !");
	}
	
	
	
}
