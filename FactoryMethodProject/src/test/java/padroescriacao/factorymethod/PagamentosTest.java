package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    @Test
    void testPagamentoCartaoCredito() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("CartaoCredito");
        assertEquals("Pagamento com Cartão de Crédito aprovado!", pagamento.aprovar());
    }

    @Test
    void testPagamentoPayPal() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("PayPal");
        assertEquals("Pagamento com PayPal aprovado!", pagamento.aprovar());
    }

    @Test
    void testPagamentoInexistente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            PagamentoFactory.obterPagamento("Boleto");
        });
        assertEquals("Forma de pagamento inexistente", exception.getMessage());
    }
}