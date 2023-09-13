import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		//Declaração
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		Scanner sc= new Scanner(System.in);
		
		//Entrada
		System.out.println("Escreva o elemento A da equação:");
		a = sc.nextDouble();
		System.out.println("Escreva o elemento B da equação: ");
		b = sc.nextDouble();
		System.out.println("Escreve o elemento C da equação");
		c = sc.nextDouble();
		
		//Processamento
		delta = (Math.pow(b, 2.0) -(4*a*c));
		if (a == 0) {
            System.out.println("O valor de 'a' não pode ser zero.");
        } else if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.println("O resultado do X1 é: " + x1);
            System.out.println("E X2 é: " + x2);
        }
		
		sc.close();

	}

}
