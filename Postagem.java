import java.text.SimpleDateFormat;

public class Postagem {
    private  String texto;
    private SimpleDateFormat data;
    private String autor;
    private int numeroCurtidas = 0;


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public SimpleDateFormat getData() {
        return data;
    }

    public void setData(SimpleDateFormat data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void  Curtir(){
        this.numeroCurtidas += 1;
    }
    public void Descurtir(){
        if(numeroCurtidas == 0){
            this.numeroCurtidas = 0;
        }
        this.numeroCurtidas -= 1;
    }
    public int getCurtidas(){
        return numeroCurtidas;
    }
}
