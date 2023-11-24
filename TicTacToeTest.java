package yg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTacToeTest {

	@Test
	void nullSwapToNumbersNotNull() {
		PlayerIdentity [] pinull = {null,null,null,null,null,null,null,null,null};
		String [] floater = Display.swapToNumbers(pinull);
		assertNotNull(floater);
	}
	@Test
	void mixedSwapToNumbersNotNull() {
		PlayerIdentity [] pinull = {PlayerIdentity.x,null,PlayerIdentity.o,null,null,null,null,null,null};
		String [] floater = Display.swapToNumbers(pinull);
		
		assertEquals(floater[0],"x");
	}
	
	@Test
	void swapToNumbersArraySame() {
		PlayerIdentity [] pinull = {PlayerIdentity.x,null,PlayerIdentity.o,null,null,null,null,null,null};
		String [] floater = Display.swapToNumbers(pinull);
		String [] expected = {"x","1","o","3","4","5","6","7","8"};
		assertArrayEquals(expected,floater);
	}
	
	@Test
	void nullSwapToNumbers() {
		PlayerIdentity [] pinull = {PlayerIdentity.x,null,PlayerIdentity.o,null,null,null,null,null,null};
		String [] floater = Display.swapToNumbers(pinull);
		
		assertEquals(floater[1], "1");
	}
	@Test
	void swapToNumbersArraySameAllNull() {
		PlayerIdentity [] pinull = {null,null,null,null,null,null,null,null,null};
		String [] floater = Display.swapToNumbers(pinull);
		String [] expected = {"0","1","2","3","4","5","6","7","8"};
		assertArrayEquals(expected,floater);
	}

}
