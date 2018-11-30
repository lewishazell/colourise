package colourise.client;

import colourise.networking.protocol.Card;
import colourise.networking.protocol.Message;
import colourise.state.match.Player;

public final class MyPlayer {
    private final Player internal;

    public Player getInternal() {
        return internal;
    }

    public MyPlayer(Player internal) {
        this.internal = internal;
    }

    public Message play(int row, int column, Card card) {
        return Message.Factory.play(row, column, card);
    }
}
