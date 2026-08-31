package m;

/* JADX INFO: renamed from: m.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1343y0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1248C0 f14911r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC1343y0(C1248C0 c1248c0, int i) {
        this.f14910q = i;
        this.f14911r = c1248c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14910q) {
            case 0:
                C1325p0 c1325p0 = this.f14911r.f14639s;
                if (c1325p0 != null) {
                    c1325p0.setListSelectionHidden(true);
                    c1325p0.requestLayout();
                }
                break;
            default:
                C1248C0 c1248c0 = this.f14911r;
                C1325p0 c1325p02 = c1248c0.f14639s;
                if (c1325p02 != null && c1325p02.isAttachedToWindow() && c1248c0.f14639s.getCount() > c1248c0.f14639s.getChildCount() && c1248c0.f14639s.getChildCount() <= c1248c0.f14623C) {
                    c1248c0.f14636P.setInputMethodMode(2);
                    c1248c0.c();
                    break;
                }
                break;
        }
    }
}
