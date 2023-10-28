package com.example.labnik.laba3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.labnik.R;
import com.example.labnik.laba1.ui.dashboard.DashboardFragment;

import java.util.ArrayList;
import java.util.List;

public class BooksAdapter  extends RecyclerView.Adapter<BooksAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Book> books;

    public BooksAdapter(Context context, List<Book> books) {
        this.books = books;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public BooksAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.books_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BooksAdapter.ViewHolder holder, int position) {
        Book Book = books.get(position);
        holder.nameView.setText(Book.getTitle());
        holder.autorView.setText(Book.getAutor_name());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final TextView nameView, autorView;
        ViewHolder(View view){
            super(view);
            nameView = view.findViewById(R.id.book);
            autorView = view.findViewById(R.id.autor);
        }
    }
}