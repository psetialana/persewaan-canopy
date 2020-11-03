package com.canopywedding.persewaan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.canopywedding.persewaan.R;
import com.canopywedding.persewaan.model.Informasi;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class InformasiAdapter extends
        RecyclerView.Adapter<InformasiAdapter.ViewHolder> {

        // Store a member variable for the contacts
        private List<Informasi> mInformasi;

        // Pass in the contact array into the constructor
        public InformasiAdapter(List<Informasi> informasi) {
            mInformasi = informasi;
        }

        // Provide a direct reference to each of the views within a data item
        // Used to cache the views within the item layout for fast access
        public class ViewHolder extends RecyclerView.ViewHolder {
            // Your holder should contain a member variable
            // for any view that will be set as you render a row
            public ImageView ivGambar;
            public TextView txJudul;

            // We also create a constructor that accepts the entire item row
            // and does the view lookups to find each subview
            public ViewHolder(View itemView) {
                // Stores the itemView in a public final member variable that can be used
                // to access the context from any ViewHolder instance.
                super(itemView);

                ivGambar = (ImageView) itemView.findViewById(R.id.iv_item_informasi_gambar);
                txJudul = (TextView) itemView.findViewById(R.id.tv_item_informasi_judul);
            }
        }

        // ... constructor and member variables

        // Usually involves inflating a layout from XML and returning the holder
        @Override
        public InformasiAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            // Inflate the custom layout
            View contactView = inflater.inflate(R.layout.item_informasi, parent, false);

            // Return a new holder instance
            ViewHolder viewHolder = new ViewHolder(contactView);
            return viewHolder;
        }

        // Involves populating data into the item through holder
        @Override
        public void onBindViewHolder(InformasiAdapter.ViewHolder holder, int position) {
            // Get the data model based on position
            Informasi informasi = mInformasi.get(position);

            // Set item views based on your views and data model
            TextView tvJudul = holder.txJudul;
            ImageView ivGambar = holder.ivGambar;

            tvJudul.setText(informasi.getJudul());

            if (informasi.getGambarUrl().isEmpty()) {
                ivGambar.setVisibility(View.INVISIBLE);
            } else {
                ivGambar.setVisibility(View.VISIBLE);
                Glide.with(ivGambar.getContext()).load(informasi.getGambarUrl()).into(ivGambar);
            }

        }

        // Returns the total count of items in the list
        @Override
        public int getItemCount() {
            return mInformasi.size();
        }
}
