package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

/* JADX INFO: loaded from: classes.dex */
public class HeartBeatConsumerComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private HeartBeatConsumerComponent() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Component<?> create() {
        return Component.intoSet(new HeartBeatConsumer() { // from class: com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent.1
        }, (Class<HeartBeatConsumer>) HeartBeatConsumer.class);
    }
}
