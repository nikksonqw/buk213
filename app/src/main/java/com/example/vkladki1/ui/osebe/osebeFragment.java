package com.example.vkladki1.ui.osebe;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.vkladki1.databinding.FragmentOsebeBinding;


public class osebeFragment extends Fragment {

    private FragmentOsebeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        osebeViewModel osebeViewModel =
                new ViewModelProvider(this).get(osebeViewModel.class);

        binding = FragmentOsebeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textOsebe;
        osebeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}