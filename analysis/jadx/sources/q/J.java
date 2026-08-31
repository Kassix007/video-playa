package Q;

import androidx.recyclerview.widget.RecyclerView;
import d2.AbstractC0960G;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6479d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(int i, int i7) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i8 = this.f6478c;
        int i9 = i8 * 2;
        int[] iArr = (int[]) this.f6479d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f6479d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i9 >= iArr.length) {
            int[] iArr3 = new int[i8 * 4];
            this.f6479d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f6479d;
        iArr4[i9] = i;
        iArr4[i9 + 1] = i7;
        this.f6478c++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(RecyclerView recyclerView, boolean z5) {
        this.f6478c = 0;
        int[] iArr = (int[]) this.f6479d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0960G abstractC0960G = recyclerView.f9604B;
        if (recyclerView.f9602A == null || abstractC0960G == null || !abstractC0960G.i) {
            return;
        }
        if (z5) {
            if (!recyclerView.f9654t.l()) {
                abstractC0960G.i(recyclerView.f9602A.a(), this);
            }
        } else if (!recyclerView.K()) {
            abstractC0960G.h(this.f6476a, this.f6477b, recyclerView.f9653s0, this);
        }
        int i = this.f6478c;
        if (i > abstractC0960G.j) {
            abstractC0960G.j = i;
            abstractC0960G.f11984k = z5;
            recyclerView.f9650r.k();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int c(int i) {
        return ((K) this.f6479d).f6482q[this.f6477b + i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object d(int i) {
        return ((K) this.f6479d).f6484s[this.f6478c + i];
    }
}
