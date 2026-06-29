package model;

import interfaces.IArmaCorpoACorpo;

public class Machado extends Arma implements IArmaCorpoACorpo {
    private int durabilidade;

    public Machado(String nome, int peso, int preco, int dano, int durabilidade) {
        super(nome, peso, preco, dano);
        this.durabilidade = durabilidade;
    }

    @Override
    public void golpear() {
        System.out.println("Desferiu um golpe pesado com o machado!");
        this.durabilidade -= 2; // Machado perde durabilidade mais rápido
    }

    @Override
    public int getDurabilidade() {
        return this.durabilidade;
    }
}