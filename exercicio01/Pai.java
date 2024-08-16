package exercicio01;

public class Pai extends Pessoa {

    private String idade;

    public String getIdade(){ return this.idade;}

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    String getTipoVoz() {
        return null;
    }
}
