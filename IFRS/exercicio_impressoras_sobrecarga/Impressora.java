import java.util.Random;
import java.util.ArrayList;

public class Impressora {
    private String textoImpressao;
    private String textoImpressao2;
    private int numInicial;
    private int numFinal;
    private int randomNum;
    private String totalPg;
    private boolean retornoImpressoraA;

    // sobrecarga
    public boolean imprimir(String textoImpressao) {
        this.textoImpressao = textoImpressao;
        if (this.textoImpressao.length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int imprimir(String textoImpressao, int numInicial, int numFinal) {
        this.textoImpressao = textoImpressao;
        this.numInicial = numInicial;
        this.numFinal = numFinal;
        return RandNum();
    }

    public ArrayList<String> imprimir(String textoImpressao, String textoImpressao2, String totalPg) {

        this.textoImpressao = textoImpressao;
        this.textoImpressao2 = textoImpressao2;
        this.totalPg = totalPg;
        ArrayList<String> listaDados = new ArrayList<>();
        listaDados.add(textoImpressao);
        listaDados.add(textoImpressao2);
        listaDados.add(totalPg);
        return listaDados;
    }

    // other methods
    // random number between 1 and 6
    public static int RandNum() {
        Random r = new Random();
        int rand = Math.abs((1) + r.nextInt(6));
        return rand;
    }

    // criar metodo para impressora 1
    /*
     * public String impressoraIsTrue(boolean retornoImpressoraA){
     * this.retornoImpressoraA = retornoImpressoraA; if(retornoImpressoraA == true){
     * return "Documento impresso com sucesso!"; }else{ return "Erro na impressão!";
     * } }
     */

}