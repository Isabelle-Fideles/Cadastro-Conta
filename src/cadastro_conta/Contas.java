package cadastro_conta;

public class Contas {
	
	private int numConta;
	private double saldo;
	
	public Contas (int numConta, double saldo) throws ExcecaoElementoJaExistente, ExcecaoDadoInvalido {
		setNumConta(numConta);
		setSaldo(saldo);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) throws ExcecaoDadoInvalido{
		if (saldo < 0) {
			throw new  ExcecaoDadoInvalido("Dado Inválido");
		}
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) throws ExcecaoElementoJaExistente, ExcecaoDadoInvalido{
		if (numConta < 0) {
			throw new ExcecaoDadoInvalido("Dado Inválido");
		}
		this.numConta = numConta;
	}
}
