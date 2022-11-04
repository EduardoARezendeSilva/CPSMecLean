import java.util.Scanner;

public class Endereco {
    private int id;
    private String rua;
    private String cidade;
    private String estado;
    private String codigoPostal;
    private String pais;

    public Endereco() {
    }

    public Endereco(int id, String rua, String cidade, String estado, String codigoPostal, String pais) {
        this.id = id;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void cadastraEndereco(Scanner ler)
    {
        System.out.print("Endereco\n");
        System.out.print("Informe o ID da Endereco: ");
        id = ler.nextInt();
        ler.nextLine();

        System.out.print("Informe a rua: ");
        rua = ler.nextLine();

        System.out.print("Informe a cidade: ");
        cidade = ler.nextLine();

        System.out.print("Informe a estado: ");
        estado = ler.nextLine();

        System.out.print("Informe a codigo postal: ");
        codigoPostal = ler.nextLine();

        System.out.print("Informe a pais: ");
        pais = ler.nextLine();
    }
}
