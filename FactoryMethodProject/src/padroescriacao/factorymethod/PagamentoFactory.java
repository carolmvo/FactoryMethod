package padroescriacao.factorymethod;

public class PagamentoFactory {

    public static IPagamento obterPagamento(String pagamento) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Pagamento" + pagamento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Forma de pagamento inexistente");
        }
        if (!(objeto instanceof IPagamento)) {
            throw new IllegalArgumentException("Forma de pagamento inválida");
        }
        return (IPagamento) objeto;
    }
}