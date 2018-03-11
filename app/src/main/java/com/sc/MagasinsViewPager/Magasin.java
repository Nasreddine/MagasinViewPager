package com.sc.MagasinsViewPager;

import java.util.ArrayList;

/**
 * Created by nasredine on 25/02/2018.
 */

class Magasin extends BaseWeBuy {



    private String nom;
    private String adresse;
    private double latitude;
    private double longitude;
    private String logo;
    private ArrayList<Promotion> promotions;


    /**
     * renvoyer tous les magasins qui proposent des promos
     *
     * @return
     */

    public static ArrayList<Magasin> getAllMagasins() {


        ArrayList<Magasin> magasins = new ArrayList<>();
        Magasin carrefour = new Magasin();
        carrefour.setId(1);
        carrefour.setNom("Carrefour Atlantes");
        carrefour.setAdresse("Zac De Rochepinard Cc Atlantes, " +
                "Avenue Jacques Duclos, 37700 Saint-Pierre-des-Corps");
        carrefour.setLogo("https://upload.wikimedia.org/wikipedia/fr/" +
                "thumb/3/3b/Logo_Carrefour.svg/1278px-Logo_Carrefour.svg.png");
        carrefour.setLatitude(47.380436);
        carrefour.setLongitude(0.714537);

        Magasin auchan = new Magasin();

        auchan.setId(2);
        auchan.setNom("Auchan Chambray-lès-Tours");
        auchan.setAdresse("Centre Commercial la Vrillonnerie, Rue de Joué, 37170 Chambray-lès-Tours");
        auchan.setLogo("https://ecommercenews.eu/wp-content/uploads/2015/09/auchan.png");
        auchan.setLatitude(47.338925);
        auchan.setLongitude(0.700196);


        Magasin lidl = new Magasin();


        lidl.setId(3);
        lidl.setNom("Lidl");
        lidl.setAdresse("19 bis rue Général de Gaulle, 37000 Tours");
        lidl.setLogo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQweZoM3bWOw75M8MsAjrlLkMjMCSe2AOydVHyi4HFnrEkJ9sqNOHJkLfc");
        lidl.setLatitude(47.380179);
        lidl.setLongitude(0.694488);

        magasins.add(carrefour);
        magasins.add(lidl);
        magasins.add(auchan);

        return magasins;

    }

    /**
     * renvoyer toutes les achat en groupe  d'un magasin
     * chat achat concerne une promo qui elle même concerne un produit
     *
     * @param id_magasin
     * @return
     */

    public static ArrayList<AchatGroupe> getAllAchatGroupe(int id_magasin) {

        ArrayList<AchatGroupe> achatGroupes = new ArrayList<>();
        AchatGroupe achatGroupe1 = new AchatGroupe();
        AchatGroupe achatGroupe2 = new AchatGroupe();


        Promotion promo1 = new Promotion();
        promo1.setId(1);
        promo1.setPrix_hors_promo(10);
        promo1.setPrix_promo(5);
        promo1.setQuantite_min(3);

        Produit produit1 = new Produit();
        produit1.setId(1);
        produit1.setLibelle("Pack de 12 Piles AAA LR03 + 8 gratuites");
        produit1.setDescription("Pack de 12 Piles AAA LR03 + 8 gratuites");
        produit1.setImage("https://static-pepper.dealabs.com/threads/thread_large/default/1180857_1.jpg");
        promo1.setProduit(produit1);

        Promotion promo2 = new Promotion();
        promo2.setId(1);
        promo2.setPrix_hors_promo(7.5);
        promo2.setPrix_promo(2.5);
        promo2.setQuantite_min(2);

        Produit produit2 = new Produit();
        produit2.setId(2);
        produit2.setLibelle("3 Lots de 8 velouté fruix - 24x125g (via BDR + appli ODR)");
        produit2.setDescription("Valable uniquement pour les carrefour " +
                "market Lot de 3 × 8 velouté fruix variété aux choix Pour 2,50€ 2+1 gratuit");
        produit2.setImage("https://static-pepper.dealabs.com/threads/thread_large/default/1179038_1.jpg");
        promo2.setProduit(produit2);

        achatGroupe1.setPromotion(promo1);
        achatGroupe2.setPromotion(promo2);

        achatGroupes.add(achatGroupe1);
        achatGroupes.add(achatGroupe1);

        return achatGroupes;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }


}