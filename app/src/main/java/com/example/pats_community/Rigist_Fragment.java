package com.example.pats_community;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.function.Function;

import de.hdodenhof.circleimageview.CircleImageView;

public class Rigist_Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rigist_fragment, container, false);

        CircleImageView circleImageView=view.findViewById(R.id.rigist_function);
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(Rigist_Fragment.class, FunctionActivity.class);
//                startActivity(intent);

            }
        });
        return view;

    }

}
