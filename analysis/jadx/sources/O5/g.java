package O5;

import M5.InterfaceC0245f;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f5230a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5231b = R5.b.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5232c = R5.b.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E4.f f5233d = new E4.f("BUFFERED", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E4.f f5234e = new E4.f("SHOULD_BUFFER", 1);
    public static final E4.f f = new E4.f("S_RESUMING_BY_RCV", 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final E4.f f5235g = new E4.f("RESUMING_BY_EB", 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E4.f f5236h = new E4.f("POISONED", 1);
    public static final E4.f i = new E4.f("DONE_RCV", 1);
    public static final E4.f j = new E4.f("INTERRUPTED_SEND", 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final E4.f f5237k = new E4.f("INTERRUPTED_RCV", 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final E4.f f5238l = new E4.f("CHANNEL_CLOSED", 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final E4.f f5239m = new E4.f("SUSPEND", 1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final E4.f f5240n = new E4.f("SUSPEND_NO_WAITER", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final E4.f f5241o = new E4.f("FAILED", 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final E4.f f5242p = new E4.f("NO_RECEIVE_RESULT", 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final E4.f f5243q = new E4.f("CLOSE_HANDLER_CLOSED", 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final E4.f f5244r = new E4.f("CLOSE_HANDLER_INVOKED", 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final E4.f f5245s = new E4.f("NO_CLOSE_CAUSE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(InterfaceC0245f interfaceC0245f, Object obj, B5.f fVar) {
        E4.f fVarO = interfaceC0245f.o(obj, fVar);
        if (fVarO == null) {
            return false;
        }
        interfaceC0245f.q(fVarO);
        return true;
    }
}
