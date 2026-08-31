package o4;

import Q2.g;
import android.R;
import android.content.res.ColorStateList;
import m.C1243A;

/* JADX INFO: renamed from: o4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1418a extends C1243A {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[][] f15433w = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f15434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15435v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15434u == null) {
            int iD = g.D(this, com.wnapp.smspariaz.R.attr.colorControlActivated);
            int iD2 = g.D(this, com.wnapp.smspariaz.R.attr.colorOnSurface);
            int iD3 = g.D(this, com.wnapp.smspariaz.R.attr.colorSurface);
            this.f15434u = new ColorStateList(f15433w, new int[]{g.I(1.0f, iD3, iD), g.I(0.54f, iD3, iD2), g.I(0.38f, iD3, iD2), g.I(0.38f, iD3, iD2)});
        }
        return this.f15434u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15435v && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setUseMaterialThemeColors(boolean z5) {
        this.f15435v = z5;
        if (z5) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
