package pacote;

public class Reserva {
    private String nomeHospede;
    private String dataCheckIn;
    private String dataCheckOut;
    private String tipoQuarto;
    private Integer numQuarto;

    public Reserva(String nomeHospede, String dataCheckIn, String dataCheckOut, String tipoQuarto, Integer numQuarto) {
        super();
        this.nomeHospede = nomeHospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.tipoQuarto = tipoQuarto;
        this.numQuarto = numQuarto;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(String dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public String getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(String dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    @Override
    public String toString() {
        return "Reserva [nomeHospede=" + nomeHospede + ", dataCheckIn=" + dataCheckIn +
               ", dataCheckOut=" + dataCheckOut + ", tipoQuarto=" + tipoQuarto +
               ", numQuarto=" + numQuarto + "]";
    }
}
