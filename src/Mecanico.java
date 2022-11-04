import java.util.Scanner;

public class Mecanico {
    private int id;
    public Pessoa pessoa = new Pessoa();
    private String funcao;

    public Mecanico() {
    }

    public Mecanico(int id, Pessoa pessoa, String funcao) {
        this.id = id;
        this.pessoa = pessoa;
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void CadastraMecanico(Scanner ler)
    {
        System.out.print("Mecanico\n");
        System.out.print("Informe o ID do Mecanico: ");
        id = ler.nextInt();
        ler.nextLine();

        System.out.print("Informe o Funcao: ");
        funcao = ler.nextLine();

        pessoa.cadastraPessoa(ler);
    }
}
