package com.rpl.kelompok1.gelo.adapters;

import android.app.Activity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.rpl.kelompok1.gelo.R;
import com.rpl.kelompok1.gelo.models.Laundry;

import java.util.List;

/**
 * Created by Lenovo on 08/04/2017.
 */

public class LaundryRecyclerAdapter extends ArrayAdapter<Laundry> {
    private List<Laundry> listLaundry;
    private Activity context;
    public AppCompatTextView textViewName;
    public AppCompatTextView textViewEmail;
    public AppCompatTextView textViewAlamat;
    public AppCompatTextView textViewTelepon;


    public LaundryRecyclerAdapter(Activity context, List<Laundry> listLaundry) {
        super(context, R.layout.item_list_recycler, listLaundry);
        this.context = context;
        this.listLaundry = listLaundry;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_list_recycler, null, true);

        textViewName = (AppCompatTextView) view.findViewById(R.id.textViewName);
        textViewEmail = (AppCompatTextView) view.findViewById(R.id.textViewEmail);
        textViewAlamat = (AppCompatTextView) view.findViewById(R.id.textViewAlamat);
        textViewTelepon = (AppCompatTextView) view.findViewById(R.id.textViewTelepon);

        //Laundry laundry = listLaundry.get(position);
        textViewName.setText(listLaundry.get(position).getName());
        textViewEmail.setText(listLaundry.get(position).getEmail());
        textViewAlamat.setText(listLaundry.get(position).getAlamat());
        textViewTelepon.setText(listLaundry.get(position).getTelepon());

        return view;
    }

    /*public LaundryRecyclerAdapter(List<Laundry> listLaundry) {
        this.listLaundry = listLaundry;
    }

    @Override
    public LaundryRecyclerAdapter.LaundryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_recycler, parent, false);

        return new LaundryRecyclerAdapter.LaundryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LaundryRecyclerAdapter.LaundryViewHolder holder, int position) {
        holder.textViewName.setText(listLaundry.get(position).getName());
        holder.textViewEmail.setText(listLaundry.get(position).getEmail());
        holder.textViewAlamat.setText(listLaundry.get(position).getAlamat());
        holder.textViewTelepon.setText(listLaundry.get(position).getTelepon());
    }

    @Override
    public int getItemCount() {
        Log.v(LaundryRecyclerAdapter.class.getSimpleName(),""+listLaundry.size());
        return listLaundry.size();
    }


    *//**
     * ViewHolder class
     *//*
    public class LaundryViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView textViewName;
        public AppCompatTextView textViewEmail;
        public AppCompatTextView textViewAlamat;
        public AppCompatTextView textViewTelepon;

        public LaundryViewHolder(View view) {
            super(view);
            textViewName = (AppCompatTextView) view.findViewById(R.id.textViewName);
            textViewEmail = (AppCompatTextView) view.findViewById(R.id.textViewEmail);
            textViewAlamat = (AppCompatTextView) view.findViewById(R.id.textViewAlamat);
            textViewTelepon = (AppCompatTextView) view.findViewById(R.id.textViewTelepon);
        }
    }*/
}
