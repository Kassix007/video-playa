package r6;

import I2.A;
import J5.t;
import O3.D;
import com.google.android.gms.internal.measurement.I1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import m5.C1371j;
import m5.C1386y;
import n5.l;
import n5.y;
import q6.C1538g;
import q6.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f16368a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int a(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' <= c7 && c7 < 'G') {
            return c7 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = x.f16093r;
        x xVarR = D.r("/");
        C1371j[] c1371jArr = {new C1371j(xVarR, new h(xVarR, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.I(1));
        n5.x.L(linkedHashMap, c1371jArr);
        for (h hVar : l.x0(arrayList, new A(9))) {
            if (((h) linkedHashMap.put(hVar.f16383a, hVar)) == null) {
                while (true) {
                    x xVar = hVar.f16383a;
                    x xVarC = xVar.c();
                    if (xVarC != null) {
                        h hVar2 = (h) linkedHashMap.get(xVarC);
                        if (hVar2 != null) {
                            hVar2.f16396q.add(xVar);
                            break;
                        }
                        h hVar3 = new h(xVarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(xVarC, hVar3);
                        hVar3.f16396q.add(xVar);
                        hVar = hVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String c(int i) {
        I1.M(16);
        String string = Integer.toString(i, 16);
        m.d(string, "toString(...)");
        return "0x".concat(string);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(8:65|69|123|70|(4:73|(3:75|(2:77|145)(1:144)|80)(3:143|81|82)|(4:93|121|94|95)(1:96)|71)|132|83|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r14 != (r10.n() & 65535)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (r0 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r9 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r10.skip(4);
        r16 = ((long) r10.e()) & 4294967295L;
        r13 = r10.n() & 65535;
        r12 = new r6.d(r13, r14, r16);
        r10.v(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        r10.close();
        r4 = r4 - ((long) 20);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (r4 <= r18) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        r4 = a.AbstractC0597a.j(r3.a(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (r4.e() != 117853008) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r5 = r4.e();
        r8 = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r4.e() != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r5 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r5 = a.AbstractC0597a.j(r3.a(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        r6 = r5.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r6 != 101075792) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
    
        r5.skip(12);
        r6 = r5.e();
        r8 = r5.e();
        r22 = r5.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        if (r22 != r5.f()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        if (r6 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        if (r8 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        r5.skip(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0120, code lost:
    
        throw new java.io.IOException("bad zip: expected " + c(101075792) + " but was " + c(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0127, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
    
        m5.AbstractC1362a.a(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012b, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0145, code lost:
    
        m5.AbstractC1362a.a(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0198, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0199, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r0 = r10.n() & 65535;
        r9 = r10.n() & 65535;
        r14 = r10.n() & 65535;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:19:0x0091, B:21:0x009a, B:24:0x00ab, B:50:0x012f, B:46:0x0128, B:53:0x0133, B:54:0x0138, B:25:0x00b3, B:27:0x00bc, B:31:0x00d9, B:36:0x00f2, B:37:0x00f7, B:39:0x00fa, B:40:0x0120, B:43:0x0123), top: B:119:0x0091, outer: #9, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c A[Catch: all -> 0x014d, TryCatch #9 {all -> 0x014d, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007d, B:18:0x0089, B:66:0x014c, B:62:0x0145, B:69:0x0151, B:93:0x01a6, B:96:0x01b3, B:90:0x01a0, B:103:0x01c1, B:106:0x01cf, B:107:0x01d6, B:108:0x01d7, B:109:0x01da, B:110:0x01db, B:111:0x01f0, B:19:0x0091, B:21:0x009a, B:24:0x00ab, B:50:0x012f, B:46:0x0128, B:53:0x0133, B:54:0x0138, B:25:0x00b3, B:27:0x00bc, B:31:0x00d9, B:36:0x00f2, B:37:0x00f7, B:39:0x00fa, B:40:0x0120, B:43:0x0123, B:70:0x0160, B:73:0x0166, B:75:0x0172, B:77:0x0180, B:80:0x0187, B:81:0x018c, B:82:0x0193, B:59:0x0140, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b7, B:101:0x01bc, B:87:0x019b), top: B:134:0x000f, inners: #0, #3, #4, #5, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a6 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #9 {all -> 0x014d, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007d, B:18:0x0089, B:66:0x014c, B:62:0x0145, B:69:0x0151, B:93:0x01a6, B:96:0x01b3, B:90:0x01a0, B:103:0x01c1, B:106:0x01cf, B:107:0x01d6, B:108:0x01d7, B:109:0x01da, B:110:0x01db, B:111:0x01f0, B:19:0x0091, B:21:0x009a, B:24:0x00ab, B:50:0x012f, B:46:0x0128, B:53:0x0133, B:54:0x0138, B:25:0x00b3, B:27:0x00bc, B:31:0x00d9, B:36:0x00f2, B:37:0x00f7, B:39:0x00fa, B:40:0x0120, B:43:0x0123, B:70:0x0160, B:73:0x0166, B:75:0x0172, B:77:0x0180, B:80:0x0187, B:81:0x018c, B:82:0x0193, B:59:0x0140, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b7, B:101:0x01bc, B:87:0x019b), top: B:134:0x000f, inners: #0, #3, #4, #5, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3 A[Catch: all -> 0x014d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x014d, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007d, B:18:0x0089, B:66:0x014c, B:62:0x0145, B:69:0x0151, B:93:0x01a6, B:96:0x01b3, B:90:0x01a0, B:103:0x01c1, B:106:0x01cf, B:107:0x01d6, B:108:0x01d7, B:109:0x01da, B:110:0x01db, B:111:0x01f0, B:19:0x0091, B:21:0x009a, B:24:0x00ab, B:50:0x012f, B:46:0x0128, B:53:0x0133, B:54:0x0138, B:25:0x00b3, B:27:0x00bc, B:31:0x00d9, B:36:0x00f2, B:37:0x00f7, B:39:0x00fa, B:40:0x0120, B:43:0x0123, B:70:0x0160, B:73:0x0166, B:75:0x0172, B:77:0x0180, B:80:0x0187, B:81:0x018c, B:82:0x0193, B:59:0x0140, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b7, B:101:0x01bc, B:87:0x019b), top: B:134:0x000f, inners: #0, #3, #4, #5, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final q6.J d(q6.x r26, q6.l r27, B5.c r28) {
        /*
            r1 = r26
            r2 = r27
            java.lang.String r0 = "not a zip: size="
            java.lang.String r3 = "fileSystem"
            kotlin.jvm.internal.m.e(r2, r3)
            q6.s r3 = r2.M(r1)
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L14d
            r6 = 22
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L14d
            long r4 = r4 - r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L1db
            r8 = 65536(0x10000, double:3.2379E-319)
            long r8 = r4 - r8
            long r8 = java.lang.Math.max(r8, r6)     // Catch: java.lang.Throwable -> L14d
        L26:
            q6.k r0 = r3.a(r4)     // Catch: java.lang.Throwable -> L14d
            q6.A r10 = a.AbstractC0597a.j(r0)     // Catch: java.lang.Throwable -> L14d
            int r0 = r10.e()     // Catch: java.lang.Throwable -> L1b4
            r11 = 101010256(0x6054b50, float:2.506985E-35)
            if (r0 != r11) goto L1bd
            short r0 = r10.n()     // Catch: java.lang.Throwable -> L1b4
            r8 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r8
            short r9 = r10.n()     // Catch: java.lang.Throwable -> L1b4
            r9 = r9 & r8
            short r11 = r10.n()     // Catch: java.lang.Throwable -> L1b4
            r11 = r11 & r8
            long r14 = (long) r11     // Catch: java.lang.Throwable -> L1b4
            short r11 = r10.n()     // Catch: java.lang.Throwable -> L1b4
            r11 = r11 & r8
            long r11 = (long) r11
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            java.lang.String r12 = "unsupported zip: spanned"
            if (r11 != 0) goto L1b6
            if (r0 != 0) goto L1b6
            if (r9 != 0) goto L1b6
            r18 = r6
            r6 = 4
            r10.skip(r6)     // Catch: java.lang.Throwable -> L1b4
            int r0 = r10.e()     // Catch: java.lang.Throwable -> L1b4
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L1b4
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r16 = r6 & r16
            short r0 = r10.n()     // Catch: java.lang.Throwable -> L1b4
            r13 = r0 & r8
            r0 = r12
            r6.d r12 = new r6.d     // Catch: java.lang.Throwable -> L1b4
            r12.<init>(r13, r14, r16)     // Catch: java.lang.Throwable -> L1b4
            long r6 = (long) r13     // Catch: java.lang.Throwable -> L1b4
            r10.v(r6)     // Catch: java.lang.Throwable -> L1b4
            r10.close()     // Catch: java.lang.Throwable -> L14d
            r6 = 20
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L14d
            long r4 = r4 - r6
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            r7 = 0
            if (r6 <= 0) goto L151
            q6.k r4 = r3.a(r4)     // Catch: java.lang.Throwable -> L14d
            q6.A r4 = a.AbstractC0597a.j(r4)     // Catch: java.lang.Throwable -> L14d
            int r5 = r4.e()     // Catch: java.lang.Throwable -> L130
            r6 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r5 != r6) goto L139
            int r5 = r4.e()     // Catch: java.lang.Throwable -> L130
            long r8 = r4.f()     // Catch: java.lang.Throwable -> L130
            int r6 = r4.e()     // Catch: java.lang.Throwable -> L130
            r10 = 1
            if (r6 != r10) goto L133
            if (r5 != 0) goto L133
            q6.k r5 = r3.a(r8)     // Catch: java.lang.Throwable -> L130
            q6.A r5 = a.AbstractC0597a.j(r5)     // Catch: java.lang.Throwable -> L130
            int r6 = r5.e()     // Catch: java.lang.Throwable -> L121
            r8 = 101075792(0x6064b50, float:2.525793E-35)
            if (r6 != r8) goto Lfa
            r8 = 12
            r5.skip(r8)     // Catch: java.lang.Throwable -> L121
            int r6 = r5.e()     // Catch: java.lang.Throwable -> L121
            int r8 = r5.e()     // Catch: java.lang.Throwable -> L121
            long r22 = r5.f()     // Catch: java.lang.Throwable -> L121
            long r9 = r5.f()     // Catch: java.lang.Throwable -> L121
            int r9 = (r22 > r9 ? 1 : (r22 == r9 ? 0 : -1))
            if (r9 != 0) goto Lf2
            if (r6 != 0) goto Lf2
            if (r8 != 0) goto Lf2
            r8 = 8
            r5.skip(r8)     // Catch: java.lang.Throwable -> L121
            long r24 = r5.f()     // Catch: java.lang.Throwable -> L121
            r6.d r20 = new r6.d     // Catch: java.lang.Throwable -> L121
            r21 = r13
            r20.<init>(r21, r22, r24)     // Catch: java.lang.Throwable -> L121
            r5.close()     // Catch: java.lang.Throwable -> Lee
            r0 = r7
            goto Lef
        Lee:
            r0 = move-exception
        Lef:
            r12 = r20
            goto L12c
        Lf2:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L121
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L121
            throw r6     // Catch: java.lang.Throwable -> L121
        Lf8:
            r6 = r0
            goto L123
        Lfa:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L121
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L121
            r9.<init>()     // Catch: java.lang.Throwable -> L121
            java.lang.String r10 = "bad zip: expected "
            r9.append(r10)     // Catch: java.lang.Throwable -> L121
            java.lang.String r8 = c(r8)     // Catch: java.lang.Throwable -> L121
            r9.append(r8)     // Catch: java.lang.Throwable -> L121
            java.lang.String r8 = " but was "
            r9.append(r8)     // Catch: java.lang.Throwable -> L121
            java.lang.String r6 = c(r6)     // Catch: java.lang.Throwable -> L121
            r9.append(r6)     // Catch: java.lang.Throwable -> L121
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L121
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L121
            throw r0     // Catch: java.lang.Throwable -> L121
        L121:
            r0 = move-exception
            goto Lf8
        L123:
            r5.close()     // Catch: java.lang.Throwable -> L127
            goto L12b
        L127:
            r0 = move-exception
            m5.AbstractC1362a.a(r6, r0)     // Catch: java.lang.Throwable -> L130
        L12b:
            r0 = r6
        L12c:
            if (r0 != 0) goto L12f
            goto L139
        L12f:
            throw r0     // Catch: java.lang.Throwable -> L130
        L130:
            r0 = move-exception
            r5 = r0
            goto L140
        L133:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L130
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L130
            throw r5     // Catch: java.lang.Throwable -> L130
        L139:
            r4.close()     // Catch: java.lang.Throwable -> L13e
            r0 = r7
            goto L149
        L13e:
            r0 = move-exception
            goto L149
        L140:
            r4.close()     // Catch: java.lang.Throwable -> L144
            goto L148
        L144:
            r0 = move-exception
            m5.AbstractC1362a.a(r5, r0)     // Catch: java.lang.Throwable -> L14d
        L148:
            r0 = r5
        L149:
            if (r0 != 0) goto L14c
            goto L151
        L14c:
            throw r0     // Catch: java.lang.Throwable -> L14d
        L14d:
            r0 = move-exception
            r1 = r0
            goto L1f1
        L151:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14d
            r4.<init>()     // Catch: java.lang.Throwable -> L14d
            long r5 = r12.f16375b     // Catch: java.lang.Throwable -> L14d
            q6.k r0 = r3.a(r5)     // Catch: java.lang.Throwable -> L14d
            q6.A r5 = a.AbstractC0597a.j(r0)     // Catch: java.lang.Throwable -> L14d
            long r8 = r12.f16374a     // Catch: java.lang.Throwable -> L184
        L162:
            int r0 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r0 >= 0) goto L194
            r6.h r0 = e(r5)     // Catch: java.lang.Throwable -> L184
            long r10 = r0.f16389h     // Catch: java.lang.Throwable -> L184
            long r13 = r12.f16375b     // Catch: java.lang.Throwable -> L184
            int r6 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r6 >= 0) goto L18c
            r6 = r28
            java.lang.Object r10 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L184
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L184
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L184
            if (r10 == 0) goto L187
            r4.add(r0)     // Catch: java.lang.Throwable -> L184
            goto L187
        L184:
            r0 = move-exception
            r6 = r0
            goto L19b
        L187:
            r10 = 1
            long r18 = r18 + r10
            goto L162
        L18c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L184
            java.lang.String r6 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L184
            throw r0     // Catch: java.lang.Throwable -> L184
        L194:
            r5.close()     // Catch: java.lang.Throwable -> L198
            goto L1a4
        L198:
            r0 = move-exception
            r7 = r0
            goto L1a4
        L19b:
            r5.close()     // Catch: java.lang.Throwable -> L19f
            goto L1a3
        L19f:
            r0 = move-exception
            m5.AbstractC1362a.a(r6, r0)     // Catch: java.lang.Throwable -> L14d
        L1a3:
            r7 = r6
        L1a4:
            if (r7 != 0) goto L1b3
            java.util.LinkedHashMap r0 = b(r4)     // Catch: java.lang.Throwable -> L14d
            q6.J r4 = new q6.J     // Catch: java.lang.Throwable -> L14d
            r4.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L14d
            r3.close()     // Catch: java.lang.Throwable -> L1b2
        L1b2:
            return r4
        L1b3:
            throw r7     // Catch: java.lang.Throwable -> L14d
        L1b4:
            r0 = move-exception
            goto L1d7
        L1b6:
            r0 = r12
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L1b4
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b4
            throw r1     // Catch: java.lang.Throwable -> L1b4
        L1bd:
            r18 = r6
            r6 = r28
            r10.close()     // Catch: java.lang.Throwable -> L14d
            r10 = -1
            long r4 = r4 + r10
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L1cf
            r6 = r18
            goto L26
        L1cf:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L14d
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14d
            throw r0     // Catch: java.lang.Throwable -> L14d
        L1d7:
            r10.close()     // Catch: java.lang.Throwable -> L14d
            throw r0     // Catch: java.lang.Throwable -> L14d
        L1db:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L14d
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L14d
            r2.append(r4)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L14d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L14d
            throw r1     // Catch: java.lang.Throwable -> L14d
        L1f1:
            if (r3 == 0) goto L1fb
            r3.close()     // Catch: java.lang.Throwable -> L1f7
            goto L1fb
        L1f7:
            r0 = move-exception
            m5.AbstractC1362a.a(r1, r0)
        L1fb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.d(q6.x, q6.l, B5.c):q6.J");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final h e(final q6.A a7) throws IOException {
        int iE = a7.e();
        if (iE != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iE));
        }
        a7.skip(4L);
        short sN = a7.n();
        int i = sN & 65535;
        if ((sN & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        int iN = a7.n() & 65535;
        int iN2 = a7.n() & 65535;
        int iN3 = a7.n() & 65535;
        long jE = ((long) a7.e()) & 4294967295L;
        final kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f14267q = ((long) a7.e()) & 4294967295L;
        final kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        xVar2.f14267q = ((long) a7.e()) & 4294967295L;
        int iN4 = a7.n() & 65535;
        int iN5 = a7.n() & 65535;
        int iN6 = 65535 & a7.n();
        a7.skip(8L);
        final kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
        xVar3.f14267q = ((long) a7.e()) & 4294967295L;
        String strV = a7.v(iN4);
        if (J5.m.J0(strV, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j = xVar2.f14267q == 4294967295L ? 8 : 0L;
        if (xVar.f14267q == 4294967295L) {
            j += (long) 8;
        }
        if (xVar3.f14267q == 4294967295L) {
            j += (long) 8;
        }
        final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        final kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
        final kotlin.jvm.internal.y yVar3 = new kotlin.jvm.internal.y();
        final u uVar = new u();
        f(a7, iN5, new B5.e() { // from class: r6.j
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.e
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                q6.A a8 = a7;
                if (iIntValue == 1) {
                    u uVar2 = uVar;
                    if (uVar2.f14264q) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    uVar2.f14264q = true;
                    if (jLongValue < j) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    kotlin.jvm.internal.x xVar4 = xVar2;
                    long jF = xVar4.f14267q;
                    if (jF == 4294967295L) {
                        jF = a8.f();
                    }
                    xVar4.f14267q = jF;
                    kotlin.jvm.internal.x xVar5 = xVar;
                    xVar5.f14267q = xVar5.f14267q == 4294967295L ? a8.f() : 0L;
                    kotlin.jvm.internal.x xVar6 = xVar3;
                    xVar6.f14267q = xVar6.f14267q == 4294967295L ? a8.f() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    a8.skip(4L);
                    b.f(a8, (int) (jLongValue - 4), new i(yVar, a8, yVar2, yVar3));
                }
                return C1386y.f15098a;
            }
        });
        if (j > 0 && !uVar.f14264q) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strV2 = a7.v(iN6);
        String str = x.f16093r;
        return new h(D.r("/").e(strV), t.A0(strV, "/", false), strV2, jE, xVar.f14267q, xVar2.f14267q, iN, xVar3.f14267q, iN3, iN2, (Long) yVar.f14268q, (Long) yVar2.f14268q, (Long) yVar3.f14268q, 57344);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(q6.A a7, int i, B5.e eVar) throws IOException {
        C1538g c1538g = a7.f16026r;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iN = a7.n() & 65535;
            long jN = ((long) a7.n()) & 65535;
            long j7 = j - ((long) 4);
            if (j7 < jN) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            a7.Q(jN);
            long j8 = c1538g.f16063r;
            eVar.invoke(Integer.valueOf(iN), Long.valueOf(jN));
            long j9 = (c1538g.f16063r + jN) - j8;
            if (j9 < 0) {
                throw new IOException(k1.i.i(iN, "unsupported zip: too many bytes processed for "));
            }
            if (j9 > 0) {
                c1538g.skip(j9);
            }
            j = j7 - jN;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final h g(q6.A a7, h hVar) throws IOException {
        int iE = a7.e();
        if (iE != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iE));
        }
        a7.skip(2L);
        short sN = a7.n();
        int i = sN & 65535;
        if ((sN & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        a7.skip(18L);
        long jN = ((long) a7.n()) & 65535;
        int iN = a7.n() & 65535;
        a7.skip(jN);
        if (hVar == null) {
            a7.skip(iN);
            return null;
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
        kotlin.jvm.internal.y yVar3 = new kotlin.jvm.internal.y();
        f(a7, iN, new i(a7, yVar, yVar2, yVar3));
        return new h(hVar.f16383a, hVar.f16384b, hVar.f16385c, hVar.f16386d, hVar.f16387e, hVar.f, hVar.f16388g, hVar.f16389h, hVar.i, hVar.j, hVar.f16390k, hVar.f16391l, hVar.f16392m, (Integer) yVar.f14268q, (Integer) yVar2.f14268q, (Integer) yVar3.f14268q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int h(q6.D d5, int i) {
        int i7;
        int[] iArr = d5.f16038v;
        int i8 = i + 1;
        int length = d5.f16037u.length;
        m.e(iArr, "<this>");
        int i9 = length - 1;
        int i10 = 0;
        while (true) {
            if (i10 <= i9) {
                i7 = (i10 + i9) >>> 1;
                int i11 = iArr[i7];
                if (i11 >= i8) {
                    if (i11 <= i8) {
                        break;
                    }
                    i9 = i7 - 1;
                } else {
                    i10 = i7 + 1;
                }
            } else {
                i7 = (-i10) - 1;
                break;
            }
        }
        return i7 >= 0 ? i7 : ~i7;
    }
}
