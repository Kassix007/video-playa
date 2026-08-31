package H;

import W0.l;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import i0.C1131c;
import i0.C1132d;
import i0.C1133e;
import j0.AbstractC1145B;
import j0.E;
import j0.y;
import j0.z;
import kotlin.jvm.internal.m;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements E {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f2027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f2028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f2029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f2030t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f2027q = aVar;
        this.f2028r = aVar2;
        this.f2029s = aVar3;
        this.f2030t = aVar4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d a(d dVar, b bVar, b bVar2, b bVar3, int i) {
        a aVar = bVar;
        if ((i & 1) != 0) {
            aVar = dVar.f2027q;
        }
        a aVar2 = dVar.f2028r;
        a aVar3 = bVar2;
        if ((i & 4) != 0) {
            aVar3 = dVar.f2029s;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, bVar3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.E
    public final AbstractC1145B e(long j, l lVar, W0.c cVar) {
        float fA = this.f2027q.a(j, cVar);
        float fA2 = this.f2028r.a(j, cVar);
        float fA3 = this.f2029s.a(j, cVar);
        float fA4 = this.f2030t.a(j, cVar);
        float fC = C1133e.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f7 = fC / f;
            fA *= f7;
            fA4 *= f7;
        }
        float f8 = fA2 + fA3;
        if (f8 > fC) {
            float f9 = fC / f8;
            fA2 *= f9;
            fA3 *= f9;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            AbstractC1923a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new y(AbstractC0836n2.c(0L, j));
        }
        C1131c c1131cC = AbstractC0836n2.c(0L, j);
        l lVar2 = l.f8022q;
        float f10 = lVar == lVar2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
        if (lVar == lVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f11 = lVar == lVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
        if (lVar != lVar2) {
            fA4 = fA3;
        }
        return new z(new C1132d(c1131cC.f13522a, c1131cC.f13523b, c1131cC.f13524c, c1131cC.f13525d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.f2027q, dVar.f2027q) && m.a(this.f2028r, dVar.f2028r) && m.a(this.f2029s, dVar.f2029s) && m.a(this.f2030t, dVar.f2030t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2030t.hashCode() + ((this.f2029s.hashCode() + ((this.f2028r.hashCode() + (this.f2027q.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f2027q + ", topEnd = " + this.f2028r + ", bottomEnd = " + this.f2029s + ", bottomStart = " + this.f2030t + ')';
    }
}
