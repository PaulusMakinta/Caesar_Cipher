package CaesarCipher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = "How are you doing today";
		int offSet = 12;
		
       caesarscipher caesar = new caesarscipher();
       caesar.cipher(message, offSet);
       
       String encrypted = caesar.cipher(message, offSet);
       
       System.out.println("Message: " + message);
       System.out.println("off Set : " + offSet);
       System.out.println("Encrypted : " + encrypted);
       
	}

}
