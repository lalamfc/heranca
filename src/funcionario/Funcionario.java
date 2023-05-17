package funcionario;

import informacoesPessoais.Cadastro;

public class Funcionario extends Cadastro {
    private Integer matricula;
    private double salario;
    private String dataAdmissao;

    public Funcionario(Integer matricula, double salario, String dataAdmissao) {
        super();
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double reajustarSalario(double novoPercentual){
        double novoSalario = salario + (salario * novoPercentual/100);
        return novoSalario;
    }
}
