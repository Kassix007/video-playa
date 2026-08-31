package C0;

import L0.C0189a;
import java.text.BreakIterator;
import java.util.ArrayList;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: C0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0069c extends AbstractC0067b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C0069c f993e;
    public static C0069c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C0069c f994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final V0.j f995h = V0.j.f7934r;
    public static final V0.j i = V0.j.f7933q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f997d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [C0.E.x(int, int, android.os.Bundle):boolean] */
    public /* synthetic */ C0069c(int i7) {
        this.f996c = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0067b
    public final int[] f(int i7) {
        int iA;
        switch (this.f996c) {
            case 0:
                int length = j().length();
                if (length <= 0 || i7 >= length) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f997d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f997d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.k("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i7);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return i(i7, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f997d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i7 = breakIterator3.following(i7);
                } while (i7 != -1);
                return null;
            case 1:
                if (j().length() <= 0 || i7 >= j().length()) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                while (!q(i7) && (!q(i7) || (i7 != 0 && q(i7 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f997d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i7 = breakIterator4.following(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f997d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i7);
                if (iFollowing2 == -1 || !p(iFollowing2)) {
                    return null;
                }
                return i(i7, iFollowing2);
            default:
                if (j().length() <= 0 || i7 >= j().length()) {
                    return null;
                }
                V0.j jVar = f995h;
                if (i7 < 0) {
                    L0.C c7 = (L0.C) this.f997d;
                    if (c7 == null) {
                        kotlin.jvm.internal.m.k("layoutResult");
                        throw null;
                    }
                    iA = c7.a(0);
                } else {
                    L0.C c8 = (L0.C) this.f997d;
                    if (c8 == null) {
                        kotlin.jvm.internal.m.k("layoutResult");
                        throw null;
                    }
                    int iA2 = c8.a(i7);
                    iA = n(iA2, jVar) == i7 ? iA2 : iA2 + 1;
                }
                L0.C c9 = (L0.C) this.f997d;
                if (c9 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                if (iA >= c9.f3079b.f1529b) {
                    return null;
                }
                return i(n(iA, jVar), n(iA, i) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0067b
    public final int[] l(int i7) {
        int iA;
        switch (this.f996c) {
            case 0:
                int length = j().length();
                if (length <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length) {
                    i7 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f997d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f997d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.k("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i7);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return i(iPreceding, i7);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f997d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i7 = breakIterator3.preceding(i7);
                } while (i7 != -1);
                return null;
            case 1:
                int length2 = j().length();
                if (length2 <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length2) {
                    i7 = length2;
                }
                while (i7 > 0 && !q(i7 - 1) && !p(i7)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f997d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i7 = breakIterator4.preceding(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f997d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i7);
                if (iPreceding2 == -1 || !q(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !q(iPreceding2 - 1)) {
                    return i(iPreceding2, i7);
                }
                return null;
            default:
                if (j().length() <= 0 || i7 <= 0) {
                    return null;
                }
                int length3 = j().length();
                V0.j jVar = i;
                if (i7 > length3) {
                    L0.C c7 = (L0.C) this.f997d;
                    if (c7 == null) {
                        kotlin.jvm.internal.m.k("layoutResult");
                        throw null;
                    }
                    iA = c7.a(j().length());
                } else {
                    L0.C c8 = (L0.C) this.f997d;
                    if (c8 == null) {
                        kotlin.jvm.internal.m.k("layoutResult");
                        throw null;
                    }
                    int iA2 = c8.a(i7);
                    iA = n(iA2, jVar) + 1 == i7 ? iA2 : iA2 - 1;
                }
                if (iA < 0) {
                    return null;
                }
                return i(n(iA, f995h), n(iA, jVar) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int n(int i7, V0.j jVar) {
        L0.C c7 = (L0.C) this.f997d;
        if (c7 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        int iC = c7.c(i7);
        L0.C c8 = (L0.C) this.f997d;
        if (c8 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        if (jVar != c8.e(iC)) {
            L0.C c9 = (L0.C) this.f997d;
            if (c9 != null) {
                return c9.c(i7);
            }
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        L0.C c10 = (L0.C) this.f997d;
        if (c10 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        E.a0 a0Var = c10.f3079b;
        a0Var.b(i7);
        ArrayList arrayList = (ArrayList) a0Var.f1532e;
        C0189a c0189a = ((L0.n) arrayList.get(AbstractC1918b.p(i7, arrayList))).f3157a;
        return (c0189a.f3099d.e(i7 - r6.f3160d) + r6.f3158b) - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o(String str) {
        switch (this.f996c) {
            case 0:
                this.f990a = str;
                BreakIterator breakIterator = (BreakIterator) this.f997d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
            default:
                this.f990a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f997d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean p(int i7) {
        if (i7 <= 0 || !q(i7 - 1)) {
            return false;
        }
        return i7 == j().length() || !q(i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean q(int i7) {
        if (i7 < 0 || i7 >= j().length()) {
            return false;
        }
        return Character.isLetterOrDigit(j().codePointAt(i7));
    }
}
