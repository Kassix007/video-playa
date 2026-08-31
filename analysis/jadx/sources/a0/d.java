package A0;

import B0.AbstractC0041g;
import B0.C0035d;
import B0.L;
import B0.P;
import B0.Y;
import B0.n0;
import M5.C0247h;
import M5.InterfaceC0245f;
import M5.InterfaceC0261w;
import P.C0348c0;
import P.C0354f0;
import P.C0358h0;
import P.C0371o;
import P.C0385v0;
import P.EnumC0374p0;
import P.N;
import P.O;
import P.V;
import a0.t;
import android.content.Context;
import android.os.Trace;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.room.D;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import c.C0704b;
import c0.AbstractC0724l;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import d6.k;
import h0.o;
import h6.j;
import i0.C1133e;
import j0.AbstractC1145B;
import j0.C;
import j0.l;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import k2.C1179c;
import k2.C1182f;
import k2.C1183g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.C1386y;
import n5.s;
import p0.H;
import r.C1544C;
import r.C1548G;
import r.C1549H;
import r.M;
import u.AbstractC1644d;
import u.C1645d0;
import u.v0;
import v.C1728x;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f164r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj) {
        super(0);
        this.f163q = i;
        this.f164r = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.room.D.access$createNewStatement(androidx.room.D):j2.g */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:146:0x02c8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [B5.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v88, types: [B5.a, kotlin.jvm.internal.k] */
    /* JADX WARN: Type inference failed for: r10v7, types: [r.C] */
    /* JADX WARN: Type inference failed for: r11v5, types: [r.C] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3, types: [P.O, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object[]] */
    @Override // B5.a
    public final Object invoke() throws Throwable {
        ?? r62;
        InterfaceC0245f interfaceC0245fU;
        Object obj;
        boolean z5;
        boolean z6;
        int i;
        C1182f c1182f;
        int i7 = 2;
        boolean z7 = true;
        switch (this.f163q) {
            case 0:
                e eVar = (e) this.f164r;
                R.e eVar2 = eVar.f167c;
                R.e eVar3 = eVar.f166b;
                R.e eVar4 = eVar.f169e;
                eVar.f = false;
                HashSet hashSet = new HashSet();
                R.e eVar5 = eVar.f168d;
                Object[] objArr = eVar5.f6676q;
                int i8 = eVar5.f6678s;
                for (int i9 = 0; i9 < i8; i9++) {
                    L l7 = (L) objArr[i9];
                    h hVar = (h) eVar4.f6676q[i9];
                    AbstractC0724l abstractC0724l = l7.f268U.f433e;
                    if (abstractC0724l.f10099D) {
                        e.b(abstractC0724l, hVar, hashSet);
                    }
                }
                eVar5.i();
                eVar4.i();
                Object[] objArr2 = eVar3.f6676q;
                int i10 = eVar3.f6678s;
                for (int i11 = 0; i11 < i10; i11++) {
                    C0035d c0035d = (C0035d) objArr2[i11];
                    h hVar2 = (h) eVar2.f6676q[i11];
                    if (c0035d.f10099D) {
                        e.b(c0035d, hVar2, hashSet);
                    }
                }
                eVar3.i();
                eVar2.i();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((C0035d) it.next()).A0();
                }
                return C1386y.f15098a;
            case 1:
                P p7 = ((L) this.f164r).f269V;
                p7.f311p.f388O = true;
                Y y6 = p7.f312q;
                if (y6 != null) {
                    y6.f348I = true;
                }
                return C1386y.f15098a;
            case 2:
                B5.c cVar = (B5.c) this.f164r;
                C c7 = n0.f474W;
                cVar.invoke(c7);
                c7.f13666E = c7.f13676z.e(c7.f13663B, c7.f13665D, c7.f13664C);
                return C1386y.f15098a;
            case 3:
                J.g gVar = (J.g) this.f164r;
                gVar.f2491O = null;
                AbstractC0041g.n(gVar);
                AbstractC0041g.m(gVar);
                AbstractC0041g.l(gVar);
                return Boolean.TRUE;
            case 4:
                J0.a aVar = (J0.a) this.f164r;
                aVar.f2497g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar.a();
                    Trace.endSection();
                    return C1386y.f15098a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 5:
                ((L.a) this.f164r).f3005z.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return C1386y.f15098a;
            case 6:
                AbstractC0041g.l((L.b) this.f164r);
                return C1386y.f15098a;
            case 7:
                return new L4.i((IconicsAnimationProcessor) this.f164r);
            case 8:
                return Float.valueOf(((W0.c) this.f164r).u(125));
            case 9:
                throw null;
            case 10:
                ArrayList arrayList = ((C0358h0) this.f164r).f5412a;
                C1548G c1548g = new C1548G(arrayList.size());
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ?? r63 = (O) arrayList.get(i12);
                    Object obj2 = r63.f5349b;
                    int i13 = r63.f5348a;
                    Object n7 = obj2 != null ? new N(Integer.valueOf(i13), r63.f5349b) : Integer.valueOf(i13);
                    int iF = c1548g.f(n7);
                    boolean z8 = iF < 0;
                    Object obj3 = z8 ? null : c1548g.f16135c[iF];
                    if (obj3 == null) {
                        r62 = r63;
                    } else if (obj3 instanceof C1544C) {
                        ?? r10 = (C1544C) obj3;
                        r10.a(r63);
                        r63 = r10;
                        r62 = r63;
                    } else {
                        Object[] objArr3 = M.f16159a;
                        ?? c1544c = new C1544C(2);
                        c1544c.a(obj3);
                        c1544c.a(r63);
                        r62 = c1544c;
                    }
                    if (z8) {
                        int i14 = ~iF;
                        c1548g.f16134b[i14] = n7;
                        c1548g.f16135c[i14] = r62;
                    } else {
                        c1548g.f16135c[iF] = r62;
                    }
                }
                return new R.a(c1548g);
            case 11:
                C0385v0 c0385v0 = (C0385v0) this.f164r;
                synchronized (c0385v0.f5555b) {
                    interfaceC0245fU = c0385v0.u();
                    if (((EnumC0374p0) c0385v0.f5570t.getValue()).compareTo(EnumC0374p0.f5491r) <= 0) {
                        Throwable th2 = c0385v0.f5557d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th2);
                        throw cancellationException;
                    }
                }
                if (interfaceC0245fU != null) {
                    ((C0247h) interfaceC0245fU).resumeWith(C1386y.f15098a);
                }
                return C1386y.f15098a;
            case 12:
                Object systemService = ((P0.c) this.f164r).f5601a.getContext().getSystemService("input_method");
                m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 13:
                return new BaseInputConnection(((P0.c) this.f164r).f5601a, false);
            case 14:
                return ((l) ((AbstractC1145B) this.f164r)).f13716g;
            case 15:
                U0.b bVar = (U0.b) this.f164r;
                C0354f0 c0354f0 = bVar.f7525s;
                if (((C1133e) c0354f0.getValue()).f13533a == 9205357640488583168L || C1133e.e(((C1133e) c0354f0.getValue()).f13533a)) {
                    return null;
                }
                l lVar = bVar.f7523q;
                long j = ((C1133e) c0354f0.getValue()).f13533a;
                return lVar.f13716g;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                Z.b bVar2 = (Z.b) this.f164r;
                Z.l lVar2 = bVar2.f8286q;
                Object obj4 = bVar2.f8289t;
                if (obj4 != null) {
                    return lVar2.b(bVar2, obj4);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                break;
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                D d5 = (D) this.f164r;
                return d5.database.compileStatement(d5.createQuery());
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                C0704b c0704b = (C0704b) this.f164r;
                c0704b.f9909a = true;
                ?? r02 = c0704b.f9911c;
                if (r02 != 0) {
                    r02.invoke();
                }
                return C1386y.f15098a;
            case 20:
                try {
                    return (List) ((n) this.f164r).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return s.f15299q;
                }
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                ((o) this.f164r).y0();
                return C1386y.f15098a;
            case 22:
                k kVar = ((j) this.f164r).f13503e;
                m.b(kVar);
                List<Certificate> listA = kVar.a();
                ArrayList arrayList2 = new ArrayList(n5.m.c0(listA, 10));
                for (Certificate certificate : listA) {
                    m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList2.add((X509Certificate) certificate);
                }
                return arrayList2;
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                C1183g c1183g = (C1183g) this.f164r;
                Context context = c1183g.f14104q;
                String str = c1183g.f14105r;
                if (str == null || !c1183g.f14107t) {
                    c1182f = new C1182f(context, c1183g.f14105r, new C1179c(), c1183g.f14106s, c1183g.f14108u);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    m.d(noBackupFilesDir, "context.noBackupFilesDir");
                    c1182f = new C1182f(context, new File(noBackupFilesDir, str).getAbsolutePath(), new C1179c(), c1183g.f14106s, c1183g.f14108u);
                }
                c1182f.setWriteAheadLoggingEnabled(c1183g.f14110w);
                return c1182f;
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                H h4 = (H) this.f164r;
                int i15 = h4.f15499B;
                C0348c0 c0348c0 = h4.f15503y;
                if (i15 == c0348c0.e()) {
                    c0348c0.f(c0348c0.e() + 1);
                }
                return C1386y.f15098a;
            case 25:
                return Float.valueOf(AbstractC1644d.m(((InterfaceC0261w) this.f164r).d()));
            case 26:
                C1645d0 c1645d0 = (C1645d0) this.f164r;
                v0 v0Var = c1645d0.f16910v;
                c1645d0.f16911w = v0Var != null ? ((Number) v0Var.f17077l.getValue()).longValue() : 0L;
                return C1386y.f15098a;
            case 27:
                return ((u0.d) this.f164r).f17098d;
            case 28:
                return ((u0.g) this.f164r).x0();
            default:
                ((C1728x) this.f164r).f17411K.invoke();
                return Boolean.TRUE;
        }
        while (true) {
            t tVar = (t) this.f164r;
            Object obj5 = tVar.f8705g;
            synchronized (obj5) {
                try {
                    if (tVar.f8702c) {
                        z5 = z7;
                        obj = obj5;
                    } else {
                        tVar.f8702c = z7;
                        try {
                            R.e eVar6 = tVar.f;
                            Object[] objArr4 = eVar6.f6676q;
                            int i16 = eVar6.f6678s;
                            int i17 = 0;
                            while (i17 < i16) {
                                a0.s sVar = (a0.s) objArr4[i17];
                                C1549H c1549h = sVar.f8696g;
                                B5.c cVar2 = sVar.f8691a;
                                Object[] objArr5 = c1549h.f16139b;
                                long[] jArr = c1549h.f16138a;
                                int length = jArr.length - i7;
                                if (length >= 0) {
                                    boolean z9 = z7;
                                    obj = obj5;
                                    int i18 = 0;
                                    while (true) {
                                        try {
                                            long j7 = jArr[i18];
                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i19 = 8;
                                                int i20 = 8 - ((~(i18 - length)) >>> 31);
                                                z6 = z9;
                                                int i21 = 0;
                                                while (i21 < i20) {
                                                    if ((j7 & 255) < 128) {
                                                        i = i19;
                                                        cVar2.invoke(objArr5[(i18 << 3) + i21]);
                                                    } else {
                                                        i = i19;
                                                    }
                                                    j7 >>= i;
                                                    i21++;
                                                    i19 = i;
                                                }
                                                if (i20 == i19) {
                                                }
                                            } else {
                                                z6 = z9;
                                            }
                                            if (i18 != length) {
                                                i18++;
                                                z9 = z6;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            tVar.f8702c = false;
                                            throw th;
                                        }
                                    }
                                } else {
                                    z6 = z7;
                                    obj = obj5;
                                }
                                c1549h.b();
                                i17++;
                                obj5 = obj;
                                z7 = z6;
                                i7 = 2;
                            }
                            z5 = z7;
                            obj = obj5;
                            try {
                                tVar.f8702c = false;
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj5;
                        }
                    }
                    if (!t.a((t) this.f164r)) {
                        return C1386y.f15098a;
                    }
                    z7 = z5;
                    i7 = 2;
                } catch (Throwable th6) {
                    th = th6;
                    obj = obj5;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.a */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(B5.a aVar) {
        super(0);
        this.f163q = 20;
        this.f164r = (n) aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C0371o c0371o, V v6) {
        super(0);
        this.f163q = 9;
        this.f164r = c0371o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC1145B abstractC1145B, long j) {
        super(0);
        this.f163q = 14;
        this.f164r = abstractC1145B;
    }
}
