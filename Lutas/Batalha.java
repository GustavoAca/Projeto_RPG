package Lutas;
import java.util.Random;
import java.util.Scanner;
import Personagens.Criatura;
import Personagens.Personagem;

public class Batalha{
    //contador de round
    int cont=0;
    //atributos
    private Criatura monstro;
    private Personagem pers;

    //Metodos
    
    //verifica condições para batalha

    public void Ver(Criatura c1, Personagem p1){
        if(c1.getLevel() == p1.getLevel() || c1.getLevel() != p1.getLevel()){
            this.monstro = c1;
            this.pers = p1;
        }
    }

    public void Luta(){
        int opcao;
        this.monstro.status();
        this.pers.Geral();

        Scanner in = new Scanner(System.in);  
        System.out.println("Deseja comecar a luta? ");
        System.out.println("1- SIM            2-NÃO");
        opcao = in.nextInt();
        
        
            switch(opcao){

                case 1:
                
                if(this.monstro.getVida() > 0 && this.pers.getVida() > 0){
                    
                    //enquanto alguem tiver vivo a batalha continua
                    while( this.monstro.getVida() > 0 && this.pers.getVida() > 0){
                            Random ran = new Random();
                            int inic = ran.nextInt(2); //0 1
                          
                            //se no aleatorio for 0 chega nessa condição

                            if(inic == 0){
                                cont = cont + 1;    
                                Scanner i = new Scanner(System.in);
                                System.out.println("Round: " + cont);
                                System.out.println("____________________________________________");
                                System.out.println("1-Atacar                      2-Defender     ");
                                System.out.println("3- Super Ataque               4-Super Defesa");  
                                opcao = i.nextInt();
            
                                switch(opcao){
                                case 1:
                                    this.monstro.setVida( this.monstro.getVida() - this.pers.getDano());
                                break;
                            }
                            
                            //se for 1 o mosntro te da um dano programado
                        } if(inic == 1) {
                                cont = cont + 1;    
                                System.out.println("Round: " + cont);
                                System.out.println("____________________________________________");
                                this.pers.setVida(this.pers.getVida() - this.monstro.getDano());
                            } 
                        this.monstro.status();
                        this.pers.Geral();
                    }
                }
                // no final, ele da a condição para o  vencedor
                if(this.monstro.getVida() > 0){
                    System.out.println("o vencedor é: " + this.monstro.getNome());
                    }else{
                        System.out.println("o vencedor é: " + this.pers.getNome());
                }
            }
        }   

       // String tex;
        

//Atributos especiais
    public Criatura getMonstro() {
        return monstro;
    }
    public void setMonstro(Criatura monstro) {
        this.monstro = monstro;
    }
    public Personagem getPers() {
        return pers;
    }
    public void setPers(Personagem pers) {
        this.pers = pers;
    }

    

    
}
