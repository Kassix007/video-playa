package F;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;

/* JADX INFO: renamed from: F.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0164s extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0151e f1919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0261w f1920s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0164s(C0151e c0151e, InterfaceC0261w interfaceC0261w, int i) {
        super(0);
        this.f1918q = i;
        this.f1919r = c0151e;
        this.f1920s = interfaceC0261w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        switch (this.f1918q) {
            case 0:
                C0151e c0151e = this.f1919r;
                if (c0151e.a()) {
                    AbstractC0263y.t(this.f1920s, null, null, new C0166u(c0151e, null), 3);
                    z5 = true;
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 1:
                C0151e c0151e2 = this.f1919r;
                if (c0151e2.c()) {
                    AbstractC0263y.t(this.f1920s, null, null, new v(c0151e2, null), 3);
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 2:
                C0151e c0151e3 = this.f1919r;
                if (c0151e3.a()) {
                    AbstractC0263y.t(this.f1920s, null, null, new C0166u(c0151e3, null), 3);
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            default:
                C0151e c0151e4 = this.f1919r;
                if (c0151e4.c()) {
                    AbstractC0263y.t(this.f1920s, null, null, new v(c0151e4, null), 3);
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
        }
    }
}
