package model;

import interfaces.IArma;

/**
 * SOLID (SRP): Centraliza a responsabilidade de definir o que constitui
 * uma arma genérica no jogo, estendendo as propriedades físicas de um Item.
 */
public abstract class Arma extends Item implements IArma {
    private int dano;

    public Arma(String nome, int peso, int preco, int dano) {
        super(nome, peso, preco); // Repassa nome, peso e preço para o construtor de Item
        this.dano = dano;
    }

    @Override
    public int getDano() {
        return this.dano;
    }
}