package t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.C0;
import com.google.android.gms.internal.clearcut.w0;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.material.datepicker.p;
import java.util.Arrays;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1915a {
    public static final Parcelable.Creator<c> CREATOR = new p(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0 f16731q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f16732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f16733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String[] f16734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f16735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[][] f16736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final P3.a[] f16737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f16738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w0 f16739y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(C0 c02, w0 w0Var) {
        this.f16731q = c02;
        this.f16739y = w0Var;
        this.f16733s = null;
        this.f16734t = null;
        this.f16735u = null;
        this.f16736v = null;
        this.f16737w = null;
        this.f16738x = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (AbstractC1887A.j(this.f16731q, cVar.f16731q) && Arrays.equals(this.f16732r, cVar.f16732r) && Arrays.equals(this.f16733s, cVar.f16733s) && Arrays.equals(this.f16734t, cVar.f16734t) && AbstractC1887A.j(this.f16739y, cVar.f16739y) && AbstractC1887A.j(null, null) && AbstractC1887A.j(null, null) && Arrays.equals(this.f16735u, cVar.f16735u) && Arrays.deepEquals(this.f16736v, cVar.f16736v) && Arrays.equals(this.f16737w, cVar.f16737w) && this.f16738x == cVar.f16738x) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16731q, this.f16732r, this.f16733s, this.f16734t, this.f16739y, null, null, this.f16735u, this.f16736v, this.f16737w, Boolean.valueOf(this.f16738x)});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f16731q);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f16732r;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f16733s));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f16734t));
        sb.append(", LogEvent: ");
        sb.append(this.f16739y);
        sb.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.f16735u));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f16736v));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f16737w));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f16738x);
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.U(parcel, 2, this.f16731q, i);
        AbstractC0836n2.Q(parcel, 3, this.f16732r);
        AbstractC0836n2.T(parcel, 4, this.f16733s);
        String[] strArr = this.f16734t;
        if (strArr != null) {
            int iY2 = AbstractC0836n2.Y(parcel, 5);
            parcel.writeStringArray(strArr);
            AbstractC0836n2.a0(parcel, iY2);
        }
        AbstractC0836n2.T(parcel, 6, this.f16735u);
        AbstractC0836n2.R(parcel, 7, this.f16736v);
        AbstractC0836n2.b0(parcel, 8, 4);
        parcel.writeInt(this.f16738x ? 1 : 0);
        AbstractC0836n2.W(parcel, 9, this.f16737w, i);
        AbstractC0836n2.a0(parcel, iY);
    }

    public c(C0 c02, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z5, P3.a[] aVarArr) {
        this.f16731q = c02;
        this.f16732r = bArr;
        this.f16733s = iArr;
        this.f16734t = strArr;
        this.f16739y = null;
        this.f16735u = iArr2;
        this.f16736v = bArr2;
        this.f16737w = aVarArr;
        this.f16738x = z5;
    }
}
