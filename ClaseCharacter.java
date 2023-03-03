package codigoCaracteres;

public class ClaseCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a='8';
		char b='c';
		char c=' ';
		char d='&';
		char e='\n';
		System.out.println(Character.isDigit(b));//falso
		System.out.println(Character.isLetterOrDigit(b));//true
		System.out.println(Character.isLetter(a));//false
		System.out.println(Character.isUpperCase(a));//false
		System.out.println(Character.isWhitespace(d));//false
		System.out.println(Character.isWhitespace(e));//false
		System.out.println(Character.isSpaceChar(c));//true
		System.out.println(Character.isLowerCase(b));//true
		

	}

}
