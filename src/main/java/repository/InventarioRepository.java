package repository;

import model.Inventario;
import model.Item;

import java.util.List;

public class InventarioRepository {
    
    public Inventario buscarInventarioPorJogador(Long id) {

        List<Item> itens = List.of(
                new Item("Espada",5,2),
                new Item("Poção",1,3)
        );

        return new Inventario(itens);
    }
}
