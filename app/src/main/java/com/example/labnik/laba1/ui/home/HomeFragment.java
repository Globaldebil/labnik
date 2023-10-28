package com.example.labnik.laba1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.labnik.R;
import com.example.labnik.databinding.FragmentHomeBinding;
import com.example.labnik.laba3.*;
import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceBook) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final RecyclerView book_list = binding.bookList;
        String[] books = getResources().getStringArray(R.array.books);
        String[] autors = getResources().getStringArray(R.array.autors);
        ArrayList<Book> books_list = Book.get(books, autors);
        book_list.setLayoutManager(new LinearLayoutManager(getContext()));
        BooksAdapter adapter = new BooksAdapter(getContext(), books_list);
        book_list.setAdapter(adapter);
        //TODO:Сделать адаптер для обработки нажатий
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}