package cliente;

import informacoesPessoais.Cadastro;

public class Cliente extends Cadastro {
    private String codigo;
    public Profissao profissao;

    public Cliente(String codigo, Profissao profissao) {
        super();
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public Cliente() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
