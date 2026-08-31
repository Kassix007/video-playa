package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class StartStopToken {
    private final WorkGenerationalId id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StartStopToken(WorkGenerationalId id) {
        m.e(id, "id");
        this.id = id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WorkGenerationalId getId() {
        return this.id;
    }
}
