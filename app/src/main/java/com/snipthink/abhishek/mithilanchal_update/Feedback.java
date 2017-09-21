package com.snipthink.abhishek.mithilanchal_update;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DialogTitle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/*
 * Created by snipthink  on 26/8/17.
 */

public class Feedback extends DialogFragment {
    View view;
    Button send, cancel;
    EditText feedback_email;
    EditText feedback_message;
    DialogTitle Title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.feedback, container, false);


        return view;

    }


}
