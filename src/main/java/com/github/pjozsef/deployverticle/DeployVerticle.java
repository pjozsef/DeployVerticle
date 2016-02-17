package com.github.pjozsef.deployverticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class DeployVerticle extends AbstractVerticle{
    @Override
    public void start(Future<Void> startFuture) throws Exception {
                
    }

    @Override
    public void stop(Future<Void> stopFuture) throws Exception {
        super.stop(stopFuture);
    }

    @Override
    public void start() throws Exception {
        start(null);
    }

    @Override
    public void stop() throws Exception {
        stop(null);
    }
}
