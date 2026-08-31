package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ DelayMetCommandHandler f9817r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(DelayMetCommandHandler delayMetCommandHandler, int i) {
        this.f9816q = i;
        this.f9817r = delayMetCommandHandler;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.background.systemalarm.DelayMetCommandHandler.b(androidx.work.impl.background.systemalarm.DelayMetCommandHandler):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9816q) {
            case 0:
                this.f9817r.stopWork();
                break;
            default:
                this.f9817r.startWork();
                break;
        }
    }
}
