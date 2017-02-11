package com.hanbit.app.calcapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.app.calcapp.domain.CalcBean;
import com.hanbit.app.calcapp.service.CalcService;
import com.hanbit.app.calcapp.service.CalcServiceImp;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etNum1,etNum2;
    Button btPlus,btMinus,btMulti,btDivide,btMod,btEqual;
    TextView tvResult;
    CalcService service;
    CalcBean bean;
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1= (EditText) findViewById(R.id.etNum1);
        etNum2= (EditText) findViewById(R.id.etNum2);
        btPlus= (Button) findViewById(R.id.btPlus);
        btMinus= (Button) findViewById(R.id.btMinus);
        btMulti= (Button) findViewById(R.id.btMulti);
        btDivide= (Button) findViewById(R.id.btDivide);
        btMod= (Button) findViewById(R.id.btMod);
        btEqual= (Button) findViewById(R.id.btEqual);
        tvResult= (TextView) findViewById(R.id.tvResult);
        result=0;
        service = new CalcServiceImp();
        bean=new CalcBean();
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDivide.setOnClickListener(this);
        btMod.setOnClickListener(this);
        btEqual.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        /*int num1=Integer.parseInt(etNum1.getText().toString());
        int num2=Integer.parseInt(etNum2.getText().toString());
        Log.d("the first var : ",String .valueOf(num1));
        Log.d("the second var : ",String .valueOf(num2));
        bean.setFirstNum(num1);
        bean.setSecondNum(num2);*/

        bean.setFirstNum(Integer.parseInt(etNum1.getText().toString()));
        bean.setSecondNum(Integer.parseInt(etNum2.getText().toString()));
        Log.d("the first var : ",String .valueOf(bean.getFirstNum()));
        Log.d("the second var : ",String .valueOf(bean.getSecondNum()));


        switch(v.getId()){
            case R.id.btPlus:
                result = service.plus(bean);
                break;
            case R.id.btMinus:
                result = service.minus(bean);
                break;
            case R.id.btMulti:
                result = service.multi(bean);
                break;
            case R.id.btDivide:
                result = service.div(bean);
                break;
            case R.id.btMod:
                result = service.mod(bean);
                break;
            case R.id.btEqual:
                tvResult.setText("결과 값 : "+result);
                break;
        }
    }
}
