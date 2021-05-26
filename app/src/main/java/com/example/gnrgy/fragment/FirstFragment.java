package com.example.gnrgy.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gnrgy.R;
import com.example.gnrgy.fragment.adapter.RecycleAdapter;

public class FirstFragment extends Fragment {
    View view;
    EditText edtText;
    RecyclerView recyclerView;
    String[] strings = {"Bundle", "Listener", "Shared Preference","Interface"};
    String editText="";
    RecycleAdapter recycleAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_one, container, false);
        edtText=view.findViewById(R.id.edtText);
        setupData();
        recyclerView=view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        return view;
    }
    public void setupData(){
        editText=edtText.getText().toString();
        recycleAdapter = new RecycleAdapter(getActivity(),strings,editText);
        recyclerView.setAdapter(recycleAdapter);

    }

}


