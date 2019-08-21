/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author Lithy
 */
public class Palavras {
    String[] literais = new String[26];
	int cont = 0;
	
	void adicionar(String p) {
		if ( literais.length > cont ) {
			if ( repetido( p ) ) {
				return;
			}
			literais[ cont++ ] = p;
		} else {
			System.out.println("Vetor cheio");
		}
	}
	
	boolean repetido(String str) {
		for (int i = 0; i < cont ; i++) {
			if ( literais[i].equals( str ) ) {
				//System.out.println("Palavra ja adicionada");
				return true;
			}
		}
		
		return false;
	}
	
	String maiorPalavra() {
		String r = "Nenhum dado cadastrado";
		
		int maior = -1;
		int indice = -1;
		
		for (int i = 0; i < cont; i++) {
			if ( maior < literais[i].length() ) {
				maior = literais[i].length();
				indice = i;
			}
		}
		
		if ( indice > -1 ) {
			r = literais[indice];
		}
		
		return r;
	}
	
	String contrario(String p) {
		String inverso = "";
		
		for (int i = p.length() -1; i >= 0; i--) {
			inverso += p.charAt(i);
		}
		
		return inverso;
	}
	
	String imprimirPalavrasAoContraio() {
		String saida = "";
		for (int i = 0; i < cont; i++) {
			saida += "\n";
			saida +=  contrario( literais[i] );
			
		}
		return saida;
	}
	
	void listar() {
		for (int i = 0; i < cont; i++) {
			System.out.println( literais[i] );
		}
	}
	
	void alterar(int pos, String valor) {
		if ( pos >= 0 && pos < literais.length ) {
			
			if ( repetido( valor ) ) {
				System.out.println("ja adicionado");
				return;
			}
			
			if ( pos <= cont ) {
				literais[pos] = valor;
			} else {
				
				
				for (int i = 0; i < pos; i++) {
					char c = 'a';
					
					for (int j = 0; j < cont; j++) {
						if ( repetido( c + "" ) ) {
							c++;
						}
					}
					
					if ( literais[i] == null) {
						literais[i] = c + "";
						cont++;
					}
				}
				
				literais[pos] = valor;
				cont = pos + 1;
			}
			
		} else {
			System.out.println("posicao invalida");
		}
	}
	
	int indexOf(String p) {
		for (int i = 0; i < cont; i++) {
			if ( p.equals(literais[i])) {
				return i;
			}
		}
		return -1;
	}

	boolean remove(String p) {
		int pos = indexOf(p);
		
		if ( pos == -1 ) {
			return false;
		} else {
			
			if ( pos == (cont -1 ) ) {
				literais[pos] = null;
			} else {

				for (int i = pos; i < cont; i++) {
					literais[i] = literais[i+1];
				}
				
				literais[cont -1] = null;
			}
			
			
			cont--;//manter compatibilidade com o adicionar
			
			return true;
		}
		
		
	}
}
