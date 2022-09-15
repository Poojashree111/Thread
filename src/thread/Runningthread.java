package thread;

import java.io.*;

class  Runningthread1  extends Thread {
	
	public void run()
	{
		System.out.println("Overridden Run Method");
	}
}
public class Runningthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runningthread1 t1 = new Runningthread1();
		Runningthread1 t2 = new Runningthread1();
				t1.start(); 
				t2.start();

				
				ThreadGroup threadGroup
					= Thread.currentThread().getThreadGroup();

				
				int threadCount = threadGroup.activeCount();

				Thread threadList[] = new Thread[threadCount];
				
				threadGroup.enumerate(threadList);

				System.out.println("Active threads are:");
			
				
				for (int i = 0; i < threadCount; i++)
					System.out.println(threadList[i].getName());
			}
		


	}


