package androidx.work;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class InputMergerKt {
    private static final String TAG;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String strTagWithPrefix = Logger.tagWithPrefix("InputMerger");
        m.d(strTagWithPrefix, "tagWithPrefix(\"InputMerger\")");
        TAG = strTagWithPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InputMerger fromClassName(String className) {
        m.e(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            m.c(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (InputMerger) objNewInstance;
        } catch (Exception e7) {
            Logger.get().error(TAG, "Trouble instantiating ".concat(className), e7);
            return null;
        }
    }
}
