package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.internal.measurement.P1;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0738b {
    public static final Object f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f10486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Boolean f10487h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0746f f10488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C0736a f10492e = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0738b(C0746f c0746f, String str, Object obj) {
        c0746f.getClass();
        if (c0746f.f10501a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f10488a = c0746f;
        String strValueOf = String.valueOf(c0746f.f10502b);
        this.f10490c = str.length() != 0 ? strValueOf.concat(str) : new String(strValueOf);
        String strValueOf2 = String.valueOf(c0746f.f10503c);
        this.f10489b = str.length() != 0 ? strValueOf2.concat(str) : new String(strValueOf2);
        this.f10491d = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object b(InterfaceC0744e interfaceC0744e) {
        try {
            return interfaceC0744e.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC0744e.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean d() {
        if (f10487h == null) {
            Context context = f10486g;
            if (context == null) {
                return false;
            }
            f10487h = Boolean.valueOf(P1.i(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null) == 0);
        }
        return f10487h.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() {
        /*
            r6 = this;
            android.content.Context r0 = com.google.android.gms.internal.clearcut.AbstractC0738b.f10486g
            if (r0 == 0) goto Ld0
            com.google.android.gms.internal.clearcut.f r0 = r6.f10488a
            r0.getClass()
            boolean r0 = d()
            r1 = 0
            if (r0 == 0) goto L23
            E1.t r0 = new E1.t
            r2 = 0
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            r0.<init>(r3, r2)
            java.lang.Object r0 = b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L24
        L23:
            r0 = r1
        L24:
            r2 = 0
            if (r0 != 0) goto L74
            com.google.android.gms.internal.clearcut.f r0 = r6.f10488a
            android.net.Uri r0 = r0.f10501a
            if (r0 == 0) goto L91
            com.google.android.gms.internal.clearcut.a r0 = r6.f10492e
            if (r0 != 0) goto L5f
            android.content.Context r0 = com.google.android.gms.internal.clearcut.AbstractC0738b.f10486g
            android.content.ContentResolver r0 = r0.getContentResolver()
            com.google.android.gms.internal.clearcut.f r3 = r6.f10488a
            android.net.Uri r3 = r3.f10501a
            java.util.concurrent.ConcurrentHashMap r4 = com.google.android.gms.internal.clearcut.C0736a.f10475h
            java.lang.Object r5 = r4.get(r3)
            com.google.android.gms.internal.clearcut.a r5 = (com.google.android.gms.internal.clearcut.C0736a) r5
            if (r5 != 0) goto L5d
            com.google.android.gms.internal.clearcut.a r5 = new com.google.android.gms.internal.clearcut.a
            r5.<init>(r0, r3)
            java.lang.Object r0 = r4.putIfAbsent(r3, r5)
            com.google.android.gms.internal.clearcut.a r0 = (com.google.android.gms.internal.clearcut.C0736a) r0
            if (r0 != 0) goto L5c
            android.content.ContentResolver r0 = r5.f10476a
            android.net.Uri r3 = r5.f10477b
            C0.r1 r4 = r5.f10478c
            r0.registerContentObserver(r3, r1, r4)
            goto L5d
        L5c:
            r5 = r0
        L5d:
            r6.f10492e = r5
        L5f:
            com.google.android.gms.internal.clearcut.a r0 = r6.f10492e
            Z.m r1 = new Z.m
            r3 = 3
            r1.<init>(r3, r6, r0)
            java.lang.Object r0 = b(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L91
            java.lang.Object r2 = r6.c(r0)
            goto L91
        L74:
            java.lang.String r0 = r6.f10489b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r3 = "Bypass reading Phenotype values for flag: "
            if (r1 == 0) goto L87
            java.lang.String r0 = r3.concat(r0)
            goto L8c
        L87:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L8c:
            java.lang.String r1 = "PhenotypeFlag"
            android.util.Log.w(r1, r0)
        L91:
            if (r2 == 0) goto L94
            return r2
        L94:
            java.lang.String r0 = r6.f10490c
            com.google.android.gms.internal.clearcut.f r1 = r6.f10488a
            r1.getClass()
            boolean r1 = d()
            if (r1 == 0) goto Lc9
            android.content.Context r1 = com.google.android.gms.internal.clearcut.AbstractC0738b.f10486g     // Catch: java.lang.SecurityException -> Lac
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.SecurityException -> Lac
            java.lang.String r0 = com.google.android.gms.internal.clearcut.E0.b(r1, r0)     // Catch: java.lang.SecurityException -> Lac
            goto Lbd
        Lac:
            long r1 = android.os.Binder.clearCallingIdentity()
            android.content.Context r3 = com.google.android.gms.internal.clearcut.AbstractC0738b.f10486g     // Catch: java.lang.Throwable -> Lc4
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = com.google.android.gms.internal.clearcut.E0.b(r3, r0)     // Catch: java.lang.Throwable -> Lc4
            android.os.Binder.restoreCallingIdentity(r1)
        Lbd:
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r6.c(r0)
            goto Lca
        Lc4:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)
            throw r0
        Lc9:
            r0 = 0
        Lca:
            if (r0 == 0) goto Lcd
            return r0
        Lcd:
            java.lang.Object r0 = r6.f10491d
            return r0
        Ld0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.AbstractC0738b.a():java.lang.Object");
    }

    public abstract Object c(String str);
}
