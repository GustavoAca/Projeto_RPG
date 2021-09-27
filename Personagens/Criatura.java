package Personagens;

import java.util.Scanner;

public class Criatura {
    private String nome;
    private int mana;
    private int vida;
    private int dano;
    private int level;
    private int defesa;

    //Métodos
    public void status(){
        System.out.println("--------------Criatura------------------");
        System.out.println("Nome: " + this.getNome() + " |   Level: " + this.getLevel()  );
        System.out.println("Vida: " + this.getVida() + " |   Dano: "  + this.getDano());
        System.out.println("Defesa: " + this.getDefesa());
        System.out.println("----------------------------------------");

    }

    public void Nome() {
        String tex;
        Scanner in = new Scanner(System.in);
        System.out.print("Nome: ");
        tex = in.nextLine();
        this.setNome(tex);

    }
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getDano(){
        return dano;
    }
    public void setDano(int dano){
        this.dano = dano;
    }
    public int getDefesa(){
        return defesa;
    }
    public void setDefesa(int defesa){
        this.defesa = defesa;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
        int cont = 1;

                this.mana = 100;
                this.vida = 100;
                this.defesa = 10;
                this.dano = 10;
            if(this.level > 1){
            while(cont < this.getLevel()){
                this.setMana(this.mana+10);
                this.setVida(this.vida+10);
                this.setDefesa(this.defesa+10);
                this.setDano(this.dano+5);
                cont ++;
            }
        }
    }
}
