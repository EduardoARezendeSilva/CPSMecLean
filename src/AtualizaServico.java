public class AtualizaServico {
    private int id;
    private String createAt;
    private String updateAt;
    private String descricao;
    private Solicitacao solicitacao = new Solicitacao();

    public AtualizaServico() {
    }

    public AtualizaServico(int id, String createAt, String updateAt, String descricao, Solicitacao solicitacao) {
        this.id = id;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.descricao = descricao;
        this.solicitacao = solicitacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }
}
