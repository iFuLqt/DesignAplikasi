package com.example.designaplikasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper vf;
    private CardView cv1, cv2, cv3, cv4,cv5,cv6,cvsaldo,cvcoin,cvtransfer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Java CardView Intent (Pindah Pindah Activity)
        cv1 = findViewById(R.id.cv1);
        cv2 = findViewById(R.id.cv2);
        cv3 = findViewById(R.id.cv3);
        cv4 = findViewById(R.id.cv4);
        cv5 = findViewById(R.id.cv5);
        cv6 = findViewById(R.id.cv6);
        cvsaldo = findViewById(R.id.cvsaldo);
        cvcoin = findViewById(R.id.cvcoin);
        cvtransfer = findViewById(R.id.cvtransfer);
        cv1.setOnClickListener((View.OnClickListener) this);
        cv2.setOnClickListener((View.OnClickListener) this);
        cv3.setOnClickListener((View.OnClickListener) this);
        cv4.setOnClickListener((View.OnClickListener) this);
        cv5.setOnClickListener((View.OnClickListener) this);
        cv6.setOnClickListener((View.OnClickListener) this);
        cvsaldo.setOnClickListener((View.OnClickListener) this);
        cvcoin.setOnClickListener((View.OnClickListener) this);
        cvtransfer.setOnClickListener((View.OnClickListener) this);

        //Java ViewFlipper (Slide Foto Di Atas
        vf = findViewById(R.id.vf);
        int images[]={R.drawable.gambar1, R.drawable.gambar2, R.drawable.gambar3, R.drawable.gambar4, R.drawable.gambar5};
        for (int image : images) {
            flipperImage(image);
        }
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.cv1) {
            Intent x = new Intent(MainActivity.this, hewan.class); startActivity(x);
        } else if (id == R.id.cv2) {
            Intent x = new Intent(MainActivity.this, aksesoris.class); startActivity(x);
        } else if (id == R.id.cv3) {
            Intent x = new Intent(MainActivity.this, makanan.class); startActivity(x);
        } else if (id == R.id.cv4) {
            Intent x = new Intent(MainActivity.this, grooming.class); startActivity(x);
        } else if (id == R.id.cv5) {
            Intent x = new Intent(MainActivity.this, penitipan.class); startActivity(x);
        } else if (id == R.id.cv6) {
            Intent x = new Intent(MainActivity.this, konsultasi.class); startActivity(x);
        } else if (id == R.id.cvsaldo) {
            Intent x = new Intent(MainActivity.this, saldotransfer.class); startActivity(x);
        } else if (id == R.id.cvcoin) {
            Intent x = new Intent(MainActivity.this, coin.class); startActivity(x);
        } else if (id == R.id.cvtransfer) {
            Intent x = new Intent(MainActivity.this, saldotransfer.class); startActivity(x);
        }
    }

    public void flipperImage(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        vf.addView(imageView);
        vf.setFlipInterval(4000);
        vf.setAutoStart(true);
        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setOutAnimation(this,android.R.anim.slide_out_right);
    }


}