package ProjetoFinal;

public class Filme {
    //Atributos
    private String titulo;
    private String categoria;
    private int anoLancamento;
    private int faixaEtaria;
    private String duracao;
    //private String sinopse;
    private double pontuação;
    private String direcao;
    private String elenco[];

    //Método construtor
    public Filme(String titulo, String categoria, int anoLancamento, int faixaEtaria,
                 String duracao, double pontuação, String direcao,
                 String[] elenco) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.anoLancamento = anoLancamento;
        this.faixaEtaria = faixaEtaria;
        this.duracao = duracao;
        //this.sinopse = sinopse;
        this.pontuação = pontuação;
        this.direcao = direcao;
        this.elenco = elenco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public double getPontuação() {
        return pontuação;
    }

    public void setPontuação(double pontuação) {
        this.pontuação = pontuação;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }
}
