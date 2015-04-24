package com.anhanguera.listadedesejos.bean;

public class Desejo {

	private int id;
	private String produto;
	private String categoria;
	private String lojas;
	private double precoMinimo;
	private double precoMaximo;
	private String teste;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getLojas() {
		return lojas;
	}

	public void setLojas(String lojas) {
		this.lojas = lojas;
	}

	public double getPrecoMinimo() {
		return precoMinimo;
	}

	public void setPrecoMinimo(double precoMinimo) {
		this.precoMinimo = precoMinimo;
	}

	public double getPrecoMaximo() {
		return precoMaximo;
	}

	public void setPrecoMaximo(double precoMaximo) {
		this.precoMaximo = precoMaximo;
	}

}
