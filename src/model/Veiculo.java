package model;

public class Veiculo {
	

	private String placa;
	private String modelo;
	private int valorDiaria;
	private Boolean disponivel;
	
	
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
	
}
