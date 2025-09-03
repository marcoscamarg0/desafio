package br.tec.db.servicoguincho;

import br.tec.db.servicoguincho.simulador.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.Veiculo;
import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;
import br.tec.db.servicoguincho.simulador.impl.SimuladorDeOrcamentoImpl;
import br.tec.db.servicoguincho.simulador.impl.TrajetoImpl;
import br.tec.db.servicoguincho.simulador.impl.VeiculoImpl;

public class Main {

    public static void main(String[] args) {
        // Cenário 1 - carro novo - do centro para o bairro A
        SimuladorDeOrcamento simulador = new SimuladorDeOrcamentoImpl();
        Veiculo carroNovo = new VeiculoImpl(TipoVeiculo.CARRO, EstadoConservacao.NOVO);
        Trajeto centroParaBairroA = new TrajetoImpl(10); // Distância C -> A é 10 km
        double custoCenario1 = simulador.calcularCustoTotal(carroNovo, centroParaBairroA);
        System.out.println("Cenário 1 - Custo Total do Serviço: R$" + custoCenario1);
    }
}