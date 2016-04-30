package test;
import static org.junit.Assert.*;

import logica.CodeBreaker;

public class TestCodeBreaker {

	CodeBreaker code = new CodeBreaker();
	String isNumber = "";
	@org.junit.Test
	public void isSecretNumber() {
		isNumber = code.isSecretNumber("9581");
		assertEquals("XXXX", isNumber);
	}
	@org.junit.Test
	public void threeInPosition() {
		isNumber = code.isSecretNumber("9582");
		assertEquals("XXX", isNumber);
	}
	@org.junit.Test
	public void twoInPosition() {
		isNumber = code.isSecretNumber("9500");
		assertEquals("XX", isNumber);
		}
	@org.junit.Test
	public void oneInPosition() {
		isNumber = code.isSecretNumber("9000");
		assertEquals("X", isNumber);
		}
	@org.junit.Test
	public void fourthNumbersDesordenation() {
		isNumber = code.isSecretNumber("1958");
		assertEquals("____", isNumber);
		}
	@org.junit.Test
	public void trheeNumberDesordenation() {
		isNumber = code.isSecretNumber("1950");
		assertEquals("___", isNumber);
		}
	@org.junit.Test
	public void twoNumbersDesordenation() {
		isNumber = code.isSecretNumber("1900");
		assertEquals("__", isNumber);
		}
	@org.junit.Test
	public void oneNumbersDesordenation() {
		isNumber = code.isSecretNumber("1000");
		assertEquals("_", isNumber);
		}
	@org.junit.Test
	public void zeroNumbersDesordenation() {
		isNumber = code.isSecretNumber("0000");
		assertEquals("", isNumber);
		}
	@org.junit.Test
	public void oneTrueTwoDesordenation() {
		isNumber = code.isSecretNumber("9018");
		assertEquals("X__", isNumber);
		}


}
