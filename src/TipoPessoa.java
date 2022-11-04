import java.util.Scanner;

public class TipoPessoa {
    private int id;
    private String valor;

    public TipoPessoa() {
    }

    public TipoPessoa(int id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void cadastraTipoPessoa(Scanner ler)
    {
        System.out.print("Tipo Pessoa\n");
        System.out.print("Informe o ID do Tipo Pessao: ");
        id = ler.nextInt();
        ler.nextLine();

        System.out.print("Informe o Tipo Pessoa: ");
        valor = ler.nextLine();

    }
}
