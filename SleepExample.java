/**
 * 
 */
package threadsPractice;

import java.util.Random;

/**
 * @author Nicola
 *
 */
public class SleepExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int loop = 1;
		do	{
			haveASleep();
			System.out.println(loop);
			loop++;
		} while (loop < 11);

	}

	public static void haveASleep()	{
		try	{
			System.out.println("About to sleep...");
			Thread.sleep(new Random().nextInt(2000));
			System.out.println("Awake again!");
		} catch (InterruptedException e)	{
			e.printStackTrace();
		}
	}
}
