package model_repository;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Produto {

	Scanner ler = new Scanner(System.in);

	private String marca, cor;
	private int tamanho;
	private float valor;
	ArrayList<String> produtos = new ArrayList<String>();

	public Produto(String marca, String cor, int tamanho, float valor) {
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
		this.valor = valor;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	
}
