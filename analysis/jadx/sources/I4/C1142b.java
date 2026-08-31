package i4;

import U.l;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.web2native.MainActivity;
import com.wnapp.smspariaz.R;
import h.C1100b;
import h.DialogInterfaceC1104f;
import java.util.WeakHashMap;
import k.C1170c;
import l4.m;
import s4.g;
import s4.j;
import w1.AbstractC1826B;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: i4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1142b extends l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f13638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f13639t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C1142b(MainActivity mainActivity) {
        TypedValue typedValueM = AbstractC0597a.M(mainActivity, R.attr.materialAlertDialogTheme);
        int i = typedValueM == null ? 0 : typedValueM.data;
        Context contextA = x4.a.a(mainActivity, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextA = i != 0 ? new C1170c(contextA, i) : contextA;
        TypedValue typedValueM2 = AbstractC0597a.M(mainActivity, R.attr.materialAlertDialogTheme);
        super(contextA, typedValueM2 == null ? 0 : typedValueM2.data);
        ContextThemeWrapper contextThemeWrapper = ((C1100b) this.f7511r).f13247a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        m.a(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = V3.a.f7982k;
        m.b(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f13639t = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        TypedValue typedValueO = AbstractC0597a.O(contextThemeWrapper, R.attr.colorSurface, C1142b.class.getCanonicalName());
        int i7 = typedValueO.resourceId;
        int color = i7 != 0 ? contextThemeWrapper.getColor(i7) : typedValueO.data;
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color2 = typedArrayObtainStyledAttributes2.getColor(4, color);
        typedArrayObtainStyledAttributes2.recycle();
        g gVar = new g(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        gVar.i(contextThemeWrapper);
        gVar.k(ColorStateList.valueOf(color2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((C1100b) this.f7511r).f13247a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                j jVarE = gVar.f16505q.f16479a.e();
                jVarE.f16520e = new s4.a(dimension);
                jVarE.f = new s4.a(dimension);
                jVarE.f16521g = new s4.a(dimension);
                jVarE.f16522h = new s4.a(dimension);
                gVar.setShapeAppearanceModel(jVarE.a());
            }
        }
        this.f13638s = gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U.l
    public final DialogInterfaceC1104f f() {
        DialogInterfaceC1104f dialogInterfaceC1104fF = super.f();
        Window window = dialogInterfaceC1104fF.getWindow();
        View decorView = window.getDecorView();
        g gVar = this.f13638s;
        if (gVar != null) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            gVar.j(AbstractC1826B.e(decorView));
        }
        Rect rect = this.f13639t;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) gVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ViewOnTouchListenerC1141a(dialogInterfaceC1104fF, rect));
        return dialogInterfaceC1104fF;
    }
}
