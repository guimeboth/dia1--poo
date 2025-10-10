package br.com.estudos.model.exceptions;

public class AnimalNaoEncontratoException extends RuntimeException {
    public AnimalNaoEncontratoException(String nome) {
        super("Animal com nome '" + nome + "' não encontrado!");
    }

}
