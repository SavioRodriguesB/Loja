import java.util.Scanner;

public class Surra {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Quantidade de alunos: ");
		int quantidadeDeAlunos = in.nextInt();
		float notaDaProva =0;
		float notaDasProvas = 0;
		for (int i = 1; i <= quantidadeDeAlunos; i++) {
			System.out.print("Nota da prova: ");
			notaDaProva	= in.nextFloat();
			notaDasProvas = notaDasProvas + notaDaProva;
			
		}
		
		System.out.print("Média " +notaDasProvas / quantidadeDeAlunos);
		

	}

}
