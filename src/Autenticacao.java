import java.util.Scanner;

public class Autenticacao {
    private int id;
    private String email;
    private String senha;

    public Autenticacao() {
    }

    public Autenticacao(int id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastraAutenticacao(Scanner ler)
    {
        System.out.print("Autenticacao\n");
        System.out.print("Informe o ID da Autenticacao: ");
        id = ler.nextInt();
        ler.nextLine();

        System.out.print("Informe o Email: ");
        email = ler.nextLine();

        System.out.print("Informe a senha: ");
        senha = ler.nextLine();
    }

    public boolean validarLogin(String email, String senha)
    {
        if (this.email.equals(email) && this.senha.equals(senha))
        {
            return true;
        }
        return false;
    }

    public boolean verificarEmail(String email)
    {
        if (this.email.equals(email))
        {
            return true;
        }

        return false;
    }
}
