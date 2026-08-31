package v4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import n1.AbstractC1393a;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class r extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f17699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f17700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f17701c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f17701c = sVar;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        ColorStateList colorStateList;
        s sVar = this.f17701c;
        ColorStateList colorStateList2 = sVar.f17703B;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f17700b = colorStateList;
        if (sVar.f17702A != 0 && sVar.f17703B != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC1393a.c(sVar.f17703B.getColorForState(iArr3, 0), sVar.f17702A), AbstractC1393a.c(sVar.f17703B.getColorForState(iArr2, 0), sVar.f17702A), sVar.f17702A});
        }
        this.f17699a = colorStateList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            s sVar = this.f17701c;
            Drawable rippleDrawable = null;
            if (sVar.getText().toString().contentEquals(textView.getText()) && sVar.f17702A != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(sVar.f17702A);
                if (this.f17700b != null) {
                    colorDrawable.setTintList(this.f17699a);
                    rippleDrawable = new RippleDrawable(this.f17700b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
