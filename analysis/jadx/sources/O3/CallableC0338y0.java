package O3;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: O3.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0338y0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0 f5160e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ CallableC0338y0(C0 c02, String str, String str2, String str3, int i) {
        this.f5156a = i;
        this.f5157b = str;
        this.f5158c = str2;
        this.f5159d = str3;
        this.f5160e = c02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5156a) {
            case 0:
                C0 c02 = this.f5160e;
                c02.f4330c.A();
                C0305n c0305n = c02.f4330c.f4609s;
                T1.S(c0305n);
                return c0305n.m0(this.f5157b, this.f5158c, this.f5159d);
            case 1:
                C0 c03 = this.f5160e;
                c03.f4330c.A();
                C0305n c0305n2 = c03.f4330c.f4609s;
                T1.S(c0305n2);
                return c0305n2.m0(this.f5157b, this.f5158c, this.f5159d);
            case 2:
                C0 c04 = this.f5160e;
                c04.f4330c.A();
                C0305n c0305n3 = c04.f4330c.f4609s;
                T1.S(c0305n3);
                return c0305n3.q0(this.f5157b, this.f5158c, this.f5159d);
            default:
                C0 c05 = this.f5160e;
                c05.f4330c.A();
                C0305n c0305n4 = c05.f4330c.f4609s;
                T1.S(c0305n4);
                return c0305n4.q0(this.f5157b, this.f5158c, this.f5159d);
        }
    }
}
