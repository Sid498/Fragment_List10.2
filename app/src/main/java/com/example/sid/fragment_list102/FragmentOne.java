package com.example.sid.fragment_list102;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by SID on 7/21/2017.
 */

public class FragmentOne extends Fragment implements View.OnClickListener{

    Button btn1,btn2,btn3,btn4;
    TextView textView;
    String text;
    String mtext;
    MainActivity activity = (MainActivity) getActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one,container,false);
        btn1 = (Button) view.findViewById(R.id.btnLayout1);
        btn2 = (Button) view.findViewById(R.id.btnLayout2);
        btn3 = (Button) view.findViewById(R.id.btnLayout3);
        btn4 = (Button) view.findViewById(R.id.btnLayout4);

        textView = (TextView) view.findViewById(R.id.tvLayout);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        return view;

    }

    public void setTextInActivity(String s) {
        ((MainActivity) getActivity()).setUpdateText(s);
        ((MainActivity) getActivity()).changeTextViewText();

    }

    public void onClick(View v)
    {
        ShowData(v);
    }
//cutsom Toast
    private void ShowData(View view) {
        text=view.getTag().toString();
        mtext="you clicked "+text;
        setTextInActivity((String) text);
        int time = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getView().getContext(),mtext,time);
        toast.show();
    }
}
