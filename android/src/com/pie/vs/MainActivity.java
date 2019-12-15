package com.pie.vs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.pie.vs.GameBack_1;

public class MainActivity extends AndroidApplication {
    FrameLayout gameLayout;
    View gameView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

        gameLayout = (FrameLayout) findViewById(R.id.gameView);
        gameView = initializeForView(new GameBack_1(), config);

        gameLayout.addView(gameView);
    }
}
