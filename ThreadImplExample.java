/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class ThreadImplExample implements Runnable {
	
	public void run()	{
		
		System.out.println(Thread.currentThread().getName() + " : started");
		for (int loop = 0; loop < 1000000; loop++)	{
			System.out.println(Thread.currentThread().getName() + " : running");
			
			if (Thread.interrupted())	{
				//weve been interrupted: no more crunching
				break;
			}
		}
		System.out.println(Thread.currentThread().getName() + " : ended");
		
	}

}
