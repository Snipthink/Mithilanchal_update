package com.snipthink.abhishek.mithilanchal_update;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by snipthink  on 26/8/17.
 */

public class ContactUs extends DialogFragment {
    EditText editText;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(Html.fromHtml("<font color='#FF7F27'>Contact Us</font>"));
        builder.setMessage(Html.fromHtml("<font color ='FF7F27'><h6>Managing Director: </font></h6>" +
                "<p><b>Email:</b>Mithila_snipthink@gmail.com</p>" + "<p><b>Contact No:</b>+91 7239902970</p>")
        );


        builder.setNegativeButton(R.string.yes, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getActivity(), "You pressed No button", Toast.LENGTH_LONG).show();
            }
        });


        return builder.create();
    }
}