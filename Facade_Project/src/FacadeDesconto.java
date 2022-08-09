public class FacadeDesconto {
   //declara os atributos, variáveis
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    //chama o método construção para compor, instanciar as APIs
    public FacadeDesconto(){
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    //Vai calcular o Desconto, acessa as apis, traz as info e retorna o desconto
    public int calcularDesconto(Cartao cartao, Produto produto, int quantidade){
        int desconto = 0;
        desconto =+ apiCartao.desconto(cartao);
        desconto =+ apiProduto.desconto(produto);
        desconto =+ apiQuantidade.desconto(quantidade);

        return desconto;
    }
}
