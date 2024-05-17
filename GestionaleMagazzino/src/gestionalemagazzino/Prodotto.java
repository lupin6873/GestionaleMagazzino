/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalemagazzino;

/**
 *
 * @author lupin
 */
public class Prodotto {

    private String categoria;
    private String codice;
    private String descrizione;
    private String fornitore;
    private double prezzo;
    private int qtaDisp;
    private int qtaArrivo;

    public Prodotto(String categoria, String codice, String descrizione, String fornitore, double prezzo, int qtaDisp, int qtaArrivo) {
        this.categoria = categoria;
        this.codice = codice;
        this.descrizione = descrizione;
        this.fornitore = fornitore;
        this.prezzo = prezzo;
        this.qtaDisp = qtaDisp;
        this.qtaArrivo = qtaArrivo;
    }
  public String toString() {
        return "Categoria: " + categoria +
               ", Codice: " + codice +
               ", Descrizione: " + descrizione +
               ", Fornitore: " + fornitore +
               ", Prezzo: " + prezzo +
               ", Qta disponibile: " + qtaDisp +
               ", Qta in arrivo: " + qtaArrivo;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getFornitore() {
        return fornitore;
    }

    public void setFornitore(String fornitore) {
        this.fornitore = fornitore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQtaDisp() {
        return qtaDisp;
    }

    public void setQtaDisp(int qtaDisp) {
        this.qtaDisp = qtaDisp;
    }

    public int getQtaArrivo() {
        return qtaArrivo;
    }

    public void setQtaArrivo(int qtaArrivo) {
        this.qtaArrivo = qtaArrivo;
    }
    
}
