package recycleview.activity.Model;

public class Filme {
    private String TituloFilme;
    private String genero;
    private String ano;

    public  Filme(){


    }

    public Filme(String tituloFilme, String genero, String ano) {
        TituloFilme = tituloFilme;
        this.genero = genero;
        this.ano = ano;
    }

    public String getTituloFilme() {
        return TituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        TituloFilme = tituloFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
