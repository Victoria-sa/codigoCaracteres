package codigoCaracteres;

public class MostrarUnicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//bucle que muestra los codigos unicode desde 0x0000 a 0xFFFF
		//en la siguiente instruccion for , al ser codepoint toma su valor decimal
		for(int codePoint=0x0000;codePoint<=0xFFFF;codePoint++) {
			//haceos un casteo a su representacion exadecimal
			String codigo=Integer.toHexString(codePoint);
			//en la siguiente linea ussmos\\ para escapr la barra y representar junto con codigo
			//el codigo unicode y casteamos a char del codepoint para que muestr el valor de cahr de
			//ese codigo
			System.out.println("\\u"+ codigo +':'+(char)codePoint);
			
			
		}
	}

}
