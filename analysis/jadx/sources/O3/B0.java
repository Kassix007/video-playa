package O3;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4326u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ B0(C0 c02, Bundle bundle, String str, a2 a2Var) {
        this.f4322q = 2;
        this.f4324s = c02;
        this.f4325t = bundle;
        this.f4323r = str;
        this.f4326u = a2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0410  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r26 = this;
            r1 = r26
            int r0 = r1.f4322q
            switch(r0) {
                case 0: goto L361;
                case 1: goto L305;
                case 2: goto L1e4;
                case 3: goto L1b5;
                case 4: goto L188;
                case 5: goto L123;
                case 6: goto Ld3;
                case 7: goto L83;
                case 8: goto L51;
                case 9: goto L1e;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f4324s
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = r1.f4323r
            w1.Z r2 = (w1.Z) r2
            java.lang.Object r3 = r1.f4325t
            v3.l r3 = (v3.l) r3
            w1.U.h(r0, r2, r3)
            java.lang.Object r0 = r1.f4326u
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.start()
            return
        L1e:
            java.lang.Object r0 = r1.f4326u
            i1.a r0 = (i1.C1134a) r0
            java.lang.Object r0 = r0.f13535r
            l.f r0 = (l.ViewOnKeyListenerC1203f) r0
            java.lang.Object r2 = r1.f4323r
            l.n r2 = (l.C1211n) r2
            java.lang.Object r3 = r1.f4324s
            l.e r3 = (l.C1202e) r3
            if (r3 == 0) goto L3b
            r4 = 1
            r0.f14327P = r4
            l.l r3 = r3.f14310b
            r4 = 0
            r3.c(r4)
            r0.f14327P = r4
        L3b:
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L50
            boolean r0 = r2.hasSubMenu()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r1.f4325t
            l.l r0 = (l.MenuC1209l) r0
            r3 = 4
            r4 = 0
            r0.q(r2, r4, r3)
        L50:
            return
        L51:
            java.lang.Object r0 = r1.f4326u
            k3.d r0 = (k3.d) r0
            java.lang.Object r0 = r0.f14122r
            O3.T1 r0 = (O3.T1) r0
            O3.Y1 r2 = r0.j0()
            B3.a r3 = r0.e()
            r3.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r3 = r1.f4323r
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r1.f4324s
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f4325t
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "auto"
            r8 = 0
            O3.v r2 = r2.Q(r3, r4, r5, r6, r8)
            x3.AbstractC1887A.g(r2)
            r0.h(r2, r9)
            return
        L83:
            java.lang.Object r0 = r1.f4324s
            r2 = r0
            O3.w1 r2 = (O3.C0333w1) r2
            java.lang.Object r0 = r1.f4323r
            r3 = r0
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            java.lang.Object r0 = r1.f4326u
            O3.a2 r0 = (O3.a2) r0
            java.lang.Object r4 = r1.f4325t
            O3.M1 r4 = (O3.M1) r4
            monitor-enter(r3)
            O3.I r5 = r2.f5109u     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            if (r5 != 0) goto Lb0
            java.lang.Object r0 = r2.f4346r     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            O3.t0 r0 = (O3.C0323t0) r0     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            O3.X r0 = r0.f5077v     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            java.lang.String r4 = "[sgtm] Failed to get upload batches; not connected to service"
            r0.b(r4)     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
            goto Ld0
        Lac:
            r0 = move-exception
            goto Ld1
        Lae:
            r0 = move-exception
            goto Lbc
        Lb0:
            O3.p1 r6 = new O3.p1     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            r5.D(r0, r4, r6)     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            r2.B()     // Catch: java.lang.Throwable -> Lac android.os.RemoteException -> Lae
            goto Lcf
        Lbc:
            java.lang.Object r2 = r2.f4346r     // Catch: java.lang.Throwable -> Lac
            O3.t0 r2 = (O3.C0323t0) r2     // Catch: java.lang.Throwable -> Lac
            O3.X r2 = r2.f5077v     // Catch: java.lang.Throwable -> Lac
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> Lac
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "[sgtm] Failed to get upload batches; remote exception"
            r2.c(r0, r4)     // Catch: java.lang.Throwable -> Lac
            r3.notifyAll()     // Catch: java.lang.Throwable -> Lac
        Lcf:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
        Ld0:
            return
        Ld1:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
            throw r0
        Ld3:
            java.lang.Object r0 = r1.f4324s
            r2 = r0
            O3.w1 r2 = (O3.C0333w1) r2
            java.lang.Object r0 = r1.f4323r
            r3 = r0
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            java.lang.Object r0 = r1.f4325t
            O3.a2 r0 = (O3.a2) r0
            java.lang.Object r4 = r1.f4326u
            android.os.Bundle r4 = (android.os.Bundle) r4
            monitor-enter(r3)
            O3.I r5 = r2.f5109u     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            if (r5 != 0) goto L100
            java.lang.Object r0 = r2.f4346r     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            O3.t0 r0 = (O3.C0323t0) r0     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            O3.X r0 = r0.f5077v     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            java.lang.String r4 = "Failed to request trigger URIs; not connected to service"
            r0.b(r4)     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lfc
            goto L120
        Lfc:
            r0 = move-exception
            goto L121
        Lfe:
            r0 = move-exception
            goto L10c
        L100:
            O3.o1 r6 = new O3.o1     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            r5.y(r0, r4, r6)     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            r2.B()     // Catch: java.lang.Throwable -> Lfc android.os.RemoteException -> Lfe
            goto L11f
        L10c:
            java.lang.Object r2 = r2.f4346r     // Catch: java.lang.Throwable -> Lfc
            O3.t0 r2 = (O3.C0323t0) r2     // Catch: java.lang.Throwable -> Lfc
            O3.X r2 = r2.f5077v     // Catch: java.lang.Throwable -> Lfc
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> Lfc
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> Lfc
            java.lang.String r4 = "Failed to request trigger URIs; remote exception"
            r2.c(r0, r4)     // Catch: java.lang.Throwable -> Lfc
            r3.notifyAll()     // Catch: java.lang.Throwable -> Lfc
        L11f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lfc
        L120:
            return
        L121:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lfc
            throw r0
        L123:
            java.lang.Object r0 = r1.f4325t
            r2 = r0
            com.google.android.gms.internal.measurement.L r2 = (com.google.android.gms.internal.measurement.L) r2
            java.lang.Object r0 = r1.f4326u
            r3 = r0
            O3.w1 r3 = (O3.C0333w1) r3
            r4 = 0
            O3.I r0 = r3.f5109u     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            if (r0 != 0) goto L14b
            java.lang.Object r0 = r3.f4346r     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            O3.t0 r0 = (O3.C0323t0) r0     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            O3.X r5 = r0.f5077v     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            O3.C0323t0.l(r5)     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            O3.V r5 = r5.f4670w     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            java.lang.String r6 = "Discarding data. Failed to send event to service to bundle"
            r5.b(r6)     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            O3.Y1 r0 = r0.f5080y
            O3.C0323t0.j(r0)
            r0.Z(r2, r4)
            goto L17a
        L14b:
            java.lang.Object r5 = r1.f4324s     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            O3.v r5 = (O3.C0328v) r5     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            java.lang.Object r6 = r1.f4323r     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            byte[] r4 = r0.m(r5, r6)     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            r3.B()     // Catch: java.lang.Throwable -> L15b android.os.RemoteException -> L15d
            goto L16e
        L15b:
            r0 = move-exception
            goto L17b
        L15d:
            r0 = move-exception
            java.lang.Object r5 = r3.f4346r     // Catch: java.lang.Throwable -> L15b
            O3.t0 r5 = (O3.C0323t0) r5     // Catch: java.lang.Throwable -> L15b
            O3.X r5 = r5.f5077v     // Catch: java.lang.Throwable -> L15b
            O3.C0323t0.l(r5)     // Catch: java.lang.Throwable -> L15b
            O3.V r5 = r5.f4670w     // Catch: java.lang.Throwable -> L15b
            java.lang.String r6 = "Failed to send event to the service to bundle"
            r5.c(r0, r6)     // Catch: java.lang.Throwable -> L15b
        L16e:
            java.lang.Object r0 = r3.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.Y1 r0 = r0.f5080y
            O3.C0323t0.j(r0)
            r0.Z(r2, r4)
        L17a:
            return
        L17b:
            java.lang.Object r3 = r3.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            O3.Y1 r3 = r3.f5080y
            O3.C0323t0.j(r3)
            r3.Z(r2, r4)
            throw r0
        L188:
            java.lang.Object r0 = r1.f4326u
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            O3.t0 r0 = r0.f11336c
            O3.w1 r3 = r0.o()
            java.lang.Object r0 = r1.f4324s
            r7 = r0
            com.google.android.gms.internal.measurement.L r7 = (com.google.android.gms.internal.measurement.L) r7
            java.lang.Object r0 = r1.f4323r
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r1.f4325t
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r3.o()
            r3.p()
            r0 = 0
            O3.a2 r6 = r3.E(r0)
            O3.A0 r2 = new O3.A0
            r2.<init>(r3, r4, r5, r6, r7)
            r3.C(r2)
            return
        L1b5:
            java.lang.Object r0 = r1.f4323r
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r1.f4325t
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r1.f4326u
            O3.b1 r0 = (O3.C0271b1) r0
            java.lang.Object r0 = r0.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.w1 r3 = r0.o()
            java.lang.Object r0 = r1.f4324s
            r4 = r0
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4
            r3.o()
            r3.p()
            r0 = 0
            O3.a2 r7 = r3.E(r0)
            O3.A0 r2 = new O3.A0
            r2.<init>(r3, r4, r5, r6, r7)
            r3.C(r2)
            return
        L1e4:
            java.lang.Object r0 = r1.f4324s
            O3.C0 r0 = (O3.C0) r0
            java.lang.Object r2 = r1.f4325t
            r12 = r2
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.Object r2 = r1.f4323r
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r1.f4326u
            O3.a2 r2 = (O3.a2) r2
            O3.T1 r13 = r0.f4330c
            O3.g r0 = r13.d0()
            O3.E r3 = O3.F.f4403V0
            r14 = 0
            boolean r0 = r0.y(r14, r3)
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L238
            if (r0 == 0) goto L238
            O3.n r2 = r13.f4609s
            O3.T1.S(r2)
            r2.o()
            r2.p()
            android.database.sqlite.SQLiteDatabase r0 = r2.f0()     // Catch: android.database.sqlite.SQLiteException -> L225
            java.lang.String r3 = "delete from default_event_params where app_id=?"
            java.lang.String[] r4 = new java.lang.String[]{r6}     // Catch: android.database.sqlite.SQLiteException -> L225
            r0.execSQL(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L225
            goto L304
        L225:
            r0 = move-exception
            java.lang.Object r2 = r2.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.X r2 = r2.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4670w
            java.lang.String r3 = "Error clearing default event params"
            r2.c(r0, r3)
            goto L304
        L238:
            O3.n r0 = r13.f4609s
            O3.T1.S(r0)
            java.lang.Object r3 = r0.f4346r
            r15 = r3
            O3.t0 r15 = (O3.C0323t0) r15
            r0.o()
            r0.p()
            java.lang.Object r3 = r0.f4346r
            r4 = r3
            O3.t0 r4 = (O3.C0323t0) r4
            java.lang.String r7 = "dep"
            O3.r r3 = new O3.r
            java.lang.String r5 = ""
            r8 = 0
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r10, r12)
            O3.T1 r4 = r0.f4510s
            O3.b0 r4 = r4.f4613w
            O3.T1.S(r4)
            com.google.android.gms.internal.measurement.k1 r3 = r4.Q(r3)
            byte[] r3 = r3.a()
            O3.X r4 = r15.f5077v
            O3.C0323t0.l(r4)
            O3.V r5 = r4.f4666E
            int r7 = r3.length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Saving default event parameters, appId, data size"
            r5.d(r6, r7, r8)
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r7 = "app_id"
            r5.put(r7, r6)
            java.lang.String r7 = "parameters"
            r5.put(r7, r3)
            android.database.sqlite.SQLiteDatabase r0 = r0.f0()     // Catch: android.database.sqlite.SQLiteException -> L2a9
            java.lang.String r3 = "default_event_params"
            r7 = 5
            long r7 = r0.insertWithOnConflict(r3, r14, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L2a9
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L2b8
            O3.C0323t0.l(r4)     // Catch: android.database.sqlite.SQLiteException -> L2a9
            O3.V r0 = r4.f4670w     // Catch: android.database.sqlite.SQLiteException -> L2a9
            java.lang.String r3 = "Failed to insert default event parameters (got -1). appId"
            O3.W r5 = O3.X.w(r6)     // Catch: android.database.sqlite.SQLiteException -> L2a9
            r0.c(r5, r3)     // Catch: android.database.sqlite.SQLiteException -> L2a9
            goto L2b8
        L2a9:
            r0 = move-exception
            O3.C0323t0.l(r4)
            O3.V r3 = r4.f4670w
            O3.W r4 = O3.X.w(r6)
            java.lang.String r5 = "Error storing default event parameters. appId"
            r3.d(r4, r0, r5)
        L2b8:
            O3.n r3 = r13.f4609s
            O3.T1.S(r3)
            long r4 = r2.f4727T
            java.lang.String r0 = "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;"
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch: android.database.sqlite.SQLiteException -> L2f3
            java.lang.String[] r2 = new java.lang.String[]{r6, r2}     // Catch: android.database.sqlite.SQLiteException -> L2f3
            r7 = 0
            long r9 = r3.L(r0, r2, r7)     // Catch: android.database.sqlite.SQLiteException -> L2f3
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L2d4
            goto L304
        L2d4:
            java.lang.String r0 = "select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;"
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch: android.database.sqlite.SQLiteException -> L2f3
            java.lang.String[] r2 = new java.lang.String[]{r6, r2}     // Catch: android.database.sqlite.SQLiteException -> L2f3
            long r2 = r3.L(r0, r2, r7)     // Catch: android.database.sqlite.SQLiteException -> L2f3
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L304
            O3.n r0 = r13.f4609s
            O3.T1.S(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.I(r6, r2, r14, r12)
            goto L304
        L2f3:
            r0 = move-exception
            java.lang.Object r2 = r3.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.X r2 = r2.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4670w
            java.lang.String r3 = "Error checking backfill conditions"
            r2.c(r0, r3)
        L304:
            return
        L305:
            java.lang.Object r0 = r1.f4326u
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            O3.t0 r0 = r0.f11336c
            O3.w1 r3 = r0.o()
            java.lang.Object r0 = r1.f4324s
            r6 = r0
            com.google.android.gms.internal.measurement.L r6 = (com.google.android.gms.internal.measurement.L) r6
            java.lang.Object r0 = r1.f4325t
            r4 = r0
            O3.v r4 = (O3.C0328v) r4
            java.lang.Object r0 = r1.f4323r
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r3.o()
            r3.p()
            java.lang.Object r0 = r3.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.Y1 r2 = r0.f5080y
            O3.C0323t0.j(r2)
            java.lang.Object r2 = r2.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            com.google.android.gms.common.f r7 = com.google.android.gms.common.f.f10343b
            android.content.Context r2 = r2.f5072q
            r8 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r7.c(r2, r8)
            if (r2 == 0) goto L356
            O3.X r2 = r0.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4673z
            java.lang.String r3 = "Not bundling data. Service unavailable or out of date"
            r2.b(r3)
            O3.Y1 r0 = r0.f5080y
            O3.C0323t0.j(r0)
            r2 = 0
            byte[] r2 = new byte[r2]
            r0.Z(r6, r2)
            goto L360
        L356:
            O3.B0 r2 = new O3.B0
            r7 = 5
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r3.C(r2)
        L360:
            return
        L361:
            java.lang.Object r0 = r1.f4324s
            O3.C0 r0 = (O3.C0) r0
            java.lang.Object r2 = r1.f4323r
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f4325t
            O3.M1 r3 = (O3.M1) r3
            java.lang.Object r4 = r1.f4326u
            O3.M r4 = (O3.M) r4
            O3.T1 r5 = r0.f4330c
            r5.A()
            O3.p0 r0 = r5.c()
            r0.o()
            r5.k0()
            O3.n r0 = r5.f4609s
            O3.T1.S(r0)
            O3.E r6 = O3.F.f4364B
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.List r0 = r0.t(r2, r3, r6)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L39f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L4fd
            java.lang.Object r6 = r0.next()
            O3.U1 r6 = (O3.U1) r6
            java.lang.String r8 = r6.f4634c
            long r9 = r6.f4638h
            long r11 = r6.f4632a
            boolean r8 = r5.s(r2, r8)
            if (r8 != 0) goto L3c9
            O3.X r8 = r5.b()
            O3.V r8 = r8.f4666E
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            java.lang.String r6 = r6.f4634c
            java.lang.String r10 = "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"
            r8.e(r10, r2, r9, r6)
            goto L39f
        L3c9:
            int r8 = r6.i
            if (r8 > 0) goto L3ce
            goto L410
        L3ce:
            O3.E r13 = O3.F.f4469z
            java.lang.Object r13 = r13.a(r7)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r8 <= r13) goto L3de
            goto L4e9
        L3de:
            O3.E r13 = O3.F.f4465x
            java.lang.Object r13 = r13.a(r7)
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            int r8 = r8 + (-1)
            r15 = 1
            long r15 = r15 << r8
            long r13 = r13 * r15
            O3.E r8 = O3.F.f4467y
            java.lang.Object r8 = r8.a(r7)
            java.lang.Long r8 = (java.lang.Long) r8
            long r7 = r8.longValue()
            long r7 = java.lang.Math.min(r13, r7)
            B3.a r13 = r5.e()
            r13.getClass()
            long r13 = java.lang.System.currentTimeMillis()
            long r7 = r7 + r9
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 < 0) goto L4e9
        L410:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.util.HashMap r8 = r6.f4635d
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L41f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L43b
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r7.putString(r10, r9)
            goto L41f
        L43b:
            long r8 = r6.f4632a
            com.google.android.gms.internal.measurement.q1 r10 = r6.f4633b
            java.lang.String r11 = r6.f4634c
            O3.i1 r12 = r6.f4636e
            long r13 = r6.f4637g
            O3.L1 r16 = new O3.L1
            byte[] r19 = r10.a()
            int r6 = r12.f4916q
            java.lang.String r25 = ""
            r22 = r6
            r21 = r7
            r17 = r8
            r20 = r11
            r23 = r13
            r16.<init>(r17, r19, r20, r21, r22, r23, r25)
            r6 = r16
            com.google.android.gms.internal.measurement.p1 r7 = com.google.android.gms.internal.measurement.C0850q1.w()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            byte[] r8 = r6.f4512r     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.p2 r7 = O3.C0270b0.b0(r7, r8)     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.p1 r7 = (com.google.android.gms.internal.measurement.C0845p1) r7     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            r8 = 0
        L46b:
            com.google.android.gms.internal.measurement.q2 r9 = r7.f11012r     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.q1 r9 = (com.google.android.gms.internal.measurement.C0850q1) r9     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            int r9 = r9.q()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            if (r8 >= r9) goto L4ab
            com.google.android.gms.internal.measurement.q2 r9 = r7.f11012r     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.q1 r9 = (com.google.android.gms.internal.measurement.C0850q1) r9     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.s1 r9 = r9.r(r8)     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.p2 r9 = r9.i()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.r1 r9 = (com.google.android.gms.internal.measurement.C0854r1) r9     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            B3.a r10 = r5.e()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            r10.getClass()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            long r10 = java.lang.System.currentTimeMillis()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            r9.b()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.q2 r12 = r9.f11012r     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.s1 r12 = (com.google.android.gms.internal.measurement.C0859s1) r12     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            r12.f0(r10)     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            r7.b()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.q2 r10 = r7.f11012r     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.q1 r10 = (com.google.android.gms.internal.measurement.C0850q1) r10     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.q2 r9 = r9.e()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.s1 r9 = (com.google.android.gms.internal.measurement.C0859s1) r9     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            r10.y(r8, r9)     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            int r8 = r8 + 1
            goto L46b
        L4ab:
            com.google.android.gms.internal.measurement.q2 r8 = r7.e()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.q1 r8 = (com.google.android.gms.internal.measurement.C0850q1) r8     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            byte[] r8 = r8.a()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            r6.f4512r = r8     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            O3.X r8 = r5.b()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            java.lang.String r8 = r8.y()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            r9 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r9)     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            if (r8 == 0) goto L4d7
            O3.b0 r8 = r5.f4613w     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            O3.T1.S(r8)     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.q2 r7 = r7.e()     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            com.google.android.gms.internal.measurement.q1 r7 = (com.google.android.gms.internal.measurement.C0850q1) r7     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            java.lang.String r7 = r8.R(r7)     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
            r6.f4517w = r7     // Catch: com.google.android.gms.internal.measurement.C0895z2 -> L4dd
        L4d7:
            r3.add(r6)
        L4da:
            r7 = 0
            goto L39f
        L4dd:
            O3.X r6 = r5.b()
            O3.V r6 = r6.f4673z
            java.lang.String r7 = "Failed to parse queued batch. appId"
            r6.c(r2, r7)
            goto L4da
        L4e9:
            O3.X r6 = r5.b()
            O3.V r6 = r6.f4666E
            java.lang.Long r7 = java.lang.Long.valueOf(r11)
            java.lang.Long r8 = java.lang.Long.valueOf(r9)
            java.lang.String r9 = "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"
            r6.e(r9, r2, r7, r8)
            goto L4da
        L4fd:
            O3.N1 r0 = new O3.N1
            r0.<init>(r3)
            r4.w(r0)     // Catch: android.os.RemoteException -> L519
            O3.X r0 = r5.b()     // Catch: android.os.RemoteException -> L519
            O3.V r0 = r0.f4666E     // Catch: android.os.RemoteException -> L519
            java.lang.String r4 = "[sgtm] Sending queued upload batches to client. appId, count"
            int r3 = r3.size()     // Catch: android.os.RemoteException -> L519
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.os.RemoteException -> L519
            r0.d(r2, r3, r4)     // Catch: android.os.RemoteException -> L519
            goto L525
        L519:
            r0 = move-exception
            O3.X r3 = r5.b()
            O3.V r3 = r3.f4670w
            java.lang.String r4 = "[sgtm] Failed to return upload batches for app"
            r3.d(r2, r0, r4)
        L525:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.B0.run():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ B0(C0333w1 c0333w1, AtomicReference atomicReference, a2 a2Var, M1 m12) {
        this.f4322q = 7;
        this.f4324s = c0333w1;
        this.f4323r = atomicReference;
        this.f4326u = a2Var;
        this.f4325t = m12;
    }

    public /* synthetic */ B0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f4322q = i;
        this.f4324s = obj;
        this.f4323r = obj2;
        this.f4325t = obj3;
        this.f4326u = obj4;
    }

    public /* synthetic */ B0(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z5) {
        this.f4322q = i;
        this.f4324s = obj2;
        this.f4323r = obj3;
        this.f4325t = obj4;
        this.f4326u = obj;
    }

    public B0(C0271b1 c0271b1, AtomicReference atomicReference, String str, String str2) {
        this.f4322q = 3;
        this.f4324s = atomicReference;
        this.f4323r = str;
        this.f4325t = str2;
        Objects.requireNonNull(c0271b1);
        this.f4326u = c0271b1;
    }

    public B0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.L l7, C0328v c0328v, String str) {
        this.f4322q = 1;
        this.f4324s = l7;
        this.f4325t = c0328v;
        this.f4323r = str;
        this.f4326u = appMeasurementDynamiteService;
    }

    public B0(k3.d dVar, String str, String str2, Bundle bundle) {
        this.f4322q = 8;
        this.f4323r = str;
        this.f4324s = str2;
        this.f4325t = bundle;
        this.f4326u = dVar;
    }
}
