package codigoCaracteres;

public class ClaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1="hola mundo";
	    String cadena2="HOLA MUNDO";
	    System.out.println(cadena1.equalsIgnoreCase(cadena2));//true
	    System.out.println("Metodo equals ->"+cadena1.equals(cadena2));//false
	    //envio de cadena como parametro a funcion y recibe otra cadena como resultado
	    System.out.println("String metodo --->"+cambio(cadena1)  );
	    //Metodo charAt
	    char letra=cadena1.charAt(5);
	    System.out.println("Metdo chartAt   ->>\t"+letra);
	    //metodo concat
	    String cadena3="! Que bien que s viernes";
	    System.out.println("Metodo concat   --->\t"+cadena2.concat(cadena3));
	    //StarWith
	  System.out.println("Metdo StarWith --->\t"+cadena2.startsWith("HOl"));
	  //endsWith
	  System.out.println("Metodo endsWith --->\t"+cadena2.endsWith("MDO"));
	  //Strip -Elimina espacios comienzo y final no los intermedio
	  String cadena4=" es una pureba";
	  System.out.println("Metdo strip  ---->\t"+cadena4.strip());
	  //stripLeading
	  System.out.println("Metodo stripLeading --->\t"+cadena4.stripLeading());
	  //stripTrailing-Elimina solo espacios al final
	  System.out.println("Metodo stripTrailing --->\t"+cadena4.stripTrailing());
	  //longitud cadenas.lengt
	  System.out.println("Metod length -->\t"+cadena2.length());
	  //substring obtener una subcadena indicando inicio
	  System.out.println("Metdo substring --->\t"+cadena2.substring(0));
	//substring obtener una subcadena indicando inicio y final
	  System.out.println("Metdo substring --->\t"+cadena2.substring(5,cadena2.length()));
	  //isEmpty -cadena vacia
	  System.out.println("Metod isEmpty --->\t"+cadena2.isEmpty());//solo si length es0=true
	  String cadena6="";
	  System.out.println("Metdo isBlank --->\t"+cadena6.isBlank());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
   //creamos metodo
	static String cambio(String palabra) {
		
		String convertir="Adios";
		return convertir;
	}
}
