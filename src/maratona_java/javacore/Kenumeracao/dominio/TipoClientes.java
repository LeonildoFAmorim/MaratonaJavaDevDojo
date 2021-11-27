package maratona_java.javacore.Kenumeracao.dominio;

/*
aqui a pessoa física é representada pelo o númoero 1 e a pessoa jurídica pelo o número 2.
isso é enumeração com atributos.
 */

public enum TipoClientes {
    PESSOA_FISICA(1, "pessoa física"),
    PESSOA_JURIDICA(2, "pessoa jurídica");

    private int valor;
    private String tipoPessoa;

    TipoClientes(int valor, String tipoPessoa) {
        this.valor = valor;
        this.tipoPessoa = tipoPessoa;
    }

    // esse método irá retornar as enumerações a partir de um tipo de pessoa (física ou jurídica).
    public static TipoClientes retornaValorDaEnumeracaoPorTipoPessoa(String tipoPessoa) {
        for (TipoClientes tipoCliente : values()) {
            if (tipoCliente.getTipoPessoa().equals(tipoPessoa)) {
                return tipoCliente;
            }
        }
        return null;
    }

    // não tem o set porque este valor (1 ou 2) não pode ser mudado porque representa cada tipo de conta já dito acima
    public int getValor() {
        return valor;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }
}
