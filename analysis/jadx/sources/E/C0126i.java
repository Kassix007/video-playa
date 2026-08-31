package E;

import z.AbstractC1923a;

/* JADX INFO: renamed from: E.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0126i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0134q f1569c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0126i(int i, int i7, InterfaceC0134q interfaceC0134q) {
        this.f1567a = i;
        this.f1568b = i7;
        this.f1569c = interfaceC0134q;
        if (i < 0) {
            AbstractC1923a.a("startIndex should be >= 0");
        }
        if (i7 > 0) {
            return;
        }
        AbstractC1923a.a("size should be > 0");
    }
}
