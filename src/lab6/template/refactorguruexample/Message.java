package lab6.template.refactorguruexample;

import java.util.ArrayList;
import java.util.List;

public class Message {
    private String description;
    private MessageType messageType;
    private Network network = null;
    private List<Network> networks = new ArrayList<>();

    public Message(String description, MessageType messageType) {
        this.description = description;
        this.messageType = messageType;
    }

    public Message(String description, MessageType messageType, Network network) {
        this.description = description;
        this.messageType = messageType;
        this.network = network;
    }

    public void attachNetwork(Network network) {
        networks.add(network);
    }

    public void post() {
        if (network != null)
            network.post(this.description);
        else
            for (var network : networks)
                network.post(this.description);
    }

}
