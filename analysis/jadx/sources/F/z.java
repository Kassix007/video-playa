package F;

import a.AbstractC0597a;
import c0.C0714b;
import c0.C0715c;
import c0.C0716d;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ E.A f1935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f1936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f1937t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f1938u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0716d f1939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1940w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(E.A a7, long j, x xVar, long j7, C0716d c0716d, int i, int i7) {
        super(1);
        this.f1934q = i7;
        switch (i7) {
            case 1:
                this.f1935r = a7;
                this.f1936s = j;
                this.f1937t = xVar;
                this.f1938u = j7;
                this.f1939v = c0716d;
                this.f1940w = i;
                super(1);
                break;
            default:
                this.f1935r = a7;
                this.f1936s = j;
                this.f1937t = xVar;
                this.f1938u = j7;
                this.f1939v = c0716d;
                this.f1940w = i;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f1934q) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C0715c c0715c = C0714b.f10074C;
                E.A a7 = this.f1935r;
                return AbstractC0597a.z(a7, iIntValue, this.f1936s, this.f1937t, this.f1938u, EnumC1778d0.f17946r, c0715c, this.f1939v, a7.f1471r.getLayoutDirection(), false, this.f1940w);
            default:
                int iIntValue2 = ((Number) obj).intValue();
                C0715c c0715c2 = C0714b.f10074C;
                E.A a8 = this.f1935r;
                return AbstractC0597a.z(a8, iIntValue2, this.f1936s, this.f1937t, this.f1938u, EnumC1778d0.f17946r, c0715c2, this.f1939v, a8.f1471r.getLayoutDirection(), false, this.f1940w);
        }
    }
}
