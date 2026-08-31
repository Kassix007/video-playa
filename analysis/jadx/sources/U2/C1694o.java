package u2;

import java.util.Arrays;

/* JADX INFO: renamed from: u2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1694o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f17177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2.l f17178c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1694o(Object obj, t tVar, t2.l lVar) {
        this.f17176a = obj;
        this.f17177b = tVar;
        this.f17178c = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (obj instanceof C1694o) {
                C1694o c1694o = (C1694o) obj;
                Object obj2 = c1694o.f17176a;
                this.f17177b.getClass();
                Object obj3 = this.f17176a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof D2.j) && (obj2 instanceof D2.j)) {
                        D2.j jVar = (D2.j) obj3;
                        D2.j jVar2 = (D2.j) obj2;
                        if (!kotlin.jvm.internal.m.a(jVar.f1396a, jVar2.f1396a) || !jVar.f1397b.equals(jVar2.f1397b) || jVar.f1400e != jVar2.f1400e || !kotlin.jvm.internal.m.a(jVar.f1401g, jVar2.f1401g) || !kotlin.jvm.internal.m.a(jVar.i, jVar2.i) || jVar.f1403k != jVar2.f1403k || jVar.f1404l != jVar2.f1404l || jVar.f1405m != jVar2.f1405m || jVar.f1406n != jVar2.f1406n || jVar.f1407o != jVar2.f1407o || jVar.f1408p != jVar2.f1408p || jVar.f1409q != jVar2.f1409q || !jVar.f1415w.equals(jVar2.f1415w) || jVar.f1416x != jVar2.f1416x || jVar.f != jVar2.f || !jVar.f1417y.equals(jVar2.f1417y)) {
                            zA = false;
                        }
                    } else {
                        zA = kotlin.jvm.internal.m.a(obj3, obj2);
                    }
                    if (zA || !this.f17178c.equals(c1694o.f17178c)) {
                    }
                }
                zA = true;
                if (zA) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode;
        this.f17177b.getClass();
        Object obj = this.f17176a;
        if (obj instanceof D2.j) {
            D2.j jVar = (D2.j) obj;
            iHashCode = jVar.f1417y.f1435q.hashCode() + ((jVar.f.hashCode() + ((jVar.f1416x.hashCode() + ((jVar.f1415w.hashCode() + ((jVar.f1409q.hashCode() + ((jVar.f1408p.hashCode() + ((jVar.f1407o.hashCode() + k1.i.e(k1.i.e(k1.i.e(k1.i.e((((jVar.f1401g.hashCode() + ((jVar.f1400e.hashCode() + ((jVar.f1397b.hashCode() + (jVar.f1396a.hashCode() * 31)) * 923521)) * 961)) * 31) + Arrays.hashCode(jVar.i.f12360q)) * 31, 31, jVar.f1403k), 31, jVar.f1404l), 31, jVar.f1405m), 31, jVar.f1406n)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return this.f17178c.hashCode() + (iHashCode * 31);
    }
}
