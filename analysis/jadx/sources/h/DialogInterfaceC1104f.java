package h;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import java.util.WeakHashMap;
import w1.AbstractC1827C;
import w1.AbstractC1835K;
import w1.InterfaceC1846i;

/* JADX INFO: renamed from: h.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC1104f extends b.m implements DialogInterface, InterfaceC1107i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y f13291t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z f13292u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1103e f13293v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.z] */
    public DialogInterfaceC1104f(ContextThemeWrapper contextThemeWrapper, int i) {
        int i7;
        int iG = g(contextThemeWrapper, i);
        if (iG == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i7 = typedValue.resourceId;
        } else {
            i7 = iG;
        }
        super(contextThemeWrapper, i7);
        this.f13292u = new InterfaceC1846i() { // from class: h.z
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // w1.InterfaceC1846i
            public final boolean c(KeyEvent keyEvent) {
                return this.f13393q.i(keyEvent);
            }
        };
        l lVarE = e();
        if (iG == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iG = typedValue2.resourceId;
        }
        ((y) lVarE).f13378k0 = iG;
        lVarE.c();
        this.f13293v = new C1103e(getContext(), this, getWindow());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        y yVar = (y) e();
        yVar.v();
        ((ViewGroup) yVar.f13359R.findViewById(android.R.id.content)).addView(view, layoutParams);
        yVar.f13344C.a(yVar.f13343B.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0836n2.n(this.f13292u, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l e() {
        if (this.f13291t == null) {
            androidx.room.F f = l.f13301q;
            this.f13291t = new y(getContext(), getWindow(), this, this);
        }
        return this.f13291t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final View findViewById(int i) {
        y yVar = (y) e();
        yVar.v();
        return yVar.f13343B.findViewById(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().l(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        y yVar = (y) e();
        if (yVar.f13346E != null) {
            yVar.z();
            yVar.f13346E.getClass();
            yVar.A(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        f(bundle);
        C1103e c1103e = this.f13293v;
        c1103e.f13269b.setContentView(c1103e.f13288x);
        Context context = c1103e.f13268a;
        Window window = c1103e.f13270c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = C1103e.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = C1103e.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = C1103e.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1103e.f13280p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1103e.f13280p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        c1103e.f13284t = textView;
        if (textView != null) {
            String str = c1103e.f13272e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                c1103e.f13280p.removeView(c1103e.f13284t);
                if (c1103e.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c1103e.f13280p.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c1103e.f13280p);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c1103e.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupA2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        c1103e.f13273g = button;
        com.google.android.material.datepicker.k kVar = c1103e.f13267D;
        button.setOnClickListener(kVar);
        if (TextUtils.isEmpty(c1103e.f13274h)) {
            c1103e.f13273g.setVisibility(8);
            i = 0;
        } else {
            c1103e.f13273g.setText(c1103e.f13274h);
            c1103e.f13273g.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        c1103e.j = button2;
        button2.setOnClickListener(kVar);
        if (TextUtils.isEmpty(c1103e.f13275k)) {
            c1103e.j.setVisibility(8);
        } else {
            c1103e.j.setText(c1103e.f13275k);
            c1103e.j.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        c1103e.f13277m = button3;
        button3.setOnClickListener(kVar);
        if (TextUtils.isEmpty(c1103e.f13278n)) {
            c1103e.f13277m.setVisibility(8);
        } else {
            c1103e.f13277m.setText(c1103e.f13278n);
            c1103e.f13277m.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c1103e.f13273g;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c1103e.j;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c1103e.f13277m;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (c1103e.f13285u != null) {
            viewGroupA.addView(c1103e.f13285u, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c1103e.f13282r = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c1103e.f13271d) || !c1103e.f13265B) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c1103e.f13282r.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c1103e.f13283s = textView2;
                textView2.setText(c1103e.f13271d);
                Drawable drawable = c1103e.f13281q;
                if (drawable != null) {
                    c1103e.f13282r.setImageDrawable(drawable);
                } else {
                    c1103e.f13283s.setPadding(c1103e.f13282r.getPaddingLeft(), c1103e.f13282r.getPaddingTop(), c1103e.f13282r.getPaddingRight(), c1103e.f13282r.getPaddingBottom());
                    c1103e.f13282r.setVisibility(8);
                }
            }
        }
        boolean z5 = viewGroup.getVisibility() != 8;
        int i7 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z6 = viewGroupA3.getVisibility() != 8;
        if (!z6 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = c1103e.f13280p;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c1103e.f13272e == null && c1103e.f == null) ? null : viewGroupA.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c1103e.f;
        if (alertController$RecycleListView != null && (!z6 || i7 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i7 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f9054q, alertController$RecycleListView.getPaddingRight(), z6 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f9055r);
        }
        if (!z5) {
            View view = c1103e.f;
            if (view == null) {
                view = c1103e.f13280p;
            }
            if (view != null) {
                int i8 = z6 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                AbstractC1827C.b(view, i7 | i8, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c1103e.f;
        if (alertController$RecycleListView2 == null || (listAdapter = c1103e.f13286v) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i9 = c1103e.f13287w;
        if (i9 > -1) {
            alertController$RecycleListView2.setItemChecked(i9, true);
            alertController$RecycleListView2.setSelection(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13293v.f13280p;
        if (nestedScrollView == null || !nestedScrollView.f(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13293v.f13280p;
        if (nestedScrollView == null || !nestedScrollView.f(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        y yVar = (y) e();
        yVar.z();
        I i = yVar.f13346E;
        if (i != null) {
            i.f13233M = false;
            k.j jVar = i.f13232L;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.m, android.app.Dialog
    public final void setContentView(int i) {
        d();
        e().h(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().l(getContext().getString(i));
    }

    @Override // b.m, android.app.Dialog
    public final void setContentView(View view) {
        d();
        e().j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        C1103e c1103e = this.f13293v;
        c1103e.f13271d = charSequence;
        TextView textView = c1103e.f13283s;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // b.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().k(view, layoutParams);
    }
}
