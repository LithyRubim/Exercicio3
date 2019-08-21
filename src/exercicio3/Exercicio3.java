/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author Lithy
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Palavras p = new Palavras();
		
		String menu = ""
				+ "\n1 - Adicionar palavra"
				+ "\n2 - Maior palavra adicionada"
				+ "\n3 - Imprimir todas as palavras ao contrario"
				+ "\n4 - alterar"
				+ "\n5 - listar"
				+ "\n6 - remover"
				+ "\n10 - Sair";
		
		System.out.println( menu );
		int op = 0;
		
		Scanner leia = new Scanner(System.in);
		op = leia.nextInt();
		//faltou algo ... aqui
		
		while ( op != 10 ) {
			
			switch ( op ) {
			case 1:
				System.out.println(
						"Digite uma palavra para adicionar");
				
				String str = leia.next();
				
				p.adicionar( str );
				break;
			
			case 2:
				System.out.println( p.maiorPalavra() );
				break;
			case 3:
				System.out.println( p.imprimirPalavrasAoContraio() );
				break;
				
			case 4:
				System.out.println("digite a posicao a alterar");
				int i = leia.nextInt();
				System.out.println("digite um valor");
				p.alterar(i, leia.next());
				break;
		
			case 5:
				p.listar();
				break;
			
			case 6:
				System.out.println("Digite uma palavra para remover");
				if ( p.remove( leia.next() ) ) {
					System.out.println("Palavra removida");
				} else {
					System.out.println("Palavra nao removida");
				}
				
			default:
				System.out.println("opcao invalida");
				break;
			}
			
			//faltou algo aqui agora ...
			System.out.println( menu );
			op = leia.nextInt();
			
		}
    }
    
}
