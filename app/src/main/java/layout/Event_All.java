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

public class Event_All extends BaseAdapter {

    private int icons[];
    private String iconname[];
    private Context context;
    private LayoutInflater inflater;

    public Event_All(Context context, int icons[], String iconname[]) {
        this.context = context;
        this.icons = icons;
        this.iconname = iconname;
    }


    @Override
    public int getCount()
    {
        return iconname.length;
    }

    @Override
    public Object getItem(int position)
    {
        return iconname[position];
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView = convertView;

        if (convertView == null) {

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_all_event, null);
        }
        ImageView icon = gridView.findViewById(R.id.icon_event_all);
        TextView iconnam = gridView.findViewById(R.id.all_event_icon_text);
        icon.setImageResource(icons[position]);
        iconnam.setText(iconname[position]);

        return gridView;
    }
}
