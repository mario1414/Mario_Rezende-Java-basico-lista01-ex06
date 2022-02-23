package br.fai.ex06;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();
	}

	private void start() {
		
		String[] carros = { "Civic", "Gol", "Palio", "Uno",};
		
		for (int i = 0; i < carros.length; i++) {
			
			String nomeDoCarro = carros[i];
			System.out.println("Nome do carro: " + nomeDoCarro);
		}
		
		carros[1] = "L200";
		
		for (String carro : carros) {
			System.out.println("Nome do carro: " + carro);
			
		}
		
	}

}
