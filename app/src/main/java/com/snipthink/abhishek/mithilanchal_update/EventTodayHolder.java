package com.snipthink.abhishek.mithilanchal_update;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by root on 21/9/17.
 */

public class EventTodayHolder  {

    TextView name,description;
    ImageView tdyimgview;


    public EventTodayHolder(View itemView)
    {
        name=(TextView)itemView.findViewById(R.id.today_event_name);
        description=(TextView)itemView.findViewById(R.id.todays_ev_id_desc);
        tdyimgview=(ImageView)itemView.findViewById(R.id.event_today_image);
    }
}
