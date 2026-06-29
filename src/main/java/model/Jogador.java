package model;

import interfaces.IInventario;
import lombok.Getter;
import lombok.Setter;

/**
 * SOLID (DIP): O Jogador depende da abstração (IInventario) e não da
 * implementação concreta (Inventario). Isso permite injetar o Proxy.
 */
@Getter
@Setter
public class Jogador {
    private Long id;
    private String nome;

    private IInventario inventario;

    public Jogador(Long id, String nome, IInventario inventario) {
        this.id = id;
        this.nome = nome;
        this.inventario = inventario;
    }
}