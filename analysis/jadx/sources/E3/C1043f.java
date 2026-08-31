package e3;

import P.C0354f0;
import a3.C0632k;

/* JADX INFO: renamed from: e3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1043f extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1044g f12568r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1043f(C1044g c1044g, int i) {
        super(0);
        this.f12567q = i;
        this.f12568r = c1044g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f12567q) {
            case 0:
                C1044g c1044g = this.f12568r;
                C0354f0 c0354f0 = c1044g.f12577u;
                float f = 0.0f;
                if (((C0632k) c1044g.f12581y.getValue()) != null) {
                    if (((Number) c1044g.f12578v.getValue()).floatValue() < 0.0f) {
                        if (c0354f0.getValue() != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        if (c0354f0.getValue() != null) {
                            throw new ClassCastException();
                        }
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            case 1:
                C1044g c1044g2 = this.f12568r;
                C0354f0 c0354f02 = c1044g2.f12578v;
                return Float.valueOf((((Boolean) c1044g2.f12576t.getValue()).booleanValue() && c1044g2.e() % 2 == 0) ? -((Number) c0354f02.getValue()).floatValue() : ((Number) c0354f02.getValue()).floatValue());
            default:
                C1044g c1044g3 = this.f12568r;
                return Boolean.valueOf(c1044g3.e() == ((Number) c1044g3.f12575s.getValue()).intValue() && ((Number) c1044g3.f12569A.getValue()).floatValue() == c1044g3.d());
        }
    }
}
