package com.xw.samlpe.bubbleseekbar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xw.repo.BubbleSeekBar;

/**
 * DemoFragment2
 * <p>
 * Created by woxingxiao on 2017-03-11.
 */

public class DemoFragment2 extends Fragment {

    public static DemoFragment2 newInstance() {
        return new DemoFragment2();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo_2, container, false);
        BubbleSeekBar seekBar = view.findViewById(R.id.seek_bar);
        seekBar.setMinMax(0, 120);
        seekBar.setProgress(90);
        return view;
    }
}
