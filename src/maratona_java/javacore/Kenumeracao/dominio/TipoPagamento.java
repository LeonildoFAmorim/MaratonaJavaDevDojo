package maratona_java.javacore.Kenumeracao.dominio;

/*
enumeraçao com métodos, existe um método que calcula o desconto ser for crédito ou débito.
débito = 10%
crédito = 5%

o método calcularDesconto necessariamente precisa ser subescrito em cada tipo de pagamento.

control + o para subescrever o método
 */

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    };

    // quando o método não tem comportamento, ou seja, ele é definido por quem o invocar, então o certo é que esse método seja abstrato
    public abstract double calcularDesconto (double valor);
    // método abstrato não tem o corpo, porque o comportamento será definido por quem o chamar.
}

