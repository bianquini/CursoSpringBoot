package com.iagob.cursomc.domain.enums;

public enum EstadoPagamento {

	
	PENDENTE(1,"Pendente"),
	QUITADO(2,"Quitado"),
	CANCELADO(3,"Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String desc) {
		this.cod  = cod;
		this.descricao = desc;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDesc() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido:" + cod);
	}
	
}
