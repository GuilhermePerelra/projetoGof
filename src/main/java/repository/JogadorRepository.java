package repository;

import interfaces.IJogadorRepository;
import model.Jogador;

/**
 * SOLID (SRP): Esta classe tem a única responsabilidade de lidar com a persistência
 * (salvar e buscar) das informações cadastrais do Jogador no banco de dados.
 */
public class JogadorRepository implements IJogadorRepository {

    // Simula a ação de guardar as informações do jogador no banco
    public void salvar(Jogador jogador) {
        System.out.println("[BANCO DE DADOS] Abrindo conexão...");
        System.out.println("[BANCO DE DADOS] Executando: INSERT INTO jogador (id, nome) VALUES ("
                + jogador.getId() + ", '" + jogador.getNome() + "');");
        System.out.println("SUCESSO: Informações do jogador '" + jogador.getNome() + "' guardadas com sucesso!\n");
    }

    // Opcional: Simula a busca de um jogador existente
    public Jogador buscarPorId(Long id) {
        System.out.println("[BANCO DE DADOS] Buscando dados cadastrais do jogador " + id + "...");
        // Aqui o banco retornaria os dados básicos
        return new Jogador(id, "Nagafe", null); // O inventário seria injetado depois
        /* // 1. Buscamos APENAS os dados leves do jogador (Retorna com inventário null)
        Jogador jogadorSalvo = jogadorRepo.buscarPorId(1L);
        // 2. Criamos o nosso Proxy leve
        IInventario inventarioProxy = new InventarioProxy(jogadorSalvo.getId(), inventarioRepo);
        // 3. Injetamos o Proxy no jogador que acabou de vir do banco!
        jogadorSalvo.setInventario(inventarioProxy);*/
    }
}