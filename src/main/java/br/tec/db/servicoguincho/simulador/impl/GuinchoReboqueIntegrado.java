package br.tec.db.servicoguincho.simulador.impl;

import br.tec.db.servicoguincho.simulador.Guincho;
import br.tec.db.servicoguincho.simulador.Trajeto;

public class GuinchoReboqueIntegrado implements Guincho {

    private static final double TAXA_DESLOCAMENTO = 10.00;

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return trajeto.getDistanciaEmKM() * TAXA_DESLOCAMENTO;
    }
}