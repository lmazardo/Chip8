package com.dkanada.chip.views;

import android.graphics.Canvas;
import android.util.Log;

import com.dkanada.chip.core.Core;
import com.dkanada.chip.interfaces.EventListener;

public class GameThread extends Thread implements EventListener {
    GameView gameView;

    public GameThread(GameView view) {
        gameView = view;
    }

    @Override
    public void run() {
        Log.e("GameThread: ", "START THREAD");
        Core core = new Core(this);
        while (true) {
            core.step();
        }
    }

    @Override
    public void updateDisplay(byte[][] display) {
        gameView.update(display);
        gameView.postInvalidate();
    }
}
