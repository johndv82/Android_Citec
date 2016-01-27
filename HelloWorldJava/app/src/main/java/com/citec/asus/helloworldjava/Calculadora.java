package com.citec.asus.helloworldjava;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by Asus on 26/01/2016.
 */
public class Calculadora extends Fragment {
    View mv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mv = inflater.inflate(R.layout.calc, container, false);
        return mv;
    }
}
