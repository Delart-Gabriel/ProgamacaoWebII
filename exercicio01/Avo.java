package exercicio01;

public class Avo extends Pessoa  {

    private String corDaPele;

    public String getCorDaPele(){ return this.corDaPele; }

    public void setCorDaPele(String corDaPele){
        this.corDaPele = corDaPele;
    }

    @Override
    String getTipoVoz() {
        return null;
    }
}
