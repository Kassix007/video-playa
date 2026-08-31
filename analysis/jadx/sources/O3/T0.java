package O3;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4574q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f4577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4579v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T0(Y0 y02, boolean z5, Uri uri, String str, String str2) {
        this.f4577t = z5;
        this.f4578u = uri;
        this.f4575r = str;
        this.f4576s = str2;
        this.f4579v = y02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107 A[Catch: RuntimeException -> 0x00e1, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150 A[Catch: RuntimeException -> 0x00e1, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.f4574q
            switch(r0) {
                case 0: goto L221;
                case 1: goto L1f0;
                case 2: goto L54;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f4578u
            O3.a2 r0 = (O3.a2) r0
            java.lang.Object r2 = r1.f4579v
            O3.w1 r2 = (O3.C0333w1) r2
            O3.I r3 = r2.f5109u
            java.lang.Object r4 = r2.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            java.lang.String r5 = "Failed to send default event parameters to service"
            if (r3 != 0) goto L24
            O3.X r0 = r4.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4670w
            r0.b(r5)
            goto L53
        L24:
            O3.g r6 = r4.f5075t
            O3.E r7 = O3.F.f4420c1
            r8 = 0
            boolean r6 = r6.y(r8, r7)
            if (r6 == 0) goto L3d
            boolean r4 = r1.f4577t
            if (r4 == 0) goto L34
            goto L39
        L34:
            java.lang.Object r4 = r1.f4575r
            r8 = r4
            O3.u r8 = (O3.C0325u) r8
        L39:
            r2.G(r3, r8, r0)
            goto L53
        L3d:
            java.lang.Object r6 = r1.f4576s     // Catch: android.os.RemoteException -> L48
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch: android.os.RemoteException -> L48
            r3.E(r0, r6)     // Catch: android.os.RemoteException -> L48
            r2.B()     // Catch: android.os.RemoteException -> L48
            goto L53
        L48:
            r0 = move-exception
            O3.X r2 = r4.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4670w
            r2.c(r0, r5)
        L53:
            return
        L54:
            java.lang.String r0 = "gclid="
            java.lang.Object r2 = r1.f4579v
            O3.Y0 r2 = (O3.Y0) r2
            O3.b1 r3 = r2.f4684q
            r3.o()
            java.lang.Object r4 = r3.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            O3.r0 r5 = r3.f4755I
            java.lang.Object r6 = r1.f4576s
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.f4578u
            android.net.Uri r7 = (android.net.Uri) r7
            O3.Y1 r8 = r4.f5080y     // Catch: java.lang.RuntimeException -> L1d8
            O3.X r9 = r4.f5077v     // Catch: java.lang.RuntimeException -> L1d8
            O3.C0323t0.j(r8)     // Catch: java.lang.RuntimeException -> L1d8
            java.lang.String r10 = "https://google.com/search?"
            boolean r11 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.RuntimeException -> L1d4
            java.lang.String r12 = "_cis"
            java.lang.String r13 = "Activity created with data 'referrer' without required params"
            java.lang.String r14 = "utm_medium"
            java.lang.String r15 = "utm_source"
            r16 = r11
            java.lang.String r11 = "utm_campaign"
            r17 = r2
            java.lang.String r2 = "gclid"
            if (r16 == 0) goto L90
            r16 = r9
        L8e:
            r8 = 0
            goto Lfb
        L90:
            boolean r16 = r6.contains(r2)     // Catch: java.lang.RuntimeException -> Le1
            if (r16 != 0) goto Le6
            r16 = r9
            java.lang.String r9 = "gbraid"
            boolean r9 = r6.contains(r9)     // Catch: java.lang.RuntimeException -> Le1
            if (r9 != 0) goto Le8
            boolean r9 = r6.contains(r11)     // Catch: java.lang.RuntimeException -> Le1
            if (r9 != 0) goto Le8
            boolean r9 = r6.contains(r15)     // Catch: java.lang.RuntimeException -> Le1
            if (r9 != 0) goto Le8
            boolean r9 = r6.contains(r14)     // Catch: java.lang.RuntimeException -> Le1
            if (r9 != 0) goto Le8
            java.lang.String r9 = "utm_id"
            boolean r9 = r6.contains(r9)     // Catch: java.lang.RuntimeException -> Le1
            if (r9 != 0) goto Le8
            java.lang.String r9 = "dclid"
            boolean r9 = r6.contains(r9)     // Catch: java.lang.RuntimeException -> Le1
            if (r9 != 0) goto Le8
            java.lang.String r9 = "srsltid"
            boolean r9 = r6.contains(r9)     // Catch: java.lang.RuntimeException -> Le1
            if (r9 != 0) goto Le8
            java.lang.String r9 = "sfmc_id"
            boolean r9 = r6.contains(r9)     // Catch: java.lang.RuntimeException -> Le1
            if (r9 != 0) goto Le8
            java.lang.Object r8 = r8.f4346r     // Catch: java.lang.RuntimeException -> Le1
            O3.t0 r8 = (O3.C0323t0) r8     // Catch: java.lang.RuntimeException -> Le1
            O3.X r8 = r8.f5077v     // Catch: java.lang.RuntimeException -> Le1
            O3.C0323t0.l(r8)     // Catch: java.lang.RuntimeException -> Le1
            O3.V r8 = r8.f4665D     // Catch: java.lang.RuntimeException -> Le1
            r8.b(r13)     // Catch: java.lang.RuntimeException -> Le1
            goto L8e
        Le1:
            r0 = move-exception
        Le2:
            r2 = r17
            goto L1dd
        Le6:
            r16 = r9
        Le8:
            java.lang.String r9 = r10.concat(r6)     // Catch: java.lang.RuntimeException -> Le1
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.RuntimeException -> Le1
            android.os.Bundle r8 = r8.n0(r9)     // Catch: java.lang.RuntimeException -> Le1
            if (r8 == 0) goto Lfb
            java.lang.String r9 = "referrer"
            r8.putString(r12, r9)     // Catch: java.lang.RuntimeException -> Le1
        Lfb:
            java.lang.Object r9 = r1.f4575r
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = r1.f4577t
            r18 = r10
            java.lang.String r10 = "_cmp"
            if (r18 == 0) goto L146
            O3.Y1 r1 = r4.f5080y     // Catch: java.lang.RuntimeException -> Le1
            O3.C0323t0.j(r1)     // Catch: java.lang.RuntimeException -> Le1
            android.os.Bundle r1 = r1.n0(r7)     // Catch: java.lang.RuntimeException -> Le1
            if (r1 == 0) goto L146
            java.lang.String r7 = "intent"
            r1.putString(r12, r7)     // Catch: java.lang.RuntimeException -> Le1
            boolean r7 = r1.containsKey(r2)     // Catch: java.lang.RuntimeException -> Le1
            if (r7 != 0) goto L13d
            if (r8 == 0) goto L13d
            boolean r7 = r8.containsKey(r2)     // Catch: java.lang.RuntimeException -> Le1
            if (r7 == 0) goto L13d
            java.lang.String r7 = "_cer"
            java.lang.String r12 = r8.getString(r2)     // Catch: java.lang.RuntimeException -> Le1
            r18 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Le1
            r13.<init>(r0)     // Catch: java.lang.RuntimeException -> Le1
            r13.append(r12)     // Catch: java.lang.RuntimeException -> Le1
            java.lang.String r0 = r13.toString()     // Catch: java.lang.RuntimeException -> Le1
            r1.putString(r7, r0)     // Catch: java.lang.RuntimeException -> Le1
            goto L13f
        L13d:
            r18 = r13
        L13f:
            r3.v(r9, r10, r1)     // Catch: java.lang.RuntimeException -> Le1
            r5.a(r9, r1)     // Catch: java.lang.RuntimeException -> Le1
            goto L148
        L146:
            r18 = r13
        L148:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.RuntimeException -> Le1
            if (r0 == 0) goto L150
            goto L1ef
        L150:
            O3.C0323t0.l(r16)     // Catch: java.lang.RuntimeException -> Le1
            r0 = r16
            O3.V r1 = r0.f4665D     // Catch: java.lang.RuntimeException -> Le1
            java.lang.String r7 = "Activity created with referrer"
            r1.c(r6, r7)     // Catch: java.lang.RuntimeException -> Le1
            O3.g r7 = r4.f5075t     // Catch: java.lang.RuntimeException -> Le1
            O3.E r12 = O3.F.f4374G0     // Catch: java.lang.RuntimeException -> Le1
            r13 = 0
            boolean r7 = r7.y(r13, r12)     // Catch: java.lang.RuntimeException -> Le1
            if (r7 == 0) goto L18b
            if (r8 == 0) goto L170
            r3.v(r9, r10, r8)     // Catch: java.lang.RuntimeException -> Le1
            r5.a(r9, r8)     // Catch: java.lang.RuntimeException -> Le1
            goto L178
        L170:
            O3.C0323t0.l(r0)     // Catch: java.lang.RuntimeException -> Le1
            java.lang.String r0 = "Referrer does not contain valid parameters"
            r1.c(r6, r0)     // Catch: java.lang.RuntimeException -> Le1
        L178:
            B3.a r0 = r4.f5052A     // Catch: java.lang.RuntimeException -> Le1
            r0.getClass()     // Catch: java.lang.RuntimeException -> Le1
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.RuntimeException -> Le1
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_ldl"
            r7 = 1
            r6 = r13
            r3.y(r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> Le1
            goto L1ef
        L18b:
            boolean r2 = r6.contains(r2)     // Catch: java.lang.RuntimeException -> Le1
            if (r2 == 0) goto L1cb
            boolean r2 = r6.contains(r11)     // Catch: java.lang.RuntimeException -> Le1
            if (r2 != 0) goto L1b3
            boolean r2 = r6.contains(r15)     // Catch: java.lang.RuntimeException -> Le1
            if (r2 != 0) goto L1b3
            boolean r2 = r6.contains(r14)     // Catch: java.lang.RuntimeException -> Le1
            if (r2 != 0) goto L1b3
            java.lang.String r2 = "utm_term"
            boolean r2 = r6.contains(r2)     // Catch: java.lang.RuntimeException -> Le1
            if (r2 != 0) goto L1b3
            java.lang.String r2 = "utm_content"
            boolean r2 = r6.contains(r2)     // Catch: java.lang.RuntimeException -> Le1
            if (r2 == 0) goto L1cb
        L1b3:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.RuntimeException -> Le1
            if (r0 != 0) goto L1ef
            B3.a r0 = r4.f5052A     // Catch: java.lang.RuntimeException -> Le1
            r0.getClass()     // Catch: java.lang.RuntimeException -> Le1
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.RuntimeException -> Le1
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_ldl"
            r7 = 1
            r3.y(r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> Le1
            goto L1ef
        L1cb:
            O3.C0323t0.l(r0)     // Catch: java.lang.RuntimeException -> Le1
            r0 = r18
            r1.b(r0)     // Catch: java.lang.RuntimeException -> Le1
            goto L1ef
        L1d4:
            r0 = move-exception
            r17 = r2
            goto L1dd
        L1d8:
            r0 = move-exception
            r17 = r2
            goto Le2
        L1dd:
            O3.b1 r1 = r2.f4684q
            java.lang.Object r1 = r1.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            O3.X r1 = r1.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4670w
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.c(r0, r2)
        L1ef:
            return
        L1f0:
            java.lang.Object r0 = r1.f4575r
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r1.f4576s
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r1.f4579v
            O3.b1 r0 = (O3.C0271b1) r0
            java.lang.Object r0 = r0.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.w1 r3 = r0.o()
            java.lang.Object r0 = r1.f4578u
            r4 = r0
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4
            r3.o()
            r3.p()
            r0 = 0
            O3.a2 r7 = r3.E(r0)
            O3.n1 r2 = new O3.n1
            boolean r8 = r1.f4577t
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r3.C(r2)
            return
        L221:
            java.lang.Object r0 = r1.f4579v
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            O3.t0 r0 = r0.f11336c
            O3.w1 r3 = r0.o()
            java.lang.Object r0 = r1.f4578u
            r8 = r0
            com.google.android.gms.internal.measurement.L r8 = (com.google.android.gms.internal.measurement.L) r8
            java.lang.Object r0 = r1.f4575r
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r1.f4576s
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r3.o()
            r3.p()
            r0 = 0
            O3.a2 r6 = r3.E(r0)
            O3.n1 r2 = new O3.n1
            boolean r7 = r1.f4577t
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r3.C(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T0.run():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public T0(C0271b1 c0271b1, AtomicReference atomicReference, String str, String str2, boolean z5) {
        this.f4578u = atomicReference;
        this.f4575r = str;
        this.f4576s = str2;
        this.f4577t = z5;
        Objects.requireNonNull(c0271b1);
        this.f4579v = c0271b1;
    }

    public T0(C0333w1 c0333w1, a2 a2Var, boolean z5, C0325u c0325u, Bundle bundle) {
        this.f4578u = a2Var;
        this.f4577t = z5;
        this.f4575r = c0325u;
        this.f4576s = bundle;
        Objects.requireNonNull(c0333w1);
        this.f4579v = c0333w1;
    }

    public T0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.L l7, String str, String str2, boolean z5) {
        this.f4578u = l7;
        this.f4575r = str;
        this.f4576s = str2;
        this.f4577t = z5;
        this.f4579v = appMeasurementDynamiteService;
    }
}
