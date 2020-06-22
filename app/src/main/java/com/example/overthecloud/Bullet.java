package com.example.overthecloud;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.example.overthecloud.GameView.screenRatioX;
import static com.example.overthecloud.GameView.screenRatioY;

public class Bullet {
    int x, y, width, height;
    Bitmap bullet;

    Bullet (Resources res){

        bullet = BitmapFactory.decodeResource(res, R.drawable.bullet);

         width = bullet.getWidth();
         height = bullet.getHeight();

        width/=4;
        height /= 4;

        width *= (int) screenRatioX;
        height *= (int) screenRatioY;

        bullet = Bitmap.createScaledBitmap(bullet, width, height, false);
    }

    Rect getCollisinShape (){
        return new Rect(x, y, x + width, y + height);
    }
}
