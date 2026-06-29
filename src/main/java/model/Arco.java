package model;

import interfaces.IArmaDistancia;

public class Arco extends Arma implements IArmaDistancia {
    private int flechas;

    public Arco(String nome, int peso, int preco, int dano, int flechas) {
        super(nome, peso, preco, dano);
        this.flechas = flechas;
    }

    @Override
    public void atirar() {
        if (flechas > 0) {
            System.out.println("Atirou uma flecha!");
            flechas--;
        } else {
            System.out.println("Sem munição!");
        }
    }

    @Override
    public int getMunicao() {
        return this.flechas;
    }
}