package model;

import lombok.AllArgsConstructor;

public class Item {
    private Long id;
    private String nome;
    private int preco;
    private int peso;

    public Item(String nome, int peso, int preco) {
        this.peso = peso;
        this.preco = preco;
        this.nome = nome;
    }
}
