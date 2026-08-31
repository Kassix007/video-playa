package F;

import M5.AbstractC0263y;
import q5.C1530i;
import w.EnumC1778d0;
import x.C1881m;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f1843a = 56;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f1844b = new B(0, 0, 0, 0, 0, C1881m.f18325a, new O(), AbstractC0263y.a(C1530i.f16022q));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P f1845c = new P();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(B b7, int i) {
        long j = (((((long) i) * ((long) (b7.f1762c + b7.f1761b))) + ((long) (-b7.f))) + ((long) b7.f1763d)) - ((long) b7.f1762c);
        EnumC1778d0 enumC1778d0 = b7.f1764e;
        EnumC1778d0 enumC1778d02 = EnumC1778d0.f17946r;
        long jG = b7.g();
        int i7 = (int) (enumC1778d0 == enumC1778d02 ? jG >> 32 : jG & 4294967295L);
        b7.f1769m.getClass();
        long jQ = j - ((long) (i7 - D5.a.q(0, 0, i7)));
        if (jQ < 0) {
            return 0L;
        }
        return jQ;
    }
}
