package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AbstractC0764x {
    private static volatile T zzbg;
    private static final t0 zzbir;
    private A zzbiq = W.f10447s;

    static {
        t0 t0Var = new t0();
        zzbir = t0Var;
        AbstractC0764x.c(t0.class, t0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t0 f() {
        return zzbir;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t0 g(byte[] bArr) throws B {
        AbstractC0764x abstractC0764x = (AbstractC0764x) zzbir.a(4);
        try {
            V v6 = V.f10444c;
            v6.getClass();
            v6.a(abstractC0764x.getClass()).b(abstractC0764x, bArr, 0, bArr.length, new C0751j());
            v6.a(abstractC0764x.getClass()).a(abstractC0764x);
            if (abstractC0764x.zzex != 0) {
                throw new RuntimeException();
            }
            boolean zF = true;
            byte bByteValue = ((Byte) abstractC0764x.a(1)).byteValue();
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zF = false;
                } else {
                    zF = v6.a(abstractC0764x.getClass()).f(abstractC0764x);
                    abstractC0764x.a(2);
                }
            }
            if (zF) {
                return (t0) abstractC0764x;
            }
            throw new B(new C2.e().getMessage());
        } catch (IOException e7) {
            if (e7.getCause() instanceof B) {
                throw ((B) e7.getCause());
            }
            throw new B(e7.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw B.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.clearcut.T, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC0764x
    public final Object a(int i) {
        Object obj;
        switch (u0.f10559a[i - 1]) {
            case 1:
                return new t0();
            case 2:
                return new q0(zzbir);
            case 3:
                return new X(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", s0.class});
            case 4:
                return zzbir;
            case 5:
                T t6 = zzbg;
                if (t6 != null) {
                    return t6;
                }
                synchronized (t0.class) {
                    try {
                        T t7 = zzbg;
                        obj = t7;
                        if (t7 == null) {
                            ?? c0763w = new C0763w();
                            zzbg = c0763w;
                            obj = c0763w;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return obj;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final A e() {
        return this.zzbiq;
    }
}
