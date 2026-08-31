package l4;

import B0.G0;
import C0.S;
import I2.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.WorkDatabaseVersions;
import com.google.android.material.appbar.MaterialToolbar;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.AbstractC1862z;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f14577a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f14578b = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f14579c = new A(8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context, AttributeSet attributeSet, int i, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V3.a.f7974G, i, i7);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z5) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f14578b, "Theme.MaterialComponents");
            }
        }
        c(context, f14577a, "Theme.AppCompat");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i7, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V3.a.f7974G, i, i7);
        boolean z5 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i7);
            for (int i8 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i8, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z5 = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z5 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z5) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(S.n("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(View view, p pVar) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        q qVar = new q();
        qVar.f14582a = paddingStart;
        qVar.f14583b = paddingTop;
        qVar.f14584c = paddingEnd;
        qVar.f14585d = paddingBottom;
        AbstractC1826B.l(view, new Z.m(19, pVar, qVar));
        if (view.isAttachedToWindow()) {
            AbstractC1862z.c(view);
        } else {
            view.addOnAttachStateChangeListener(new o());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList e(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean f(View view) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        return view.getLayoutDirection() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypedArray g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i7, int... iArr2) {
        a(context, attributeSet, i, i7);
        b(context, attributeSet, iArr, i, i7, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static G0 h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i7, int... iArr2) {
        a(context, attributeSet, i, i7);
        b(context, attributeSet, iArr, i, i7, iArr2);
        return new G0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static PorterDuff.Mode i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
