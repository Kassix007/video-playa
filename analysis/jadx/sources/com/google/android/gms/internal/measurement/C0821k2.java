package com.google.android.gms.internal.measurement;

import androidx.work.impl.WorkDatabaseVersions;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0821k2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10885c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U2 f10886a = new U2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10887b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C0821k2(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0821k2() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(C0801g2 c0801g2, EnumC0802g3 enumC0802g3, int i, Object obj) throws com.google.android.gms.internal.clearcut.m0 {
        if (enumC0802g3 == EnumC0802g3.f10850t) {
            Charset charset = AbstractC0885x2.f11122a;
            c0801g2.e0(i, 3);
            ((AbstractC0851q2) ((Y1) obj)).d(c0801g2);
            c0801g2.e0(i, 4);
            return;
        }
        c0801g2.e0(i, enumC0802g3.f10853r);
        EnumC0807h3 enumC0807h3 = EnumC0807h3.f10860q;
        switch (enumC0802g3.ordinal()) {
            case 0:
                c0801g2.r0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0801g2.p0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0801g2.q0(((Long) obj).longValue());
                break;
            case 3:
                c0801g2.q0(((Long) obj).longValue());
                break;
            case 4:
                c0801g2.n0(((Integer) obj).intValue());
                break;
            case 5:
                c0801g2.r0(((Long) obj).longValue());
                break;
            case 6:
                c0801g2.p0(((Integer) obj).intValue());
                break;
            case 7:
                c0801g2.m0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0796f2)) {
                    c0801g2.t0((String) obj);
                } else {
                    c0801g2.l0((C0796f2) obj);
                }
                break;
            case 9:
                ((AbstractC0851q2) ((Y1) obj)).d(c0801g2);
                break;
            case 10:
                c0801g2.getClass();
                AbstractC0851q2 abstractC0851q2 = (AbstractC0851q2) ((Y1) obj);
                c0801g2.o0(abstractC0851q2.k());
                abstractC0851q2.d(c0801g2);
                break;
            case 11:
                if (!(obj instanceof C0796f2)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0801g2.o0(length);
                    c0801g2.s0(length, bArr);
                } else {
                    c0801g2.l0((C0796f2) obj);
                }
                break;
            case 12:
                c0801g2.o0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC0860s2)) {
                    c0801g2.n0(((Integer) obj).intValue());
                } else {
                    c0801g2.n0(((InterfaceC0860s2) obj).zza());
                }
                break;
            case 14:
                c0801g2.p0(((Integer) obj).intValue());
                break;
            case 15:
                c0801g2.r0(((Long) obj).longValue());
                break;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                c0801g2.o0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                c0801g2.q0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (this.f10887b) {
            return;
        }
        U2 u22 = this.f10886a;
        int i = u22.f10715r;
        for (int i7 = 0; i7 < i; i7++) {
            Object obj = u22.a(i7).f10729r;
            if (obj instanceof AbstractC0851q2) {
                ((AbstractC0851q2) obj).g();
            }
        }
        Iterator it = u22.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC0851q2) {
                ((AbstractC0851q2) value).g();
            }
        }
        if (!u22.f10717t) {
            if (u22.f10715r > 0) {
                u22.a(0).f10728q.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = u22.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!u22.f10717t) {
            u22.f10716s = u22.f10716s.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(u22.f10716s);
            u22.f10719v = u22.f10719v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(u22.f10719v);
            u22.f10717t = true;
        }
        this.f10887b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        C0821k2 c0821k2 = new C0821k2();
        U2 u22 = this.f10886a;
        if (u22.f10715r > 0) {
            V2 v2A = u22.a(0);
            if (v2A.f10728q != null) {
                throw new ClassCastException();
            }
            Object obj = v2A.f10729r;
            throw null;
        }
        Iterator it = u22.b().iterator();
        if (!it.hasNext()) {
            return c0821k2;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0821k2) {
            return this.f10886a.equals(((C0821k2) obj).f10886a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10886a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0821k2(int i) {
        a();
        a();
    }
}
