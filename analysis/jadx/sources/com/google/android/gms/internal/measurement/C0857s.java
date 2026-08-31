package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0857s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11028a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11029b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0857s(int i) {
        this.f11029b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0828m c(E.c0 c0Var, List list) {
        EnumC0877w enumC0877w = EnumC0877w.ADD;
        I1.J0(2, "FN", list);
        InterfaceC0833n interfaceC0833nC = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) list.get(0));
        InterfaceC0833n interfaceC0833nC2 = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) list.get(1));
        if (!(interfaceC0833nC2 instanceof C0783d)) {
            throw new IllegalArgumentException(C0.S.w("FN requires an ArrayValue of parameter names found ", interfaceC0833nC2.getClass().getCanonicalName()));
        }
        List listM = ((C0783d) interfaceC0833nC2).m();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C0828m(interfaceC0833nC.zzc(), (ArrayList) listM, arrayList, c0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean d(InterfaceC0833n interfaceC0833n, InterfaceC0833n interfaceC0833n2) {
        if (interfaceC0833n instanceof InterfaceC0813j) {
            interfaceC0833n = new C0848q(interfaceC0833n.zzc());
        }
        if (interfaceC0833n2 instanceof InterfaceC0813j) {
            interfaceC0833n2 = new C0848q(interfaceC0833n2.zzc());
        }
        if ((interfaceC0833n instanceof C0848q) && (interfaceC0833n2 instanceof C0848q)) {
            return ((C0848q) interfaceC0833n).f11014q.compareTo(((C0848q) interfaceC0833n2).f11014q) < 0;
        }
        double dDoubleValue = interfaceC0833n.b().doubleValue();
        double dDoubleValue2 = interfaceC0833n2.b().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0833n e(C0872v c0872v, InterfaceC0833n interfaceC0833n, InterfaceC0833n interfaceC0833n2) {
        if (interfaceC0833n instanceof Iterable) {
            return g(c0872v, ((Iterable) interfaceC0833n).iterator(), interfaceC0833n2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean f(InterfaceC0833n interfaceC0833n, InterfaceC0833n interfaceC0833n2) {
        if (interfaceC0833n.getClass().equals(interfaceC0833n2.getClass())) {
            if ((interfaceC0833n instanceof r) || (interfaceC0833n instanceof C0823l)) {
                return true;
            }
            return interfaceC0833n instanceof C0798g ? (Double.isNaN(interfaceC0833n.b().doubleValue()) || Double.isNaN(interfaceC0833n2.b().doubleValue()) || interfaceC0833n.b().doubleValue() != interfaceC0833n2.b().doubleValue()) ? false : true : interfaceC0833n instanceof C0848q ? interfaceC0833n.zzc().equals(interfaceC0833n2.zzc()) : interfaceC0833n instanceof C0788e ? interfaceC0833n.c().equals(interfaceC0833n2.c()) : interfaceC0833n == interfaceC0833n2;
        }
        if (((interfaceC0833n instanceof r) || (interfaceC0833n instanceof C0823l)) && ((interfaceC0833n2 instanceof r) || (interfaceC0833n2 instanceof C0823l))) {
            return true;
        }
        boolean z5 = interfaceC0833n instanceof C0798g;
        if (z5 && (interfaceC0833n2 instanceof C0848q)) {
            return f(interfaceC0833n, new C0798g(interfaceC0833n2.b()));
        }
        boolean z6 = interfaceC0833n instanceof C0848q;
        if (z6 && (interfaceC0833n2 instanceof C0798g)) {
            return f(new C0798g(interfaceC0833n.b()), interfaceC0833n2);
        }
        if (interfaceC0833n instanceof C0788e) {
            return f(new C0798g(interfaceC0833n.b()), interfaceC0833n2);
        }
        if (interfaceC0833n2 instanceof C0788e) {
            return f(interfaceC0833n, new C0798g(interfaceC0833n2.b()));
        }
        if ((z6 || z5) && (interfaceC0833n2 instanceof InterfaceC0813j)) {
            return f(interfaceC0833n, new C0848q(interfaceC0833n2.zzc()));
        }
        if ((interfaceC0833n instanceof InterfaceC0813j) && ((interfaceC0833n2 instanceof C0848q) || (interfaceC0833n2 instanceof C0798g))) {
            return f(new C0848q(interfaceC0833n.zzc()), interfaceC0833n2);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0833n g(C0872v c0872v, Iterator it, InterfaceC0833n interfaceC0833n) {
        E.c0 c0VarG;
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC0833n interfaceC0833n2 = (InterfaceC0833n) it.next();
                switch (c0872v.f11049a) {
                    case 0:
                        c0VarG = c0872v.f11050b.G();
                        String str = c0872v.f11051c;
                        c0VarG.J(str, interfaceC0833n2);
                        ((HashMap) c0VarG.f1555t).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        c0VarG = c0872v.f11050b.G();
                        c0VarG.J(c0872v.f11051c, interfaceC0833n2);
                        break;
                    default:
                        c0VarG = c0872v.f11050b;
                        c0VarG.J(c0872v.f11051c, interfaceC0833n2);
                        break;
                }
                InterfaceC0833n interfaceC0833nE = c0VarG.E((C0783d) interfaceC0833n);
                if (interfaceC0833nE instanceof C0793f) {
                    C0793f c0793f = (C0793f) interfaceC0833nE;
                    if ("break".equals(c0793f.f10835r)) {
                        return InterfaceC0833n.f10907d;
                    }
                    if ("return".equals(c0793f.f10835r)) {
                        return c0793f;
                    }
                }
            }
        }
        return InterfaceC0833n.f10907d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean h(InterfaceC0833n interfaceC0833n, InterfaceC0833n interfaceC0833n2) {
        if (interfaceC0833n instanceof InterfaceC0813j) {
            interfaceC0833n = new C0848q(interfaceC0833n.zzc());
        }
        if (interfaceC0833n2 instanceof InterfaceC0813j) {
            interfaceC0833n2 = new C0848q(interfaceC0833n2.zzc());
        }
        return (((interfaceC0833n instanceof C0848q) && (interfaceC0833n2 instanceof C0848q)) || !(Double.isNaN(interfaceC0833n.b().doubleValue()) || Double.isNaN(interfaceC0833n2.b().doubleValue()))) && !d(interfaceC0833n2, interfaceC0833n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:504:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0833n a(java.lang.String r12, E.c0 r13, java.util.ArrayList r14) {
        /*
            r11 = this;
            int r0 = r11.f11029b
            java.lang.String r1 = "break"
            java.lang.String r2 = "return"
            r3 = 3
            r4 = 0
            r5 = 1
            r6 = 2
            r7 = 0
            switch(r0) {
                case 0: goto Lcd7;
                case 1: goto Lc61;
                case 2: goto L9f5;
                case 3: goto L95e;
                case 4: goto L5fb;
                case 5: goto L419;
                case 6: goto L3e2;
                default: goto Le;
            }
        Le:
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.EnumC0877w.ADD
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.I1.M0(r12)
            int r0 = r0.ordinal()
            if (r0 == r3) goto L38b
            r1 = 14
            if (r0 == r1) goto L31b
            r1 = 24
            if (r0 == r1) goto L2f1
            r1 = 33
            if (r0 == r1) goto L2bc
            r1 = 49
            if (r0 == r1) goto L2b3
            r1 = 58
            if (r0 == r1) goto L234
            r1 = 17
            if (r0 == r1) goto L1f8
            r1 = 18
            if (r0 == r1) goto L18f
            r1 = 35
            if (r0 == r1) goto Le7
            r1 = 36
            if (r0 == r1) goto Le7
            switch(r0) {
                case 62: goto L8f;
                case 63: goto L86;
                case 64: goto L45;
                default: goto L41;
            }
        L41:
            r11.b(r12)
            throw r4
        L45:
            java.lang.String r12 = "VAR"
            com.google.android.gms.internal.measurement.I1.J0(r5, r12, r14)
            int r12 = r14.size()
        L4e:
            if (r7 >= r12) goto L82
            java.lang.Object r0 = r14.get(r7)
            int r7 = r7 + 1
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r1 == 0) goto L6e
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C0848q) r0
            java.lang.String r0 = r0.f11014q
            com.google.android.gms.internal.measurement.r r1 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            r13.J(r0, r1)
            goto L4e
        L6e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Class r13 = r0.getClass()
            java.lang.String r13 = r13.getCanonicalName()
            java.lang.String r14 = "Expected string for var name. got "
            java.lang.String r13 = C0.S.w(r14, r13)
            r12.<init>(r13)
            throw r12
        L82:
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L3c1
        L86:
            java.lang.String r12 = "UNDEFINED"
            com.google.android.gms.internal.measurement.I1.I0(r7, r12, r14)
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L3c1
        L8f:
            java.lang.String r12 = "TYPEOF"
            com.google.android.gms.internal.measurement.I1.I0(r5, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            boolean r13 = r12 instanceof com.google.android.gms.internal.measurement.r
            if (r13 == 0) goto La9
            java.lang.String r12 = "undefined"
            goto Lcf
        La9:
            boolean r13 = r12 instanceof com.google.android.gms.internal.measurement.C0788e
            if (r13 == 0) goto Lb0
            java.lang.String r12 = "boolean"
            goto Lcf
        Lb0:
            boolean r13 = r12 instanceof com.google.android.gms.internal.measurement.C0798g
            if (r13 == 0) goto Lb7
            java.lang.String r12 = "number"
            goto Lcf
        Lb7:
            boolean r13 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r13 == 0) goto Lbe
            java.lang.String r12 = "string"
            goto Lcf
        Lbe:
            boolean r13 = r12 instanceof com.google.android.gms.internal.measurement.C0828m
            if (r13 == 0) goto Lc5
            java.lang.String r12 = "function"
            goto Lcf
        Lc5:
            boolean r13 = r12 instanceof com.google.android.gms.internal.measurement.C0838o
            if (r13 != 0) goto Ld7
            boolean r13 = r12 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r13 != 0) goto Ld7
            java.lang.String r12 = "object"
        Lcf:
            com.google.android.gms.internal.measurement.q r13 = new com.google.android.gms.internal.measurement.q
            r13.<init>(r12)
        Ld4:
            r12 = r13
            goto L3c1
        Ld7:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r14 = "Unsupported value type %s in typeof"
            java.lang.String r12 = java.lang.String.format(r14, r12)
            r13.<init>(r12)
            throw r13
        Le7:
            java.lang.String r12 = "GET_PROPERTY"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r13 = r0.c(r13, r14)
            boolean r14 = r12 instanceof com.google.android.gms.internal.measurement.C0783d
            if (r14 == 0) goto L122
            boolean r14 = com.google.android.gms.internal.measurement.I1.L0(r13)
            if (r14 == 0) goto L122
            com.google.android.gms.internal.measurement.d r12 = (com.google.android.gms.internal.measurement.C0783d) r12
            java.lang.Double r13 = r13.b()
            int r13 = r13.intValue()
            com.google.android.gms.internal.measurement.n r12 = r12.q(r13)
            goto L3c1
        L122:
            boolean r14 = r12 instanceof com.google.android.gms.internal.measurement.InterfaceC0813j
            if (r14 == 0) goto L132
            com.google.android.gms.internal.measurement.j r12 = (com.google.android.gms.internal.measurement.InterfaceC0813j) r12
            java.lang.String r13 = r13.zzc()
            com.google.android.gms.internal.measurement.n r12 = r12.h(r13)
            goto L3c1
        L132:
            boolean r14 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r14 == 0) goto L18b
            java.lang.String r14 = r13.zzc()
            java.lang.String r0 = "length"
            boolean r14 = r0.equals(r14)
            if (r14 == 0) goto L156
            com.google.android.gms.internal.measurement.g r13 = new com.google.android.gms.internal.measurement.g
            com.google.android.gms.internal.measurement.q r12 = (com.google.android.gms.internal.measurement.C0848q) r12
            java.lang.String r12 = r12.f11014q
            int r12 = r12.length()
            double r0 = (double) r12
            java.lang.Double r12 = java.lang.Double.valueOf(r0)
            r13.<init>(r12)
            goto Ld4
        L156:
            boolean r14 = com.google.android.gms.internal.measurement.I1.L0(r13)
            if (r14 == 0) goto L18b
            java.lang.Double r14 = r13.b()
            double r0 = r14.doubleValue()
            com.google.android.gms.internal.measurement.q r12 = (com.google.android.gms.internal.measurement.C0848q) r12
            java.lang.String r14 = r12.f11014q
            int r14 = r14.length()
            double r2 = (double) r14
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 >= 0) goto L18b
            com.google.android.gms.internal.measurement.q r14 = new com.google.android.gms.internal.measurement.q
            java.lang.String r12 = r12.f11014q
            java.lang.Double r13 = r13.b()
            int r13 = r13.intValue()
            char r12 = r12.charAt(r13)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r14.<init>(r12)
        L188:
            r12 = r14
            goto L3c1
        L18b:
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L3c1
        L18f:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto L19c
            com.google.android.gms.internal.measurement.k r12 = new com.google.android.gms.internal.measurement.k
            r12.<init>()
            goto L3c1
        L19c:
            int r12 = r14.size()
            int r12 = r12 % r6
            if (r12 != 0) goto L1e8
            com.google.android.gms.internal.measurement.k r12 = new com.google.android.gms.internal.measurement.k
            r12.<init>()
        L1a8:
            int r0 = r14.size()
            int r0 = r0 + (-1)
            if (r7 >= r0) goto L3c1
            java.lang.Object r0 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            int r1 = r7 + 1
            java.lang.Object r1 = r14.get(r1)
            com.google.android.gms.internal.measurement.n r1 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r1
            java.lang.Object r2 = r13.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r1 = r2.c(r13, r1)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r2 != 0) goto L1e0
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r2 != 0) goto L1e0
            java.lang.String r0 = r0.zzc()
            r12.k(r0, r1)
            int r7 = r7 + 2
            goto L1a8
        L1e0:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Failed to evaluate map entry"
            r12.<init>(r13)
            throw r12
        L1e8:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            int r13 = r14.size()
            java.lang.String r14 = "CREATE_OBJECT requires an even number of arguments, found "
            java.lang.String r13 = k1.i.i(r13, r14)
            r12.<init>(r13)
            throw r12
        L1f8:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto L205
            com.google.android.gms.internal.measurement.d r12 = new com.google.android.gms.internal.measurement.d
            r12.<init>()
            goto L3c1
        L205:
            com.google.android.gms.internal.measurement.d r12 = new com.google.android.gms.internal.measurement.d
            r12.<init>()
            int r0 = r14.size()
            r1 = r7
        L20f:
            if (r1 >= r0) goto L3c1
            java.lang.Object r2 = r14.get(r1)
            int r1 = r1 + 1
            com.google.android.gms.internal.measurement.n r2 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r2
            java.lang.Object r3 = r13.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r2 = r3.c(r13, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r3 != 0) goto L22c
            int r3 = r7 + 1
            r12.r(r7, r2)
            r7 = r3
            goto L20f
        L22c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Failed to evaluate array element"
            r12.<init>(r13)
            throw r12
        L234:
            java.lang.String r12 = "SET_PROPERTY"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            com.google.android.gms.internal.measurement.n r13 = r1.c(r13, r14)
            com.google.android.gms.internal.measurement.r r14 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            if (r12 == r14) goto L28f
            com.google.android.gms.internal.measurement.l r14 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10908e
            if (r12 == r14) goto L28f
            boolean r14 = r12 instanceof com.google.android.gms.internal.measurement.C0783d
            if (r14 == 0) goto L27e
            boolean r14 = r0 instanceof com.google.android.gms.internal.measurement.C0798g
            if (r14 == 0) goto L27e
            com.google.android.gms.internal.measurement.d r12 = (com.google.android.gms.internal.measurement.C0783d) r12
            com.google.android.gms.internal.measurement.g r0 = (com.google.android.gms.internal.measurement.C0798g) r0
            java.lang.Double r14 = r0.f10844q
            int r14 = r14.intValue()
            r12.r(r14, r13)
            goto Ld4
        L27e:
            boolean r14 = r12 instanceof com.google.android.gms.internal.measurement.InterfaceC0813j
            if (r14 != 0) goto L284
            goto Ld4
        L284:
            com.google.android.gms.internal.measurement.j r12 = (com.google.android.gms.internal.measurement.InterfaceC0813j) r12
            java.lang.String r14 = r0.zzc()
            r12.k(r14, r13)
            goto Ld4
        L28f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = r0.zzc()
            java.lang.String r12 = r12.zzc()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't set property "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = " of "
            r0.append(r14)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L2b3:
            java.lang.String r12 = "NULL"
            com.google.android.gms.internal.measurement.I1.I0(r7, r12, r14)
            com.google.android.gms.internal.measurement.l r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10908e
            goto L3c1
        L2bc:
            java.lang.String r12 = "GET"
            com.google.android.gms.internal.measurement.I1.I0(r5, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            boolean r14 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r14 == 0) goto L2dd
            com.google.android.gms.internal.measurement.q r12 = (com.google.android.gms.internal.measurement.C0848q) r12
            java.lang.String r12 = r12.f11014q
            com.google.android.gms.internal.measurement.n r12 = r13.K(r12)
            goto L3c1
        L2dd:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getCanonicalName()
            java.lang.String r14 = "Expected string for get var. got "
            java.lang.String r12 = C0.S.w(r14, r12)
            r13.<init>(r12)
            throw r13
        L2f1:
            java.lang.String r12 = "EXPRESSION_LIST"
            com.google.android.gms.internal.measurement.I1.J0(r5, r12, r14)
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
        L2f8:
            int r0 = r14.size()
            if (r7 >= r0) goto L3c1
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            boolean r0 = r12 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r0 != 0) goto L313
            int r7 = r7 + 1
            goto L2f8
        L313:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "ControlValue cannot be in an expression list"
            r12.<init>(r13)
            throw r12
        L31b:
            java.lang.String r12 = "CONST"
            com.google.android.gms.internal.measurement.I1.J0(r6, r12, r14)
            int r12 = r14.size()
            int r12 = r12 % r6
            if (r12 != 0) goto L37b
        L327:
            int r12 = r14.size()
            int r12 = r12 + (-1)
            if (r7 >= r12) goto L378
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            boolean r0 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r0 == 0) goto L364
            com.google.android.gms.internal.measurement.q r12 = (com.google.android.gms.internal.measurement.C0848q) r12
            java.lang.String r12 = r12.f11014q
            int r0 = r7 + 1
            java.lang.Object r0 = r14.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            r13.J(r12, r0)
            java.lang.Object r0 = r13.f1555t
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r12, r1)
            int r7 = r7 + 2
            goto L327
        L364:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getCanonicalName()
            java.lang.String r14 = "Expected string for const name. got "
            java.lang.String r12 = C0.S.w(r14, r12)
            r13.<init>(r12)
            throw r13
        L378:
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L3c1
        L37b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            int r13 = r14.size()
            java.lang.String r14 = "CONST requires an even number of arguments, found "
            java.lang.String r13 = k1.i.i(r13, r14)
            r12.<init>(r13)
            throw r12
        L38b:
            java.lang.String r12 = "ASSIGN"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            boolean r0 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r0 == 0) goto L3ce
            com.google.android.gms.internal.measurement.q r12 = (com.google.android.gms.internal.measurement.C0848q) r12
            java.lang.String r0 = r12.f11014q
            java.lang.String r12 = r12.f11014q
            boolean r0 = r13.H(r0)
            if (r0 == 0) goto L3c2
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r14 = r0.c(r13, r14)
            r13.I(r12, r14)
            goto L188
        L3c1:
            return r12
        L3c2:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Attempting to assign undefined value "
            java.lang.String r12 = C0.S.w(r14, r12)
            r13.<init>(r12)
            throw r13
        L3ce:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getCanonicalName()
            java.lang.String r14 = "Expected string for assign var. got "
            java.lang.String r12 = C0.S.w(r14, r12)
            r13.<init>(r12)
            throw r13
        L3e2:
            if (r12 == 0) goto L40d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L40d
            boolean r0 = r13.H(r12)
            if (r0 == 0) goto L40d
            com.google.android.gms.internal.measurement.n r0 = r13.K(r12)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.AbstractC0803h
            if (r1 == 0) goto L3ff
            com.google.android.gms.internal.measurement.h r0 = (com.google.android.gms.internal.measurement.AbstractC0803h) r0
            com.google.android.gms.internal.measurement.n r12 = r0.a(r13, r14)
            return r12
        L3ff:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Function "
            java.lang.String r0 = " is not defined"
            java.lang.String r12 = C0.S.n(r14, r12, r0)
            r13.<init>(r12)
            throw r13
        L40d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Command not found: "
            java.lang.String r12 = C0.S.w(r14, r12)
            r13.<init>(r12)
            throw r13
        L419:
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.EnumC0877w.ADD
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.I1.M0(r12)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L591
            r1 = 21
            if (r0 == r1) goto L555
            r1 = 59
            if (r0 == r1) goto L516
            r1 = 52
            if (r0 == r1) goto L4f9
            r1 = 53
            if (r0 == r1) goto L4f9
            r1 = 55
            if (r0 == r1) goto L4e6
            r1 = 56
            if (r0 == r1) goto L4e6
            switch(r0) {
                case 44: goto L4a9;
                case 45: goto L46b;
                case 46: goto L444;
                default: goto L440;
            }
        L440:
            r11.b(r12)
            throw r4
        L444:
            java.lang.String r12 = "NEGATE"
            com.google.android.gms.internal.measurement.I1.I0(r5, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            com.google.android.gms.internal.measurement.g r13 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = r12.b()
            double r0 = r12.doubleValue()
            double r0 = -r0
            java.lang.Double r12 = java.lang.Double.valueOf(r0)
            r13.<init>(r12)
            goto L5fa
        L46b:
            java.lang.String r12 = "MULTIPLY"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r0 = r12.doubleValue()
            java.lang.Object r12 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r12 = r12.doubleValue()
            double r12 = r12 * r0
            com.google.android.gms.internal.measurement.g r14 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r14.<init>(r12)
        L4a6:
            r13 = r14
            goto L5fa
        L4a9:
            java.lang.String r12 = "MODULUS"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r0 = r12.doubleValue()
            java.lang.Object r12 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r12 = r12.doubleValue()
            double r0 = r0 % r12
            com.google.android.gms.internal.measurement.g r13 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r0)
            r13.<init>(r12)
            goto L5fa
        L4e6:
            com.google.android.gms.internal.measurement.I1.I0(r5, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r13 = r14.c(r13, r12)
            goto L5fa
        L4f9:
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            r13.D(r14)
            r13 = r12
            goto L5fa
        L516:
            java.lang.String r12 = "SUBTRACT"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r13 = r0.c(r13, r14)
            java.lang.Double r13 = r13.b()
            double r13 = r13.doubleValue()
            double r13 = -r13
            com.google.android.gms.internal.measurement.g r0 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = r12.b()
            double r1 = r12.doubleValue()
            double r1 = r1 + r13
            java.lang.Double r12 = java.lang.Double.valueOf(r1)
            r0.<init>(r12)
            r13 = r0
            goto L5fa
        L555:
            java.lang.String r12 = "DIVIDE"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r0 = r12.doubleValue()
            java.lang.Object r12 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r12 = r12.doubleValue()
            double r0 = r0 / r12
            com.google.android.gms.internal.measurement.g r13 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r0)
            r13.<init>(r12)
            goto L5fa
        L591:
            java.lang.String r12 = "ADD"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r13 = r0.c(r13, r14)
            boolean r14 = r12 instanceof com.google.android.gms.internal.measurement.InterfaceC0813j
            if (r14 != 0) goto L5df
            boolean r14 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r14 != 0) goto L5df
            boolean r14 = r13 instanceof com.google.android.gms.internal.measurement.InterfaceC0813j
            if (r14 != 0) goto L5df
            boolean r14 = r13 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r14 == 0) goto L5c3
            goto L5df
        L5c3:
            com.google.android.gms.internal.measurement.g r14 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = r12.b()
            double r0 = r12.doubleValue()
            java.lang.Double r12 = r13.b()
            double r12 = r12.doubleValue()
            double r12 = r12 + r0
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r14.<init>(r12)
            goto L4a6
        L5df:
            com.google.android.gms.internal.measurement.q r14 = new com.google.android.gms.internal.measurement.q
            java.lang.String r12 = r12.zzc()
            java.lang.String r13 = r13.zzc()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r14.<init>(r12)
            goto L4a6
        L5fa:
            return r13
        L5fb:
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.EnumC0877w.ADD
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.I1.M0(r12)
            int r0 = r0.ordinal()
            r8 = 65
            r9 = 4
            if (r0 == r8) goto L8ce
            switch(r0) {
                case 26: goto L858;
                case 27: goto L80e;
                case 28: goto L793;
                case 29: goto L6e3;
                case 30: goto L69d;
                case 31: goto L657;
                case 32: goto L611;
                default: goto L60d;
            }
        L60d:
            r11.b(r12)
            throw r4
        L611:
            java.lang.String r12 = "FOR_OF_LET"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            boolean r12 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r12 == 0) goto L64f
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.String r12 = r12.zzc()
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r14 = r1.c(r13, r14)
            com.google.android.gms.internal.measurement.v r1 = new com.google.android.gms.internal.measurement.v
            r1.<init>(r13, r12, r5)
            com.google.android.gms.internal.measurement.n r12 = e(r1, r0, r14)
            goto L95d
        L64f:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Variable name in FOR_OF_LET must be a string"
            r12.<init>(r13)
            throw r12
        L657:
            java.lang.String r12 = "FOR_OF_CONST"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            boolean r12 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r12 == 0) goto L695
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.String r12 = r12.zzc()
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r14 = r1.c(r13, r14)
            com.google.android.gms.internal.measurement.v r1 = new com.google.android.gms.internal.measurement.v
            r1.<init>(r13, r12, r7)
            com.google.android.gms.internal.measurement.n r12 = e(r1, r0, r14)
            goto L95d
        L695:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Variable name in FOR_OF_CONST must be a string"
            r12.<init>(r13)
            throw r12
        L69d:
            java.lang.String r12 = "FOR_OF"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            boolean r12 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r12 == 0) goto L6db
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.String r12 = r12.zzc()
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r14 = r1.c(r13, r14)
            com.google.android.gms.internal.measurement.v r1 = new com.google.android.gms.internal.measurement.v
            r1.<init>(r13, r12, r6)
            com.google.android.gms.internal.measurement.n r12 = e(r1, r0, r14)
            goto L95d
        L6db:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Variable name in FOR_OF must be a string"
            r12.<init>(r13)
            throw r12
        L6e3:
            java.lang.String r12 = "FOR_LET"
            com.google.android.gms.internal.measurement.I1.I0(r9, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            java.lang.Object r4 = r13.f1553r
            com.google.android.gms.internal.measurement.t r4 = (com.google.android.gms.internal.measurement.C0862t) r4
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            boolean r0 = r12 instanceof com.google.android.gms.internal.measurement.C0783d
            if (r0 == 0) goto L78b
            com.google.android.gms.internal.measurement.d r12 = (com.google.android.gms.internal.measurement.C0783d) r12
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r5 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r5 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r5
            java.lang.Object r14 = r14.get(r3)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            com.google.android.gms.internal.measurement.n r14 = r4.c(r13, r14)
            E.c0 r3 = r13.G()
            r6 = r7
        L71b:
            int r8 = r12.p()
            if (r6 >= r8) goto L733
            com.google.android.gms.internal.measurement.n r8 = r12.q(r6)
            java.lang.String r8 = r8.zzc()
            com.google.android.gms.internal.measurement.n r9 = r13.K(r8)
            r3.I(r8, r9)
            int r6 = r6 + 1
            goto L71b
        L733:
            com.google.android.gms.internal.measurement.n r6 = r4.c(r13, r0)
            java.lang.Boolean r6 = r6.c()
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L787
            r6 = r14
            com.google.android.gms.internal.measurement.d r6 = (com.google.android.gms.internal.measurement.C0783d) r6
            com.google.android.gms.internal.measurement.n r6 = r13.E(r6)
            boolean r8 = r6 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r8 == 0) goto L765
            com.google.android.gms.internal.measurement.f r6 = (com.google.android.gms.internal.measurement.C0793f) r6
            java.lang.String r8 = r6.f10835r
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L75a
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L95d
        L75a:
            java.lang.String r8 = r6.f10835r
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L765
            r12 = r6
            goto L95d
        L765:
            E.c0 r6 = r13.G()
            r8 = r7
        L76a:
            int r9 = r12.p()
            if (r8 >= r9) goto L782
            com.google.android.gms.internal.measurement.n r9 = r12.q(r8)
            java.lang.String r9 = r9.zzc()
            com.google.android.gms.internal.measurement.n r10 = r3.K(r9)
            r6.I(r9, r10)
            int r8 = r8 + 1
            goto L76a
        L782:
            r6.D(r5)
            r3 = r6
            goto L733
        L787:
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L95d
        L78b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Initializer variables in FOR_LET must be an ArrayList"
            r12.<init>(r13)
            throw r12
        L793:
            java.lang.String r12 = "FOR_IN_LET"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            boolean r12 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r12 == 0) goto L806
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.String r12 = r12.zzc()
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r3 = r13.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r0 = r3.c(r13, r0)
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r3 = r13.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r14 = r3.c(r13, r14)
            java.util.Iterator r0 = r0.d()
            if (r0 == 0) goto L802
        L7cc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L802
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.n r3 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r3
            E.c0 r4 = r13.G()
            r4.J(r12, r3)
            r3 = r14
            com.google.android.gms.internal.measurement.d r3 = (com.google.android.gms.internal.measurement.C0783d) r3
            com.google.android.gms.internal.measurement.n r3 = r4.E(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r4 == 0) goto L7cc
            com.google.android.gms.internal.measurement.f r3 = (com.google.android.gms.internal.measurement.C0793f) r3
            java.lang.String r4 = r3.f10835r
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L7f8
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L95d
        L7f8:
            java.lang.String r4 = r3.f10835r
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L7cc
            goto L926
        L802:
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L95d
        L806:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Variable name in FOR_IN_LET must be a string"
            r12.<init>(r13)
            throw r12
        L80e:
            java.lang.String r12 = "FOR_IN_CONST"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            boolean r12 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r12 == 0) goto L850
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.String r12 = r12.zzc()
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r14 = r1.c(r13, r14)
            com.google.android.gms.internal.measurement.v r1 = new com.google.android.gms.internal.measurement.v
            r1.<init>(r13, r12, r7)
            java.util.Iterator r12 = r0.d()
            com.google.android.gms.internal.measurement.n r12 = g(r1, r12, r14)
            goto L95d
        L850:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Variable name in FOR_IN_CONST must be a string"
            r12.<init>(r13)
            throw r12
        L858:
            java.lang.String r12 = "FOR_IN"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            boolean r12 = r12 instanceof com.google.android.gms.internal.measurement.C0848q
            if (r12 == 0) goto L8c6
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.String r12 = r12.zzc()
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r3 = r13.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r0 = r3.c(r13, r0)
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r3 = r13.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r14 = r3.c(r13, r14)
            java.util.Iterator r0 = r0.d()
            if (r0 == 0) goto L8c2
        L891:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8c2
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.n r3 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r3
            r13.J(r12, r3)
            r3 = r14
            com.google.android.gms.internal.measurement.d r3 = (com.google.android.gms.internal.measurement.C0783d) r3
            com.google.android.gms.internal.measurement.n r3 = r13.E(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r4 == 0) goto L891
            com.google.android.gms.internal.measurement.f r3 = (com.google.android.gms.internal.measurement.C0793f) r3
            java.lang.String r4 = r3.f10835r
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L8b9
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L95d
        L8b9:
            java.lang.String r4 = r3.f10835r
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L891
            goto L926
        L8c2:
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L95d
        L8c6:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Variable name in FOR_IN must be a string"
            r12.<init>(r13)
            throw r12
        L8ce:
            java.lang.String r12 = "WHILE"
            com.google.android.gms.internal.measurement.I1.I0(r9, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r4 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r4 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r4
            java.lang.Object r14 = r14.get(r3)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r3 = r13.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            java.lang.Object r5 = r13.f1553r
            com.google.android.gms.internal.measurement.t r5 = (com.google.android.gms.internal.measurement.C0862t) r5
            com.google.android.gms.internal.measurement.n r14 = r3.c(r13, r14)
            com.google.android.gms.internal.measurement.n r3 = r5.c(r13, r4)
            java.lang.Boolean r3 = r3.c()
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L906
            goto L928
        L906:
            r3 = r14
            com.google.android.gms.internal.measurement.d r3 = (com.google.android.gms.internal.measurement.C0783d) r3
            com.google.android.gms.internal.measurement.n r3 = r13.E(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r4 == 0) goto L928
            com.google.android.gms.internal.measurement.f r3 = (com.google.android.gms.internal.measurement.C0793f) r3
            java.lang.String r4 = r3.f10835r
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L91e
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L95d
        L91e:
            java.lang.String r4 = r3.f10835r
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L928
        L926:
            r12 = r3
            goto L95d
        L928:
            com.google.android.gms.internal.measurement.n r3 = r5.c(r13, r12)
            java.lang.Boolean r3 = r3.c()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L95b
            r3 = r14
            com.google.android.gms.internal.measurement.d r3 = (com.google.android.gms.internal.measurement.C0783d) r3
            com.google.android.gms.internal.measurement.n r3 = r13.E(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r4 == 0) goto L957
            com.google.android.gms.internal.measurement.f r3 = (com.google.android.gms.internal.measurement.C0793f) r3
            java.lang.String r4 = r3.f10835r
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L94e
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto L95d
        L94e:
            java.lang.String r4 = r3.f10835r
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L957
            goto L926
        L957:
            r13.D(r0)
            goto L928
        L95b:
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
        L95d:
            return r12
        L95e:
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.EnumC0877w.ADD
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.I1.M0(r12)
            int r0 = r0.ordinal()
            if (r0 == r5) goto L9c9
            r1 = 47
            if (r0 == r1) goto L9a2
            r1 = 50
            if (r0 != r1) goto L99e
            java.lang.String r12 = "OR"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Boolean r0 = r12.c()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L9f4
            java.lang.Object r12 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            goto L9f4
        L99e:
            r11.b(r12)
            throw r4
        L9a2:
            java.lang.String r12 = "NOT"
            com.google.android.gms.internal.measurement.I1.I0(r5, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            com.google.android.gms.internal.measurement.e r13 = new com.google.android.gms.internal.measurement.e
            java.lang.Boolean r12 = r12.c()
            boolean r12 = r12.booleanValue()
            r12 = r12 ^ r5
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r13.<init>(r12)
            r12 = r13
            goto L9f4
        L9c9:
            java.lang.String r12 = "AND"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Boolean r0 = r12.c()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9f4
            java.lang.Object r12 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
        L9f4:
            return r12
        L9f5:
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.EnumC0877w.ADD
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.I1.M0(r12)
            int r0 = r0.ordinal()
            if (r0 == r6) goto Lbff
            r8 = 15
            java.lang.String r9 = "BREAK"
            if (r0 == r8) goto Lbf9
            r8 = 25
            if (r0 == r8) goto Lbf4
            r8 = 41
            if (r0 == r8) goto Lba0
            r8 = 54
            if (r0 == r8) goto Lb99
            r8 = 57
            if (r0 == r8) goto Lb74
            r8 = 19
            if (r0 == r8) goto Lb4c
            r8 = 20
            if (r0 == r8) goto Lb33
            r8 = 60
            if (r0 == r8) goto La7d
            r1 = 61
            if (r0 == r1) goto La44
            switch(r0) {
                case 11: goto La35;
                case 12: goto La2e;
                case 13: goto Lb4c;
                default: goto La2a;
            }
        La2a:
            r11.b(r12)
            throw r4
        La2e:
            com.google.android.gms.internal.measurement.I1.I0(r7, r9, r14)
            com.google.android.gms.internal.measurement.f r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10909g
            goto Lc44
        La35:
            E.c0 r12 = r13.G()
            com.google.android.gms.internal.measurement.d r13 = new com.google.android.gms.internal.measurement.d
            r13.<init>(r14)
            com.google.android.gms.internal.measurement.n r12 = r12.E(r13)
            goto Lc44
        La44:
            java.lang.String r12 = "TERNARY"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Boolean r12 = r12.c()
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La71
            java.lang.Object r12 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            com.google.android.gms.internal.measurement.n r12 = r1.c(r13, r12)
            goto Lc44
        La71:
            java.lang.Object r12 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            com.google.android.gms.internal.measurement.n r12 = r1.c(r13, r12)
            goto Lc44
        La7d:
            java.lang.String r12 = "SWITCH"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            java.lang.Object r3 = r13.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            com.google.android.gms.internal.measurement.n r0 = r3.c(r13, r0)
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            com.google.android.gms.internal.measurement.n r14 = r3.c(r13, r14)
            boolean r4 = r0 instanceof com.google.android.gms.internal.measurement.C0783d
            if (r4 == 0) goto Lb2b
            boolean r4 = r14 instanceof com.google.android.gms.internal.measurement.C0783d
            if (r4 == 0) goto Lb23
            com.google.android.gms.internal.measurement.d r0 = (com.google.android.gms.internal.measurement.C0783d) r0
            com.google.android.gms.internal.measurement.d r14 = (com.google.android.gms.internal.measurement.C0783d) r14
            r4 = r7
            r6 = r4
        Lab6:
            int r8 = r0.p()
            if (r4 >= r8) goto Laf1
            if (r6 != 0) goto Lacf
            com.google.android.gms.internal.measurement.n r6 = r0.q(r4)
            com.google.android.gms.internal.measurement.n r6 = r3.c(r13, r6)
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto Lacd
            goto Lacf
        Lacd:
            r6 = r7
            goto Laee
        Lacf:
            com.google.android.gms.internal.measurement.n r6 = r14.q(r4)
            com.google.android.gms.internal.measurement.n r6 = r3.c(r13, r6)
            boolean r8 = r6 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r8 == 0) goto Laed
            r12 = r6
            com.google.android.gms.internal.measurement.f r12 = (com.google.android.gms.internal.measurement.C0793f) r12
            java.lang.String r12 = r12.f10835r
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto Laea
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto Lc44
        Laea:
            r12 = r6
            goto Lc44
        Laed:
            r6 = r5
        Laee:
            int r4 = r4 + 1
            goto Lab6
        Laf1:
            int r12 = r0.p()
            int r12 = r12 + r5
            int r1 = r14.p()
            if (r12 != r1) goto Lb1f
            int r12 = r0.p()
            com.google.android.gms.internal.measurement.n r12 = r14.q(r12)
            com.google.android.gms.internal.measurement.n r12 = r3.c(r13, r12)
            boolean r13 = r12 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r13 == 0) goto Lb1f
            r13 = r12
            com.google.android.gms.internal.measurement.f r13 = (com.google.android.gms.internal.measurement.C0793f) r13
            java.lang.String r13 = r13.f10835r
            boolean r14 = r13.equals(r2)
            if (r14 != 0) goto Lc44
            java.lang.String r14 = "continue"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto Lc44
        Lb1f:
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto Lc44
        Lb23:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Malformed SWITCH statement, case statements are not a list"
            r12.<init>(r13)
            throw r12
        Lb2b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Malformed SWITCH statement, cases are not a list"
            r12.<init>(r13)
            throw r12
        Lb33:
            java.lang.String r12 = "DEFINE_FUNCTION"
            com.google.android.gms.internal.measurement.I1.J0(r6, r12, r14)
            com.google.android.gms.internal.measurement.m r12 = c(r13, r14)
            java.lang.String r14 = r12.f10855q
            if (r14 != 0) goto Lb47
            java.lang.String r14 = ""
            r13.I(r14, r12)
            goto Lc44
        Lb47:
            r13.I(r14, r12)
            goto Lc44
        Lb4c:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto Lb56
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto Lc44
        Lb56:
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            boolean r14 = r12 instanceof com.google.android.gms.internal.measurement.C0783d
            if (r14 == 0) goto Lb70
            com.google.android.gms.internal.measurement.d r12 = (com.google.android.gms.internal.measurement.C0783d) r12
            com.google.android.gms.internal.measurement.n r12 = r13.E(r12)
            goto Lc44
        Lb70:
            com.google.android.gms.internal.measurement.r r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            goto Lc44
        Lb74:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto Lb7e
            com.google.android.gms.internal.measurement.f r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10910h
            goto Lc44
        Lb7e:
            java.lang.String r12 = "RETURN"
            com.google.android.gms.internal.measurement.I1.I0(r5, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            com.google.android.gms.internal.measurement.f r13 = new com.google.android.gms.internal.measurement.f
            r13.<init>(r2, r12)
            r12 = r13
            goto Lc44
        Lb99:
            com.google.android.gms.internal.measurement.d r12 = new com.google.android.gms.internal.measurement.d
            r12.<init>(r14)
            goto Lc44
        Lba0:
            java.lang.String r12 = "IF"
            com.google.android.gms.internal.measurement.I1.J0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            int r2 = r14.size()
            if (r2 <= r6) goto Lbd1
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            com.google.android.gms.internal.measurement.n r4 = r1.c(r13, r14)
        Lbd1:
            com.google.android.gms.internal.measurement.r r14 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            java.lang.Boolean r12 = r12.c()
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lbe4
            com.google.android.gms.internal.measurement.d r0 = (com.google.android.gms.internal.measurement.C0783d) r0
            com.google.android.gms.internal.measurement.n r12 = r13.E(r0)
            goto Lbee
        Lbe4:
            if (r4 == 0) goto Lbed
            com.google.android.gms.internal.measurement.d r4 = (com.google.android.gms.internal.measurement.C0783d) r4
            com.google.android.gms.internal.measurement.n r12 = r13.E(r4)
            goto Lbee
        Lbed:
            r12 = r14
        Lbee:
            boolean r13 = r12 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r5 == r13) goto Lc44
            r12 = r14
            goto Lc44
        Lbf4:
            com.google.android.gms.internal.measurement.m r12 = c(r13, r14)
            goto Lc44
        Lbf9:
            com.google.android.gms.internal.measurement.I1.I0(r7, r9, r14)
            com.google.android.gms.internal.measurement.f r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.f
            goto Lc44
        Lbff:
            java.lang.String r12 = "APPLY"
            com.google.android.gms.internal.measurement.I1.I0(r3, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Object r0 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            java.lang.String r0 = r0.zzc()
            java.lang.Object r14 = r14.get(r6)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            com.google.android.gms.internal.measurement.n r14 = r1.c(r13, r14)
            boolean r1 = r14 instanceof com.google.android.gms.internal.measurement.C0783d
            if (r1 == 0) goto Lc4d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lc45
            com.google.android.gms.internal.measurement.d r14 = (com.google.android.gms.internal.measurement.C0783d) r14
            java.util.List r14 = r14.m()
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            com.google.android.gms.internal.measurement.n r12 = r12.g(r0, r13, r14)
        Lc44:
            return r12
        Lc45:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Function name for apply is undefined"
            r12.<init>(r13)
            throw r12
        Lc4d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Class r13 = r14.getClass()
            java.lang.String r13 = r13.getCanonicalName()
            java.lang.String r14 = "Function arguments for Apply are not a list found "
            java.lang.String r13 = C0.S.w(r14, r13)
            r12.<init>(r13)
            throw r12
        Lc61:
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.I1.M0(r12)
            java.lang.String r0 = r0.name()
            com.google.android.gms.internal.measurement.I1.I0(r6, r0, r14)
            java.lang.Object r0 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r0 = r1.c(r13, r0)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r1 = r13.f1553r
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0862t) r1
            com.google.android.gms.internal.measurement.n r13 = r1.c(r13, r14)
            com.google.android.gms.internal.measurement.w r14 = com.google.android.gms.internal.measurement.I1.M0(r12)
            int r14 = r14.ordinal()
            r1 = 23
            if (r14 == r1) goto Lccb
            r1 = 48
            if (r14 == r1) goto Lcc6
            r1 = 42
            if (r14 == r1) goto Lcc1
            r1 = 43
            if (r14 == r1) goto Lcbc
            switch(r14) {
                case 37: goto Lcb7;
                case 38: goto Lcb2;
                case 39: goto Lcad;
                case 40: goto Lca7;
                default: goto Lca3;
            }
        Lca3:
            r11.b(r12)
            throw r4
        Lca7:
            boolean r12 = com.google.android.gms.internal.measurement.I1.N0(r0, r13)
        Lcab:
            r12 = r12 ^ r5
            goto Lccf
        Lcad:
            boolean r12 = com.google.android.gms.internal.measurement.I1.N0(r0, r13)
            goto Lccf
        Lcb2:
            boolean r12 = h(r13, r0)
            goto Lccf
        Lcb7:
            boolean r12 = d(r13, r0)
            goto Lccf
        Lcbc:
            boolean r12 = h(r0, r13)
            goto Lccf
        Lcc1:
            boolean r12 = d(r0, r13)
            goto Lccf
        Lcc6:
            boolean r12 = f(r0, r13)
            goto Lcab
        Lccb:
            boolean r12 = f(r0, r13)
        Lccf:
            if (r12 == 0) goto Lcd4
            com.google.android.gms.internal.measurement.e r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.i
            goto Lcd6
        Lcd4:
            com.google.android.gms.internal.measurement.e r12 = com.google.android.gms.internal.measurement.InterfaceC0833n.j
        Lcd6:
            return r12
        Lcd7:
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.EnumC0877w.ADD
            com.google.android.gms.internal.measurement.w r0 = com.google.android.gms.internal.measurement.I1.M0(r12)
            int r0 = r0.ordinal()
            r1 = 31
            switch(r0) {
                case 4: goto Le84;
                case 5: goto Le3c;
                case 6: goto Le10;
                case 7: goto Ldca;
                case 8: goto Ld81;
                case 9: goto Ld30;
                case 10: goto Lcea;
                default: goto Lce6;
            }
        Lce6:
            r11.b(r12)
            throw r4
        Lcea:
            java.lang.String r12 = "BITWISE_XOR"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r0 = r12.doubleValue()
            int r12 = com.google.android.gms.internal.measurement.I1.O0(r0)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r13 = r0.c(r13, r14)
            java.lang.Double r13 = r13.b()
            double r13 = r13.doubleValue()
            int r13 = com.google.android.gms.internal.measurement.I1.O0(r13)
            r12 = r12 ^ r13
            double r12 = (double) r12
            com.google.android.gms.internal.measurement.g r14 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r14.<init>(r12)
            goto Lec8
        Ld30:
            java.lang.String r12 = "BITWISE_UNSIGNED_RIGHT_SHIFT"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r3 = r12.doubleValue()
            int r12 = com.google.android.gms.internal.measurement.I1.O0(r3)
            long r3 = (long) r12
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            java.lang.Object r12 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r12 = r12.doubleValue()
            int r12 = com.google.android.gms.internal.measurement.I1.O0(r12)
            long r12 = (long) r12
            long r12 = r12 & r1
            int r12 = (int) r12
            long r12 = r3 >>> r12
            double r12 = (double) r12
            com.google.android.gms.internal.measurement.g r14 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r14.<init>(r12)
            goto Lec8
        Ld81:
            java.lang.String r12 = "BITWISE_RIGHT_SHIFT"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r3 = r12.doubleValue()
            int r12 = com.google.android.gms.internal.measurement.I1.O0(r3)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r13 = r0.c(r13, r14)
            java.lang.Double r13 = r13.b()
            double r13 = r13.doubleValue()
            int r13 = com.google.android.gms.internal.measurement.I1.O0(r13)
            long r13 = (long) r13
            long r13 = r13 & r1
            int r13 = (int) r13
            int r12 = r12 >> r13
            double r12 = (double) r12
            com.google.android.gms.internal.measurement.g r14 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r14.<init>(r12)
            goto Lec8
        Ldca:
            java.lang.String r12 = "BITWISE_OR"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r0 = r12.doubleValue()
            int r12 = com.google.android.gms.internal.measurement.I1.O0(r0)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r13 = r0.c(r13, r14)
            java.lang.Double r13 = r13.b()
            double r13 = r13.doubleValue()
            int r13 = com.google.android.gms.internal.measurement.I1.O0(r13)
            r12 = r12 | r13
            double r12 = (double) r12
            com.google.android.gms.internal.measurement.g r14 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r14.<init>(r12)
            goto Lec8
        Le10:
            java.lang.String r12 = "BITWISE_NOT"
            com.google.android.gms.internal.measurement.I1.I0(r5, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r14 = r13.f1553r
            com.google.android.gms.internal.measurement.t r14 = (com.google.android.gms.internal.measurement.C0862t) r14
            com.google.android.gms.internal.measurement.n r12 = r14.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r12 = r12.doubleValue()
            int r12 = com.google.android.gms.internal.measurement.I1.O0(r12)
            int r12 = ~r12
            double r12 = (double) r12
            com.google.android.gms.internal.measurement.g r14 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r14.<init>(r12)
            goto Lec8
        Le3c:
            java.lang.String r12 = "BITWISE_LEFT_SHIFT"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r3 = r12.doubleValue()
            int r12 = com.google.android.gms.internal.measurement.I1.O0(r3)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r13 = r0.c(r13, r14)
            java.lang.Double r13 = r13.b()
            double r13 = r13.doubleValue()
            int r13 = com.google.android.gms.internal.measurement.I1.O0(r13)
            long r13 = (long) r13
            long r13 = r13 & r1
            int r13 = (int) r13
            int r12 = r12 << r13
            double r12 = (double) r12
            com.google.android.gms.internal.measurement.g r14 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r14.<init>(r12)
            goto Lec8
        Le84:
            java.lang.String r12 = "BITWISE_AND"
            com.google.android.gms.internal.measurement.I1.I0(r6, r12, r14)
            java.lang.Object r12 = r14.get(r7)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r12 = r0.c(r13, r12)
            java.lang.Double r12 = r12.b()
            double r0 = r12.doubleValue()
            int r12 = com.google.android.gms.internal.measurement.I1.O0(r0)
            java.lang.Object r14 = r14.get(r5)
            com.google.android.gms.internal.measurement.n r14 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r14
            java.lang.Object r0 = r13.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r13 = r0.c(r13, r14)
            java.lang.Double r13 = r13.b()
            double r13 = r13.doubleValue()
            int r13 = com.google.android.gms.internal.measurement.I1.O0(r13)
            r12 = r12 & r13
            double r12 = (double) r12
            com.google.android.gms.internal.measurement.g r14 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r14.<init>(r12)
        Lec8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0857s.a(java.lang.String, E.c0, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(String str) {
        if (!this.f11028a.contains(I1.M0(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
