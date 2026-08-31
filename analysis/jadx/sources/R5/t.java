package R5;

import a.AbstractC0597a;
import m5.AbstractC1362a;
import m5.AbstractC1374m;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7269a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object objB;
        Object objB2;
        Exception exc = new Exception();
        String simpleName = AbstractC0597a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objB = s5.a.class.getCanonicalName();
        } catch (Throwable th) {
            objB = AbstractC1362a.b(th);
        }
        if (AbstractC1374m.a(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objB2 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            objB2 = AbstractC1362a.b(th2);
        }
        if (AbstractC1374m.a(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
