package br.tec.db.servicoguincho.simulador.impl;

import br.tec.db.servicoguincho.simulador.Guincho;
import br.tec.db.servicoguincho.simulador.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.Veiculo;
import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public class SimuladorDeOrcamentoImpl implements SimuladorDeOrcamento {

    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto) {
        Guincho guincho = selecionarGuincho(veiculo);
        return guincho.calcularCustoDeslocamento(trajeto);
    }

    private Guincho selecionarGuincho(Veiculo veiculo) {
        if (veiculo.getEstado() == EstadoConservacao.QUEBRADO) {
            return new GuinchoCorrenteGancho();
        }

        TipoVeiculo tipo = veiculo.getTipo();
        if (tipo == TipoVeiculo.CARRO || tipo == TipoVeiculo.MINIVAN) {
            return new GuinchoPlataforma();
        } else {
            return new GuinchoReboqueIntegrado();
        }
    }
}