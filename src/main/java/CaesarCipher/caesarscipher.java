package CaesarCipher;

public class caesarscipher {
private static  final char LETTER_A = 'a';
private static  final char LETTER_Z = 'z';
private static final int ALPHABET_SIZE = 26;

    public String cipher(String message, int offSet) {
    	offSet %= ALPHABET_SIZE;
    	char[] character = message.toCharArray();
    	offSetBy(character,offSet);
	    return new String(character);
    }

	private void offSetBy(char[] character, int offSet) {
		// TODO Auto-generated method stub
		for (int i = 0;i < character.length;++i)
		{ 
			if(character[i] != ' ') {
				character[i] = offSetChar(character[i],offSet,LETTER_A, LETTER_Z);
			}
			
		}
	}

	private char offSetChar(char c, int offSet, char letterA, char letterZ) {
		// TODO Auto-generated method stub
		
		c += offSet;
		if(c < letterA)	{
			return(char) (c + ALPHABET_SIZE);
		}
		if(c > letterZ){
			return(char) (c + ALPHABET_SIZE);
		}
		
		return c;
	}
}
