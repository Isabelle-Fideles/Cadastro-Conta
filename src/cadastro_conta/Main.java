package cadastro_conta;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		CadastroContas a = new CadastroContas();
	    try {
	    	
			for (int i = 0; i < 101; i++) {	 //ERRO: ARRAY CHEIO
				a.inserir(i, 33);
			}
	    	a.inserir(123, 334);
	    	a.inserir(123, 334); //ERRO: ExcecaoElementoJaExistente
	    	a.inserir(234, -34); //ERRO: ExcecaoDadoInvalido
	    	a.inserir(-323, 39); //ERRO: ExcecaoDadoInvalido
	    	a.buscar(45);  	//ERRO: ExcecaoElementoInexistente 
	    	a.buscar(123);
	    	
	    	
	    	
	    }
	    catch (ExcecaoDadoInvalido e) {
	    	e.printStackTrace();
	    }
	    catch (ExcecaoRepositorio e) {
	    	e.printStackTrace();
	    }
	    catch (ExcecaoElementoInexistente e) {
	    	e.printStackTrace();
	    }
	    catch (ExcecaoElementoJaExistente e) {
	    	e.printStackTrace();
	    }
	}
}
