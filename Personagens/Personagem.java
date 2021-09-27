package Personagens;

import java.util.Scanner;

public class Personagem extends Criatura {
    //Atributo
    private String classe;



        //Metodos
        public void Geral(){
            System.out.println("____________PERSONAGEM__________________");
            System.out.println("Nome: " + this.getNome() + " |   Level: " + this.getLevel());
            System.out.println("Defesa: " + this.getDefesa() + " |   Mana: " + this.getMana());
            System.out.println("Vida: " + this.getVida()+ " |   Dano: " + this.getDano());
            System.out.println("Classe: " + this.getClasse());
            System.out.println("_______________________________________");
        }

        public void classe(){
            String tex;
            Scanner in = new Scanner(System.in);
            System.out.print("Classe: ");
            tex = in.nextLine();
            this.setClasse(tex);
        }
        
        //Métodos especiais
    public Personagem(){
            this.setMana(100);
            this.setVida(100);
    }
    
        public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;

    }

    
    
}
