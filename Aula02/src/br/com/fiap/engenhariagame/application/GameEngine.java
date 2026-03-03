package br.com.fiap.engenhariagame.application;

import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;
import br.com.fiap.engenhariagame.service.IMissionValidatorService;

public class GameEngine {

    private IMissionValidatorService validator;

    public GameEngine(IMissionValidatorService validator) {
        this.validator = validator;
    }

    public boolean executeMission(Player player, Mission mission) {

        boolean success = validator.validate(mission);

        if (success) {
            player.addScore(mission.getDifficulty() * 10);
        } else {
            player.addScore(-5);
        }

        return success;
    }
}
