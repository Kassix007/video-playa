package w1;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: w1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1853p implements InterfaceC1854q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f18233a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1853p(NestedScrollView nestedScrollView) {
        this.f18233a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1854q
    public final void onScrollLimit(int i, int i7, int i8, boolean z5) {
        this.f18233a.onScrollLimit(i, i7, i8, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1854q
    public final void onScrollProgress(int i, int i7, int i8, int i9) {
        this.f18233a.onScrollProgress(i, i7, i8, i9);
    }
}
