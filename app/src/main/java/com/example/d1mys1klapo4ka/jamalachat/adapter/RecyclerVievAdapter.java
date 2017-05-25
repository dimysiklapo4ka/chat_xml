package com.example.d1mys1klapo4ka.jamalachat.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.d1mys1klapo4ka.jamalachat.R;
import com.example.d1mys1klapo4ka.jamalachat.model.ModelChat;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by d1mys1klapo4ka on 25.05.2017.
 */

public class RecyclerVievAdapter extends RecyclerView.Adapter<RecyclerVievAdapter.ViewHolderForChat>{

    private Context context;
    private ArrayList<ModelChat> modelChats;
    private View.OnClickListener onClickListener;

    public RecyclerVievAdapter(Context context, ArrayList<ModelChat> modelChats ){

        this.context = context;
        this.modelChats = modelChats;
    }

    @Override
    public ViewHolderForChat onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_holder,parent,false);

        return new ViewHolderForChat(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderForChat holder, int position) {

        ModelChat modelChat = modelChats.get(position);

        holder.tvSms.setText(modelChat.getSms());
        holder.tvLogin.setText(modelChat.getUserLogin());

    }

    @Override
    public int getItemCount() {
        return modelChats.size();
    }

    public class ViewHolderForChat extends RecyclerView.ViewHolder{

        TextView tvSms, tvLogin;

        public ViewHolderForChat(View itemView) {
            super(itemView);
            tvSms = (TextView)itemView.findViewById(R.id.tv_sms);
            tvLogin = (TextView)itemView.findViewById(R.id.tv_nick);

        }

    }
}
