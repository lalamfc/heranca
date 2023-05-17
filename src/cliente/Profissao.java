package cliente;

public class Profissao {
    protected String nomeDaProfissao;
    protected double salarioProfissao;

    public Profissao(String nomeDaProfissao, double salarioProfissao) {
        this.nomeDaProfissao = nomeDaProfissao;
        this.salarioProfissao = salarioProfissao;
    }

    public Profissao() {

    }

    public String getNomeDaProfissao() {
        return nomeDaProfissao;
    }

    public void setNomeDaProfissao(String nomeDaProfissao) {
        this.nomeDaProfissao = nomeDaProfissao;
    }

    public double getSalarioProfissao() {
        return salarioProfissao;
    }

    public void setSalarioProfissao(double salarioProfissao) {
        this.salarioProfissao = salarioProfissao;
    }
}
