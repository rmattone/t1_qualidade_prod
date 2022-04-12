package ToolsQA;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		Classifica c1 = new Classifica();
		Scanner scan = new Scanner(System.in);
		double x, y;
		int opcao = 1;

		while(true){
			try {
				System.out.print("\nSe quiser sair digite 0: ");
				System.out.print("\nSe quiser seguir digite 1: ");
            	opcao = scan.nextInt();
			}
			catch (Exception e) {
				System.out.print("\nOpção invalida");
				System.out.print("\nSe quiser sair digite 0: ");
				System.out.print("\nSe quiser seguir digite 1: ");				
			}

			if (opcao == 0){
				System.out.print("\nSaindo do sistema");
				System.exit(0);
			} else if(opcao == 1){
				System.out.print("\nColoque o primeiro valor: ");
					x = scan.nextDouble();

				System.out.print("\nColoque o segundo valor: ");
					y = scan.nextDouble();

					System.out.println(c1.result(x,y));
			}						
		}
	}
}
