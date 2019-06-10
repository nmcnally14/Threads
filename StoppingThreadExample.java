/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class StoppingThreadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SleepyThread sleepyThread = new SleepyThread();
		Thread thread = new Thread(sleepyThread);
		thread.start(); // Sleepyhead = having a random sleep
		//main thread to have a sleep too
		
		try	{
			System.out.println("Main thread - going for a small sleep");
			Thread.sleep(2000);
			System.out.println("Main thread - awake");
		} catch (InterruptedException e)	{
			
		}
		//before main thread finishes ensure the sleepy thread is done
		System.out.println("Main thread - checking if sleepyThread is awake");
		if (thread.isAlive())	{
			System.out.println("Main thread - sleepyThread sleeping. Going to interrupt it!");
			//still alive - interrupt
			thread.interrupt();
		}
		System.out.println("Main finished");

	}

}
