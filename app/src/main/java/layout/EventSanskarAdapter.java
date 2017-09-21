package layout;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.snipthink.abhishek.mithilanchal_update.Chatiyar;
import com.snipthink.abhishek.mithilanchal_update.Feedback;
import com.snipthink.abhishek.mithilanchal_update.MainActivity;
import com.snipthink.abhishek.mithilanchal_update.Mtabfragment;
import com.snipthink.abhishek.mithilanchal_update.R;

import java.util.ArrayList;

public class EventSanskarAdapter extends RecyclerView.Adapter<EventSanskarAdapter.ViewHolder>  {

    ArrayList<String> alName;
    ArrayList<Integer> alImage;
    Context context;
    FragmentManager fragment;
    Mtabfragment main;

    public EventSanskarAdapter(Context context ,ArrayList<String> alName, ArrayList<Integer> alImage) {
        super();

        this.context = context;
        this.alName = alName;
        this.alImage = alImage;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.custom_sanskar_event, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.tvSpecies.setText(alName.get(i));
        viewHolder.imgThumbnail.setImageResource(alImage.get(i));

        viewHolder.setClickListener(new ItemClickListener()
        {

            @Override
            public Feedback onClick(View view, int position, boolean isLongClick) {


                //Toast.makeText(context, "#" + position + " - " + alName.get(position), Toast.LENGTH_SHORT).show();

                if (isLongClick) {


                    context.startActivity(new Intent(context, Chatiyar.class));
                    Toast.makeText(context, "PUSSING MEE"+ position + " - " + alName.get(position) + "-"+ alImage.get(position)+" (Long click)", Toast.LENGTH_SHORT).show();

                }

/*
                    switch (position) {
                        case 0:

                            Toast.makeText(context, "#0" + position + " - " + alName.get(position) + "-"+ alImage.get(position)+" (Long click)", Toast.LENGTH_SHORT).show();

                            break;
                        case 1:


                            Toast.makeText(context, "First" + position + " - " + alName.get(position) + "-"+ alImage.get(position)+" (Long click)", Toast.LENGTH_SHORT).show();

                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;




                }
*/
/*



                    if (position ==0)
                    {


                        Toast.makeText(context, "#0" + position + " - " + alName.get(position) + "-"+ alImage.get(position)+" (Long click)", Toast.LENGTH_SHORT).show();


                    }


                    else if (position ==1)
                    {


                        Toast.makeText(context, "#1" + position + " - " + alName.get(position) + "-"+ alImage.get(position)+" (Long click)", Toast.LENGTH_SHORT).show();


                    }
                    */

                  //  Toast.makeText(context, "#" + position + " - " + alName.get(position) + "-"+ alImage.get(position)+" (Long click)", Toast.LENGTH_SHORT).show();

                   // context.startActivity(new Intent(context, MainActivity.class));


                else

                {
                    switch (position) {

                        case 0:


                            context.startActivity(new Intent(context, MainActivity.class));
                            Toast.makeText(context, "#0" + position + " - " + alName.get(position) + "-" + alImage.get(position) + " (Long click)", Toast.LENGTH_SHORT).show();


                        case 1:


                            Toast.makeText(context, "First" + position + " - " + alName.get(position) + "-" + alImage.get(position) + " (Long click)", Toast.LENGTH_SHORT).show();

                            break;
                        case 2:
                            Toast.makeText(context, "First" + position + " - " + alName.get(position) + "-" + alImage.get(position) + " (Long click)", Toast.LENGTH_SHORT).show();


                            break;
                        case 3:
                            Toast.makeText(context, "First" + position + " - " + alName.get(position) + "-" + alImage.get(position) + " (Long click)", Toast.LENGTH_SHORT).show();

                            break;
                        case 4:


                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;


                    }
                }
                    return null;
                }



        });
    }




    @Override
    public int getItemCount() {


        return alName.size();
    }






    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        public ImageView imgThumbnail;
        public TextView tvSpecies;
        private ItemClickListener clickListener;



        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
            tvSpecies = (TextView) itemView.findViewById(R.id.tv_species);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

        }

        public void setClickListener(ItemClickListener itemClickListener) {


            this.clickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {

            clickListener.onClick(view, getPosition(), false);


        }

        @Override
         public boolean onLongClick(View view) {
            clickListener.onClick(view, getPosition(), true);


            return true;




        }



    }










}