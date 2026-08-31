package h;

import E.c0;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.AbstractC1168a;
import l.InterfaceC1207j;
import l.MenuC1209l;
import m.C1312j;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC1168a implements InterfaceC1207j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f13214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final MenuC1209l f13215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Z.m f13216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f13217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ I f13218w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public H(I i, Context context, Z.m mVar) {
        this.f13218w = i;
        this.f13214s = context;
        this.f13216u = mVar;
        MenuC1209l menuC1209l = new MenuC1209l(context);
        menuC1209l.f14359l = 1;
        this.f13215t = menuC1209l;
        menuC1209l.f14355e = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void a() {
        I i = this.f13218w;
        if (i.f13222B != this) {
            return;
        }
        if (i.f13229I) {
            i.f13223C = this;
            i.f13224D = this.f13216u;
        } else {
            this.f13216u.v(this);
        }
        this.f13216u = null;
        i.V(false);
        ActionBarContextView actionBarContextView = i.f13243y;
        if (actionBarContextView.f9095A == null) {
            actionBarContextView.e();
        }
        i.f13240v.setHideOnContentScrollEnabled(i.f13234N);
        i.f13222B = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final View b() {
        WeakReference weakReference = this.f13217v;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final MenuC1209l c() {
        return this.f13215t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final MenuInflater d() {
        return new k.h(this.f13214s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1207j
    public final boolean e(MenuC1209l menuC1209l, MenuItem menuItem) {
        Z.m mVar = this.f13216u;
        if (mVar != null) {
            return ((c0) mVar.f8312r).y(this, menuItem);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final CharSequence f() {
        return this.f13218w.f13243y.getSubtitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final CharSequence g() {
        return this.f13218w.f13243y.getTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void h() {
        if (this.f13218w.f13222B != this) {
            return;
        }
        MenuC1209l menuC1209l = this.f13215t;
        menuC1209l.w();
        try {
            this.f13216u.w(this, menuC1209l);
        } finally {
            menuC1209l.v();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1207j
    public final void i(MenuC1209l menuC1209l) {
        if (this.f13216u == null) {
            return;
        }
        h();
        C1312j c1312j = this.f13218w.f13243y.f9108t;
        if (c1312j != null) {
            c1312j.n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final boolean j() {
        return this.f13218w.f13243y.f9103I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void k(View view) {
        this.f13218w.f13243y.setCustomView(view);
        this.f13217v = new WeakReference(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void l(int i) {
        m(this.f13218w.f13238t.getResources().getString(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void m(CharSequence charSequence) {
        this.f13218w.f13243y.setSubtitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void n(int i) {
        o(this.f13218w.f13238t.getResources().getString(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void o(CharSequence charSequence) {
        this.f13218w.f13243y.setTitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k.AbstractC1168a
    public final void p(boolean z5) {
        this.f13913r = z5;
        this.f13218w.f13243y.setTitleOptional(z5);
    }
}
