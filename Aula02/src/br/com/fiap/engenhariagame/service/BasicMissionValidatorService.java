package br.com.fiap.engenhariagame.service;

import br.com.fiap.engenhariagame.domain.Mission;


public class BasicMissionValidatorService implements IMissionValidatorService{

    @Override
    public boolean validate(Mission mission) {
        return mission.getDifficulty() <= 5;
    };




}
