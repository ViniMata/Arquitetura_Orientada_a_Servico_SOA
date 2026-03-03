package br.com.fiap.engenhariagame.service;
import br.com.fiap.engenhariagame.domain.Player;

public class ScoreService implements IScoreService {

    @Override
    public void addScore(int points) {
        this.score += points;
    }

    @Override
    public int getScore() {
        return score;
    }
}
