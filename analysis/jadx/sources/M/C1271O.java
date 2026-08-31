package m;

import a.AbstractC0597a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import l.ViewTreeObserverOnGlobalLayoutListenerC1201d;

/* JADX INFO: renamed from: m.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1271O extends Spinner {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f14689y = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W1.l f14690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f14691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1253F f14692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SpinnerAdapter f14693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC1269N f14695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f14697x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1271O(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130904106(0x7f03042a, float:1.7415049E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f14697x = r1
            android.content.Context r1 = r12.getContext()
            m.AbstractC1272O0.a(r12, r1)
            int[] r1 = g.AbstractC1066a.f12803u
            B0.G0 r2 = B0.G0.N(r13, r14, r1, r0)
            java.lang.Object r3 = r2.f235s
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            W1.l r4 = new W1.l
            r4.<init>(r12)
            r12.f14690q = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            k.c r6 = new k.c
            r6.<init>(r13, r4)
            r12.f14691r = r6
            goto L37
        L35:
            r12.f14691r = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = m.C1271O.f14689y     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            m.L r4 = new m.L
            android.content.Context r9 = r12.f14691r
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f14691r
            B0.G0 r1 = B0.G0.N(r9, r14, r1, r0)
            java.lang.Object r9 = r1.f235s
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.f14696w = r9
            android.graphics.drawable.Drawable r9 = r1.y(r8)
            r4.g(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f14676S = r7
            r1.R()
            r12.f14695v = r4
            m.F r1 = new m.F
            r1.<init>(r12, r12, r4)
            r12.f14692s = r1
            goto Laa
        L9d:
            m.H r1 = new m.H
            r1.<init>(r12)
            r12.f14695v = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f14659s = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131492975(0x7f0c006f, float:1.8609417E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.R()
            r12.f14694u = r8
            android.widget.SpinnerAdapter r13 = r12.f14693t
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f14693t = r6
        Lcf:
            W1.l r13 = r12.f14690q
            r13.e(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1271O.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f14697x;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W1.l lVar = this.f14690q;
        if (lVar != null) {
            lVar.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1269N interfaceC1269N = this.f14695v;
        return interfaceC1269N != null ? interfaceC1269N.b() : super.getDropDownHorizontalOffset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1269N interfaceC1269N = this.f14695v;
        return interfaceC1269N != null ? interfaceC1269N.m() : super.getDropDownVerticalOffset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f14695v != null ? this.f14696w : super.getDropDownWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1269N getInternalPopup() {
        return this.f14695v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1269N interfaceC1269N = this.f14695v;
        return interfaceC1269N != null ? interfaceC1269N.d() : super.getPopupBackground();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f14691r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1269N interfaceC1269N = this.f14695v;
        return interfaceC1269N != null ? interfaceC1269N.o() : super.getPrompt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        W1.l lVar = this.f14690q;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        W1.l lVar = this.f14690q;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1269N interfaceC1269N = this.f14695v;
        if (interfaceC1269N == null || !interfaceC1269N.a()) {
            return;
        }
        interfaceC1269N.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i7) {
        super.onMeasure(i, i7);
        if (this.f14695v == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1267M c1267m = (C1267M) parcelable;
        super.onRestoreInstanceState(c1267m.getSuperState());
        if (!c1267m.f14688q || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1201d(2, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1267M c1267m = new C1267M(super.onSaveInstanceState());
        InterfaceC1269N interfaceC1269N = this.f14695v;
        c1267m.f14688q = interfaceC1269N != null && interfaceC1269N.a();
        return c1267m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1253F c1253f = this.f14692s;
        if (c1253f == null || !c1253f.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1269N interfaceC1269N = this.f14695v;
        if (interfaceC1269N == null) {
            return super.performClick();
        }
        if (interfaceC1269N.a()) {
            return true;
        }
        this.f14695v.k(getTextDirection(), getTextAlignment());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        W1.l lVar = this.f14690q;
        if (lVar != null) {
            lVar.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        W1.l lVar = this.f14690q;
        if (lVar != null) {
            lVar.h(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1269N interfaceC1269N = this.f14695v;
        if (interfaceC1269N == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1269N.i(i);
            interfaceC1269N.j(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1269N interfaceC1269N = this.f14695v;
        if (interfaceC1269N != null) {
            interfaceC1269N.h(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f14695v != null) {
            this.f14696w = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1269N interfaceC1269N = this.f14695v;
        if (interfaceC1269N != null) {
            interfaceC1269N.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC0597a.C(getPopupContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1269N interfaceC1269N = this.f14695v;
        if (interfaceC1269N != null) {
            interfaceC1269N.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        W1.l lVar = this.f14690q;
        if (lVar != null) {
            lVar.j(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        W1.l lVar = this.f14690q;
        if (lVar != null) {
            lVar.k(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAdapter(Landroid/widget/Adapter;)V */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f14694u) {
            this.f14693t = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1269N interfaceC1269N = this.f14695v;
        if (interfaceC1269N != null) {
            Context context = this.f14691r;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1259I c1259i = new C1259I();
            c1259i.f14663a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1259i.f14664b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC1255G.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1269N.p(c1259i);
        }
    }
}
