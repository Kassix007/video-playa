package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.wnapp.smspariaz.R;
import l.ViewTreeObserverOnGlobalLayoutListenerC1201d;

/* JADX INFO: renamed from: m.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1265L extends C1248C0 implements InterfaceC1269N {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public CharSequence f14676S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C1259I f14677T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Rect f14678U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f14679V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final /* synthetic */ C1271O f14680W;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265L(C1271O c1271o, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f14680W = c1271o;
        this.f14678U = new Rect();
        this.f14625E = c1271o;
        this.f14635O = true;
        this.f14636P.setFocusable(true);
        this.f14626F = new C1261J(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void f(CharSequence charSequence) {
        this.f14676S = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void i(int i) {
        this.f14679V = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void k(int i, int i7) {
        ViewTreeObserver viewTreeObserver;
        C1342y c1342y = this.f14636P;
        boolean zIsShowing = c1342y.isShowing();
        s();
        this.f14636P.setInputMethodMode(2);
        c();
        C1325p0 c1325p0 = this.f14639s;
        c1325p0.setChoiceMode(1);
        c1325p0.setTextDirection(i);
        c1325p0.setTextAlignment(i7);
        C1271O c1271o = this.f14680W;
        int selectedItemPosition = c1271o.getSelectedItemPosition();
        C1325p0 c1325p02 = this.f14639s;
        if (c1342y.isShowing() && c1325p02 != null) {
            c1325p02.setListSelectionHidden(false);
            c1325p02.setSelection(selectedItemPosition);
            if (c1325p02.getChoiceMode() != 0) {
                c1325p02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c1271o.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1201d viewTreeObserverOnGlobalLayoutListenerC1201d = new ViewTreeObserverOnGlobalLayoutListenerC1201d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1201d);
        this.f14636P.setOnDismissListener(new C1263K(this, viewTreeObserverOnGlobalLayoutListenerC1201d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final CharSequence o() {
        return this.f14676S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1248C0, m.InterfaceC1269N
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f14677T = (C1259I) listAdapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        int i;
        C1271O c1271o = this.f14680W;
        Rect rect = c1271o.f14697x;
        C1342y c1342y = this.f14636P;
        Drawable background = c1342y.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z5 = g1.f14790a;
            i = c1271o.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c1271o.getPaddingLeft();
        int paddingRight = c1271o.getPaddingRight();
        int width = c1271o.getWidth();
        int i7 = c1271o.f14696w;
        if (i7 == -2) {
            int iA = c1271o.a(this.f14677T, c1342y.getBackground());
            int i8 = (c1271o.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i8) {
                iA = i8;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i7 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i7);
        }
        boolean z6 = g1.f14790a;
        this.f14642v = c1271o.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f14641u) - this.f14679V) + i : paddingLeft + this.f14679V + i;
    }
}
