package com.example.recyclerezeki;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class logoAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private Context context;
    private List<logoCar> carlogo;
    public logoAdapter(Context context, List<logoCar>carlogo ){
        this.context = context;
        this.carlogo = carlogo;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.img.setImageResource(carlogo.get(position).getLogo());
        holder.namalogo.setText(carlogo.get(position).getNamaLogo());
        if (holder.deskripsi != null) {
            holder.deskripsi.setText(context.getString(carlogo.get(position).getDeskripsi()));
        }


        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Image", carlogo.get(holder.getAdapterPosition()).getLogo());
                intent.putExtra("Title", carlogo.get(holder.getAdapterPosition()).getNamaLogo());
                intent.putExtra("nama", carlogo.get(holder.getAdapterPosition()).getNama());
                intent.putExtra("deskripsi", carlogo.get(holder.getAdapterPosition()).getDeskripsi());
                intent.putExtra("harga", carlogo.get(holder.getAdapterPosition()).getHarga());
                intent.putExtra("tipe", carlogo.get(holder.getAdapterPosition()).getTipe());

                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return carlogo.size();
    }
}
class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView namalogo;

    TextView deskripsi;
    CardView card;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.car);
        namalogo = itemView.findViewById(R.id.cartxt);
        deskripsi = itemView.findViewById(R.id.deskripsi);
        card = itemView.findViewById(R.id.card);






    }

}
