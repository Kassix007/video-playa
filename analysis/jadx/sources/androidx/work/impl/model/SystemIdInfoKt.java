package androidx.work.impl.model;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class SystemIdInfoKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final SystemIdInfo systemIdInfo(WorkGenerationalId generationalId, int i) {
        m.e(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i);
    }
}
