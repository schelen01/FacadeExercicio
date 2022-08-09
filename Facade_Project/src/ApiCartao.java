public class ApiCartao {

    public static final String BANCO  = "Star Bank";
    //BANCO é uma constante, e continuará ser o Star Bank. A variável será GLOBAL.
    public int desconto(Cartao cartao){
        if(cartao.getBanco().equals("StarBank")){
            return 20; //desconto 20%
        } else {
            return 0;
        }
    }
}
