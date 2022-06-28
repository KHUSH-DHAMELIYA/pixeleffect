package com.example.pixeleffect;

import static com.example.pixeleffect.MainActivity.uri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.canhub.cropper.CropImage;
import com.canhub.cropper.CropImageView;

public class cropimg extends AppCompatActivity {

    CropImageView cropImage;
    ImageView click;
    public static Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cropimg);

        cropImage = findViewById(R.id.cropImageView);
        click = findViewById(R.id.click);
        cropImage.setImageUriAsync(uri);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bitmap = cropImage.getCroppedImage();

                startActivity(new Intent(cropimg.this,imageEdit.class));
            }
        });

    }
}