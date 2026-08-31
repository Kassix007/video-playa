package C;

import E.InterfaceC0132o;
import java.util.Collection;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0132o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f599a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(A a7) {
        this.f599a = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final int a() {
        return this.f599a.g().f667n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // E.InterfaceC0132o
    public final int b() {
        return Math.min(a() - 1, ((t) n5.l.r0(this.f599a.g().f664k)).f671a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final boolean c() {
        return !((Collection) this.f599a.g().f664k).isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    @Override // E.InterfaceC0132o
    public final int d() {
        int i;
        A a7 = this.f599a;
        if (a7.g().f664k.isEmpty()) {
            return 0;
        }
        s sVarG = a7.g();
        int iG = (int) (sVarG.f668o == EnumC1778d0.f17945q ? sVarG.g() & 4294967295L : sVarG.g() >> 32);
        s sVarG2 = a7.g();
        ?? r3 = sVarG2.f664k;
        int size = ((Collection) r3).size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((t) r3.get(i8)).f678k;
        }
        int size2 = (i7 / r3.size()) + sVarG2.f670q;
        if (size2 != 0 && (i = iG / size2) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.InterfaceC0132o
    public final int e() {
        return Math.max(0, this.f599a.f566d.f685b.e());
    }
}
