import java.util.Scanner;

public class Equacao2Grau {

    public static void main(String[] args) {
        // Declaração
        int a;
        int b;
        int c;
        double delta;
        double x1;
        double x2;
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.println("Digite os elementos da equação separados por vírgula (a, b, c):");
        String input = sc.nextLine();

        // Dividir a entrada em partes usando a vírgula como delimitador
        String[] parts = input.split(",");

        // Verificar se há três partes (a, b, c)
        if (parts.length != 3) {
            System.out.println("Entrada inválida. Você deve fornecer exatamente três valores separados por vírgula.");
            sc.close();
            return;
        }

        // Converter as partes em valores inteiros
        try {
            a = Integer.parseInt(parts[0].trim());
            b = Integer.parseInt(parts[1].trim());
            c = Integer.parseInt(parts[2].trim());

            if (a == 0 && c == 0) {
                System.out.println("X = 0");
                sc.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter valores. Certifique-se de que os valores fornecidos são números válidos.");
            sc.close();
            return;
        }

        // Processamento e saída
        if (a == 0) {
            x1 = ((-c)/b);
            System.out.println("Se A = 0 então a equação é de 1°, o resultado de x é: " + x1);
        } else if (a == 0 && b ==0 ){
        	System.out.println("A e B não podem ser 0.");
        }
        else  if ( b == 0) {
                x1 = Math.sqrt(c / a);
                System.out.println("A equação possui uma raiz real: X = " + x1);
            } 
        delta = (Math.pow(b, 2.0) - (4 * a * c));
        if ( delta < 0){
                System.out.println("A equação não possui raízes reais.");
            	}else if (delta == 0) {
            		x1 = ( -b / (2*a));
            		System.out.println("A equação possui apenas um resultado real: " + x1);
                }
         else {
            x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.println("O resultado do X1 é: " + x1);
            System.out.println("E X2 é: " + x2);
        }

        sc.close();
    }
    }
