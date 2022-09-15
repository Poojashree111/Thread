package thread;
class A1 extends Thread
{
    public void run ()
    {
        System.out.println ("Thread A");
        System.out.println ("i in Thread A ");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println ("i = " + i);
            try
            {
                Thread.sleep (1000);
            } 
            catch (InterruptedException e)
            {
                e.printStackTrace ();
            }
        }
        System.out.println ("Thread A Completed.");
    }
}

class B extends Thread
{
    public void run ()
    {
        System.out.println ("Thread B");
        System.out.println ("i in Thread B ");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println ("i = " + i);
        }
        System.out.println ("Thread B Completed.");
    }
}
public class Lifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 threadA = new A1 ();
        B threadB = new B ();
       
        threadA.start ();
        
        threadA.yield ();
       
        try
        {
            threadA.sleep (1000);
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace ();
        }
        threadB.start ();
        System.out.println ("Main Thread End");
    }


	}


