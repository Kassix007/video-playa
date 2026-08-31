package f2;

import C0.S;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: f2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1062b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12701e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1062b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        m.e(columnNames, "columnNames");
        m.e(referenceColumnNames, "referenceColumnNames");
        this.f12697a = str;
        this.f12698b = str2;
        this.f12699c = str3;
        this.f12700d = columnNames;
        this.f12701e = referenceColumnNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1062b)) {
            return false;
        }
        C1062b c1062b = (C1062b) obj;
        if (m.a(this.f12697a, c1062b.f12697a) && m.a(this.f12698b, c1062b.f12698b) && m.a(this.f12699c, c1062b.f12699c) && m.a(this.f12700d, c1062b.f12700d)) {
            return m.a(this.f12701e, c1062b.f12701e);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12701e.hashCode() + ((this.f12700d.hashCode() + S.h(this.f12699c, S.h(this.f12698b, this.f12697a.hashCode() * 31, 31), 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f12697a + "', onDelete='" + this.f12698b + " +', onUpdate='" + this.f12699c + "', columnNames=" + this.f12700d + ", referenceColumnNames=" + this.f12701e + '}';
    }
}
