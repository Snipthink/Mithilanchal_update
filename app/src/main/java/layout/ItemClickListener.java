package layout;

/**
 * Created by root on 11/9/17.
 */

import android.view.View;

import com.snipthink.abhishek.mithilanchal_update.Feedback;

public interface ItemClickListener {

    Feedback onClick(View view, int position, boolean isLongClick);


}