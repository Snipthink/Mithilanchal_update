package layout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.snipthink.abhishek.mithilanchal_update.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by snipthink on 24/8/17.
 */

public class EventTab extends Fragment implements View.OnClickListener,View.OnLongClickListener{
  //  public EventTab() {}
        // Required empty public constructor

     Context context,contextpuja ;
     GridView gridViewPuja,gridViewAll,gridViewC;
     View view;
    private Event_Pooja adapterpuja;



    RecyclerView mRecyclerView ,pujaRecylerView;
    RecyclerView.LayoutManager mLayoutManager,puja_LayoutManager;
    RecyclerView.Adapter mAdapter,pujaRecAdapter;
    ArrayList<String> alName;
    ArrayList<Integer> alImage;




//--------------------------------------------icon_source----------------------------------------



    String iconnamelistPUJA[] = {
            "Sarswati\nPooja", "Durga\nPooja", "Satnarayan\nPooja",
            "Lakshmi\nPooja", "Kaali Pooja", "Chaudchan",
            "ShivRatri","Devuthaan", "NarakNiwaran\nChaturdashi", "Shama\nChakeva",
            "Bishwakarma\nPooja", "Zeemutwahan\nPooja", "Nawann",
            "Jarror","Bashant\nPanchami", "Tilaakraint", "Juid sheetal",
            "Holi", "Chhaith", "Chitragupt\nPooja",};
    int iconsSankarPUJA[] = {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,

            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,

            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,








    };



//------------------------------------------------------------------------------------------------------------


    String iconnamelistB[] = {
            "New Year",      "Republic Day",   "Independent Day",  "Father's Day",
            "Mother's Day",  "Earth Day",      "Labour Day",       "Friendship Day",
            "Cancer Day",    "Gandhi Jayanti", "Bhaidooj",         "Raksha Bandhan",
            "Valentine Day", "Eedd",           "Christmas Day",    "Muharram"
    };
    int iconsSankarB[] = {
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,



    };






    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        context = getActivity();
        contextpuja = getActivity();

        view = inflater.inflate(R.layout.parent_event, container, false);
/*
        GridView gridview = (GridView) view.findViewById(R.id.grid_id_test1);
       // gridview.setAdapter(new BlankFragment(getContext()));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(getActivity(), "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });

*/


        gridViewPuja = (GridView) view.findViewById(R.id.puja_event_grid_id);

        gridViewPuja.setAdapter(new Event_Pooja(contextpuja, iconsSankarPUJA, iconnamelistPUJA));

        // adapterpuja = new Event_Pooja(view.getContext(), iconsSankarPUJA, iconnamelistPUJA);


        // The number of Columns


        gridViewPuja.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int p, long i) {

                Toast.makeText(contextpuja, "Clicked letter:" + iconnamelistPUJA[p], Toast.LENGTH_SHORT).show();
            }
        });





        gridViewAll = (GridView) view.findViewById(R.id.event_all_id);
        Event_All adaptera = new Event_All(getActivity(), iconsSankarB, iconnamelistB);
        gridViewAll.setAdapter(adaptera);





        gridViewAll.setLongClickable(true);

        gridViewAll.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {

                    case 0:
                        Toast.makeText(context, "First" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;

                    case 1:
                        Toast.makeText(context, "Second:" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;

                    case 2:
                        Toast.makeText(context, "Third" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;
                    case 3:
                        Toast.makeText(context, "Fourth:" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;
                    case 4:
                        Toast.makeText(context, "Fifth:" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;
                    case 5:
                        Toast.makeText(context, "Sixth:" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;
                }








                return false;
            }
        });




        gridViewAll.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                switch (position) {

                    case 0:
                        Toast.makeText(context, "You Clicked"+"First" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;

                    case 1:
                        Toast.makeText(context,"You Clicked"+ "Second:" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;



                    case 2:
                        Toast.makeText(context,"You Clicked"+ "Third" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;
                    case 3:
                        Toast.makeText(context, "You Clicked"+"Fourth:" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;
                    case 4:
                        Toast.makeText(context, "You Clicked"+"Fifth:" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;
                    case 5:
                        Toast.makeText(context, "You Clicked"+"Sixth:" + iconnamelistB[position], Toast.LENGTH_SHORT).show();

                        break;
                }





            }
        });







       // alName = new ArrayList<>(Arrays.asList("Cheesy...", "Crispy... ", "Fizzy...", "Cool...", "Softy...", "Fruity...", "Fresh...", "Sticky..."));


        alName = new ArrayList<>(Arrays.asList(
                "Chhatiyaar", "Mundan","Madushramni" , "Vivah", "Duirangman",
                "Uplayen"  , "Kojegra", "Batsaabitri"));

        alImage = new ArrayList<>(Arrays.asList(
                R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher));

        // Calling the RecyclerView
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        // The number of Columns
        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new EventSanskarAdapter(getActivity(), alName, alImage);
        mRecyclerView.setAdapter(mAdapter);












        return view;

    }


    @Override
    public void onClick(View view) {




    }

    @Override
    public boolean onLongClick(View view) {
        return true;
    }
}
