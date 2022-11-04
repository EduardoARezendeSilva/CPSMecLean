import java.util.Scanner;

public class Pessoa {
    private int id;
    public Autenticacao autenticacao = new Autenticacao();
    private String nome;
    private int telefone;
    private String documento;
    public Endereco endereco = new Endereco();
    private String urlImagem;

    public TipoPessoa tipoPessoa = new TipoPessoa();

    public Pessoa() {
    }

    public Pessoa(int id, Autenticacao autenticacao, String nome, int telefone, String documento, Endereco endereco, String urlImagem, TipoPessoa tipoPessoa) {
        this.id = id;
        this.autenticacao = autenticacao;
        this.nome = nome;
        this.telefone = telefone;
        this.documento = documento;
        this.endereco = endereco;
        this.urlImagem = urlImagem;
        this.tipoPessoa = tipoPessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Autenticacao getAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(Autenticacao autenticacao) {
        this.autenticacao = autenticacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public void cadastraPessoa(Scanner ler)
    {
        System.out.print("Pessoa\n");
        System.out.print("Informe o ID da Pessoa: ");
        id = ler.nextInt();
        ler.nextLine();

        System.out.print("Informe o nome: ");
        nome = ler.nextLine();

        System.out.print("Informe o telefone: ");
        telefone = ler.nextInt();
        ler.nextLine();

        System.out.print("Informe a url da imagem: ");
        urlImagem = ler.nextLine();

        endereco.cadastraEndereco(ler);

        tipoPessoa.cadastraTipoPessoa(ler);
    }
}
