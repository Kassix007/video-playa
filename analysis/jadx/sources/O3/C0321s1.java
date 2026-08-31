package O3;

/* JADX INFO: renamed from: O3.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0321s1 extends AbstractC0308o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5048e;
    public final /* synthetic */ C0333w1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0321s1(C0333w1 c0333w1, C0323t0 c0323t0, int i) {
        super(c0323t0);
        this.f5048e = i;
        this.f = c0333w1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.AbstractC0308o
    public final void a() {
        switch (this.f5048e) {
            case 0:
                C0333w1 c0333w1 = this.f;
                c0333w1.o();
                if (c0333w1.F()) {
                    X x6 = ((C0323t0) c0333w1.f4346r).f5077v;
                    C0323t0.l(x6);
                    x6.f4666E.b("Inactivity, disconnecting from the service");
                    c0333w1.w();
                    break;
                }
                break;
            default:
                X x7 = ((C0323t0) this.f.f4346r).f5077v;
                C0323t0.l(x7);
                x7.f4673z.b("Tasks have been queued for a long time");
                break;
        }
    }
}
