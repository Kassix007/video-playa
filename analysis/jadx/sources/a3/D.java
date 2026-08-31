package a3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0632k f8793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f8794b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(C0632k c0632k) {
        this.f8793a = c0632k;
        this.f8794b = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d5 = (D) obj;
        C0632k c0632k = this.f8793a;
        if (c0632k != null && c0632k.equals(d5.f8793a)) {
            return true;
        }
        Throwable th = this.f8794b;
        if (th == null || d5.f8794b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8793a, this.f8794b});
    }

    public D(Throwable th) {
        this.f8794b = th;
        this.f8793a = null;
    }
}
