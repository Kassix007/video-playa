package com.google.android.gms.internal.clearcut;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0754m implements Serializable, Iterable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0754m f10530s = new C0754m(AbstractC0765y.f10580b);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0753l f10531t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10532q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f10533r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f10531t = AbstractC0750i.a() ? new C0753l(1) : new C0753l(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0754m(byte[] bArr) {
        this.f10533r = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0754m g(byte[] bArr, int i, int i7) {
        byte[] bArrCopyOfRange;
        switch (f10531t.f10524a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i7 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i7];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i7);
                break;
        }
        return new C0754m(bArrCopyOfRange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int d() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0754m) || size() != ((C0754m) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0754m)) {
            return obj.equals(this);
        }
        C0754m c0754m = (C0754m) obj;
        int i = this.f10532q;
        int i7 = c0754m.f10532q;
        if (i != 0 && i7 != 0 && i != i7) {
            return false;
        }
        int size = size();
        if (size > c0754m.size()) {
            int size2 = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(size);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (size > c0754m.size()) {
            int size3 = c0754m.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(size);
            sb2.append(", ");
            sb2.append(size3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = c0754m.f10533r;
        int iD = d() + size;
        int iD2 = d();
        int iD3 = c0754m.d();
        while (iD2 < iD) {
            if (this.f10533r[iD2] != bArr[iD3]) {
                return false;
            }
            iD2++;
            iD3++;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte h(int i) {
        return this.f10533r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = this.f10532q;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iD = d();
        int i7 = size;
        for (int i8 = iD; i8 < iD + size; i8++) {
            i7 = (i7 * 31) + this.f10533r[i8];
        }
        if (i7 == 0) {
            i7 = 1;
        }
        this.f10532q = i7;
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0752k(this);
    }

    public int size() {
        return this.f10533r.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
