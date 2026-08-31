package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0737a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f10482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0741c0 f10483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0741c0 f10484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0741c0 f10485d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f10482a = cls;
        f10483b = b(false);
        f10484c = b(true);
        f10485d = new C0741c0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(C0741c0 c0741c0, Object obj, Object obj2) {
        c0741c0.getClass();
        AbstractC0764x abstractC0764x = (AbstractC0764x) obj;
        C0739b0 c0739b0 = abstractC0764x.zzjp;
        C0739b0 c0739b02 = ((AbstractC0764x) obj2).zzjp;
        if (!c0739b02.equals(C0739b0.f10493e)) {
            int i = c0739b0.f10494a + c0739b02.f10494a;
            int[] iArrCopyOf = Arrays.copyOf(c0739b0.f10495b, i);
            System.arraycopy(c0739b02.f10495b, 0, iArrCopyOf, c0739b0.f10494a, c0739b02.f10494a);
            Object[] objArrCopyOf = Arrays.copyOf(c0739b0.f10496c, i);
            System.arraycopy(c0739b02.f10496c, 0, objArrCopyOf, c0739b0.f10494a, c0739b02.f10494a);
            c0739b0 = new C0739b0(i, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC0764x.zzjp = c0739b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0741c0 b(boolean z5) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (C0741c0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z5));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
