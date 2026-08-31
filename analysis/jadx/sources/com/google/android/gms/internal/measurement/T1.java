package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class T1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f10705g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile L1 f10706h;
    public static final AtomicInteger i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4.c f10707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f10710d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f10711e;
    public final /* synthetic */ int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ T1(c4.c cVar, String str, Object obj, int i7) {
        this.f = i7;
        if (((Uri) cVar.f10240r) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f10707a = cVar;
        this.f10708b = str;
        this.f10709c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(Object obj) {
        switch (this.f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String string = obj.toString();
                    String str = this.f10708b;
                    StringBuilder sb = new StringBuilder(str.length() + 25 + string.length());
                    sb.append("Invalid long value for ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(string);
                    Log.e("PhenotypeFlag", sb.toString());
                }
                break;
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!H1.f10641b.matcher(str2).matches()) {
                            if (H1.f10642c.matcher(str2).matches()) {
                            }
                        }
                    }
                    String string2 = obj.toString();
                    String str3 = this.f10708b;
                    StringBuilder sb2 = new StringBuilder(str3.length() + 28 + string2.length());
                    sb2.append("Invalid boolean value for ");
                    sb2.append(str3);
                    sb2.append(": ");
                    sb2.append(string2);
                    Log.e("PhenotypeFlag", sb2.toString());
                    break;
                }
                break;
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String string3 = obj.toString();
                        String str4 = this.f10708b;
                        StringBuilder sb3 = new StringBuilder(str4.length() + 27 + string3.length());
                        sb3.append("Invalid double value for ");
                        sb3.append(str4);
                        sb3.append(": ");
                        sb3.append(string3);
                        Log.e("PhenotypeFlag", sb3.toString());
                    }
                }
                break;
            default:
                if (obj instanceof String) {
                }
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[PHI: r2
  0x0058: PHI (r2v1 G4.b) = (r2v0 G4.b), (r2v5 G4.b), (r2v5 G4.b) binds: [B:8:0x0014, B:10:0x0022, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:26:0x0062, B:28:0x006a, B:30:0x0072, B:33:0x0082, B:35:0x0090, B:47:0x00b5, B:50:0x00bd, B:51:0x00c0, B:52:0x00c4, B:39:0x0099, B:41:0x009d, B:43:0x00ab, B:45:0x00b1, B:53:0x00c9, B:54:0x00cb, B:55:0x00cc, B:56:0x00d1, B:14:0x0041, B:57:0x00d2), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:26:0x0062, B:28:0x006a, B:30:0x0072, B:33:0x0082, B:35:0x0090, B:47:0x00b5, B:50:0x00bd, B:51:0x00c0, B:52:0x00c4, B:39:0x0099, B:41:0x009d, B:43:0x00ab, B:45:0x00b1, B:53:0x00c9, B:54:0x00cb, B:55:0x00cc, B:56:0x00d1, B:14:0x0041, B:57:0x00d2), top: B:63:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.T1.i
            int r0 = r0.get()
            int r1 = r9.f10710d
            if (r1 >= r0) goto Ld6
            monitor-enter(r9)
            int r1 = r9.f10710d     // Catch: java.lang.Throwable -> L55
            if (r1 >= r0) goto Ld2
            com.google.android.gms.internal.measurement.L1 r1 = com.google.android.gms.internal.measurement.T1.f10706h     // Catch: java.lang.Throwable -> L55
            G4.a r2 = G4.a.f2004q     // Catch: java.lang.Throwable -> L55
            r3 = 0
            if (r1 == 0) goto L58
            G4.d r2 = r1.f10655b     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L55
            G4.b r2 = (G4.b) r2     // Catch: java.lang.Throwable -> L55
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L58
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.N1 r4 = (com.google.android.gms.internal.measurement.N1) r4     // Catch: java.lang.Throwable -> L55
            c4.c r5 = r9.f10707a     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = r5.f10240r     // Catch: java.lang.Throwable -> L55
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r9.f10708b     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L41
            r.Q r4 = r4.f10676a     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L55
            r.Q r4 = (r.Q) r4     // Catch: java.lang.Throwable -> L55
            goto L45
        L41:
            r4.getClass()     // Catch: java.lang.Throwable -> L55
            r4 = r3
        L45:
            if (r4 != 0) goto L48
            goto L58
        L48:
            java.lang.String r5 = ""
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r0 = move-exception
            goto Ld4
        L58:
            r4 = r3
        L59:
            if (r1 == 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            if (r5 == 0) goto Lcc
            c4.c r5 = r9.f10707a     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.f10240r     // Catch: java.lang.Throwable -> L55
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto Lc9
            android.content.Context r7 = r1.f10654a     // Catch: java.lang.Throwable -> L55
            boolean r7 = com.google.android.gms.internal.measurement.Q1.a(r7, r6)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L7f
            android.content.Context r7 = r1.f10654a     // Catch: java.lang.Throwable -> L55
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.U1 r8 = com.google.android.gms.internal.measurement.U1.f10713q     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.M1 r6 = com.google.android.gms.internal.measurement.M1.a(r7, r6, r8)     // Catch: java.lang.Throwable -> L55
            goto L80
        L7f:
            r6 = r3
        L80:
            if (r6 == 0) goto L95
            java.lang.String r7 = r9.f10708b     // Catch: java.lang.Throwable -> L55
            java.util.Map r6 = r6.b()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L95
            java.lang.Object r6 = r9.a(r6)     // Catch: java.lang.Throwable -> L55
            goto L96
        L95:
            r6 = r3
        L96:
            if (r6 == 0) goto L99
            goto Lb5
        L99:
            boolean r5 = r5.f10239q     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto Laf
            android.content.Context r1 = r1.f10654a     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.O1 r1 = com.google.android.gms.internal.measurement.O1.d(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r9.f10708b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.f(r5)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto Laf
            java.lang.Object r3 = r9.a(r1)     // Catch: java.lang.Throwable -> L55
        Laf:
            if (r3 != 0) goto Lb4
            java.lang.Object r6 = r9.f10709c     // Catch: java.lang.Throwable -> L55
            goto Lb5
        Lb4:
            r6 = r3
        Lb5:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto Lc4
            if (r4 != 0) goto Lc0
            java.lang.Object r6 = r9.f10709c     // Catch: java.lang.Throwable -> L55
            goto Lc4
        Lc0:
            java.lang.Object r6 = r9.a(r4)     // Catch: java.lang.Throwable -> L55
        Lc4:
            r9.f10711e = r6     // Catch: java.lang.Throwable -> L55
            r9.f10710d = r0     // Catch: java.lang.Throwable -> L55
            goto Ld2
        Lc9:
            android.content.Context r0 = r1.f10654a     // Catch: java.lang.Throwable -> L55
            throw r3     // Catch: java.lang.Throwable -> L55
        Lcc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L55
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        Ld2:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L55
            goto Ld6
        Ld4:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L55
            throw r0
        Ld6:
            java.lang.Object r0 = r9.f10711e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.T1.b():java.lang.Object");
    }
}
