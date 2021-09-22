package cursoJava;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		double i =10;
		System.out.println("Operadores Aritméticose atribuições");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i +5));
		System.out.println("i = " + i + " - 5 | i = " + (i -5));
		System.out.println("i = " + i + " * 5 | i = " + (i *5));
		System.out.println("i = " + i + " / 5 | i = " + (i /5));
		System.out.println("------------");
		System.out.println("i = " + i + " % 5 | i = " + (i %5));
		// % é Resto da divisão
		System.out.println("------------");
		System.out.println("i += 5       | i =" + (i += 5));
		System.out.println("i -= 5       | i =" + (i -= 5));
		System.out.println("i *= 5       | i =" + (i *= 5));
		System.out.println("i /= 5       | i =" + (i /= 5));
		i ++; //Soma 1 a Váriavel
		System.out.println(" i++         |i = " + i);
		i --; //diminui 1 a Váriavel
		System.out.println(" i--         |i = " + i);
		
		
		
	}
}
