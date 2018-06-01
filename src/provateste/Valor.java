package provateste;

public class Valor implements ValorITF {

	private int[] inteiros;
	private int tamanho = 0;
	
	public Valor() {
		inteiros = new int[10];
	}
	
	@Override
	public boolean ins(int v) {
		if(size() == 10 || v < 1)return false;
		inteiros[size()] = v;
		tamanho++;
		return true;
	}

	@Override
	public int del(int t) {
		if(size() == 0) return -1;
		if(!(t < size()))return -1;
		int retorno = inteiros[t];
		for(int j = t; j < size(); j++) {
			inteiros[j] = inteiros[j+1];
		}
		tamanho--;
		return retorno;
	}

	@Override
	public int size() {
		return tamanho ;
	}

	@Override
	public double mean() {
		if(size() == 0) return 0;
		double media = 0;
		for(int t = 0; t < size(); t++) {
			media += inteiros[t];
			
		}
		return (media / size());
	}

	@Override
	public int greater() {
		if(size() == 0) return -1;
		int maior = inteiros[0];
		for (int t = 0; t < size(); t++) {
			if(inteiros[t] > maior) {
				maior = inteiros[t];
			}
		}
		return maior;
	}

	@Override
	public int lower() {
		if(size() == 0) return -1;
		int menor = inteiros[0];
		for (int t = 0; t < size(); t++) {
			if(inteiros[t] < menor) {
				menor = inteiros[t];
			}
		}
		return menor;
	}

}
