package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: m.Y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1291Y0 implements InterfaceC1311i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f14730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f14732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f14733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f14734e;
    public Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f14736h;
    public CharSequence i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f14737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1312j f14739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f14741o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        View view;
        Toolbar toolbar = this.f14730a;
        int i7 = this.f14731b ^ i;
        this.f14731b = i;
        if (i7 != 0) {
            if ((i7 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                Toolbar toolbar2 = this.f14730a;
                if ((this.f14731b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.f14741o;
                    }
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            if ((i7 & 3) != 0) {
                c();
            }
            if ((i7 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f14736h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i7 & 16) == 0 || (view = this.f14732c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        Toolbar toolbar = this.f14730a;
        if ((this.f14731b & 4) != 0) {
            if (TextUtils.isEmpty(this.j)) {
                toolbar.setNavigationContentDescription(this.f14740n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        Drawable drawable;
        int i = this.f14731b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f14734e) == null) {
            drawable = this.f14733d;
        }
        this.f14730a.setLogo(drawable);
    }
}
