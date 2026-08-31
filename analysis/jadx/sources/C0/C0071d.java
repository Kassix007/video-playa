package C0;

import L0.C0189a;
import i0.C1131c;
import java.util.ArrayList;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: C0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0071d extends AbstractC0067b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C0071d f999e;
    public static final V0.j f = V0.j.f7934r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final V0.j f1000g = V0.j.f7933q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L0.C f1001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I0.m f1002d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0067b
    public final int[] f(int i) {
        int iB;
        if (j().length() <= 0 || i >= j().length()) {
            return null;
        }
        try {
            I0.m mVar = this.f1002d;
            if (mVar == null) {
                kotlin.jvm.internal.m.k("node");
                throw null;
            }
            C1131c c1131cE = mVar.e();
            int iRound = Math.round(c1131cE.f13525d - c1131cE.f13523b);
            if (i <= 0) {
                i = 0;
            }
            L0.C c7 = this.f1001c;
            if (c7 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iA = c7.a(i);
            L0.C c8 = this.f1001c;
            if (c8 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            float fD = c8.d(iA) + iRound;
            L0.C c9 = this.f1001c;
            if (c9 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            if (c9 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            if (fD < c9.d(c9.f3079b.f1529b - 1)) {
                L0.C c10 = this.f1001c;
                if (c10 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                iB = c10.b(fD);
            } else {
                L0.C c11 = this.f1001c;
                if (c11 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                iB = c11.f3079b.f1529b;
            }
            return i(i, n(iB - 1, f1000g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0067b
    public final int[] l(int i) {
        int iB;
        if (j().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            I0.m mVar = this.f1002d;
            if (mVar == null) {
                kotlin.jvm.internal.m.k("node");
                throw null;
            }
            C1131c c1131cE = mVar.e();
            int iRound = Math.round(c1131cE.f13525d - c1131cE.f13523b);
            int length = j().length();
            if (length <= i) {
                i = length;
            }
            L0.C c7 = this.f1001c;
            if (c7 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iA = c7.a(i);
            L0.C c8 = this.f1001c;
            if (c8 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            float fD = c8.d(iA) - iRound;
            if (fD > 0.0f) {
                L0.C c9 = this.f1001c;
                if (c9 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                iB = c9.b(fD);
            } else {
                iB = 0;
            }
            if (i == j().length() && iB < iA) {
                iB++;
            }
            return i(n(iB, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int n(int i, V0.j jVar) {
        L0.C c7 = this.f1001c;
        if (c7 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        int iC = c7.c(i);
        L0.C c8 = this.f1001c;
        if (c8 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        if (jVar != c8.e(iC)) {
            L0.C c9 = this.f1001c;
            if (c9 != null) {
                return c9.c(i);
            }
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        L0.C c10 = this.f1001c;
        if (c10 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        E.a0 a0Var = c10.f3079b;
        a0Var.b(i);
        ArrayList arrayList = (ArrayList) a0Var.f1532e;
        C0189a c0189a = ((L0.n) arrayList.get(AbstractC1918b.p(i, arrayList))).f3157a;
        return (c0189a.f3099d.e(i - r6.f3160d) + r6.f3158b) - 1;
    }
}
