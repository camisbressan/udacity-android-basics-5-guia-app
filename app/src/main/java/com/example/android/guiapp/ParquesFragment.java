package com.example.android.guiapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ParquesFragment extends Fragment {

    public ParquesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of titulos
        final ArrayList<Local> locais = new ArrayList<Local>();
        locais.add(new Local(getString(R.string.parque_maia_nome), getString(R.string.parque_maia_descricao), getString(R.string.parque_maia_endereco),R.drawable.ic_bosque_foreground));
        locais.add(new Local(getString(R.string.parque_lago_nome), getString(R.string.parque_lago_descricao),getString(R.string.parque_lago_endereco) ,R.drawable.ic_lago_foreground));
        locais.add(new Local(getString(R.string.parque_bom_nome), getString(R.string.parque_bom_descricao), getString(R.string.parque_bom_endereco),R.drawable.ic_bomclima_foreground));
        locais.add(new Local(getString(R.string.parque_cantareira_nome), getString(R.string.parque_cantareira_descricao), getString(R.string.parque_cantareira_endereco),R.drawable.ic_cantareira_foreground));
        locais.add(new Local(getString(R.string.parque_julio_nome), getString(R.string.parque_julio_descricao),getString(R.string.parque_julio_endereco) ,R.drawable.ic_julio_foreground));
        locais.add(new Local(getString(R.string.parque_transguarulhense_nome), getString(R.string.parque_transguarulhense_descricao),getString(R.string.parque_transguarulhense_endereco), R.drawable.ic_transguarulhense_foreground));

        LocalAdapter adapter = new LocalAdapter(getActivity(), locais, 2);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}