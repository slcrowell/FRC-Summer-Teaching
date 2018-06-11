import static org.junit.Assert.*;

import org.junit.Test;

/**
 * I made this all by my self.
 * @author Stephen Crowell
 *
 */
public class TheBasicsTest {
	
	@Test
	public void testTest() {
		// This is one of the few you will fix a test. This is more for you to see how tests
		// actually work. See if you can figure out what to do.
		assertEquals(1, TheBasics.test());
	}
	
	@Test
	public void testStrings() {
		System.out.println("PRINT LINE TESTS:");
		TheBasics.printLinePractice("This is", "a test");
		TheBasics.printLinePractice("If this isn't", "the same as that");
		TheBasics.printLinePractice("Then your code", "isn't right");
		
		System.out.println("\nPRINTF TESTS");
		TheBasics.printfPractice("This is", "a test");
		TheBasics.printfPractice("If this isn't", "the same as that");
		TheBasics.printfPractice("Then your code", "isn't right");
	}
	
	@Test
	public void testCompare() {
		assertEquals(1, TheBasics.compare(2, 1));
		assertEquals(0, TheBasics.compare(1, 1));
		assertEquals(-1, TheBasics.compare(0, 1));
		assertEquals(1, TheBasics.compare(-1, -2));
		assertEquals(0, TheBasics.compare(-1, -1));
		assertEquals(-1, TheBasics.compare(-1, 0));
	}
}
