package com.example.android.guiapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocalAdapter extends ArrayAdapter<Local> {

    int tipoPagina;

    public LocalAdapter(Context context, ArrayList<Local> words, int tipoPaginaFragment) {
        super(context, 0, words);
        tipoPagina = tipoPaginaFragment;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Local itemLocal = getItem(position);

        TextView tituloTextView = (TextView) listItemView.findViewById(R.id.titulo_text_view);
        tituloTextView.setText(itemLocal.getmNome());

        TextView informacaoTextView = (TextView) listItemView.findViewById(R.id.informacao_text_view);
        informacaoTextView.setText(itemLocal.getmEndereco());

        if (tipoPagina == 1){

            TextView descricaoTextView = (TextView) listItemView.findViewById(R.id.descricao_text_view);
            descricaoTextView.setText(itemLocal.getmTelefone() + "\n\n" +itemLocal.getmSite());

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.default_image_view);
            imageView.setVisibility(View.GONE);

        }else if (tipoPagina == 2){

            TextView descricaoTextView = (TextView) listItemView.findViewById(R.id.descricao_text_view);
            descricaoTextView.setText(itemLocal.getmDescricao());

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.default_image_view);
            imageView.setImageResource(itemLocal.getmImagem());
            imageView.setVisibility(View.VISIBLE);

        }else{

            TextView descricaoTextView = (TextView) listItemView.findViewById(R.id.descricao_text_view);
            descricaoTextView.setText(itemLocal.getmHorario());

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.default_image_view);
            imageView.setVisibility(View.GONE);

        }

        return listItemView;
    }

}