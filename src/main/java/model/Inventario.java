package model;

import interfaces.IInventario;
import java.util.List;

/**
 * GoF: RealSubject
 * O objeto real que contém os dados e a lógica de negócio do cálculo.
 * * SOLID (SRP): Tem apenas um motivo para mudar, que é a alteração na regra
 * de negócio sobre como os itens são calculados.
 * * GRASP (Information Expert): Esta classe detém a informação (a lista de itens)
 * necessária para executar o cálculo do peso, logo, é a especialista.
 */
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