package padroescriacao.factorymethod;

public class PagamentoPix implements IPagamento {
    public String aprovar() {
        return "Pagamento com Pix aprovado!";
    }
}