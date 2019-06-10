/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class CountdownController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CountDownThread countdt = new CountDownThread();
		Thread t = new Thread(countdt);
		t.start();

	}

}
