package h0;

import B0.AbstractC0036d0;
import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.C0042g0;
import B0.L;
import C0.C0097q;
import C0.C0100s;
import C0.C0102t;
import C0.C0104u;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import c0.AbstractC0724l;
import r.C1544C;
import r.O;
import r.z;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: h0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1115h implements InterfaceC1114g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0102t f13408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0097q f13409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0104u f13410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f13411d = new o(2, null, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1112e f13412e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f13413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f13414h;
    public final C1544C i;
    public o j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public C1115h(C0100s c0100s, C0102t c0102t, C0097q c0097q, C0104u c0104u) {
        this.f13408a = c0102t;
        this.f13409b = c0097q;
        this.f13410c = c0104u;
        int i = 0;
        this.f13412e = new C1112e(c0100s, new C0097q(i, this, C1115h.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 6), new C.i(i, 4, C1115h.class, this, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;"), new C0104u(i, 1, C1115h.class, this, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;"));
        p pVar = new p();
        O.b();
        this.f = pVar;
        this.f13413g = new AbstractC0036d0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B0.AbstractC0036d0
            public final AbstractC0724l f() {
                return this.f9321q.f13411d;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B0.AbstractC0036d0
            public final /* bridge */ /* synthetic */ void g(AbstractC0724l abstractC0724l) {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                return this.f9321q.f13411d.hashCode();
            }
        };
        this.i = new C1544C(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(boolean z5) {
        C0042g0 c0042g0;
        o oVar = this.j;
        if (oVar != null) {
            e(null);
            n nVar = n.f13430q;
            n nVar2 = n.f13433t;
            oVar.x0(nVar, nVar2);
            if (!oVar.f10100q.f10099D) {
                AbstractC1904a.b("visitAncestors called on an unattached node");
            }
            AbstractC0724l abstractC0724l = oVar.f10100q.f10104u;
            L lU = AbstractC0041g.u(oVar);
            while (lU != null) {
                if ((lU.f268U.f433e.f10103t & 1024) != 0) {
                    while (abstractC0724l != null) {
                        if ((abstractC0724l.f10102s & 1024) != 0) {
                            R.e eVar = null;
                            AbstractC0724l abstractC0724lF = abstractC0724l;
                            while (abstractC0724lF != null) {
                                if (abstractC0724lF instanceof o) {
                                    ((o) abstractC0724lF).x0(n.f13431r, nVar2);
                                } else if ((abstractC0724lF.f10102s & 1024) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                    int i = 0;
                                    for (AbstractC0724l abstractC0724l2 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
                                        if ((abstractC0724l2.f10102s & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC0724lF = abstractC0724l2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (abstractC0724lF != null) {
                                                    eVar.c(abstractC0724lF);
                                                    abstractC0724lF = null;
                                                }
                                                eVar.c(abstractC0724l2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC0724lF = AbstractC0041g.f(eVar);
                            }
                        }
                        abstractC0724l = abstractC0724l.f10104u;
                    }
                }
                lU = lU.s();
                abstractC0724l = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(int i, boolean z5, boolean z6) {
        int iOrdinal;
        boolean z7 = true;
        if (z5 || (iOrdinal = AbstractC1111d.t(this.f13411d, i).ordinal()) == 0) {
            a(z5);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new C2.e();
            }
            z7 = false;
        }
        if (z7 && z6) {
            this.f13409b.invoke();
        }
        return z7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:108:0x0137 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:203:0x024d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:235:0x02ad */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:289:0x025c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:290:0x0214 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:292:0x0214 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:295:0x0256 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:303:0x02bc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:304:0x0274 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:306:0x0274 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:309:0x02b6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:325:0x00c0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:328:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:329:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:333:0x00ba */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:346:0x0146 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:350:0x0109 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:351:0x0109 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:355:0x0140 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x00b1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [R.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [R.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r15v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r15v9, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35, types: [R.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [R.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.KeyEvent r14, B5.a r15) {
        /*
            r13 = this;
            h0.o r0 = r13.f13411d
            java.lang.String r1 = "FocusOwnerImpl:dispatchKeyEvent"
            android.os.Trace.beginSection(r1)
            h0.e r1 = r13.f13412e     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.f     // Catch: java.lang.Throwable -> L19
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.String r14 = "FocusRelatedWarning: Dispatching key event while focus system is invalidated."
            java.io.PrintStream r15 = java.lang.System.out     // Catch: java.lang.Throwable -> L19
            r15.println(r14)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r2
        L19:
            r14 = move-exception
            goto L2e1
        L1c:
            boolean r1 = r13.f(r14)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L26
            android.os.Trace.endSection()
            return r2
        L26:
            h0.o r1 = h0.AbstractC1111d.g(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "visitAncestors called on an unattached node"
            r4 = 16
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L5c
            c0.l r7 = r1.f10100q     // Catch: java.lang.Throwable -> L19
            boolean r7 = r7.f10099D     // Catch: java.lang.Throwable -> L19
            if (r7 != 0) goto L3d
            java.lang.String r7 = "visitLocalDescendants called on an unattached node"
            y0.AbstractC1904a.b(r7)     // Catch: java.lang.Throwable -> L19
        L3d:
            c0.l r7 = r1.f10100q     // Catch: java.lang.Throwable -> L19
            int r8 = r7.f10103t     // Catch: java.lang.Throwable -> L19
            r8 = r8 & 9216(0x2400, float:1.2914E-41)
            if (r8 == 0) goto L59
            c0.l r7 = r7.f10105v     // Catch: java.lang.Throwable -> L19
            r8 = r5
        L48:
            if (r7 == 0) goto L5a
            int r9 = r7.f10102s     // Catch: java.lang.Throwable -> L19
            r10 = r9 & 9216(0x2400, float:1.2914E-41)
            if (r10 == 0) goto L56
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L55
            goto L5a
        L55:
            r8 = r7
        L56:
            c0.l r7 = r7.f10105v     // Catch: java.lang.Throwable -> L19
            goto L48
        L59:
            r8 = r5
        L5a:
            if (r8 != 0) goto L168
        L5c:
            if (r1 == 0) goto Le2
            c0.l r7 = r1.f10100q     // Catch: java.lang.Throwable -> L19
            boolean r7 = r7.f10099D     // Catch: java.lang.Throwable -> L19
            if (r7 != 0) goto L67
            y0.AbstractC1904a.b(r3)     // Catch: java.lang.Throwable -> L19
        L67:
            c0.l r7 = r1.f10100q     // Catch: java.lang.Throwable -> L19
            B0.L r1 = B0.AbstractC0041g.u(r1)     // Catch: java.lang.Throwable -> L19
        L6d:
            if (r1 == 0) goto Ld7
            B0.g0 r8 = r1.f268U     // Catch: java.lang.Throwable -> L19
            c0.l r8 = r8.f433e     // Catch: java.lang.Throwable -> L19
            int r8 = r8.f10103t     // Catch: java.lang.Throwable -> L19
            r8 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto Lc8
        L79:
            if (r7 == 0) goto Lc8
            int r8 = r7.f10102s     // Catch: java.lang.Throwable -> L19
            r8 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto Lc5
            r9 = r5
            r8 = r7
        L83:
            if (r8 == 0) goto Lc5
            boolean r10 = r8 instanceof t0.c     // Catch: java.lang.Throwable -> L19
            if (r10 == 0) goto L8a
            goto Ld8
        L8a:
            int r10 = r8.f10102s     // Catch: java.lang.Throwable -> L19
            r10 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto Lc0
            boolean r10 = r8 instanceof B0.AbstractC0049n     // Catch: java.lang.Throwable -> L19
            if (r10 == 0) goto Lc0
            r10 = r8
            B0.n r10 = (B0.AbstractC0049n) r10     // Catch: java.lang.Throwable -> L19
            c0.l r10 = r10.f473F     // Catch: java.lang.Throwable -> L19
            r11 = r2
        L9a:
            if (r10 == 0) goto Lbd
            int r12 = r10.f10102s     // Catch: java.lang.Throwable -> L19
            r12 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto Lba
            int r11 = r11 + 1
            if (r11 != r6) goto La8
            r8 = r10
            goto Lba
        La8:
            if (r9 != 0) goto Lb1
            R.e r9 = new R.e     // Catch: java.lang.Throwable -> L19
            c0.l[] r12 = new c0.AbstractC0724l[r4]     // Catch: java.lang.Throwable -> L19
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L19
        Lb1:
            if (r8 == 0) goto Lb7
            r9.c(r8)     // Catch: java.lang.Throwable -> L19
            r8 = r5
        Lb7:
            r9.c(r10)     // Catch: java.lang.Throwable -> L19
        Lba:
            c0.l r10 = r10.f10105v     // Catch: java.lang.Throwable -> L19
            goto L9a
        Lbd:
            if (r11 != r6) goto Lc0
            goto L83
        Lc0:
            c0.l r8 = B0.AbstractC0041g.f(r9)     // Catch: java.lang.Throwable -> L19
            goto L83
        Lc5:
            c0.l r7 = r7.f10104u     // Catch: java.lang.Throwable -> L19
            goto L79
        Lc8:
            B0.L r1 = r1.s()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto Ld5
            B0.g0 r7 = r1.f268U     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto Ld5
            B0.B0 r7 = r7.f432d     // Catch: java.lang.Throwable -> L19
            goto L6d
        Ld5:
            r7 = r5
            goto L6d
        Ld7:
            r8 = r5
        Ld8:
            t0.c r8 = (t0.c) r8     // Catch: java.lang.Throwable -> L19
            if (r8 == 0) goto Le2
            c0.l r8 = (c0.AbstractC0724l) r8     // Catch: java.lang.Throwable -> L19
            c0.l r8 = r8.f10100q     // Catch: java.lang.Throwable -> L19
            goto L168
        Le2:
            c0.l r1 = r0.f10100q     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.f10099D     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto Leb
            y0.AbstractC1904a.b(r3)     // Catch: java.lang.Throwable -> L19
        Leb:
            c0.l r1 = r0.f10100q     // Catch: java.lang.Throwable -> L19
            c0.l r1 = r1.f10104u     // Catch: java.lang.Throwable -> L19
            B0.L r0 = B0.AbstractC0041g.u(r0)     // Catch: java.lang.Throwable -> L19
        Lf3:
            if (r0 == 0) goto L15d
            B0.g0 r7 = r0.f268U     // Catch: java.lang.Throwable -> L19
            c0.l r7 = r7.f433e     // Catch: java.lang.Throwable -> L19
            int r7 = r7.f10103t     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L14e
        Lff:
            if (r1 == 0) goto L14e
            int r7 = r1.f10102s     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L14b
            r7 = r1
            r8 = r5
        L109:
            if (r7 == 0) goto L14b
            boolean r9 = r7 instanceof t0.c     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L110
            goto L15e
        L110:
            int r9 = r7.f10102s     // Catch: java.lang.Throwable -> L19
            r9 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L146
            boolean r9 = r7 instanceof B0.AbstractC0049n     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L146
            r9 = r7
            B0.n r9 = (B0.AbstractC0049n) r9     // Catch: java.lang.Throwable -> L19
            c0.l r9 = r9.f473F     // Catch: java.lang.Throwable -> L19
            r10 = r2
        L120:
            if (r9 == 0) goto L143
            int r11 = r9.f10102s     // Catch: java.lang.Throwable -> L19
            r11 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L140
            int r10 = r10 + 1
            if (r10 != r6) goto L12e
            r7 = r9
            goto L140
        L12e:
            if (r8 != 0) goto L137
            R.e r8 = new R.e     // Catch: java.lang.Throwable -> L19
            c0.l[] r11 = new c0.AbstractC0724l[r4]     // Catch: java.lang.Throwable -> L19
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L19
        L137:
            if (r7 == 0) goto L13d
            r8.c(r7)     // Catch: java.lang.Throwable -> L19
            r7 = r5
        L13d:
            r8.c(r9)     // Catch: java.lang.Throwable -> L19
        L140:
            c0.l r9 = r9.f10105v     // Catch: java.lang.Throwable -> L19
            goto L120
        L143:
            if (r10 != r6) goto L146
            goto L109
        L146:
            c0.l r7 = B0.AbstractC0041g.f(r8)     // Catch: java.lang.Throwable -> L19
            goto L109
        L14b:
            c0.l r1 = r1.f10104u     // Catch: java.lang.Throwable -> L19
            goto Lff
        L14e:
            B0.L r0 = r0.s()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L15b
            B0.g0 r1 = r0.f268U     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L15b
            B0.B0 r1 = r1.f432d     // Catch: java.lang.Throwable -> L19
            goto Lf3
        L15b:
            r1 = r5
            goto Lf3
        L15d:
            r7 = r5
        L15e:
            t0.c r7 = (t0.c) r7     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L167
            c0.l r7 = (c0.AbstractC0724l) r7     // Catch: java.lang.Throwable -> L19
            c0.l r8 = r7.f10100q     // Catch: java.lang.Throwable -> L19
            goto L168
        L167:
            r8 = r5
        L168:
            if (r8 == 0) goto L2dd
            c0.l r0 = r8.f10100q     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.f10099D     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L173
            y0.AbstractC1904a.b(r3)     // Catch: java.lang.Throwable -> L19
        L173:
            c0.l r0 = r8.f10100q     // Catch: java.lang.Throwable -> L19
            c0.l r0 = r0.f10104u     // Catch: java.lang.Throwable -> L19
            B0.L r1 = B0.AbstractC0041g.u(r8)     // Catch: java.lang.Throwable -> L19
            r3 = r5
        L17c:
            if (r1 == 0) goto L1f0
            B0.g0 r7 = r1.f268U     // Catch: java.lang.Throwable -> L19
            c0.l r7 = r7.f433e     // Catch: java.lang.Throwable -> L19
            int r7 = r7.f10103t     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L1e1
        L188:
            if (r0 == 0) goto L1e1
            int r7 = r0.f10102s     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L1de
            r7 = r0
            r9 = r5
        L192:
            if (r7 == 0) goto L1de
            boolean r10 = r7 instanceof t0.c     // Catch: java.lang.Throwable -> L19
            if (r10 == 0) goto L1a3
            if (r3 != 0) goto L19f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19
            r3.<init>()     // Catch: java.lang.Throwable -> L19
        L19f:
            r3.add(r7)     // Catch: java.lang.Throwable -> L19
            goto L1d9
        L1a3:
            int r10 = r7.f10102s     // Catch: java.lang.Throwable -> L19
            r10 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L1d9
            boolean r10 = r7 instanceof B0.AbstractC0049n     // Catch: java.lang.Throwable -> L19
            if (r10 == 0) goto L1d9
            r10 = r7
            B0.n r10 = (B0.AbstractC0049n) r10     // Catch: java.lang.Throwable -> L19
            c0.l r10 = r10.f473F     // Catch: java.lang.Throwable -> L19
            r11 = r2
        L1b3:
            if (r10 == 0) goto L1d6
            int r12 = r10.f10102s     // Catch: java.lang.Throwable -> L19
            r12 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L1d3
            int r11 = r11 + 1
            if (r11 != r6) goto L1c1
            r7 = r10
            goto L1d3
        L1c1:
            if (r9 != 0) goto L1ca
            R.e r9 = new R.e     // Catch: java.lang.Throwable -> L19
            c0.l[] r12 = new c0.AbstractC0724l[r4]     // Catch: java.lang.Throwable -> L19
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L19
        L1ca:
            if (r7 == 0) goto L1d0
            r9.c(r7)     // Catch: java.lang.Throwable -> L19
            r7 = r5
        L1d0:
            r9.c(r10)     // Catch: java.lang.Throwable -> L19
        L1d3:
            c0.l r10 = r10.f10105v     // Catch: java.lang.Throwable -> L19
            goto L1b3
        L1d6:
            if (r11 != r6) goto L1d9
            goto L192
        L1d9:
            c0.l r7 = B0.AbstractC0041g.f(r9)     // Catch: java.lang.Throwable -> L19
            goto L192
        L1de:
            c0.l r0 = r0.f10104u     // Catch: java.lang.Throwable -> L19
            goto L188
        L1e1:
            B0.L r1 = r1.s()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1ee
            B0.g0 r0 = r1.f268U     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1ee
            B0.B0 r0 = r0.f432d     // Catch: java.lang.Throwable -> L19
            goto L17c
        L1ee:
            r0 = r5
            goto L17c
        L1f0:
            if (r3 == 0) goto L211
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L19
            int r0 = r0 + (-1)
            if (r0 < 0) goto L211
        L1fa:
            int r1 = r0 + (-1)
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L19
            t0.c r0 = (t0.c) r0     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.k(r14)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L20c
            android.os.Trace.endSection()
            return r6
        L20c:
            if (r1 >= 0) goto L20f
            goto L211
        L20f:
            r0 = r1
            goto L1fa
        L211:
            c0.l r0 = r8.f10100q     // Catch: java.lang.Throwable -> L19
            r1 = r5
        L214:
            if (r0 == 0) goto L261
            boolean r7 = r0 instanceof t0.c     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L226
            t0.c r0 = (t0.c) r0     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.k(r14)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L25c
            android.os.Trace.endSection()
            return r6
        L226:
            int r7 = r0.f10102s     // Catch: java.lang.Throwable -> L19
            r7 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L25c
            boolean r7 = r0 instanceof B0.AbstractC0049n     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L25c
            r7 = r0
            B0.n r7 = (B0.AbstractC0049n) r7     // Catch: java.lang.Throwable -> L19
            c0.l r7 = r7.f473F     // Catch: java.lang.Throwable -> L19
            r9 = r2
        L236:
            if (r7 == 0) goto L259
            int r10 = r7.f10102s     // Catch: java.lang.Throwable -> L19
            r10 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L256
            int r9 = r9 + 1
            if (r9 != r6) goto L244
            r0 = r7
            goto L256
        L244:
            if (r1 != 0) goto L24d
            R.e r1 = new R.e     // Catch: java.lang.Throwable -> L19
            c0.l[] r10 = new c0.AbstractC0724l[r4]     // Catch: java.lang.Throwable -> L19
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L19
        L24d:
            if (r0 == 0) goto L253
            r1.c(r0)     // Catch: java.lang.Throwable -> L19
            r0 = r5
        L253:
            r1.c(r7)     // Catch: java.lang.Throwable -> L19
        L256:
            c0.l r7 = r7.f10105v     // Catch: java.lang.Throwable -> L19
            goto L236
        L259:
            if (r9 != r6) goto L25c
            goto L214
        L25c:
            c0.l r0 = B0.AbstractC0041g.f(r1)     // Catch: java.lang.Throwable -> L19
            goto L214
        L261:
            java.lang.Object r15 = r15.invoke()     // Catch: java.lang.Throwable -> L19
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> L19
            boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r15 == 0) goto L271
            android.os.Trace.endSection()
            return r6
        L271:
            c0.l r15 = r8.f10100q     // Catch: java.lang.Throwable -> L19
            r0 = r5
        L274:
            if (r15 == 0) goto L2c1
            boolean r1 = r15 instanceof t0.c     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L286
            t0.c r15 = (t0.c) r15     // Catch: java.lang.Throwable -> L19
            boolean r15 = r15.K(r14)     // Catch: java.lang.Throwable -> L19
            if (r15 == 0) goto L2bc
            android.os.Trace.endSection()
            return r6
        L286:
            int r1 = r15.f10102s     // Catch: java.lang.Throwable -> L19
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L2bc
            boolean r1 = r15 instanceof B0.AbstractC0049n     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L2bc
            r1 = r15
            B0.n r1 = (B0.AbstractC0049n) r1     // Catch: java.lang.Throwable -> L19
            c0.l r1 = r1.f473F     // Catch: java.lang.Throwable -> L19
            r7 = r2
        L296:
            if (r1 == 0) goto L2b9
            int r8 = r1.f10102s     // Catch: java.lang.Throwable -> L19
            r8 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L2b6
            int r7 = r7 + 1
            if (r7 != r6) goto L2a4
            r15 = r1
            goto L2b6
        L2a4:
            if (r0 != 0) goto L2ad
            R.e r0 = new R.e     // Catch: java.lang.Throwable -> L19
            c0.l[] r8 = new c0.AbstractC0724l[r4]     // Catch: java.lang.Throwable -> L19
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L19
        L2ad:
            if (r15 == 0) goto L2b3
            r0.c(r15)     // Catch: java.lang.Throwable -> L19
            r15 = r5
        L2b3:
            r0.c(r1)     // Catch: java.lang.Throwable -> L19
        L2b6:
            c0.l r1 = r1.f10105v     // Catch: java.lang.Throwable -> L19
            goto L296
        L2b9:
            if (r7 != r6) goto L2bc
            goto L274
        L2bc:
            c0.l r15 = B0.AbstractC0041g.f(r0)     // Catch: java.lang.Throwable -> L19
            goto L274
        L2c1:
            if (r3 == 0) goto L2dd
            int r15 = r3.size()     // Catch: java.lang.Throwable -> L19
            r0 = r2
        L2c8:
            if (r0 >= r15) goto L2dd
            java.lang.Object r1 = r3.get(r0)     // Catch: java.lang.Throwable -> L19
            t0.c r1 = (t0.c) r1     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.K(r14)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L2da
            android.os.Trace.endSection()
            return r6
        L2da:
            int r0 = r0 + 1
            goto L2c8
        L2dd:
            android.os.Trace.endSection()
            return r2
        L2e1:
            android.os.Trace.endSection()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C1115h.c(android.view.KeyEvent, B5.a):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x011c, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[PHI: r11
  0x005f: PHI (r11v15 h0.m) = (r11v12 h0.m), (r11v19 h0.m) binds: [B:38:0x007c, B:24:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v2, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r7v8, types: [B5.c, kotlin.jvm.internal.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean d(int r19, i0.C1131c r20, B5.c r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            h0.o r4 = r0.f13411d
            h0.o r5 = h0.AbstractC1111d.g(r4)
            r8 = 8
            r9 = 4
            r10 = 3
            r11 = 6
            r12 = 5
            r13 = 2
            r14 = 1
            r15 = 7
            C0.u r6 = r0.f13410c
            r16 = 0
            if (r5 == 0) goto L1cf
            java.lang.Object r17 = r6.get()
            W0.l r17 = (W0.l) r17
            h0.k r7 = r5.y0()
            if (r1 != r14) goto L2d
            h0.m r7 = r7.f13419b
            goto Lb9
        L2d:
            if (r1 != r13) goto L33
            h0.m r7 = r7.f13420c
            goto Lb9
        L33:
            if (r1 != r12) goto L39
            h0.m r7 = r7.f13421d
            goto Lb9
        L39:
            if (r1 != r11) goto L3f
            h0.m r7 = r7.f13422e
            goto Lb9
        L3f:
            if (r1 != r10) goto L61
            int r11 = r17.ordinal()
            if (r11 == 0) goto L52
            if (r11 != r14) goto L4c
            h0.m r11 = r7.i
            goto L54
        L4c:
            C2.e r1 = new C2.e
            r1.<init>()
            throw r1
        L52:
            h0.m r11 = r7.f13424h
        L54:
            h0.m r12 = h0.m.f13426b
            if (r11 != r12) goto L5a
            r11 = r16
        L5a:
            if (r11 != 0) goto L5f
            h0.m r7 = r7.f
            goto Lb9
        L5f:
            r7 = r11
            goto Lb9
        L61:
            if (r1 != r9) goto L81
            int r11 = r17.ordinal()
            if (r11 == 0) goto L74
            if (r11 != r14) goto L6e
            h0.m r11 = r7.f13424h
            goto L76
        L6e:
            C2.e r1 = new C2.e
            r1.<init>()
            throw r1
        L74:
            h0.m r11 = r7.i
        L76:
            h0.m r12 = h0.m.f13426b
            if (r11 != r12) goto L7c
            r11 = r16
        L7c:
            if (r11 != 0) goto L5f
            h0.m r7 = r7.f13423g
            goto Lb9
        L81:
            if (r1 != r15) goto L84
            goto L86
        L84:
            if (r1 != r8) goto L1c7
        L86:
            h0.a r11 = new h0.a
            r11.<init>(r1)
            h0.AbstractC1111d.o(r5)
            B0.t0 r12 = B0.AbstractC0041g.v(r5)
            C0.A r12 = (C0.A) r12
            h0.g r12 = r12.getFocusOwner()
            h0.h r12 = (h0.C1115h) r12
            h0.o r8 = r12.j
            if (r1 != r15) goto La4
            kotlin.jvm.internal.n r7 = r7.j
            r7.invoke(r11)
            goto La9
        La4:
            kotlin.jvm.internal.n r7 = r7.f13425k
            r7.invoke(r11)
        La9:
            boolean r7 = r11.f13395b
            if (r7 == 0) goto Lb0
            h0.m r7 = h0.m.f13427c
            goto Lb9
        Lb0:
            h0.o r7 = r12.j
            if (r8 == r7) goto Lb7
            h0.m r7 = h0.m.f13428d
            goto Lb9
        Lb7:
            h0.m r7 = h0.m.f13426b
        Lb9:
            h0.m r8 = h0.m.f13427c
            boolean r11 = kotlin.jvm.internal.m.a(r7, r8)
            if (r11 == 0) goto Lc3
            goto L22a
        Lc3:
            h0.m r11 = h0.m.f13428d
            boolean r11 = kotlin.jvm.internal.m.a(r7, r11)
            if (r11 == 0) goto Ld8
            h0.o r1 = h0.AbstractC1111d.g(r4)
            if (r1 == 0) goto L22a
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            return r1
        Ld8:
            h0.m r11 = h0.m.f13426b
            boolean r12 = kotlin.jvm.internal.m.a(r7, r11)
            if (r12 != 0) goto L1d1
            r7.getClass()
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r7 == r11) goto L1c1
            if (r7 == r8) goto L1bb
            R.e r1 = r7.f13429a
            int r2 = r1.f6678s
            if (r2 == 0) goto L1b3
            java.lang.Object[] r1 = r1.f6676q
            r4 = 0
            r5 = 0
        Lf3:
            if (r4 >= r2) goto L1ae
            r6 = r1[r4]
            B0.d r6 = (B0.C0035d) r6
            c0.l r6 = (c0.AbstractC0724l) r6
            c0.l r7 = r6.f10100q
            boolean r7 = r7.f10099D
            if (r7 != 0) goto L106
            java.lang.String r7 = "visitChildren called on an unattached node"
            y0.AbstractC1904a.b(r7)
        L106:
            R.e r7 = new R.e
            r8 = 16
            c0.l[] r9 = new c0.AbstractC0724l[r8]
            r7.<init>(r9)
            c0.l r6 = r6.f10100q
            c0.l r8 = r6.f10105v
            if (r8 != 0) goto L119
            B0.AbstractC0041g.b(r7, r6)
            goto L11c
        L119:
            r7.c(r8)
        L11c:
            int r6 = r7.f6678s
            if (r6 == 0) goto L1aa
            int r6 = r6 + (-1)
            java.lang.Object r6 = r7.m(r6)
            c0.l r6 = (c0.AbstractC0724l) r6
            int r8 = r6.f10103t
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L132
            B0.AbstractC0041g.b(r7, r6)
            goto L11c
        L132:
            if (r6 == 0) goto L11c
            int r8 = r6.f10102s
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L1a7
            r8 = r16
        L13c:
            if (r6 == 0) goto L11c
            boolean r9 = r6 instanceof h0.o
            if (r9 == 0) goto L15f
            h0.o r6 = (h0.o) r6
            h0.k r9 = r6.y0()
            boolean r9 = r9.f13418a
            if (r9 == 0) goto L157
            java.lang.Object r6 = r3.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L15b
        L157:
            boolean r6 = h0.AbstractC1111d.i(r6, r15, r3)
        L15b:
            if (r6 == 0) goto L1a2
            r5 = r14
            goto L1aa
        L15f:
            int r9 = r6.f10102s
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L167
            r9 = r14
            goto L168
        L167:
            r9 = 0
        L168:
            if (r9 == 0) goto L1a2
            boolean r9 = r6 instanceof B0.AbstractC0049n
            if (r9 == 0) goto L1a2
            r9 = r6
            B0.n r9 = (B0.AbstractC0049n) r9
            c0.l r9 = r9.f473F
            r10 = 0
        L174:
            if (r9 == 0) goto L19f
            int r11 = r9.f10102s
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L17e
            r11 = r14
            goto L17f
        L17e:
            r11 = 0
        L17f:
            if (r11 == 0) goto L19c
            int r10 = r10 + 1
            if (r10 != r14) goto L187
            r6 = r9
            goto L19c
        L187:
            if (r8 != 0) goto L192
            R.e r8 = new R.e
            r11 = 16
            c0.l[] r12 = new c0.AbstractC0724l[r11]
            r8.<init>(r12)
        L192:
            if (r6 == 0) goto L199
            r8.c(r6)
            r6 = r16
        L199:
            r8.c(r9)
        L19c:
            c0.l r9 = r9.f10105v
            goto L174
        L19f:
            if (r10 != r14) goto L1a2
            goto L13c
        L1a2:
            c0.l r6 = B0.AbstractC0041g.f(r8)
            goto L13c
        L1a7:
            c0.l r6 = r6.f10105v
            goto L132
        L1aa:
            int r4 = r4 + 1
            goto Lf3
        L1ae:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        L1b3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            r1.<init>(r2)
            throw r1
        L1bb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
        L1c1:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
        L1c7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "invalid FocusDirection"
            r1.<init>(r2)
            throw r1
        L1cf:
            r5 = r16
        L1d1:
            java.lang.Object r6 = r6.get()
            W0.l r6 = (W0.l) r6
            A.J r7 = new A.J
            r7.<init>(r5, r0, r3)
            if (r1 != r14) goto L1df
            goto L1e1
        L1df:
            if (r1 != r13) goto L1fb
        L1e1:
            if (r1 != r14) goto L1e8
            boolean r1 = h0.AbstractC1111d.k(r4, r7)
            goto L1ee
        L1e8:
            if (r1 != r13) goto L1f3
            boolean r1 = h0.AbstractC1111d.a(r4, r7)
        L1ee:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L1f3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 1-D focus search"
            r1.<init>(r2)
            throw r1
        L1fb:
            if (r1 != r10) goto L1fe
            goto L208
        L1fe:
            if (r1 != r9) goto L201
            goto L208
        L201:
            r3 = 5
            if (r1 != r3) goto L205
            goto L208
        L205:
            r3 = 6
            if (r1 != r3) goto L20d
        L208:
            java.lang.Boolean r1 = h0.AbstractC1111d.F(r1, r7, r4, r2)
            return r1
        L20d:
            if (r1 != r15) goto L22b
            int r1 = r6.ordinal()
            if (r1 == 0) goto L21f
            if (r1 != r14) goto L219
            r9 = r10
            goto L21f
        L219:
            C2.e r1 = new C2.e
            r1.<init>()
            throw r1
        L21f:
            h0.o r1 = h0.AbstractC1111d.g(r4)
            if (r1 == 0) goto L22a
            java.lang.Boolean r1 = h0.AbstractC1111d.F(r9, r7, r1, r2)
            return r1
        L22a:
            return r16
        L22b:
            r2 = 8
            if (r1 != r2) goto L2f0
            h0.o r1 = h0.AbstractC1111d.g(r4)
            if (r1 == 0) goto L2d4
            c0.l r2 = r1.f10100q
            boolean r2 = r2.f10099D
            if (r2 != 0) goto L240
            java.lang.String r2 = "visitAncestors called on an unattached node"
            y0.AbstractC1904a.b(r2)
        L240:
            c0.l r2 = r1.f10100q
            c0.l r2 = r2.f10104u
            B0.L r1 = B0.AbstractC0041g.u(r1)
        L248:
            if (r1 == 0) goto L2d4
            B0.g0 r3 = r1.f268U
            c0.l r3 = r3.f433e
            int r3 = r3.f10103t
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L2c0
        L254:
            if (r2 == 0) goto L2c0
            int r3 = r2.f10102s
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L2bb
            r3 = r2
            r5 = r16
        L25f:
            if (r3 == 0) goto L2bb
            boolean r6 = r3 instanceof h0.o
            if (r6 == 0) goto L276
            h0.o r3 = (h0.o) r3
            h0.k r6 = r3.y0()
            boolean r6 = r6.f13418a
            if (r6 == 0) goto L273
            r16 = r3
            goto L2d4
        L273:
            r11 = 16
            goto L2b6
        L276:
            int r6 = r3.f10102s
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L273
            boolean r6 = r3 instanceof B0.AbstractC0049n
            if (r6 == 0) goto L273
            r6 = r3
            B0.n r6 = (B0.AbstractC0049n) r6
            c0.l r6 = r6.f473F
            r8 = 0
        L286:
            if (r6 == 0) goto L2b1
            int r9 = r6.f10102s
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L293
            int r8 = r8 + 1
            if (r8 != r14) goto L296
            r3 = r6
        L293:
            r11 = 16
            goto L2ae
        L296:
            if (r5 != 0) goto L2a2
            R.e r5 = new R.e
            r11 = 16
            c0.l[] r9 = new c0.AbstractC0724l[r11]
            r5.<init>(r9)
            goto L2a4
        L2a2:
            r11 = 16
        L2a4:
            if (r3 == 0) goto L2ab
            r5.c(r3)
            r3 = r16
        L2ab:
            r5.c(r6)
        L2ae:
            c0.l r6 = r6.f10105v
            goto L286
        L2b1:
            r11 = 16
            if (r8 != r14) goto L2b6
            goto L25f
        L2b6:
            c0.l r3 = B0.AbstractC0041g.f(r5)
            goto L25f
        L2bb:
            r11 = 16
            c0.l r2 = r2.f10104u
            goto L254
        L2c0:
            r11 = 16
            B0.L r1 = r1.s()
            if (r1 == 0) goto L2d0
            B0.g0 r2 = r1.f268U
            if (r2 == 0) goto L2d0
            B0.B0 r2 = r2.f432d
            goto L248
        L2d0:
            r2 = r16
            goto L248
        L2d4:
            r1 = r16
            if (r1 == 0) goto L2ea
            boolean r2 = r1.equals(r4)
            if (r2 == 0) goto L2df
            goto L2ea
        L2df:
            java.lang.Object r1 = r7.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
            goto L2eb
        L2ea:
            r6 = 0
        L2eb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            return r1
        L2f0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Focus search invoked with invalid FocusDirection "
            r3.<init>(r4)
            java.lang.String r1 = h0.C1110c.a(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C1115h.d(int, i0.c, B5.c):java.lang.Boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(o oVar) {
        L lU;
        I0.i iVarU;
        L lU2;
        I0.i iVarU2;
        o oVar2 = this.j;
        this.j = oVar;
        C1544C c1544c = this.i;
        Object[] objArr = c1544c.f16114a;
        int i = c1544c.f16115b;
        for (int i7 = 0; i7 < i; i7++) {
            d0.b bVar = (d0.b) objArr[i7];
            bVar.getClass();
            if (oVar2 != null && (lU2 = AbstractC0041g.u(oVar2)) != null && (iVarU2 = lU2.u()) != null && iVarU2.f2257q.b(I0.h.f2239g)) {
                ((AutofillManager) bVar.f11785a.f14122r).notifyViewExited(bVar.f11787c, lU2.f280r);
            }
            if (oVar != null && (lU = AbstractC0041g.u(oVar)) != null && (iVarU = lU.u()) != null && iVarU.f2257q.b(I0.h.f2239g)) {
                int i8 = lU.f280r;
                bVar.f11788d.f2492a.s(i8, new d0.a(bVar, i8));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (r4.f16269e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (((r4.f16265a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        r33 = true;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ca, code lost:
    
        r3 = r4.f16267c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
    
        if (java.lang.Long.compare((((long) r4.f16268d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        r3 = r4.f16265a;
        r8 = r4.f16267c;
        r9 = r4.f16266b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f3, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0115, code lost:
    
        r32 = r6;
        r22 = r15;
        r5 = n5.k.O0(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0136, code lost:
    
        if (r5 == r8) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0138, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0145, code lost:
    
        if (r13 != r22) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014c, code lost:
    
        if (r13 == 254) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014f, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r13 = r13 ^ (r13 << 16);
        r14 = r13 >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016e, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0170, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | (((long) (r13 & 127)) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018e, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0191, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a2, code lost:
    
        if (((r34 >> r6) & 255) != r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a4, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | (((long) (r13 & 127)) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c8, code lost:
    
        r3[r5] = (((long) (r13 & 127)) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f1, code lost:
    
        r33 = r7;
        r4.f16269e = r.O.a(r4.f16267c) - r4.f16268d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0202, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0204, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0209, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020c, code lost:
    
        r3 = r.O.c(r4.f16267c);
        r5 = r4.f16265a;
        r6 = r4.f16266b;
        r7 = r4.f16267c;
        r4.c(r3);
        r3 = r4.f16265a;
        r8 = r4.f16266b;
        r9 = r4.f16267c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0223, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0232, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0234, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0272, code lost:
    
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0278, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0281, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0285, code lost:
    
        r32 = r3;
        r4.f16268d++;
        r3 = r4.f16269e;
        r5 = r4.f16265a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029f, code lost:
    
        if (((r7 >> r9) & 255) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02a1, code lost:
    
        r21 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a3, code lost:
    
        r4.f16269e = r3 - r21;
        r3 = r4.f16267c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x034d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x034f, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.view.KeyEvent r41) {
        /*
            r40 = this;
            r0 = r40
            int r1 = r41.getKeyCode()
            long r1 = Q2.g.d(r1)
            int r3 = E3.h.C(r41)
            r4 = 2
            r10 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            r15 = 0
            r17 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            r19 = 254(0xfe, double:1.255E-321)
            r41 = 6
            r5 = 8
            r21 = 0
            r22 = 1
            r6 = 3
            r7 = 1
            if (r3 != r4) goto L2d4
            r.z r3 = r0.f13414h
            if (r3 != 0) goto L32
            r.z r3 = new r.z
            r3.<init>(r6)
            r0.f13414h = r3
        L32:
            r4 = r3
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 * r10
            int r24 = r3 << 16
            r3 = r3 ^ r24
            r24 = r6
            int r6 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            r25 = 63
            int r8 = r4.f16267c
            r26 = r6 & r8
            r27 = r21
            r28 = 7
        L4c:
            long[] r9 = r4.f16265a
            int r29 = r26 >> 3
            r30 = r26 & 7
            r31 = r10
            int r10 = r30 << 3
            r32 = r9[r29]
            long r32 = r32 >>> r10
            int r29 = r29 + 1
            r29 = r9[r29]
            int r9 = 64 - r10
            long r29 = r29 << r9
            long r9 = (long) r10
            long r9 = -r9
            long r9 = r9 >> r25
            long r9 = r29 & r9
            long r9 = r32 | r9
            r29 = 255(0xff, double:1.26E-321)
            long r11 = (long) r3
            long r32 = r11 * r17
            r34 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r9 ^ r32
            long r32 = r13 - r17
            long r13 = ~r13
            long r13 = r32 & r13
            long r13 = r13 & r34
        L7d:
            int r32 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r32 == 0) goto L9f
            int r32 = java.lang.Long.numberOfTrailingZeros(r13)
            int r32 = r32 >> 3
            int r32 = r26 + r32
            r32 = r32 & r8
            r36 = r15
            long[] r15 = r4.f16266b
            r38 = r15[r32]
            int r15 = (r38 > r1 ? 1 : (r38 == r1 ? 0 : -1))
            if (r15 != 0) goto L99
            r33 = r7
            goto L2bc
        L99:
            long r15 = r13 - r22
            long r13 = r13 & r15
            r15 = r36
            goto L7d
        L9f:
            r36 = r15
            long r13 = ~r9
            long r13 = r13 << r41
            long r9 = r9 & r13
            long r9 = r9 & r34
            int r9 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r9 == 0) goto L2c1
            int r3 = r4.b(r6)
            int r8 = r4.f16269e
            if (r8 != 0) goto Lc4
            long[] r8 = r4.f16265a
            int r13 = r3 >> 3
            r13 = r8[r13]
            r8 = r3 & 7
            int r8 = r8 << 3
            long r13 = r13 >> r8
            long r13 = r13 & r29
            int r8 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r8 != 0) goto Lca
        Lc4:
            r33 = r7
            r22 = 128(0x80, double:6.32E-322)
            goto L285
        Lca:
            int r3 = r4.f16267c
            if (r3 <= r5) goto L209
            int r8 = r4.f16268d
            long r13 = (long) r8
            r15 = 32
            long r13 = r13 * r15
            r15 = 128(0x80, double:6.32E-322)
            long r9 = (long) r3
            r17 = 25
            long r9 = r9 * r17
            r17 = -9223372036854775808
            long r13 = r13 ^ r17
            long r8 = r9 ^ r17
            int r3 = java.lang.Long.compare(r13, r8)
            if (r3 > 0) goto L202
            long[] r3 = r4.f16265a
            int r8 = r4.f16267c
            long[] r9 = r4.f16266b
            int r10 = r8 + 7
            int r10 = r10 >> 3
            r13 = r21
        Lf3:
            if (r13 >= r10) goto L115
            r22 = r3[r13]
            r14 = r5
            r32 = r6
            long r5 = r22 & r34
            r22 = r15
            r16 = r14
            long r14 = ~r5
            long r5 = r5 >>> r28
            long r14 = r14 + r5
            r5 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r5 = r5 & r14
            r3[r13] = r5
            int r13 = r13 + 1
            r5 = r16
            r15 = r22
            r6 = r32
            goto Lf3
        L115:
            r32 = r6
            r22 = r15
            r16 = r5
            int r5 = n5.k.O0(r3)
            int r6 = r5 + (-1)
            r13 = r3[r6]
            r25 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r13 = r13 & r25
            r33 = -72057594037927936(0xff00000000000000, double:-5.4861240687936887E303)
            long r13 = r13 | r33
            r3[r6] = r13
            r13 = r3[r21]
            r3[r5] = r13
            r5 = r21
        L136:
            if (r5 == r8) goto L1f1
            int r6 = r5 >> 3
            r13 = r3[r6]
            r10 = r5 & 7
            int r10 = r10 << 3
            long r13 = r13 >> r10
            long r13 = r13 & r29
            int r15 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r15 != 0) goto L14a
        L147:
            int r5 = r5 + 1
            goto L136
        L14a:
            int r13 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r13 == 0) goto L14f
            goto L147
        L14f:
            r13 = r9[r5]
            int r13 = java.lang.Long.hashCode(r13)
            int r13 = r13 * r31
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r15 = r4.b(r14)
            r14 = r14 & r8
            int r27 = r15 - r14
            r27 = r27 & r8
            r33 = r7
            int r7 = r27 / 8
            int r14 = r5 - r14
            r14 = r14 & r8
            int r14 = r14 / 8
            if (r7 != r14) goto L191
            r7 = r13 & 127(0x7f, float:1.78E-43)
            long r13 = (long) r7
            r34 = r3[r6]
            r7 = r5
            r41 = r6
            long r5 = r29 << r10
            long r5 = ~r5
            long r5 = r34 & r5
            long r13 = r13 << r10
            long r5 = r5 | r13
            r3[r41] = r5
            int r5 = r3.length
            int r5 = r5 + (-1)
            r13 = r3[r21]
            long r13 = r13 & r25
            long r13 = r13 | r17
            r3[r5] = r13
            int r5 = r7 + 1
        L18e:
            r7 = r33
            goto L136
        L191:
            r7 = r5
            r41 = r6
            int r5 = r15 >> 3
            r34 = r3[r5]
            r6 = r15 & 7
            int r6 = r6 << 3
            long r38 = r34 >> r6
            long r38 = r38 & r29
            int r14 = (r38 > r22 ? 1 : (r38 == r22 ? 0 : -1))
            if (r14 != 0) goto L1c8
            r13 = r13 & 127(0x7f, float:1.78E-43)
            long r13 = (long) r13
            r27 = r5
            r38 = r6
            long r5 = r29 << r38
            long r5 = ~r5
            long r5 = r34 & r5
            long r13 = r13 << r38
            long r5 = r5 | r13
            r3[r27] = r5
            r5 = r3[r41]
            long r13 = r29 << r10
            long r13 = ~r13
            long r5 = r5 & r13
            long r13 = r22 << r10
            long r5 = r5 | r13
            r3[r41] = r5
            r5 = r9[r7]
            r9[r15] = r5
            r9[r7] = r36
            r5 = r7
            goto L1e3
        L1c8:
            r27 = r5
            r38 = r6
            r5 = r13 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            long r13 = r29 << r38
            long r13 = ~r13
            long r13 = r34 & r13
            long r5 = r5 << r38
            long r5 = r5 | r13
            r3[r27] = r5
            r5 = r9[r15]
            r13 = r9[r7]
            r9[r15] = r13
            r9[r7] = r5
            int r5 = r7 + (-1)
        L1e3:
            int r6 = r3.length
            int r6 = r6 + (-1)
            r13 = r3[r21]
            long r13 = r13 & r25
            long r13 = r13 | r17
            r3[r6] = r13
            int r5 = r5 + 1
            goto L18e
        L1f1:
            r33 = r7
            int r3 = r4.f16267c
            int r3 = r.O.a(r3)
            int r5 = r4.f16268d
            int r3 = r3 - r5
            r4.f16269e = r3
        L1fe:
            r5 = r32
            goto L281
        L202:
            r22 = r15
        L204:
            r32 = r6
            r33 = r7
            goto L20c
        L209:
            r22 = 128(0x80, double:6.32E-322)
            goto L204
        L20c:
            int r3 = r4.f16267c
            int r3 = r.O.c(r3)
            long[] r5 = r4.f16265a
            long[] r6 = r4.f16266b
            int r7 = r4.f16267c
            r4.c(r3)
            long[] r3 = r4.f16265a
            long[] r8 = r4.f16266b
            int r9 = r4.f16267c
            r10 = r21
        L223:
            if (r10 >= r7) goto L1fe
            int r13 = r10 >> 3
            r13 = r5[r13]
            r15 = r10 & 7
            int r15 = r15 << 3
            long r13 = r13 >> r15
            long r13 = r13 & r29
            int r13 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r13 >= 0) goto L272
            r13 = r6[r10]
            int r15 = java.lang.Long.hashCode(r13)
            int r15 = r15 * r31
            int r16 = r15 << 16
            r15 = r15 ^ r16
            r16 = r3
            int r3 = r15 >>> 7
            int r3 = r4.b(r3)
            r15 = r15 & 127(0x7f, float:1.78E-43)
            r17 = r5
            r18 = r6
            long r5 = (long) r15
            int r15 = r3 >> 3
            r19 = r3 & 7
            int r19 = r19 << 3
            r25 = r16[r15]
            r34 = r5
            long r5 = r29 << r19
            long r5 = ~r5
            long r5 = r25 & r5
            long r19 = r34 << r19
            long r5 = r5 | r19
            r16[r15] = r5
            int r15 = r3 + (-7)
            r15 = r15 & r9
            r19 = r9 & 7
            int r15 = r15 + r19
            int r15 = r15 >> 3
            r16[r15] = r5
            r8[r3] = r13
            goto L278
        L272:
            r16 = r3
            r17 = r5
            r18 = r6
        L278:
            int r10 = r10 + 1
            r3 = r16
            r5 = r17
            r6 = r18
            goto L223
        L281:
            int r3 = r4.b(r5)
        L285:
            r32 = r3
            int r3 = r4.f16268d
            int r3 = r3 + 1
            r4.f16268d = r3
            int r3 = r4.f16269e
            long[] r5 = r4.f16265a
            int r6 = r32 >> 3
            r7 = r5[r6]
            r9 = r32 & 7
            int r9 = r9 << 3
            long r13 = r7 >> r9
            long r13 = r13 & r29
            int r10 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r10 != 0) goto L2a3
            r21 = r33
        L2a3:
            int r3 = r3 - r21
            r4.f16269e = r3
            int r3 = r4.f16267c
            long r13 = r29 << r9
            long r13 = ~r13
            long r7 = r7 & r13
            long r9 = r11 << r9
            long r7 = r7 | r9
            r5[r6] = r7
            int r6 = r32 + (-7)
            r6 = r6 & r3
            r3 = r3 & 7
            int r6 = r6 + r3
            int r3 = r6 >> 3
            r5[r3] = r7
        L2bc:
            long[] r3 = r4.f16266b
            r3[r32] = r1
            return r33
        L2c1:
            r16 = r5
            r5 = r6
            r33 = r7
            int r27 = r27 + 8
            int r26 = r26 + r27
            r26 = r26 & r8
            r5 = r16
            r10 = r31
            r15 = r36
            goto L4c
        L2d4:
            r24 = r6
            r31 = r10
            r36 = r15
            r25 = 63
            r28 = 7
            r29 = 255(0xff, double:1.26E-321)
            r34 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r16 = r5
            if (r3 != r7) goto L38a
            r.z r3 = r0.f13414h
            if (r3 == 0) goto L389
            boolean r3 = r3.a(r1)
            if (r3 != r7) goto L389
            r.z r3 = r0.f13414h
            if (r3 == 0) goto L37e
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 * r31
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r3.f16267c
            int r4 = r4 >>> 7
        L306:
            r4 = r4 & r6
            long[] r7 = r3.f16265a
            int r8 = r4 >> 3
            r9 = r4 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r33 = 1
            int r8 = r8 + 1
            r12 = r7[r8]
            int r7 = 64 - r9
            long r7 = r12 << r7
            long r12 = (long) r9
            long r12 = -r12
            long r12 = r12 >> r25
            long r7 = r7 & r12
            long r7 = r7 | r10
            long r9 = (long) r5
            long r9 = r9 * r17
            long r9 = r9 ^ r7
            long r11 = r9 - r17
            long r9 = ~r9
            long r9 = r9 & r11
            long r9 = r9 & r34
        L32c:
            int r11 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r11 == 0) goto L345
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r4
            r11 = r11 & r6
            long[] r12 = r3.f16266b
            r13 = r12[r11]
            int r12 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r12 != 0) goto L341
            goto L350
        L341:
            long r11 = r9 - r22
            long r9 = r9 & r11
            goto L32c
        L345:
            long r9 = ~r7
            long r9 = r9 << r41
            long r7 = r7 & r9
            long r7 = r7 & r34
            int r7 = (r7 > r36 ? 1 : (r7 == r36 ? 0 : -1))
            if (r7 == 0) goto L381
            r11 = -1
        L350:
            if (r11 < 0) goto L37e
            int r1 = r3.f16268d
            r33 = 1
            int r1 = r1 + (-1)
            r3.f16268d = r1
            long[] r1 = r3.f16265a
            int r2 = r3.f16267c
            int r3 = r11 >> 3
            r4 = r11 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            long r7 = r29 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            long r7 = r19 << r4
            long r4 = r5 | r7
            r1[r3] = r4
            int r11 = r11 + (-7)
            r3 = r11 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r4
            r33 = 1
            return r33
        L37e:
            r33 = 1
            goto L38c
        L381:
            r33 = 1
            int r21 = r21 + 8
            int r4 = r4 + r21
            goto L306
        L389:
            return r21
        L38a:
            r33 = r7
        L38c:
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C1115h.f(android.view.KeyEvent):boolean");
    }
}
