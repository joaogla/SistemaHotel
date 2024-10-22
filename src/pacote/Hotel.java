package pacote;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Quarto> quartos = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    public void listarQuartos() {
    	for(Quarto quarto : quartos) {
    		System.out.println(quarto);
    	}
    }
    
    public void cadastrarQuarto(Integer numero, String tipo, Double preco) {
    	 Quarto quarto = new Quarto(numero, tipo, preco, true);
    	 quartos.add(quarto);
    	 System.out.println("Quarto cadastrado com sucesso!");
     }
    
    public void cadastrarReserva(String nomeHospede, String dataCheckIn, String dataCheckOut, String tipoQuarto) {
    	for (Quarto quarto : quartos) {
			if(quarto.getTipoQuarto().equals(tipoQuarto) && quarto.getDisponibilidade()) {
				reservas.add(new Reserva(nomeHospede, dataCheckIn, dataCheckOut, tipoQuarto, quarto.getNumQuarto()));
				quarto.setDisponibilidade(false);
				System.out.println("Reserva cadastrada com sucesso para o quarto " + quarto.getNumQuarto());
				return;
			}
		}
    	System.out.println("Não há quartos disponíveis desse tipo.");
    }
    
    public void realizarCheckOut(Integer numQuarto) {
    	for(Quarto quarto : quartos) {
    		if(quarto.getNumQuarto().equals(numQuarto)) {
    			quarto.setDisponibilidade(true);
    			System.out.println("Check-out realizado com sucesso!");
    		}
    	}
    	System.out.println("Quarto não encontrado!");
    }
    
    public void listarOcupacao() {
    	System.out.println("Listando ocupação...");
    	for(Quarto quarto : quartos) {
    		if(!quarto.getDisponibilidade()) {
    			System.out.println("Quarto: "+quarto.getNumQuarto() + " ("+ quarto.getTipoQuarto()+ ") - Ocupado");
    		}
    	}
    }
    
    public void historicoReservas(String nomeHospede) {
    	System.out.println("Histórico de reservas de " + nomeHospede + ":");
    	for(Reserva reserva : reservas) {
    		if(reserva.getNomeHospede().equalsIgnoreCase(nomeHospede)) {
    			System.out.println(reserva);
    		}
    	}
    }
}
