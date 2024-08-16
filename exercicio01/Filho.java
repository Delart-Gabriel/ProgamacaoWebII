package exercicio01;

public class Filho extends Pessoa{

    private String corDosOlhos;

    public String getCorDosOlhos(){ return this.corDosOlhos;}

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    @Override
    String getTipoVoz() {
        return null;
    }

}
