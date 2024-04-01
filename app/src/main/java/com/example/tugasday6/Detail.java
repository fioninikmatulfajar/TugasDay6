package com.example.tugasday6;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.Locale;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.detail);
        String namaItem = getIntent().getStringExtra("Nama Item");
        String deskripsi = getIntent().getStringExtra("desc");
        double harga = getIntent().getDoubleExtra("Harga", 0.0);
        int gmbItem = getIntent().getIntExtra("Gambar", R.drawable.ic_launcher_background);

        TextView namaTextView = findViewById(R.id.namaItem);
        TextView deskripsiTextView = findViewById(R.id.deskripsi);
        TextView hargaTextView = findViewById(R.id.harga);
        ImageView gmbItemImageView = findViewById(R.id.gmbItem);
        Button shareButton = findViewById(R.id.share);

        namaTextView.setText(namaItem);
        deskripsiTextView.setText(deskripsi);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedHarga = formatter.format(harga);
        hargaTextView.setText("Harga : " + formattedHarga);
        gmbItemImageView.setImageResource(gmbItem);

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), gmbItem);
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG,100, bytes);
                String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Title", null);
                Uri imageUri = Uri.parse(path);

                String shareText = "Check Out This Item : " + namaItem + "\n\nDeskripsi : " + deskripsi + "\n\nHarga : " + harga;
                Intent shareIntent = new Intent(Intent.ACTION_SEND);

                shareIntent.setType("image/*");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                startActivity(Intent.createChooser(shareIntent, "Bagikan ke"));
            }
        });
    }
}
