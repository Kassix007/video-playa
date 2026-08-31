package androidx.appcompat.view.menu;

import B0.G0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.C1211n;
import l.InterfaceC1208k;
import l.MenuC1209l;
import l.z;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1208k, z, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f9067r = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuC1209l f9068q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        G0 g0N = G0.N(context, attributeSet, f9067r, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) g0N.f235s;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(g0N.y(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(g0N.y(1));
        }
        g0N.R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.z
    public final void a(MenuC1209l menuC1209l) {
        this.f9068q = menuC1209l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1208k
    public final boolean c(C1211n c1211n) {
        return this.f9068q.q(c1211n, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        c((C1211n) getAdapter().getItem(i));
    }
}
