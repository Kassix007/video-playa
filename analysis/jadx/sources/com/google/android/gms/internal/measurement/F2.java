package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r.C1554e;

/* JADX INFO: loaded from: classes.dex */
public final class F2 implements G4.d, J2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0841o2 f10629r = new C0841o2(3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f10630q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [O3.t0.<init>(O3.N0):void, com.google.android.gms.internal.measurement.F2.<init>(int):void, com.google.android.gms.internal.measurement.M1.b():java.util.Map] */
    public /* synthetic */ F2(Object obj) {
        this.f10630q = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J2
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((J2[]) this.f10630q)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J2
    public R2 b(Class cls) {
        for (int i = 0; i < 2; i++) {
            J2 j22 = ((J2[]) this.f10630q)[i];
            if (j22.a(cls)) {
                return j22.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public Object c() {
        M1 m12 = (M1) this.f10630q;
        ContentResolver contentResolver = m12.f10666a;
        Uri uri = m12.f10667b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, M1.i, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                Map c1554e = count <= 256 ? new C1554e(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    c1554e.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return c1554e;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e7) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e7);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(int i, Object obj, S2 s22) throws com.google.android.gms.internal.clearcut.m0 {
        Y1 y12 = (Y1) obj;
        C0801g2 c0801g2 = (C0801g2) this.f10630q;
        c0801g2.o0((i << 3) | 2);
        c0801g2.o0(y12.b(s22));
        s22.e(y12, c0801g2.f10846e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(int i, Object obj, S2 s22) throws com.google.android.gms.internal.clearcut.m0 {
        C0801g2 c0801g2 = (C0801g2) this.f10630q;
        c0801g2.e0(i, 3);
        s22.e((Y1) obj, c0801g2.f10846e);
        c0801g2.e0(i, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[Catch: all -> 0x002a, TryCatch #5 {all -> 0x002a, all -> 0x0072, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0021, B:20:0x003e, B:76:0x0187, B:15:0x002d, B:17:0x0035, B:21:0x0043, B:23:0x0049, B:24:0x004d, B:75:0x0184, B:77:0x018a, B:78:0x018d, B:79:0x018e, B:25:0x0052, B:27:0x0056, B:28:0x0063, B:30:0x0069, B:36:0x007f, B:38:0x0085, B:39:0x0091, B:62:0x0168, B:63:0x016b, B:71:0x017b, B:70:0x0178, B:72:0x017c, B:73:0x0181, B:74:0x0182, B:31:0x006f, B:35:0x0076), top: B:92:0x000f }] */
    @Override // G4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get() {
        /*
            r18 = this;
            java.lang.Object r0 = com.google.android.gms.internal.measurement.T1.f10705g
            r1 = r18
            java.lang.Object r0 = r1.f10630q
            android.content.Context r0 = (android.content.Context) r0
            G4.b r2 = com.google.android.gms.internal.measurement.P1.f10683a
            if (r2 != 0) goto L192
            java.lang.Class<com.google.android.gms.internal.measurement.P1> r3 = com.google.android.gms.internal.measurement.P1.class
            monitor-enter(r3)
            G4.b r2 = com.google.android.gms.internal.measurement.P1.f10683a     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L18e
            java.lang.String r2 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = android.os.Build.TAGS     // Catch: java.lang.Throwable -> L2a
            r.e r5 = com.google.android.gms.internal.measurement.S1.f10702a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "eng"
            boolean r5 = r2.equals(r5)     // Catch: java.lang.Throwable -> L2a
            if (r5 != 0) goto L2d
            java.lang.String r5 = "userdebug"
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L3e
            goto L2d
        L2a:
            r0 = move-exception
            goto L190
        L2d:
            java.lang.String r2 = "dev-keys"
            boolean r2 = r4.contains(r2)     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L43
            java.lang.String r2 = "test-keys"
            boolean r2 = r4.contains(r2)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L3e
            goto L43
        L3e:
            G4.a r0 = G4.a.f2004q     // Catch: java.lang.Throwable -> L2a
            r2 = r0
            goto L187
        L43:
            boolean r2 = r0.isDeviceProtectedStorage()     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L4d
            android.content.Context r0 = r0.createDeviceProtectedStorageContext()     // Catch: java.lang.Throwable -> L2a
        L4d:
            r2 = r0
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L2a
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L72
            r5 = 0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L72 java.lang.RuntimeException -> L75
            java.lang.String r6 = "phenotype_hermetic"
            java.io.File r6 = r2.getDir(r6, r5)     // Catch: java.lang.Throwable -> L72 java.lang.RuntimeException -> L75
            java.lang.String r7 = "overrides.txt"
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L72 java.lang.RuntimeException -> L75
            boolean r6 = r0.exists()     // Catch: java.lang.Throwable -> L72
            if (r6 == 0) goto L6f
            G4.c r6 = new G4.c     // Catch: java.lang.Throwable -> L72
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L72
            goto L7f
        L6f:
            G4.a r6 = G4.a.f2004q     // Catch: java.lang.Throwable -> L72
            goto L7f
        L72:
            r0 = move-exception
            goto L18a
        L75:
            r0 = move-exception
            java.lang.String r6 = "HermeticFileOverrides"
            java.lang.String r7 = "no data dir"
            android.util.Log.e(r6, r7, r0)     // Catch: java.lang.Throwable -> L72
            G4.a r6 = G4.a.f2004q     // Catch: java.lang.Throwable -> L72
        L7f:
            boolean r0 = r6.b()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L182
            java.lang.Object r0 = r6.a()     // Catch: java.lang.Throwable -> L72
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = "Parsed "
            java.lang.String r7 = " for Android package "
            java.lang.String r8 = "Invalid: "
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L171
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L171
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L171
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L171
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L171
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L171
            r.Q r10 = new r.Q     // Catch: java.lang.Throwable -> Ld5
            r10.<init>(r5)     // Catch: java.lang.Throwable -> Ld5
            java.util.HashMap r11 = new java.util.HashMap     // Catch: java.lang.Throwable -> Ld5
            r11.<init>()     // Catch: java.lang.Throwable -> Ld5
        Laa:
            java.lang.String r12 = r9.readLine()     // Catch: java.lang.Throwable -> Ld5
            if (r12 == 0) goto L130
            java.lang.String r13 = " "
            r14 = 3
            java.lang.String[] r13 = r12.split(r13, r14)     // Catch: java.lang.Throwable -> Ld5
            int r15 = r13.length     // Catch: java.lang.Throwable -> Ld5
            if (r15 == r14) goto Ld9
            java.lang.String r13 = "HermeticFileOverrides"
            int r14 = r12.length()     // Catch: java.lang.Throwable -> Ld5
            int r14 = r14 + 9
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
            r15.<init>(r14)     // Catch: java.lang.Throwable -> Ld5
            r15.append(r8)     // Catch: java.lang.Throwable -> Ld5
            r15.append(r12)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r12 = r15.toString()     // Catch: java.lang.Throwable -> Ld5
            android.util.Log.e(r13, r12)     // Catch: java.lang.Throwable -> Ld5
            goto Laa
        Ld5:
            r0 = move-exception
            r2 = r0
            goto L173
        Ld9:
            r12 = r13[r5]     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r14 = new java.lang.String     // Catch: java.lang.Throwable -> Ld5
            r14.<init>(r12)     // Catch: java.lang.Throwable -> Ld5
            r12 = 1
            r12 = r13[r12]     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r15 = new java.lang.String     // Catch: java.lang.Throwable -> Ld5
            r15.<init>(r12)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r12 = android.net.Uri.decode(r15)     // Catch: java.lang.Throwable -> Ld5
            r16 = 2
            r15 = r13[r16]     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r15 = r11.get(r15)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> Ld5
            if (r15 != 0) goto L114
            r13 = r13[r16]     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r15 = new java.lang.String     // Catch: java.lang.Throwable -> Ld5
            r15.<init>(r13)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r13 = android.net.Uri.decode(r15)     // Catch: java.lang.Throwable -> Ld5
            int r5 = r13.length()     // Catch: java.lang.Throwable -> Ld5
            r17 = r0
            r0 = 1024(0x400, float:1.435E-42)
            if (r5 < r0) goto L10f
            if (r13 != r15) goto L112
        L10f:
            r11.put(r15, r13)     // Catch: java.lang.Throwable -> Ld5
        L112:
            r15 = r13
            goto L116
        L114:
            r17 = r0
        L116:
            java.lang.Object r0 = r10.get(r14)     // Catch: java.lang.Throwable -> Ld5
            r.Q r0 = (r.Q) r0     // Catch: java.lang.Throwable -> Ld5
            if (r0 != 0) goto L128
            r.Q r0 = new r.Q     // Catch: java.lang.Throwable -> Ld5
            r5 = 0
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Ld5
            r10.put(r14, r0)     // Catch: java.lang.Throwable -> Ld5
            goto L129
        L128:
            r5 = 0
        L129:
            r0.put(r12, r15)     // Catch: java.lang.Throwable -> Ld5
            r0 = r17
            goto Laa
        L130:
            r17 = r0
            java.lang.String r0 = "HermeticFileOverrides"
            java.lang.String r5 = r17.toString()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Ld5
            int r8 = r5.length()     // Catch: java.lang.Throwable -> Ld5
            int r8 = r8 + 28
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Ld5
            int r11 = r11.length()     // Catch: java.lang.Throwable -> Ld5
            int r8 = r8 + r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
            r11.<init>(r8)     // Catch: java.lang.Throwable -> Ld5
            r11.append(r6)     // Catch: java.lang.Throwable -> Ld5
            r11.append(r5)     // Catch: java.lang.Throwable -> Ld5
            r11.append(r7)     // Catch: java.lang.Throwable -> Ld5
            r11.append(r2)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Throwable -> Ld5
            android.util.Log.w(r0, r2)     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.N1 r0 = new com.google.android.gms.internal.measurement.N1     // Catch: java.lang.Throwable -> Ld5
            r0.<init>(r10)     // Catch: java.lang.Throwable -> Ld5
            r9.close()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L171
            G4.c r2 = new G4.c     // Catch: java.lang.Throwable -> L72
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L72
            goto L184
        L171:
            r0 = move-exception
            goto L17c
        L173:
            r9.close()     // Catch: java.lang.Throwable -> L177
            goto L17b
        L177:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L171
        L17b:
            throw r2     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L171
        L17c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L72
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L72
            throw r2     // Catch: java.lang.Throwable -> L72
        L182:
            G4.a r2 = G4.a.f2004q     // Catch: java.lang.Throwable -> L72
        L184:
            android.os.StrictMode.setThreadPolicy(r4)     // Catch: java.lang.Throwable -> L2a
        L187:
            com.google.android.gms.internal.measurement.P1.f10683a = r2     // Catch: java.lang.Throwable -> L2a
            goto L18e
        L18a:
            android.os.StrictMode.setThreadPolicy(r4)     // Catch: java.lang.Throwable -> L2a
            throw r0     // Catch: java.lang.Throwable -> L2a
        L18e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            return r2
        L190:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L192:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.F2.get():java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public F2(int i) {
        switch (i) {
            case 1:
                this.f10630q = new HashMap();
                break;
            default:
                P2 p22 = P2.f10684c;
                F2 f22 = new F2(new J2[]{C0841o2.f11003r, f10629r});
                Charset charset = AbstractC0885x2.f11122a;
                this.f10630q = f22;
                break;
        }
    }

    public F2(C0801g2 c0801g2) {
        Charset charset = AbstractC0885x2.f11122a;
        this.f10630q = c0801g2;
        c0801g2.f10846e = this;
    }
}
