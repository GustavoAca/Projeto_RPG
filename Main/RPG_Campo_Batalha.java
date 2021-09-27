package Main;

import Lutas.Batalha;
import Menus.menu;
import Personagens.Monstro;
import Personagens.Personagem;

public class RPG_Campo_Batalha {
    
public static void main(String [] args){
        Monstro c1 = new Monstro();
        Personagem p1 = new Personagem();
        menu menu = new menu();
        
        //inicio do menu
        menu.entrada();

        //nome do personagem

        p1.Nome();
        p1.setLevel(10);
        p1.classe();
    

        c1.setNome("Dracula");
        c1.setLevel(5);

        //instancia da batalha
        Batalha b = new Batalha();
        b.Ver(c1, p1);
        b.Luta();
        
    }
}