package com.template.demo;

public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    final void play() {
        initialize();

        startPlay();

        endPlay();
    }
}
