package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import k.InterfaceC1169b;

/* JADX INFO: renamed from: l.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1213p extends FrameLayout implements InterfaceC1169b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CollapsibleActionView f14403q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public C1213p(View view) {
        super(view.getContext());
        this.f14403q = (CollapsibleActionView) view;
        addView(view);
    }
}
