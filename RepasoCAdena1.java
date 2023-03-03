package codigoCaracteres;

public class RepasoCAdena1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//regionmatch -> compara dos cadenas a partir de un limite de una con el limite y longitud de otra
				String cadena2= "Mi perro ladra mucho";
				String otraCadena= "Un bonito perro blanco";
				boolean b=cadena2.regionMatches(3, otraCadena, 10, 5);//true
				
	}

}
