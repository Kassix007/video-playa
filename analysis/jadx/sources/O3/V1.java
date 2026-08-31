package O3;

import android.os.Parcel;
import android.os.Parcelable;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class V1 extends AbstractC1915a {
    public static final Parcelable.Creator<V1> CREATOR = new A1.i(17);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f4647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f4648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f4649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f4650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f4651v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Double f4652w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V1(int i, String str, long j, Long l7, Float f, String str2, String str3, Double d5) {
        this.f4646q = i;
        this.f4647r = str;
        this.f4648s = j;
        this.f4649t = l7;
        this.f4652w = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d5;
        this.f4650u = str2;
        this.f4651v = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object W() {
        Long l7 = this.f4649t;
        if (l7 != null) {
            return l7;
        }
        Double d5 = this.f4652w;
        if (d5 != null) {
            return d5;
        }
        String str = this.f4650u;
        if (str != null) {
            return str;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        A1.i.b(this, parcel);
    }

    public V1(long j, Object obj, String str, String str2) {
        AbstractC1887A.d(str);
        this.f4646q = 2;
        this.f4647r = str;
        this.f4648s = j;
        this.f4651v = str2;
        if (obj == null) {
            this.f4649t = null;
            this.f4652w = null;
            this.f4650u = null;
            return;
        }
        if (obj instanceof Long) {
            this.f4649t = (Long) obj;
            this.f4652w = null;
            this.f4650u = null;
        } else if (obj instanceof String) {
            this.f4649t = null;
            this.f4652w = null;
            this.f4650u = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f4649t = null;
                this.f4652w = (Double) obj;
                this.f4650u = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public V1(W1 w12) {
        this(w12.f4660d, w12.f4661e, w12.f4659c, w12.f4658b);
    }
}
