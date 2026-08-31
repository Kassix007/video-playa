package P3;

import A1.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import y3.AbstractC1915a;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC1915a {
    public static final Parcelable.Creator<a> CREATOR = new i(19);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f5628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[][] f5629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[][] f5630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final byte[][] f5631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[][] f5632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f5633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[][] f5634x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f5627q = str;
        this.f5628r = bArr;
        this.f5629s = bArr2;
        this.f5630t = bArr3;
        this.f5631u = bArr4;
        this.f5632v = bArr5;
        this.f5633w = iArr;
        this.f5634x = bArr6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List W(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List a0(byte[][] bArr) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b0(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z5 = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z5) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z5 = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (AbstractC1918b.m(this.f5627q, aVar.f5627q) && Arrays.equals(this.f5628r, aVar.f5628r) && AbstractC1918b.m(a0(this.f5629s), a0(aVar.f5629s)) && AbstractC1918b.m(a0(this.f5630t), a0(aVar.f5630t)) && AbstractC1918b.m(a0(this.f5631u), a0(aVar.f5631u)) && AbstractC1918b.m(a0(this.f5632v), a0(aVar.f5632v)) && AbstractC1918b.m(W(this.f5633w), W(aVar.f5633w)) && AbstractC1918b.m(a0(this.f5634x), a0(aVar.f5634x))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.f5627q;
        if (str == null) {
            string = "null";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2);
            sb2.append("'");
            sb2.append(str);
            sb2.append("'");
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(", direct=");
        byte[] bArr = this.f5628r;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        b0(sb, "GAIA", this.f5629s);
        sb.append(", ");
        b0(sb, "PSEUDO", this.f5630t);
        sb.append(", ");
        b0(sb, "ALWAYS", this.f5631u);
        sb.append(", ");
        b0(sb, "OTHER", this.f5632v);
        sb.append(", ");
        sb.append("weak");
        sb.append("=");
        int[] iArr = this.f5633w;
        if (iArr == null) {
            sb.append("null");
        } else {
            sb.append("(");
            int length = iArr.length;
            boolean z5 = true;
            int i = 0;
            while (i < length) {
                int i7 = iArr[i];
                if (!z5) {
                    sb.append(", ");
                }
                sb.append(i7);
                i++;
                z5 = false;
            }
            sb.append(")");
        }
        sb.append(", ");
        b0(sb, "directs", this.f5634x);
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.V(parcel, 2, this.f5627q);
        AbstractC0836n2.Q(parcel, 3, this.f5628r);
        AbstractC0836n2.R(parcel, 4, this.f5629s);
        AbstractC0836n2.R(parcel, 5, this.f5630t);
        AbstractC0836n2.R(parcel, 6, this.f5631u);
        AbstractC0836n2.R(parcel, 7, this.f5632v);
        AbstractC0836n2.T(parcel, 8, this.f5633w);
        AbstractC0836n2.R(parcel, 9, this.f5634x);
        AbstractC0836n2.a0(parcel, iY);
    }
}
