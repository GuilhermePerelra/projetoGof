package repository;

import model.*;

import java.util.List;

public class InventarioRepository {

    public Inventario buscarInventarioPorJogador(Long id) {
        System.out.println("[BANCO DE DADOS] Executando SELECT pesado para buscar itens do jogador " + id + "...");

        List<Item> itens = List.of(
                // Agora instanciamos as armas específicas com seus novos construtores
                new Espada("Espada Longa", 5, 200, 50, 100), // nome, peso, preco, dano, durabilidade
                new Arco("Arco Élfico", 2, 300, 30, 20),
                new Machado("Machado Bárbaro", 50, 600, 90, 200),
                new Cajado("Varinha Mágica", 3, 150, 40, 80),
                new Item("Poção de Cura", 1, 50)
        );

        return new Inventario(itens);
    }
}