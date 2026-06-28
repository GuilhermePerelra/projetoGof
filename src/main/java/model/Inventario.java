package model;

import interfaces.IInventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario implements IInventario {
    private Long id;
    private List<Item> items;

    public Inventario(List<Item> items) {
        this.items = items;
    }

    @Override
    public int pesoTotal() {
        return 0;
    }

    @Override
    public int precoTotal() {
        return 0;
    }
}
