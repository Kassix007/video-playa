package i3;

import a3.C0632k;
import a3.y;
import a3.z;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13592b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(String str, boolean z5, int i) {
        this.f13591a = i;
        this.f13592b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        if (((HashSet) yVar.f8887B.f14122r).contains(z.f8930q)) {
            return new c3.m(this);
        }
        n3.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.f13591a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}
