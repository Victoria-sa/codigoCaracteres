package codigoCaracteres;

import java.util.Scanner;
/**
 * 
 * @author Programador
 *
 */
public class RepasoCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//valueof
		//declaramos las cadenas para el ejemplo
		int edad=15;
		String cadena1=String.valueOf(edad);//aqui edad pasa a ser cadena caracteres
		System.out.println("Tu edad es "+ cadena1);
	//	System.out.println("Tu edad es "+(edad+1));//resulta 16(15+1)
	//	System.out.println("Tu edad es "+cadena1+1);//reulta 151
		
		//Otro metodo que compara cadenas
		//equals, se comparan dos cadenas.Devuelve boolean
		String mayorEdad="18";
		if(cadena1.equals(mayorEdad)) {//concion si 18 sigue
			System.out.println(" Eres mayor de edad ");
		}else {
			System.out.println("Eres menor de edad");//o no
		}
		
		
		Scanner lector=new Scanner(System.in);
		System.out.println(" ¿Tienes ganas de comer gachas? -> SI o _No ->");
		String pregunta=lector.next();
		if ( pregunta.equalsIgnoreCase("Si")) {
			System.out.println("Ve al Plinio y comelas");
		}else {
			System.out.println(" Vete  a dormir");
		}
		//regionmatch ->
		//comparaa dos cadenas a partir de un limite de un a con el limite de otra
		System.out.println("*******RegionMatch*******");
		String cadena3="Mi perro es un galan";
		String cadena4="La comida de los perros ";
		System.out.println(cadena3.regionMatches(3, cadena4, 17, 5));//true y  si el 5 lo cambiamos por 6 daria false
		cadena4=cadena4.toUpperCase();//convierto la cadena en mayusculas.
		System.out.println(cadena3.regionMatches(3, cadena4, 17, 5));//Daria false por que cadena4 esta en mayusculña
		System.out.println(cadena3.regionMatches(true, 3, cadena4,17, 5));
		//Con true delante, ignora mayusculas y minusculas.
		
		
	
		
		
		lector.close();
	
	}

}
