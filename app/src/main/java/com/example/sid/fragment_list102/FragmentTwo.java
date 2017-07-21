package com.example.sid.fragment_list102;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SID on 7/21/2017.
 */

public class FragmentTwo extends Fragment {

    MainActivity activity = (MainActivity) getActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       //returing view by inflating
        return inflater.inflate(R.layout.fragment_two,container,false);
    }
}
