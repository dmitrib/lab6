package ru.startandroid.lw06;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8;
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);

        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);

        View.OnClickListener B1 = new View.OnClickListener() {
            public void onClick(View v) {
                int X=Integer.parseInt(e1.getText().toString());
                int Y=Integer.parseInt(e2.getText().toString());
                int Z=X+Y;
                String res=Integer.toString(Z);
                e3.setText(res);
            }
        };
        View.OnClickListener B2 = new View.OnClickListener() {
            public void onClick(View v) {
                int X=Integer.parseInt(e1.getText().toString());
                int Y=Integer.parseInt(e2.getText().toString());
                int Z=X-Y;
                String res=Integer.toString(Z);
                e3.setText(res);
            }
        };
        View.OnClickListener B3 = new View.OnClickListener() {
            public void onClick(View v) {
                int X=Integer.parseInt(e1.getText().toString());
                int Y=Integer.parseInt(e2.getText().toString());
                int Z=X*Y;
                String res=Integer.toString(Z);
                e3.setText(res);
            }
        };
        View.OnClickListener B4 = new View.OnClickListener() {
            public void onClick(View v) {
                int X=Integer.parseInt(e1.getText().toString());
                int Y=Integer.parseInt(e2.getText().toString());
                int Z;
                String res;
                if (Y==0) res="Ошибка!";
                else
                {
                    Z=X/Y;
                    res=Integer.toString(Z);}
                e3.setText(res);
            }
        };
        View.OnClickListener B5 = new View.OnClickListener() {
            public void onClick(View v) {
                int X=Integer.parseInt(e1.getText().toString());
                String res=Integer.toBinaryString(X);
                e3.setText(res);
            }
        };
        View.OnClickListener B6 = new View.OnClickListener() {
            public void onClick(View v) {
                int X=Integer.parseInt(e1.getText().toString());
                int Y=Integer.parseInt(e2.getText().toString());
                int Z=X%Y;
                String res=Integer.toString(Z);
                e3.setText(res);
            }
        };
        View.OnClickListener B7 = new View.OnClickListener() {
            public void onClick(View v) {
                int X=Integer.parseInt(e1.getText().toString());
                int Y=Integer.parseInt(e2.getText().toString());
                int Z=X^Y;
                String res=Integer.toString(Z);
                e3.setText(res);
            }
        };
        View.OnClickListener B8=new View.OnClickListener() {
            public void onClick(View V) {
                String res=e3.getText().toString();
                e1.setText(res);
            }
        };
        b1.setOnClickListener(B1);
        b2.setOnClickListener(B2);
        b3.setOnClickListener(B3);
        b4.setOnClickListener(B4);
        b5.setOnClickListener(B5);
        b6.setOnClickListener(B6);
        b7.setOnClickListener(B7);
        b8.setOnClickListener(B8);


    }
}
