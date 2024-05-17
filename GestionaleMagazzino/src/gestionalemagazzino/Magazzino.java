/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalemagazzino;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lupin
 */
public class Magazzino {

    private String nome;
    private ArrayList<Prodotto> serieProdotti = new ArrayList<>();

    public Magazzino(String nome) {
        this.nome = nome;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        serieProdotti.add(prodotto);
        System.out.println("Prodotto Inserito");
    }

    public void eliminaProdotto(String codice) {
        for (int i = 0; i < serieProdotti.size(); i++) {
            Prodotto current = serieProdotti.get(i);
            if (codice.equals(current.getCodice())) {
                serieProdotti.remove(i);
                System.out.println("Prodotto cancellato");
                break;
            } else {
                System.out.println("Errore nella cancellazione");
            }
        }
    }

    public void modificaProdotto(String codice, int nuovaQtaDisp, int nuovaQtaArrivo) {
        for (Prodotto prodotto : serieProdotti) {
            if (codice.equals(prodotto.getCodice())) {
                prodotto.setQtaDisp(nuovaQtaDisp);
                prodotto.setQtaArrivo(nuovaQtaArrivo);
                break;
            }
        }
    }

    public void prodottoGiaEsistente(String codice, int nuovaQtaDisp, int nuovaQtaArrivo) {
        for (Prodotto prodotto : serieProdotti) {
            if (codice.equals(prodotto.getCodice())) {
                prodotto.setQtaDisp(prodotto.getQtaDisp() + nuovaQtaDisp);
                prodotto.setQtaArrivo(prodotto.getQtaArrivo() + nuovaQtaArrivo);
                break;
            }
        }
    }

    public void visualizzaProdotto(String codice) {
        for (Prodotto prodotto : serieProdotti) {
            if (codice.equals(prodotto.getCodice())) {
                String infoProdotto = String.format("Ecco il tuo prodotto: " + prodotto.toString());
                System.out.println(infoProdotto);
                return; 
            }
        }
        System.out.println("Prodotto non trovato con il codice: " + codice);
    }

    public void visualizzaProdotti() {
        if (serieProdotti.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Il magazzino è vuoto.", "Prodotti nel Magazzino", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Il magazzino è vuoto.");
        } else {
            String message = "Prodotti nel magazzino:\n";
            System.out.println("Prodotti nel magazzino:");
            for (Prodotto prodotto : serieProdotti) {
                message += prodotto.toString() + "\n";
                System.out.println(prodotto.toString());
            }
            JOptionPane.showMessageDialog(null, message, "Prodotti nel Magazzino", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
