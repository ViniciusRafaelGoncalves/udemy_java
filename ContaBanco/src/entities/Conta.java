package entities;

import exceptions.NegocioException;

public class Conta {

	private Integer conta;
	private String dono;
	private Double saldo, limiteSaque;

	public Conta() {
	}

	public Conta(Integer conta, String dono, Double saldo, Double limiteSaque) {
		this.conta = conta;
		this.dono = dono;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(Double quantia) {
		saldo += quantia;
	}

	public void saque(Double quantia) {
		saldo -= quantia;
	}

	private void saqueValido(double quantia) {
		if (quantia > getLimiteSaque()) {
			throw new NegocioException("Erro: Quantia maior que o limite de saque");
		}
		if (quantia > getSaldo()) {
			throw new NegocioException("Erro: Quantia maior que o saldo disponível");
		}
	}

}
