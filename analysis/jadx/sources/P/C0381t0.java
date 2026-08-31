package P;

import java.util.List;
import java.util.Set;
import r.C1549H;

/* JADX INFO: renamed from: P.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0381t0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0385v0 f5510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1549H f5511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1549H f5512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f5513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f5514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1549H f5515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f5516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1549H f5517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Set f5518y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381t0(C0385v0 c0385v0, C1549H c1549h, C1549H c1549h2, List list, List list2, C1549H c1549h3, List list3, C1549H c1549h4, Set set) {
        super(1);
        this.f5510q = c0385v0;
        this.f5511r = c1549h;
        this.f5512s = c1549h2;
        this.f5513t = list;
        this.f5514u = list2;
        this.f5515v = c1549h3;
        this.f5516w = list3;
        this.f5517x = c1549h4;
        this.f5518y = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d1 A[Catch: all -> 0x00d8, TryCatch #9 {all -> 0x00d8, blocks: (B:28:0x005d, B:29:0x0062, B:36:0x0081, B:37:0x0082, B:38:0x0088, B:40:0x0092, B:43:0x009d, B:54:0x00d4, B:64:0x00ee, B:85:0x014d, B:93:0x0164, B:115:0x01bd, B:122:0x01d1, B:123:0x01d3, B:125:0x01d7, B:126:0x01d8, B:128:0x01eb, B:129:0x01ec, B:118:0x01c7, B:120:0x01cd, B:121:0x01d0, B:88:0x0157, B:90:0x015c, B:91:0x015f, B:59:0x00e1, B:62:0x00ea, B:63:0x00ed, B:139:0x0214, B:141:0x021d, B:167:0x028e, B:181:0x02c6, B:143:0x0223, B:144:0x0225, B:166:0x028d, B:182:0x02ce, B:183:0x02cf, B:185:0x02d6, B:190:0x02df, B:191:0x02e2, B:192:0x02e3, B:193:0x02e4, B:95:0x016a, B:98:0x0174, B:100:0x0183, B:102:0x018f, B:104:0x0195, B:58:0x00db, B:130:0x01ed, B:132:0x01f7, B:134:0x0203, B:137:0x020e, B:124:0x01d4, B:117:0x01c1, B:145:0x0226, B:147:0x0234, B:149:0x0240, B:151:0x0246, B:154:0x0250, B:155:0x0253, B:157:0x025b, B:159:0x0267, B:161:0x026d, B:164:0x0280, B:163:0x0278, B:165:0x0283, B:67:0x00fb, B:70:0x010c, B:72:0x011c, B:74:0x0126, B:76:0x012c, B:30:0x0063, B:32:0x006c, B:35:0x007c, B:87:0x0151, B:45:0x00a6, B:47:0x00b0, B:50:0x00be, B:52:0x00c8, B:184:0x02d0, B:169:0x0294, B:170:0x0297, B:172:0x02a0, B:173:0x02ad, B:175:0x02b3, B:176:0x02bb), top: B:216:0x005d, inners: #1, #2, #4, #5, #6, #7, #8, #10, #11, #12, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0160  */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r27) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            P.v0 r0 = r1.f5510q
            java.lang.Object r4 = r0.f5555b
            monitor-enter(r4)
            boolean r0 = r0.v()     // Catch: java.lang.Throwable -> L2e9
            monitor-exit(r4)
            if (r0 == 0) goto L46
            java.lang.String r0 = "Recomposer:animation"
            P.v0 r5 = r1.f5510q
            android.os.Trace.beginSection(r0)
            P.e r0 = r5.f5554a     // Catch: java.lang.Throwable -> L41
            r0.d(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = a0.n.f8680b     // Catch: java.lang.Throwable -> L41
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L41
            a0.c r0 = a0.n.i     // Catch: java.lang.Throwable -> L3e
            r.H r0 = r0.f8653h     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L33
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L3e
            r3 = 1
            if (r0 != r3) goto L33
            goto L34
        L33:
            r3 = 0
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L3a
            a0.n.a()     // Catch: java.lang.Throwable -> L41
        L3a:
            android.os.Trace.endSection()
            goto L46
        L3e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L46:
            java.lang.String r0 = "Recomposer:recompose"
            P.v0 r5 = r1.f5510q
            r.H r11 = r1.f5511r
            r.H r12 = r1.f5512s
            java.util.List r6 = r1.f5513t
            java.util.List r7 = r1.f5514u
            r.H r9 = r1.f5515v
            java.util.List r8 = r1.f5516w
            r.H r10 = r1.f5517x
            java.util.Set r2 = r1.f5518y
            android.os.Trace.beginSection(r0)
            P.C0385v0.r(r5)     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r3 = r5.f5555b     // Catch: java.lang.Throwable -> Ld8
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Ld8
            R.e r0 = r5.f5560h     // Catch: java.lang.Throwable -> L79
            java.lang.Object[] r13 = r0.f6676q     // Catch: java.lang.Throwable -> L79
            int r0 = r0.f6678s     // Catch: java.lang.Throwable -> L79
            r14 = 0
        L6a:
            if (r14 >= r0) goto L7c
            r15 = r13[r14]     // Catch: java.lang.Throwable -> L79
            P.u r15 = (P.C0382u) r15     // Catch: java.lang.Throwable -> L79
            r4 = r6
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L79
            r4.add(r15)     // Catch: java.lang.Throwable -> L79
            int r14 = r14 + 1
            goto L6a
        L79:
            r0 = move-exception
            goto L2e3
        L7c:
            R.e r0 = r5.f5560h     // Catch: java.lang.Throwable -> L79
            r0.i()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld8
            r11.b()     // Catch: java.lang.Throwable -> Ld8
            r12.b()     // Catch: java.lang.Throwable -> Ld8
        L88:
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld8
            r3 = 0
            if (r0 == 0) goto L1ed
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto L9d
            goto L1ed
        L9d:
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto Lee
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> Lbc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lbc
            r2 = 0
        Lae:
            if (r2 >= r0) goto Lbe
            java.lang.Object r4 = r8.get(r2)     // Catch: java.lang.Throwable -> Lbc
            P.u r4 = (P.C0382u) r4     // Catch: java.lang.Throwable -> Lbc
            r10.a(r4)     // Catch: java.lang.Throwable -> Lbc
            int r2 = r2 + 1
            goto Lae
        Lbc:
            r0 = move-exception
            goto Ldb
        Lbe:
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> Lbc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lbc
            r2 = 0
        Lc6:
            if (r2 >= r0) goto Ld4
            java.lang.Object r4 = r8.get(r2)     // Catch: java.lang.Throwable -> Lbc
            P.u r4 = (P.C0382u) r4     // Catch: java.lang.Throwable -> Lbc
            r4.d()     // Catch: java.lang.Throwable -> Lbc
            int r2 = r2 + 1
            goto Lc6
        Ld4:
            r8.clear()     // Catch: java.lang.Throwable -> Ld8
            goto Lee
        Ld8:
            r0 = move-exception
            goto L2e5
        Ldb:
            r5.A(r0, r3)     // Catch: java.lang.Throwable -> Le9
            P.C0383u0.a(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Le9
            r8.clear()     // Catch: java.lang.Throwable -> Ld8
        Le4:
            android.os.Trace.endSection()
            goto L2db
        Le9:
            r0 = move-exception
            r8.clear()     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        Lee:
            boolean r0 = r9.h()     // Catch: java.lang.Throwable -> Ld8
            r15 = 255(0xff, double:1.26E-321)
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r0 == 0) goto L160
            r10.k(r9)     // Catch: java.lang.Throwable -> L138
            java.lang.Object[] r0 = r9.f16139b     // Catch: java.lang.Throwable -> L138
            r19 = 7
            long[] r2 = r9.f16138a     // Catch: java.lang.Throwable -> L138
            r20 = 128(0x80, double:6.32E-322)
            int r13 = r2.length     // Catch: java.lang.Throwable -> L138
            int r13 = r13 + (-2)
            if (r13 < 0) goto L14d
            r14 = 0
        L10c:
            r22 = 8
            r3 = r2[r14]     // Catch: java.lang.Throwable -> L138
            r23 = r0
            long r0 = ~r3     // Catch: java.lang.Throwable -> L138
            long r0 = r0 << r19
            long r0 = r0 & r3
            long r0 = r0 & r17
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 == 0) goto L144
            int r0 = r14 - r13
            int r0 = ~r0     // Catch: java.lang.Throwable -> L138
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r1 = 0
        L124:
            if (r1 >= r0) goto L140
            long r24 = r3 & r15
            int r24 = (r24 > r20 ? 1 : (r24 == r20 ? 0 : -1))
            if (r24 >= 0) goto L13b
            int r24 = r14 << 3
            int r24 = r24 + r1
            r24 = r23[r24]     // Catch: java.lang.Throwable -> L138
            P.u r24 = (P.C0382u) r24     // Catch: java.lang.Throwable -> L138
            r24.f()     // Catch: java.lang.Throwable -> L138
            goto L13b
        L138:
            r0 = move-exception
            r1 = 0
            goto L151
        L13b:
            long r3 = r3 >> r22
            int r1 = r1 + 1
            goto L124
        L140:
            r1 = r22
            if (r0 != r1) goto L14d
        L144:
            if (r14 == r13) goto L14d
            int r14 = r14 + 1
            r1 = r26
            r0 = r23
            goto L10c
        L14d:
            r9.b()     // Catch: java.lang.Throwable -> Ld8
            goto L164
        L151:
            r5.A(r0, r1)     // Catch: java.lang.Throwable -> L15b
            P.C0383u0.a(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L15b
            r9.b()     // Catch: java.lang.Throwable -> Ld8
            goto Le4
        L15b:
            r0 = move-exception
            r9.b()     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        L160:
            r19 = 7
            r20 = 128(0x80, double:6.32E-322)
        L164:
            boolean r0 = r10.h()     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L1d1
            java.lang.Object[] r0 = r10.f16139b     // Catch: java.lang.Throwable -> L1a3
            long[] r1 = r10.f16138a     // Catch: java.lang.Throwable -> L1a3
            int r2 = r1.length     // Catch: java.lang.Throwable -> L1a3
            int r2 = r2 + (-2)
            if (r2 < 0) goto L1bd
            r3 = 0
        L174:
            r13 = r1[r3]     // Catch: java.lang.Throwable -> L1a3
            r4 = r0
            r23 = r1
            long r0 = ~r13     // Catch: java.lang.Throwable -> L1a3
            long r0 = r0 << r19
            long r0 = r0 & r13
            long r0 = r0 & r17
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 == 0) goto L1b1
            int r0 = r3 - r2
            int r0 = ~r0     // Catch: java.lang.Throwable -> L1a3
            int r0 = r0 >>> 31
            r22 = 8
            int r0 = 8 - r0
            r1 = 0
        L18d:
            if (r1 >= r0) goto L1ac
            long r24 = r13 & r15
            int r24 = (r24 > r20 ? 1 : (r24 == r20 ? 0 : -1))
            if (r24 >= 0) goto L1a0
            int r24 = r3 << 3
            int r24 = r24 + r1
            r24 = r4[r24]     // Catch: java.lang.Throwable -> L1a3
            P.u r24 = (P.C0382u) r24     // Catch: java.lang.Throwable -> L1a3
            r24.g()     // Catch: java.lang.Throwable -> L1a3
        L1a0:
            r15 = 8
            goto L1a6
        L1a3:
            r0 = move-exception
            r1 = 0
            goto L1c1
        L1a6:
            long r13 = r13 >> r15
            int r1 = r1 + 1
            r15 = 255(0xff, double:1.26E-321)
            goto L18d
        L1ac:
            r15 = 8
            if (r0 != r15) goto L1bd
            goto L1b3
        L1b1:
            r15 = 8
        L1b3:
            if (r3 == r2) goto L1bd
            int r3 = r3 + 1
            r0 = r4
            r1 = r23
            r15 = 255(0xff, double:1.26E-321)
            goto L174
        L1bd:
            r10.b()     // Catch: java.lang.Throwable -> Ld8
            goto L1d1
        L1c1:
            r5.A(r0, r1)     // Catch: java.lang.Throwable -> L1cc
            P.C0383u0.a(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1cc
            r10.b()     // Catch: java.lang.Throwable -> Ld8
            goto Le4
        L1cc:
            r0 = move-exception
            r10.b()     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        L1d1:
            java.lang.Object r1 = r5.f5555b     // Catch: java.lang.Throwable -> Ld8
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Ld8
            r5.u()     // Catch: java.lang.Throwable -> L1ea
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld8
            a0.h r0 = a0.n.k()     // Catch: java.lang.Throwable -> Ld8
            r0.m()     // Catch: java.lang.Throwable -> Ld8
            r12.b()     // Catch: java.lang.Throwable -> Ld8
            r11.b()     // Catch: java.lang.Throwable -> Ld8
            r1 = 0
            r5.f5566p = r1     // Catch: java.lang.Throwable -> Ld8
            goto Le4
        L1ea:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        L1ed:
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L20a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L20a
            r1 = 0
        L1f5:
            if (r1 >= r0) goto L214
            java.lang.Object r3 = r6.get(r1)     // Catch: java.lang.Throwable -> L20a
            P.u r3 = (P.C0382u) r3     // Catch: java.lang.Throwable -> L20a
            P.u r4 = P.C0385v0.q(r5, r3, r11)     // Catch: java.lang.Throwable -> L20a
            if (r4 == 0) goto L20e
            r13 = r8
            java.util.Collection r13 = (java.util.Collection) r13     // Catch: java.lang.Throwable -> L20a
            r13.add(r4)     // Catch: java.lang.Throwable -> L20a
            goto L20e
        L20a:
            r0 = move-exception
            r1 = 0
            goto L2d0
        L20e:
            r12.a(r3)     // Catch: java.lang.Throwable -> L20a
            int r1 = r1 + 1
            goto L1f5
        L214:
            r6.clear()     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r11.h()     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto L223
            R.e r0 = r5.f5560h     // Catch: java.lang.Throwable -> Ld8
            int r0 = r0.f6678s     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L28e
        L223:
            java.lang.Object r1 = r5.f5555b     // Catch: java.lang.Throwable -> Ld8
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Ld8
            java.util.List r0 = r5.x()     // Catch: java.lang.Throwable -> L24d
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L24d
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L24d
            r4 = 0
        L232:
            if (r4 >= r3) goto L253
            java.lang.Object r13 = r0.get(r4)     // Catch: java.lang.Throwable -> L24d
            P.u r13 = (P.C0382u) r13     // Catch: java.lang.Throwable -> L24d
            boolean r14 = r12.c(r13)     // Catch: java.lang.Throwable -> L24d
            if (r14 != 0) goto L250
            boolean r14 = r13.u(r2)     // Catch: java.lang.Throwable -> L24d
            if (r14 == 0) goto L250
            r14 = r6
            java.util.Collection r14 = (java.util.Collection) r14     // Catch: java.lang.Throwable -> L24d
            r14.add(r13)     // Catch: java.lang.Throwable -> L24d
            goto L250
        L24d:
            r0 = move-exception
            goto L2ce
        L250:
            int r4 = r4 + 1
            goto L232
        L253:
            R.e r0 = r5.f5560h     // Catch: java.lang.Throwable -> L24d
            int r3 = r0.f6678s     // Catch: java.lang.Throwable -> L24d
            r4 = 0
            r13 = 0
        L259:
            if (r4 >= r3) goto L283
            java.lang.Object[] r14 = r0.f6676q     // Catch: java.lang.Throwable -> L24d
            r14 = r14[r4]     // Catch: java.lang.Throwable -> L24d
            P.u r14 = (P.C0382u) r14     // Catch: java.lang.Throwable -> L24d
            boolean r15 = r12.c(r14)     // Catch: java.lang.Throwable -> L24d
            if (r15 != 0) goto L276
            boolean r15 = r6.contains(r14)     // Catch: java.lang.Throwable -> L24d
            if (r15 != 0) goto L276
            r15 = r6
            java.util.Collection r15 = (java.util.Collection) r15     // Catch: java.lang.Throwable -> L24d
            r15.add(r14)     // Catch: java.lang.Throwable -> L24d
            int r13 = r13 + 1
            goto L280
        L276:
            if (r13 <= 0) goto L280
            java.lang.Object[] r14 = r0.f6676q     // Catch: java.lang.Throwable -> L24d
            int r15 = r4 - r13
            r16 = r14[r4]     // Catch: java.lang.Throwable -> L24d
            r14[r15] = r16     // Catch: java.lang.Throwable -> L24d
        L280:
            int r4 = r4 + 1
            goto L259
        L283:
            java.lang.Object[] r4 = r0.f6676q     // Catch: java.lang.Throwable -> L24d
            int r13 = r3 - r13
            r14 = 0
            java.util.Arrays.fill(r4, r13, r3, r14)     // Catch: java.lang.Throwable -> L24d
            r0.f6678s = r13     // Catch: java.lang.Throwable -> L24d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld8
        L28e:
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L2c2
            P.C0383u0.b(r7, r5)     // Catch: java.lang.Throwable -> L2bf
        L297:
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L2bf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2bf
            if (r0 != 0) goto L2c2
            java.util.List r0 = r5.z(r7, r11)     // Catch: java.lang.Throwable -> L2bf
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L2bf
            r9.getClass()     // Catch: java.lang.Throwable -> L2bf
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2bf
        L2ad:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2bf
            if (r1 == 0) goto L2bb
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2bf
            r9.j(r1)     // Catch: java.lang.Throwable -> L2bf
            goto L2ad
        L2bb:
            P.C0383u0.b(r7, r5)     // Catch: java.lang.Throwable -> L2bf
            goto L297
        L2bf:
            r0 = move-exception
            r1 = 0
            goto L2c6
        L2c2:
            r1 = r26
            goto L88
        L2c6:
            r5.A(r0, r1)     // Catch: java.lang.Throwable -> Ld8
            P.C0383u0.a(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Ld8
            goto Le4
        L2ce:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        L2d0:
            r5.A(r0, r1)     // Catch: java.lang.Throwable -> L2de
            P.C0383u0.a(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L2de
            r6.clear()     // Catch: java.lang.Throwable -> Ld8
            goto Le4
        L2db:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L2de:
            r0 = move-exception
            r6.clear()     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        L2e3:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        L2e5:
            android.os.Trace.endSection()
            throw r0
        L2e9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0381t0.invoke(java.lang.Object):java.lang.Object");
    }
}
