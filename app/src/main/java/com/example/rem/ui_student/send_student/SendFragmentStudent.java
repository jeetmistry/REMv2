package com.example.rem.ui_student.send_student;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.rem.R;

public class SendFragmentStudent extends Fragment {

    private SendViewModelStudent sendViewModelStudent;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sendViewModelStudent =
                ViewModelProviders.of(this).get(SendViewModelStudent.class);
        View root = inflater.inflate(R.layout.fragment_send_student, container, false);
        final TextView textView = root.findViewById(R.id.text_send_student);
        sendViewModelStudent.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}