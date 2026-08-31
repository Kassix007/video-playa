package androidx.work.impl.model;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WorkName {
    private final String name;
    private final String workSpecId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkName(String name, String workSpecId) {
        m.e(name, "name");
        m.e(workSpecId, "workSpecId");
        this.name = name;
        this.workSpecId = workSpecId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
