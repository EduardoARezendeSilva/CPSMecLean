import java.util.Scanner;

public class Mecanica {
    private int id;
    public Pessoa pessoa = new Pessoa();

    public Mecanica() {
    }

    public Mecanica(int id, Pessoa pessoa) {
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

    public void CadastraMecanica(Scanner ler)
    {
        System.out.print("Mecanica\n");
        System.out.print("Informe o ID da Mecanica: ");
        id = ler.nextInt();
        ler.nextLine();

        pessoa.cadastraPessoa(ler);
    }
}
