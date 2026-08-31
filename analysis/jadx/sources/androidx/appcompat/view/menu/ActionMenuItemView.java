package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import g.AbstractC1066a;
import l.AbstractC1200c;
import l.C1199b;
import l.C1211n;
import l.InterfaceC1208k;
import l.MenuC1209l;
import l.y;
import m.C1292Z;
import m.InterfaceC1314k;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C1292Z implements y, View.OnClickListener, InterfaceC1314k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InterfaceC1208k f9056A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1199b f9057B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AbstractC1200c f9058C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f9059D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9060E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f9061F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f9062G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f9063H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1211n f9064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f9065y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f9066z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f9059D = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1066a.f12788c, 0, 0);
        this.f9061F = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f9063H = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f9062G = -1;
        setSaveEnabled(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1314k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.y
    public final void b(C1211n c1211n) {
        this.f9064x = c1211n;
        setIcon(c1211n.getIcon());
        setTitle(c1211n.getTitleCondensed());
        setId(c1211n.f14378a);
        setVisibility(c1211n.isVisible() ? 0 : 8);
        setEnabled(c1211n.isEnabled());
        if (c1211n.hasSubMenu() && this.f9057B == null) {
            this.f9057B = new C1199b(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1314k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f9064x.getIcon() == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i7 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i7 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.y
    public C1211n getItemData() {
        return this.f9064x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f9065y);
        if (this.f9066z != null && ((this.f9064x.f14399y & 4) != 4 || (!this.f9059D && !this.f9060E))) {
            z5 = false;
        }
        boolean z7 = z6 & z5;
        setText(z7 ? this.f9065y : null);
        CharSequence charSequence = this.f9064x.f14391q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z7 ? null : this.f9064x.f14382e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f9064x.f14392r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC1397A.C(this, z7 ? null : this.f9064x.f14382e);
        } else {
            AbstractC1397A.C(this, charSequence2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1208k interfaceC1208k = this.f9056A;
        if (interfaceC1208k != null) {
            interfaceC1208k.c(this.f9064x);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9059D = g();
        h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1292Z, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i7) {
        int i8;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i8 = this.f9062G) >= 0) {
            super.setPadding(i8, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i7);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i9 = this.f9061F;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i9) : i9;
        if (mode != 1073741824 && i9 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i7);
        }
        if (!zIsEmpty || this.f9066z == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f9066z.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1199b c1199b;
        if (this.f9064x.hasSubMenu() && (c1199b = this.f9057B) != null && c1199b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setExpandedFormat(boolean z5) {
        if (this.f9060E != z5) {
            this.f9060E = z5;
            C1211n c1211n = this.f9064x;
            if (c1211n != null) {
                MenuC1209l menuC1209l = c1211n.f14388n;
                menuC1209l.f14358k = true;
                menuC1209l.p(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(Drawable drawable) {
        this.f9066z = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f9063H;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemInvoker(InterfaceC1208k interfaceC1208k) {
        this.f9056A = interfaceC1208k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i7, int i8, int i9) {
        this.f9062G = i;
        super.setPadding(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPopupCallback(AbstractC1200c abstractC1200c) {
        this.f9058C = abstractC1200c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(CharSequence charSequence) {
        this.f9065y = charSequence;
        h();
    }
}
