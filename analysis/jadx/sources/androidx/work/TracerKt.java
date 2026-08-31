package androidx.work;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class TracerKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> T traced(Tracer tracer, String label, B5.a block) {
        m.e(tracer, "<this>");
        m.e(label, "label");
        m.e(block, "block");
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(label);
            } catch (Throwable th) {
                if (zIsEnabled) {
                    tracer.endSection();
                }
                throw th;
            }
        }
        T t6 = (T) block.invoke();
        if (zIsEnabled) {
            tracer.endSection();
        }
        return t6;
    }
}
