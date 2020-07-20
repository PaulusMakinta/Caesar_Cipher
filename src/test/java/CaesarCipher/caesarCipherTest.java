package CaesarCipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class caesarCipherTest {
	
	private caesarscipher caesar = new caesarscipher();
	
	
	@Test
	void testEmptyString() {
		assertEquals("",caesar.cipher("", 12) );
	}
	
}
