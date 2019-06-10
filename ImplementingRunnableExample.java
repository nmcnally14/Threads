/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class ImplementingRunnableExample implements Runnable {
	
	public void run()	{
		
		do	{
			System.out.println("My 2nd thread running away.....");
		} while (true);
	}

}
