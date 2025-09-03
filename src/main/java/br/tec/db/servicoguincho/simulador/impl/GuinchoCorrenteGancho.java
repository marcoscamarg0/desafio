package br.tec.db.servicoguincho.simulador.impl;

import br.tec.db.servicoguincho.simulador.Guincho;
import br.tec.db.servicoguincho.simulador.Trajeto;

public class GuinchoCorrenteGancho implements Guincho {

    private static final double TAXA_DESLOCAMENTO = 2.00;

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return trajeto.getDistanciaEmKM() * TAXA_DESLOCAMENTO;
    }
}