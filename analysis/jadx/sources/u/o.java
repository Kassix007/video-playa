package U;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f7520t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7520t) {
            case 0:
                int i = this.f7519s;
                this.f7519s = i + 2;
                Object[] objArr = this.f7517q;
                return new a(0, objArr[i], objArr[i + 1]);
            case 1:
                int i7 = this.f7519s;
                this.f7519s = i7 + 2;
                return this.f7517q[i7];
            default:
                int i8 = this.f7519s;
                this.f7519s = i8 + 2;
                return this.f7517q[i8 + 1];
        }
    }
}
