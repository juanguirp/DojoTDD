package test;
import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		assertEquals(2, 2);
	}
	
	@org.junit.Test
	public void test2() {
		assertNotEquals(2, 3);
	}

}
