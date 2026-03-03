package service;

import java.util.Random;

public class NumeroService implements INumeroService  {

    private Random random = new Random();
    @Override
    public int gerarNumero() {
        return random.nextInt(6) + 1;
    }
}