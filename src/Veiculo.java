public class Veiculo {
    private int id;
    private String nome;
    private String marca;
    private String placa;
    private String[] imagensURL;

    public Veiculo() {
    }

    public Veiculo(int id, String nome, String marca, String placa, String[] imagensURL) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.placa = placa;
        this.imagensURL = imagensURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String[] getImagensURL() {
        return imagensURL;
    }

    public void setImagensURL(String[] imagensURL) {
        this.imagensURL = imagensURL;
    }
}
