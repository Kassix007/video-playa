package v1;

import b1.d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17512c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(int i) {
        super(i);
        this.f17512c = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b1.d
    public final Object a() {
        Object objA;
        synchronized (this.f17512c) {
            objA = super.a();
        }
        return objA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b1.d
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f17512c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
