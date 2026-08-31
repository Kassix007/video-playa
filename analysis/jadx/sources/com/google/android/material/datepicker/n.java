package com.google.android.material.datepicker;

import J1.DialogInterfaceOnCancelListenerC0181m;
import a.AbstractC0597a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.wnapp.smspariaz.R;
import i3.C1136a;
import i4.ViewOnTouchListenerC1141a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n1.AbstractC1393a;
import n5.AbstractC1397A;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.p0;
import w1.q0;
import w1.r0;
import w1.s0;

/* JADX INFO: loaded from: classes.dex */
public final class n<S> extends DialogInterfaceOnCancelListenerC0181m {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f11509A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public v f11510B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public b f11511C0;
    public l D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f11512E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public CharSequence f11513F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f11514G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f11515H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f11516I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public CharSequence f11517J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f11518K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public CharSequence f11519L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f11520M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public CharSequence f11521N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f11522O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public CharSequence f11523P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public TextView f11524Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public CheckableImageButton f11525R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public s4.g f11526S0;
    public boolean T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public CharSequence f11527U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public CharSequence f11528V0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final LinkedHashSet f11529y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final LinkedHashSet f11530z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f11529y0 = new LinkedHashSet();
        this.f11530z0 = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = y.b();
        calendarB.set(5, 1);
        Calendar calendarA = y.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean J(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0597a.O(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, new int[]{i});
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.DialogInterfaceOnCancelListenerC0181m
    public final Dialog G() {
        Context contextC = C();
        C();
        int i = this.f11509A0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(contextC, i);
        Context context = dialog.getContext();
        this.f11514G0 = J(context, android.R.attr.windowFullscreen);
        this.f11526S0 = new s4.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, V3.a.f7986o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f11526S0.i(context);
        this.f11526S0.k(ColorStateList.valueOf(color));
        s4.g gVar = this.f11526S0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        gVar.j(AbstractC1826B.e(decorView));
        return dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H() {
        if (this.f2723v.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.DialogInterfaceOnCancelListenerC0181m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f11529y0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.DialogInterfaceOnCancelListenerC0181m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f11530z0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f2703U;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.DialogInterfaceOnCancelListenerC0181m, J1.AbstractComponentCallbacksC0185q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f2723v;
        }
        this.f11509A0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f11511C0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f11512E0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f11513F0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f11515H0 = bundle.getInt("INPUT_MODE_KEY");
        this.f11516I0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f11517J0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f11518K0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f11519L0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f11520M0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f11521N0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f11522O0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f11523P0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f11513F0;
        if (text == null) {
            text = C().getResources().getText(this.f11512E0);
        }
        this.f11527U0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f11528V0 = text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f11514G0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f11514G0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        textView.setAccessibilityLiveRegion(1);
        this.f11525R0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f11524Q0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f11525R0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f11525R0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0597a.C(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0597a.C(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f11525R0.setChecked(this.f11515H0 != 0);
        AbstractC1835K.m(this.f11525R0, null);
        CheckableImageButton checkableImageButton2 = this.f11525R0;
        this.f11525R0.setContentDescription(this.f11515H0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f11525R0.setOnClickListener(new m(0, this));
        H();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.DialogInterfaceOnCancelListenerC0181m, J1.AbstractComponentCallbacksC0185q
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f11509A0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f11511C0;
        C0948a c0948a = new C0948a();
        int i = C0948a.f11468b;
        int i7 = C0948a.f11468b;
        long j = bVar.f11470q.f11539v;
        long j7 = bVar.f11471r.f11539v;
        c0948a.f11469a = Long.valueOf(bVar.f11473t.f11539v);
        int i8 = bVar.f11474u;
        d dVar = bVar.f11472s;
        l lVar = this.D0;
        q qVar = lVar == null ? null : lVar.f11498n0;
        if (qVar != null) {
            c0948a.f11469a = Long.valueOf(qVar.f11539v);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        q qVarB = q.b(j);
        q qVarB2 = q.b(j7);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l7 = c0948a.f11469a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(qVarB, qVarB2, dVar2, l7 == null ? null : q.b(l7.longValue()), i8));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f11512E0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f11513F0);
        bundle.putInt("INPUT_MODE_KEY", this.f11515H0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f11516I0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f11517J0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f11518K0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f11519L0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f11520M0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f11521N0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f11522O0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f11523P0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.DialogInterfaceOnCancelListenerC0181m, J1.AbstractComponentCallbacksC0185q
    public final void y() {
        super.y();
        Dialog dialog = this.f2667t0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f11514G0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f11526S0);
            if (!this.T0) {
                View viewFindViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListA = AbstractC0597a.A(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z5 = false;
                boolean z6 = numValueOf == null || numValueOf.intValue() == 0;
                int iC = Q2.g.C(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z6) {
                    numValueOf = Integer.valueOf(iC);
                }
                AbstractC1397A.A(window, false);
                window.getContext();
                int iE = i < 27 ? AbstractC1393a.e(Q2.g.C(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                boolean z7 = Q2.g.H(0) || Q2.g.H(numValueOf.intValue());
                C1136a c1136a = new C1136a(window.getDecorView());
                int i7 = Build.VERSION.SDK_INT;
                (i7 >= 35 ? new s0(window, c1136a) : i7 >= 30 ? new r0(window, c1136a) : i7 >= 26 ? new q0(window, c1136a) : new p0(window, c1136a)).P(z7);
                boolean zH = Q2.g.H(iC);
                if (Q2.g.H(iE) || (iE == 0 && zH)) {
                    z5 = true;
                }
                C1136a c1136a2 = new C1136a(window.getDecorView());
                int i8 = Build.VERSION.SDK_INT;
                (i8 >= 35 ? new s0(window, c1136a2) : i8 >= 30 ? new r0(window, c1136a2) : i8 >= 26 ? new q0(window, c1136a2) : new p0(window, c1136a2)).O(z5);
                X3.b bVar = new X3.b(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                AbstractC1826B.l(viewFindViewById, bVar);
                this.T0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f11526S0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f2667t0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC1141a(dialog2, rect));
        }
        C();
        int i9 = this.f11509A0;
        if (i9 == 0) {
            H();
            throw null;
        }
        H();
        b bVar2 = this.f11511C0;
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i9);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar2.f11473t);
        lVar.F(bundle);
        this.D0 = lVar;
        v vVar = lVar;
        if (this.f11515H0 == 1) {
            H();
            b bVar3 = this.f11511C0;
            o oVar = new o();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i9);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar3);
            oVar.F(bundle2);
            vVar = oVar;
        }
        this.f11510B0 = vVar;
        this.f11524Q0.setText((this.f11515H0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.f11528V0 : this.f11527U0);
        H();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.DialogInterfaceOnCancelListenerC0181m, J1.AbstractComponentCallbacksC0185q
    public final void z() {
        this.f11510B0.f11553k0.clear();
        super.z();
    }
}
