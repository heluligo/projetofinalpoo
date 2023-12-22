package ProjetoFinal;
import java.util.ArrayList;

public class OperacoesFilmes {
    ArrayList<Filme> cadastroDeFilme;

    public OperacoesFilmes(){
        this.cadastroDeFilme = new ArrayList<>();
    }

    public void cadastrarFilme(Filme filmes){
        boolean ehCadastrado = false;
        for (Filme user : this.cadastroDeFilme){
            if (user.getTitulo().equals(filmes.getTitulo())){
                System.err.println("Título já cadastrado");
                ehCadastrado = true;
                break;
            }
        }
        if (!ehCadastrado) {
            cadastroDeFilme.add(filmes);
        }
    }
    public ArrayList<Filme> getCadastroDeFilme(){
        return  this.cadastroDeFilme;
    }

}
