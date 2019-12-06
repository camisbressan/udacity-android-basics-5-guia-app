package com.example.android.guiapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class BaresFragment extends Fragment {

    public BaresFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Cria uma lista de eventos
        final ArrayList<Local> locais = new ArrayList<Local>();
        locais.add(new Local(getString(R.string.bar_adega_nome), getString(R.string.bar_adega_horario), getString(R.string.bar_adega_endereco)));
        locais.add(new Local(getString(R.string.bar_agua_doce_nome), getString(R.string.bar_agua_doce_horario), getString(R.string.bar_agua_doce_endereco)));
        locais.add(new Local(getString(R.string.bar_brazuca_nome), getString(R.string.bar_brazuca_horario), getString(R.string.bar_brazuca_endereco)));
        locais.add(new Local(getString(R.string.bar_boa_vista_nome), getString(R.string.bar_boa_vista_horario), getString(R.string.bar_boa_vista_endereco)));
        locais.add(new Local(getString(R.string.bar_asinha_nome), getString(R.string.bar_asinha_horario), getString(R.string.bar_asinha_endereco)));
        locais.add(new Local(getString(R.string.bar_faria_lima_nome), getString(R.string.bar_faria_lima_horario), getString(R.string.bar_faria_lima_endereco)));
        locais.add(new Local(getString(R.string.bar_villa_nome), getString(R.string.bar_villa_horario), getString(R.string.bar_villa_endereco)));

        LocalAdapter adapter = new LocalAdapter(getActivity(), locais, 3);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}