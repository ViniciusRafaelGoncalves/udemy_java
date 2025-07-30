package model.service;

import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class ServicoAluguel {
	private Double precoPorHora;
	private Double precoPorDia;
	
	private ImpostoBrasil impostoBrasil;
	
	public ServicoAluguel() {
	
	}

	public ServicoAluguel(Double precoPorHora, Double precoPorDia, ImpostoBrasil impostoBrasil) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.impostoBrasil = impostoBrasil;
	}
	
	public void processoFatura(AluguelCarro aluguelCarro) {
		
		double minutos = Duration.between(aluguelCarro.getStart(), aluguelCarro.getFinish()).toMinutes();
		double horas = minutos / 60;
		
		double pagamentoBasico = 0;
		if(horas <= 12) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		}
		else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
		}
		
		double taxa = impostoBrasil.imposto(pagamentoBasico);
		
		aluguelCarro.setFatura(new Fatura(pagamentoBasico,taxa));
	}


}
