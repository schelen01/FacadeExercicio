public class ApiProduto {
    public static final String QUALQUER = "lata";
    public int desconto(Produto produto){
        if(produto.getTipo().equals("Latas")){
            return 10; //desconto 10%
        } else {
            return 0;
        }
    }
}
