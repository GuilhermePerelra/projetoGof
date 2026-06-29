package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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