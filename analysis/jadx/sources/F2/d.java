package f2;

import J5.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12709d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x0031 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public d(String str, boolean z5, List columns, List orders) {
        m.e(columns, "columns");
        m.e(orders, "orders");
        this.f12706a = str;
        this.f12707b = z5;
        this.f12708c = columns;
        this.f12709d = orders;
        List arrayList = orders;
        if (arrayList.isEmpty()) {
            int size = columns.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
        }
        this.f12709d = (List) arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            boolean z5 = dVar.f12707b;
            String str = dVar.f12706a;
            if (this.f12707b == z5 && m.a(this.f12708c, dVar.f12708c) && m.a(this.f12709d, dVar.f12709d)) {
                String str2 = this.f12706a;
                return t.G0(str2, "index_", false) ? t.G0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f12706a;
        return this.f12709d.hashCode() + ((this.f12708c.hashCode() + ((((t.G0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f12707b ? 1 : 0)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Index{name='" + this.f12706a + "', unique=" + this.f12707b + ", columns=" + this.f12708c + ", orders=" + this.f12709d + "'}";
    }
}
