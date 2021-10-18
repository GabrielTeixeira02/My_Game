package ObjtArma.ClassesDeArmas;

import ObjtArma.AcessoriosArmas.AcessoriosAbstractArmaPequena;
import org.apache.commons.lang3.StringUtils;

public abstract class Pistola extends AcessoriosAbstractArmaPequena {

    public  Pistola(){
        this.cano = "Cano padrão";
        this.laser = "Sem laser";
        this.tamanhoPente = 12;
        this.municao = tamanhoPente;
        this.camuflagem = "Preto";

    }

    public Pistola(int tamanhoPente, String cano, String laser, String camuflagem){

        this.cano    = StringUtils.isEmpty(cano) ? "Cano padrão" : cano.trim();

        this.laser   = StringUtils.isEmpty(laser) ? "Sem laser" : laser.trim();

        this.camuflagem = StringUtils.isEmpty(camuflagem) ? "Preto" : camuflagem.trim();

        this.tamanhoPente = tamanhoPente;

        this.municao = tamanhoPente;

    }
}
