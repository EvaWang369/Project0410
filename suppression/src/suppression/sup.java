package suppression;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyRunnable mr = new MyRunnable();
		Project mr = new Project();
		
		Thread t1 = new Thread (new Project(), "A");
		Thread t2 = new Thread (new Project(), "B");
		
		t1.start();
		t2.start();
		
		//File file = new File ("/Users/mengwang/Desktop/Copy2.txt");
		
		
	}

}
