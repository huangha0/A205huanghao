package com.first.hh.bmi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.OnClickListener;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private Button btn_calc;
    private EditText et_height;
    private EditText et_weight;
    private TextView et_suggest;
    private void findViews(){
        btn_calc = (Button)findViewById(R.id.bt_calculate);
        et_height=(EditText)findViewById(R.id.et_height);
        et_weight=(EditText)findViewById(R.id.et_weight);
        et_suggest=(TextView)findViewById(R.id.tv_suggest);
    }

    private void setListeners(){
        btn_calc.setOnClickListener(calcBMI);
    }
    private OnClickListener calcBMI = new OnClickListener(){
        public void onClick(View v)
        {
            try {
                double height = Double.parseDouble(et_height.getText().toString()) / 100;
                double weight = Double.parseDouble(et_weight.getText().toString());
                double BMI = weight / (height * height);

                TextView result = (TextView) findViewById(R.id.tv_result);
                result.setText("你的BMI指数为：" + BMI);
                if (BMI<=16) {
                    et_suggest.setText(R.string.advise_veryligth);
                    Toast.makeText(MainActivity.this,R.string.advise_veryligth,Toast.LENGTH_SHORT).show();
                }else if (BMI>16&&BMI<=18.5) {
                    et_suggest.setText(R.string.advise_ligth);
                    Toast.makeText(MainActivity.this,R.string.advise_ligth,Toast.LENGTH_SHORT).show();
                }else if (BMI>18.5&&BMI<=25) {
                    et_suggest.setText(R.string.advise_average);
                    Toast.makeText(MainActivity.this,R.string.advise_average,Toast.LENGTH_SHORT).show();
                }else if (BMI>25&&BMI<=30) {
                    et_suggest.setText(R.string.advise_overweight);
                    Toast.makeText(MainActivity.this,R.string.advise_overweight,Toast.LENGTH_SHORT).show();
                }else if (BMI>30&&BMI<=35) {
                    et_suggest.setText(R.string.advise_heavy);
                    Toast.makeText(MainActivity.this,R.string.advise_heavy,Toast.LENGTH_SHORT).show();
                }else if (BMI>35&&BMI<=40) {
                    et_suggest.setText(R.string.advise_severeobesity);
                    Toast.makeText(MainActivity.this,R.string.advise_severeobesity,Toast.LENGTH_SHORT).show();
                }else {
                    et_suggest.setText(R.string.advise_extremeobesity);
                    Toast.makeText(MainActivity.this,R.string.advise_extremeobesity,Toast.LENGTH_SHORT).show();
                }
            }catch(Exception obj){
                Toast.makeText(MainActivity.this,R.string.wrong,Toast.LENGTH_SHORT).show();
            }
        }
    };
    private void openOptionsDialog()
    {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("关于BMI")
                .setMessage("BMI指数（Body Mass Index）即身体质量指数，是与体内脂肪总量密切相关的指标，主要反映全身性超重和肥胖。由于BMI计算的是身体脂肪的比例，所以在测量身体因超重而面临心脏病、高血压等风险上，逼单存的一体重来认定，更具准确性。\n")
                .setIcon(R.drawable.action_help)
                .show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.about){
            openOptionsDialog();
        }
        if(id == R.id.exit){
            exit();
        }

        return super.onOptionsItemSelected(item);
    }

    private void exit(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("退出")
                .setMessage("确定要退出应用程序吗？")
                .setIcon(R.drawable.action_help)
                .setNegativeButton("是",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                System.exit(0);
                            }
                        })
                .setPositiveButton("否", new DialogInterface.OnClickListener() {
                    public void onClick(
                            DialogInterface dialoginterface, int i) {
                    }
                })
                .show();
    }
}