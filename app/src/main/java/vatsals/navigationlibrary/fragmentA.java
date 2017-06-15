package vatsals.navigationlibrary;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by LENOVO on 15-06-2017.
 */

public class fragmentA extends Fragment {
    public fragmentA() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    public static fragmentA newInstance(String a) {

        Bundle args = new Bundle();

        fragmentA fragment = new fragmentA();
        fragment.setArguments(args);
        return fragment;
    }
}
