package net.agusharyanto.jatisaricafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewTotal;
    TextView textViewJumlah;
    int mCount =0;
    int mHarga =10000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewJumlah = (TextView) findViewById(R.id.textViewJumlah);
        textViewTotal = (TextView) findViewById(R.id.textViewTotal);
    }

    public void tambah(View view) {

        mCount++;
        if (textViewJumlah != null)
            textViewJumlah.setText("Jumlah : "+Integer.toString(mCount));
        int mTotal = mCount * mHarga;
        textViewTotal.setText("Total Harga : "+String.valueOf(mTotal));
    }
}
