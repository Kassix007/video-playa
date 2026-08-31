package e3;

import M5.C0252m;
import P.C;
import P.C0345b;
import P.C0354f0;
import P.S0;
import a3.C0632k;

/* JADX INFO: loaded from: classes.dex */
public final class o implements S0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0252m f12605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0354f0 f12606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0354f0 f12607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C f12608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C f12609u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o() {
        C0252m c0252m = new C0252m(true);
        c0252m.I(null);
        this.f12605q = c0252m;
        this.f12606r = C0345b.q(null);
        this.f12607s = C0345b.q(null);
        C0345b.m(new n(this, 2));
        this.f12608t = C0345b.m(new n(this, 0));
        C0345b.m(new n(this, 1));
        this.f12609u = C0345b.m(new n(this, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        return (C0632k) this.f12606r.getValue();
    }
}
