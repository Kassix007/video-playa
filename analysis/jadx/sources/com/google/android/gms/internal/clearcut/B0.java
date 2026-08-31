package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f10377b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0746f f10378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0746f f10379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f10380e;
    public static final HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f10381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Long f10382h;
    public static final C0740c i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10383a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String strValueOf = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        C0746f c0746f = new C0746f(Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/")), "gms:playlog:service:samplingrules_", "LogSamplingRules__");
        f10378c = c0746f;
        String strValueOf2 = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        f10379d = new C0746f(Uri.parse(strValueOf2.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf2) : new String("content://com.google.android.gms.phenotype/")), "gms:playlog:service:sampling_", "LogSampling__");
        f10380e = new ConcurrentHashMap();
        f = new HashMap();
        f10381g = null;
        f10382h = null;
        i = new C0740c(c0746f, "enable_log_sampling_rules", Boolean.FALSE, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B0(Context context) {
        Context applicationContext;
        this.f10383a = context;
        if (context == null || AbstractC0738b.f10486g != null) {
            return;
        }
        synchronized (AbstractC0738b.f) {
            try {
                if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (AbstractC0738b.f10486g != context) {
                    AbstractC0738b.f10487h = null;
                }
                AbstractC0738b.f10486g = context;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return l0.h(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(f10377b);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.putLong(j);
        return l0.h(byteBufferAllocate.array());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(long j, long j7, long j8) {
        if (j7 < 0 || j8 <= 0) {
            return true;
        }
        if (j < 0) {
            j = ((j & Long.MAX_VALUE) % j8) + (Long.MAX_VALUE % j8) + 1;
        }
        return j % j8 < j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c(Context context) {
        if (f10381g == null) {
            f10381g = Boolean.valueOf(C3.c.a(context).f1185a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f10381g.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long d(Context context) {
        Object obj;
        long jLongValue = 0;
        if (f10382h == null) {
            if (context == null) {
                return 0L;
            }
            if (c(context)) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = E0.f10406a;
                synchronized (E0.class) {
                    E0.c(contentResolver);
                    obj = E0.f10413k;
                }
                HashMap map = E0.i;
                Long lValueOf = (Long) E0.a(map, "android_id", 0L);
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    String strB = E0.b(contentResolver, "android_id");
                    if (strB != null) {
                        try {
                            long j = Long.parseLong(strB);
                            lValueOf = Long.valueOf(j);
                            jLongValue = j;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    E0.d(obj, map, "android_id", lValueOf);
                }
                f10382h = Long.valueOf(jLongValue);
            } else {
                f10382h = 0L;
            }
        }
        return f10382h.longValue();
    }
}
