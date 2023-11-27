public class Endereco {
    private String estado;
    private String cidade;
    private String rua;

    // Construtor
    public Endereco() {
        // Construtor padrão
    }

    // Métodos para manipulação do atributo 'rua'
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    // Métodos para manipulação do atributo 'cidade'
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    // Métodos para manipulação do atributo 'estado'
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
