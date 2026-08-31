package com.google.android.gms.internal.measurement;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import c.C0709g;
import c.C0710h;
import i1.C1134a;
import i3.C1136a;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CancellationException;
import r.C1566q;
import u3.InterfaceC1697b;
import v0.C1745n;
import x3.C1901m;
import z3.C1965a;

/* JADX INFO: loaded from: classes.dex */
public final class O1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static O1 f10678d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10681c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O1(int i) {
        switch (i) {
            case 1:
                this.f10680b = new Object();
                break;
            default:
                this.f10679a = false;
                this.f10680b = null;
                this.f10681c = null;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static O1 d(Context context) {
        O1 o12;
        synchronized (O1.class) {
            try {
                if (f10678d == null) {
                    f10678d = P1.j(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new O1(context) : new O1(0);
                }
                O1 o13 = f10678d;
                if (o13 != null && ((com.google.android.gms.internal.clearcut.F0) o13.f10681c) != null && !o13.f10679a) {
                    try {
                        context.getContentResolver().registerContentObserver(H1.f10640a, true, (com.google.android.gms.internal.clearcut.F0) f10678d.f10681c);
                        O1 o14 = f10678d;
                        o14.getClass();
                        o14.f10679a = true;
                    } catch (SecurityException e7) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e7);
                    }
                }
                o12 = f10678d;
                o12.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return o12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a(long j) {
        Object obj;
        List list = (List) ((Z.m) this.f10681c).f8312r;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (v0.v.d(((C1745n) obj).f17475a, j)) {
                break;
            }
            i++;
        }
        C1745n c1745n = (C1745n) obj;
        if (c1745n != null) {
            return c1745n.f17481h;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        ((O5.e) this.f10680b).g(true, new CancellationException("onBack cancelled"));
        ((M5.B) this.f10681c).a(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(InterfaceC1697b interfaceC1697b, S3.e eVar) {
        C1136a c1136a = (C1136a) ((C1134a) this.f10681c).f13535r;
        c1136a.getClass();
        C1965a c1965a = (C1965a) ((z3.c) interfaceC1697b).t();
        C1901m c1901m = (C1901m) c1136a.f13562r;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c1965a.f2411e);
        int i = I3.b.f2412a;
        if (c1901m == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            c1901m.writeToParcel(parcelObtain, 0);
        }
        try {
            c1965a.f2410d.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            eVar.f7306a.g(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(S3.i iVar) {
        synchronized (this.f10680b) {
            try {
                if (((ArrayDeque) this.f10681c) == null) {
                    this.f10681c = new ArrayDeque();
                }
                ((ArrayDeque) this.f10681c).add(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String f(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f10680b
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L8f
            boolean r2 = com.google.android.gms.internal.measurement.K1.f10652b
            r3 = 1
            if (r2 == 0) goto Ld
            goto L5b
        Ld:
            java.lang.Class<com.google.android.gms.internal.measurement.K1> r2 = com.google.android.gms.internal.measurement.K1.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.K1.f10652b     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            goto L5b
        L16:
            r9 = move-exception
            goto L8d
        L19:
            r4 = r3
        L1a:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L51
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.K1.f10651a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L2c
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L16
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.K1.f10651a = r5     // Catch: java.lang.Throwable -> L16
        L2c:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.K1.f10651a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L32
            r6 = r3
            goto L55
        L32:
            boolean r7 = r5.isUserUnlocked()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r7 != 0) goto L42
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r0 != 0) goto L51
        L42:
            r6 = r3
            goto L51
        L44:
            r5 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r5)     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.K1.f10651a = r1     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + 1
            goto L1a
        L51:
            if (r6 == 0) goto L55
            com.google.android.gms.internal.measurement.K1.f10651a = r1     // Catch: java.lang.Throwable -> L16
        L55:
            if (r6 == 0) goto L59
            com.google.android.gms.internal.measurement.K1.f10652b = r3     // Catch: java.lang.Throwable -> L16
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            r3 = r6
        L5b:
            if (r3 != 0) goto L5e
            goto L8f
        L5e:
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            r0.<init>(r8, r9)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            java.lang.Object r0 = r0.a()     // Catch: java.lang.SecurityException -> L68 java.lang.NullPointerException -> L76 java.lang.IllegalStateException -> L7a
            goto L73
        L68:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L7c
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
        L73:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            return r0
        L76:
            r0 = move-exception
            goto L81
        L78:
            r0 = move-exception
            goto L81
        L7a:
            r0 = move-exception
            goto L81
        L7c:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            throw r0     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
        L81:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r9, r0)
            return r1
        L8d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r9
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.O1.f(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(S3.d dVar) {
        S3.i iVar;
        synchronized (this.f10680b) {
            if (((ArrayDeque) this.f10681c) != null && !this.f10679a) {
                this.f10679a = true;
                while (true) {
                    synchronized (this.f10680b) {
                        try {
                            iVar = (S3.i) ((ArrayDeque) this.f10681c).poll();
                            if (iVar == null) {
                                this.f10679a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    iVar.a(dVar);
                }
            }
        }
    }

    public O1(Context context) {
        this.f10679a = false;
        this.f10680b = context;
        this.f10681c = new com.google.android.gms.internal.clearcut.F0(null, 1);
    }

    public O1(C1134a c1134a, com.google.android.gms.common.d[] dVarArr, boolean z5) {
        this.f10681c = c1134a;
        this.f10680b = dVarArr;
        boolean z6 = false;
        if (dVarArr != null && z5) {
            z6 = true;
        }
        this.f10679a = z6;
    }

    public O1(C1566q c1566q, Z.m mVar) {
        this.f10680b = c1566q;
        this.f10681c = mVar;
    }

    public O1(InterfaceC0261w interfaceC0261w, boolean z5, B5.e eVar, C0710h c0710h) {
        this.f10679a = z5;
        this.f10680b = l6.d.e(-2, O5.a.f5206q, 4);
        this.f10681c = AbstractC0263y.t(interfaceC0261w, null, null, new C0709g(c0710h, eVar, this, null), 3);
    }
}
