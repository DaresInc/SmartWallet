package com.dares.mhanif.wallet;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class invoice_frag extends Fragment {

    Button dismiss;
    Button save;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_invoice_frag, container, false);

        dismiss = (Button) view.findViewById(R.id.dismiss_btn);

        save = (Button) view.findViewById(R.id.save_btn);

        dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                Toast.makeText(v.getContext(),"Pressed Dismiss", Toast.LENGTH_SHORT).show();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Pressed Save", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}
