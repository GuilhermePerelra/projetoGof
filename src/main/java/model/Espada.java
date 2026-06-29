package model;

import interfaces.IArmaCorpoACorpo;

public class Espada extends Arma implements IArmaCorpoACorpo {
    private int durabilidade;

    public Espada(String nome, int peso, int preco, int dano, int durabilidade) {
        super(nome, peso, preco, dano); // Repassa os dados para a classe abstrata Arma
        this.durabilidade = durabilidade;
    }

    @Override
    public void golpear() {
        System.out.println("Atacou com a espada! Corte rápido.");
        this.durabilidade--;
    }

    @Override
    public int getDurabilidade() {
        return this.durabilidade;
    }
}