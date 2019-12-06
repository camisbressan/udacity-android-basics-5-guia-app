package com.example.android.guiapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary titulos.
 */
public class HoteisFragment extends Fragment {

    public HoteisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of titulos
        final ArrayList<Local> locais = new ArrayList<Local>();
        locais.add(new Local(getString(R.string.hotel_best_nome), getString(R.string.hotel_best_endereco), getString(R.string.hotel_best_telefone), getString(R.string.hotel_best_site)));
        locais.add(new Local(getString(R.string.hotel_bristol_nome), getString(R.string.hotel_bristol_endereco), getString(R.string.hotel_bristol_telefone), getString(R.string.hotel_bristol_site)));
        locais.add(new Local(getString(R.string.hotel_plaza_nome), getString(R.string.hotel_plaza_endereco), getString(R.string.hotel_plaza_telefone), getString(R.string.hotel_plaza_site)));
        locais.add(new Local(getString(R.string.hotel_monica_nome), getString(R.string.hotel_monica_endereco), getString(R.string.hotel_monica_telefone), getString(R.string.hotel_monica_site)));
        locais.add(new Local(getString(R.string.hotel_domani_nome), getString(R.string.hotel_domani_endereco), getString(R.string.hotel_domani_telefone), getString(R.string.hotel_domani_site)));
        locais.add(new Local(getString(R.string.hotel_ibis_nome), getString(R.string.hotel_domani_endereco), getString(R.string.hotel_ibis_telefone), getString(R.string.hotel_ibis_site)));
        locais.add(new Local(getString(R.string.hotel_matiz_nome), getString(R.string.hotel_ibis_endereco), getString(R.string.hotel_matiz_telefone), getString(R.string.hotel_matiz_site)));

        LocalAdapter adapter = new LocalAdapter(getActivity(), locais, 1);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}