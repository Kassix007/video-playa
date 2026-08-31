package androidx.work.impl.model;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WorkSpecKt {
    private static final long NOT_ENQUEUED = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WorkGenerationalId generationalId(WorkSpec workSpec) {
        m.e(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.id, workSpec.getGeneration());
    }
}
