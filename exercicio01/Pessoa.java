package exercicio01;

public abstract class Pessoa {

    private String name;

    abstract String getTipoVoz();

    public String getName(){ return this.name;}

    public void setName(String name) {
        this.name = name;
    }



}
