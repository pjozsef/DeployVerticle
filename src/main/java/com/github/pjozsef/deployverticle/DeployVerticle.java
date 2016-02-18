package com.github.pjozsef.deployverticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

public class DeployVerticle extends AbstractVerticle{
    @Override
    public void start(Future<Void> startFuture) throws Exception {

        JsonObject deployment = config().getJsonObject("deployment");
        deployment.stream().forEach(System.out::println);
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
