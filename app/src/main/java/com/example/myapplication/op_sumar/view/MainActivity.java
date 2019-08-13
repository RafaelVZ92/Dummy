package com.example.myapplication.op_sumar.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.op_sumar.model.Data;
import com.example.myapplication.op_sumar.presenter.MainActivityPresenter;
import com.example.myapplication.op_sumar.presenter.MainActivityPresenterImp;

public class MainActivity extends AppCompatActivity implements MainActivityView{

    private Data data;
    private EditText edtNumber1;
    private EditText edtNumber2;
    private TextView textViewResult;
    private View btnSumar;
    private MainActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UiElements();
        presenter = new MainActivityPresenterImp(this);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma(view);
            }
        });

    }

    public void UiElements(){
        edtNumber1 = (EditText) findViewById(R.id.edtnumber1);
        edtNumber2 = (EditText) findViewById(R.id.edtnumber2);
        btnSumar = (Button) findViewById(R.id.sumar);
        textViewResult = (TextView) findViewById(R.id.tvResult);
    }

    public void suma(View view){
        String number1 = edtNumber1.getText().toString();
        String number2= edtNumber2.getText().toString();
        //COMUNICACION CON EL PRESENTER
        presenter.sumar(number1, number2);
    }

    @Override
    public void showResult(String result) {
        textViewResult.setText(result);
    }

    @Override
    public void showError(String Error) {
        textViewResult.setText(Error);
    }
}
