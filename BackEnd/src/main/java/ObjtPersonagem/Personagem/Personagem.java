package ObjtPersonagem.Personagem;

import ObjtArma.AcessoriosArmas.AcessoriosAbstractArmaGrande;
import ObjtArma.Armas.Glock;
import ObjtArma.Armas.M4A1;
import ObjtArma.ClassesDeArmas.Pistola;
import ObjtPersonagem.AcessoriosPersonagem.Capacete;
import ObjtPersonagem.AcessoriosPersonagem.Colete;
import ObjtPersonagem.AcessoriosPersonagem.TiposCapacete;
import ObjtPersonagem.AcessoriosPersonagem.TiposColete;
import ObjtPersonagem.Times.EnumTimes;

import java.util.Random;

public class Personagem extends AbstractPersonagem {



    /* Construtores do personagem */
    public Personagem(EnumTimes time){
        this.level = geradorAleatorio.nextInt(6);
        this.vida = 100;
        this.armaPrimaria = new M4A1();
        this.armaSecundaria = new Glock();
        this.colete = new Colete(TiposColete.COLETEMEDIO);
        this.capacete = new Capacete(TiposCapacete.CAPACETEPESADO);
        this.armaNaMao = armaPrimaria;
        this.timeDoPersonagem = time;
        this.vidaMaisProtecao = this.getVida() + this.capacete.getDurabilidadeAcessorio() + this.colete.getDurabilidadeAcessorio();
        System.out.println(String.format("Está com a %s na mão",armaNaMao.getNomeArma()));
    }


    public Personagem(EnumTimes time, AcessoriosAbstractArmaGrande armaPrimaria, Pistola armaSecundaria, TiposColete colete, TiposCapacete capacete){
        this.level = geradorAleatorio.nextInt(6);
        this.vida = 100;
        this.armaPrimaria = armaPrimaria;
        this.armaSecundaria = armaSecundaria;
        this.colete = new Colete(colete);
        this.capacete = new Capacete(capacete);
        this.armaNaMao = armaPrimaria;
        this.timeDoPersonagem = time;
        this.vidaMaisProtecao = getVida() + this.capacete.getDurabilidadeAcessorio() + this.colete.getDurabilidadeAcessorio();
        System.out.println(String.format("Está com a %s na mão",armaNaMao.getNomeArma()));
    }


}
