package k;

import E.c0;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.InterfaceC1207j;
import l.MenuC1209l;
import m.C1312j;

/* JADX INFO: renamed from: k.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1171d extends AbstractC1168a implements InterfaceC1207j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f13919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ActionBarContextView f13920t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Z.m f13921u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f13922v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13923w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MenuC1209l f13924x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void a() {
        if (this.f13923w) {
            return;
        }
        this.f13923w = true;
        this.f13921u.v(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final View b() {
        WeakReference weakReference = this.f13922v;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final MenuC1209l c() {
        return this.f13924x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final MenuInflater d() {
        return new h(this.f13920t.getContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1207j
    public final boolean e(MenuC1209l menuC1209l, MenuItem menuItem) {
        return ((c0) this.f13921u.f8312r).y(this, menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final CharSequence f() {
        return this.f13920t.getSubtitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final CharSequence g() {
        return this.f13920t.getTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void h() {
        this.f13921u.w(this, this.f13924x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1207j
    public final void i(MenuC1209l menuC1209l) {
        h();
        C1312j c1312j = this.f13920t.f9108t;
        if (c1312j != null) {
            c1312j.n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final boolean j() {
        return this.f13920t.f9103I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void k(View view) {
        this.f13920t.setCustomView(view);
        this.f13922v = view != null ? new WeakReference(view) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void l(int i) {
        m(this.f13919s.getString(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void m(CharSequence charSequence) {
        this.f13920t.setSubtitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void n(int i) {
        o(this.f13919s.getString(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void o(CharSequence charSequence) {
        this.f13920t.setTitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void p(boolean z5) {
        this.f13913r = z5;
        this.f13920t.setTitleOptional(z5);
    }
}
