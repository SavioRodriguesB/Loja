import java.util.Scanner;

public class Somatoria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Primeiro n�mero: ");
		int primeiroNumero = in.nextInt();
		System.out.print("Segundo n�mero ");
		int segundoNumero= in.nextInt();
		
	
		System.out.print("Qual opera��o deseja realizar? ");
		in.nextLine();
		String operacao= in.nextLine();
		float resultado=0;
		if (operacao.equals("+")) {
			resultado= primeiroNumero+segundoNumero;
		}
		if (operacao.equals("-")) {
			resultado= primeiroNumero-segundoNumero;
		}
		if (operacao.equals("*")) {
			resultado= primeiroNumero*segundoNumero;
		}
		if (operacao.equals("/")) {
			resultado= primeiroNumero/segundoNumero;
		}
		System.out.println(primeiroNumero+operacao+segundoNumero+"= "+resultado);
	}
}