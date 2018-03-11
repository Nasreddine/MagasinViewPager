package com.sc.MagasinsViewPager;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MagasinActivity extends AppCompatActivity {

    private MagasinPagerAdapter magasinPagerAdapter;
    private ViewPager magasinViewPager;
    private ArrayList<Magasin> magasins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasin);

        magasins = Magasin.getAllMagasins();
        // créer une instance de adaptateur de fragement magasin
        magasinPagerAdapter = new MagasinPagerAdapter(getSupportFragmentManager());

        // attribuer l'adaptateur au composant graphique view pager
        magasinViewPager = (ViewPager) findViewById(R.id.magasin_view_pager);
        magasinViewPager.setAdapter(magasinPagerAdapter);
    }

    /**
     * simple méthode qui renvoie un magasin de la liste des magasins par sa position
     * utilisée par le fragement
     */

    public Magasin getMagasin(int position) {
        return this.magasins.get(position);
    }


    /**
     * A {@link FragmentPagerAdapter} Un adaptateur de fragments qui renvoie un fragment
     * correspond à une page affichant un magasin
     */
    public class MagasinPagerAdapter extends FragmentPagerAdapter {

        public MagasinPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            // Créer un fragment en lui passant la position qui sera utiliser pour
            // récupérer un magasin à partir de la liste

            return MagasinFragment.newInstance(position);

        }

        @Override
        public int getCount() {
            // nombre de pages selon la taille de la liste des magasins
            return magasins.size();
        }
    }


}
