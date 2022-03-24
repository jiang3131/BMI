package com.gyj.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gyj.myapplication2.utils.BMI;

public class MainActivity extends AppCompatActivity {
    private TextView weight;
    private TextView height;
    private TextView bmi;
    private TextView zhenduan;
    private Button calcu;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        bmi=findViewById(R.id.BmiValue);
        zhenduan=findViewById(R.id.zhenduanValue);
        calcu=findViewById(R.id.calcubutton);
        radioGroup=findViewById(R.id.rdg);
        calcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String h1=height.getText().toString();
                String w1=weight.getText().toString();
                if(TextUtils.isEmpty(h1)||TextUtils.isEmpty(w1)){
                    Toast.makeText(MainActivity.this,"身高体重不能为空",Toast.LENGTH_SHORT).show();
                }else{
                    int buttonId = radioGroup.getCheckedRadioButtonId();
                    double h2=Double.valueOf(h1);
                    double w2=Double.valueOf(w1);
                    double bmi1=w2/h2/h2;
                    String bmi2=String.valueOf(bmi1);
                    bmi.setText(bmi2.substring(0,4));
                    zhenduan.setText(BMI.getBmi(buttonId,bmi1,R.id.nanbutton));

                }
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //加载xml菜单资源
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item_clear:
                weight.setText("");
                height.setText("");
                Toast.makeText(MainActivity.this,"清空",Toast.LENGTH_SHORT).show();
                return true;

            default: return super.onOptionsItemSelected(item);

        }
    }

}