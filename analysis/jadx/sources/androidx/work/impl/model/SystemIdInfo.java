package androidx.work.impl.model;

import C0.S;
import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class SystemIdInfo {
    private final int generation;
    public final int systemId;
    public final String workSpecId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SystemIdInfo(String workSpecId, int i, int i7) {
        m.e(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i;
        this.systemId = i7;
    }

    public static /* synthetic */ SystemIdInfo copy$default(SystemIdInfo systemIdInfo, String str, int i, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = systemIdInfo.workSpecId;
        }
        if ((i8 & 2) != 0) {
            i = systemIdInfo.generation;
        }
        if ((i8 & 4) != 0) {
            i7 = systemIdInfo.systemId;
        }
        return systemIdInfo.copy(str, i, i7);
    }

    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final int component3() {
        return this.systemId;
    }

    public final SystemIdInfo copy(String workSpecId, int i, int i7) {
        m.e(workSpecId, "workSpecId");
        return new SystemIdInfo(workSpecId, i, i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        return m.a(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getGeneration() {
        return this.generation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Integer.hashCode(this.systemId) + i.c(this.generation, this.workSpecId.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.workSpecId);
        sb.append(", generation=");
        sb.append(this.generation);
        sb.append(", systemId=");
        return S.o(sb, this.systemId, ')');
    }
}
