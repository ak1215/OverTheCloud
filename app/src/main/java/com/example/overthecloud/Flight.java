package com.example.overthecloud;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ResourceBundle;

import static com.example.overthecloud.GameView.screenRatioX;
import static com.example.overthecloud.GameView.screenRatioY;

public class Flight {

    boolean isGoingUp = false;
    int x, y, width, height, wingCounter = 0;
    Bitmap flight1, flight2;

    Flight(int screenY, Resources res){

        flight1 = BitmapFactory.decodeResource(res, R.drawable.fly1);
        flight2 = BitmapFactory.decodeResource(res, R.drawable.fly2);

        width /= 4;
        height /= 4;

        width*= (int) screenRatioX;
        height*= (int) screenRatioY;

        flight1 = Bitmap.createScaledBitmap(flight1, width, height, false);
        flight1 = Bitmap.createScaledBitmap(flight1, width, height, false);

        y = screenY / 2;
        x = (int)(64 * screenRatioX);

    }
    Bitmap getFlight (){
        if (wingCounter == 0){
            wingCounter++;
            return flight1;
        }
        wingCounter--;

        return flight2;
    }
}
