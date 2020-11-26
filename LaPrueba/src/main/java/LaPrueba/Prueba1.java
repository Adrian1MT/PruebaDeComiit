package LaPrueba;

public class Prueba1 {

	public static void main(String[] args) {
		int numero= (int) (Math.random()*6) ;
		System.out.println(aleatorio(numero));
	}

	public static String aleatorio(int numero) {
		String texto;
		if (numero<2) {
			texto="menor";
		}else {
			texto="mayor";
		}
		return texto;
		
	}
}
