package d2;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12057e;
    public int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f12058g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Z(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f12058g = staggeredGridLayoutManager;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.f12053a = -1;
        this.f12054b = Integer.MIN_VALUE;
        this.f12055c = false;
        this.f12056d = false;
        this.f12057e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
