package com.iagob.cursomc.domain.enums;

public enum TipoCliente {

	
	PESSOAFISICA(1,"Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Juridica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String desc) {
		this.cod  = cod;
		this.descricao = desc;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDesc() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido:" + cod);
	}
}
