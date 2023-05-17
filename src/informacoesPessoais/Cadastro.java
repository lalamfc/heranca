package informacoesPessoais;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    protected String nome;
    protected String dataNascimento;
    protected Endereco endereco;
    protected List<TelsContato> listaTelefones = new ArrayList<TelsContato>();
    public TelsContato fone;

    public Cadastro(String nome, String dataNascimento, Endereco endereco, List<TelsContato> listaTelefones, TelsContato fone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.listaTelefones = listaTelefones;
        this.fone = fone;
    }

    public Cadastro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<TelsContato> getListaTelefones() {
        return listaTelefones;
    }

    public void setListaTelefones(List<TelsContato> listaTelefones) {
        this.listaTelefones = listaTelefones;
    }

    public TelsContato getFone() {
        return fone;
    }

    public void setFone(TelsContato fone) {
        this.fone = fone;
    }
}
