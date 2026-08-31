package d2;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: d2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0983i extends AbstractC0963J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0985k f12131a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0983i(C0985k c0985k) {
        this.f12131a = c0985k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0963J
    public final void b(RecyclerView recyclerView, int i, int i7) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0985k c0985k = this.f12131a;
        int i8 = c0985k.f12138a;
        int iComputeVerticalScrollRange = c0985k.f12153s.computeVerticalScrollRange();
        int i9 = c0985k.f12152r;
        c0985k.f12154t = iComputeVerticalScrollRange - i9 > 0 && i9 >= i8;
        int iComputeHorizontalScrollRange = c0985k.f12153s.computeHorizontalScrollRange();
        int i10 = c0985k.f12151q;
        boolean z5 = iComputeHorizontalScrollRange - i10 > 0 && i10 >= i8;
        c0985k.f12155u = z5;
        boolean z6 = c0985k.f12154t;
        if (!z6 && !z5) {
            if (c0985k.f12156v != 0) {
                c0985k.f(0);
                return;
            }
            return;
        }
        if (z6) {
            float f = i9;
            c0985k.f12146l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c0985k.f12145k = Math.min(i9, (i9 * i9) / iComputeVerticalScrollRange);
        }
        if (c0985k.f12155u) {
            float f7 = iComputeHorizontalScrollOffset;
            float f8 = i10;
            c0985k.f12149o = (int) ((((f8 / 2.0f) + f7) * f8) / iComputeHorizontalScrollRange);
            c0985k.f12148n = Math.min(i10, (i10 * i10) / iComputeHorizontalScrollRange);
        }
        int i11 = c0985k.f12156v;
        if (i11 == 0 || i11 == 1) {
            c0985k.f(1);
        }
    }
}
