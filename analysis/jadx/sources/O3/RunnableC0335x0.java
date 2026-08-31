package O3;

import android.os.Parcelable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: O3.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0335x0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f5119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f5120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f5121t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [n1.e.a(android.content.Context, m1.d, android.content.res.Resources, int, java.lang.String, int, int, m1.b, boolean):android.graphics.Typeface] */
    public /* synthetic */ RunnableC0335x0() {
        this.f5118q = 9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v109, resolved type: android.app.Service */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0310  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r39 = this;
            r1 = r39
            int r0 = r1.f5118q
            switch(r0) {
                case 0: goto L598;
                case 1: goto L45b;
                case 2: goto L444;
                case 3: goto L421;
                case 4: goto L1dc;
                case 5: goto L11a;
                case 6: goto L7d;
                case 7: goto L41;
                case 8: goto L24;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f5121t     // Catch: java.lang.Exception -> L10
            s1.d r0 = (s1.d) r0     // Catch: java.lang.Exception -> L10
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L10
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.Object r2 = r1.f5119r
            s1.e r2 = (s1.e) r2
            java.lang.Object r3 = r1.f5120s
            android.os.Handler r3 = (android.os.Handler) r3
            I4.a r4 = new I4.a
            r5 = 29
            r4.<init>(r5, r2, r0)
            r3.post(r4)
            return
        L24:
            java.lang.Object r0 = r1.f5121t
            k3.d r0 = (k3.d) r0
            java.lang.Object r2 = r1.f5119r
            O3.X r2 = (O3.X) r2
            java.lang.Object r3 = r1.f5120s
            android.app.job.JobParameters r3 = (android.app.job.JobParameters) r3
            O3.V r2 = r2.f4666E
            java.lang.String r4 = "AppMeasurementJobService processed last upload request."
            r2.b(r4)
            java.lang.Object r0 = r0.f14122r
            android.app.Service r0 = (android.app.Service) r0
            O3.z1 r0 = (O3.InterfaceC0342z1) r0
            r0.c(r3)
            return
        L41:
            java.lang.Object r0 = r1.f5121t
            O3.w1 r0 = (O3.C0333w1) r0
            java.lang.Object r2 = r1.f5119r
            O3.a2 r2 = (O3.a2) r2
            java.lang.Object r3 = r1.f5120s
            O3.d r3 = (O3.C0275d) r3
            java.lang.Object r4 = r0.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            O3.I r5 = r0.f5109u
            if (r5 != 0) goto L62
            O3.X r0 = r4.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4670w
            java.lang.String r2 = "[sgtm] Discarding data. Failed to update batch upload status."
            r0.b(r2)
            goto L7c
        L62:
            r5.p(r2, r3)     // Catch: android.os.RemoteException -> L69
            r0.B()     // Catch: android.os.RemoteException -> L69
            goto L7c
        L69:
            r0 = move-exception
            O3.X r2 = r4.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4670w
            long r3 = r3.f4823q
            java.lang.String r5 = "[sgtm] Failed to update batch upload status, rowId, exception"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.d(r3, r0, r5)
        L7c:
            return
        L7d:
            java.lang.String r2 = "Failed to get app instance id"
            java.lang.Object r0 = r1.f5121t
            r3 = r0
            com.google.android.gms.internal.measurement.L r3 = (com.google.android.gms.internal.measurement.L) r3
            java.lang.Object r0 = r1.f5120s
            r4 = r0
            O3.w1 r4 = (O3.C0333w1) r4
            r5 = 0
            java.lang.Object r0 = r4.f4346r     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.t0 r0 = (O3.C0323t0) r0     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.h0 r6 = r0.f5076u     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.X r7 = r0.f5077v     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.C0323t0.j(r6)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.J0 r8 = r6.v()     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.I0 r9 = O3.I0.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            boolean r8 = r8.i(r9)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            if (r8 != 0) goto Lc2
            O3.C0323t0.l(r7)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.V r7 = r7.f4663B     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            java.lang.String r8 = "Analytics storage consent denied; will not get app instance id"
            r7.b(r8)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.b1 r7 = r0.f5054C     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.C0323t0.k(r7)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            java.util.concurrent.atomic.AtomicReference r7 = r7.f4765x     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            r7.set(r5)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.C0323t0.j(r6)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            K2.a r6 = r6.f4897x     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            r6.f(r5)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            goto Lce
        Lbe:
            r0 = move-exception
            goto L10d
        Lc0:
            r0 = move-exception
            goto Lf7
        Lc2:
            O3.I r8 = r4.f5109u     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            if (r8 != 0) goto Ld7
            O3.C0323t0.l(r7)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.V r6 = r7.f4670w     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            r6.b(r2)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
        Lce:
            O3.Y1 r0 = r0.f5080y
        Ld0:
            O3.C0323t0.j(r0)
            r0.W(r5, r3)
            goto L10c
        Ld7:
            java.lang.Object r7 = r1.f5119r     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.a2 r7 = (O3.a2) r7     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            java.lang.String r5 = r8.x(r7)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            if (r5 == 0) goto Lf3
            O3.b1 r0 = r0.f5054C     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.C0323t0.k(r0)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            java.util.concurrent.atomic.AtomicReference r0 = r0.f4765x     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            r0.set(r5)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            O3.C0323t0.j(r6)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            K2.a r0 = r6.f4897x     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            r0.f(r5)     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
        Lf3:
            r4.B()     // Catch: java.lang.Throwable -> Lbe android.os.RemoteException -> Lc0
            goto L105
        Lf7:
            java.lang.Object r6 = r4.f4346r     // Catch: java.lang.Throwable -> Lbe
            O3.t0 r6 = (O3.C0323t0) r6     // Catch: java.lang.Throwable -> Lbe
            O3.X r6 = r6.f5077v     // Catch: java.lang.Throwable -> Lbe
            O3.C0323t0.l(r6)     // Catch: java.lang.Throwable -> Lbe
            O3.V r6 = r6.f4670w     // Catch: java.lang.Throwable -> Lbe
            r6.c(r0, r2)     // Catch: java.lang.Throwable -> Lbe
        L105:
            java.lang.Object r0 = r4.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.Y1 r0 = r0.f5080y
            goto Ld0
        L10c:
            return
        L10d:
            java.lang.Object r2 = r4.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.Y1 r2 = r2.f5080y
            O3.C0323t0.j(r2)
            r2.W(r5, r3)
            throw r0
        L11a:
            java.lang.Object r0 = r1.f5121t
            r2 = r0
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            monitor-enter(r2)
            java.lang.Object r0 = r1.f5120s     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.w1 r0 = (O3.C0333w1) r0     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.lang.Object r3 = r0.f4346r     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.t0 r3 = (O3.C0323t0) r3     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.h0 r4 = r3.f5076u     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.C0323t0.j(r4)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.J0 r4 = r4.v()     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.I0 r5 = O3.I0.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            boolean r4 = r4.i(r5)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            if (r4 != 0) goto L16d
            O3.X r4 = r3.f5077v     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.C0323t0.l(r4)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.V r4 = r4.f4663B     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.lang.String r5 = "Analytics storage consent denied; will not get app instance id"
            r4.b(r5)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.lang.Object r0 = r0.f4346r     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.t0 r0 = (O3.C0323t0) r0     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.b1 r0 = r0.f5054C     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.C0323t0.k(r0)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.util.concurrent.atomic.AtomicReference r0 = r0.f4765x     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            r4 = 0
            r0.set(r4)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.h0 r0 = r3.f5076u     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.C0323t0.j(r0)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            K2.a r0 = r0.f4897x     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            r0.f(r4)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            r2.set(r4)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            r2.notify()     // Catch: java.lang.Throwable -> L166
        L164:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L166
            goto L1d1
        L166:
            r0 = move-exception
            goto L1da
        L169:
            r0 = move-exception
            goto L1d2
        L16b:
            r0 = move-exception
            goto L1b7
        L16d:
            O3.I r4 = r0.f5109u     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            if (r4 != 0) goto L181
            O3.X r0 = r3.f5077v     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.lang.String r3 = "Failed to get app instance id"
            r0.b(r3)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            r2.notify()     // Catch: java.lang.Throwable -> L166
            goto L164
        L181:
            java.lang.Object r5 = r1.f5119r     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.a2 r5 = (O3.a2) r5     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.lang.String r4 = r4.x(r5)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            r2.set(r4)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            if (r4 == 0) goto L1ac
            java.lang.Object r5 = r0.f4346r     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.t0 r5 = (O3.C0323t0) r5     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.b1 r5 = r5.f5054C     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.C0323t0.k(r5)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.util.concurrent.atomic.AtomicReference r5 = r5.f4765x     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            r5.set(r4)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.h0 r3 = r3.f5076u     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            O3.C0323t0.j(r3)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            K2.a r3 = r3.f4897x     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            r3.f(r4)     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
        L1ac:
            r0.B()     // Catch: java.lang.Throwable -> L169 android.os.RemoteException -> L16b
            java.lang.Object r0 = r1.f5121t     // Catch: java.lang.Throwable -> L166
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch: java.lang.Throwable -> L166
        L1b3:
            r0.notify()     // Catch: java.lang.Throwable -> L166
            goto L1d0
        L1b7:
            java.lang.Object r3 = r1.f5120s     // Catch: java.lang.Throwable -> L169
            O3.w1 r3 = (O3.C0333w1) r3     // Catch: java.lang.Throwable -> L169
            java.lang.Object r3 = r3.f4346r     // Catch: java.lang.Throwable -> L169
            O3.t0 r3 = (O3.C0323t0) r3     // Catch: java.lang.Throwable -> L169
            O3.X r3 = r3.f5077v     // Catch: java.lang.Throwable -> L169
            O3.C0323t0.l(r3)     // Catch: java.lang.Throwable -> L169
            O3.V r3 = r3.f4670w     // Catch: java.lang.Throwable -> L169
            java.lang.String r4 = "Failed to get app instance id"
            r3.c(r0, r4)     // Catch: java.lang.Throwable -> L169
            java.lang.Object r0 = r1.f5121t     // Catch: java.lang.Throwable -> L166
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch: java.lang.Throwable -> L166
            goto L1b3
        L1d0:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L166
        L1d1:
            return
        L1d2:
            java.lang.Object r3 = r1.f5121t     // Catch: java.lang.Throwable -> L166
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch: java.lang.Throwable -> L166
            r3.notify()     // Catch: java.lang.Throwable -> L166
            throw r0     // Catch: java.lang.Throwable -> L166
        L1da:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L166
            throw r0
        L1dc:
            java.lang.Object r0 = r1.f5120s
            O3.C0 r0 = (O3.C0) r0
            java.lang.Object r2 = r1.f5119r
            O3.a2 r2 = (O3.a2) r2
            java.lang.Object r3 = r1.f5121t
            O3.d r3 = (O3.C0275d) r3
            O3.T1 r4 = r0.f4330c
            r4.A()
            java.lang.String r2 = r2.f4729q
            x3.AbstractC1887A.g(r2)
            java.util.HashMap r5 = r4.f4601U
            O3.p0 r0 = r4.c()
            r0.o()
            r4.k0()
            O3.n r6 = r4.f4609s
            O3.T1.S(r6)
            long r8 = r3.f4823q
            long r10 = r3.f4825s
            r6.o()
            r6.p()
            r7 = 4
            r12 = 3
            r13 = 1
            r21 = 0
            android.database.sqlite.SQLiteDatabase r22 = r6.f0()     // Catch: java.lang.Throwable -> L2d8 android.database.sqlite.SQLiteException -> L2db
            java.lang.String r23 = "upload_queue"
            java.lang.String r24 = "rowId"
            java.lang.String r25 = "app_id"
            java.lang.String r26 = "measurement_batch"
            java.lang.String r27 = "upload_uri"
            java.lang.String r28 = "upload_headers"
            java.lang.String r29 = "upload_type"
            java.lang.String r30 = "retry_count"
            java.lang.String r31 = "creation_timestamp"
            java.lang.String r32 = "associated_row_id"
            java.lang.String r33 = "last_upload_timestamp"
            java.lang.String[] r24 = new java.lang.String[]{r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch: java.lang.Throwable -> L2d8 android.database.sqlite.SQLiteException -> L2db
            java.lang.String r25 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L2d8 android.database.sqlite.SQLiteException -> L2db
            java.lang.String[] r26 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2d8 android.database.sqlite.SQLiteException -> L2db
            java.lang.String r30 = "1"
            r27 = 0
            r28 = 0
            r29 = 0
            android.database.Cursor r14 = r22.query(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch: java.lang.Throwable -> L2d8 android.database.sqlite.SQLiteException -> L2db
            boolean r0 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2c8
            if (r0 != 0) goto L253
            r25 = r7
            r23 = r10
            r1 = r13
            goto L2f7
        L253:
            java.lang.String r0 = r14.getString(r13)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2c8
            x3.AbstractC1887A.g(r0)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2c8
            r15 = 2
            byte[] r15 = r14.getBlob(r15)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2c8
            r16 = r10
            java.lang.String r11 = r14.getString(r12)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2bf
            r10 = r12
            java.lang.String r12 = r14.getString(r7)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2bf
            r7 = 5
            int r7 = r14.getInt(r7)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2b8
            r10 = 6
            int r10 = r14.getInt(r10)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2b8
            r13 = 7
            long r22 = r14.getLong(r13)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2af
            r13 = 8
            long r24 = r14.getLong(r13)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2af
            r13 = 9
            long r26 = r14.getLong(r13)     // Catch: java.lang.Throwable -> L2ab android.database.sqlite.SQLiteException -> L2af
            r13 = r7
            r19 = r26
            r1 = 1
            r7 = r0
            r34 = r14
            r14 = r10
            r10 = r15
            r35 = r22
            r22 = r34
            r37 = r24
            r25 = 4
            r23 = r16
            r15 = r35
            r17 = r37
            O3.U1 r21 = r6.R(r7, r8, r10, r11, r12, r13, r14, r15, r17, r19)     // Catch: java.lang.Throwable -> L2a7 android.database.sqlite.SQLiteException -> L2a9
            r22.close()
        L2a3:
            r0 = r21
            goto L2fd
        L2a7:
            r0 = move-exception
            goto L2d1
        L2a9:
            r0 = move-exception
            goto L2d5
        L2ab:
            r0 = move-exception
            r22 = r14
            goto L2d1
        L2af:
            r0 = move-exception
            r22 = r14
            r23 = r16
            r1 = 1
        L2b5:
            r25 = 4
            goto L2d5
        L2b8:
            r0 = move-exception
            r1 = r13
            r22 = r14
            r23 = r16
            goto L2b5
        L2bf:
            r0 = move-exception
            r25 = r7
            r1 = r13
            r22 = r14
            r23 = r16
            goto L2d5
        L2c8:
            r0 = move-exception
            r25 = r7
            r23 = r10
            r1 = r13
            r22 = r14
            goto L2d5
        L2d1:
            r21 = r22
            goto L41b
        L2d5:
            r14 = r22
            goto L2e3
        L2d8:
            r0 = move-exception
            goto L41b
        L2db:
            r0 = move-exception
            r25 = r7
            r23 = r10
            r1 = r13
            r14 = r21
        L2e3:
            java.lang.Object r6 = r6.f4346r     // Catch: java.lang.Throwable -> L418
            O3.t0 r6 = (O3.C0323t0) r6     // Catch: java.lang.Throwable -> L418
            O3.X r6 = r6.f5077v     // Catch: java.lang.Throwable -> L418
            O3.C0323t0.l(r6)     // Catch: java.lang.Throwable -> L418
            O3.V r6 = r6.f4670w     // Catch: java.lang.Throwable -> L418
            java.lang.String r7 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r10 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L418
            r6.d(r10, r0, r7)     // Catch: java.lang.Throwable -> L418
        L2f7:
            if (r14 == 0) goto L2a3
            r14.close()
            goto L2a3
        L2fd:
            if (r0 != 0) goto L310
            O3.X r0 = r4.b()
            O3.V r0 = r0.f4673z
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "[sgtm] Queued batch doesn't exist. appId, rowId"
            r0.d(r2, r1, r3)
            goto L417
        L310:
            java.lang.String r0 = r0.f4634c
            int r6 = r3.f4824r
            if (r6 != r1) goto L3bf
            boolean r3 = r5.containsKey(r0)
            if (r3 == 0) goto L31f
            r5.remove(r0)
        L31f:
            O3.n r0 = r4.f4609s
            O3.T1.S(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r0.v(r3)
            O3.X r0 = r4.b()
            O3.V r0 = r0.f4666E
            java.lang.String r5 = "[sgtm] queued batch deleted after successful client upload. appId, rowId"
            r0.d(r2, r3, r5)
            r5 = 0
            int r0 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r0 <= 0) goto L417
            O3.n r0 = r4.f4609s
            O3.T1.S(r0)
            java.lang.Object r3 = r0.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            r0.o()
            r0.p()
            java.lang.Long r5 = java.lang.Long.valueOf(r23)
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r7 = "upload_type"
            r6.put(r7, r1)
            B3.a r1 = r3.f5052A
            O3.X r3 = r3.f5077v
            r1.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "creation_timestamp"
            r6.put(r7, r1)
            android.database.sqlite.SQLiteDatabase r0 = r0.f0()     // Catch: android.database.sqlite.SQLiteException -> L39b
            java.lang.String r1 = "upload_queue"
            java.lang.String r7 = "rowid=? AND app_id=? AND upload_type=?"
            java.lang.String r8 = java.lang.String.valueOf(r23)     // Catch: android.database.sqlite.SQLiteException -> L39b
            java.lang.String r9 = java.lang.String.valueOf(r25)     // Catch: android.database.sqlite.SQLiteException -> L39b
            java.lang.String[] r8 = new java.lang.String[]{r8, r2, r9}     // Catch: android.database.sqlite.SQLiteException -> L39b
            int r0 = r0.update(r1, r6, r7, r8)     // Catch: android.database.sqlite.SQLiteException -> L39b
            long r0 = (long) r0     // Catch: android.database.sqlite.SQLiteException -> L39b
            r6 = 1
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L39d
            O3.C0323t0.l(r3)     // Catch: android.database.sqlite.SQLiteException -> L39b
            O3.V r0 = r3.f4673z     // Catch: android.database.sqlite.SQLiteException -> L39b
            java.lang.String r1 = "Google Signal pending batch not updated. appId, rowId"
            r0.d(r2, r5, r1)     // Catch: android.database.sqlite.SQLiteException -> L39b
            goto L39d
        L39b:
            r0 = move-exception
            goto L3b0
        L39d:
            O3.X r0 = r4.b()
            O3.V r0 = r0.f4666E
            java.lang.Long r1 = java.lang.Long.valueOf(r23)
            java.lang.String r3 = "[sgtm] queued Google Signal batch updated. appId, signalRowId"
            r0.d(r2, r1, r3)
            r4.t(r2)
            goto L417
        L3b0:
            O3.C0323t0.l(r3)
            O3.V r1 = r3.f4670w
            java.lang.Long r3 = java.lang.Long.valueOf(r23)
            java.lang.String r4 = "Failed to update google Signal pending batch. appid, rowId"
            r1.e(r4, r2, r3, r0)
            throw r0
        L3bf:
            r10 = 3
            if (r6 != r10) goto L3fe
            java.lang.Object r6 = r5.get(r0)
            O3.S1 r6 = (O3.S1) r6
            if (r6 != 0) goto L3d3
            O3.S1 r6 = new O3.S1
            r6.<init>(r4)
            r5.put(r0, r6)
            goto L3de
        L3d3:
            int r5 = r6.f4569b
            int r5 = r5 + r1
            r6.f4569b = r5
            long r7 = r6.a()
            r6.f4570c = r7
        L3de:
            B3.a r1 = r4.e()
            r1.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r6.f4570c
            long r5 = r5 - r7
            O3.X r1 = r4.b()
            O3.V r1 = r1.f4666E
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"
            r1.e(r6, r2, r0, r5)
        L3fe:
            O3.n r0 = r4.f4609s
            O3.T1.S(r0)
            long r5 = r3.f4823q
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.A(r1)
            O3.X r0 = r4.b()
            O3.V r0 = r0.f4666E
            java.lang.String r3 = "[sgtm] increased batch retry count after failed client upload. appId, rowId"
            r0.d(r2, r1, r3)
        L417:
            return
        L418:
            r0 = move-exception
            r21 = r14
        L41b:
            if (r21 == 0) goto L420
            r21.close()
        L420:
            throw r0
        L421:
            java.lang.Object r0 = r1.f5119r
            O3.a2 r0 = (O3.a2) r0
            java.lang.Object r2 = r1.f5120s
            O3.C0 r2 = (O3.C0) r2
            O3.T1 r3 = r2.f4330c
            O3.T1 r2 = r2.f4330c
            r3.A()
            java.lang.Object r3 = r1.f5121t
            O3.V1 r3 = (O3.V1) r3
            java.lang.Object r4 = r3.W()
            if (r4 != 0) goto L440
            java.lang.String r3 = r3.f4647r
            r2.V(r3, r0)
            goto L443
        L440:
            r2.U(r3, r0)
        L443:
            return
        L444:
            java.lang.Object r0 = r1.f5120s
            O3.C0 r0 = (O3.C0) r0
            O3.T1 r2 = r0.f4330c
            r2.A()
            O3.T1 r0 = r0.f4330c
            java.lang.Object r2 = r1.f5121t
            O3.v r2 = (O3.C0328v) r2
            java.lang.Object r3 = r1.f5119r
            java.lang.String r3 = (java.lang.String) r3
            r0.h(r2, r3)
            return
        L45b:
            java.lang.Object r0 = r1.f5121t
            O3.v r0 = (O3.C0328v) r0
            java.lang.Object r2 = r1.f5119r
            O3.a2 r2 = (O3.a2) r2
            java.lang.Object r3 = r1.f5120s
            O3.C0 r3 = (O3.C0) r3
            r3.getClass()
            O3.T1 r3 = r3.f4330c
            java.lang.String r4 = "_cmp"
            java.lang.String r5 = r0.f5091q
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4b4
            O3.u r7 = r0.f5092r
            if (r7 == 0) goto L4b4
            android.os.Bundle r4 = r7.f5085q
            int r5 = r4.size()
            if (r5 != 0) goto L483
            goto L4b4
        L483:
            java.lang.String r5 = "_cis"
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "referrer broadcast"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L499
            java.lang.String r5 = "referrer API"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L4b4
        L499:
            O3.X r4 = r3.b()
            O3.V r4 = r4.f4664C
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "Event has been filtered "
            r4.c(r5, r6)
            O3.v r5 = new O3.v
            java.lang.String r8 = r0.f5093s
            long r9 = r0.f5094t
            java.lang.String r6 = "_cmpx"
            r5.<init>(r6, r7, r8, r9)
            r0 = r5
        L4b4:
            java.lang.String r4 = r0.f5091q
            O3.l0 r5 = r3.f4607q
            O3.b0 r6 = r3.f4613w
            O3.T1.S(r5)
            java.lang.String r7 = r2.f4729q
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L4c7
            r5 = 0
            goto L4cf
        L4c7:
            B2.e r5 = r5.f4945A
            java.lang.Object r5 = r5.h(r7)
            com.google.android.gms.internal.measurement.D r5 = (com.google.android.gms.internal.measurement.D) r5
        L4cf:
            if (r5 == 0) goto L584
            B0.G0 r7 = r5.f10617c     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            O3.T1.S(r6)     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            O3.u r8 = r0.f5092r     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            android.os.Bundle r8 = r8.c0()     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            r9 = 1
            java.util.HashMap r8 = O3.C0270b0.e0(r8, r9)     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            java.lang.String[] r9 = O3.K0.f4504c     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            java.lang.String[] r10 = O3.K0.f4502a     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            java.lang.String r9 = O3.K0.g(r4, r9, r10)     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            if (r9 == 0) goto L4ec
            goto L4ed
        L4ec:
            r9 = r4
        L4ed:
            com.google.android.gms.internal.measurement.b r10 = new com.google.android.gms.internal.measurement.b     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            long r11 = r0.f5094t     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            r10.<init>(r9, r11, r8)     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            boolean r5 = r5.a(r10)     // Catch: com.google.android.gms.internal.measurement.Q -> L565
            if (r5 != 0) goto L4fc
            goto L572
        L4fc:
            java.lang.Object r5 = r7.f235s
            com.google.android.gms.internal.measurement.b r5 = (com.google.android.gms.internal.measurement.C0773b) r5
            java.lang.Object r8 = r7.f234r
            com.google.android.gms.internal.measurement.b r8 = (com.google.android.gms.internal.measurement.C0773b) r8
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L527
            O3.X r0 = r3.b()
            O3.V r0 = r0.f4666E
            java.lang.String r5 = "EES edited event"
            r0.c(r4, r5)
            O3.T1.S(r6)
            java.lang.Object r0 = r7.f235s
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.C0773b) r0
            O3.v r0 = O3.C0270b0.s(r0)
            r3.A()
            r3.j(r0, r2)
            goto L52d
        L527:
            r3.A()
            r3.j(r0, r2)
        L52d:
            java.lang.Object r0 = r7.f236t
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L597
            java.lang.Object r0 = r7.f236t
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r0.size()
            r5 = 0
        L540:
            if (r5 >= r4) goto L597
            java.lang.Object r7 = r0.get(r5)
            int r5 = r5 + 1
            com.google.android.gms.internal.measurement.b r7 = (com.google.android.gms.internal.measurement.C0773b) r7
            O3.X r8 = r3.b()
            O3.V r8 = r8.f4666E
            java.lang.String r9 = r7.f10799a
            java.lang.String r10 = "EES logging created event"
            r8.c(r9, r10)
            O3.T1.S(r6)
            O3.v r7 = O3.C0270b0.s(r7)
            r3.A()
            r3.j(r7, r2)
            goto L540
        L565:
            O3.X r5 = r3.b()
            O3.V r5 = r5.f4670w
            java.lang.String r6 = r2.f4730r
            java.lang.String r7 = "EES error. appId, eventName"
            r5.d(r6, r4, r7)
        L572:
            O3.X r5 = r3.b()
            O3.V r5 = r5.f4666E
            java.lang.String r6 = "EES was not applied to event"
            r5.c(r4, r6)
            r3.A()
            r3.j(r0, r2)
            goto L597
        L584:
            O3.X r4 = r3.b()
            O3.V r4 = r4.f4666E
            java.lang.String r5 = r2.f4729q
            java.lang.String r6 = "EES not loaded for"
            r4.c(r5, r6)
            r3.A()
            r3.j(r0, r2)
        L597:
            return
        L598:
            java.lang.Object r0 = r1.f5119r
            O3.a2 r0 = (O3.a2) r0
            java.lang.Object r2 = r1.f5120s
            O3.C0 r2 = (O3.C0) r2
            O3.T1 r3 = r2.f4330c
            O3.T1 r2 = r2.f4330c
            r3.A()
            java.lang.Object r3 = r1.f5121t
            O3.e r3 = (O3.C0278e) r3
            O3.V1 r4 = r3.f4832s
            java.lang.Object r4 = r4.W()
            if (r4 != 0) goto L5b7
            r2.Y(r3, r0)
            goto L5ba
        L5b7:
            r2.X(r3, r0)
        L5ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.RunnableC0335x0.run():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0335x0(C0 c02, AbstractC1915a abstractC1915a, Object obj, int i) {
        this.f5118q = i;
        this.f5121t = abstractC1915a;
        this.f5119r = obj;
        this.f5120s = c02;
    }

    public /* synthetic */ RunnableC0335x0(Object obj, a2 a2Var, Object obj2, int i) {
        this.f5118q = i;
        this.f5120s = obj;
        this.f5119r = a2Var;
        this.f5121t = obj2;
    }

    public /* synthetic */ RunnableC0335x0(Object obj, Object obj2, Parcelable parcelable, int i) {
        this.f5118q = i;
        this.f5121t = obj;
        this.f5119r = obj2;
        this.f5120s = parcelable;
    }

    public RunnableC0335x0(C0333w1 c0333w1, AtomicReference atomicReference, a2 a2Var) {
        this.f5118q = 5;
        this.f5121t = atomicReference;
        this.f5119r = a2Var;
        Objects.requireNonNull(c0333w1);
        this.f5120s = c0333w1;
    }
}
