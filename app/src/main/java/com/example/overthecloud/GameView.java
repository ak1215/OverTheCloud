package com.example.overthecloud;

import android.content.Context;
import android.view.Surface;

public class GameView extends Surface implements Runnable {

    private Thread thread;

    public GameView(Context context){
        super(context);
    }

    @Override
    public void run() {

    }

    public void resume (){

        thread = new Thread(this);
        thread.start();
    }
    public void pause(){

    }
}
