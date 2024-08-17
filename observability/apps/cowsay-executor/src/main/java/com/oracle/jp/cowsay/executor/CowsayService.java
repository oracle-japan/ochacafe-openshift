package com.oracle.jp.cowsay.executor;

import com.github.ricksbrown.cowsay.Cowsay;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.HttpService;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class CowsayService implements HttpService {

    @Override
    public void routing(HttpRules rules) {
        rules.get("/say", this::sayHandler);
    }

    private void sayHandler(ServerRequest req, ServerResponse res) {
        var params = new String[] { "-f", "default", "Moo!!" };
        var message = Cowsay.say(params);
        res.send(message);
    }

}
