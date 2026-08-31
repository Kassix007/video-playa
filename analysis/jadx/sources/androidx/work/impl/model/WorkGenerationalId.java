package androidx.work.impl.model;

import C0.S;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WorkGenerationalId {
    private final int generation;
    private final String workSpecId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkGenerationalId(String workSpecId, int i) {
        m.e(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i;
    }

    public static /* synthetic */ WorkGenerationalId copy$default(WorkGenerationalId workGenerationalId, String str, int i, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = workGenerationalId.workSpecId;
        }
        if ((i7 & 2) != 0) {
            i = workGenerationalId.generation;
        }
        return workGenerationalId.copy(str, i);
    }

    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final WorkGenerationalId copy(String workSpecId, int i) {
        m.e(workSpecId, "workSpecId");
        return new WorkGenerationalId(workSpecId, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
        return m.a(this.workSpecId, workGenerationalId.workSpecId) && this.generation == workGenerationalId.generation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getGeneration() {
        return this.generation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    public int hashCode() {
        return Integer.hashCode(this.generation) + (this.workSpecId.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.workSpecId);
        sb.append(", generation=");
        return S.o(sb, this.generation, ')');
    }
}
