package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0787d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f10821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f10822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC0782c3 f10823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f10824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f10825e;
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f10826g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = l()
            com.google.android.gms.internal.measurement.AbstractC0787d3.f10821a = r1
            int r2 = com.google.android.gms.internal.measurement.AbstractC0770a2.f10790a
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            com.google.android.gms.internal.measurement.AbstractC0787d3.f10822b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = m(r2)
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r5 = m(r4)
            r6 = 0
            if (r1 != 0) goto L1e
            goto L2d
        L1e:
            if (r3 == 0) goto L26
            com.google.android.gms.internal.measurement.b3 r6 = new com.google.android.gms.internal.measurement.b3
            r6.<init>(r1)
            goto L2d
        L26:
            if (r5 == 0) goto L2d
            com.google.android.gms.internal.measurement.a3 r6 = new com.google.android.gms.internal.measurement.a3
            r6.<init>(r1)
        L2d:
            com.google.android.gms.internal.measurement.AbstractC0787d3.f10823c = r6
            java.lang.String r1 = "logMissingMethod"
            java.lang.String r3 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r5 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.Class<com.google.android.gms.internal.measurement.d3> r7 = com.google.android.gms.internal.measurement.AbstractC0787d3.class
            java.lang.String r8 = "getLong"
            java.lang.Class<java.lang.reflect.Field> r9 = java.lang.reflect.Field.class
            java.lang.String r10 = "objectFieldOffset"
            r11 = 1
            r12 = 0
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            if (r6 != 0) goto L45
        L43:
            r6 = r12
            goto L79
        L45:
            sun.misc.Unsafe r6 = r6.f10816a
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.Class[] r14 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L62
            r6.getMethod(r10, r14)     // Catch: java.lang.Throwable -> L62
            java.lang.Class[] r14 = new java.lang.Class[]{r13, r2}     // Catch: java.lang.Throwable -> L62
            r6.getMethod(r8, r14)     // Catch: java.lang.Throwable -> L62
            java.lang.reflect.Field r6 = b()     // Catch: java.lang.Throwable -> L62
            if (r6 != 0) goto L60
            goto L43
        L60:
            r6 = r11
            goto L79
        L62:
            r6 = move-exception
            java.lang.String r14 = r7.getName()
            java.util.logging.Logger r14 = java.util.logging.Logger.getLogger(r14)
            java.util.logging.Level r15 = java.util.logging.Level.WARNING
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.concat(r6)
            r14.logp(r15, r3, r1, r6)
            goto L43
        L79:
            com.google.android.gms.internal.measurement.AbstractC0787d3.f10824d = r6
            com.google.android.gms.internal.measurement.c3 r6 = com.google.android.gms.internal.measurement.AbstractC0787d3.f10823c
            if (r6 != 0) goto L81
        L7f:
            r0 = r12
            goto Led
        L81:
            sun.misc.Unsafe r6 = r6.f10816a
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> Ld6
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> Ld6
            r6.getMethod(r10, r9)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r9 = "arrayBaseOffset"
            java.lang.Class[] r10 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> Ld6
            r6.getMethod(r9, r10)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r9 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> Ld6
            r6.getMethod(r9, r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "getInt"
            java.lang.Class[] r9 = new java.lang.Class[]{r13, r2}     // Catch: java.lang.Throwable -> Ld6
            r6.getMethod(r0, r9)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "putInt"
            java.lang.Class[] r4 = new java.lang.Class[]{r13, r2, r4}     // Catch: java.lang.Throwable -> Ld6
            r6.getMethod(r0, r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Class[] r0 = new java.lang.Class[]{r13, r2}     // Catch: java.lang.Throwable -> Ld6
            r6.getMethod(r8, r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "putLong"
            java.lang.Class[] r4 = new java.lang.Class[]{r13, r2, r2}     // Catch: java.lang.Throwable -> Ld6
            r6.getMethod(r0, r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "getObject"
            java.lang.Class[] r4 = new java.lang.Class[]{r13, r2}     // Catch: java.lang.Throwable -> Ld6
            r6.getMethod(r0, r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "putObject"
            java.lang.Class[] r2 = new java.lang.Class[]{r13, r2, r13}     // Catch: java.lang.Throwable -> Ld6
            r6.getMethod(r0, r2)     // Catch: java.lang.Throwable -> Ld6
            r0 = r11
            goto Led
        Ld6:
            r0 = move-exception
            java.lang.String r2 = r7.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r5.concat(r0)
            r2.logp(r4, r3, r1, r0)
            goto L7f
        Led:
            com.google.android.gms.internal.measurement.AbstractC0787d3.f10825e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = p(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.measurement.AbstractC0787d3.f = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            p(r0)
            a(r0)
            java.lang.Class<int[]> r0 = int[].class
            p(r0)
            a(r0)
            java.lang.Class<long[]> r0 = long[].class
            p(r0)
            a(r0)
            java.lang.Class<float[]> r0 = float[].class
            p(r0)
            a(r0)
            java.lang.Class<double[]> r0 = double[].class
            p(r0)
            a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            p(r0)
            a(r0)
            java.lang.reflect.Field r0 = b()
            if (r0 == 0) goto L137
            com.google.android.gms.internal.measurement.c3 r1 = com.google.android.gms.internal.measurement.AbstractC0787d3.f10823c
            if (r1 == 0) goto L137
            sun.misc.Unsafe r1 = r1.f10816a
            r1.objectFieldOffset(r0)
        L137:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L140
            goto L141
        L140:
            r11 = r12
        L141:
            com.google.android.gms.internal.measurement.AbstractC0787d3.f10826g = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0787d3.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Class cls) {
        if (f10825e) {
            f10823c.f10816a.arrayIndexScale(cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i = AbstractC0770a2.f10790a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(Object obj, long j, byte b7) {
        Unsafe unsafe = f10823c.f10816a;
        long j7 = (-4) & j;
        int i = unsafe.getInt(obj, j7);
        int i7 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j7, ((255 & b7) << i7) | (i & (~(255 << i7))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(Object obj, long j, byte b7) {
        Unsafe unsafe = f10823c.f10816a;
        long j7 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j7, ((255 & b7) << i) | (unsafe.getInt(obj, j7) & (~(255 << i))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object e(Class cls) {
        try {
            return f10821a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(long j, Object obj) {
        return f10823c.f10816a.getInt(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(int i, long j, Object obj) {
        f10823c.f10816a.putInt(obj, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long h(long j, Object obj) {
        return f10823c.f10816a.getLong(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(Object obj, long j, long j7) {
        f10823c.f10816a.putLong(obj, j, j7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object j(long j, Object obj) {
        return f10823c.f10816a.getObject(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(long j, Object obj, Object obj2) {
        f10823c.f10816a.putObject(obj, j, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Z2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean m(Class cls) {
        int i = AbstractC0770a2.f10790a;
        try {
            Class cls2 = f10822b;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap:byte:0x0016: CAST (byte) (wrap:int:0x0014: ARITH (wrap:int:0x0012: ARITH (wrap:int:0x0007: INVOKE 
  (wrap:sun.misc.Unsafe:0x0002: IGET 
  (wrap:com.google.android.gms.internal.measurement.c3:0x0000: SGET  A[WRAPPED] (LINE:1) com.google.android.gms.internal.measurement.d3.c com.google.android.gms.internal.measurement.c3)
 A[WRAPPED] (LINE:3) com.google.android.gms.internal.measurement.c3.a sun.misc.Unsafe)
  (r5v0 java.lang.Object)
  (wrap:long:0x0006: ARITH (-4 long) & (r3v0 long) A[WRAPPED] (LINE:7))
 VIRTUAL call: sun.misc.Unsafe.getInt(java.lang.Object, long):int A[WRAPPED] (LINE:8)) >>> (wrap:int:0x0011: CAST (int) (wrap:long:0x0010: ARITH (wrap:long:0x000e: ARITH (wrap:long:0x000b: NOT (r3v0 long) A[WRAPPED] (LINE:12)) & (3 long) A[WRAPPED] (LINE:15)) << (3 long) A[WRAPPED] (LINE:17))) A[WRAPPED] (LINE:19)) & (255 int) A[WRAPPED] (LINE:21))) != (0 byte)) ? true : false */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ boolean n(long j, Object obj) {
        return ((byte) ((f10823c.f10816a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap:byte:0x0015: CAST (byte) (wrap:int:0x0013: ARITH (wrap:int:0x0011: ARITH (wrap:int:0x0007: INVOKE 
  (wrap:sun.misc.Unsafe:0x0002: IGET 
  (wrap:com.google.android.gms.internal.measurement.c3:0x0000: SGET  A[WRAPPED] (LINE:1) com.google.android.gms.internal.measurement.d3.c com.google.android.gms.internal.measurement.c3)
 A[WRAPPED] (LINE:3) com.google.android.gms.internal.measurement.c3.a sun.misc.Unsafe)
  (r5v0 java.lang.Object)
  (wrap:long:0x0006: ARITH (-4 long) & (r3v0 long) A[WRAPPED] (LINE:7))
 VIRTUAL call: sun.misc.Unsafe.getInt(java.lang.Object, long):int A[WRAPPED] (LINE:8)) >>> (wrap:int:0x0010: CAST (int) (wrap:long:0x000f: ARITH (wrap:long:0x000d: ARITH (r3v0 long) & (3 long) A[WRAPPED] (LINE:14)) << (3 long) A[WRAPPED] (LINE:16))) A[WRAPPED] (LINE:18)) & (255 int) A[WRAPPED] (LINE:20))) != (0 byte)) ? true : false */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ boolean o(long j, Object obj) {
        return ((byte) ((f10823c.f10816a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int p(Class cls) {
        if (f10825e) {
            return f10823c.f10816a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
