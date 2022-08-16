package io.rodrigoapolo.calculadora.modelo;

@FunctionalInterface
public interface MemoriaObservador {

    void valorAlterado(String novoValor);
}
