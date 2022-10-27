import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
    private int id;
    private String createAt;
    private String updateAt;
    private String finishAt;
    private Mecanica mecanica = new Mecanica();
    private List<Mecanico> mecanicos = new ArrayList<Mecanico>();
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private Veiculo veiculo = new Veiculo();
    private TipoServico tipoServico = new TipoServico();
    private List<AtualizaServico> atualizaServicos = new ArrayList<AtualizaServico>();
    private float valorOrcamento;
    private int nota;

    public OrdemServico() {
    }

    public OrdemServico(int id, String createAt, String updateAt, String finishAt, Mecanica mecanica, List<Mecanico> mecanicos, List<Cliente> clientes, Veiculo veiculo, TipoServico tipoServico, List<AtualizaServico> atualizaServicos, float valorOrcamento, int nota) {
        this.id = id;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.finishAt = finishAt;
        this.mecanica = mecanica;
        this.mecanicos = mecanicos;
        this.clientes = clientes;
        this.veiculo = veiculo;
        this.tipoServico = tipoServico;
        this.atualizaServicos = atualizaServicos;
        this.valorOrcamento = valorOrcamento;
        this.nota = nota;
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

    public String getFinishAt() {
        return finishAt;
    }

    public void setFinishAt(String finishAt) {
        this.finishAt = finishAt;
    }

    public Mecanica getMecanica() {
        return mecanica;
    }

    public void setMecanica(Mecanica mecanica) {
        this.mecanica = mecanica;
    }

    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(List<Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public List<AtualizaServico> getAtualizaServicos() {
        return atualizaServicos;
    }

    public void setAtualizaServicos(List<AtualizaServico> atualizaServicos) {
        this.atualizaServicos = atualizaServicos;
    }

    public float getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(float valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
