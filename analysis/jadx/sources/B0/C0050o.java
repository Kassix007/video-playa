package B0;

import E.C0137u;
import J1.AbstractComponentCallbacksC0185q;
import O3.C0271b1;
import O3.C0284g;
import O3.C0288h0;
import O3.C0323t0;
import O3.D1;
import O3.I1;
import O3.L0;
import O3.P0;
import P.C0345b;
import P.C0348c0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import R4.C0468k1;
import R4.C0520x2;
import R4.C0528z2;
import R4.Z0;
import a.AbstractC0597a;
import android.animation.Animator;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.view.animation.Animation;
import androidx.work.impl.WorkDatabaseVersions;
import c0.AbstractC0724l;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.web2native.MainActivity;
import h.AbstractActivityC1106h;
import j5.C1166c;
import j5.C1167d;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import n5.AbstractC1397A;
import r.C1543B;
import r.C1544C;
import r.C1548G;
import r1.InterfaceC1573a;
import s.C1586b;
import x3.C1899k;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: B0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0050o implements B2.h, z0.U, E1.s, S3.a, InterfaceC1573a, L0, P2.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f500r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0050o(Object obj, Object obj2) {
        this.f499q = obj;
        this.f500r = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0070 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x007f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x0038 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x0079 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void n(L l7) {
        if (l7.f269V.f302d == G.f229u && !l7.p() && !l7.q() && !l7.f278e0 && l7.G()) {
            AbstractC0724l abstractC0724l = l7.f268U.f433e;
            if ((abstractC0724l.f10103t & 256) != 0) {
                while (abstractC0724l != null) {
                    if ((abstractC0724l.f10102s & 256) != 0) {
                        ?? F6 = abstractC0724l;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            if (F6 instanceof InterfaceC0052q) {
                                InterfaceC0052q interfaceC0052q = (InterfaceC0052q) F6;
                                interfaceC0052q.g(AbstractC0041g.s(interfaceC0052q, 256));
                            } else if ((F6.f10102s & 256) != 0 && (F6 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l2 = ((AbstractC0049n) F6).f473F;
                                int i = 0;
                                F6 = F6;
                                eVar = eVar;
                                while (abstractC0724l2 != null) {
                                    if ((abstractC0724l2.f10102s & 256) != 0) {
                                        i++;
                                        eVar = eVar;
                                        if (i == 1) {
                                            F6 = abstractC0724l2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar.c(F6);
                                                F6 = 0;
                                            }
                                            eVar.c(abstractC0724l2);
                                        }
                                    }
                                    abstractC0724l2 = abstractC0724l2.f10105v;
                                    F6 = F6;
                                    eVar = eVar;
                                }
                                if (i == 1) {
                                }
                            }
                            F6 = AbstractC0041g.f(eVar);
                        }
                    }
                    if ((abstractC0724l.f10103t & 256) == 0) {
                        break;
                    } else {
                        abstractC0724l = abstractC0724l.f10105v;
                    }
                }
            }
        }
        l7.f277d0 = false;
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i7 = eVarW.f6678s;
        for (int i8 = 0; i8 < i7; i8++) {
            n((L) objArr[i8]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.A(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.B(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void C(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.C(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void D(String str, String str2, Bundle bundle, long j) {
        try {
            ((com.google.android.gms.internal.measurement.S) this.f499q).j(str, str2, bundle, j);
        } catch (RemoteException e7) {
            C0323t0 c0323t0 = ((AppMeasurementDynamiteService) this.f500r).f11336c;
            if (c0323t0 != null) {
                O3.X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4673z.c(e7, "Event interceptor threw exception");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean E() {
        return !(((F0) ((k3.d) this.f500r).f14122r).isEmpty() && ((F0) ((k3.d) this.f499q).f14122r).isEmpty());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void F(Throwable th) {
        I1 i12 = (I1) this.f499q;
        C0271b1 c0271b1 = (C0271b1) this.f500r;
        c0271b1.o();
        c0271b1.f4767z = false;
        C0323t0 c0323t0 = (C0323t0) c0271b1.f4346r;
        C0284g c0284g = c0323t0.f5075t;
        O3.X x6 = c0323t0.f5077v;
        int i = 2;
        if (c0284g.y(null, O3.F.T0)) {
            String message = th.getMessage();
            c0271b1.f4751E = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        c0271b1.f4751E = true;
                    }
                    i = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i = 3;
                }
            }
        }
        int i7 = i - 1;
        if (i7 == 0) {
            C0323t0.l(x6);
            x6.f4673z.d(O3.X.w(c0323t0.q().u()), O3.X.w(th.toString()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable");
            c0271b1.f4747A = 1;
            c0271b1.L().add(i12);
            return;
        }
        if (i7 != 1) {
            C0323t0.l(x6);
            x6.f4670w.d(O3.X.w(c0323t0.q().u()), th, "registerTriggerAsync failed. Dropping URI. App ID, Throwable");
            J();
            c0271b1.f4747A = 1;
            c0271b1.M();
            return;
        }
        c0271b1.L().add(i12);
        if (c0271b1.f4747A > ((Integer) O3.F.f4464w0.a(null)).intValue()) {
            c0271b1.f4747A = 1;
            C0323t0.l(x6);
            x6.f4673z.d(O3.X.w(c0323t0.q().u()), O3.X.w(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        C0323t0.l(x6);
        x6.f4673z.e("registerTriggerAsync failed. App ID, delay in seconds, throwable", O3.X.w(c0323t0.q().u()), O3.X.w(String.valueOf(c0271b1.f4747A)), O3.X.w(th.toString()));
        int i8 = c0271b1.f4747A;
        if (c0271b1.f4748B == null) {
            c0271b1.f4748B = new P0(c0271b1, c0323t0, 1);
        }
        c0271b1.f4748B.b(((long) i8) * 1000);
        int i9 = c0271b1.f4747A;
        c0271b1.f4747A = i9 + i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 U2.n, still in use, count: 3, list:
          (r1v0 U2.n) from 0x0096: MOVE (r18v0 U2.n) = (r1v0 U2.n) (LINE:151)
          (r1v0 U2.n) from 0x007b: MOVE (r18v3 U2.n) = (r1v0 U2.n) (LINE:124)
          (r1v0 U2.n) from 0x0084: MOVE (r18v5 U2.n) = (r1v0 U2.n) (LINE:133)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public U2.n G(U2.g r20, V2.h r21) {
        /*
            r19 = this;
            r0 = r20
            U2.n r1 = new U2.n
            r2 = r1
            android.content.Context r1 = r0.f7658a
            V2.g r3 = r0.f7669o
            V2.d r4 = r0.f7670p
            q6.l r6 = r0.f7661d
            U2.b r7 = r0.f7664h
            U2.b r8 = r0.i
            U2.b r9 = r0.j
            I2.l r5 = U2.i.f7678a
            java.lang.Object r10 = I2.q.d(r0, r5)
            android.graphics.Bitmap$Config r10 = (android.graphics.Bitmap.Config) r10
            I2.l r11 = U2.i.f
            java.lang.Object r12 = I2.q.d(r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            I2.l r13 = U2.h.f7674a
            java.lang.Object r14 = I2.q.d(r0, r13)
            java.util.List r14 = (java.util.List) r14
            boolean r14 = r14.isEmpty()
            r16 = 0
            if (r14 != 0) goto L4b
            android.graphics.Bitmap$Config[] r14 = Y2.j.f8215a
            java.lang.Object r17 = I2.q.d(r0, r5)
            r15 = r17
            android.graphics.Bitmap$Config r15 = (android.graphics.Bitmap.Config) r15
            boolean r14 = n5.k.z0(r14, r15)
            if (r14 == 0) goto L48
            goto L4b
        L48:
            r14 = r16
            goto L4c
        L4b:
            r14 = 1
        L4c:
            java.lang.Object r15 = I2.q.d(r0, r5)
            android.graphics.Bitmap$Config r15 = (android.graphics.Bitmap.Config) r15
            boolean r15 = l6.d.v(r15)
            if (r15 == 0) goto L92
            java.lang.Object r15 = I2.q.d(r0, r5)
            android.graphics.Bitmap$Config r15 = (android.graphics.Bitmap.Config) r15
            boolean r15 = l6.d.v(r15)
            if (r15 != 0) goto L69
        L64:
            r15 = r19
            r17 = r1
            goto L80
        L69:
            I2.l r15 = U2.i.f7682e
            java.lang.Object r15 = I2.q.d(r0, r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L64
            r15 = r19
            r17 = r1
            r18 = r2
            r2 = r21
            goto L8f
        L80:
            java.lang.Object r1 = r15.f500r
            Y2.c r1 = (Y2.c) r1
            r18 = r2
            r2 = r21
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L8f
            goto L9a
        L8f:
            r1 = r16
            goto L9b
        L92:
            r15 = r19
            r17 = r1
            r18 = r2
            r2 = r21
        L9a:
            r1 = 1
        L9b:
            if (r14 == 0) goto La0
            if (r1 == 0) goto La0
            goto La2
        La0:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
        La2:
            if (r12 == 0) goto Lb6
            java.lang.Object r1 = I2.q.d(r0, r13)
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lb6
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            if (r10 == r1) goto Lb6
            r1 = 1
            goto Lb8
        Lb6:
            r1 = r16
        Lb8:
            U2.e r12 = r0.f7673s
            I2.m r12 = r12.f7652n
            java.util.Map r12 = r12.f2367a
            I2.m r13 = r0.f7671q
            java.util.Map r13 = r13.f2367a
            java.util.LinkedHashMap r12 = n5.x.K(r12, r13)
            java.util.LinkedHashMap r12 = n5.x.P(r12)
            java.lang.Object r13 = I2.q.d(r0, r5)
            android.graphics.Bitmap$Config r13 = (android.graphics.Bitmap.Config) r13
            if (r10 == r13) goto Ldb
            if (r10 == 0) goto Ld8
            r12.put(r5, r10)
            goto Ldb
        Ld8:
            r12.remove(r5)
        Ldb:
            java.lang.Object r0 = I2.q.d(r0, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r1 == r0) goto Lee
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r12.put(r11, r0)
        Lee:
            I2.m r10 = new I2.m
            java.util.Map r0 = n5.AbstractC1397A.F(r12)
            r10.<init>(r0)
            r5 = 0
            r1 = r17
            r0 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0050o.G(U2.g, V2.h):U2.n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U2.n H(U2.n nVar) {
        I2.m mVar;
        boolean z5;
        I2.m mVar2 = nVar.j;
        I2.l lVar = U2.i.f7678a;
        if (!l6.d.v((Bitmap.Config) I2.q.e(nVar, lVar)) || ((Y2.c) this.f500r).a()) {
            mVar = mVar2;
            z5 = false;
        } else {
            mVar2.getClass();
            LinkedHashMap linkedHashMapP = n5.x.P(mVar2.f2367a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapP.put(lVar, config);
            } else {
                linkedHashMapP.remove(lVar);
            }
            I2.m mVar3 = new I2.m(AbstractC1397A.F(linkedHashMapP));
            z5 = true;
            mVar = mVar3;
        }
        return z5 ? new U2.n(nVar.f7686a, nVar.f7687b, nVar.f7688c, nVar.f7689d, nVar.f7690e, nVar.f, nVar.f7691g, nVar.f7692h, nVar.i, mVar) : nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void I(P.V v6) {
        Object objG = ((C1548G) this.f500r).g(v6);
        if (objG != null) {
            if (!(objG instanceof C1544C)) {
                throw new ClassCastException();
            }
            C1544C c1544c = (C1544C) objG;
            Object[] objArr = c1544c.f16114a;
            if (c1544c.f16115b <= 0) {
                return;
            }
            kotlin.jvm.internal.m.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void J() {
        C0323t0 c0323t0 = (C0323t0) ((C0271b1) this.f500r).f4346r;
        C0288h0 c0288h0 = c0323t0.f5076u;
        C0323t0.j(c0288h0);
        SparseArray sparseArrayU = c0288h0.u();
        I1 i12 = (I1) this.f499q;
        sparseArrayU.put(i12.f4495s, Long.valueOf(i12.f4494r));
        C0288h0 c0288h02 = c0323t0.f5076u;
        C0323t0.j(c0288h02);
        int[] iArr = new int[sparseArrayU.size()];
        long[] jArr = new long[sparseArrayU.size()];
        for (int i = 0; i < sparseArrayU.size(); i++) {
            iArr[i] = sparseArrayU.keyAt(i);
            jArr[i] = ((Long) sparseArrayU.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c0288h02.f4881E.F(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B2.h
    public void a(B2.a aVar, Bitmap bitmap, Map map) {
        int i;
        int iY = AbstractC0597a.y(bitmap);
        B2.e eVar = (B2.e) this.f500r;
        synchronized (((C1586b) eVar.f12095g)) {
            i = eVar.f12091b;
        }
        if (iY <= i) {
            ((B2.e) this.f500r).l(aVar, new B2.d(bitmap, map, iY));
        } else {
            ((B2.e) this.f500r).m(aVar);
            ((B2.g) this.f499q).c(aVar, bitmap, map, iY);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.U
    public void b(r.V v6) {
        C1543B c1543b = (C1543B) this.f500r;
        c1543b.a();
        Iterator it = v6.iterator();
        while (true) {
            I5.h hVar = (I5.h) it;
            if (!hVar.hasNext()) {
                return;
            }
            Object next = hVar.next();
            Object objB = ((C0137u) this.f499q).b(next);
            int iD = c1543b.d(objB);
            int i = iD >= 0 ? c1543b.f16111c[iD] : 0;
            if (i == 7) {
                v6.remove(next);
            } else {
                c1543b.g(i + 1, objB);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public long c() {
        return ((D1) this.f500r).b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public void clear() {
        ((D1) this.f500r).d(-1L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.s
    public boolean d(CharSequence charSequence, int i, int i7, E1.A a7) {
        if ((a7.f1617c & 4) > 0) {
            return true;
        }
        if (((E1.D) this.f499q) == null) {
            this.f499q = new E1.D(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C1899k) this.f500r).getClass();
        ((E1.D) this.f499q).setSpan(new E1.B(a7), i, i7, 33);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public boolean e(P2.a aVar) {
        D1 d12 = (D1) this.f500r;
        Object objRemove = ((LinkedHashMap) d12.f4349c).remove(aVar);
        if (objRemove != null) {
            d12.f4348b = d12.b() - d12.c(aVar, objRemove);
            d12.a(aVar, objRemove, null);
        }
        return objRemove != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.U
    public boolean f(Object obj, Object obj2) {
        C0137u c0137u = (C0137u) this.f499q;
        return kotlin.jvm.internal.m.a(c0137u.b(obj), c0137u.b(obj2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B2.h
    public B2.b g(B2.a aVar) {
        B2.d dVar = (B2.d) ((B2.e) this.f500r).h(aVar);
        if (dVar != null) {
            return new B2.b(dVar.f541a, dVar.f542b);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.s
    public Object getResult() {
        return (E1.D) this.f499q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(int i, C0371o c0371o) {
        C0371o c0371o2;
        P.W wJ;
        P.W wJ2;
        Z4.M m4 = (Z4.M) this.f500r;
        C0468k1 c0468k1 = (C0468k1) this.f499q;
        c0371o.U(185842422);
        int i7 = (c0371o.i(this) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            P5.S s6 = m4 != null ? m4.f8480e : null;
            if (s6 == null) {
                c0371o.S(218851931);
                c0371o.p(false);
                wJ = null;
            } else {
                c0371o.S(-1794055578);
                wJ = C0345b.j(s6, c0371o);
                c0371o.p(false);
            }
            kotlin.jvm.internal.m.b(wJ);
            P5.D d5 = m4 != null ? m4.f8481g : null;
            if (d5 == null) {
                c0371o.S(218955099);
                c0371o.p(false);
                wJ2 = null;
            } else {
                c0371o.S(-1794052250);
                wJ2 = C0345b.j(d5, c0371o);
                c0371o.p(false);
            }
            kotlin.jvm.internal.m.b(wJ2);
            c0371o2 = c0371o;
            Z4.L.d(c0468k1.f7071c, c0468k1.f7084k, c0468k1.f7067a, (Z4.M) this.f500r, c0371o2, 4096);
            if (((Boolean) wJ.getValue()) != null) {
                C1167d c1167d = c0468k1.f7098t;
                Boolean bool = (Boolean) wJ.getValue();
                kotlin.jvm.internal.m.b(bool);
                P5.S s7 = c1167d.f13890x;
                s7.getClass();
                s7.h(null, bool);
                if (((Boolean) wJ2.getValue()) != null) {
                    C1167d c1167d2 = c0468k1.f7098t;
                    Boolean bool2 = (Boolean) wJ2.getValue();
                    kotlin.jvm.internal.m.b(bool2);
                    P5.S s8 = c1167d2.f13892z;
                    s8.getClass();
                    s8.h(null, bool2);
                }
            }
        } else {
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new J5.u(i, 6, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public P2.b i(P2.a aVar) {
        P2.d dVar = (P2.d) ((LinkedHashMap) ((D1) this.f500r).f4349c).get(aVar);
        if (dVar != null) {
            return new P2.b(dVar.f5621a, dVar.f5622b);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B2.h
    public void j(int i) {
        int i7;
        if (i >= 40) {
            ((B2.e) this.f500r).p(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        B2.e eVar = (B2.e) this.f500r;
        synchronized (((C1586b) eVar.f12095g)) {
            i7 = eVar.f12092c;
        }
        eVar.p(i7 / 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(int i, C0371o c0371o) {
        P.W wJ;
        C0468k1 c0468k1 = (C0468k1) this.f499q;
        c0371o.U(1109456525);
        int i7 = (c0371o.i(this) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = new C0348c0(0);
                c0371o.d0(objH);
            }
            C0348c0 c0348c0 = (C0348c0) objH;
            a5.y yVar = (a5.y) this.f500r;
            P5.D d5 = yVar != null ? yVar.i : null;
            if (d5 == null) {
                c0371o.S(2046175588);
                c0371o.p(false);
                wJ = null;
            } else {
                c0371o.S(1035836989);
                wJ = C0345b.j(d5, c0371o);
                c0371o.p(false);
            }
            Boolean bool = Boolean.TRUE;
            boolean zI = c0371o.i(this);
            Object objH2 = c0371o.H();
            if (zI || objH2 == s6) {
                objH2 = new C0528z2(this, c0348c0, null);
                c0371o.d0(objH2);
            }
            C0345b.e((B5.e) objH2, c0371o, bool);
            if (c0348c0.e() == -1 || wJ == null || !((Boolean) wJ.getValue()).booleanValue()) {
                c0371o.S(2045036277);
            } else {
                c0371o.S(2047466677);
                MainActivity mainActivity = c0468k1.f7071c;
                int iE = c0348c0.e();
                MainActivity mainActivity2 = c0468k1.f7069b;
                int i8 = c0468k1.f7067a.getResources().getConfiguration().orientation;
                a5.y yVar2 = (a5.y) this.f500r;
                boolean zI2 = c0371o.i(this);
                Object objH3 = c0371o.H();
                if (zI2 || objH3 == s6) {
                    objH3 = new C0520x2(0, this);
                    c0371o.d0(objH3);
                }
                C3.a.j(mainActivity, iE, mainActivity2, i8, yVar2, (B5.c) objH3, c0371o, 32768);
            }
            c0371o.p(false);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new J5.u(i, 8, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(L l7, boolean z5) {
        k3.d dVar = (k3.d) this.f500r;
        k3.d dVar2 = (k3.d) this.f499q;
        if (z5) {
            dVar2.s(l7);
            dVar.s(l7);
        } else {
            if (((F0) dVar2.f14122r).contains(l7)) {
                return;
            }
            dVar.s(l7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public void m(P2.a aVar, I2.n nVar, Map map, long j) {
        D1 d12 = (D1) this.f500r;
        long j7 = d12.f4347a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) d12.f4349c;
        if (j > j7) {
            Object objRemove = linkedHashMap.remove(aVar);
            if (objRemove != null) {
                d12.f4348b = d12.b() - d12.c(aVar, objRemove);
                d12.a(aVar, objRemove, null);
            }
            ((B2.g) this.f499q).d(aVar, nVar, map, j);
            return;
        }
        P2.d dVar = new P2.d(nVar, map, j);
        Object objPut = linkedHashMap.put(aVar, dVar);
        d12.f4348b = d12.c(aVar, dVar) + d12.b();
        if (objPut != null) {
            d12.f4348b = d12.b() - d12.c(aVar, objPut);
            d12.a(aVar, objPut, dVar);
        }
        d12.d(d12.f4347a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // r1.InterfaceC1573a
    public void onCancel() {
        ((Animator) this.f499q).end();
        if (J1.H.F(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((J1.T) this.f500r) + " has been canceled.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.a
    public void onComplete(S3.d dVar) {
        E4.k kVar = (E4.k) this.f499q;
        S3.e eVar = (S3.e) this.f500r;
        synchronized (kVar.f) {
            kVar.f1743e.remove(eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P2.f
    public void p(long j) {
        ((D1) this.f500r).d(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(boolean z5) {
        J1.H h4 = (J1.H) this.f500r;
        AbstractActivityC1106h abstractActivityC1106h = h4.f2541t.f2735u;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = h4.f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v(boolean z5) {
        J1.H h4 = (J1.H) this.f500r;
        AbstractActivityC1106h abstractActivityC1106h = h4.f2541t.f2735u;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = h4.f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void w(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void x(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.y(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void z(boolean z5) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((J1.H) this.f500r).f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            abstractComponentCallbacksC0185q.k().f2533l.z(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f499q).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0050o(Object obj, Object obj2, boolean z5) {
        this.f499q = obj2;
        this.f500r = obj;
    }

    public C0050o(C0468k1 dataObject, int i) {
        androidx.lifecycle.J j;
        androidx.lifecycle.J j7;
        androidx.lifecycle.J j8;
        switch (i) {
            case 26:
                kotlin.jvm.internal.m.e(dataObject, "dataObject");
                this.f499q = dataObject;
                this.f500r = new Z4.M();
                break;
            case 27:
                kotlin.jvm.internal.m.e(dataObject, "dataObject");
                this.f499q = dataObject;
                String strV = AbstractC1918b.v(dataObject.f7071c);
                a5.y yVar = new a5.y();
                this.f500r = yVar;
                yVar.f = strV;
                a6.q qVarD = E3.h.d(new Z4.G(2));
                String str = yVar.f;
                yVar.f9012g = str != null ? (a5.l) qVarD.a(a5.l.Companion.serializer(), str) : null;
                break;
            default:
                kotlin.jvm.internal.m.e(dataObject, "dataObject");
                MainActivity mainActivity = dataObject.f7069b;
                this.f499q = dataObject;
                C1166c c1166c = dataObject.f7097s;
                if (c1166c != null && (j8 = c1166c.f13865h) != null) {
                    j8.e(mainActivity, new R4.N(new Z0(0, this), 2));
                }
                C1166c c1166c2 = dataObject.f7097s;
                if (c1166c2 != null && (j7 = c1166c2.i) != null) {
                    j7.e(mainActivity, new R4.N(new Z0(1, this), 2));
                }
                C1166c c1166c3 = dataObject.f7097s;
                if (c1166c3 != null && (j = c1166c3.j) != null) {
                    j.e(mainActivity, new R4.N(new Z0(2, this), 2));
                }
                MainActivity mainActivity2 = dataObject.f7067a;
                kotlin.jvm.internal.m.b(dataObject.f7055O);
                this.f500r = new Y4.d(mainActivity2, dataObject.f7085k0, new Z0(3, this));
                break;
        }
    }

    public C0050o(int i) {
        switch (i) {
            case 2:
                this.f499q = new R.e(new L[16]);
                break;
            case 4:
                this.f499q = new R.e(new Reference[16]);
                this.f500r = new ReferenceQueue();
                break;
            case 14:
                this.f499q = new LinkedHashMap();
                this.f500r = new LinkedHashMap();
                break;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                this.f499q = new O3.D(10);
                this.f500r = new d2.d0(16);
                break;
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                this.f499q = new C1548G();
                this.f500r = new C1548G();
                break;
            default:
                this.f499q = new k3.d(1);
                this.f500r = new k3.d(1);
                break;
        }
    }

    public C0050o(Animation animation) {
        this.f499q = animation;
        this.f500r = null;
    }
}
