package com.undead.nosavvy.paginasamarillas.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.undead.nosavvy.paginasamarillas.DescriptionActivity;
import com.undead.nosavvy.paginasamarillas.R;
import com.undead.nosavvy.paginasamarillas.ResultActivity;
import com.undead.nosavvy.paginasamarillas.models.Business;

import org.w3c.dom.Text;

import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by nosavvy on 4/5/18.
 */

public class BusinessAdapter extends RecyclerView.Adapter<BusinessAdapter.ViewHolder>{

    private List<Business> businesses;

    public void setBusiness(List<Business> business) {
        this.businesses = business;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
//name,  address,  logo  number

        ImageView logo;
        TextView name;
        TextView address;
        TextView number;
        TextView description;

        public ViewHolder(View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.logo);
            name = itemView.findViewById(R.id.name);
            address = itemView.findViewById(R.id.address);
            number = itemView.findViewById(R.id.number);
            description = itemView.findViewById(R.id.description);
        }


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_business, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Business business = businesses.get(position);

        int resId = holder.itemView.getContext().getResources().getIdentifier(business.getLogo(), "drawable", holder.itemView.getContext().getPackageName());
        holder.logo.setImageResource(resId);

        holder.name.setText(business.getName());
        holder.address.setText(business.getAddress());
        holder.number.setText(business.getNumber());
        holder.description.setText(business.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(holder.itemView.getContext(), DescriptionActivity.class);
                Context ctx = holder.itemView.getContext();
                i.putExtra("foto",business.getLogo());
                i.putExtra("descripcion",business.getDescription());
                i.putExtra("numero",business.getNumber());
                ctx.startActivity(i);
                //Toast.makeText(holder.itemView.getContext(), "Detalle de la empresa: " + business.getName(), Toast.LENGTH_SHORT).show();
                // Llamar a otra pantalla y mostrar sus detalles de esta persona ...

            }
        });

    }

    @Override
    public int getItemCount() {
        return businesses.size();
    }


}
