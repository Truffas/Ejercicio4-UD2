package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dame el radio del cículo: ");
		
		double radio = entrada.nextDouble();
		
		double area = Math.PI * (radio*radio);
		
		System.out.println("El área del círculo es " + area);
		
		entrada.close();

	}

}
