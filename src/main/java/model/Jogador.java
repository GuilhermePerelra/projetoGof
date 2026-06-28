package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jogador {
    private Long id;
    private String nome;
    private Inventario inventario;
}
