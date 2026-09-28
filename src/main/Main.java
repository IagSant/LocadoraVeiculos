package main;

import model.Calculavel;
import model.Carro;
import model.Moto;
import model.Cliente;
import model.Locacao;
import model.Veiculo;

import java.util.List;
import java.util.ArrayList;


public class Main {
	public static void main (String [] args) {
		
		Carro carro = new Carro(5);
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
		
		Veiculo veiculo1 = new Carro(5);
		Veiculo veiculo2 = new Moto();
		
		veiculo1.exibirTipo();
		veiculo2.exibirTipo();
		
		Calculavel calculavel = carro;
		System.out.println(calculavel.calcularValor(3));
		
		Calculavel calculavel2 = moto;
		System.out.println(calculavel2.calcularValor(3));
		
		Carro carro2 = new Carro(5,"HB20");
		
		System.out.println(carro2.getQuantidadePortas());
		System.out.println(carro2.getModelo());
		
		Carro carro3 = new Carro("ABC-9999", "i30", 180, true, 4);
		
		System.out.println(carro3.getPlaca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getValorDiaria());
		System.out.println(carro3.getDisponivel());
		System.out.println(carro3.getQuantidadePortas());
		
	}
}
