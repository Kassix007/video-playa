package j0;

import C0.S;
import m5.AbstractC1362a;
import r.C1570v;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13718b = AbstractC1145B.c(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f13720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f13721e;
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f13722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f13723h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13724a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC1145B.c(4282664004L);
        AbstractC1145B.c(4287137928L);
        AbstractC1145B.c(4291611852L);
        f13719c = AbstractC1145B.c(4294967295L);
        f13720d = AbstractC1145B.c(4294901760L);
        AbstractC1145B.c(4278255360L);
        f13721e = AbstractC1145B.c(4278190335L);
        AbstractC1145B.c(4294967040L);
        AbstractC1145B.c(4278255615L);
        AbstractC1145B.c(4294902015L);
        f = AbstractC1145B.b(0);
        f13722g = AbstractC1145B.a(0.0f, 0.0f, 0.0f, 0.0f, k0.d.f13999u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [L.k.e(long, int, long, float):void, L0.m.invoke(java.lang.Object):java.lang.Object] */
    public /* synthetic */ o(long j) {
        this.f13724a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(long j, k0.c cVar) {
        k0.g gVarE;
        k0.c cVarF = f(j);
        int i = cVarF.f13981c;
        int i7 = cVar.f13981c;
        if ((i | i7) < 0) {
            gVarE = k0.j.e(cVarF, cVar);
        } else {
            C1570v c1570v = k0.h.f14010a;
            int i8 = i | (i7 << 6);
            Object objB = c1570v.b(i8);
            if (objB == null) {
                objB = k0.j.e(cVarF, cVar);
                c1570v.h(i8, objB);
            }
            gVarE = (k0.g) objB;
        }
        return gVarE.a(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long b(long j, float f7) {
        return AbstractC1145B.a(h(j), g(j), e(j), f7, f(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(long j, long j7) {
        return j == j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float d(long j) {
        float fG;
        float f7;
        if ((63 & j) == 0) {
            fG = (float) AbstractC1362a.g((j >>> 56) & 255);
            f7 = 255.0f;
        } else {
            fG = (float) AbstractC1362a.g((j >>> 6) & 1023);
            f7 = 1023.0f;
        }
        return fG / f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float e(long j) {
        int i;
        int i7;
        int i8;
        if ((63 & j) == 0) {
            return ((float) AbstractC1362a.g((j >>> 32) & 255)) / 255.0f;
        }
        short s6 = (short) ((j >>> 16) & 65535);
        int i9 = Short.MIN_VALUE & s6;
        int i10 = ((65535 & s6) >>> 10) & 31;
        int i11 = s6 & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i = 255;
                if (i12 != 0) {
                    i12 |= 4194304;
                }
            } else {
                i = i10 + 112;
            }
            int i13 = i;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - s.f13727a;
                return i9 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final k0.c f(long j) {
        float[] fArr = k0.d.f13982a;
        return k0.d.f14003y[(int) (j & 63)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float g(long j) {
        int i;
        int i7;
        int i8;
        if ((63 & j) == 0) {
            return ((float) AbstractC1362a.g((j >>> 40) & 255)) / 255.0f;
        }
        short s6 = (short) ((j >>> 32) & 65535);
        int i9 = Short.MIN_VALUE & s6;
        int i10 = ((65535 & s6) >>> 10) & 31;
        int i11 = s6 & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i = 255;
                if (i12 != 0) {
                    i12 |= 4194304;
                }
            } else {
                i = i10 + 112;
            }
            int i13 = i;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - s.f13727a;
                return i9 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float h(long j) {
        int i;
        int i7;
        int i8;
        if ((63 & j) == 0) {
            return ((float) AbstractC1362a.g((j >>> 48) & 255)) / 255.0f;
        }
        short s6 = (short) ((j >>> 48) & 65535);
        int i9 = Short.MIN_VALUE & s6;
        int i10 = ((65535 & s6) >>> 10) & 31;
        int i11 = s6 & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i = 255;
                if (i12 != 0) {
                    i12 |= 4194304;
                }
            } else {
                i = i10 + 112;
            }
            int i13 = i;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - s.f13727a;
                return i9 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j));
        sb.append(", ");
        sb.append(g(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        return S.p(sb, f(j).f13979a, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f13724a == ((o) obj).f13724a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13724a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return i(this.f13724a);
    }
}
