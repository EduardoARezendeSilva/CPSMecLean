public class Solicitacao {
    private Peca peca = new Peca();
    private int id;
    private String destricao;
    private float valor;

    public Solicitacao() {
    }

    public Solicitacao(Peca peca, int id, String destricao, float valor) {
        this.peca = peca;
        this.id = id;
        this.destricao = destricao;
        this.valor = valor;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestricao() {
        return destricao;
    }

    public void setDestricao(String destricao) {
        this.destricao = destricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
