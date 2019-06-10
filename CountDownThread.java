/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class CountDownThread implements Runnable {
	
	@Override
	public void run()	{
		
		int loop = 10;
		do {
			System.out.println(loop);
			loop--;
			try	{
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interupted");
			}
		} while (loop > 0);
		
	}

}
