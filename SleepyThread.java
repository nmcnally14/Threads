/**
 * 
 */
package threadsPractice;

import java.util.Random;

/**
 * @author Nicola
 *
 */
public class SleepyThread implements Runnable {
	
	@Override
	public void run()	{
		
		try	{
			System.out.println("Sleepy Thread - about to sleep");
			Thread.sleep(new Random().nextInt(20000));
			System.out.println("Sleepy Thread- awake again!");
		} catch (InterruptedException e)	{
			System.out.println("Sleepy Thread - Interrupted!");
		}
	}

}
