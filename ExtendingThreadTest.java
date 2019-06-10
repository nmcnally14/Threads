/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class ExtendingThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SubclassingThreadClass stc = new SubclassingThreadClass();
		//start the thread
		stc.start();
		do 	{
			System.out.println("Main thread. Running away......");
		} while (true);

	}

}
