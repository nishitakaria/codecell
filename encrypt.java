/* write a program which will encrypt a message as a Vignere Cipher using a pre decided key. The pre-decided keyword is “CodeCell” AND the text to be encrypted is “Just finished the TSEC CodeCell Challenge”. (The message text and keyword is encrypted after removing spaces, punctuation.) */



import java.util.*;
class vsquare
{
	public static char[][] SQUARE=buildsquare(); 

	public static char[][] buildsquare()
	{
	 	char[][] square = new char[256][256];
        	 for (int i = 'a'; i <= 'z'; i++) {
			char c=(char) i;
           		for (int j = 'a'; j <= 'z'; j++) {
                		if (c > 'z') {
                   		 	c = 'a';
               			 }
                	 square[i][j] = c;
               		 c++;
           		 }
       		 }
        	return square;
    	}
}

class CipherKey 
{
    public final String KEY;

    public CipherKey(String text, String keyword) {
        KEY = generateKey(text, keyword);
    }

	private String generateKey(final String text, final String keyword) {
        StringBuilder key = new StringBuilder();
        for (int i = 0, index = 0; i < text.length(); i++, index++) {
            if (index >= keyword.length()) {
                index = 0;
            }
            key.append(keyword.charAt(index));
        }
        return key.toString();
    }
}

class Encrypter 
{
	public static String encrypt(final String text, final CipherKey key) {
        StringBuilder message = new StringBuilder();
        String k = key.KEY;
        char[][] square = vsquare.SQUARE;
        for (int i = 0; i < k.length(); i++) {
            message.append(square[k.charAt(i)][text.charAt(i)]);
        }
        return message.toString();
    }
}
	
class encrypt
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text (only in lowercase): ");
		String text= sc.nextLine();
		System.out.println("Enter the keyword: ");
		String keyword= sc.nextLine();
 		CipherKey cipherKey = new CipherKey(text, keyword);
		String message = Encrypter.encrypt(text, cipherKey);
       		System.out.println("Encrypted message: " + message);
	}
}


/*Output:

C:\Users\hp\Desktop\practice>java encrypt
Enter the text (only in lowercase):
justfinishedthetseccodesellchallenge
Enter the keyword:
codecell
Encrypted message: livxhmytuvhhvlpeusfgqhpdgzogjewwgbji
*/		
		
		