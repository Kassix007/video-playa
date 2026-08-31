package M5;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends CancellationException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient i0 f3841q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c0(String str, Throwable th, i0 i0Var) {
        super(str);
        this.f3841q = i0Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!kotlin.jvm.internal.m.a(c0Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c0Var.f3841q;
        if (obj2 == null) {
            obj2 = l0.f3870q;
        }
        Object obj3 = this.f3841q;
        if (obj3 == null) {
            obj3 = l0.f3870q;
        }
        return kotlin.jvm.internal.m.a(obj2, obj3) && kotlin.jvm.internal.m.a(c0Var.getCause(), getCause());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.m.b(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f3841q;
        if (obj == null) {
            obj = l0.f3870q;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f3841q;
        if (obj == null) {
            obj = l0.f3870q;
        }
        sb.append(obj);
        return sb.toString();
    }
}
