package layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.snipthink.abhishek.mithilanchal_update.R;

/**
 * Created by root on 25/8/17.
 */


public class  Mission extends Fragment {
    //  public EventTab() {}
    // Required empty public constructor


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.content,container,false);
    }
}