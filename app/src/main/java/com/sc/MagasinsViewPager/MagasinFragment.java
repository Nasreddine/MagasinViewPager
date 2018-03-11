package com.sc.MagasinsViewPager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nasredine on 10/03/2018.
 */

public class MagasinFragment extends Fragment {

    // Les champs utilisés par chaque Fragment
    //Ils sont distincts pour chaque  instance
    private int position;


    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_POSITION = "position";
    private Magasin magasin;

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de page donné.
     */
    public static MagasinFragment newInstance(int position) {

        MagasinFragment fragment = new MagasinFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    // retrouver le champ position à partir du bundle
    // puis, l'utiliser pour récupérer le magasin à partir de la liste des magasins
    // sauvgarder dans l'activité
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position = getArguments().getInt(ARG_POSITION, 0);

        this.magasin = ((MagasinActivity) getActivity()).getMagasin(position);
    }

    // Afficher la vue du magasin
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_magasin, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.nom_magasin);
        tvLabel.setText(magasin.getNom());

        return view;
    }
}
