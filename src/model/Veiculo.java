package model;

public class Veiculo {
	

	private String placa;
	private String modelo;
	private int valorDiaria;
	private Boolean disponivel;
	
	public Veiculo() {
	}
	
	public Veiculo(String placa, String modelo, int valorDiaria, boolean disponivel) {
		this.placa = placa;
		this.modelo = modelo;
		this.valorDiaria = valorDiaria;
		this.disponivel = disponivel;
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(int valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void exibirTipo() {
		System.out.println("veiculo");
	}
	
}
