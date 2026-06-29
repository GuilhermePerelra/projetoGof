package model;

import interfaces.IArmaMagica;

public class Cajado extends Arma implements IArmaMagica {
    private int custoMana;

    public Cajado(String nome, int peso, int preco, int danoMagico, int custoMana) {
        super(nome, peso, preco, danoMagico);
        this.custoMana = custoMana;
    }


    @Override
    public void lancarFeitico() {
        System.out.println("Lançou uma bola de fogo consumindo " + custoMana + " de mana!");
    }

    @Override
    public int getCustoMana() {
        return this.custoMana;
    }
}