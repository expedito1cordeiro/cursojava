package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		Date y1 = sdf1.parse("09/12/2020");
		Date y2 = sdf2.parse("09/12/2020 18:44:10");
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		//System.out.println(y2);
		
		/*
		List<String> lista = new ArrayList<>();
		lista.add("Expedito");
		lista.add("João");
		lista.add("Pedro");
		lista.add(2,"Ana");
		lista.remove(1);
		for (String x: lista) {
			System.out.println(x);
		}
		
		lista.removeIf(x -> x.charAt(0) == 'P');
		for (String x: lista) {
			System.out.println(x);
		}*/
		/*Produtos p = new Produtos();
		System.out.println("Entre com os valores");
		System.out.print("Nome: ");
		p.setNome(sc.nextLine());
		System.out.print("Preço: ");
		p.setPreco(sc.nextDouble());
		System.out.print("Estoque: ");
		p.setQtd(sc.nextDouble());
		
		String x = p.toString();
		System.out.println(x);
		sc.close();*/
		/*System.out.println("Informe a quantidade de objetos");
		int n = sc.nextInt();
		Produtos[] vet = new Produtos[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Informe nome");
			String nome = sc.nextLine();
			System.out.println("Informe preco");
			double preco = sc.nextDouble();
			System.out.println("Informe qtd");
			double qtd = sc.nextDouble();
			
			vet[i] = new Produtos(nome,preco,qtd);
			//media += vet[i];
		}
		
		
		*/
		

	}

}
