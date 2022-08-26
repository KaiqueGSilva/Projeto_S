package br.com.senac.projeto_integrador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DocumentosFragment extends Fragment {
    ListView lstModDocumentos;

    String modeloTxtImg[] = {"Segurança","Suporte Técnico","Programação","Segurança da Informação"};
    int imgModelo [] = {R.drawable.security_um,R.drawable.suporte,R.drawable.programacao,R.drawable.seguranca};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_documentos, container, false);

        lstModDocumentos = view.findViewById(R.id.lstDocumentos);

        MyAdapterDocumentos adapterDocumentos = new MyAdapterDocumentos();

        lstModDocumentos.setAdapter(adapterDocumentos);

        return view;
    }

        public class MyAdapterDocumentos extends BaseAdapter {

            @Override
            public int getCount() {return imgModelo.length;}

            @Override
            public Object getItem(int position) {return null;}

            @Override
            public long getItemId(int position) {return 0;}

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                ImageView imgModModelo;
                TextView modeloModImg;

                View v = getLayoutInflater().inflate(R.layout.modelo_layout,null);

                imgModModelo = v.findViewById(R.id.imgModelo);
                modeloModImg = v.findViewById(R.id.modeloTxtImg);

                imgModModelo.setImageResource(imgModelo[position]);
                modeloModImg.setText(modeloTxtImg[position]);

                return v;
            }
        }
}