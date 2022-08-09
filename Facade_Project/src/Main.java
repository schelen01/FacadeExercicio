/*Facade (Fachada) é um padrão de design estrutural que fornece uma interface simplificada para uma
biblioteca, framework ou qualquer outro grupo complexo de classes.*/

/*Para não pegar os descontos do cartão, e depois o desconto dos produtos de lata,
e depois o desconto por quantidade, utiliza o Facade */

public class Main {
    public static void main(String[] args){

        Cartao cartao = new Cartao("1332 1333 1332", "StarBank");
        Produto produto = new Produto("1332 1333 1332","Pacote");

        //Se não houvesse o Facade faria desta forma:
        ApiCartao apiCartao =new ApiCartao();
        ApiProduto apiProduto =new ApiProduto();
        ApiQuantidade apiQuantidade =new ApiQuantidade();

        int desconto = apiCartao.desconto(cartao) + apiProduto.desconto(produto) + apiQuantidade.desconto(15);
        System.out.println(desconto);

        FacadeDesconto facadaDesconto =new FacadeDesconto();
        desconto = facadaDesconto.calcularDesconto(cartao, produto, 15);
        System.out.println(desconto);


    }
}


