package com.google.android.gms.internal.clearcut;

import android.os.UserManager;
import androidx.work.impl.Scheduler;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile UserManager f10525b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f10526c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f10527d = {1, 2, 3, 4, 5, 6, 7};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f10528e = new int[0];
    public static final byte[] f = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10529a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(int i, byte[] bArr, int i7, int i8, C0751j c0751j) throws B {
        if ((i >>> 3) == 0) {
            throw new B("Protocol message contained an invalid tag (zero).");
        }
        int i9 = i & 7;
        if (i9 == 0) {
            return m(bArr, i7, c0751j);
        }
        if (i9 == 1) {
            return i7 + 8;
        }
        if (i9 == 2) {
            return f(bArr, i7, c0751j) + c0751j.f10516a;
        }
        if (i9 != 3) {
            if (i9 == 5) {
                return i7 + 4;
            }
            throw new B("Protocol message contained an invalid tag (zero).");
        }
        int i10 = (i & (-8)) | 4;
        int i11 = 0;
        while (i7 < i8) {
            i7 = f(bArr, i7, c0751j);
            i11 = c0751j.f10516a;
            if (i11 == i10) {
                break;
            }
            i7 = b(i11, bArr, i7, i8, c0751j);
        }
        if (i7 > i8 || i11 != i10) {
            throw B.b();
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c(int i, byte[] bArr, int i7, int i8, C0739b0 c0739b0, C0751j c0751j) throws B {
        if ((i >>> 3) == 0) {
            throw new B("Protocol message contained an invalid tag (zero).");
        }
        int i9 = i & 7;
        if (i9 == 0) {
            int iM = m(bArr, i7, c0751j);
            c0739b0.a(i, Long.valueOf(c0751j.f10517b));
            return iM;
        }
        if (i9 == 1) {
            c0739b0.a(i, Long.valueOf(r(i7, bArr)));
            return i7 + 8;
        }
        if (i9 == 2) {
            int iF = f(bArr, i7, c0751j);
            int i10 = c0751j.f10516a;
            c0739b0.a(i, i10 == 0 ? C0754m.f10530s : C0754m.g(bArr, iF, i10));
            return iF + i10;
        }
        if (i9 != 3) {
            if (i9 != 5) {
                throw new B("Protocol message contained an invalid tag (zero).");
            }
            c0739b0.a(i, Integer.valueOf(o(i7, bArr)));
            return i7 + 4;
        }
        C0739b0 c0739b0B = C0739b0.b();
        int i11 = (i & (-8)) | 4;
        int i12 = 0;
        while (true) {
            if (i7 >= i8) {
                break;
            }
            int iF2 = f(bArr, i7, c0751j);
            int i13 = c0751j.f10516a;
            if (i13 == i11) {
                i12 = i13;
                i7 = iF2;
                break;
            }
            i7 = c(i13, bArr, iF2, i8, c0739b0B, c0751j);
            i12 = i13;
        }
        if (i7 > i8 || i12 != i11) {
            throw B.b();
        }
        c0739b0.a(i, c0739b0B);
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(int i, byte[] bArr, int i7, C0751j c0751j) {
        int i8;
        int i9 = i & 127;
        int i10 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 >= 0) {
            i8 = b7 << 7;
        } else {
            int i11 = i9 | ((b7 & 127) << 7);
            int i12 = i7 + 2;
            byte b8 = bArr[i10];
            if (b8 >= 0) {
                c0751j.f10516a = i11 | (b8 << 14);
                return i12;
            }
            i9 = i11 | ((b8 & 127) << 14);
            i10 = i7 + 3;
            byte b9 = bArr[i12];
            if (b9 >= 0) {
                i8 = b9 << 21;
            } else {
                int i13 = i9 | ((b9 & 127) << 21);
                int i14 = i7 + 4;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    c0751j.f10516a = i13 | (b10 << 28);
                    return i14;
                }
                int i15 = i13 | ((b10 & 127) << 28);
                while (true) {
                    int i16 = i14 + 1;
                    if (bArr[i14] >= 0) {
                        c0751j.f10516a = i15;
                        return i16;
                    }
                    i14 = i16;
                }
            }
        }
        c0751j.f10516a = i9 | i8;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int e(long j, byte[] bArr, int i, int i7) {
        if (i7 == 0) {
            l0 l0Var = k0.f10523a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i7 == 1) {
            byte bA = i0.a(bArr, j);
            l0 l0Var2 = k0.f10523a;
            if (i > -12 || bA > -65) {
                return -1;
            }
            return (bA << 8) ^ i;
        }
        if (i7 != 2) {
            throw new AssertionError();
        }
        byte bA2 = i0.a(bArr, j);
        byte bA3 = i0.a(bArr, j + 1);
        l0 l0Var3 = k0.f10523a;
        if (i > -12 || bA2 > -65 || bA3 > -65) {
            return -1;
        }
        return (bA3 << 16) ^ ((bA2 << 8) ^ i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(byte[] bArr, int i, C0751j c0751j) {
        int i7 = i + 1;
        byte b7 = bArr[i];
        if (b7 < 0) {
            return d(b7, bArr, i7, c0751j);
        }
        c0751j.f10516a = b7;
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long g(long j, long j7, long j8) {
        long j9 = (j ^ j7) * j8;
        long j10 = ((j9 ^ (j9 >>> 47)) ^ j7) * j8;
        return (j10 ^ (j10 >>> 47)) * j8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long h(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        char c7 = '/';
        char c8 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j = ((long) (length << 1)) - 7286425919675154353L;
                long jN = n(0, bArr2) * (-5435081209227447693L);
                long jN2 = n(8, bArr2);
                long jN3 = n(length - 8, bArr2) * j;
                return g(Long.rotateRight(jN3, 30) + Long.rotateRight(jN + jN2, 43) + (n(length - 16, bArr2) * (-7286425919675154353L)), Long.rotateRight(jN2 - 7286425919675154353L, 18) + jN + jN3, j);
            }
            if (length >= 8) {
                long j7 = ((long) (length << 1)) - 7286425919675154353L;
                long jN4 = n(0, bArr2) - 7286425919675154353L;
                long jN5 = n(length - 8, bArr2);
                return g((Long.rotateRight(jN5, 37) * j7) + jN4, (Long.rotateRight(jN4, 25) + jN5) * j7, j7);
            }
            if (length >= 4) {
                return g(((long) length) + ((((long) a(0, bArr2)) & 4294967295L) << 3), ((long) a(length - 4, bArr2)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            long j8 = (((long) (length + ((bArr2[length - 1] & 255) << 2))) * (-4348849565147123417L)) ^ (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * (-7286425919675154353L));
            return (j8 ^ (j8 >>> 47)) * (-7286425919675154353L);
        }
        char c9 = '@';
        if (length <= 64) {
            long j9 = ((long) (length << 1)) - 7286425919675154353L;
            long jN6 = n(0, bArr2) * (-7286425919675154353L);
            long jN7 = n(8, bArr2);
            long jN8 = n(length - 8, bArr2) * j9;
            long jRotateRight = Long.rotateRight(jN8, 30) + Long.rotateRight(jN6 + jN7, 43) + (n(length - 16, bArr2) * (-7286425919675154353L));
            long jG = g(jRotateRight, Long.rotateRight(jN7 - 7286425919675154353L, 18) + jN6 + jN8, j9);
            long jN9 = n(16, bArr2) * j9;
            long jN10 = n(24, bArr2);
            long jN11 = (n(length - 32, bArr2) + jRotateRight) * j9;
            return g(Long.rotateRight(jN11, 30) + Long.rotateRight(jN9 + jN10, 43) + ((n(length - 24, bArr2) + jG) * j9), Long.rotateRight(jN10 + jN6, 18) + jN9 + jN11, j9);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jN12 = n(0, bArr2) + 95310865018149119L;
        int i = length - 1;
        int i7 = (i / 64) << 6;
        int i8 = i & 63;
        int i9 = i7 + i8;
        int i10 = i9 - 63;
        long j10 = 2480279821605975764L;
        long j11 = 1390051526045402406L;
        int i11 = i8;
        int i12 = 0;
        while (true) {
            char c10 = c8;
            long jRotateRight2 = Long.rotateRight(n(i12 + 8, bArr2) + jN12 + j10 + jArr[c8], 37) * (-5435081209227447693L);
            long jRotateRight3 = Long.rotateRight(n(i12 + 48, bArr2) + j10 + jArr[1], 42) * (-5435081209227447693L);
            long j12 = jRotateRight2 ^ jArr2[1];
            char c11 = c9;
            long jN13 = n(i12 + 40, bArr2) + jArr[c10] + jRotateRight3;
            long jRotateRight4 = Long.rotateRight(j11 + jArr2[c10], 33) * (-5435081209227447693L);
            char c12 = c7;
            int i13 = i11;
            l(bArr2, i12, jArr[1] * (-5435081209227447693L), j12 + jArr2[c10], jArr);
            int i14 = i12;
            long[] jArr3 = jArr;
            l(bArr2, i14 + 32, jRotateRight4 + jArr2[1], n(i14 + 16, bArr2) + jN13, jArr2);
            i12 = i14 + 64;
            if (i12 == i7) {
                long j13 = ((j12 & 255) << 1) - 5435081209227447693L;
                long j14 = jArr2[c10] + ((long) i13);
                jArr2[c10] = j14;
                long j15 = jArr3[c10] + j14;
                jArr3[c10] = j15;
                jArr2[c10] = jArr2[c10] + j15;
                long jRotateRight5 = Long.rotateRight(n(i9 - 55, bArr2) + jRotateRight4 + jN13 + jArr3[c10], 37) * j13;
                long jRotateRight6 = Long.rotateRight(n(i9 - 15, bArr2) + jN13 + jArr3[1], 42) * j13;
                long j16 = jRotateRight5 ^ (jArr2[1] * 9);
                long jN14 = n(i9 - 23, bArr2) + (jArr3[c10] * 9) + jRotateRight6;
                long jRotateRight7 = Long.rotateRight(j12 + jArr2[c10], 33) * j13;
                l(bArr2, i10, jArr3[1] * j13, jArr2[c10] + j16, jArr3);
                l(bArr2, i9 - 31, jArr2[1] + jRotateRight7, n(i9 - 47, bArr2) + jN14, jArr2);
                return g((((jN14 >>> c12) ^ jN14) * (-4348849565147123417L)) + g(jArr3[c10], jArr2[c10], j13) + j16, g(jArr3[1], jArr2[1], j13) + jRotateRight7, j13);
            }
            bArr2 = bArr;
            jN12 = jRotateRight4;
            jArr = jArr3;
            c8 = c10;
            j11 = j12;
            c9 = c11;
            j10 = jN13;
            i11 = i13;
            c7 = c12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(com.google.android.gms.internal.clearcut.AbstractC0764x r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            java.lang.Class r6 = r0.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L20:
            java.lang.String r10 = "get"
            if (r9 >= r7) goto L4f
            r11 = r6[r9]
            java.lang.String r12 = r11.getName()
            r4.put(r12, r11)
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L4c
            java.lang.String r12 = r11.getName()
            r3.put(r12, r11)
            java.lang.String r12 = r11.getName()
            boolean r10 = r12.startsWith(r10)
            if (r10 == 0) goto L4c
            java.lang.String r10 = r11.getName()
            r5.add(r10)
        L4c:
            int r9 = r9 + 1
            goto L20
        L4f:
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L26a
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ""
            java.lang.String r9 = r6.replaceFirst(r10, r7)
            java.lang.String r11 = "List"
            boolean r12 = r9.endsWith(r11)
            r13 = 1
            if (r12 == 0) goto Lc9
            java.lang.String r12 = "OrBuilderList"
            boolean r12 = r9.endsWith(r12)
            if (r12 != 0) goto Lc9
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto Lc9
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + (-4)
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto La1
            java.lang.String r11 = r11.concat(r12)
            goto La7
        La1:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        La7:
            java.lang.Object r12 = r3.get(r6)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto Lc9
            java.lang.Class r14 = r12.getReturnType()
            java.lang.Class<java.util.List> r15 = java.util.List.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto Lc9
            java.lang.String r6 = u(r11)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.clearcut.AbstractC0764x.b(r12, r0, r7)
            k(r1, r2, r6, r7)
            goto L53
        Lc9:
            java.lang.String r11 = "Map"
            boolean r12 = r9.endsWith(r11)
            if (r12 == 0) goto L137
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L137
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + (-3)
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto Lfc
            java.lang.String r11 = r11.concat(r12)
            goto L102
        Lfc:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L102:
            java.lang.Object r6 = r3.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L137
            java.lang.Class r12 = r6.getReturnType()
            java.lang.Class<java.util.Map> r14 = java.util.Map.class
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L137
            java.lang.Class<java.lang.Deprecated> r12 = java.lang.Deprecated.class
            boolean r12 = r6.isAnnotationPresent(r12)
            if (r12 != 0) goto L137
            int r12 = r6.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L137
            java.lang.String r7 = u(r11)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.AbstractC0764x.b(r6, r0, r9)
            k(r1, r2, r7, r6)
            goto L53
        L137:
            int r6 = r9.length()
            java.lang.String r11 = "set"
            if (r6 == 0) goto L144
            java.lang.String r6 = r11.concat(r9)
            goto L149
        L144:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r11)
        L149:
            java.lang.Object r6 = r4.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L53
            java.lang.String r6 = "Bytes"
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L17d
            int r6 = r9.length()
            int r6 = r6 + (-5)
            java.lang.String r6 = r9.substring(r8, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r11 = r6.length()
            if (r11 == 0) goto L172
            java.lang.String r6 = r10.concat(r6)
            goto L177
        L172:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r10)
        L177:
            boolean r6 = r3.containsKey(r6)
            if (r6 != 0) goto L53
        L17d:
            java.lang.String r6 = r9.substring(r8, r13)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r11 = r9.substring(r13)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r11.length()
            if (r12 == 0) goto L19c
            java.lang.String r6 = r6.concat(r11)
            goto L1a2
        L19c:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r6)
            r6 = r11
        L1a2:
            int r11 = r9.length()
            if (r11 == 0) goto L1ad
            java.lang.String r11 = r10.concat(r9)
            goto L1b2
        L1ad:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10)
        L1b2:
            java.lang.Object r11 = r3.get(r11)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            int r12 = r9.length()
            java.lang.String r14 = "has"
            if (r12 == 0) goto L1c5
            java.lang.String r9 = r14.concat(r9)
            goto L1ca
        L1c5:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r14)
        L1ca:
            java.lang.Object r9 = r3.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r11 == 0) goto L53
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.AbstractC0764x.b(r11, r0, r12)
            if (r9 != 0) goto L253
            boolean r9 = r11 instanceof java.lang.Boolean
            if (r9 == 0) goto L1ec
            r7 = r11
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L1ea
        L1e7:
            r7 = r13
            goto L24e
        L1ea:
            r7 = r8
            goto L24e
        L1ec:
            boolean r9 = r11 instanceof java.lang.Integer
            if (r9 == 0) goto L1fa
            r7 = r11
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L1ea
            goto L1e7
        L1fa:
            boolean r9 = r11 instanceof java.lang.Float
            if (r9 == 0) goto L20b
            r7 = r11
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L1ea
            goto L1e7
        L20b:
            boolean r9 = r11 instanceof java.lang.Double
            if (r9 == 0) goto L21d
            r7 = r11
            java.lang.Double r7 = (java.lang.Double) r7
            double r14 = r7.doubleValue()
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L1ea
            goto L1e7
        L21d:
            boolean r9 = r11 instanceof java.lang.String
            if (r9 == 0) goto L226
        L221:
            boolean r7 = r11.equals(r7)
            goto L24e
        L226:
            boolean r7 = r11 instanceof com.google.android.gms.internal.clearcut.C0754m
            if (r7 == 0) goto L22d
            com.google.android.gms.internal.clearcut.m r7 = com.google.android.gms.internal.clearcut.C0754m.f10530s
            goto L221
        L22d:
            boolean r7 = r11 instanceof com.google.android.gms.internal.clearcut.AbstractC0748g
            if (r7 == 0) goto L240
            r7 = r11
            com.google.android.gms.internal.clearcut.g r7 = (com.google.android.gms.internal.clearcut.AbstractC0748g) r7
            com.google.android.gms.internal.clearcut.x r7 = (com.google.android.gms.internal.clearcut.AbstractC0764x) r7
            r9 = 6
            java.lang.Object r7 = r7.a(r9)
            com.google.android.gms.internal.clearcut.x r7 = (com.google.android.gms.internal.clearcut.AbstractC0764x) r7
            if (r11 != r7) goto L1ea
            goto L1e7
        L240:
            boolean r7 = r11 instanceof java.lang.Enum
            if (r7 == 0) goto L1ea
            r7 = r11
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            if (r7 != 0) goto L1ea
            goto L1e7
        L24e:
            if (r7 != 0) goto L251
            goto L25f
        L251:
            r13 = r8
            goto L25f
        L253:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.clearcut.AbstractC0764x.b(r9, r0, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r13 = r7.booleanValue()
        L25f:
            if (r13 == 0) goto L53
            java.lang.String r6 = u(r6)
            k(r1, r2, r6, r11)
            goto L53
        L26a:
            com.google.android.gms.internal.clearcut.b0 r0 = r0.zzjp
            if (r0 == 0) goto L286
        L26e:
            int r3 = r0.f10494a
            if (r8 >= r3) goto L286
            int[] r3 = r0.f10495b
            r3 = r3[r8]
            int r3 = r3 >>> 3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r4 = r0.f10496c
            r4 = r4[r8]
            k(r1, r2, r3, r4)
            int r8 = r8 + 1
            goto L26e
        L286:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.l0.i(com.google.android.gms.internal.clearcut.x, java.lang.StringBuilder, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException {
        if (obj != null) {
            int i = 0;
            if (!(obj instanceof n0)) {
                String strV = v(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strV);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String strConcat = (String) obj;
                    if (!strConcat.startsWith("http") && strConcat.length() > 200) {
                        strConcat = String.valueOf(strConcat.substring(0, Scheduler.MAX_GREEDY_SCHEDULER_LIMIT)).concat("[...]");
                    }
                    int length = strConcat.length();
                    StringBuilder sb = new StringBuilder(length);
                    while (i < length) {
                        char cCharAt = strConcat.charAt(i);
                        if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                            sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb.append(cCharAt);
                        }
                        i++;
                    }
                    String string = sb.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(string);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer2.append('\"');
                    while (i < bArr.length) {
                        int i7 = bArr[i] & 255;
                        if (i7 == 92 || i7 == 34) {
                            stringBuffer2.append('\\');
                        } else {
                            if (i7 < 32 || i7 >= 127) {
                                stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i7)));
                            }
                            i++;
                        }
                        stringBuffer2.append((char) i7);
                        i++;
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
                return;
            }
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(v(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        j(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length3 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i8 = 0; i8 < length3; i8++) {
                            j(name, Array.get(obj2, i8), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            Method[] methods = cls.getMethods();
            int length4 = methods.length;
            while (i < length4) {
                String name2 = methods[i].getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        String strValueOf = String.valueOf(strSubstring);
                        if (((Boolean) cls.getMethod(strValueOf.length() != 0 ? "has".concat(strValueOf) : new String("has"), null).invoke(obj, null)).booleanValue()) {
                            String strValueOf2 = String.valueOf(strSubstring);
                            j(strSubstring, cls.getMethod(strValueOf2.length() != 0 ? "get".concat(strValueOf2) : new String("get"), null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                i++;
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                k(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                k(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0754m c0754m = C0754m.f10530s;
            sb.append(p(new C0754m(((String) obj).getBytes(AbstractC0765y.f10579a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0754m) {
            sb.append(": \"");
            sb.append(p((C0754m) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0764x) {
            sb.append(" {");
            i((AbstractC0764x) obj, sb, i + 2);
            sb.append("\n");
            while (i7 < i) {
                sb.append(' ');
                i7++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i9 = i + 2;
        k(sb, i9, "key", entry.getKey());
        k(sb, i9, FirebaseAnalytics.Param.VALUE, entry.getValue());
        sb.append("\n");
        while (i7 < i) {
            sb.append(' ');
            i7++;
        }
        sb.append("}");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(byte[] bArr, int i, long j, long j7, long[] jArr) {
        long jN = n(i, bArr);
        long jN2 = n(i + 8, bArr);
        long jN3 = n(i + 16, bArr);
        long jN4 = n(i + 24, bArr);
        long j8 = j + jN;
        long j9 = jN2 + j8 + jN3;
        long jRotateRight = Long.rotateRight(j9, 44) + Long.rotateRight(j7 + j8 + jN4, 21);
        jArr[0] = j9 + jN4;
        jArr[1] = jRotateRight + j8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int m(byte[] bArr, int i, C0751j c0751j) {
        int i7 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c0751j.f10517b = j;
            return i7;
        }
        int i8 = i + 2;
        byte b7 = bArr[i7];
        long j7 = (j & 127) | (((long) (b7 & 127)) << 7);
        int i9 = 7;
        while (b7 < 0) {
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            i9 += 7;
            j7 |= ((long) (b8 & 127)) << i9;
            b7 = b8;
            i8 = i10;
        }
        c0751j.f10517b = j7;
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long n(int i, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int o(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String p(C0754m c0754m) {
        String str;
        StringBuilder sb = new StringBuilder(c0754m.size());
        for (int i = 0; i < c0754m.size(); i++) {
            int iH = c0754m.h(i);
            if (iH == 34) {
                str = "\\\"";
            } else if (iH == 39) {
                str = "\\'";
            } else if (iH != 92) {
                switch (iH) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iH < 32 || iH > 126) {
                            sb.append('\\');
                            sb.append((char) (((iH >>> 6) & 3) + 48));
                            sb.append((char) (((iH >>> 3) & 7) + 48));
                            iH = (iH & 7) + 48;
                        }
                        sb.append((char) iH);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int q(byte[] bArr, int i, C0751j c0751j) throws B {
        int iF = f(bArr, i, c0751j);
        int i7 = c0751j.f10516a;
        if (i7 == 0) {
            c0751j.f10518c = "";
            return iF;
        }
        int i8 = iF + i7;
        if (!k0.f10523a.t(bArr, iF, i8)) {
            throw new B("Protocol message had invalid UTF-8.");
        }
        c0751j.f10518c = new String(bArr, iF, i7, AbstractC0765y.f10579a);
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long r(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int s(byte[] bArr, int i, C0751j c0751j) {
        int iF = f(bArr, i, c0751j);
        int i7 = c0751j.f10516a;
        if (i7 == 0) {
            c0751j.f10518c = C0754m.f10530s;
            return iF;
        }
        c0751j.f10518c = C0754m.g(bArr, iF, i7);
        return iF + i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String u(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String v(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                cCharAt = Character.toLowerCase(cCharAt);
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                cCharAt = Character.toLowerCase(cCharAt);
            }
            stringBuffer.append(cCharAt);
        }
        return stringBuffer.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        r6 = e(r4, r18, r3, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t(byte[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r17
            r3 = r20
            int r4 = r2.f10529a
            switch(r4) {
                case 0: goto Le1;
                default: goto Ld;
            }
        Ld:
            r4 = r1 | r3
            int r5 = r0.length
            int r5 = r5 - r3
            r4 = r4 | r5
            if (r4 < 0) goto Lc4
            long r4 = (long) r1
            long r6 = (long) r3
            long r6 = r6 - r4
            int r1 = (int) r6
            r3 = 16
            r7 = 1
            if (r1 >= r3) goto L20
            r3 = 0
            goto L32
        L20:
            r9 = r4
            r3 = 0
        L22:
            if (r3 >= r1) goto L31
            long r11 = r9 + r7
            byte r9 = com.google.android.gms.internal.clearcut.i0.a(r0, r9)
            if (r9 >= 0) goto L2d
            goto L32
        L2d:
            int r3 = r3 + 1
            r9 = r11
            goto L22
        L31:
            r3 = r1
        L32:
            int r1 = r1 - r3
            long r9 = (long) r3
            long r4 = r4 + r9
        L35:
            r3 = 0
        L36:
            if (r1 <= 0) goto L45
            long r9 = r4 + r7
            byte r3 = com.google.android.gms.internal.clearcut.i0.a(r0, r4)
            if (r3 < 0) goto L44
            int r1 = r1 + (-1)
            r4 = r9
            goto L36
        L44:
            r4 = r9
        L45:
            if (r1 != 0) goto L4a
            r6 = 0
            goto L156
        L4a:
            int r9 = r1 + (-1)
            r10 = -32
            r11 = -65
            if (r3 >= r10) goto L69
            if (r9 != 0) goto L57
            r6 = r3
            goto L156
        L57:
            int r1 = r1 + (-2)
            r9 = -62
            if (r3 < r9) goto Lc1
            long r9 = r4 + r7
            byte r3 = com.google.android.gms.internal.clearcut.i0.a(r0, r4)
            if (r3 <= r11) goto L66
            goto Lc1
        L66:
            r15 = r7
            r4 = r9
            goto L97
        L69:
            r12 = -16
            r13 = 2
            if (r3 >= r12) goto L99
            r12 = 2
            if (r9 >= r12) goto L78
        L72:
            int r6 = e(r4, r0, r3, r9)
            goto L156
        L78:
            int r1 = r1 + (-3)
            r15 = r7
            long r6 = r4 + r15
            byte r8 = com.google.android.gms.internal.clearcut.i0.a(r0, r4)
            if (r8 > r11) goto Lc1
            r9 = -96
            if (r3 != r10) goto L89
            if (r8 < r9) goto Lc1
        L89:
            r10 = -19
            if (r3 != r10) goto L8f
            if (r8 >= r9) goto Lc1
        L8f:
            long r4 = r4 + r13
            byte r3 = com.google.android.gms.internal.clearcut.i0.a(r0, r6)
            if (r3 <= r11) goto L97
            goto Lc1
        L97:
            r7 = r15
            goto L35
        L99:
            r15 = r7
            r6 = 3
            if (r9 >= r6) goto L9e
            goto L72
        L9e:
            int r1 = r1 + (-4)
            long r7 = r4 + r15
            byte r6 = com.google.android.gms.internal.clearcut.i0.a(r0, r4)
            if (r6 > r11) goto Lc1
            int r3 = r3 << 28
            int r6 = r6 + 112
            int r6 = r6 + r3
            int r3 = r6 >> 30
            if (r3 != 0) goto Lc1
            long r13 = r13 + r4
            byte r3 = com.google.android.gms.internal.clearcut.i0.a(r0, r7)
            if (r3 > r11) goto Lc1
            r6 = 3
            long r4 = r4 + r6
            byte r3 = com.google.android.gms.internal.clearcut.i0.a(r0, r13)
            if (r3 <= r11) goto L97
        Lc1:
            r6 = -1
            goto L156
        Lc4:
            java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r3}
            java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r4.<init>(r0)
            throw r4
        Le1:
            if (r1 >= r3) goto Lea
            r4 = r0[r1]
            if (r4 < 0) goto Lea
            int r1 = r1 + 1
            goto Le1
        Lea:
            if (r1 < r3) goto Led
            goto Lef
        Led:
            if (r1 < r3) goto Lf3
        Lef:
            r0 = 0
        Lf0:
            r6 = r0
            goto L156
        Lf3:
            int r4 = r1 + 1
            r5 = r0[r1]
            if (r5 >= 0) goto L15c
            r6 = -32
            r7 = -65
            if (r5 >= r6) goto L10e
            if (r4 < r3) goto L103
            r6 = r5
            goto L156
        L103:
            r6 = -62
            if (r5 < r6) goto L154
            int r1 = r1 + 2
            r4 = r0[r4]
            if (r4 <= r7) goto Led
            goto L154
        L10e:
            r8 = -16
            if (r5 >= r8) goto L134
            int r8 = r3 + (-1)
            if (r4 < r8) goto L11b
        L116:
            int r0 = com.google.android.gms.internal.clearcut.k0.a(r0, r4, r3)
            goto Lf0
        L11b:
            int r8 = r1 + 2
            r4 = r0[r4]
            if (r4 > r7) goto L154
            r9 = -96
            if (r5 != r6) goto L127
            if (r4 < r9) goto L154
        L127:
            r6 = -19
            if (r5 != r6) goto L12d
            if (r4 >= r9) goto L154
        L12d:
            int r1 = r1 + 3
            r4 = r0[r8]
            if (r4 <= r7) goto Led
            goto L154
        L134:
            int r6 = r3 + (-2)
            if (r4 < r6) goto L139
            goto L116
        L139:
            int r6 = r1 + 2
            r4 = r0[r4]
            if (r4 > r7) goto L154
            int r5 = r5 << 28
            int r4 = r4 + 112
            int r4 = r4 + r5
            int r4 = r4 >> 30
            if (r4 != 0) goto L154
            int r4 = r1 + 3
            r5 = r0[r6]
            if (r5 > r7) goto L154
            int r1 = r1 + 4
            r4 = r0[r4]
            if (r4 <= r7) goto Led
        L154:
            r0 = -1
            goto Lf0
        L156:
            if (r6 != 0) goto L15a
            r0 = 1
            return r0
        L15a:
            r0 = 0
            return r0
        L15c:
            r1 = r4
            goto Led
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.l0.t(byte[], int, int):boolean");
    }
}
