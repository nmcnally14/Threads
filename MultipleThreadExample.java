/**
 * 
 */
package threadsPractice;

/**
 * @author Nicola
 *
 */
public class MultipleThreadExample {
	
	public MultipleThreadExample()	{
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int loop = 0; loop < 1000; loop++)	{
			
			ThreadOutputsName ton = new ThreadOutputsName();
			//set a  number for this thread - just used for output
			ton.number = loop;
			Thread t = new Thread(ton);
			t.start();
		}

	}

}
