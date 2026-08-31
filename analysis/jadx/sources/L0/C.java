package L0;

import E.a0;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f3078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f3079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3082e;
    public final ArrayList f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C(B b7, a0 a0Var, long j) {
        this.f3078a = b7;
        this.f3079b = a0Var;
        this.f3080c = j;
        ArrayList arrayList = (ArrayList) a0Var.f1532e;
        float fC = 0.0f;
        this.f3081d = arrayList.isEmpty() ? 0.0f : ((n) arrayList.get(0)).f3157a.f3099d.c(0);
        if (!arrayList.isEmpty()) {
            n nVar = (n) n5.l.r0(arrayList);
            fC = nVar.f3157a.f3099d.c(r4.f - 1) + nVar.f;
        }
        this.f3082e = fC;
        this.f = (ArrayList) a0Var.f1531d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(int i) {
        a0 a0Var = this.f3079b;
        ArrayList arrayList = (ArrayList) a0Var.f1532e;
        n nVar = (n) arrayList.get(i >= ((C0192d) ((l) a0Var.f1530c).f3125b).f3106r.length() ? AbstractC0836n2.u(arrayList) : i < 0 ? 0 : AbstractC1918b.o(i, arrayList));
        return nVar.f3157a.f3099d.f3712e.getLineForOffset(nVar.a(i)) + nVar.f3160d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(float f) {
        ArrayList arrayList = (ArrayList) this.f3079b.f1532e;
        int iU = 0;
        if (f > 0.0f) {
            if (f < ((n) n5.l.r0(arrayList)).f3162g) {
                int size = arrayList.size() - 1;
                int i = 0;
                while (true) {
                    if (i > size) {
                        iU = -(i + 1);
                        break;
                    }
                    int i7 = (i + size) >>> 1;
                    n nVar = (n) arrayList.get(i7);
                    byte b7 = nVar.f > f ? (byte) 1 : nVar.f3162g <= f ? (byte) -1 : (byte) 0;
                    if (b7 >= 0) {
                        if (b7 <= 0) {
                            iU = i7;
                            break;
                        }
                        size = i7 - 1;
                    } else {
                        i = i7 + 1;
                    }
                }
            } else {
                iU = AbstractC0836n2.u(arrayList);
            }
        }
        n nVar2 = (n) arrayList.get(iU);
        int i8 = nVar2.f3159c;
        int i9 = nVar2.f3160d;
        if (i8 - nVar2.f3158b == 0) {
            return i9;
        }
        C0189a c0189a = nVar2.f3157a;
        float f7 = f - nVar2.f;
        M0.j jVar = c0189a.f3099d;
        return jVar.f3712e.getLineForVertical(((int) f7) - jVar.f3713g) + i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i) {
        a0 a0Var = this.f3079b;
        a0Var.b(i);
        ArrayList arrayList = (ArrayList) a0Var.f1532e;
        n nVar = (n) arrayList.get(AbstractC1918b.p(i, arrayList));
        C0189a c0189a = nVar.f3157a;
        return c0189a.f3099d.f3712e.getLineStart(i - nVar.f3160d) + nVar.f3158b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d(int i) {
        a0 a0Var = this.f3079b;
        a0Var.b(i);
        ArrayList arrayList = (ArrayList) a0Var.f1532e;
        n nVar = (n) arrayList.get(AbstractC1918b.p(i, arrayList));
        C0189a c0189a = nVar.f3157a;
        return c0189a.f3099d.f(i - nVar.f3160d) + nVar.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final V0.j e(int i) {
        a0 a0Var = this.f3079b;
        ArrayList arrayList = (ArrayList) a0Var.f1532e;
        l lVar = (l) a0Var.f1530c;
        boolean z5 = false;
        if (i >= 0 && i <= ((C0192d) lVar.f3125b).f3106r.length()) {
            z5 = true;
        }
        if (!z5) {
            StringBuilder sbL = k1.i.l("offset(", ") is out of bounds [0, ", i);
            sbL.append(((C0192d) lVar.f3125b).f3106r.length());
            sbL.append(']');
            Q0.a.a(sbL.toString());
        }
        n nVar = (n) arrayList.get(i == ((C0192d) ((l) a0Var.f1530c).f3125b).f3106r.length() ? AbstractC0836n2.u(arrayList) : AbstractC1918b.o(i, arrayList));
        C0189a c0189a = nVar.f3157a;
        int iA = nVar.a(i);
        M0.j jVar = c0189a.f3099d;
        return jVar.f3712e.getParagraphDirection(jVar.f3712e.getLineForOffset(iA)) == 1 ? V0.j.f7933q : V0.j.f7934r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c7 = (C) obj;
        return kotlin.jvm.internal.m.a(this.f3078a, c7.f3078a) && this.f3079b.equals(c7.f3079b) && W0.k.a(this.f3080c, c7.f3080c) && this.f3081d == c7.f3081d && this.f3082e == c7.f3082e && kotlin.jvm.internal.m.a(this.f, c7.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f.hashCode() + k1.i.b(this.f3082e, k1.i.b(this.f3081d, k1.i.d((this.f3079b.hashCode() + (this.f3078a.hashCode() * 31)) * 31, 31, this.f3080c), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f3078a + ", multiParagraph=" + this.f3079b + ", size=" + ((Object) W0.k.b(this.f3080c)) + ", firstBaseline=" + this.f3081d + ", lastBaseline=" + this.f3082e + ", placeholderRects=" + this.f + ')';
    }
}
