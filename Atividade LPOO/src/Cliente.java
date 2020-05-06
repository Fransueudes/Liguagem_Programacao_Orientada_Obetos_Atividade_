
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente {

    static boolean size(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int codigo, celular, anoCompra, ano;
    private String CPF, nome;

    public Cliente(int codigo, int celular, int anoCompra, String CPF, String nome) {
        this.codigo = codigo;
        this.CPF = CPF;
        this.anoCompra = anoCompra;
        this.celular = celular;
        this.nome = nome;
    }

    public Cliente() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setAnoCompra(int anoCompra) {
        this.anoCompra = anoCompra;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getanoCompra() {
        return anoCompra;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCelular() {
        return celular;
    }

    public int getTempo() {
        SimpleDateFormat ano = new SimpleDateFormat("yyyy");
        return Integer.parseInt(ano.format(new Date())) - this.getanoCompra();
    }
}
