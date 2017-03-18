package com.dares.mhanif.wallet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class receivable extends AppCompatActivity {

    private Button save_btn;
    private Button cancel_btn;
    private Button mBtGoBack;


    private EditText _item;
    private EditText _price;
    private EditText _qty;

    private TextView rec_data;

    private String item;
    private String price;
    private String qty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieveable);

        _item   = (EditText) findViewById(R.id.itemDescription);
        _price   = (EditText) findViewById(R.id.unitPrice);
        _qty      = (EditText) findViewById(R.id.qty);

        rec_data = (TextView) findViewById(R.id.rec_data);

        save_btn = (Button) findViewById(R.id.add_btn);

        save_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                rec_data.setText(_item.getText().toString() + " - "
                        + _price.getText().toString() + " - "
                        + _qty.getText().toString());
                _item.setText("");
                _price.setText("");
                _qty.setText("1");
            }
        });

        mBtGoBack = (Button) findViewById(R.id.bt_go_back);

        mBtGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

    }

    /*
    @Override
    public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Successfuly Saved. ",Toast.LENGTH_SHORT).show();
                rec_data.setText(_item.toString() + " - " + _price.toString() + " - " + _qty.toString());

                _item.setText("");
                _price.setText("20");
                _qty.setText("1");

    }
    */
}
