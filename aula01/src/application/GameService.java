package application;

import service.INumeroService;
import service.ValidacaoService;
import service.ScoreService;

public class GameService {

    private INumeroService numeroService;
    private ValidacaoService validacaoService;
    private ScoreService scoreService;

    public GameService(INumeroService numeroService,
                       ValidacaoService validacaoService,
                       ScoreService scoreService) {

        this.numeroService = numeroService;
        this.validacaoService = validacaoService;
        this.scoreService = scoreService;
    }

    public boolean jogar(int tentativa) {

        int numero = numeroService.gerarNumero();

        boolean resultado = validacaoService.validar(numero, tentativa);

        if (resultado) {
            scoreService.adicionarPonto();
        }

        return resultado;
    }

    public int getPontuacao() {
        return scoreService.getPontos();
    }
}