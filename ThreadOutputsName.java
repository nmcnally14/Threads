/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class ThreadOutputsName implements Runnable{
	
	public int number = 0;
	
	@Override
	public void run()	{
		
		System.out.println("Thread "+number +" started");
		
	}

}
