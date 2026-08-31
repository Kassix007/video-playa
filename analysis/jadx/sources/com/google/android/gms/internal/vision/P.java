package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.clearcut.C0752k;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class P implements Serializable, Iterable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final P f11218s = new P(AbstractC0914i0.f11273b);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final G f11219t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11220q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f11221r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f11219t = L.a() ? new G(2) : new G(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P(byte[] bArr) {
        bArr.getClass();
        this.f11221r = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static P h(byte[] bArr, int i, int i7) {
        byte[] bArrCopyOfRange;
        j(i, i + i7, bArr.length);
        switch (f11219t.f11152a) {
            case 1:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i7 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i7];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i7);
                break;
        }
        return new P(bArrCopyOfRange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int j(int i, int i7, int i8) {
        int i9 = i7 - i;
        if ((i | i7 | i9 | (i8 - i7)) >= 0) {
            return i9;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i7 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i7);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i7);
        sb3.append(" >= ");
        sb3.append(i8);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte d(int i) {
        return this.f11221r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P) || g() != ((P) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof P)) {
            return obj.equals(this);
        }
        P p7 = (P) obj;
        int i = this.f11220q;
        int i7 = p7.f11220q;
        if (i != 0 && i7 != 0 && i != i7) {
            return false;
        }
        int iG = g();
        if (iG > p7.g()) {
            int iG2 = g();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(iG);
            sb.append(iG2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iG > p7.g()) {
            int iG3 = p7.g();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(iG);
            sb2.append(", ");
            sb2.append(iG3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = p7.f11221r;
        int iK = k() + iG;
        int iK2 = k();
        int iK3 = p7.k();
        while (iK2 < iK) {
            if (this.f11221r[iK2] != bArr[iK3]) {
                return false;
            }
            iK2++;
            iK3++;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int g() {
        return this.f11221r.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = this.f11220q;
        if (i != 0) {
            return i;
        }
        int iG = g();
        int iK = k();
        int i7 = iG;
        for (int i8 = iK; i8 < iK + iG; i8++) {
            i7 = (i7 * 31) + this.f11221r[i8];
        }
        if (i7 == 0) {
            i7 = 1;
        }
        this.f11220q = i7;
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte i(int i) {
        return this.f11221r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0752k(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int k() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iG = g();
        if (g() <= 50) {
            strConcat = AbstractC0904d0.k(this);
        } else {
            int iJ = j(0, 47, g());
            strConcat = String.valueOf(AbstractC0904d0.k(iJ == 0 ? f11218s : new O(this.f11221r, k(), iJ))).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iG);
        sb.append(" contents=\"");
        return k1.i.k(sb, strConcat, "\">");
    }
}
