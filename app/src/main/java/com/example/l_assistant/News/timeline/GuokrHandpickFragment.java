package com.example.l_assistant.News.timeline;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.l_assistant.R;

/**
 * Created by zkd on 2017/10/19.
 */

public class GuokrHandpickFragment extends Fragment {
    public GuokrHandpickFragment() {
        // Requires an empty constructor.
    }

    public static GuokrHandpickFragment newInstance() {
        return new GuokrHandpickFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.timeline_page_fragment, container, false);

        return view;
    }
}
