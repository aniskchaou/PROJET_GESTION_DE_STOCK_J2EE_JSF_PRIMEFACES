/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcg.jsfnetbeansexample;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author user
 */
@ManagedBean
@RequestScoped
public class ProduitBean {
     String nomProduit;
     double quantiteProduit;
     double prixProduit;

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public double getQuantiteProduit() {
        return quantiteProduit;
    }

    public void setQuantiteProduit(double quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }

    @Override
    public String toString() {
       // return  " Nom du produit : "+nomProduit+" Quantité du produit : "+quantiteProduit+"  Prix du produit : "+prixProduit;
      return "greeting";
    }
     
     
    
    public ProduitBean() {
    }
    
}
