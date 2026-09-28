package model;

public class Moto extends Veiculo implements Calculavel{
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public void exibirTipo() {
	    System.out.println("moto");
	}
	
	@Override
	public double calcularValor(int quantidadeDias) {
	    return getValorDiaria() * quantidadeDias;
	}
}
