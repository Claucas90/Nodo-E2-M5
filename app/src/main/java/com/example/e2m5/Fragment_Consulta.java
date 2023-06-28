package com.example.e2m5;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.e2m5.databinding.FragmentConsultaBinding;


public class Fragment_Consulta extends Fragment {

    private FragmentConsultaBinding binding;



    public void Consulta() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_consulta, container, false);
        binding = FragmentConsultaBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.radiogroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int index = binding.radiogroup1.indexOfChild(binding.radiogroup1.findViewById(i));
                switch (index) {

                    case 0:
                        binding.tv1.setText("Si la he visto");
                        break;

                    case 1:
                        binding.tv1.setText("No, ni en pintura");
                        break;

                    default:
                        break;
                }
            }
        });
    }

}