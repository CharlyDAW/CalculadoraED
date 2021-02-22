
	/**
	 * Representa la operación de resta, recibe los parámetros que introduce el usuario, y procede a realizar la operación aritmética, 
	 * siempre que los parámetros se encuentren dentro del dominio matemático designado a cada tipo de resta. 
	 * 
	 * Por ejemplo: Si en resta2, el usuario introduce operandos que no son de tipo entero, 
	 * pedirá introducir ese tipo de números para poder realizar continuar con la operación.
	 * 
	 * @author <b>Carlos Fuentes Vázquez</b>
	 * @version 2.0
	 * 
	 */
public class Resta {

	public static void main (String [] args) {
		System.out.println("hola que tal, todo bien por aqui");
	}
	/** 
	 * <b>Método 1:</b>  Resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida, que será la solución.
	 *  
	 * @param num1 
	 * 			Primer número a restar que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo número a restar que introduce el usuario (double)
	 *
	 * @return <b>rest1</b> Devuelve la resta de num1 y num2
	 * 		
	 */
	
	public double restar1 (double num1, double num2) {
		return num1 - num2;
	}

	/** 
	 * <b>Método 2:</b>  Resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	 *  
	 * @param num1 
	 * 			Primer número a restar que introduce el usuario (int)
	 * @param num2 
	 * 			Segundo número a restar que introduce el usuario (int)
	 *
	 * @return res2 
	 * 			Devuelve la resta de num1 y num2 (int)
	 * 
	 */
	
	public int restar2 (int num1, int num2) {
		return num1 - num2;
	}

	/** 
	 * <b>Método 3:</b>  Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
	 * 
	 * @param num1 
	 * 			Primer número a restar que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo número que a estar introduce el usuario (double)
	 * @param num3 
	 * 			Tercer número que a restar introduce el usuario (double)
	 *
	 * @return <b>rest3</b> 
	 * 			Devuelve la resta de los parámetros num1, num2 y num3 (double)
	 */
	
	public double restar3 (double num1, double num2, double num3) {
		return num1 - num2 - num3;
	}

	/** 
	 *<b>Método 4:</b>  Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
	 *  
	 * @param acum 
	 * 			Representa el valor resultante de una resta anterior (double)
	 * @param num1 
	 * 			Representa el número a restar que introduce el usuario para que se reste al acumulado en memoria (double)
	 *
	 * @return <b>rest4</b> 
	 * 			Devuelve la resta de acum y num1 (double)
	 */
	
	public double restar4 (double acum, double num1) {
		return acum + num1;
	}
	
	/**
     * <b>Casos Especiales</b>:
     * 
     * Es posible que num1, num2 o num3 tengan el valor 0
     * Los resultados de los métodos pueden devolver un número negativo si se introducen  números negativos
     * En el método 1, los parámetros num1 y num2 pueden ser constantes, por ejemplo, el número PI
     * Si en el método 2 y/o en el método 4, el usuario introduce un número no real, el programa ejecutará un mensaje de error por un desbordamiento de variable
     * 
     */
	
	public void especiales() {
		 return;
	 }

}
