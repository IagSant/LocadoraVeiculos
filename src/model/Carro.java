package model;

public class Carro extends Veiculo implements Calculavel {
	
	private int quantidadePortas;
	
	public Carro(int quantidadePortas) {
		
		super(); 
		
		this.quantidadePortas = quantidadePortas;
	} 
	
	public Carro(int quantidadePortas, String modelo) {
		this(quantidadePortas);
		
		setModelo(modelo);
	}
	


	public Carro(String placa, String modelo,  int valorDiaria,  boolean disponivel, int quantidadePortas) {

	    super(placa, modelo, valorDiaria, disponivel);
	   

	    this.quantidadePortas = quantidadePortas;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	@Override
	public void exibirTipo() {
		System.out.println("carro");
	}
	
	@Override
	public double calcularValor(int quantidadeDias) {
	    return getValorDiaria() * quantidadeDias;
	}
	
	
}
