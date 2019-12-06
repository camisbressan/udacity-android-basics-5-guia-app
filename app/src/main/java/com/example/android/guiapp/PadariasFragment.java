package com.example.android.guiapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of colors vocabulary titulos.
 */
public class PadariasFragment extends Fragment {

    public PadariasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of titulos
        final ArrayList<Local> locais = new ArrayList<Local>();
        locais.add(new Local(getString(R.string.padaria_city_nome),getString(R.string.padaria_city_horario),getString(R.string.padaria_city_endereco)));
        locais.add(new Local(getString(R.string.padaria_maria_nome),getString(R.string.padaria_maria_horario),getString(R.string.padaria_maria_endereco)));
        locais.add(new Local(getString(R.string.padaria_nova_nome),getString(R.string.padaria_nova_horario),getString(R.string.padaria_nova_endereco)));
        locais.add(new Local(getString(R.string.padaria_vila_nome),getString(R.string.padaria_vila_horario),getString(R.string.padaria_vila_endereco)));
        locais.add(new Local(getString(R.string.padaria_chego_nome),getString(R.string.padaria_chego_horario),getString(R.string.padaria_chego_endereco)));
        locais.add(new Local(getString(R.string.padaria_galles_nome),getString(R.string.padaria_galles_horario),getString(R.string.padaria_galles_endereco)));
        locais.add(new Local(getString(R.string.padaria_faria_nome),getString(R.string.padaria_faria_horario),getString(R.string.padaria_faria_endereco)));

        LocalAdapter adapter = new LocalAdapter(getActivity(), locais, 4);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}