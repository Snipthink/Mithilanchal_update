package layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.snipthink.abhishek.mithilanchal_update.R;

/**
 * Created by root on 11/9/17.
 */





public class Event_Pooja extends BaseAdapter {




    private int iconsSankarPUJA[];
    private String iconnamelistPUJA[];
    private Context contextpuja;
    private LayoutInflater inflater;

    public Event_Pooja(Context contextpuja, int iconsSankarPUJA[], String iconnamelistPUJA[]) {
        this.contextpuja = contextpuja;
        this.iconsSankarPUJA = iconsSankarPUJA;
        this.iconnamelistPUJA = iconnamelistPUJA;
    }


    @Override
    public int getCount() {
        return iconnamelistPUJA.length;
    }

    @Override
    public Object getItem(int p) {
        return iconnamelistPUJA[p];

    }

    @Override
    public long getItemId(int p) {
        return p;
    }
























    @Override
    public View getView(int p, View convertView, ViewGroup parent) {

        View gridView = convertView;

        if (convertView == null) {

            inflater = (LayoutInflater) contextpuja.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_puja_event, null);
        }
        ImageView icon = gridView.findViewById(R.id.icon_event_puja);
        TextView iconnam = gridView.findViewById(R.id.puja_event_text);
        icon.setImageResource(iconsSankarPUJA[p]);
        iconnam.setText(iconnamelistPUJA[p]);


        return gridView;
    }











}
