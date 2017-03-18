package com.dares.mhanif.wallet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private receivable rec_act;
    private Button rec_btn;
    private Button pay_btn;
    private Button inv_btn;
    private Button bill_btn;

    private Activity rec_act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View v = this.findViewById(R.id.activity_main);
        rec_btn = (Button) findViewById(R.id.rec_btn);
        pay_btn = (Button) findViewById(R.id.pay_btn);
        inv_btn = (Button) findViewById(R.id.inv_btn);
        bill_btn = (Button) findViewById(R.id.bill_btn);

        //Activties Assignments

            rec_act = new receivable();

        //Onclick For Button On Dashboard
        rec_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity("receivable");
            }
        });

        pay_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity("payable");
            }
        });

        inv_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity("invoice");
            }
        });


        bill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity("bill");
            }
        });


    }
    /*
    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                    case R.id.rec_btn:
                        Toast.makeText(getApplicationContext(),"Recieveable Button Clicked. ",Toast.LENGTH_SHORT).show();
                        launchActivity("receivable");
                        break;
                    case R.id.pay_btn:
                        Toast.makeText(getApplicationContext(),"Payable Button Clicked. ",Toast.LENGTH_SHORT).show();
                        launchActivity("payable");
                        break;

                    case R.id.inv_btn:
                        Toast.makeText(getApplicationContext(),"Invoice Button Clicked. ",Toast.LENGTH_SHORT).show();
                        launchActivity("invoice");
                        break;
                    case R.id.bill_btn:
                        Toast.makeText(getApplicationContext(),"Bill Button Clicked. ",Toast.LENGTH_SHORT).show();
                        launchActivity("bill");
                        break;
                    case View.NO_ID:
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"Empty Clicked. ",Toast.LENGTH_SHORT).show();
                        break;
            }
    }
    */
    private void launchActivity(String act) {
        Intent intent;
        switch (act){
            case "receivable":
                intent = new Intent(this, receivable.class);
                startActivity(intent);
                break;
            case "payable":
                intent = new Intent(this, payable.class);
                startActivity(intent);
                break;
            case "invoice":
                intent = new Intent(this, invoice.class);
                startActivity(intent);
                break;
            case "bill":
                intent = new Intent(this, bill.class);
                startActivity(intent);
                break;

            default:
                Toast.makeText(getApplicationContext(),"Failed.",Toast.LENGTH_SHORT).show();
                break;

        }
        //intent = new Intent(this, receivable.class);
        //startActivity(intent);
    }
}
