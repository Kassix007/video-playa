package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y1 {
    protected int zza;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(Iterable iterable, List list) {
        Charset charset = AbstractC0885x2.f11122a;
        iterable.getClass();
        if (iterable instanceof B2) {
            List listZza = ((B2) iterable).zza();
            B2 b22 = (B2) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = b22.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = b22.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        b22.remove(size3);
                    }
                } else if (obj instanceof C0796f2) {
                    b22.f();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    C0796f2.i(bArr, 0, bArr.length);
                    b22.f();
                } else {
                    b22.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof O2) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof Q2) {
                Q2 q22 = (Q2) list;
                int i = ((Q2) list).f10694s + size4;
                int length = q22.f10693r.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        q22.f10693r = Arrays.copyOf(q22.f10693r, length);
                    } else {
                        q22.f10693r = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    AbstractC0846p2.a(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i7 = 0; i7 < size6; i7++) {
            Object obj3 = list2.get(i7);
            if (obj3 == null) {
                AbstractC0846p2.a(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] a() {
        try {
            AbstractC0851q2 abstractC0851q2 = (AbstractC0851q2) this;
            int iK = abstractC0851q2.k();
            byte[] bArr = new byte[iK];
            C0801g2 c0801g2 = new C0801g2(iK, bArr);
            abstractC0851q2.d(c0801g2);
            if (iK - c0801g2.f10848h == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e7);
        }
    }

    public abstract int b(S2 s22);
}
