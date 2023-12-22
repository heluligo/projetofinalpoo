package ProjetoFinal;

import java.util.ArrayList;

public class PrincipalFilmes {
    public static void main(String[] args) {
        //Cadastra o filme no BD
        Filme filme = new Filme("Napoleão", "Biografia", 2023,
                16, "2h38m", 6.6, "Ridley Scott",
                new String[]{"Joaqui Phoenix", "Vanessa Kirby", "Tahar Rahim"});
        Filme filme2 = new Filme("Aquaman 2", "Aventura", 2023,
                13, "1h55m", 7.6, "James Wan",
                new String[]{"Jason Momoa", "Ben Afleck", "Patric Wilson"});
        Filme filme3 = new Filme("Aquaman 2", "Aventura", 2023,
                13, "1h55m", 7.6, "James Wan",
                new String[]{"Jason Momoa", "Ben Afleck", "Patric Wilson"});

        //Instancia a classe OperaçõesFilmes
        OperacoesFilmes operacoesFilmes = new OperacoesFilmes();

        //Chama o método que adiciona um filme no array
        operacoesFilmes.cadastrarFilme(filme);
        operacoesFilmes.cadastrarFilme(filme2);
        operacoesFilmes.cadastrarFilme(filme3);

        //Retorna os filmes gravados no BD
        ArrayList<Filme> filmesCadastrados = operacoesFilmes.getCadastroDeFilme();
        System.out.println("Filmes cadastrados no BD: ");
        for (Filme item : filmesCadastrados){
            System.out.println(">> " + item.getTitulo() + " - " + item.getDirecao());
        }
    }
}
