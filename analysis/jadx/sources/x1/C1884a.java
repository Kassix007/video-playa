package x1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: x1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1884a extends ClickableSpan {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f18328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18329s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1884a(int i, e eVar, int i7) {
        this.f18327q = i;
        this.f18328r = eVar;
        this.f18329s = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f18327q);
        this.f18328r.f18345a.performAction(this.f18329s, bundle);
    }
}
