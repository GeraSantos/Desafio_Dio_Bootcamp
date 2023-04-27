package br.com.corretora.dominio;

public class Bonus {
    private double valor;

    public Bonus(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void concederBonus(Cliente cliente) {
        if(cliente.getPontuacaoTotal() >= 1000) {
            //cria um objeto ValeDesconto com o valor do bônus
            ValeDesconto vale = new ValeDesconto("Vale de desconto de " + this.valor + " reais", this.valor);

            //adiciona o vale desconto ao cliente
            cliente.adicionarValeDesconto(vale);

            //zera a pontuação total do cliente
            cliente.zerarPontuacaoTotal();

            System.out.println("Bonus concedido ao cliente " + cliente.getNome()
                    + ": "
                    + this.valor
                    + " reais em vale desconto.");
        } else {
            System.out.println("O cliente " + cliente.getNome()
                    + " ainda não atingiu a pontuação mínima para receber o bônus.");
        }
    }
}

