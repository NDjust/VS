package com.pie.vs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class SplashActivity extends AndroidApplication {
    FrameLayout gameLayout;
    View gameView;
    GameBack_1 gameBack_1;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        gameBack_1 = new GameBack_1();

        gameLayout = (FrameLayout) findViewById(R.id.gameView);
        gameView = initializeForView(gameBack_1, config);

        gameLayout.addView(gameView);

        Handler hd_splash = new Handler();
        hd_splash.postDelayed(new SplashHandler(), 5000);
    }

    private class SplashHandler implements Runnable {
        public void run() {
            gameBack_1.dispose();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }
    }
}
