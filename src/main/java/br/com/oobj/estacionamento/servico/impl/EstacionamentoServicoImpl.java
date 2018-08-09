package br.com.oobj.estacionamento.servico.impl;

import java.util.Date;

import br.com.oobj.estacionamento.modelo.Veiculo;
import br.com.oobj.estacionamento.servico.EstacionamentoServico;

public class EstacionamentoServicoImpl implements EstacionamentoServico {

	public void registrarEntrada(Veiculo veiculo) {
		// chamar o dao para salvar no banco de dados		
		veiculo.setDataHoraEntrada(new Date());		
		// salvar esse veiculo
	}

	public void registrarSaida(Veiculo veiculo) {
		// buscar a ultima entrada do veiculo
		veiculo.setDataHoraSaida(new Date());
		
	}

	public Double calcularValor(Veiculo veiculo) {
		// buscar o ultimo estacimento do veiculo
		return veiculo.getTipoVeiculo().getCalculadora().calcular(veiculo);
		
	}

}