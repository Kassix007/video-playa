package com.google.android.gms.internal.vision;

import java.io.PrintStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0899b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0904d0 f11260a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0904d0 c0897a;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e7) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e7.printStackTrace(System.err);
            }
            c0897a = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new C0903d() : new C0897a(0) : new C0897a(1);
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = C0897a.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            c0897a = new C0897a(0);
        }
        f11260a = c0897a;
    }
}
