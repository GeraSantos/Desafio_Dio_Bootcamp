package br.com.corretora.dominio;

public class ConcessorDeBonus {
    private Bonus bonus;

    public ConcessorDeBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public void concederBonus(Cliente cliente) {
        if (cliente.getPontuacaoTotal() >= 1000) {
            ValeDesconto vale = new ValeDesconto("Vale de desconto de " + bonus.getValor() + " reais", bonus.getValor());
            cliente.adicionarValeDesconto(vale);
            cliente.zerarPontuacaoTotal();
            System.out.println("Bonus concedido ao cliente " + cliente.getNome()
                    + ": " + bonus.getValor() + " reais em vale desconto.");
        } else {
            System.out.println("O cliente " + cliente.getNome()
                    + " ainda não atingiu a pontuação mínima para receber o bônus.");
        }
    }
}
