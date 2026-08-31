package P5;

import B0.C0050o;
import M5.AbstractC0238a;
import M5.AbstractC0263y;
import M5.EnumC0262x;
import M5.j0;
import Q5.AbstractC0423c;
import q5.C1530i;
import q5.InterfaceC1529h;
import u2.C1692m;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E4.f f6353a = new E4.f("NO_VALUE", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E4.f f6354b = new E4.f("NONE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E4.f f6355c = new E4.f("PENDING", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static G a(int i) {
        int i7 = (i & 1) != 0 ? 0 : 1;
        int i8 = (i & 2) == 0 ? 16 : 0;
        if (i7 < 0) {
            throw new IllegalArgumentException(k1.i.i(i7, "replay cannot be negative, but was ").toString());
        }
        if (i8 < 0) {
            throw new IllegalArgumentException(k1.i.i(i8, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i7 <= 0 && i8 <= 0) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + O5.a.f5207r).toString());
        }
        int i9 = i8 + i7;
        if (i9 < 0) {
            i9 = Integer.MAX_VALUE;
        }
        return new G(i7, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final S b(Object obj) {
        if (obj == null) {
            obj = AbstractC0423c.f6604b;
        }
        return new S(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(P5.U r4, c.C0708f r5, java.lang.Throwable r6, s5.c r7) {
        /*
            boolean r0 = r7 instanceof P5.C0401l
            if (r0 == 0) goto L13
            r0 = r7
            P5.l r0 = (P5.C0401l) r0
            int r1 = r0.f6412s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6412s = r1
            goto L18
        L13:
            P5.l r0 = new P5.l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6411r
            int r1 = r0.f6412s
            m5.y r2 = m5.C1386y.f15098a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            java.lang.Throwable r6 = r0.f6410q
            m5.AbstractC1362a.e(r7)     // Catch: java.lang.Throwable -> L29
            goto L42
        L29:
            r4 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            m5.AbstractC1362a.e(r7)
            r0.f6410q = r6     // Catch: java.lang.Throwable -> L29
            r0.f6412s = r3     // Catch: java.lang.Throwable -> L29
            r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r2 != r4) goto L42
            return r4
        L42:
            return r2
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            m5.AbstractC1362a.a(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.H.c(P5.U, c.f, java.lang.Throwable, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0397h e(InterfaceC0397h interfaceC0397h, int i) {
        O5.a aVar;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(k1.i.i(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            i = 0;
            aVar = O5.a.f5207r;
        } else {
            aVar = O5.a.f5206q;
        }
        int i7 = i;
        O5.a aVar2 = aVar;
        return interfaceC0397h instanceof Q5.v ? AbstractC0423c.a((Q5.v) interfaceC0397h, null, i7, aVar2, 1) : new Q5.j(interfaceC0397h, null, i7, aVar2, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable f(P5.InterfaceC0397h r4, P5.InterfaceC0398i r5, s5.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof P5.C0404o
            if (r0 == 0) goto L13
            r0 = r6
            P5.o r0 = (P5.C0404o) r0
            int r1 = r0.f6422s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6422s = r1
            goto L18
        L13:
            P5.o r0 = new P5.o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6421r
            int r1 = r0.f6422s
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.jvm.internal.y r4 = r0.f6420q
            m5.AbstractC1362a.e(r6)     // Catch: java.lang.Throwable -> L27
            goto L4b
        L27:
            r5 = move-exception
            goto L4f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            m5.AbstractC1362a.e(r6)
            kotlin.jvm.internal.y r6 = new kotlin.jvm.internal.y
            r6.<init>()
            P5.f r1 = new P5.f     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.f6420q = r6     // Catch: java.lang.Throwable -> L4d
            r0.f6422s = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.collect(r1, r0)     // Catch: java.lang.Throwable -> L4d
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r4 != r5) goto L4b
            return r5
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            java.lang.Object r4 = r4.f14268q
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7d
        L5b:
            q5.h r6 = r0.getContext()
            M5.t r0 = M5.C0258t.f3885r
            q5.f r6 = r6.get(r0)
            M5.b0 r6 = (M5.InterfaceC0241b0) r6
            if (r6 == 0) goto L7e
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r6 = r6.v()
            if (r6 == 0) goto L7e
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            throw r5
        L7e:
            if (r4 != 0) goto L81
            return r5
        L81:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L89
            m5.AbstractC1362a.a(r4, r5)
            throw r4
        L89:
            m5.AbstractC1362a.a(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.H.f(P5.h, P5.i, s5.c):java.io.Serializable");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0397h g(InterfaceC0397h interfaceC0397h) {
        if (interfaceC0397h instanceof P) {
            return interfaceC0397h;
        }
        if (!(interfaceC0397h instanceof C0396g)) {
            return new C0396g(interfaceC0397h);
        }
        ((C0396g) interfaceC0397h).getClass();
        return interfaceC0397h;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, CONST_STR, CONSTRUCTOR, INVOKE, INVOKE, IF, CHECK_CAST, IF, IF, INSTANCE_OF, THROW, IF, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r1.emit(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(P5.InterfaceC0398i r7, O5.v r8, boolean r9, q5.InterfaceC1524c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof P5.C0399j
            if (r0 == 0) goto L13
            r0 = r10
            P5.j r0 = (P5.C0399j) r0
            int r1 = r0.f6407v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6407v = r1
            goto L18
        L13:
            P5.j r0 = new P5.j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6406u
            int r1 = r0.f6407v
            r2 = 0
            r3 = 2
            r4 = 1
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L37
            boolean r9 = r0.f6405t
            O5.b r7 = r0.f6404s
            O5.v r8 = r0.f6403r
            P5.i r1 = r0.f6402q
            m5.AbstractC1362a.e(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f6405t
            O5.b r7 = r0.f6404s
            O5.v r8 = r0.f6403r
            P5.i r1 = r0.f6402q
            m5.AbstractC1362a.e(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            m5.AbstractC1362a.e(r10)
            boolean r10 = r7 instanceof P5.U
            if (r10 != 0) goto Lab
            O5.b r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f6402q = r7     // Catch: java.lang.Throwable -> L35
            r0.f6403r = r8     // Catch: java.lang.Throwable -> L35
            r0.f6404s = r10     // Catch: java.lang.Throwable -> L35
            r0.f6405t = r9     // Catch: java.lang.Throwable -> L35
            r0.f6407v = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L67
            goto L87
        L67:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f6402q = r1     // Catch: java.lang.Throwable -> L35
            r0.f6403r = r8     // Catch: java.lang.Throwable -> L35
            r0.f6404s = r7     // Catch: java.lang.Throwable -> L35
            r0.f6405t = r9     // Catch: java.lang.Throwable -> L35
            r0.f6407v = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L87:
            return r5
        L88:
            if (r9 == 0) goto L8d
            r8.a(r2)
        L8d:
            m5.y r7 = m5.C1386y.f15098a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L9b:
            if (r2 != 0) goto La7
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La7:
            r8.a(r2)
        Laa:
            throw r10
        Lab:
            P5.U r7 = (P5.U) r7
            java.lang.Throwable r7 = r7.f6381q
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.H.h(P5.i, O5.v, boolean, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(P5.InterfaceC0397h r5, B5.e r6, s5.c r7) {
        /*
            E4.f r0 = Q5.AbstractC0423c.f6604b
            boolean r1 = r7 instanceof P5.x
            if (r1 == 0) goto L15
            r1 = r7
            P5.x r1 = (P5.x) r1
            int r2 = r1.f6459t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f6459t = r2
            goto L1a
        L15:
            P5.x r1 = new P5.x
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f6458s
            int r2 = r1.f6459t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            L.e r5 = r1.f6457r
            kotlin.jvm.internal.y r6 = r1.f6456q
            m5.AbstractC1362a.e(r7)     // Catch: Q5.C0421a -> L2b
            goto L65
        L2b:
            r7 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            m5.AbstractC1362a.e(r7)
            kotlin.jvm.internal.y r7 = new kotlin.jvm.internal.y
            r7.<init>()
            r7.f14268q = r0
            L.e r2 = new L.e
            r4 = 2
            r2.<init>(r4, r6, r7)
            r1.f6456q = r7     // Catch: Q5.C0421a -> L56
            r1.f6457r = r2     // Catch: Q5.C0421a -> L56
            r1.f6459t = r3     // Catch: Q5.C0421a -> L56
            java.lang.Object r5 = r5.collect(r2, r1)     // Catch: Q5.C0421a -> L56
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r5 != r6) goto L54
            return r6
        L54:
            r6 = r7
            goto L65
        L56:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L5a:
            java.lang.Object r2 = r7.f6598q
            if (r2 != r5) goto L72
            q5.h r5 = r1.getContext()
            M5.AbstractC0263y.i(r5)
        L65:
            java.lang.Object r5 = r6.f14268q
            if (r5 == r0) goto L6a
            return r5
        L6a:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element matching the predicate"
            r5.<init>(r6)
            throw r5
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.H.i(P5.h, B5.e, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(P5.InterfaceC0397h r6, s5.c r7) {
        /*
            E4.f r0 = Q5.AbstractC0423c.f6604b
            boolean r1 = r7 instanceof P5.w
            if (r1 == 0) goto L15
            r1 = r7
            P5.w r1 = (P5.w) r1
            int r2 = r1.f6455t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f6455t = r2
            goto L1a
        L15:
            P5.w r1 = new P5.w
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f6454s
            int r2 = r1.f6455t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            C0.m1 r6 = r1.f6453r
            kotlin.jvm.internal.y r2 = r1.f6452q
            m5.AbstractC1362a.e(r7)     // Catch: Q5.C0421a -> L2b
            goto L63
        L2b:
            r7 = move-exception
            goto L58
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            m5.AbstractC1362a.e(r7)
            kotlin.jvm.internal.y r2 = new kotlin.jvm.internal.y
            r2.<init>()
            r2.f14268q = r0
            C0.m1 r7 = new C0.m1
            r4 = 1
            r7.<init>(r4, r2)
            r1.f6452q = r2     // Catch: Q5.C0421a -> L54
            r1.f6453r = r7     // Catch: Q5.C0421a -> L54
            r1.f6455t = r3     // Catch: Q5.C0421a -> L54
            java.lang.Object r6 = r6.collect(r7, r1)     // Catch: Q5.C0421a -> L54
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r6 != r7) goto L63
            return r7
        L54:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L58:
            java.lang.Object r3 = r7.f6598q
            if (r3 != r6) goto L70
            q5.h r6 = r1.getContext()
            M5.AbstractC0263y.i(r6)
        L63:
            java.lang.Object r6 = r2.f14268q
            if (r6 == r0) goto L68
            return r6
        L68:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L70:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.H.j(P5.h, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final D k(C1692m c1692m, R5.d dVar, O o6, Float f) {
        O5.i.f5248b.getClass();
        O5.h hVar = O5.h.f5246a;
        C0050o c0050o = new C0050o(c1692m, C1530i.f16022q);
        S sB = b(f);
        InterfaceC1529h interfaceC1529h = (InterfaceC1529h) c0050o.f500r;
        InterfaceC0397h interfaceC0397h = (InterfaceC0397h) c0050o.f499q;
        EnumC0262x enumC0262x = o6.equals(K.f6362a) ? EnumC0262x.f3895q : EnumC0262x.f3898t;
        A a7 = new A(o6, interfaceC0397h, sB, f, null);
        InterfaceC1529h interfaceC1529hU = AbstractC0263y.u(dVar, interfaceC1529h);
        AbstractC0238a j0Var = enumC0262x == EnumC0262x.f3896r ? new j0(interfaceC1529hU, a7) : new M5.B(interfaceC1529hU, true, 1 == true ? 1 : 0);
        j0Var.d0(enumC0262x, j0Var, a7);
        return new D(sB);
    }
}
