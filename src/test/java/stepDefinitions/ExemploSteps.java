package stepDefinitions;

import io.cucumber.java.pt.*;

public class ExemploSteps {

    @Dado("que o cenario teve inicio")
    public void que_o_cenario_teve_inicio() {
        System.out.println("[Dado que] == Given");
    }

    @Quando("este passo for realizado")
    public void este_passo_for_realizado() {
        System.out.println("[Quando] == When");
    }

    @E("esta condicao tambem for satisfeita")
    public void esta_condicao_tambem_for_satisfeita() {
        System.out.println("[E] == And");
    }

    @Entao("este sera o resultado")
    public void este_sera_o_resultado() {
        System.out.println("[Entao] == Then");
    }
}
