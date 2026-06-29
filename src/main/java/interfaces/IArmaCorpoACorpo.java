package interfaces;

/**
 * SOLID (ISP): Interface específica para armas brancas.
 * Quem implementa isso não é forçado a ter métodos de munição ou mana.
 */
public interface IArmaCorpoACorpo extends IArma {
    void golpear();
    int getDurabilidade();
}