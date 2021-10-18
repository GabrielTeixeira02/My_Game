package ObjtArma.ClassesDeArmas;

import ObjtArma.AcessoriosArmas.AcessoriosAbstractArmaGrande;
import org.apache.commons.lang3.StringUtils;

public abstract class Fuzil extends AcessoriosAbstractArmaGrande {



    public  Fuzil(){
        this.mira = "Mira de ferro";
        this.coronha = "Coronha padrão";
        this.grip = "Sem grip";
        this.cano = "Cano padrão";
        this.laser = "Sem laser";
        this.tamanhoPente = 31;
        this.municao = tamanhoPente;
        this.camuflagem = "Preto";
        System.out.println("Arma assumiu valores padrões");

    }


    public Fuzil(int tamanhoPente, String mira, String coronha, String grip, String cano, String laser, String camuflagem){
        this.mira       = StringUtils.isEmpty(mira) ? "Mira de ferro" : mira.trim();

        this.coronha    = StringUtils.isEmpty(coronha) ? "Coronha padrão" : coronha.trim();

        this.grip       = StringUtils.isEmpty(grip) ? "Sem grip" : grip.trim();

        this.cano       = StringUtils.isEmpty(cano) ? "Cano padrão" : cano.trim();

        this.laser      = StringUtils.isEmpty(laser) ? "Sem laser" : laser.trim();

        this.camuflagem = StringUtils.isEmpty(camuflagem) ? "Preto" : camuflagem.trim();

        this.tamanhoPente = tamanhoPente;

        this.municao = tamanhoPente;

      //  StringUtils.isNotEmpty();  V se não for vazio ou nulo
        //StringUtils.isEmpty(); V se for vazio ou nulo

    }

}
