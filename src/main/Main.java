package main;

import model.Carro;
import model.Moto;
import model.Cliente;
import model.Locacao;
import model.Veiculo;

import java.util.List;
import java.util.ArrayList;


public class Main {
	public static void main (String [] args) {
		
		Carro carro = new Carro();
		carro.setPlaca("ABC-1234");
		carro.setModelo("HB20");
		carro.setValorDiaria(150);
		carro.setDisponivel(true);
		carro.setQuantidadePortas(5);
		
		Moto moto = new Moto();
		moto.setPlaca("ABC-456");
		moto.setModelo("CB 1000");
		moto.setValorDiaria(130);
		moto.setDisponivel(true);
		moto.setCilindradas(1000);
		
		Cliente cliente = new Cliente();
		cliente.setNome("João Silva");
		cliente.setCpf("01234567890");
		cliente.setCnh("0123456789");
		
		Locacao locacao = new Locacao();
		locacao.setCliente(cliente);
		locacao.setVeiculo(carro);
		locacao.setQuantidadeDias(30);
		
		List<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(moto);
		veiculos.add(carro);
		
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getModelo());
		}
		
		
		
		
	}
}
