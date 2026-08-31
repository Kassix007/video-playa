package d1;

import B0.G0;
import e1.AbstractC1035o;
import e1.C1022b;
import e1.C1023c;
import e1.C1025e;
import g1.C1076f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends C0953d {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f11889A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public C0951b[] f11890B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public C0951b[] f11891C0;
    public int D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f11892E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f11893F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public WeakReference f11894G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public WeakReference f11895H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public WeakReference f11896I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public WeakReference f11897J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final HashSet f11898K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final C1022b f11899L0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f11900q0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final G0 f11901r0 = new G0(this);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final C1025e f11902s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f11903t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public C1076f f11904u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f11905v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final b1.c f11906w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f11907x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f11908y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f11909z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e() {
        C1025e c1025e = new C1025e();
        c1025e.f12512b = true;
        c1025e.f12513c = true;
        c1025e.f = new ArrayList();
        new ArrayList();
        c1025e.f12517h = null;
        c1025e.i = new C1022b();
        c1025e.f12516g = new ArrayList();
        c1025e.f12514d = this;
        c1025e.f12515e = this;
        this.f11902s0 = c1025e;
        this.f11904u0 = null;
        this.f11905v0 = false;
        this.f11906w0 = new b1.c();
        this.f11909z0 = 0;
        this.f11889A0 = 0;
        this.f11890B0 = new C0951b[4];
        this.f11891C0 = new C0951b[4];
        this.D0 = 257;
        this.f11892E0 = false;
        this.f11893F0 = false;
        this.f11894G0 = null;
        this.f11895H0 = null;
        this.f11896I0 = null;
        this.f11897J0 = null;
        this.f11898K0 = new HashSet();
        this.f11899L0 = new C1022b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void V(C0953d c0953d, C1076f c1076f, C1022b c1022b) {
        int i;
        int i7;
        if (c1076f == null) {
            return;
        }
        int i8 = c0953d.f11862g0;
        int[] iArr = c0953d.f11882t;
        if (i8 == 8 || (c0953d instanceof h) || (c0953d instanceof C0950a)) {
            c1022b.f12506e = 0;
            c1022b.f = 0;
            return;
        }
        int[] iArr2 = c0953d.f11878p0;
        c1022b.f12502a = iArr2[0];
        c1022b.f12503b = iArr2[1];
        c1022b.f12504c = c0953d.q();
        c1022b.f12505d = c0953d.k();
        c1022b.i = false;
        c1022b.j = 0;
        boolean z5 = c1022b.f12502a == 3;
        boolean z6 = c1022b.f12503b == 3;
        boolean z7 = z5 && c0953d.f11846W > 0.0f;
        boolean z8 = z6 && c0953d.f11846W > 0.0f;
        if (z5 && c0953d.t(0) && c0953d.f11880r == 0 && !z7) {
            c1022b.f12502a = 2;
            if (z6 && c0953d.f11881s == 0) {
                c1022b.f12502a = 1;
            }
            z5 = false;
        }
        if (z6 && c0953d.t(1) && c0953d.f11881s == 0 && !z8) {
            c1022b.f12503b = 2;
            if (z5 && c0953d.f11880r == 0) {
                c1022b.f12503b = 1;
            }
            z6 = false;
        }
        if (c0953d.A()) {
            c1022b.f12502a = 1;
            z5 = false;
        }
        if (c0953d.B()) {
            c1022b.f12503b = 1;
            z6 = false;
        }
        if (z7) {
            if (iArr[0] == 4) {
                c1022b.f12502a = 1;
            } else if (!z6) {
                if (c1022b.f12503b == 1) {
                    i7 = c1022b.f12505d;
                } else {
                    c1022b.f12502a = 2;
                    c1076f.b(c0953d, c1022b);
                    i7 = c1022b.f;
                }
                c1022b.f12502a = 1;
                c1022b.f12504c = (int) (c0953d.f11846W * i7);
            }
        }
        if (z8) {
            if (iArr[1] == 4) {
                c1022b.f12503b = 1;
            } else if (!z5) {
                if (c1022b.f12502a == 1) {
                    i = c1022b.f12504c;
                } else {
                    c1022b.f12503b = 2;
                    c1076f.b(c0953d, c1022b);
                    i = c1022b.f12506e;
                }
                c1022b.f12503b = 1;
                if (c0953d.f11847X == -1) {
                    c1022b.f12505d = (int) (i / c0953d.f11846W);
                } else {
                    c1022b.f12505d = (int) (c0953d.f11846W * i);
                }
            }
        }
        c1076f.b(c0953d, c1022b);
        c0953d.O(c1022b.f12506e);
        c0953d.L(c1022b.f);
        c0953d.f11828E = c1022b.f12508h;
        c0953d.I(c1022b.f12507g);
        c1022b.j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final void C() {
        this.f11906w0.t();
        this.f11907x0 = 0;
        this.f11908y0 = 0;
        this.f11900q0.clear();
        super.C();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final void F(G0 g02) {
        super.F(g02);
        int size = this.f11900q0.size();
        for (int i = 0; i < size; i++) {
            ((C0953d) this.f11900q0.get(i)).F(g02);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final void P(boolean z5, boolean z6) {
        super.P(z5, z6);
        int size = this.f11900q0.size();
        for (int i = 0; i < size; i++) {
            ((C0953d) this.f11900q0.get(i)).P(z5, z6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(C0953d c0953d, int i) {
        if (i == 0) {
            int i7 = this.f11909z0 + 1;
            C0951b[] c0951bArr = this.f11891C0;
            if (i7 >= c0951bArr.length) {
                this.f11891C0 = (C0951b[]) Arrays.copyOf(c0951bArr, c0951bArr.length * 2);
            }
            C0951b[] c0951bArr2 = this.f11891C0;
            int i8 = this.f11909z0;
            c0951bArr2[i8] = new C0951b(c0953d, 0, this.f11905v0);
            this.f11909z0 = i8 + 1;
            return;
        }
        if (i == 1) {
            int i9 = this.f11889A0 + 1;
            C0951b[] c0951bArr3 = this.f11890B0;
            if (i9 >= c0951bArr3.length) {
                this.f11890B0 = (C0951b[]) Arrays.copyOf(c0951bArr3, c0951bArr3.length * 2);
            }
            C0951b[] c0951bArr4 = this.f11890B0;
            int i10 = this.f11889A0;
            c0951bArr4[i10] = new C0951b(c0953d, 1, this.f11905v0);
            this.f11889A0 = i10 + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S(b1.c cVar) {
        e eVar;
        b1.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f11900q0.size();
        boolean z5 = false;
        for (int i = 0; i < size; i++) {
            C0953d c0953d = (C0953d) this.f11900q0.get(i);
            boolean[] zArr = c0953d.f11842S;
            zArr[0] = false;
            zArr[1] = false;
            if (c0953d instanceof C0950a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i7 = 0; i7 < size; i7++) {
                C0953d c0953d2 = (C0953d) this.f11900q0.get(i7);
                if (c0953d2 instanceof C0950a) {
                    C0950a c0950a = (C0950a) c0953d2;
                    for (int i8 = 0; i8 < c0950a.f11966r0; i8++) {
                        C0953d c0953d3 = c0950a.f11965q0[i8];
                        if (c0950a.f11800t0 || c0953d3.c()) {
                            int i9 = c0950a.f11799s0;
                            if (i9 == 0 || i9 == 1) {
                                c0953d3.f11842S[0] = true;
                            } else if (i9 == 2 || i9 == 3) {
                                c0953d3.f11842S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f11898K0;
        hashSet.clear();
        for (int i10 = 0; i10 < size; i10++) {
            C0953d c0953d4 = (C0953d) this.f11900q0.get(i10);
            c0953d4.getClass();
            boolean z6 = c0953d4 instanceof g;
            if (z6 || (c0953d4 instanceof h)) {
                if (z6) {
                    hashSet.add(c0953d4);
                } else {
                    c0953d4.b(cVar, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((C0953d) it.next());
                for (int i11 = 0; i11 < gVar.f11966r0; i11++) {
                    if (hashSet.contains(gVar.f11965q0[i11])) {
                        gVar.b(cVar, zW);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0953d) it2.next()).b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        if (b1.c.f9940q) {
            HashSet<C0953d> hashSet2 = new HashSet();
            for (int i12 = 0; i12 < size; i12++) {
                C0953d c0953d5 = (C0953d) this.f11900q0.get(i12);
                c0953d5.getClass();
                if (!(c0953d5 instanceof g) && !(c0953d5 instanceof h)) {
                    hashSet2.add(c0953d5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f11878p0[0] == 2 ? 0 : 1, false);
            for (C0953d c0953d6 : hashSet2) {
                j.b(this, cVar2, c0953d6);
                c0953d6.b(cVar2, zW);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i13 = 0; i13 < size; i13++) {
                C0953d c0953d7 = (C0953d) eVar.f11900q0.get(i13);
                if (c0953d7 instanceof e) {
                    int[] iArr = c0953d7.f11878p0;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    if (i14 == 2) {
                        c0953d7.M(1);
                    }
                    if (i15 == 2) {
                        c0953d7.N(1);
                    }
                    c0953d7.b(cVar2, zW);
                    if (i14 == 2) {
                        c0953d7.M(i14);
                    }
                    if (i15 == 2) {
                        c0953d7.N(i15);
                    }
                } else {
                    j.b(this, cVar2, c0953d7);
                    if (!(c0953d7 instanceof g) && !(c0953d7 instanceof h)) {
                        c0953d7.b(cVar2, zW);
                    }
                }
            }
        }
        if (eVar.f11909z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.f11889A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(int i, boolean z5) {
        int i7;
        int i8;
        boolean z6;
        boolean z7;
        C1025e c1025e = this.f11902s0;
        ArrayList arrayList = (ArrayList) c1025e.f;
        e eVar = (e) c1025e.f12514d;
        int iJ = eVar.j(0);
        int[] iArr = eVar.f11878p0;
        int iJ2 = eVar.j(1);
        int iR = eVar.r();
        int iS = eVar.s();
        if (z5 && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    z7 = z5;
                    break;
                }
                Object obj = arrayList.get(i9);
                i9++;
                AbstractC1035o abstractC1035o = (AbstractC1035o) obj;
                if (abstractC1035o.f == i && !abstractC1035o.k()) {
                    z7 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z7 && iJ == 2) {
                    eVar.M(1);
                    eVar.O(c1025e.d(eVar, 0));
                    eVar.f11856d.f12543e.d(eVar.q());
                }
            } else if (z7 && iJ2 == 2) {
                eVar.N(1);
                eVar.L(c1025e.d(eVar, 1));
                eVar.f11858e.f12543e.d(eVar.k());
            }
        }
        if (i == 0) {
            i7 = 0;
            int i10 = iArr[0];
            if (i10 == 1 || i10 == 4) {
                int iQ = eVar.q() + iR;
                eVar.f11856d.i.d(iQ);
                eVar.f11856d.f12543e.d(iQ - iR);
                i8 = 1;
            }
            i8 = i7;
        } else {
            i7 = 0;
            int i11 = iArr[1];
            if (i11 == 1 || i11 == 4) {
                int iK = eVar.k() + iS;
                eVar.f11858e.i.d(iK);
                eVar.f11858e.f12543e.d(iK - iS);
                i8 = 1;
            }
            i8 = i7;
        }
        c1025e.g();
        int size2 = arrayList.size();
        int i12 = i7;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            AbstractC1035o abstractC1035o2 = (AbstractC1035o) obj2;
            if (abstractC1035o2.f == i && (abstractC1035o2.f12540b != eVar || abstractC1035o2.f12544g)) {
                abstractC1035o2.e();
            }
        }
        int size3 = arrayList.size();
        int i13 = i7;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            AbstractC1035o abstractC1035o3 = (AbstractC1035o) obj3;
            if (abstractC1035o3.f == i && (i8 != 0 || abstractC1035o3.f12540b != eVar)) {
                if (!abstractC1035o3.f12545h.j || !abstractC1035o3.i.j || (!(abstractC1035o3 instanceof C1023c) && !abstractC1035o3.f12543e.j)) {
                    z6 = i7;
                    break;
                }
            }
        }
        z6 = 1;
        eVar.M(iJ);
        eVar.N(iJ2);
        return z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:417:0x0706 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:495:0x0881 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:546:0x06ff */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:583:0x025e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:598:0x090d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:602:0x0805 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x082f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x083c A[LOOP:14: B:488:0x083a->B:489:0x083c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v25 */
    /* JADX WARN: Type inference failed for: r24v26 */
    /* JADX WARN: Type inference failed for: r24v27 */
    /* JADX WARN: Type inference failed for: r24v28 */
    /* JADX WARN: Type inference failed for: r24v29 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v30 */
    /* JADX WARN: Type inference failed for: r24v31 */
    /* JADX WARN: Type inference failed for: r24v32 */
    /* JADX WARN: Type inference failed for: r24v33 */
    /* JADX WARN: Type inference failed for: r24v34 */
    /* JADX WARN: Type inference failed for: r24v35 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r32v0, types: [d1.d, d1.e] */
    /* JADX WARN: Type inference failed for: r4v55, types: [int] */
    /* JADX WARN: Type inference failed for: r5v57, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v68, types: [int] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            r32 = this;
            r1 = r32
            r2 = 0
            r1.f11848Y = r2
            r1.f11849Z = r2
            r1.f11892E0 = r2
            r1.f11893F0 = r2
            java.util.ArrayList r0 = r1.f11900q0
            int r3 = r0.size()
            int r0 = r1.q()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r1.k()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.f11878p0
            r6 = 1
            r7 = r5[r6]
            r8 = r5[r2]
            int r9 = r1.f11903t0
            d1.c r11 = r1.f11833J
            d1.c r12 = r1.f11832I
            if (r9 != 0) goto L25c
            int r9 = r1.D0
            boolean r9 = d1.j.c(r9, r6)
            if (r9 == 0) goto L25c
            g1.f r9 = r1.f11904u0
            r14 = r5[r2]
            r15 = r5[r6]
            r1.E()
            java.util.ArrayList r10 = r1.f11900q0
            int r13 = r10.size()
        L47:
            if (r2 >= r13) goto L55
            java.lang.Object r18 = r10.get(r2)
            d1.d r18 = (d1.C0953d) r18
            r18.E()
            int r2 = r2 + 1
            goto L47
        L55:
            boolean r2 = r1.f11905v0
            if (r14 != r6) goto L62
            int r14 = r1.q()
            r6 = 0
            r1.J(r6, r14)
            goto L68
        L62:
            r6 = 0
            r12.l(r6)
            r1.f11848Y = r6
        L68:
            r6 = 0
            r14 = 0
            r19 = 0
        L6c:
            r20 = 1056964608(0x3f000000, float:0.5)
            if (r6 >= r13) goto Ld7
            java.lang.Object r21 = r10.get(r6)
            r22 = r5
            r5 = r21
            d1.d r5 = (d1.C0953d) r5
            r21 = r6
            boolean r6 = r5 instanceof d1.h
            if (r6 == 0) goto Lc0
            d1.h r5 = (d1.h) r5
            int r6 = r5.f11963u0
            r23 = r14
            r14 = 1
            if (r6 != r14) goto Lbd
            int r6 = r5.f11960r0
            r14 = -1
            if (r6 == r14) goto L92
            r5.R(r6)
            goto Lbb
        L92:
            int r6 = r5.f11961s0
            if (r6 == r14) goto La7
            boolean r6 = r1.A()
            if (r6 == 0) goto La7
            int r6 = r1.q()
            int r14 = r5.f11961s0
            int r6 = r6 - r14
            r5.R(r6)
            goto Lbb
        La7:
            boolean r6 = r1.A()
            if (r6 == 0) goto Lbb
            float r6 = r5.f11959q0
            int r14 = r1.q()
            float r14 = (float) r14
            float r6 = r6 * r14
            float r6 = r6 + r20
            int r6 = (int) r6
            r5.R(r6)
        Lbb:
            r23 = 1
        Lbd:
            r14 = r23
            goto Ld2
        Lc0:
            r23 = r14
            boolean r6 = r5 instanceof d1.C0950a
            if (r6 == 0) goto Lbd
            d1.a r5 = (d1.C0950a) r5
            int r5 = r5.U()
            if (r5 != 0) goto Lbd
            r14 = r23
            r19 = 1
        Ld2:
            int r6 = r21 + 1
            r5 = r22
            goto L6c
        Ld7:
            r22 = r5
            r23 = r14
            if (r23 == 0) goto L101
            r5 = 0
        Lde:
            if (r5 >= r13) goto L101
            java.lang.Object r6 = r10.get(r5)
            d1.d r6 = (d1.C0953d) r6
            boolean r14 = r6 instanceof d1.h
            if (r14 == 0) goto Lfa
            d1.h r6 = (d1.h) r6
            int r14 = r6.f11963u0
            r21 = r5
            r5 = 1
            if (r14 != r5) goto Lf8
            r5 = 0
            e1.AbstractC1028h.c(r5, r6, r9, r2)
            goto Lfd
        Lf8:
            r5 = 0
            goto Lfd
        Lfa:
            r21 = r5
            goto Lf8
        Lfd:
            int r6 = r21 + 1
            r5 = r6
            goto Lde
        L101:
            r5 = 0
            e1.AbstractC1028h.c(r5, r1, r9, r2)
            if (r19 == 0) goto L12b
            r5 = 0
        L108:
            if (r5 >= r13) goto L12b
            java.lang.Object r6 = r10.get(r5)
            d1.d r6 = (d1.C0953d) r6
            boolean r14 = r6 instanceof d1.C0950a
            if (r14 == 0) goto L127
            d1.a r6 = (d1.C0950a) r6
            int r14 = r6.U()
            if (r14 != 0) goto L127
            boolean r14 = r6.T()
            if (r14 == 0) goto L127
            r14 = 1
            e1.AbstractC1028h.c(r14, r6, r9, r2)
            goto L128
        L127:
            r14 = 1
        L128:
            int r5 = r5 + 1
            goto L108
        L12b:
            r14 = 1
            if (r15 != r14) goto L137
            int r5 = r1.k()
            r6 = 0
            r1.K(r6, r5)
            goto L13d
        L137:
            r6 = 0
            r11.l(r6)
            r1.f11849Z = r6
        L13d:
            r5 = 0
            r6 = 0
            r14 = 0
        L140:
            if (r5 >= r13) goto L199
            java.lang.Object r15 = r10.get(r5)
            d1.d r15 = (d1.C0953d) r15
            r19 = r5
            boolean r5 = r15 instanceof d1.h
            if (r5 == 0) goto L188
            d1.h r15 = (d1.h) r15
            int r5 = r15.f11963u0
            if (r5 != 0) goto L196
            int r5 = r15.f11960r0
            r6 = -1
            if (r5 == r6) goto L15d
            r15.R(r5)
            goto L186
        L15d:
            int r5 = r15.f11961s0
            if (r5 == r6) goto L172
            boolean r5 = r1.B()
            if (r5 == 0) goto L172
            int r5 = r1.k()
            int r6 = r15.f11961s0
            int r5 = r5 - r6
            r15.R(r5)
            goto L186
        L172:
            boolean r5 = r1.B()
            if (r5 == 0) goto L186
            float r5 = r15.f11959q0
            int r6 = r1.k()
            float r6 = (float) r6
            float r5 = r5 * r6
            float r5 = r5 + r20
            int r5 = (int) r5
            r15.R(r5)
        L186:
            r6 = 1
            goto L196
        L188:
            boolean r5 = r15 instanceof d1.C0950a
            if (r5 == 0) goto L196
            d1.a r15 = (d1.C0950a) r15
            int r5 = r15.U()
            r15 = 1
            if (r5 != r15) goto L196
            r14 = 1
        L196:
            int r5 = r19 + 1
            goto L140
        L199:
            if (r6 == 0) goto L1b5
            r5 = 0
        L19c:
            if (r5 >= r13) goto L1b5
            java.lang.Object r6 = r10.get(r5)
            d1.d r6 = (d1.C0953d) r6
            boolean r15 = r6 instanceof d1.h
            if (r15 == 0) goto L1b2
            d1.h r6 = (d1.h) r6
            int r15 = r6.f11963u0
            if (r15 != 0) goto L1b2
            r15 = 1
            e1.AbstractC1028h.i(r15, r6, r9)
        L1b2:
            int r5 = r5 + 1
            goto L19c
        L1b5:
            r6 = 0
            e1.AbstractC1028h.i(r6, r1, r9)
            if (r14 == 0) goto L1dd
            r5 = 0
        L1bc:
            if (r5 >= r13) goto L1dd
            java.lang.Object r6 = r10.get(r5)
            d1.d r6 = (d1.C0953d) r6
            boolean r14 = r6 instanceof d1.C0950a
            if (r14 == 0) goto L1da
            d1.a r6 = (d1.C0950a) r6
            int r14 = r6.U()
            r15 = 1
            if (r14 != r15) goto L1da
            boolean r14 = r6.T()
            if (r14 == 0) goto L1da
            e1.AbstractC1028h.i(r15, r6, r9)
        L1da:
            int r5 = r5 + 1
            goto L1bc
        L1dd:
            r5 = 0
        L1de:
            if (r5 >= r13) goto L216
            java.lang.Object r6 = r10.get(r5)
            d1.d r6 = (d1.C0953d) r6
            boolean r14 = r6.z()
            if (r14 == 0) goto L213
            boolean r14 = e1.AbstractC1028h.a(r6)
            if (r14 == 0) goto L213
            e1.b r14 = e1.AbstractC1028h.f12528a
            V(r6, r9, r14)
            boolean r14 = r6 instanceof d1.h
            if (r14 == 0) goto L20c
            r14 = r6
            d1.h r14 = (d1.h) r14
            int r14 = r14.f11963u0
            if (r14 != 0) goto L207
            r14 = 0
            e1.AbstractC1028h.i(r14, r6, r9)
            goto L213
        L207:
            r14 = 0
            e1.AbstractC1028h.c(r14, r6, r9, r2)
            goto L213
        L20c:
            r14 = 0
            e1.AbstractC1028h.c(r14, r6, r9, r2)
            e1.AbstractC1028h.i(r14, r6, r9)
        L213:
            int r5 = r5 + 1
            goto L1de
        L216:
            r2 = 0
        L217:
            if (r2 >= r3) goto L25e
            java.util.ArrayList r5 = r1.f11900q0
            java.lang.Object r5 = r5.get(r2)
            d1.d r5 = (d1.C0953d) r5
            boolean r6 = r5.z()
            if (r6 == 0) goto L259
            boolean r6 = r5 instanceof d1.h
            if (r6 != 0) goto L259
            boolean r6 = r5 instanceof d1.C0950a
            if (r6 != 0) goto L259
            boolean r6 = r5 instanceof d1.g
            if (r6 != 0) goto L259
            boolean r6 = r5.f11829F
            if (r6 != 0) goto L259
            r6 = 0
            int r9 = r5.j(r6)
            r15 = 1
            int r6 = r5.j(r15)
            r10 = 3
            if (r9 != r10) goto L24f
            int r9 = r5.f11880r
            if (r9 == r15) goto L24f
            if (r6 != r10) goto L24f
            int r6 = r5.f11881s
            if (r6 == r15) goto L24f
            goto L259
        L24f:
            e1.b r6 = new e1.b
            r6.<init>()
            g1.f r9 = r1.f11904u0
            V(r5, r9, r6)
        L259:
            int r2 = r2 + 1
            goto L217
        L25c:
            r22 = r5
        L25e:
            r5 = 2
            b1.c r9 = r1.f11906w0
            if (r3 <= r5) goto L268
            if (r8 == r5) goto L274
            if (r7 != r5) goto L268
            goto L274
        L268:
            r24 = r3
            r5 = r4
            r4 = r7
            r2 = r8
            r23 = r11
            r25 = r12
            r3 = r0
            goto L652
        L274:
            int r10 = r1.D0
            r13 = 1024(0x400, float:1.435E-42)
            boolean r10 = d1.j.c(r10, r13)
            if (r10 == 0) goto L268
            g1.f r10 = r1.f11904u0
            java.util.ArrayList r13 = r1.f11900q0
            int r14 = r13.size()
            r15 = 0
        L287:
            if (r15 >= r14) goto L2c4
            java.lang.Object r19 = r13.get(r15)
            r2 = r19
            d1.d r2 = (d1.C0953d) r2
            r17 = 0
            r5 = r22[r17]
            r18 = 1
            r6 = r22[r18]
            r23 = r15
            int[] r15 = r2.f11878p0
            r24 = r15
            r15 = r24[r17]
            r25 = r12
            r12 = r24[r18]
            boolean r5 = e1.AbstractC1028h.h(r5, r6, r15, r12)
            if (r5 != 0) goto L2b9
        L2ab:
            r29 = r0
            r24 = r3
            r26 = r4
            r28 = r7
            r31 = r8
            r23 = r11
            goto L60b
        L2b9:
            boolean r2 = r2 instanceof d1.g
            if (r2 == 0) goto L2be
            goto L2ab
        L2be:
            int r15 = r23 + 1
            r12 = r25
            r5 = 2
            goto L287
        L2c4:
            r25 = r12
            r24 = r3
            r23 = r11
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r11 = 0
            r12 = 0
            r15 = 0
        L2d1:
            if (r2 >= r14) goto L3b2
            java.lang.Object r26 = r13.get(r2)
            r27 = r2
            r2 = r26
            d1.d r2 = (d1.C0953d) r2
            r26 = r4
            r17 = 0
            r4 = r22[r17]
            r28 = r7
            r18 = 1
            r7 = r22[r18]
            r29 = r0
            int[] r0 = r2.f11878p0
            r30 = r0
            r0 = r30[r17]
            r31 = r8
            r8 = r30[r18]
            boolean r0 = e1.AbstractC1028h.h(r4, r7, r0, r8)
            if (r0 != 0) goto L300
            e1.b r0 = r1.f11899L0
            V(r2, r10, r0)
        L300:
            boolean r0 = r2 instanceof d1.h
            if (r0 == 0) goto L324
            r4 = r2
            d1.h r4 = (d1.h) r4
            int r7 = r4.f11963u0
            if (r7 != 0) goto L315
            if (r12 != 0) goto L312
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L312:
            r12.add(r4)
        L315:
            int r7 = r4.f11963u0
            r8 = 1
            if (r7 != r8) goto L324
            if (r5 != 0) goto L321
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L321:
            r5.add(r4)
        L324:
            boolean r4 = r2 instanceof d1.i
            if (r4 == 0) goto L368
            boolean r4 = r2 instanceof d1.C0950a
            if (r4 == 0) goto L351
            r4 = r2
            d1.a r4 = (d1.C0950a) r4
            int r7 = r4.U()
            if (r7 != 0) goto L33f
            if (r6 != 0) goto L33c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L33c:
            r6.add(r4)
        L33f:
            int r7 = r4.U()
            r8 = 1
            if (r7 != r8) goto L368
            if (r15 != 0) goto L34d
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L34d:
            r15.add(r4)
            goto L368
        L351:
            r4 = r2
            d1.i r4 = (d1.i) r4
            if (r6 != 0) goto L35b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L35b:
            r6.add(r4)
            if (r15 != 0) goto L365
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L365:
            r15.add(r4)
        L368:
            d1.c r4 = r2.f11832I
            d1.c r4 = r4.f
            if (r4 != 0) goto L384
            d1.c r4 = r2.f11834K
            d1.c r4 = r4.f
            if (r4 != 0) goto L384
            if (r0 != 0) goto L384
            boolean r4 = r2 instanceof d1.C0950a
            if (r4 != 0) goto L384
            if (r11 != 0) goto L381
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L381:
            r11.add(r2)
        L384:
            d1.c r4 = r2.f11833J
            d1.c r4 = r4.f
            if (r4 != 0) goto L3a6
            d1.c r4 = r2.f11835L
            d1.c r4 = r4.f
            if (r4 != 0) goto L3a6
            d1.c r4 = r2.f11836M
            d1.c r4 = r4.f
            if (r4 != 0) goto L3a6
            if (r0 != 0) goto L3a6
            boolean r0 = r2 instanceof d1.C0950a
            if (r0 != 0) goto L3a6
            if (r3 != 0) goto L3a3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L3a3:
            r3.add(r2)
        L3a6:
            int r2 = r27 + 1
            r4 = r26
            r7 = r28
            r0 = r29
            r8 = r31
            goto L2d1
        L3b2:
            r29 = r0
            r26 = r4
            r28 = r7
            r31 = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L3d6
            int r2 = r5.size()
            r4 = 0
        L3c6:
            if (r4 >= r2) goto L3d6
            java.lang.Object r7 = r5.get(r4)
            int r4 = r4 + 1
            d1.h r7 = (d1.h) r7
            r8 = 0
            r10 = 0
            e1.AbstractC1028h.b(r7, r10, r0, r8)
            goto L3c6
        L3d6:
            if (r6 == 0) goto L3f4
            int r2 = r6.size()
            r4 = 0
        L3dd:
            if (r4 >= r2) goto L3f4
            java.lang.Object r5 = r6.get(r4)
            int r4 = r4 + 1
            d1.i r5 = (d1.i) r5
            r8 = 0
            r10 = 0
            e1.n r7 = e1.AbstractC1028h.b(r5, r10, r0, r8)
            r5.R(r10, r7, r0)
            r7.a(r0)
            goto L3dd
        L3f4:
            r2 = 2
            d1.c r4 = r1.i(r2)
            java.util.HashSet r2 = r4.f11817a
            if (r2 == 0) goto L415
            java.util.Iterator r2 = r2.iterator()
        L401:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L415
            java.lang.Object r4 = r2.next()
            d1.c r4 = (d1.C0952c) r4
            d1.d r4 = r4.f11820d
            r6 = 0
            r8 = 0
            e1.AbstractC1028h.b(r4, r6, r0, r8)
            goto L401
        L415:
            r2 = 4
            d1.c r2 = r1.i(r2)
            java.util.HashSet r2 = r2.f11817a
            if (r2 == 0) goto L436
            java.util.Iterator r2 = r2.iterator()
        L422:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L436
            java.lang.Object r4 = r2.next()
            d1.c r4 = (d1.C0952c) r4
            d1.d r4 = r4.f11820d
            r6 = 0
            r8 = 0
            e1.AbstractC1028h.b(r4, r6, r0, r8)
            goto L422
        L436:
            r2 = 7
            d1.c r4 = r1.i(r2)
            java.util.HashSet r4 = r4.f11817a
            if (r4 == 0) goto L457
            java.util.Iterator r4 = r4.iterator()
        L443:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L457
            java.lang.Object r5 = r4.next()
            d1.c r5 = (d1.C0952c) r5
            d1.d r5 = r5.f11820d
            r6 = 0
            r8 = 0
            e1.AbstractC1028h.b(r5, r6, r0, r8)
            goto L443
        L457:
            if (r11 == 0) goto L46e
            int r4 = r11.size()
            r5 = 0
        L45e:
            if (r5 >= r4) goto L46e
            java.lang.Object r6 = r11.get(r5)
            int r5 = r5 + 1
            d1.d r6 = (d1.C0953d) r6
            r8 = 0
            r10 = 0
            e1.AbstractC1028h.b(r6, r10, r0, r8)
            goto L45e
        L46e:
            if (r12 == 0) goto L485
            int r4 = r12.size()
            r5 = 0
        L475:
            if (r5 >= r4) goto L485
            java.lang.Object r6 = r12.get(r5)
            int r5 = r5 + 1
            d1.h r6 = (d1.h) r6
            r7 = 1
            r8 = 0
            e1.AbstractC1028h.b(r6, r7, r0, r8)
            goto L475
        L485:
            if (r15 == 0) goto L4a3
            int r4 = r15.size()
            r5 = 0
        L48c:
            if (r5 >= r4) goto L4a3
            java.lang.Object r6 = r15.get(r5)
            int r5 = r5 + 1
            d1.i r6 = (d1.i) r6
            r7 = 1
            r8 = 0
            e1.n r10 = e1.AbstractC1028h.b(r6, r7, r0, r8)
            r6.R(r7, r10, r0)
            r10.a(r0)
            goto L48c
        L4a3:
            r10 = 3
            d1.c r4 = r1.i(r10)
            java.util.HashSet r4 = r4.f11817a
            if (r4 == 0) goto L4c4
            java.util.Iterator r4 = r4.iterator()
        L4b0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4c4
            java.lang.Object r5 = r4.next()
            d1.c r5 = (d1.C0952c) r5
            d1.d r5 = r5.f11820d
            r8 = 0
            r15 = 1
            e1.AbstractC1028h.b(r5, r15, r0, r8)
            goto L4b0
        L4c4:
            r4 = 6
            d1.c r4 = r1.i(r4)
            java.util.HashSet r4 = r4.f11817a
            if (r4 == 0) goto L4e5
            java.util.Iterator r4 = r4.iterator()
        L4d1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e5
            java.lang.Object r5 = r4.next()
            d1.c r5 = (d1.C0952c) r5
            d1.d r5 = r5.f11820d
            r8 = 0
            r15 = 1
            e1.AbstractC1028h.b(r5, r15, r0, r8)
            goto L4d1
        L4e5:
            r4 = 5
            d1.c r5 = r1.i(r4)
            java.util.HashSet r4 = r5.f11817a
            if (r4 == 0) goto L506
            java.util.Iterator r4 = r4.iterator()
        L4f2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L506
            java.lang.Object r5 = r4.next()
            d1.c r5 = (d1.C0952c) r5
            d1.d r5 = r5.f11820d
            r8 = 0
            r15 = 1
            e1.AbstractC1028h.b(r5, r15, r0, r8)
            goto L4f2
        L506:
            d1.c r2 = r1.i(r2)
            java.util.HashSet r2 = r2.f11817a
            if (r2 == 0) goto L526
            java.util.Iterator r2 = r2.iterator()
        L512:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L526
            java.lang.Object r4 = r2.next()
            d1.c r4 = (d1.C0952c) r4
            d1.d r4 = r4.f11820d
            r8 = 0
            r15 = 1
            e1.AbstractC1028h.b(r4, r15, r0, r8)
            goto L512
        L526:
            if (r3 == 0) goto L53d
            int r2 = r3.size()
            r4 = 0
        L52d:
            if (r4 >= r2) goto L53d
            java.lang.Object r5 = r3.get(r4)
            int r4 = r4 + 1
            d1.d r5 = (d1.C0953d) r5
            r8 = 0
            r15 = 1
            e1.AbstractC1028h.b(r5, r15, r0, r8)
            goto L52d
        L53d:
            r15 = 1
            r2 = 0
        L53f:
            if (r2 >= r14) goto L596
            java.lang.Object r3 = r13.get(r2)
            d1.d r3 = (d1.C0953d) r3
            int[] r4 = r3.f11878p0
            r17 = 0
            r5 = r4[r17]
            r10 = 3
            if (r5 != r10) goto L592
            r4 = r4[r15]
            if (r4 != r10) goto L592
            int r4 = r3.f11874n0
            int r5 = r0.size()
            r6 = 0
        L55b:
            if (r6 >= r5) goto L56b
            java.lang.Object r7 = r0.get(r6)
            e1.n r7 = (e1.C1034n) r7
            int r8 = r7.f12535b
            if (r4 != r8) goto L568
            goto L56c
        L568:
            int r6 = r6 + 1
            goto L55b
        L56b:
            r7 = 0
        L56c:
            int r3 = r3.f11876o0
            int r4 = r0.size()
            r5 = 0
        L573:
            if (r5 >= r4) goto L583
            java.lang.Object r6 = r0.get(r5)
            e1.n r6 = (e1.C1034n) r6
            int r8 = r6.f12535b
            if (r3 != r8) goto L580
            goto L584
        L580:
            int r5 = r5 + 1
            goto L573
        L583:
            r6 = 0
        L584:
            if (r7 == 0) goto L592
            if (r6 == 0) goto L592
            r5 = 0
            r7.c(r5, r6)
            r3 = 2
            r6.f12536c = r3
            r0.remove(r7)
        L592:
            int r2 = r2 + 1
            r15 = 1
            goto L53f
        L596:
            int r2 = r0.size()
            r15 = 1
            if (r2 > r15) goto L59f
            goto L60b
        L59f:
            r17 = 0
            r2 = r22[r17]
            r3 = 2
            if (r2 != r3) goto L5d1
            int r2 = r0.size()
            r3 = 0
            r4 = 0
            r5 = 0
        L5ad:
            if (r4 >= r2) goto L5c7
            java.lang.Object r6 = r0.get(r4)
            int r4 = r4 + 1
            e1.n r6 = (e1.C1034n) r6
            int r7 = r6.f12536c
            r15 = 1
            if (r7 != r15) goto L5bd
            goto L5ad
        L5bd:
            r10 = 0
            int r7 = r6.b(r9, r10)
            if (r7 <= r3) goto L5ad
            r5 = r6
            r3 = r7
            goto L5ad
        L5c7:
            r15 = 1
            if (r5 == 0) goto L5d2
            r1.M(r15)
            r1.O(r3)
            goto L5d3
        L5d1:
            r15 = 1
        L5d2:
            r5 = 0
        L5d3:
            r2 = r22[r15]
            r3 = 2
            if (r2 != r3) goto L602
            int r2 = r0.size()
            r3 = 0
            r4 = 0
            r6 = 0
        L5df:
            if (r4 >= r2) goto L5f8
            java.lang.Object r7 = r0.get(r4)
            int r4 = r4 + 1
            e1.n r7 = (e1.C1034n) r7
            int r8 = r7.f12536c
            if (r8 != 0) goto L5ee
            goto L5df
        L5ee:
            r15 = 1
            int r8 = r7.b(r9, r15)
            if (r8 <= r3) goto L5df
            r6 = r7
            r3 = r8
            goto L5df
        L5f8:
            r15 = 1
            if (r6 == 0) goto L602
            r1.N(r15)
            r1.L(r3)
            goto L603
        L602:
            r6 = 0
        L603:
            if (r5 != 0) goto L607
            if (r6 == 0) goto L60b
        L607:
            r2 = r31
            r3 = 2
            goto L614
        L60b:
            r5 = r26
            r4 = r28
            r3 = r29
            r2 = r31
            goto L652
        L614:
            if (r2 != r3) goto L62f
            int r0 = r1.q()
            r3 = r29
            if (r3 >= r0) goto L627
            if (r3 <= 0) goto L627
            r1.O(r3)
            r15 = 1
            r1.f11892E0 = r15
            goto L631
        L627:
            int r0 = r1.q()
        L62b:
            r4 = r28
            r3 = 2
            goto L633
        L62f:
            r3 = r29
        L631:
            r0 = r3
            goto L62b
        L633:
            if (r4 != r3) goto L64b
            int r3 = r1.k()
            r5 = r26
            if (r5 >= r3) goto L646
            if (r5 <= 0) goto L646
            r1.L(r5)
            r15 = 1
            r1.f11893F0 = r15
            goto L64d
        L646:
            int r3 = r1.k()
            goto L64e
        L64b:
            r5 = r26
        L64d:
            r3 = r5
        L64e:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L653
        L652:
            r0 = 0
        L653:
            r6 = 64
            boolean r7 = r1.W(r6)
            if (r7 != 0) goto L666
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.W(r7)
            if (r7 == 0) goto L664
            goto L666
        L664:
            r7 = 0
            goto L667
        L666:
            r7 = 1
        L667:
            r9.getClass()
            r10 = 0
            r9.f9947h = r10
            int r8 = r1.D0
            if (r8 == 0) goto L677
            if (r7 == 0) goto L677
            r15 = 1
            r9.f9947h = r15
            goto L678
        L677:
            r15 = 1
        L678:
            java.util.ArrayList r7 = r1.f11900q0
            r8 = r22[r10]
            r11 = 2
            if (r8 == r11) goto L686
            r8 = r22[r15]
            if (r8 != r11) goto L684
            goto L686
        L684:
            r8 = r10
            goto L687
        L686:
            r8 = 1
        L687:
            r1.f11909z0 = r10
            r1.f11889A0 = r10
            r11 = r24
            r10 = 0
        L68e:
            if (r10 >= r11) goto L6a4
            java.util.ArrayList r12 = r1.f11900q0
            java.lang.Object r12 = r12.get(r10)
            d1.d r12 = (d1.C0953d) r12
            boolean r13 = r12 instanceof d1.e
            if (r13 == 0) goto L6a1
            d1.e r12 = (d1.e) r12
            r12.U()
        L6a1:
            int r10 = r10 + 1
            goto L68e
        L6a4:
            boolean r10 = r1.W(r6)
            r12 = r0
            r0 = 0
            r13 = 1
        L6ab:
            if (r13 == 0) goto L917
            r18 = 1
            int r14 = r0 + 1
            r9.t()     // Catch: java.lang.Exception -> L6cd
            r15 = 0
            r1.f11909z0 = r15     // Catch: java.lang.Exception -> L6cd
            r1.f11889A0 = r15     // Catch: java.lang.Exception -> L6cd
            r1.g(r9)     // Catch: java.lang.Exception -> L6cd
            r0 = 0
        L6bd:
            if (r0 >= r11) goto L6d8
            java.util.ArrayList r15 = r1.f11900q0     // Catch: java.lang.Exception -> L6cd
            java.lang.Object r15 = r15.get(r0)     // Catch: java.lang.Exception -> L6cd
            d1.d r15 = (d1.C0953d) r15     // Catch: java.lang.Exception -> L6cd
            r15.g(r9)     // Catch: java.lang.Exception -> L6cd
            int r0 = r0 + 1
            goto L6bd
        L6cd:
            r0 = move-exception
            r24 = r12
            r15 = r23
            r12 = 5
            r23 = r8
            r8 = 0
            goto L7b7
        L6d8:
            r1.S(r9)     // Catch: java.lang.Exception -> L6cd
            java.lang.ref.WeakReference r0 = r1.f11894G0     // Catch: java.lang.Exception -> L7ac
            if (r0 == 0) goto L71a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L712
            if (r0 == 0) goto L71a
            java.lang.ref.WeakReference r0 = r1.f11894G0     // Catch: java.lang.Exception -> L712
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L712
            d1.c r0 = (d1.C0952c) r0     // Catch: java.lang.Exception -> L712
            r15 = r23
            b1.f r13 = r9.k(r15)     // Catch: java.lang.Exception -> L70c
            b1.c r6 = r1.f11906w0     // Catch: java.lang.Exception -> L70c
            b1.f r0 = r6.k(r0)     // Catch: java.lang.Exception -> L70c
            r23 = r8
            r24 = r12
            r8 = 5
            r12 = 0
            r6.f(r0, r13, r12, r8)     // Catch: java.lang.Exception -> L706
            r8 = 0
            r1.f11894G0 = r8     // Catch: java.lang.Exception -> L706
            goto L720
        L706:
            r0 = move-exception
        L707:
            r8 = 0
            r12 = 5
        L709:
            r13 = 1
            goto L7b7
        L70c:
            r0 = move-exception
            r23 = r8
            r24 = r12
            goto L707
        L712:
            r0 = move-exception
            r24 = r12
            r15 = r23
            r23 = r8
            goto L707
        L71a:
            r24 = r12
            r15 = r23
            r23 = r8
        L720:
            java.lang.ref.WeakReference r0 = r1.f11896I0     // Catch: java.lang.Exception -> L706
            if (r0 == 0) goto L746
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L706
            if (r0 == 0) goto L746
            java.lang.ref.WeakReference r0 = r1.f11896I0     // Catch: java.lang.Exception -> L706
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L706
            d1.c r0 = (d1.C0952c) r0     // Catch: java.lang.Exception -> L706
            d1.c r6 = r1.f11835L     // Catch: java.lang.Exception -> L706
            b1.f r6 = r9.k(r6)     // Catch: java.lang.Exception -> L706
            b1.c r8 = r1.f11906w0     // Catch: java.lang.Exception -> L706
            b1.f r0 = r8.k(r0)     // Catch: java.lang.Exception -> L706
            r12 = 5
            r13 = 0
            r8.f(r6, r0, r13, r12)     // Catch: java.lang.Exception -> L706
            r8 = 0
            r1.f11896I0 = r8     // Catch: java.lang.Exception -> L706
        L746:
            java.lang.ref.WeakReference r0 = r1.f11895H0     // Catch: java.lang.Exception -> L706
            if (r0 == 0) goto L773
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L706
            if (r0 == 0) goto L773
            java.lang.ref.WeakReference r0 = r1.f11895H0     // Catch: java.lang.Exception -> L706
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L706
            d1.c r0 = (d1.C0952c) r0     // Catch: java.lang.Exception -> L706
            r6 = r25
            b1.f r8 = r9.k(r6)     // Catch: java.lang.Exception -> L76f
            b1.c r12 = r1.f11906w0     // Catch: java.lang.Exception -> L76f
            b1.f r0 = r12.k(r0)     // Catch: java.lang.Exception -> L76f
            r25 = r6
            r6 = 0
            r13 = 5
            r12.f(r0, r8, r6, r13)     // Catch: java.lang.Exception -> L706
            r8 = 0
            r1.f11895H0 = r8     // Catch: java.lang.Exception -> L706
            goto L773
        L76f:
            r0 = move-exception
            r25 = r6
            goto L707
        L773:
            java.lang.ref.WeakReference r0 = r1.f11897J0     // Catch: java.lang.Exception -> L706
            if (r0 == 0) goto L7a5
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L706
            if (r0 == 0) goto L7a5
            java.lang.ref.WeakReference r0 = r1.f11897J0     // Catch: java.lang.Exception -> L706
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L706
            d1.c r0 = (d1.C0952c) r0     // Catch: java.lang.Exception -> L706
            d1.c r6 = r1.f11834K     // Catch: java.lang.Exception -> L706
            b1.f r6 = r9.k(r6)     // Catch: java.lang.Exception -> L706
            b1.c r8 = r1.f11906w0     // Catch: java.lang.Exception -> L7a2
            b1.f r0 = r8.k(r0)     // Catch: java.lang.Exception -> L79f
            r12 = 5
            r13 = 0
            r8.f(r6, r0, r13, r12)     // Catch: java.lang.Exception -> L79d
            r8 = 0
            r1.f11897J0 = r8     // Catch: java.lang.Exception -> L79a
            goto L7a7
        L79a:
            r0 = move-exception
            goto L709
        L79d:
            r0 = move-exception
            goto L7b4
        L79f:
            r0 = move-exception
            r12 = 5
            goto L7b4
        L7a2:
            r0 = move-exception
            goto L707
        L7a5:
            r8 = 0
            r12 = 5
        L7a7:
            r9.p()     // Catch: java.lang.Exception -> L79a
            r13 = 1
            goto L7cd
        L7ac:
            r0 = move-exception
            r24 = r12
            r15 = r23
            r12 = 5
            r23 = r8
        L7b4:
            r8 = 0
            goto L709
        L7b7:
            r0.printStackTrace()
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r12 = "EXCEPTION : "
            r8.<init>(r12)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r6.println(r0)
        L7cd:
            boolean[] r0 = d1.j.f11967a
            if (r13 == 0) goto L812
            r17 = 0
            r19 = 2
            r0[r19] = r17
            r6 = 64
            boolean r8 = r1.W(r6)
            r1.Q(r9, r8)
            java.util.ArrayList r12 = r1.f11900q0
            int r12 = r12.size()
            r13 = 0
            r16 = 0
        L7e9:
            if (r13 >= r12) goto L80e
            java.util.ArrayList r6 = r1.f11900q0
            java.lang.Object r6 = r6.get(r13)
            d1.d r6 = (d1.C0953d) r6
            r6.Q(r9, r8)
            r27 = r0
            int r0 = r6.f11863h
            r28 = r8
            r8 = -1
            if (r0 != r8) goto L803
            int r0 = r6.i
            if (r0 == r8) goto L805
        L803:
            r16 = 1
        L805:
            int r13 = r13 + 1
            r0 = r27
            r8 = r28
            r6 = 64
            goto L7e9
        L80e:
            r27 = r0
            r8 = -1
            goto L82b
        L812:
            r27 = r0
            r8 = -1
            r1.Q(r9, r10)
            r0 = 0
        L819:
            if (r0 >= r11) goto L829
            java.util.ArrayList r6 = r1.f11900q0
            java.lang.Object r6 = r6.get(r0)
            d1.d r6 = (d1.C0953d) r6
            r6.Q(r9, r10)
            int r0 = r0 + 1
            goto L819
        L829:
            r16 = 0
        L82b:
            r0 = 8
            if (r23 == 0) goto L894
            if (r14 >= r0) goto L894
            r19 = 2
            boolean r6 = r27[r19]
            if (r6 == 0) goto L894
            r6 = 0
            r12 = 0
            r13 = 0
        L83a:
            if (r6 >= r11) goto L861
            java.util.ArrayList r8 = r1.f11900q0
            java.lang.Object r8 = r8.get(r6)
            d1.d r8 = (d1.C0953d) r8
            int r0 = r8.f11848Y
            int r28 = r8.q()
            int r0 = r28 + r0
            int r12 = java.lang.Math.max(r12, r0)
            int r0 = r8.f11849Z
            int r8 = r8.k()
            int r8 = r8 + r0
            int r13 = java.lang.Math.max(r13, r8)
            int r6 = r6 + 1
            r0 = 8
            r8 = -1
            goto L83a
        L861:
            int r0 = r1.f11853b0
            int r0 = java.lang.Math.max(r0, r12)
            int r6 = r1.f11855c0
            int r6 = java.lang.Math.max(r6, r13)
            r8 = 2
            if (r2 != r8) goto L881
            int r12 = r1.q()
            if (r12 >= r0) goto L881
            r1.O(r0)
            r17 = 0
            r22[r17] = r8
            r16 = 1
            r24 = 1
        L881:
            if (r4 != r8) goto L894
            int r0 = r1.k()
            if (r0 >= r6) goto L894
            r1.L(r6)
            r18 = 1
            r22[r18] = r8
            r16 = 1
            r24 = 1
        L894:
            int r0 = r1.f11853b0
            int r6 = r1.q()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r1.q()
            if (r0 <= r6) goto L8b1
            r1.O(r0)
            r8 = 1
            r17 = 0
            r22[r17] = r8
            r16 = r8
            r18 = r16
            goto L8b4
        L8b1:
            r8 = 1
            r18 = r24
        L8b4:
            int r0 = r1.f11855c0
            int r6 = r1.k()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r1.k()
            if (r0 <= r6) goto L8cd
            r1.L(r0)
            r22[r8] = r8
            r0 = r8
            r16 = r0
            goto L8cf
        L8cd:
            r0 = r18
        L8cf:
            if (r0 != 0) goto L906
            r17 = 0
            r6 = r22[r17]
            r12 = 2
            if (r6 != r12) goto L8ea
            if (r3 <= 0) goto L8ea
            int r6 = r1.q()
            if (r6 <= r3) goto L8ea
            r1.f11892E0 = r8
            r22[r17] = r8
            r1.O(r3)
            r0 = r8
            r16 = r0
        L8ea:
            r6 = r22[r8]
            r12 = 2
            if (r6 != r12) goto L903
            if (r5 <= 0) goto L903
            int r6 = r1.k()
            if (r6 <= r5) goto L903
            r1.f11893F0 = r8
            r22[r8] = r8
            r1.L(r5)
            r0 = 1
            r6 = 1
        L900:
            r8 = 8
            goto L908
        L903:
            r6 = r16
            goto L900
        L906:
            r12 = 2
            goto L903
        L908:
            if (r14 <= r8) goto L90c
            r13 = 0
            goto L90d
        L90c:
            r13 = r6
        L90d:
            r12 = r0
            r0 = r14
            r8 = r23
            r6 = 64
            r23 = r15
            goto L6ab
        L917:
            r24 = r12
            r1.f11900q0 = r7
            if (r24 == 0) goto L925
            r17 = 0
            r22[r17] = r2
            r18 = 1
            r22[r18] = r4
        L925:
            B0.G0 r0 = r9.f9950m
            r1.F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e.U():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f11844U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f11845V);
        sb.append("\n");
        ArrayList arrayList = this.f11900q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C0953d) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
