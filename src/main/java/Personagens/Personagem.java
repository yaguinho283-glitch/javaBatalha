package Personagens;


public abstract class Personagem {
    protected String nome;
    protected String classe;
    protected int vida;
    protected int escudo;
    protected int maisEscudo;
    protected int dano;


    public Personagem(String nome, String classe, int vida, int escudo, int maisEscudo,int dano) {
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.escudo = escudo;
        this.maisEscudo = maisEscudo;
        this.dano = dano;
    }



    public void ReceberDano(int Dano){
        if (Dano>escudo){
            int sobradano = Dano - escudo;
            vida-= sobradano;
            escudo = 0;
        } else {
            escudo-=Dano;
        }
    }

    public void Defender(){
        escudo += maisEscudo;
    }

    public boolean Estavivo(){
        if (vida >= 1){
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getVida() {
        return vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public int getMaisEscudo() {
        return maisEscudo;
    }

    public int getDano() {
        return dano;
    }

    public String informacaoPersonagem(){
        return "|"+classe + " | Hp: "+vida + " | Escudo: "+escudo+" | Dano: "+dano;
    }
}
