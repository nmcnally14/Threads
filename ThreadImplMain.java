/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class ThreadImplMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadImplExample tie = new ThreadImplExample();
		Thread thread = new Thread(tie);
		thread.start();
		
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
