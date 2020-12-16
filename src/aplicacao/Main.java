package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades_enum.NivelTrabalhador;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Pedido p = new Pedido(1, new Date(),StatusVenda.AGUARDANDO_PAGAMENTO);
		
		//System.out.println(p);
		System.out.print("Entre com o nome do Departamento");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Dados do Trabalhador");
		System.out.print("Nome do Trabalhador");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nível do Trabalhador");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salário Base do Trabalhador");
		double salarioBase = sc.nextDouble();
		Trabalhador t = new Trabalhador(nomeTrabalhador,NivelTrabalhador.valueOf(nivelTrabalhador),salarioBase,new Departamento(nomeDepartamento));
		System.out.print("Quantos contratos para esse trabalhador");
		int numContratos = sc.nextInt();
		for (int i = 1; i <= numContratos; i++) {
			System.out.println("Entre com os dados do contrato:  "+i);
			System.out.print("Data");
			Date contratoData = sdf.parse(sc.next());	
			System.out.print("Valor por Hora");
			double valor = sc.nextDouble();	
			System.out.print("Número de Horas");
			int horas = sc.nextInt();	
			Contrato c = new Contrato(contratoData,valor,horas);
			t.adicionarContrato(c);
		}
		System.out.println();
		System.out.print("informe mês e ano para calcular (MM/AAAA)");
		String mes_ano = sc.next();
		int mes = Integer.parseInt(mes_ano.substring(0, 2));
		int ano = Integer.parseInt(mes_ano.substring(3));
		System.out.println("Nome: "+t.getNome());
		System.out.println("Departamento: "+t.getDepartamento().getNome());
		System.out.println("Total de Ganhos para o mês: "+mes+" e ano: "+ano+": ");
		System.out.println(t.somar(ano, mes));
		
		
		
		
		
		
		
		
	}

}
