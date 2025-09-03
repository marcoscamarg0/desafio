package br.tec.db.servicoguincho.simulador.impl;

import br.tec.db.servicoguincho.simulador.Trajeto;

public class TrajetoImpl implements Trajeto {

    private final Integer distanciaEmKM;

    public TrajetoImpl(Integer distanciaEmKM) {
        this.distanciaEmKM = distanciaEmKM;
    }

    @Override
    public Integer getDistanciaEmKM() {
        return distanciaEmKM;
    }
}