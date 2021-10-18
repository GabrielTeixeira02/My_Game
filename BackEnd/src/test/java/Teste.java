import ObjtArma.Armas.Glock;
import ObjtArma.Armas.M4A1;
import ObjtArma.Armas.Spas12;
import ObjtMapa.AbstractMapa.AbstractMapa;
import ObjtMapa.Mapas.MapaDaFloresta;
import ObjtMapa.OrganizarPartida.OrganizadorDePartida;
import ObjtPersonagem.AcessoriosPersonagem.TiposCapacete;
import ObjtPersonagem.AcessoriosPersonagem.TiposColete;
import ObjtPersonagem.Personagem.AbstractPersonagem;
import ObjtPersonagem.Times.EnumTimes;
import ObjtPersonagem.Personagem.Personagem;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) throws Exception {

        List<AbstractPersonagem> listaPersonagens = new ArrayList();


        Personagem a = new Personagem(EnumTimes.COALISAO,new M4A1(), new Glock(), TiposColete.COLETEPESADO, TiposCapacete.CAPACETEPESADO);
        Personagem b = new Personagem(EnumTimes.COALISAO,new Spas12(), new Glock(),TiposColete.COLETEPESADO, TiposCapacete.CAPACETEPESADO);
        a.PersonagemMirar(b);
        a.PersonagemAtirar(3);
//        a.PersonagemRecarregar();
//        System.out.println(a.getTimeDoPersonagem());
//        a.TrocaArmaNaMao(2);
//        a.PersonagemAtirar(2);
//
//        b.PersonagemAtirar(3);
//        System.out.println(b.getTimeDoPersonagem());
        Personagem c = new Personagem(EnumTimes.MARINES);
//        c.PersonagemAtirar(2);
//
        Personagem d = new Personagem(EnumTimes.MARINES);
//
//        a.PersonagemMirar(b);
//        a.PersonagemMirar(d);
//        a.PersonagemParaDeMirar();
//
//
//        listaPersonagens[0] = a;
//        listaPersonagens[1] = b;
//        listaPersonagens[2] = c;
//        listaPersonagens[3] = d;
//
        MapaDaFloresta aa = new MapaDaFloresta();
        aa.PassarPersonagensParaMapa(a);
        aa.PassarPersonagensParaMapa(b);
        aa.PassarPersonagensParaMapa(c);
        aa.PassarPersonagensParaMapa(d);
        aa.comecarJogo();


    }



}
