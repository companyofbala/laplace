package com.Codersport.laplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LaplaceMain extends AppCompatActivity {
    Button btn,epowt,sint,cost,sinht,cosht,dirac,unitstep,ta;
    EditText et;
    String lap,ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laplace_main);

        btn=findViewById(R.id.submit);
        et=findViewById(R.id.editText);
        epowt=findViewById(R.id.epowt);
        sint=findViewById(R.id.sint);
        ta=findViewById(R.id.ta);
        sinht=findViewById(R.id.sinht);
        cost=findViewById(R.id.cost);
        cosht=findViewById(R.id.cosht);
        dirac=findViewById(R.id.dirac);
        unitstep=findViewById(R.id.unitstep);
        ma="";


        sint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma="(sin(a*t))";
                et.append(ma);
            }
        });
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma="(t^a)";
                et.append(ma);
            }
        });

        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma="(cos(a*t))";
                et.append(ma);
            }
        });
        sinht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma="(sinh(a*t))";
                et.append(ma);
            }
        });
        cosht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma="(cosh(a*t))";
                et.append(ma);
            }
        });
        dirac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma="(Diracdelta())";
                et.append(ma);
            }
        });
        unitstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma="(Unitstep())";
                et.append(ma);
            }
        });


        epowt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma="(exp(a*t))";
                et.append(ma);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(LaplaceMain.this,MainActivity.class);
                lap=et.getText().toString();
                i.putExtra("lap",lap);
                startActivity(i);
                finish();


            }
        });
    }

    public void onBackPressed(){
        Intent intent = new Intent(LaplaceMain.this, Choose.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}
