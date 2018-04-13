package suppression;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sup extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyRunnable mr = new MyRunnable();
		//Project mr = new Project();
		/*
		Thread t1 = new Thread (new Project(), "A");
		Thread t2 = new Thread (new Project(), "B");
		Thread t3 = new Thread (new Project(), "C");
		Thread t4 = new Thread (new Project(), "D");
		Thread t5 = new Thread (new Project(), "E");
		Thread t6 = new Thread (new Project(), "F");
		Thread t7 = new Thread (new Project(), "G");
		t2.start();
		t1.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();*/
		for (int i = 0; i < 100; i++) {
	        new Thread(new Project()).start();
	    }
		
		//File file = new File ("/Users/mengwang/Desktop/Copy2.txt");
		
		
	}

}
