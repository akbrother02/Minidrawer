package loadingdata.ashish.minidrawer;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Anthony on 16-01-25.
 */
public class MasterFragment extends ListFragment {


    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master, container);

        setListAdapter(new MenuListAdapter(R.layout.row_menu_action, getActivity(), MenuActionItem.values()));
        return view;
    }
}