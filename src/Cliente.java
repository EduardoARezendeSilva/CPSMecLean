import java.util.Scanner;

public class Cliente {
    private int id;
    public Pessoa pessoa = new Pessoa();

    public Cliente() {
    }

    public Cliente(int id, Pessoa pessoa) {
        this.id = id;
        this.pessoa = pessoa;
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

    public void CadastraCliente(Scanner ler)
    {
        System.out.print("Cliente\n");
        System.out.print("Informe o ID do Cliente: ");
        id = ler.nextInt();
        ler.nextLine();

        pessoa.cadastraPessoa(ler);
    }
}
