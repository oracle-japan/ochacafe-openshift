package com.oracle.jp.cowsay.executor;

import com.github.ricksbrown.cowsay.Cowsay;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.helidon.webserver.Service;

public class CowsayService implements Service {

    @Override
    public void update(Routing.Rules rules) {
        rules.get("/say", this::sayHandler);
    }

    private void sayHandler(ServerRequest req, ServerResponse res) {
        var params = new String[] { "-f", "default", "Moo!!" };
        var message = Cowsay.say(params);
        res.send(message);
    }

}
