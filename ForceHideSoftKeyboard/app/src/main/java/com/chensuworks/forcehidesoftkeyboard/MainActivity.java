package com.chensuworks.forcehidesoftkeyboard;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.edittext);

        //getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        editText.requestFocus();
        editText.setShowSoftInputOnFocus(false);

//        if (Build.VERSION.SDK_INT >= 11) {
//            editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
//            editText.setTextIsSelectable(true);
//        } else {
//            editText.setRawInputType(InputType.TYPE_NULL);
//            editText.setFocusable(true);
//        }

//        editText.setInputType(InputType.TYPE_NULL);
//        editText.setTextIsSelectable(true);
//        editText.setCursorVisible(true);

//        editText.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                v.onTouchEvent(event);
//
//                InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
//                if (imm != null) {
//                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
//                }
//                return true;
//            }
//        });

        //hideKeyboard(this);
    }

    public static void hideKeyboard(Activity activity) {
        View view = activity.findViewById(R.id.edittext);
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
