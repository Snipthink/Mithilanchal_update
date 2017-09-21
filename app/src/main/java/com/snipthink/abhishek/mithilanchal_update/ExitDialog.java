package com.snipthink.abhishek.mithilanchal_update;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.widget.Toast;


/**
 * Created by snipthink  on 26/8/17.
 */

public class ExitDialog  extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(Html.fromHtml("<font color='#00000'>Do you really want to exit?</font>"))


                .setNegativeButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {


                        Toast.makeText(getActivity(), "Application is closing", Toast.LENGTH_LONG).show();
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);

                    }
                })


                .setPositiveButton(R.string.No, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


            }
        });

        return  builder.create();
    }
}