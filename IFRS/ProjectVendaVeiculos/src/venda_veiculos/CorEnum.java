
package venda_veiculos;

public enum CorEnum {
    
    BRANCO(1, "BRANCO"),
    PRETO(2, "PRETO"),
    VERMELHO(3, "VERMELHO");
    
    private int codigo;
    private String descricaoCor;
    

    CorEnum(int codigo, String descricaoCor) {      //deve estar na ordem (int, "String")
        this.descricaoCor = descricaoCor;
        this.codigo = codigo;
    }
    public String getString() {
        return descricaoCor;
    }

    public int getCodigo() {
        return codigo;
    }
    
}
