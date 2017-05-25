package com.example.d1mys1klapo4ka.jamalachat.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.d1mys1klapo4ka.jamalachat.R;
import com.example.d1mys1klapo4ka.jamalachat.adapter.RecyclerVievAdapter;
import com.example.d1mys1klapo4ka.jamalachat.model.ModelChat;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class JamalaChatActivityFragment extends Fragment {

    RecyclerView rvChat;
    public JamalaChatActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jamala_chat, container, false);

        jamalaChat(view);
        return view;
    }

    private void jamalaChat(View view){

        rvChat = (RecyclerView)view.findViewById(R.id.rv_chat);
        rvChat.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvChat.setHasFixedSize(true);
        rvChat.setAdapter(new RecyclerVievAdapter(getActivity(), modelChat()));
    }

    private ArrayList<ModelChat> modelChat(){

        ArrayList<ModelChat> modelChats = new ArrayList<>();
        modelChats.add(new ModelChat("Макс", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Дима", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Рома", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Макс", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Дима", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Рома", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Макс", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Дима", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Рома", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Макс", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Дима", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Рома", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Макс", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Дима", "dimysiklapo4ka"));
        modelChats.add(new ModelChat("Рома", "dimysiklapo4ka"));

        return modelChats;

    }
}
