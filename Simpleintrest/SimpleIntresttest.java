package Simpleintrest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleIntresttest {

	@Test
	void test() {
		SimpleIntrest simpleIntrest =new SimpleIntrest();
		assertEquals(0.120, simpleIntrest.calculateIntrest(2.0, 2.0,3.0 ));
		assertEquals(2, simpleIntrest.compoundIntrest(1, 1, 1, 1));

	}

}
