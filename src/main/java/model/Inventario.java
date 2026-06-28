package model;

import interfaces.IInventario;

import java.util.List;

public class Inventario implements IInventario {
    private Long id;
    private List<Item> itens;

    public Inventario(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public int pesoTotal(){

        return itens.stream()
                .mapToInt(Item::getPeso)
                .sum();

    }

}
