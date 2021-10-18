package ObjtArma.ClassesDeArmas;

import ObjtArma.AcessoriosArmas.AcessoriosAbstractArmaGrande;
import org.apache.commons.lang3.StringUtils;

public abstract class Shotgun extends AcessoriosAbstractArmaGrande {
    private AcessoriosAbstractArmaGrande acessoriosArmaGrande;

    public Shotgun () {
        acessoriosArmaGrande.setMira("Mira de ferro");
        acessoriosArmaGrande.setCoronha("Coronha padrão");
        acessoriosArmaGrande.setGrip("Sem grip");
        this.cano = "Cano padrão";
        this.laser = "Sem laser";
        this.tamanhoPente = 8;
        this.municao = tamanhoPente;

    }

    public Shotgun (int tamanhoPente, String mira, String coronha, String grip, String cano, String laser) {
        acessoriosArmaGrande.setMira(StringUtils.isEmpty(mira) ? "Mira de ferro" : mira.trim());

        acessoriosArmaGrande.setCoronha(StringUtils.isEmpty(coronha) ? "Coronha padrão" : coronha.trim());

        acessoriosArmaGrande.setGrip(StringUtils.isEmpty(grip) ? "Sem grip" : grip.trim());

        this.cano    = StringUtils.isEmpty(cano) ? "Cano padrão" : cano.trim();

        this.laser   = StringUtils.isEmpty(laser) ? "Sem laser" : laser.trim();

        this.tamanhoPente = tamanhoPente;

        this.municao = tamanhoPente;

    }

}
