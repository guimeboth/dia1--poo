package br.com.estudos.model;

public class Galinha extends Ave {
    private boolean caipira;

    public boolean isCaipira() {
        return caipira;
    }

    public Galinha(String nome, int idade, boolean caipira) {
        super(nome, idade);
        this.caipira = caipira;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": cocó.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está ciscando.");
    }

}
