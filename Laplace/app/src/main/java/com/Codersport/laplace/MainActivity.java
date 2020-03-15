package com.Codersport.laplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        st=getIntent().getExtras().getString("lap");

        if(!Python.isStarted())
            Python.start(new AndroidPlatform(this));

        Python py=Python.getInstance();
        PyObject pyf=py.getModule("app");
        PyObject obj=pyf.callAttr("find",st);
        textView=findViewById(R.id.text);
        textView.setText(obj.toString());


    }

    public void onBackPressed(){
        Intent intent = new Intent(MainActivity.this, LaplaceMain.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


}
