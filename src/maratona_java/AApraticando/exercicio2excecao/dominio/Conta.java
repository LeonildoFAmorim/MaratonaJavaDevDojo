package maratona_java.AApraticando.exercicio2excecao.dominio;
/*
fazer um programa para ler os dados de uma conta bancária e depois realizar
um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saqeu for superior ao limite de
saque da conta. Implemente a conta bancária conforme projeto abaixo:

numero:
titular:
balanço:
limiteSaque

 */
public class Conta {
    private String numero;
    private String titular;
    private double balanco;
    private double limiteSaque;

    public Conta(){

    }

    public Conta(String numero, String titular, double balanco, double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.balanco = balanco;
        this.limiteSaque = limiteSaque;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalanco() {
        return balanco;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void sacar(double quantia) throws ExcecaoDeNegocio {
        validaSaque(quantia);
        this.balanco -= quantia;
    }

    public void deposita(double quantia){
        this.balanco += quantia;
    }

    private void validaSaque(double quantia) throws ExcecaoDeNegocio {
        if (quantia > this.balanco){
            throw new ExcecaoDeNegocio("saldo insuficiente>");
        }
        if (quantia > limiteSaque){
            throw new ExcecaoDeNegocio("limite de saque maior que o limite permitido");
        }
    }
}
