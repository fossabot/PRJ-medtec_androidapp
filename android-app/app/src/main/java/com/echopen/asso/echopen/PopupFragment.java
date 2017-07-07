package com.echopen.asso.echopen;


import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * do not touch.
 *
 * This class provide a dialog view to MainActivity
 * used to select the current organ to scann.
 */
public class PopupFragment extends DialogFragment {


    public PopupFragment() {
        // Required empty public constructor
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Window window = getDialog().getWindow();
        window.setLayout(900, 1250);        //set (width,heigth) of the pop-up
        window.setGravity(Gravity.CENTER);  // set the position  of the pop-up
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);    //remove the title of the popup


        /**
         *  link event listener onClick of every button
         **/


        View view = inflater.inflate(R.layout.fragment_popup, container, false);
        ImageButton heart = (ImageButton) view.findViewById(R.id.imageButton);
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });

        ImageButton kidney = (ImageButton) view.findViewById(R.id.imageButton2);
        kidney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });

        ImageButton liver = (ImageButton) view.findViewById(R.id.imageButton3);
        liver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });

        ImageButton obstetrics = (ImageButton) view.findViewById(R.id.imageButton4);
        obstetrics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });

        ImageButton os = (ImageButton) view.findViewById(R.id.imageButton5);
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });

        ImageButton aorta = (ImageButton) view.findViewById(R.id.imageButton6);
        aorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });

        ImageButton gallbladder = (ImageButton) view.findViewById(R.id.imageButton7);
        gallbladder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });
        ImageButton lung = (ImageButton) view.findViewById(R.id.imageButton8);
        lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });

        ImageButton obsetetrics2 = (ImageButton) view.findViewById(R.id.imageButton9);
        obsetetrics2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });
        Button skip = (Button) view.findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupFragment.this.dismiss();
            }
        });

        return view;
    }

}