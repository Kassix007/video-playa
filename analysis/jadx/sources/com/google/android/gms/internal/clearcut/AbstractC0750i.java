package com.google.android.gms.internal.clearcut;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0750i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f10507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f10508b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f10507a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f10508b = cls2 != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a() {
        return (f10507a == null || f10508b) ? false : true;
    }
}
