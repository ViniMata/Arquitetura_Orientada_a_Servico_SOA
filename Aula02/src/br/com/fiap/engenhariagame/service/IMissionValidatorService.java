package br.com.fiap.engenhariagame.service;

import br.com.fiap.engenhariagame.domain.Mission;

public interface IMissionValidatorService {
    boolean validate(Mission mission);
}
