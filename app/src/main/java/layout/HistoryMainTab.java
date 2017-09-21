package layout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.snipthink.abhishek.mithilanchal_update.R;

/**
 * Created by snipthink on 24/8/17.
 */

public class HistoryMainTab extends Fragment
{
View view;
Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view= inflater.inflate(R.layout.popular_main_tab,container,false);

        context=getActivity();
        return view;
    }
}

