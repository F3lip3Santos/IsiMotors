
public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private double preco;

	public Carro() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	void exibirAnuncio() {
		System.out.println("------------------------------");
		System.out.println("Anuncio de carro: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Ano: " + ano + " Valor: " + preco);
	}
	
	double calcularIPVA() {
		double ipva;
		
		if (ano <=2000) {
			ipva = 0;
		}
		else {
			ipva = preco * 0.4;
		}
		return ipva;
	}
	
	double calcularValorParcelaFinanciamento (int numParcelas) {
		double valorParcela;
		
		valorParcela = (preco + (preco * 0.4))/numParcelas;
		
		return valorParcela;
		
	}
}
