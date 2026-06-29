package interfaces;

import model.Jogador;

/**
 * SOLID (DIP): Abstração para o repositório de jogadores.
 * Módulos de alto nível devem depender desta interface, e não da
 * implementação concreta.
 */
public interface IJogadorRepository {
    void salvar(Jogador jogador);
    Jogador buscarPorId(Long id);
}