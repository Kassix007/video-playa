package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f11234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f11235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T0 f11236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f11238e;
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f11239g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            sun.misc.Unsafe r0 = g()
            com.google.android.gms.internal.vision.U0.f11234a = r0
            java.lang.Class r1 = com.google.android.gms.internal.vision.L.f11204a
            com.google.android.gms.internal.vision.U0.f11235b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r2 = k(r1)
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r4 = k(r3)
            r5 = 0
            if (r0 != 0) goto L1a
            goto L37
        L1a:
            boolean r6 = com.google.android.gms.internal.vision.L.a()
            if (r6 == 0) goto L32
            if (r2 == 0) goto L29
            com.google.android.gms.internal.vision.R0 r5 = new com.google.android.gms.internal.vision.R0
            r2 = 1
            r5.<init>(r0, r2)
            goto L37
        L29:
            if (r4 == 0) goto L37
            com.google.android.gms.internal.vision.R0 r5 = new com.google.android.gms.internal.vision.R0
            r2 = 0
            r5.<init>(r0, r2)
            goto L37
        L32:
            com.google.android.gms.internal.vision.S0 r5 = new com.google.android.gms.internal.vision.S0
            r5.<init>(r0)
        L37:
            com.google.android.gms.internal.vision.U0.f11236c = r5
            java.lang.String r2 = "copyMemory"
            java.lang.String r4 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r5 = "com.google.protobuf.UnsafeUtil"
            java.lang.Class<com.google.android.gms.internal.vision.U0> r6 = com.google.android.gms.internal.vision.U0.class
            java.lang.String r7 = "putLong"
            java.lang.String r8 = "putInt"
            java.lang.String r9 = "getInt"
            java.lang.Class r10 = java.lang.Byte.TYPE
            java.lang.String r11 = "putByte"
            java.lang.String r12 = "getByte"
            java.lang.Class<java.lang.reflect.Field> r13 = java.lang.reflect.Field.class
            java.lang.String r14 = "objectFieldOffset"
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
            r16 = r6
            java.lang.String r6 = "getLong"
            r17 = 0
            r18 = 1
            if (r0 != 0) goto L67
            r20 = r10
            r21 = r11
            r19 = r13
        L63:
            r0 = r17
            goto Lff
        L67:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lce
            r19 = r13
            java.lang.Class[] r13 = new java.lang.Class[]{r19}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r14, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class[] r13 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r6, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.reflect.Field r13 = m()     // Catch: java.lang.Throwable -> Lcc
            if (r13 != 0) goto L86
            r20 = r10
            r21 = r11
            goto L63
        L86:
            boolean r13 = com.google.android.gms.internal.vision.L.a()     // Catch: java.lang.Throwable -> Lcc
            if (r13 == 0) goto L93
        L8c:
            r20 = r10
            r21 = r11
            r0 = r18
            goto Lff
        L93:
            java.lang.Class[] r13 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r12, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class[] r13 = new java.lang.Class[]{r1, r10}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r11, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class[] r13 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r9, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class[] r13 = new java.lang.Class[]{r1, r3}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r8, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class[] r13 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r6, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class[] r13 = new java.lang.Class[]{r1, r1}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r7, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class[] r13 = new java.lang.Class[]{r1, r1, r1}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r2, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class[] r13 = new java.lang.Class[]{r15, r1, r15, r1, r1}     // Catch: java.lang.Throwable -> Lcc
            r0.getMethod(r2, r13)     // Catch: java.lang.Throwable -> Lcc
            goto L8c
        Lcc:
            r0 = move-exception
            goto Ld1
        Lce:
            r0 = move-exception
            r19 = r13
        Ld1:
            java.lang.String r2 = r16.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            java.util.logging.Level r13 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r20 = r0.length()
            r21 = r11
            int r11 = r20 + 71
            r20 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r11)
            r10.append(r4)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            java.lang.String r10 = "supportsUnsafeByteBufferOperations"
            r2.logp(r13, r5, r10, r0)
            goto L63
        Lff:
            com.google.android.gms.internal.vision.U0.f11237d = r0
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r2 = com.google.android.gms.internal.vision.U0.f11234a
            if (r2 != 0) goto L10b
        L107:
            r0 = r17
            goto L1da
        L10b:
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L1af
            java.lang.Class[] r10 = new java.lang.Class[]{r19}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r14, r10)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r10 = "arrayBaseOffset"
            java.lang.Class[] r11 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r10, r11)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r10 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r10, r0)     // Catch: java.lang.Throwable -> L1af
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r9, r0)     // Catch: java.lang.Throwable -> L1af
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r8, r0)     // Catch: java.lang.Throwable -> L1af
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r6, r0)     // Catch: java.lang.Throwable -> L1af
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1, r1}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r7, r0)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r0 = "getObject"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r0 = "putObject"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1, r15}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1af
            boolean r0 = com.google.android.gms.internal.vision.L.a()     // Catch: java.lang.Throwable -> L1af
            if (r0 == 0) goto L160
        L15c:
            r0 = r18
            goto L1da
        L160:
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r12, r0)     // Catch: java.lang.Throwable -> L1af
            r3 = r20
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1af
            r3 = r21
            r2.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r0 = "getBoolean"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r0 = "putBoolean"
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L1af
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r0 = "getFloat"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r0 = "putFloat"
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L1af
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r0 = "getDouble"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1af
            java.lang.String r0 = "putDouble"
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> L1af
            java.lang.Class[] r1 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1af
            r2.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L1af
            goto L15c
        L1af:
            r0 = move-exception
            java.lang.String r1 = r16.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 71
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "supportsUnsafeArrayOperations"
            r1.logp(r2, r5, r3, r0)
            goto L107
        L1da:
            com.google.android.gms.internal.vision.U0.f11238e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = f(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.vision.U0.f = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            f(r0)
            h(r0)
            java.lang.Class<int[]> r0 = int[].class
            f(r0)
            h(r0)
            java.lang.Class<long[]> r0 = long[].class
            f(r0)
            h(r0)
            java.lang.Class<float[]> r0 = float[].class
            f(r0)
            h(r0)
            java.lang.Class<double[]> r0 = double[].class
            f(r0)
            h(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            f(r0)
            h(r0)
            java.lang.reflect.Field r0 = m()
            if (r0 == 0) goto L225
            com.google.android.gms.internal.vision.T0 r1 = com.google.android.gms.internal.vision.U0.f11236c
            if (r1 != 0) goto L220
            goto L225
        L220:
            sun.misc.Unsafe r1 = r1.f11230a
            r1.objectFieldOffset(r0)
        L225:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L22f
            r17 = r18
        L22f:
            com.google.android.gms.internal.vision.U0.f11239g = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.U0.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte a(byte[] bArr, long j) {
        return f11236c.a(f + j, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object b(Class cls) {
        try {
            return f11234a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(int i, long j, Object obj) {
        f11236c.b(i, j, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(long j, Object obj, Object obj2) {
        f11236c.f11230a.putObject(obj, j, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(byte[] bArr, long j, byte b7) {
        f11236c.c(bArr, f + j, b7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(Class cls) {
        if (f11238e) {
            return f11236c.f11230a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new W0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(Class cls) {
        if (f11238e) {
            f11236c.f11230a.arrayIndexScale(cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(Object obj, long j, byte b7) {
        long j7 = (-4) & j;
        int iK = f11236c.k(j7, obj);
        int i = ((~((int) j)) & 3) << 3;
        c(((255 & b7) << i) | (iK & (~(255 << i))), j7, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(Object obj, long j, byte b7) {
        long j7 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        c(((255 & b7) << i) | (f11236c.k(j7, obj) & (~(255 << i))), j7, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean k(Class cls) {
        if (!L.a()) {
            return false;
        }
        try {
            Class cls2 = f11235b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object l(long j, Object obj) {
        return f11236c.f11230a.getObject(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Field m() {
        Field declaredField;
        Field declaredField2;
        if (L.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte n(long j, Object obj) {
        return (byte) (f11236c.k((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte o(long j, Object obj) {
        return (byte) (f11236c.k((-4) & j, obj) >>> ((int) ((j & 3) << 3)));
    }
}
