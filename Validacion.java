import java.util.Scanner;

public class Validacion {

	public static void main(String[] args) throws Exception {
	  
	  Scanner input = new Scanner(System.in);
    double somaDasNotas = 0;
    int contador = 0;
    
    do {
      double notaEntradaConsole = input.nextDouble();

      if (notaEntradaConsole < 0 || notaEntradaConsole > 10) {
        System.out.println("nota invalida");
      } else {
        contador++;
        somaDasNotas += notaEntradaConsole; 
      }
    } while (contador < 2);
    
    System.out.printf("media = " + String.format("%.2f", somaDasNotas / 2));

    }
}