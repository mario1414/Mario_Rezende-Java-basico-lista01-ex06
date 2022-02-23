package br.fai.ex06;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();
	}

	private void start() {
		
		String[] carros = { "Civic", "Gol", "Palio", "Uno",};
		
		try {
			for (int i = 0; i < carros.length; i++) {
				
				String nomeDoCarro = carros[i];
				System.out.println("Nome do carro: " + nomeDoCarro);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("este código será executado independende se der erro ou nao");
		}
		
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
