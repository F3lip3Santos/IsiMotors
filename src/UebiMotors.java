
public class UebiMotors {
	public static void main(String[] args) {
	
		Carro c1, c2; //Criando objeto da classe
		
		c1 = new Carro(); //Ocupando memória
		c2 = new Carro();
		
		//Atribuindo valores
		c1.setMarca("Porsche");
		c1.setModelo("Cayenne");
		c1.setCor("Prata Chumbo");
		c1.setAno(2020);
		c1.setPreco(1350000);
		
		c2.setMarca("Chevrolet");
		c2.setModelo("Corsa");
		c2.setCor("Prata");
		c2.setAno(1998);
		c2.setPreco(6000);
		

		double ipvaC1 = c1.calcularIPVA();
		double ipvaC2 = c2.calcularIPVA();
		double valorParcela = c1.calcularValorParcelaFinanciamento(60);
		double valorParcela2 = c2.calcularValorParcelaFinanciamento(12);
		c1.exibirAnuncio();
		System.out.println("IPVA do Carro: " + ipvaC1);
		System.out.println("E o valor da parcela Financiada em 60 Meses : " + valorParcela);
		c2.exibirAnuncio();
		System.out.println("IPVA do Carro: " + ipvaC2);
		System.out.println("E o valor da parcela Financiada em 12 Meses : " + valorParcela2);
		
		
	}
}
