package O3;

import com.google.android.gms.internal.measurement.AbstractC0851q2;
import com.google.android.gms.internal.measurement.C0893z0;
import com.google.android.gms.internal.measurement.D3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0269b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f4741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f4742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f4743e;
    public Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0272c f4745h;
    public final AbstractC0851q2 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0269b(C0272c c0272c, String str, int i, AbstractC0851q2 abstractC0851q2, int i7) {
        this.f4744g = i7;
        this.f4745h = c0272c;
        this.f4739a = str;
        this.f4740b = i;
        this.i = abstractC0851q2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Boolean c(Boolean bool, boolean z5) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, com.google.android.gms.internal.measurement.F0 f02, X x6) {
        List listU;
        AbstractC1887A.g(f02);
        if (str != null && f02.p() && f02.x() != 1 && (f02.x() != 7 ? f02.q() : f02.v() != 0)) {
            int iX = f02.x();
            boolean zT = f02.t();
            String strR = (zT || iX == 2 || iX == 7) ? f02.r() : f02.r().toUpperCase(Locale.ENGLISH);
            if (f02.v() == 0) {
                listU = null;
            } else {
                listU = f02.u();
                if (!zT) {
                    ArrayList arrayList = new ArrayList(listU.size());
                    Iterator it = listU.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listU = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iX == 2 ? strR : null;
            if (iX != 7 ? strR != null : listU != null && !listU.isEmpty()) {
                if (!zT && iX != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iX - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zT ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (x6 != null) {
                                    x6.f4673z.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strR));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strR));
                    case 4:
                        return Boolean.valueOf(str.contains(strR));
                    case 5:
                        return Boolean.valueOf(str.equals(strR));
                    case 6:
                        if (listU != null) {
                            return Boolean.valueOf(listU.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.C0 r9, double r10) {
        /*
            x3.AbstractC1887A.g(r9)
            boolean r0 = r9.p()
            r1 = 0
            if (r0 == 0) goto L117
            int r0 = r9.z()
            r2 = 1
            if (r0 != r2) goto L13
            goto L117
        L13:
            int r0 = r9.z()
            r3 = 5
            if (r0 != r3) goto L27
            boolean r0 = r9.u()
            if (r0 == 0) goto L117
            boolean r0 = r9.w()
            if (r0 == 0) goto L117
            goto L2f
        L27:
            boolean r0 = r9.s()
            if (r0 != 0) goto L2f
            goto L117
        L2f:
            int r0 = r9.z()
            int r4 = r9.z()
            if (r4 != r3) goto L64
            java.lang.String r4 = r9.v()
            boolean r4 = O3.C0270b0.U(r4)
            if (r4 == 0) goto L117
            java.lang.String r4 = r9.x()
            boolean r4 = O3.C0270b0.U(r4)
            if (r4 != 0) goto L4f
            goto L117
        L4f:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L117
            java.lang.String r5 = r9.v()     // Catch: java.lang.NumberFormatException -> L117
            r4.<init>(r5)     // Catch: java.lang.NumberFormatException -> L117
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L117
            java.lang.String r9 = r9.x()     // Catch: java.lang.NumberFormatException -> L117
            r5.<init>(r9)     // Catch: java.lang.NumberFormatException -> L117
            r9 = r4
            r4 = r1
            goto L7b
        L64:
            java.lang.String r4 = r9.t()
            boolean r4 = O3.C0270b0.U(r4)
            if (r4 != 0) goto L70
            goto L117
        L70:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L117
            java.lang.String r9 = r9.t()     // Catch: java.lang.NumberFormatException -> L117
            r4.<init>(r9)     // Catch: java.lang.NumberFormatException -> L117
            r9 = r1
            r5 = r9
        L7b:
            if (r0 != r3) goto L80
            if (r9 == 0) goto L117
            goto L84
        L80:
            if (r4 != 0) goto L84
            goto L117
        L84:
            int r0 = r0 + (-1)
            r3 = 0
            if (r0 == r2) goto L107
            r6 = 2
            if (r0 == r6) goto Lf7
            r7 = 3
            if (r0 == r7) goto La9
            r10 = 4
            if (r0 == r10) goto L94
            goto L117
        L94:
            if (r9 == 0) goto L117
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto La3
            int r8 = r8.compareTo(r5)
            if (r8 > 0) goto La3
            goto La4
        La3:
            r2 = r3
        La4:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        La9:
            if (r4 != 0) goto Lad
            goto L117
        Lad:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto Lea
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r4.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto Le4
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r4.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto Le4
            goto Le5
        Le4:
            r2 = r3
        Le5:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        Lea:
            int r8 = r8.compareTo(r4)
            if (r8 != 0) goto Lf1
            goto Lf2
        Lf1:
            r2 = r3
        Lf2:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        Lf7:
            if (r4 != 0) goto Lfa
            goto L117
        Lfa:
            int r8 = r8.compareTo(r4)
            if (r8 <= 0) goto L101
            goto L102
        L101:
            r2 = r3
        L102:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L107:
            if (r4 != 0) goto L10a
            goto L117
        L10a:
            int r8 = r8.compareTo(r4)
            if (r8 >= 0) goto L111
            goto L112
        L111:
            r2 = r3
        L112:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L117:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0269b.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.C0, double):java.lang.Boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:3: B:89:0x0246->B:238:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.C0820k1 r24, long r25, O3.C0319s r27, boolean r28) {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.internal.measurement.D3.a()
            O3.c r1 = r0.f4745h
            java.lang.Object r2 = r1.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.g r3 = r2.f5075t
            O3.X r4 = r2.f5077v
            O3.Q r2 = r2.f5081z
            O3.E r5 = O3.F.f4372F0
            java.lang.String r6 = r0.f4739a
            boolean r3 = r3.y(r6, r5)
            com.google.android.gms.internal.measurement.q2 r5 = r0.i
            com.google.android.gms.internal.measurement.x0 r5 = (com.google.android.gms.internal.measurement.C0883x0) r5
            boolean r7 = r5.A()
            if (r7 == 0) goto L28
            r7 = r27
            long r7 = r7.f5044e
            goto L2a
        L28:
            r7 = r25
        L2a:
            O3.C0323t0.l(r4)
            O3.V r9 = r4.f4666E
            O3.V r10 = r4.f4673z
            java.lang.String r11 = r4.y()
            r12 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r12)
            int r13 = r0.f4740b
            r16 = 0
            if (r11 == 0) goto L106
            O3.C0323t0.l(r4)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            boolean r17 = r5.p()
            if (r17 == 0) goto L58
            int r17 = r5.q()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r12 = r17
            goto L5a
        L58:
            r12 = r16
        L5a:
            java.lang.String r15 = r5.r()
            java.lang.String r15 = r2.a(r15)
            java.lang.String r14 = "Evaluating filter. audience, filter, event"
            r9.e(r14, r11, r12, r15)
            O3.C0323t0.l(r4)
            O3.T1 r1 = r1.f4510s
            O3.b0 r1 = r1.f4613w
            O3.T1.S(r1)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "\nevent_filter {\n"
            r11.append(r12)
            boolean r12 = r5.p()
            if (r12 == 0) goto L90
            int r12 = r5.q()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r14 = "filter_id"
            r15 = 0
            O3.C0270b0.G(r11, r15, r14, r12)
            goto L91
        L90:
            r15 = 0
        L91:
            java.lang.Object r12 = r1.f4346r
            O3.t0 r12 = (O3.C0323t0) r12
            O3.Q r12 = r12.f5081z
            java.lang.String r14 = r5.r()
            java.lang.String r12 = r12.a(r14)
            java.lang.String r14 = "event_name"
            O3.C0270b0.G(r11, r15, r14, r12)
            boolean r12 = r5.x()
            boolean r14 = r5.y()
            boolean r15 = r5.A()
            java.lang.String r12 = O3.C0270b0.C(r12, r14, r15)
            boolean r14 = r12.isEmpty()
            if (r14 != 0) goto Lc0
            java.lang.String r14 = "filter_type"
            r15 = 0
            O3.C0270b0.G(r11, r15, r14, r12)
        Lc0:
            boolean r12 = r5.v()
            if (r12 == 0) goto Ld0
            com.google.android.gms.internal.measurement.C0 r12 = r5.w()
            java.lang.String r14 = "event_count_filter"
            r15 = 1
            O3.C0270b0.H(r11, r15, r14, r12)
        Ld0:
            int r12 = r5.t()
            if (r12 <= 0) goto Lf4
            java.lang.String r12 = "  filters {\n"
            r11.append(r12)
            java.util.List r12 = r5.s()
            java.util.Iterator r12 = r12.iterator()
        Le3:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto Lf4
            java.lang.Object r14 = r12.next()
            com.google.android.gms.internal.measurement.z0 r14 = (com.google.android.gms.internal.measurement.C0893z0) r14
            r15 = 2
            r1.z(r11, r15, r14)
            goto Le3
        Lf4:
            r15 = 1
            O3.C0270b0.A(r11, r15)
            java.lang.String r1 = "}\n}\n"
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            java.lang.String r11 = "Filter definition"
            r9.c(r1, r11)
        L106:
            boolean r1 = r5.p()
            if (r1 == 0) goto L114
            int r1 = r5.q()
            r11 = 256(0x100, float:3.59E-43)
            if (r1 <= r11) goto L118
        L114:
            r19 = r4
            goto L41d
        L118:
            boolean r1 = r5.x()
            boolean r6 = r5.y()
            boolean r11 = r5.A()
            if (r1 != 0) goto L12a
            if (r6 != 0) goto L12a
            if (r11 == 0) goto L12c
        L12a:
            r1 = 1
            goto L12d
        L12c:
            r1 = 0
        L12d:
            if (r28 == 0) goto L14f
            if (r1 != 0) goto L14f
            O3.C0323t0.l(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r2 = r5.p()
            if (r2 == 0) goto L146
            int r2 = r5.q()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
        L146:
            r2 = r16
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r9.d(r1, r2, r3)
            r15 = 1
            return r15
        L14f:
            java.lang.String r6 = r24.s()
            boolean r11 = r5.v()
            r12 = 0
            if (r11 == 0) goto L17c
            com.google.android.gms.internal.measurement.C0 r11 = r5.w()
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L169
            r14.<init>(r7)     // Catch: java.lang.NumberFormatException -> L169
            java.lang.Boolean r7 = e(r14, r11, r12)     // Catch: java.lang.NumberFormatException -> L169
            goto L16b
        L169:
            r7 = r16
        L16b:
            if (r7 != 0) goto L173
        L16d:
            r20 = r3
            r19 = r4
            goto L3c9
        L173:
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L17c
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            goto L16d
        L17c:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.List r8 = r5.s()
            java.util.Iterator r8 = r8.iterator()
        L189:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L1b4
            java.lang.Object r11 = r8.next()
            com.google.android.gms.internal.measurement.z0 r11 = (com.google.android.gms.internal.measurement.C0893z0) r11
            java.lang.String r14 = r11.w()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L1ac
            O3.C0323t0.l(r4)
            java.lang.String r2 = r2.a(r6)
            java.lang.String r6 = "null or empty param name in filter. event"
            r10.c(r2, r6)
            goto L16d
        L1ac:
            java.lang.String r11 = r11.w()
            r7.add(r11)
            goto L189
        L1b4:
            r.e r8 = new r.e
            r15 = 0
            r8.<init>(r15)
            java.util.List r11 = r24.p()
            java.util.Iterator r11 = r11.iterator()
        L1c2:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L23e
            java.lang.Object r14 = r11.next()
            com.google.android.gms.internal.measurement.n1 r14 = (com.google.android.gms.internal.measurement.C0835n1) r14
            java.lang.String r15 = r14.q()
            boolean r15 = r7.contains(r15)
            if (r15 == 0) goto L1c2
            boolean r15 = r14.t()
            if (r15 == 0) goto L1f7
            java.lang.String r15 = r14.q()
            boolean r17 = r14.t()
            if (r17 == 0) goto L1f1
            long r17 = r14.u()
            java.lang.Long r14 = java.lang.Long.valueOf(r17)
            goto L1f3
        L1f1:
            r14 = r16
        L1f3:
            r8.put(r15, r14)
            goto L1c2
        L1f7:
            boolean r15 = r14.x()
            if (r15 == 0) goto L216
            java.lang.String r15 = r14.q()
            boolean r17 = r14.x()
            if (r17 == 0) goto L210
            double r17 = r14.y()
            java.lang.Double r14 = java.lang.Double.valueOf(r17)
            goto L212
        L210:
            r14 = r16
        L212:
            r8.put(r15, r14)
            goto L1c2
        L216:
            boolean r15 = r14.r()
            if (r15 == 0) goto L228
            java.lang.String r15 = r14.q()
            java.lang.String r14 = r14.s()
            r8.put(r15, r14)
            goto L1c2
        L228:
            O3.C0323t0.l(r4)
            java.lang.String r6 = r2.a(r6)
            java.lang.String r7 = r14.q()
            java.lang.String r2 = r2.b(r7)
            java.lang.String r7 = "Unknown value for param. event, param"
            r10.d(r6, r2, r7)
            goto L16d
        L23e:
            java.util.List r7 = r5.s()
            java.util.Iterator r7 = r7.iterator()
        L246:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L3c3
            java.lang.Object r11 = r7.next()
            com.google.android.gms.internal.measurement.z0 r11 = (com.google.android.gms.internal.measurement.C0893z0) r11
            boolean r14 = r11.t()
            if (r14 == 0) goto L260
            boolean r14 = r11.u()
            if (r14 == 0) goto L260
            r14 = 1
            goto L261
        L260:
            r14 = 0
        L261:
            java.lang.String r15 = r11.w()
            boolean r17 = r15.isEmpty()
            if (r17 == 0) goto L279
            O3.C0323t0.l(r4)
            java.lang.String r2 = r2.a(r6)
            java.lang.String r6 = "Event has empty param name. event"
            r10.c(r2, r6)
            goto L16d
        L279:
            java.lang.Object r12 = r8.get(r15)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L2c2
            boolean r13 = r11.r()
            if (r13 != 0) goto L299
            O3.C0323t0.l(r4)
            java.lang.String r6 = r2.a(r6)
            java.lang.String r2 = r2.b(r15)
            java.lang.String r7 = "No number filter for long param. event, param"
            r10.d(r6, r2, r7)
            goto L16d
        L299:
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            com.google.android.gms.internal.measurement.C0 r11 = r11.s()
            java.math.BigDecimal r15 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L2af
            r15.<init>(r12)     // Catch: java.lang.NumberFormatException -> L2af
            r12 = 0
            java.lang.Boolean r11 = e(r15, r11, r12)     // Catch: java.lang.NumberFormatException -> L2af
            goto L2b1
        L2af:
            r11 = r16
        L2b1:
            if (r11 != 0) goto L2b5
            goto L16d
        L2b5:
            boolean r11 = r11.booleanValue()
            if (r11 != r14) goto L2bf
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            goto L16d
        L2bf:
            r12 = 0
            goto L246
        L2c2:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L306
            boolean r13 = r11.r()
            if (r13 != 0) goto L2de
            O3.C0323t0.l(r4)
            java.lang.String r6 = r2.a(r6)
            java.lang.String r2 = r2.b(r15)
            java.lang.String r7 = "No number filter for double param. event, param"
            r10.d(r6, r2, r7)
            goto L16d
        L2de:
            java.lang.Double r12 = (java.lang.Double) r12
            double r12 = r12.doubleValue()
            com.google.android.gms.internal.measurement.C0 r11 = r11.s()
            java.math.BigDecimal r15 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L2f6
            r15.<init>(r12)     // Catch: java.lang.NumberFormatException -> L2f6
            double r12 = java.lang.Math.ulp(r12)     // Catch: java.lang.NumberFormatException -> L2f6
            java.lang.Boolean r11 = e(r15, r11, r12)     // Catch: java.lang.NumberFormatException -> L2f6
            goto L2f8
        L2f6:
            r11 = r16
        L2f8:
            if (r11 != 0) goto L2fc
            goto L16d
        L2fc:
            boolean r11 = r11.booleanValue()
            if (r11 != r14) goto L2bf
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            goto L16d
        L306:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L399
            boolean r13 = r11.p()
            if (r13 == 0) goto L324
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.F0 r11 = r11.q()
            O3.C0323t0.l(r4)
            java.lang.Boolean r11 = d(r12, r11, r4)
            r20 = r3
            r19 = r4
        L321:
            r3 = 0
            goto L35b
        L324:
            boolean r13 = r11.r()
            if (r13 == 0) goto L384
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = O3.C0270b0.U(r12)
            if (r13 == 0) goto L36f
            com.google.android.gms.internal.measurement.C0 r11 = r11.s()
            boolean r13 = O3.C0270b0.U(r12)
            if (r13 != 0) goto L343
            r20 = r3
            r19 = r4
            r11 = r16
            goto L321
        L343:
            java.math.BigDecimal r13 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L353
            r13.<init>(r12)     // Catch: java.lang.NumberFormatException -> L353
            r20 = r3
            r19 = r4
            r3 = 0
            java.lang.Boolean r11 = e(r13, r11, r3)     // Catch: java.lang.NumberFormatException -> L359
            goto L35b
        L353:
            r20 = r3
            r19 = r4
            r3 = 0
        L359:
            r11 = r16
        L35b:
            if (r11 != 0) goto L35f
            goto L3c9
        L35f:
            boolean r11 = r11.booleanValue()
            if (r11 != r14) goto L368
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            goto L3c9
        L368:
            r12 = r3
            r4 = r19
            r3 = r20
            goto L246
        L36f:
            r20 = r3
            r19 = r4
            O3.C0323t0.l(r19)
            java.lang.String r3 = r2.a(r6)
            java.lang.String r2 = r2.b(r15)
            java.lang.String r4 = "Invalid param value for number filter. event, param"
            r10.d(r3, r2, r4)
            goto L3c9
        L384:
            r20 = r3
            r19 = r4
            O3.C0323t0.l(r19)
            java.lang.String r3 = r2.a(r6)
            java.lang.String r2 = r2.b(r15)
            java.lang.String r4 = "No filter for String param. event, param"
            r10.d(r3, r2, r4)
            goto L3c9
        L399:
            r20 = r3
            r19 = r4
            if (r12 != 0) goto L3b2
            O3.C0323t0.l(r19)
            java.lang.String r3 = r2.a(r6)
            java.lang.String r2 = r2.b(r15)
            java.lang.String r4 = "Missing param for filter. event, param"
            r9.d(r3, r2, r4)
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            goto L3c9
        L3b2:
            O3.C0323t0.l(r19)
            java.lang.String r3 = r2.a(r6)
            java.lang.String r2 = r2.b(r15)
            java.lang.String r4 = "Unknown param type. event, param"
            r10.d(r3, r2, r4)
            goto L3c9
        L3c3:
            r20 = r3
            r19 = r4
            java.lang.Boolean r16 = java.lang.Boolean.TRUE
        L3c9:
            O3.C0323t0.l(r19)
            if (r16 != 0) goto L3d1
            java.lang.String r2 = "null"
            goto L3d3
        L3d1:
            r2 = r16
        L3d3:
            java.lang.String r3 = "Event filter result"
            r9.c(r2, r3)
            if (r16 != 0) goto L3dc
            r15 = 0
            return r15
        L3dc:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f4741c = r2
            boolean r3 = r16.booleanValue()
            if (r3 != 0) goto L3e8
        L3e6:
            r15 = 1
            goto L41c
        L3e8:
            r0.f4742d = r2
            if (r1 == 0) goto L3e6
            boolean r1 = r24.t()
            if (r1 == 0) goto L3e6
            long r1 = r24.u()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r2 = r5.y()
            if (r2 == 0) goto L40e
            if (r20 == 0) goto L40b
            boolean r2 = r5.v()
            if (r2 != 0) goto L409
            goto L40b
        L409:
            r1 = r22
        L40b:
            r0.f = r1
            goto L3e6
        L40e:
            if (r20 == 0) goto L419
            boolean r2 = r5.v()
            if (r2 != 0) goto L417
            goto L419
        L417:
            r1 = r23
        L419:
            r0.f4743e = r1
            goto L3e6
        L41c:
            return r15
        L41d:
            O3.C0323t0.l(r19)
            O3.W r1 = O3.X.w(r6)
            boolean r2 = r5.p()
            if (r2 == 0) goto L432
            int r2 = r5.q()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
        L432:
            java.lang.String r2 = java.lang.String.valueOf(r16)
            java.lang.String r3 = "Invalid event filter ID. appId, id"
            r10.d(r1, r2, r3)
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0269b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.k1, long, O3.s, boolean):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean b(Long l7, Long l8, com.google.android.gms.internal.measurement.B1 b12, boolean z5) {
        boolean z6;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        D3.a();
        C0323t0 c0323t0 = (C0323t0) this.f4745h.f4346r;
        C0284g c0284g = c0323t0.f5075t;
        Q q7 = c0323t0.f5081z;
        X x6 = c0323t0.f5077v;
        boolean zY = c0284g.y(this.f4739a, F.D0);
        com.google.android.gms.internal.measurement.E0 e02 = (com.google.android.gms.internal.measurement.E0) this.i;
        boolean zT = e02.t();
        boolean zU = e02.u();
        boolean zW = e02.w();
        boolean z7 = zT || zU || zW;
        if (z5 && !z7) {
            C0323t0.l(x6);
            x6.f4666E.d(Integer.valueOf(this.f4740b), e02.p() ? Integer.valueOf(e02.q()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C0893z0 c0893z0S = e02.s();
        boolean zU2 = c0893z0S.u();
        if (!b12.u()) {
            z6 = zW;
            if (!b12.y()) {
                if (!b12.s()) {
                    C0323t0.l(x6);
                    x6.f4673z.c(q7.c(b12.r()), "User property has no value, property");
                } else if (c0893z0S.p()) {
                    String strT = b12.t();
                    com.google.android.gms.internal.measurement.F0 f0Q = c0893z0S.q();
                    C0323t0.l(x6);
                    boolC = c(d(strT, f0Q, x6), zU2);
                } else if (!c0893z0S.r()) {
                    C0323t0.l(x6);
                    x6.f4673z.c(q7.c(b12.r()), "No string or number filter defined. property");
                } else if (C0270b0.U(b12.t())) {
                    String strT2 = b12.t();
                    com.google.android.gms.internal.measurement.C0 c0S = c0893z0S.s();
                    if (C0270b0.U(strT2)) {
                        try {
                            boolE = e(new BigDecimal(strT2), c0S, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                        boolC = c(boolE, zU2);
                    } else {
                        boolE = null;
                        boolC = c(boolE, zU2);
                    }
                } else {
                    C0323t0.l(x6);
                    x6.f4673z.d(q7.c(b12.r()), b12.t(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolC = null;
            } else if (c0893z0S.r()) {
                double dZ = b12.z();
                try {
                    boolE2 = e(new BigDecimal(dZ), c0893z0S.s(), Math.ulp(dZ));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zU2);
            } else {
                C0323t0.l(x6);
                x6.f4673z.c(q7.c(b12.r()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (c0893z0S.r()) {
            z6 = zW;
            try {
                boolE3 = e(new BigDecimal(b12.v()), c0893z0S.s(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zU2);
        } else {
            C0323t0.l(x6);
            x6.f4673z.c(q7.c(b12.r()), "No number filter for long property. property");
            z6 = zW;
            boolC = null;
        }
        C0323t0.l(x6);
        x6.f4666E.c(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f4741c = Boolean.TRUE;
        if (!z6 || boolC.booleanValue()) {
            if (!z5 || e02.t()) {
                this.f4742d = boolC;
            }
            if (boolC.booleanValue() && z7 && b12.p()) {
                long jQ = b12.q();
                if (l7 != null) {
                    jQ = l7.longValue();
                }
                if (zY && e02.t() && !e02.u() && l8 != null) {
                    jQ = l8.longValue();
                }
                if (e02.u()) {
                    this.f = Long.valueOf(jQ);
                } else {
                    this.f4743e = Long.valueOf(jQ);
                }
            }
        }
        return true;
    }
}
