package br.com.fiap.engenhariagame.domain;

import br.com.fiap.engenhariagame.service.IScoreService;

public class Player{

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void setScore(int points){
        this.score += points;
    }

    public int getScore() {
        return score;
    }
}
