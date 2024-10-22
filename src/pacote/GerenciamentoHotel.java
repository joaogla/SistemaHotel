package pacote;

import java.util.Scanner;

public class GerenciamentoHotel {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		Scanner scan = new Scanner(System.in);
		int opcao;
		
		while(true) {
			System.out.println("\n---- Sistema de Gerenciamento de Hotel ----");
            System.out.println("1. Cadastrar Quarto");
            System.out.println("2. Listar Quartos");
            System.out.println("3. Cadastrar Reserva");
            System.out.println("4. Realizar Check-out");
            System.out.println("5. Listar Ocupação");
            System.out.println("6. Histórico de Reservas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();
            
            switch(opcao) {
            case 1:
            	System.out.println("Número do quarto: ");
            	int numero = scan.nextInt();
            	System.out.println("Tipo do quarto(Solteiro, Casal, Suite): ");
            	String tipo = scan.next();
            	System.out.println("Preço da diária: ");
            	double preco = scan.nextDouble();
            	hotel.cadastrarQuarto(numero, tipo, preco);
            	break;
            case 2:
            	hotel.listarQuartos();
            	break;
            case 3:
            	System.out.println("Nome do hóspede: ");
            	String nome = scan.next();
            	System.out.println("Data do Check-in: ");
            	String checkin = scan.next();
            	System.out.println("Data do Check-out: ");
            	String checkout = scan.next();
            	System.out.println("Tipo do quarto: ");
            	String tipoQuarto = scan.next();
            	hotel.cadastrarReserva(nome, checkin, checkout, tipoQuarto);
            	break;
            case 4:
            	System.out.println("Número do quarto: ");
            	int numeroQuarto = scan.nextInt();
            	hotel.realizarCheckOut(numeroQuarto);
            	break;
            case 5:
            	hotel.listarOcupacao();
            	break;
            case 6:
            	System.out.println("Nome do hóspede: ");
            	String nomeHospede = scan.next();
            	hotel.historicoReservas(nomeHospede);
            	break;
            case 0:
            	System.out.println("Encerrando...");
            	scan.close();
            	System.exit(0);
            default:
            	System.out.println("Opção inválida!!!!");
            }
		}
	}
}
