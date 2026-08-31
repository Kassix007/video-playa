package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.clearcut.C0752k;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import n5.AbstractC1397A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0796f2 implements Iterable, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0796f2 f10840s = new C0796f2(AbstractC0885x2.f11123b);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10841q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f10842r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = AbstractC0770a2.f10790a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0796f2(byte[] bArr) {
        bArr.getClass();
        this.f10842r = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0796f2 i(byte[] bArr, int i, int i7) {
        j(i, i + i7, bArr.length);
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, i, bArr2, 0, i7);
        return new C0796f2(bArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int j(int i, int i7, int i8) {
        int i9 = i7 - i;
        if ((i | i7 | i9 | (i8 - i7)) >= 0) {
            return i9;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i7 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i7).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i7);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 15 + String.valueOf(i8).length());
        sb3.append("End index: ");
        sb3.append(i7);
        sb3.append(" >= ");
        sb3.append(i8);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte d(int i) {
        return this.f10842r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C0796f2) && h() == ((C0796f2) obj).h()) {
            if (h() == 0) {
                return true;
            }
            if (!(obj instanceof C0796f2)) {
                return obj.equals(this);
            }
            C0796f2 c0796f2 = (C0796f2) obj;
            int i = this.f10841q;
            int i7 = c0796f2.f10841q;
            if (i == 0 || i7 == 0 || i == i7) {
                int iH = h();
                if (iH > c0796f2.h()) {
                    int iH2 = h();
                    StringBuilder sb = new StringBuilder(String.valueOf(iH).length() + 18 + String.valueOf(iH2).length());
                    sb.append("Length too large: ");
                    sb.append(iH);
                    sb.append(iH2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iH <= c0796f2.h()) {
                    byte[] bArr = c0796f2.f10842r;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < iH) {
                        if (this.f10842r[i8] == bArr[i9]) {
                            i8++;
                            i9++;
                        }
                    }
                    return true;
                }
                int iH3 = c0796f2.h();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iH).length() + 27 + String.valueOf(iH3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(iH);
                sb2.append(", ");
                sb2.append(iH3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte g(int i) {
        return this.f10842r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int h() {
        return this.f10842r.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = this.f10841q;
        if (i != 0) {
            return i;
        }
        int iH = h();
        int i7 = iH;
        for (int i8 = 0; i8 < iH; i8++) {
            i7 = (i7 * 31) + this.f10842r[i8];
        }
        if (i7 == 0) {
            i7 = 1;
        }
        this.f10841q = i7;
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0752k(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iH = h();
        if (h() <= 50) {
            strConcat = AbstractC1397A.I(this);
        } else {
            int iJ = j(0, 47, h());
            strConcat = AbstractC1397A.I(iJ == 0 ? f10840s : new C0791e2(iJ, this.f10842r)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iH);
        sb.append(" contents=\"");
        return k1.i.k(sb, strConcat, "\">");
    }
}
