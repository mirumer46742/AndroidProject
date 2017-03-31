package com.colorcloud.wifichat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class ImageViewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        Intent intent = getIntent();

        ImageView img = (ImageView) findViewById(R.id.fulImageView);

        String str = intent.getExtras().getString("IMAGE");

        byte strBytes[] = new byte[str.length()];
        for(int i = 0; i < str.length() ; i++){

            strBytes[i] = (byte)str.charAt(i);
        }
        //if (file.exists()) {

        // Bitmap bitmap = BitmapFactory.decodeFile(item.mMsg);
        Bitmap bitmap = BitmapFactory.decodeByteArray(strBytes, 0, strBytes.length);
        img.setImageBitmap(bitmap);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_image_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
