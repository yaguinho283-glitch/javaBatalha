import Personagens.Arqueiro;
import Personagens.Cavaleiro;
import Personagens.Mago;
import Personagens.Personagem;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Personagem p1;
        Personagem p2;
        String informacao = " Atributos das classes \n"+
                Cavaleiro.informacao +"\n"+
                Arqueiro.informacao+"\n"+
                Mago.informacao;
        String [] escolha1 ={"Cavaleiro","Arqueiro","Mago"};
        int opcao1 = JOptionPane.showOptionDialog(null,informacao,"Personagem 1",0,1,null, escolha1,0);
        if (opcao1 == 0){
            p1 = new Cavaleiro(JOptionPane.showInputDialog("Nome do personagem:"));
            JOptionPane.showMessageDialog(null,"Olá "+p1.getNome()+"! esses são seus atributos sendo dessa classe!\n"+
                    Cavaleiro.informacao);
        } else if (opcao1 == 1){
            p1  = new Arqueiro(JOptionPane.showInputDialog("Nome do personagem:"));
            JOptionPane.showMessageDialog(null,"Olá "+p1.getNome()+"! esses são seus atributos sendo dessa classe!\n"+
                    Arqueiro.informacao);
        } else {
            p1 = new Mago(JOptionPane.showInputDialog("Nome do personagem:"));
            JOptionPane.showMessageDialog(null,"Olá "+p1.getNome()+"! esses são seus atributos sendo dessa classe!\n"+
                    Mago.informacao);
        }
        int opcao2 = JOptionPane.showOptionDialog(null,informacao,"Personagem 2",0,1,null, escolha1,0);
        if (opcao2 == 0){
            p2 = new Cavaleiro(JOptionPane.showInputDialog("Nome do personagem:"));
            JOptionPane.showMessageDialog(null,"Olá "+p2.getNome()+"! esses são seus atributos sendo dessa classe!\n"+
                    Cavaleiro.informacao);
        } else if (opcao2 == 1){
            p2 = new Arqueiro(JOptionPane.showInputDialog("Nome do personagem:"));
            JOptionPane.showMessageDialog(null,"Olá "+p2.getNome()+"! esses são seus atributos sendo dessa classe!\n"+
                    Arqueiro.informacao);
        } else {
            p2 = new Mago(JOptionPane.showInputDialog("Nome do personagem:"));
            JOptionPane.showMessageDialog(null,"Olá "+p2.getNome()+"! esses são seus atributos sendo dessa classe!\n"+
                    Mago.informacao);
        }
        JOptionPane.showMessageDialog(null,"Ira começar em !","Preparados para o duelo?",3);

        for (int i = 1,x=3; i <= x;x--){

            JOptionPane.showMessageDialog(null,x);
        }
        while(p1.Estavivo() && p2.Estavivo()){
            String[] escolha2 = {"Atacar","Defender"};
            int acao1 = JOptionPane.showOptionDialog(null,p1.informacaoPersonagem() +
                    "\n"+p2.informacaoPersonagem(),"Vez de "+p1.getNome(),0,3,null,escolha2,0);

            if (acao1 == 0){
                 p2.ReceberDano(p1.getDano());
                JOptionPane.showMessageDialog(null,"Deu "+p1.getDano()+" de dano!","Ataque ",2);
            } else {
                p1.Defender();
                JOptionPane.showMessageDialog(null,"+"+p1.getMaisEscudo()," Escudo",2);
            }

            if(p1.Estavivo() && p2.Estavivo()) {

            int acao2 = JOptionPane.showOptionDialog(null,p1.informacaoPersonagem() + "\n" +
                    p2.informacaoPersonagem(),"Vez de "+p2.getNome(),0,3,null,escolha2,0);
            if (acao2 == 0){
                p1.ReceberDano(p2.getDano());
                JOptionPane.showMessageDialog(null,"Deu "+p2.getDano()+" de dano!","Ataque",2);
            } else {
                p2.Defender();
                JOptionPane.showMessageDialog(null,""+p2.getMaisEscudo()," Escudo",2);
                }
            }
        }
    }

}
