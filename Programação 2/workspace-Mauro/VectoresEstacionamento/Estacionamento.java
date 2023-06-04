public class Estacionamento{
    private String nomeCondutor, marca,modelo, matricula, cor;
    private Date dataEntrada;
    private int nrDePortas;
    public Estacionamento(String nomeCondutor, Date dataEntrada, String marca, String modelo, String matricula, String cor, int nrDePortas){
        this.nomeCondutor=nomeCondutor;
        this.dataEntrada=
    }
    public String getNomeCondutor() {
        return nomeCondutor;
    }
    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Date getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public int getNrDePortas() {
        return nrDePortas;
    }
    public void setNrDePortas(int nrDePortas) {
        this.nrDePortas = nrDePortas;
    }

}