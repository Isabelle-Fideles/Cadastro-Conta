package cadastro_conta;

public class CadastroContas {
	public static Contas [] contas = new Contas[100];
	static int livre = 0;
	
	public void inserir(int numConta, double saldo) throws ExcecaoRepositorio, ExcecaoDadoInvalido, ExcecaoElementoJaExistente{
		if (livre < 100) {
			for (int i=0; i<livre; i++) {
				if(contas[i].getNumConta() == numConta) {
					throw new ExcecaoElementoJaExistente("Elemento já existe");
				}
			}
			contas[livre] = new Contas(numConta, saldo);
			livre++;
		}
    	else
			throw new ExcecaoRepositorio("Array cheio");
	} 
	
	public String buscar(int numConta) throws ExcecaoElementoInexistente{
		for (int i=0; i<livre; i++) {
			if(numConta == contas[i].getNumConta()) {
				return "SALDO: "+ contas[i].getSaldo() + "\nCONTA: "+contas[i].getNumConta();
		    }	
		}
		throw new  ExcecaoElementoInexistente("Posição Inexistente");
	}
}
	

