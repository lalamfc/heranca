package informacoesPessoais;

public class Endereco {
    protected String rua;
    protected int num;
    protected String cep;

    public Endereco(String rua, int num, String cep) {
        this.rua = rua;
        this.num = num;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
