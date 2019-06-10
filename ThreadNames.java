/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class ThreadNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadOutputsName nameThread = new ThreadOutputsName();
		//pass to thread class and name it too
		Thread thread = new Thread(nameThread, "My wee Thread");
		thread.start();

	}

}
