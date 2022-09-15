package thread;
import java.lang.*;  

public class Priorities_Thread extends Thread   
{  
  
  
public void run()  
{  
  
System.out.println("Inside the run() method");  
}  
  
 
public static void main(String argvs[])  
{  
  
Priorities_Thread th1 = new Priorities_Thread();  
Priorities_Thread th2 = new Priorities_Thread();  
Priorities_Thread th3 = new Priorities_Thread();  
  

  
 
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  
  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
 
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
  
th1.setPriority(6);  
th2.setPriority(3);  
th3.setPriority(9);  
  
  
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  
  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
  
System.out.println("Priority of the thread th3 is : " + th3.getPriority());  
  
 
  
   
System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
  
  
Thread.currentThread().setPriority(10);  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
}  
}  



