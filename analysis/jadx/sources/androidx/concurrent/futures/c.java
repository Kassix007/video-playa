package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Throwable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9354q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i) {
        super(str);
        this.f9354q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.f9354q;
        synchronized (this) {
            switch (i) {
            }
            return this;
        }
    }
}
