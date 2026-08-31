package a6;

import B0.G0;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import g.AbstractC1066a;
import m.AbstractC1313j0;
import m.C1326q;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9038e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Enum f9039g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j(TextView textView, int i) {
        this.f9034a = i;
        this.f = null;
        this.f9039g = null;
        this.f9035b = false;
        this.f9036c = false;
        this.f9038e = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f9038e;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f9035b || this.f9036c) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f9035b) {
                    drawableMutate.setTintList((ColorStateList) this.f);
                }
                if (this.f9036c) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f9039g);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        C1326q c1326q = (C1326q) this.f9038e;
        Drawable checkMarkDrawable = c1326q.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f9035b || this.f9036c) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f9035b) {
                    drawableMutate.setTintList((ColorStateList) this.f);
                }
                if (this.f9036c) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f9039g);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c1326q.getDrawableState());
                }
                c1326q.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f9038e;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC1066a.f12795m;
        G0 g0N = G0.N(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) g0N.f235s;
        AbstractC1835K.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) g0N.f235s, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0597a.C(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC0597a.C(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0597a.C(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(g0N.w(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC1313j0.b(typedArray.getInt(3, -1), null));
            }
            g0N.R();
        } catch (Throwable th) {
            g0N.R();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f9034a) {
            case 0:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f9035b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f9036c + ", prettyPrintIndent='" + ((String) this.f9038e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f9037d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((EnumC0635a) this.f9039g) + ')';
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public j(boolean z5, boolean z6, String prettyPrintIndent, String classDiscriminator, boolean z7, EnumC0635a classDiscriminatorMode) {
        this.f9034a = 0;
        kotlin.jvm.internal.m.e(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.m.e(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.m.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f9035b = z5;
        this.f9036c = z6;
        this.f9038e = prettyPrintIndent;
        this.f = classDiscriminator;
        this.f9037d = z7;
        this.f9039g = classDiscriminatorMode;
    }
}
