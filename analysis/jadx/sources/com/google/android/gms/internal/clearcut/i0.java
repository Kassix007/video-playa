package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f10509a = Logger.getLogger(i0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f10510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f10511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f10512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f10513e;
    public static final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f10514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f10515h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0024  */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.i0> r0 = com.google.android.gms.internal.clearcut.i0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.gms.internal.clearcut.i0.f10509a = r0
            sun.misc.Unsafe r0 = f()
            com.google.android.gms.internal.clearcut.i0.f10510b = r0
            java.lang.Class r1 = com.google.android.gms.internal.clearcut.AbstractC0750i.f10507a
            com.google.android.gms.internal.clearcut.i0.f10511c = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r2 = j(r1)
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r4 = j(r3)
            if (r0 != 0) goto L26
        L24:
            r2 = 0
            goto L43
        L26:
            boolean r6 = com.google.android.gms.internal.clearcut.AbstractC0750i.a()
            if (r6 == 0) goto L3e
            if (r2 == 0) goto L35
            com.google.android.gms.internal.clearcut.f0 r2 = new com.google.android.gms.internal.clearcut.f0
            r4 = 1
            r2.<init>(r0, r4)
            goto L43
        L35:
            if (r4 == 0) goto L24
            com.google.android.gms.internal.clearcut.f0 r2 = new com.google.android.gms.internal.clearcut.f0
            r4 = 0
            r2.<init>(r0, r4)
            goto L43
        L3e:
            com.google.android.gms.internal.clearcut.g0 r2 = new com.google.android.gms.internal.clearcut.g0
            r2.<init>(r0)
        L43:
            com.google.android.gms.internal.clearcut.i0.f10512d = r2
            java.lang.String r2 = "copyMemory"
            java.lang.String r4 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r6 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r7 = "putLong"
            java.lang.String r8 = "putInt"
            java.lang.String r9 = "getInt"
            java.lang.Class r10 = java.lang.Byte.TYPE
            java.lang.String r11 = "putByte"
            java.lang.String r12 = "getByte"
            java.lang.Class<java.lang.reflect.Field> r13 = java.lang.reflect.Field.class
            java.lang.String r14 = "objectFieldOffset"
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
            java.lang.String r5 = "getLong"
            r16 = 0
            r17 = r13
            if (r0 != 0) goto L6d
        L65:
            r18 = r10
            r19 = r11
        L69:
            r0 = r16
            goto Lf4
        L6d:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class[] r13 = new java.lang.Class[]{r17}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r14, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class[] r13 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r5, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.reflect.Field r13 = g()     // Catch: java.lang.Throwable -> Lcb
            if (r13 != 0) goto L86
            goto L65
        L86:
            boolean r13 = com.google.android.gms.internal.clearcut.AbstractC0750i.a()     // Catch: java.lang.Throwable -> Lcb
            if (r13 == 0) goto L92
        L8c:
            r18 = r10
            r19 = r11
            r0 = 1
            goto Lf4
        L92:
            java.lang.Class[] r13 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r12, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class[] r13 = new java.lang.Class[]{r1, r10}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r11, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class[] r13 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r9, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class[] r13 = new java.lang.Class[]{r1, r3}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r8, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class[] r13 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r5, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class[] r13 = new java.lang.Class[]{r1, r1}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r7, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class[] r13 = new java.lang.Class[]{r1, r1, r1}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r2, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class[] r13 = new java.lang.Class[]{r15, r1, r15, r1, r1}     // Catch: java.lang.Throwable -> Lcb
            r0.getMethod(r2, r13)     // Catch: java.lang.Throwable -> Lcb
            goto L8c
        Lcb:
            r0 = move-exception
            java.util.logging.Logger r2 = com.google.android.gms.internal.clearcut.i0.f10509a
            java.util.logging.Level r13 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r18 = r0.length()
            r19 = r11
            int r11 = r18 + 71
            r18 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r11)
            r10.append(r4)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            java.lang.String r10 = "supportsUnsafeByteBufferOperations"
            r2.logp(r13, r6, r10, r0)
            goto L69
        Lf4:
            com.google.android.gms.internal.clearcut.i0.f10513e = r0
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r2 = com.google.android.gms.internal.clearcut.i0.f10510b
            if (r2 != 0) goto L100
        Lfc:
            r0 = r16
            goto L1c7
        L100:
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L1a2
            java.lang.Class[] r10 = new java.lang.Class[]{r17}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r14, r10)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r10 = "arrayBaseOffset"
            java.lang.Class[] r11 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r10, r11)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r10 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r10, r0)     // Catch: java.lang.Throwable -> L1a2
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r9, r0)     // Catch: java.lang.Throwable -> L1a2
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r8, r0)     // Catch: java.lang.Throwable -> L1a2
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r5, r0)     // Catch: java.lang.Throwable -> L1a2
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1, r1}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r7, r0)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r0 = "getObject"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r0 = "putObject"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1, r15}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1a2
            boolean r0 = com.google.android.gms.internal.clearcut.AbstractC0750i.a()     // Catch: java.lang.Throwable -> L1a2
            if (r0 == 0) goto L153
        L151:
            r0 = 1
            goto L1c7
        L153:
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r12, r0)     // Catch: java.lang.Throwable -> L1a2
            r3 = r18
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1a2
            r3 = r19
            r2.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r0 = "getBoolean"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r0 = "putBoolean"
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L1a2
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r0 = "getFloat"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r0 = "putFloat"
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L1a2
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r0 = "getDouble"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r0 = "putDouble"
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> L1a2
            java.lang.Class[] r1 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L1a2
            r2.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L1a2
            goto L151
        L1a2:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.android.gms.internal.clearcut.i0.f10509a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 71
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r3 = "supportsUnsafeArrayOperations"
            r1.logp(r2, r6, r3, r0)
            goto Lfc
        L1c7:
            com.google.android.gms.internal.clearcut.i0.f = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = h(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.clearcut.i0.f10514g = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            h(r0)
            i(r0)
            java.lang.Class<int[]> r0 = int[].class
            h(r0)
            i(r0)
            java.lang.Class<long[]> r0 = long[].class
            h(r0)
            i(r0)
            java.lang.Class<float[]> r0 = float[].class
            h(r0)
            i(r0)
            java.lang.Class<double[]> r0 = double[].class
            h(r0)
            i(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            h(r0)
            i(r0)
            java.lang.reflect.Field r0 = g()
            if (r0 == 0) goto L210
            com.google.android.gms.internal.clearcut.h0 r1 = com.google.android.gms.internal.clearcut.i0.f10512d
            if (r1 != 0) goto L20d
            goto L210
        L20d:
            r1.a(r0)
        L210:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L21d
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L21e
            goto L21f
        L21d:
            r1 = 1
        L21e:
            r0 = 0
        L21f:
            if (r0 == 0) goto L22b
            java.lang.Class r2 = r0.getType()
            java.lang.Class<char[]> r3 = char[].class
            if (r2 != r3) goto L22b
            r5 = r0
            goto L22c
        L22b:
            r5 = 0
        L22c:
            if (r5 == 0) goto L236
            com.google.android.gms.internal.clearcut.h0 r0 = com.google.android.gms.internal.clearcut.i0.f10512d
            if (r0 != 0) goto L233
            goto L236
        L233:
            r0.a(r5)
        L236:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r2) goto L240
            r16 = r1
        L240:
            com.google.android.gms.internal.clearcut.i0.f10515h = r16
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.i0.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte a(byte[] bArr, long j) {
        return f10512d.l(f10514g + j, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(int i, long j, Object obj) {
        f10512d.b(i, j, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(long j, Object obj, Object obj2) {
        f10512d.f10506a.putObject(obj, j, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(Object obj, long j, byte b7) {
        long j7 = (-4) & j;
        int iG = f10512d.g(j7, obj);
        int i = ((~((int) j)) & 3) << 3;
        b(((255 & b7) << i) | (iG & (~(255 << i))), j7, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(Object obj, long j, byte b7) {
        long j7 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        b(((255 & b7) << i) | (f10512d.g(j7, obj) & (~(255 << i))), j7, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Unsafe f() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0750i.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                declaredField2.setAccessible(true);
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int h(Class cls) {
        if (f) {
            return f10512d.f10506a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(Class cls) {
        if (f) {
            f10512d.f10506a.arrayIndexScale(cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean j(Class cls) {
        if (!AbstractC0750i.a()) {
            return false;
        }
        try {
            Class cls2 = f10511c;
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
    public static Object k(long j, Object obj) {
        return f10512d.f10506a.getObject(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte l(long j, Object obj) {
        return (byte) (f10512d.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte m(long j, Object obj) {
        return (byte) (f10512d.g((-4) & j, obj) >>> ((int) ((j & 3) << 3)));
    }
}
