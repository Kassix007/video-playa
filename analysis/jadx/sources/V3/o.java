package v3;

import C0.S;
import F.D;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.K1;
import i3.C1136a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p3.z0;
import r.C1554e;
import r.C1555f;
import u3.InterfaceC1697b;
import x3.AbstractC1887A;
import x3.AbstractC1893e;

/* JADX INFO: loaded from: classes.dex */
public final class o implements u3.e, u3.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1697b f17583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1763a f17584e;
    public final l f;
    public final int i;
    public final x j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17587k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f17590n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f17582c = new LinkedList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f17585g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f17586h = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f17588l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.google.android.gms.common.b f17589m = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: u3.b */
    /* JADX WARN: Multi-variable type inference failed */
    public o(e eVar, u3.d dVar) {
        this.f17590n = eVar;
        Looper looper = eVar.f17574m.getLooper();
        t2.e eVarA = dVar.a();
        z0 z0Var = new z0((C1555f) eVarA.f16684q, (String) eVarA.f16685r, (String) eVarA.f16686s);
        K1 k12 = (K1) dVar.f17198c.f8312r;
        AbstractC1887A.g(k12);
        InterfaceC1697b interfaceC1697bG = k12.g(dVar.f17196a, looper, z0Var, dVar.f17199d, this, this);
        String str = dVar.f17197b;
        if (str != null && (interfaceC1697bG instanceof AbstractC1893e)) {
            ((AbstractC1893e) interfaceC1697bG).f18426I = str;
        }
        if (str != null && (interfaceC1697bG instanceof h)) {
            S.t(interfaceC1697bG);
            throw null;
        }
        this.f17583d = interfaceC1697bG;
        this.f17584e = dVar.f17200e;
        this.f = new l(0);
        this.i = dVar.f17201g;
        if (!interfaceC1697bG.k()) {
            this.j = null;
            return;
        }
        Context context = eVar.f17569e;
        I3.e eVar2 = eVar.f17574m;
        t2.e eVarA2 = dVar.a();
        this.j = new x(context, eVar2, new z0((C1555f) eVarA2.f16684q, (String) eVarA2.f16685r, (String) eVarA2.f16686s));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(com.google.android.gms.common.b bVar) {
        HashSet hashSet = this.f17585g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (AbstractC1887A.j(bVar, com.google.android.gms.common.b.f10321u)) {
                this.f17583d.h();
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Status status) {
        AbstractC1887A.c(this.f17590n.f17574m);
        c(status, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Status status, Exception exc, boolean z5) {
        AbstractC1887A.c(this.f17590n.f17574m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f17582c.iterator();
        while (it.hasNext()) {
            B b7 = (B) it.next();
            if (!z5 || b7.f17549a == 2) {
                if (status != null) {
                    b7.a(status);
                } else {
                    b7.b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        LinkedList linkedList = this.f17582c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            B b7 = (B) arrayList.get(i);
            if (!this.f17583d.a()) {
                return;
            }
            if (h(b7)) {
                linkedList.remove(b7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        e eVar = this.f17590n;
        AbstractC1887A.c(eVar.f17574m);
        this.f17589m = null;
        a(com.google.android.gms.common.b.f10321u);
        I3.e eVar2 = eVar.f17574m;
        if (this.f17587k) {
            C1763a c1763a = this.f17584e;
            eVar2.removeMessages(11, c1763a);
            eVar2.removeMessages(9, c1763a);
            this.f17587k = false;
        }
        Iterator it = this.f17586h.values().iterator();
        if (it.hasNext()) {
            throw k1.i.h(it);
        }
        d();
        g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        e eVar = this.f17590n;
        I3.e eVar2 = eVar.f17574m;
        AbstractC1887A.c(eVar.f17574m);
        this.f17589m = null;
        this.f17587k = true;
        String strI = this.f17583d.i();
        l lVar = this.f;
        lVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strI != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strI);
        }
        lVar.c(true, new Status(20, sb.toString(), null, null));
        C1763a c1763a = this.f17584e;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, c1763a), 5000L);
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 11, c1763a), 120000L);
        ((SparseIntArray) eVar.f17570g.f17579r).clear();
        Iterator it = this.f17586h.values().iterator();
        if (it.hasNext()) {
            throw k1.i.h(it);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        e eVar = this.f17590n;
        I3.e eVar2 = eVar.f17574m;
        C1763a c1763a = this.f17584e;
        eVar2.removeMessages(12, c1763a);
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, c1763a), eVar.f17565a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(B b7) {
        com.google.android.gms.common.d dVar;
        if (!(b7 instanceof u)) {
            l lVar = this.f;
            InterfaceC1697b interfaceC1697b = this.f17583d;
            b7.d(lVar, interfaceC1697b.k());
            try {
                b7.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                interfaceC1697b.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        u uVar = (u) b7;
        com.google.android.gms.common.d[] dVarArrG = uVar.g(this);
        if (dVarArrG == null || dVarArrG.length == 0) {
            dVar = null;
        } else {
            com.google.android.gms.common.d[] dVarArrG2 = this.f17583d.g();
            if (dVarArrG2 == null) {
                dVarArrG2 = new com.google.android.gms.common.d[0];
            }
            C1554e c1554e = new C1554e(dVarArrG2.length);
            for (com.google.android.gms.common.d dVar2 : dVarArrG2) {
                c1554e.put(dVar2.f10329q, Long.valueOf(dVar2.W()));
            }
            int length = dVarArrG.length;
            for (int i = 0; i < length; i++) {
                dVar = dVarArrG[i];
                Long l7 = (Long) c1554e.get(dVar.f10329q);
                if (l7 == null || l7.longValue() < dVar.W()) {
                    break;
                }
            }
            dVar = null;
        }
        if (dVar == null) {
            l lVar2 = this.f;
            InterfaceC1697b interfaceC1697b2 = this.f17583d;
            b7.d(lVar2, interfaceC1697b2.k());
            try {
                b7.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                interfaceC1697b2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f17583d.getClass().getName() + " could not execute call because it requires feature (" + dVar.f10329q + ", " + dVar.W() + ").");
        if (!this.f17590n.f17575n || !uVar.f(this)) {
            uVar.b(new u3.i(dVar));
            return true;
        }
        p pVar = new p(this.f17584e, dVar);
        int iIndexOf = this.f17588l.indexOf(pVar);
        if (iIndexOf >= 0) {
            p pVar2 = (p) this.f17588l.get(iIndexOf);
            this.f17590n.f17574m.removeMessages(15, pVar2);
            I3.e eVar = this.f17590n.f17574m;
            eVar.sendMessageDelayed(Message.obtain(eVar, 15, pVar2), 5000L);
        } else {
            this.f17588l.add(pVar);
            I3.e eVar2 = this.f17590n.f17574m;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 15, pVar), 5000L);
            I3.e eVar3 = this.f17590n.f17574m;
            eVar3.sendMessageDelayed(Message.obtain(eVar3, 16, pVar), 120000L);
            com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(2, null);
            if (!i(bVar)) {
                this.f17590n.b(bVar, this.i);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(com.google.android.gms.common.b bVar) {
        synchronized (e.f17563q) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        e eVar = this.f17590n;
        AbstractC1887A.c(eVar.f17574m);
        InterfaceC1697b interfaceC1697b = this.f17583d;
        if (interfaceC1697b.a() || interfaceC1697b.f()) {
            return;
        }
        try {
            l lVar = eVar.f17570g;
            Context context = eVar.f17569e;
            SparseIntArray sparseIntArray = (SparseIntArray) lVar.f17579r;
            AbstractC1887A.g(context);
            int iE = interfaceC1697b.e();
            int iC = ((SparseIntArray) lVar.f17579r).get(iE, -1);
            if (iC == -1) {
                iC = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iE && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iC == -1) {
                    iC = ((com.google.android.gms.common.e) lVar.f17580s).c(context, iE);
                }
                sparseIntArray.put(iE, iC);
            }
            if (iC != 0) {
                com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(iC, null);
                Log.w("GoogleApiManager", "The service for " + interfaceC1697b.getClass().getName() + " is not available: " + bVar.toString());
                l(bVar, null);
                return;
            }
            D d5 = new D(eVar, interfaceC1697b, this.f17584e);
            if (interfaceC1697b.k()) {
                x xVar = this.j;
                AbstractC1887A.g(xVar);
                Handler handler = xVar.f17604e;
                z0 z0Var = xVar.f17606h;
                R3.a aVar = xVar.i;
                if (aVar != null) {
                    aVar.j();
                }
                z0Var.f = Integer.valueOf(System.identityHashCode(xVar));
                xVar.i = (R3.a) xVar.f.g(xVar.f17603d, handler.getLooper(), z0Var, (Q3.a) z0Var.f15879e, xVar, xVar);
                xVar.j = d5;
                Set set = xVar.f17605g;
                if (set == null || set.isEmpty()) {
                    handler.post(new A1.b(24, xVar));
                } else {
                    R3.a aVar2 = xVar.i;
                    aVar2.getClass();
                    aVar2.c(new C1136a(18, aVar2));
                }
            }
            try {
                interfaceC1697b.c(d5);
            } catch (SecurityException e7) {
                l(new com.google.android.gms.common.b(10), e7);
            }
        } catch (IllegalStateException e8) {
            l(new com.google.android.gms.common.b(10), e8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(B b7) {
        AbstractC1887A.c(this.f17590n.f17574m);
        boolean zA = this.f17583d.a();
        LinkedList linkedList = this.f17582c;
        if (zA) {
            if (h(b7)) {
                g();
                return;
            } else {
                linkedList.add(b7);
                return;
            }
        }
        linkedList.add(b7);
        com.google.android.gms.common.b bVar = this.f17589m;
        if (bVar == null || bVar.f10323r == 0 || bVar.f10324s == null) {
            j();
        } else {
            l(bVar, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(com.google.android.gms.common.b bVar, RuntimeException runtimeException) {
        R3.a aVar;
        AbstractC1887A.c(this.f17590n.f17574m);
        x xVar = this.j;
        if (xVar != null && (aVar = xVar.i) != null) {
            aVar.j();
        }
        AbstractC1887A.c(this.f17590n.f17574m);
        this.f17589m = null;
        ((SparseIntArray) this.f17590n.f17570g.f17579r).clear();
        a(bVar);
        if ((this.f17583d instanceof z3.c) && bVar.f10323r != 24) {
            e eVar = this.f17590n;
            eVar.f17566b = true;
            I3.e eVar2 = eVar.f17574m;
            eVar2.sendMessageDelayed(eVar2.obtainMessage(19), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (bVar.f10323r == 4) {
            b(e.f17562p);
            return;
        }
        if (this.f17582c.isEmpty()) {
            this.f17589m = bVar;
            return;
        }
        if (runtimeException != null) {
            AbstractC1887A.c(this.f17590n.f17574m);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f17590n.f17575n) {
            b(e.c(this.f17584e, bVar));
            return;
        }
        c(e.c(this.f17584e, bVar), null, true);
        if (this.f17582c.isEmpty() || i(bVar) || this.f17590n.b(bVar, this.i)) {
            return;
        }
        if (bVar.f10323r == 18) {
            this.f17587k = true;
        }
        if (!this.f17587k) {
            b(e.c(this.f17584e, bVar));
            return;
        }
        e eVar3 = this.f17590n;
        C1763a c1763a = this.f17584e;
        I3.e eVar4 = eVar3.f17574m;
        eVar4.sendMessageDelayed(Message.obtain(eVar4, 9, c1763a), 5000L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(com.google.android.gms.common.b bVar) {
        AbstractC1887A.c(this.f17590n.f17574m);
        InterfaceC1697b interfaceC1697b = this.f17583d;
        interfaceC1697b.d("onSignInFailed for " + interfaceC1697b.getClass().getName() + " with " + String.valueOf(bVar));
        l(bVar, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        AbstractC1887A.c(this.f17590n.f17574m);
        Status status = e.f17561o;
        b(status);
        this.f.c(false, status);
        for (g gVar : (g[]) this.f17586h.keySet().toArray(new g[0])) {
            k(new C1762A(new S3.e()));
        }
        a(new com.google.android.gms.common.b(4));
        InterfaceC1697b interfaceC1697b = this.f17583d;
        if (interfaceC1697b.a()) {
            interfaceC1697b.l(new C1136a(13, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.e
    public final void onConnected(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        I3.e eVar = this.f17590n.f17574m;
        if (looperMyLooper == eVar.getLooper()) {
            e();
        } else {
            eVar.post(new A1.b(22, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.f
    public final void onConnectionFailed(com.google.android.gms.common.b bVar) {
        l(bVar, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.e
    public final void onConnectionSuspended(int i) {
        Looper looperMyLooper = Looper.myLooper();
        I3.e eVar = this.f17590n.f17574m;
        if (looperMyLooper == eVar.getLooper()) {
            f(i);
        } else {
            eVar.post(new E1.j(i, 4, this));
        }
    }
}
