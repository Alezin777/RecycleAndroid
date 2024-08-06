package br.com.etecia.myapp;

public class Academia {
    private String titulo;
    private String descriçao;
    private String nota;
    private String imgAcademia;

    public Academia() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getImgAcademia() {
        return imgAcademia;
    }

    public void setImgAcademia(String imgAcademia) {
        this.imgAcademia = imgAcademia;
    }
}
