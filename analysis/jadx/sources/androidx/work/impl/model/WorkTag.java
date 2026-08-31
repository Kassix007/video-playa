package androidx.work.impl.model;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WorkTag {
    private final String tag;
    private final String workSpecId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkTag(String tag, String workSpecId) {
        m.e(tag, "tag");
        m.e(workSpecId, "workSpecId");
        this.tag = tag;
        this.workSpecId = workSpecId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
