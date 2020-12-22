package com.example.lap_app_passio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RCV_AdapterViewHolder extends RecyclerView.Adapter<RCV_AdapterViewHolder.MonAnViewHoder> {
    private List<RCV_View> listMonan;

    public RCV_AdapterViewHolder() {
    }

    public void setData(List<RCV_View> list) {
        this.listMonan = list;
        notifyDataSetChanged();
    }

    private OnItemClickListener mListMonAn;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListMonAn = listener;
    }

    @NonNull
    @Override
    public MonAnViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view_rcv, parent, false);
        return new MonAnViewHoder(view, mListMonAn);
    }

    @Override
    public void onBindViewHolder(@NonNull MonAnViewHoder holder, int position) {
        RCV_View user = listMonan.get(position);
        if (user == null) {
            return;
        }
        holder.TV_NoiDung.setText(user.getText1());
        holder.TV_TieuDe.setText(user.getText2());
        holder.img_anh.setImageResource(user.getAnh());
    }

    @Override
    public int getItemCount() {
        if (listMonan != null) {
            return listMonan.size();
        }
        return 0;
    }

    public class    MonAnViewHoder extends RecyclerView.ViewHolder {
        private TextView TV_TieuDe;
        private TextView TV_NoiDung;
        private ImageView  img_anh;

        public MonAnViewHoder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            TV_TieuDe = itemView.findViewById(R.id.title1);
            TV_NoiDung= itemView.findViewById(R.id.content1);
            img_anh = itemView.findViewById(R.id.img_view_anhsp);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick( position );
                        }
                    }
                }
            });
        }
    }
}
