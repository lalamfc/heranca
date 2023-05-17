package funcionario;

import java.math.BigDecimal;

public class Cargo {
    protected String nomeCargo;


    public Cargo(String nomeCargo, BigDecimal salario) {
        this.nomeCargo = nomeCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public void promoverCargo(Cargo novoCargo){
        this.nomeCargo = novoCargo.getNomeCargo();
    }
}
