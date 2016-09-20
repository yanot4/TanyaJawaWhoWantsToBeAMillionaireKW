package com.oktat.tanyajawabwhowantstobeamillionairekw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView pertanyaan1;
    private TextView linux;
    private TextView pertanyaan2;
    private TextView intel;
    private TextView pertanyaan3;
    private TextView microsoft;
    private TextView pertanyaan4;
    private TextView update;
    private TextView pertanyaan5;
    private TextView ubuntu;
    private TextView hasil;
    private TextView persentase;

    private RadioButton linus;
    private RadioButton bill1;
    private RadioButton mark;
    private RadioButton noyce;
    private RadioButton moore;
    private RadioButton bill2;
    private RadioButton satya;
    private RadioButton bill3;
    private RadioButton paul;
    private RadioButton anniv;
    private RadioButton sp1;
    private RadioButton blue;
    private RadioButton u16041;
    private RadioButton u1610;
    private RadioButton u14043;

    private Button cek;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pertanyaan1 = (TextView) findViewById(R.id.textView3);
        linux = (TextView) findViewById(R.id.textView4);
        pertanyaan2 = (TextView) findViewById(R.id.textView5);
        intel = (TextView) findViewById(R.id.textView6);
        pertanyaan3 = (TextView) findViewById(R.id.textView7);
        microsoft = (TextView) findViewById(R.id.textView8);
        pertanyaan4 = (TextView) findViewById(R.id.textView9);
        update = (TextView) findViewById(R.id.textView10);
        pertanyaan5 = (TextView) findViewById(R.id.textView11);
        ubuntu = (TextView) findViewById(R.id.textView12);
        hasil = (TextView) findViewById(R.id.textView13);
        persentase = (TextView) findViewById(R.id.textView14);

        linus = (RadioButton) findViewById(R.id.radioButton2);
        bill1 = (RadioButton) findViewById(R.id.radioButton3);
        mark = (RadioButton) findViewById(R.id.radioButton);
        noyce = (RadioButton) findViewById(R.id.radioButton5);
        moore = (RadioButton) findViewById(R.id.radioButton6);
        bill2 = (RadioButton) findViewById(R.id.radioButton4);
        satya = (RadioButton) findViewById(R.id.radioButton8);
        bill3 = (RadioButton) findViewById(R.id.radioButton9);
        paul = (RadioButton) findViewById(R.id.radioButton7);
        anniv = (RadioButton) findViewById(R.id.radioButton10);
        sp1 = (RadioButton) findViewById(R.id.radioButton11);
        blue = (RadioButton) findViewById(R.id.radioButton12);
        u16041 = (RadioButton) findViewById(R.id.radioButton13);
        u1610 = (RadioButton) findViewById(R.id.radioButton14);
        u14043 = (RadioButton) findViewById(R.id.radioButton15);

        cek = (Button) findViewById(R.id.button);
        clear = (Button) findViewById(R.id.button2);

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (linus.isChecked() && bill2.isChecked() && satya.isChecked() && anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda benar semua");
                    persentase.setText("Presentase 100 %");

                } else if (!linus.isChecked() && bill2.isChecked() && satya.isChecked() && anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1");
                    persentase.setText("Presentase 80 %");

                } else if (linus.isChecked() && !bill2.isChecked() && satya.isChecked() && anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 2");
                    persentase.setText("Presentase 80 %");

                } else if (linus.isChecked() && bill2.isChecked() && !satya.isChecked() && anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 3");
                    persentase.setText("Presentase 80 %");

                } else if (linus.isChecked() && bill2.isChecked() && satya.isChecked() && !anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 4");
                    persentase.setText("Presentase 80 %");

                } else if (linus.isChecked() && bill2.isChecked() && satya.isChecked() && anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 5");
                    persentase.setText("Presentase 80 %");

                } else if (!linus.isChecked() && !bill2.isChecked() && satya.isChecked() && anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1 dan 2");
                    persentase.setText("Presentase 60 %");

                } else if (!linus.isChecked() && bill2.isChecked() && !satya.isChecked() && anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1 dan 3");
                    persentase.setText("Presentase 60 %");

                } else if (!linus.isChecked() && bill2.isChecked() && satya.isChecked() && !anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1 dan 4");
                    persentase.setText("Presentase 60 %");

                } else if (!linus.isChecked() && !bill2.isChecked() && satya.isChecked() && anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1 dan 5");
                    persentase.setText("Presentase 60 %");

                } else if (linus.isChecked() && !bill2.isChecked() && !satya.isChecked() && anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 2 dan 3");
                    persentase.setText("Presentase 60 %");

                } else if (linus.isChecked() && bill2.isChecked() && !satya.isChecked() && !anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 3 dan 4");
                    persentase.setText("Presentase 60 %");

                } else if (linus.isChecked() && bill2.isChecked() && satya.isChecked() && !anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 4 dan 5");
                    persentase.setText("Presentase 60 %");

                } else if (!linus.isChecked() && !bill2.isChecked() && !satya.isChecked() && anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1, 2 dan 3");
                    persentase.setText("Presentase 40 %");

                } else if (!linus.isChecked() && !bill2.isChecked() && satya.isChecked() && !anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1, 2 dan 4");
                    persentase.setText("Presentase 40 %");

                } else if (!linus.isChecked() && !bill2.isChecked() && satya.isChecked() && anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1, 2 dan 5");
                    persentase.setText("Presentase 40 %");

                } else if (!linus.isChecked() && bill2.isChecked() && !satya.isChecked() && !anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1, 3 dan 4");
                    persentase.setText("Presentase 40 %");

                } else if (!linus.isChecked() && bill2.isChecked() && !satya.isChecked() && anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1, 3 dan 5");
                    persentase.setText("Presentase 40 %");

                } else if (!linus.isChecked() && bill2.isChecked() && satya.isChecked() && !anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1, 4 dan 5");
                    persentase.setText("Presentase 40 %");

                } else if (linus.isChecked() && !bill2.isChecked() && !satya.isChecked() && !anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 2, 3 dan 4");
                    persentase.setText("Presentase 40 %");

                } else if (linus.isChecked() && !bill2.isChecked() && satya.isChecked() && !anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 2, 4 dan 5");
                    persentase.setText("Presentase 40 %");

                } else if (linus.isChecked() && bill2.isChecked() && !satya.isChecked() && !anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 3, 4 dan 5");
                    persentase.setText("Presentase 40 %");

                } else if (!linus.isChecked() && !bill2.isChecked() && !satya.isChecked() && !anniv.isChecked() && u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1, 2, 3 dan 4");
                    persentase.setText("Presentase 20 %");

                } else if (linus.isChecked() && !bill2.isChecked() && !satya.isChecked() && !anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 2, 3, 4 dan 5");
                    persentase.setText("Presentase 20 %");

                } else if (!linus.isChecked() && bill2.isChecked() && !satya.isChecked() && !anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah pada nomor 1, 3, 4 dan 5");
                    persentase.setText("Presentase 20 %");

                } else if (!linus.isChecked() && !bill2.isChecked() && !satya.isChecked() && !anniv.isChecked() && !u16041.isChecked()) {
                    hasil.setText("Anda salah semua");
                    persentase.setText("Presentase 0 %");

                } else {
                        Toast.makeText(MainActivity.this, "Coba cek lagi jawaban anda.", Toast.LENGTH_SHORT).show();
                }
            }


        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linus.setChecked(false);
                bill1.setChecked(false);
                mark.setChecked(false);
                noyce.setChecked(false);
                moore.setChecked(false);
                bill2.setChecked(false);
                satya.setChecked(false);
                bill3.setChecked(false);
                paul.setChecked(false);
                anniv.setChecked(false);
                sp1.setChecked(false);
                blue.setChecked(false);
                u16041.setChecked(false);
                u1610.setChecked(false);
                u14043.setChecked(false);

            }
        });
    }
}
