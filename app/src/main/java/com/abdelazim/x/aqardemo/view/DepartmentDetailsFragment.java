package com.abdelazim.x.aqardemo.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abdelazim.x.aqardemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DepartmentDetailsFragment extends Fragment {


    public DepartmentDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_department_details, container, false);
    }

}
