package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends t implements H5.j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.d
    public H5.b computeReflected() {
        z.f14269a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H5.j
    public Object getDelegate(Object obj) {
        return ((H5.j) getReflected()).getDelegate(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ /* synthetic */ H5.g getGetter() {
        mo20getGetter();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // H5.j
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public H5.i mo20getGetter() {
        ((H5.j) getReflected()).mo20getGetter();
        return null;
    }
}
