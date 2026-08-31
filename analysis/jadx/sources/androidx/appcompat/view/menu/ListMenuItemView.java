package androidx.appcompat.view.menu;

import B0.G0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.wnapp.smspariaz.R;
import g.AbstractC1066a;
import l.C1211n;
import l.MenuC1209l;
import l.y;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f9069A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Context f9070B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9071C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Drawable f9072D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f9073E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LayoutInflater f9074F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9075G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1211n f9076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f9077r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RadioButton f9078s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f9079t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CheckBox f9080u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f9081v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f9082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f9083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f9084y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Drawable f9085z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        G0 g0N = G0.N(getContext(), attributeSet, AbstractC1066a.f12800r, R.attr.listMenuViewStyle);
        this.f9085z = g0N.y(5);
        TypedArray typedArray = (TypedArray) g0N.f235s;
        this.f9069A = typedArray.getResourceId(1, -1);
        this.f9071C = typedArray.getBoolean(7, false);
        this.f9070B = context;
        this.f9072D = g0N.y(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f9073E = typedArrayObtainStyledAttributes.hasValue(0);
        g0N.R();
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private LayoutInflater getInflater() {
        if (this.f9074F == null) {
            this.f9074F = LayoutInflater.from(getContext());
        }
        return this.f9074F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f9082w;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f9083x;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9083x.getLayoutParams();
        rect.top = this.f9083x.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // l.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(l.C1211n r11) {
        /*
            r10 = this;
            r10.f9076q = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f14382e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            l.l r0 = r11.f14388n
            boolean r0 = r0.o()
            r3 = 1
            if (r0 == 0) goto L37
            l.l r0 = r11.f14388n
            boolean r0 = r0.n()
            if (r0 == 0) goto L31
            char r0 = r11.j
            goto L33
        L31:
            char r0 = r11.f14384h
        L33:
            if (r0 == 0) goto L37
            r0 = r3
            goto L38
        L37:
            r0 = r2
        L38:
            l.l r4 = r11.f14388n
            r4.n()
            if (r0 == 0) goto L5e
            l.n r0 = r10.f9076q
            l.l r4 = r0.f14388n
            boolean r4 = r4.o()
            if (r4 == 0) goto L5a
            l.l r4 = r0.f14388n
            boolean r4 = r4.n()
            if (r4 == 0) goto L54
            char r0 = r0.j
            goto L56
        L54:
            char r0 = r0.f14384h
        L56:
            if (r0 == 0) goto L5a
            r0 = r3
            goto L5b
        L5a:
            r0 = r2
        L5b:
            if (r0 == 0) goto L5e
            goto L5f
        L5e:
            r2 = r1
        L5f:
            if (r2 != 0) goto L119
            android.widget.TextView r0 = r10.f9081v
            l.n r4 = r10.f9076q
            l.l r5 = r4.f14388n
            android.content.Context r6 = r5.f14351a
            boolean r7 = r5.n()
            if (r7 == 0) goto L72
            char r7 = r4.j
            goto L74
        L72:
            char r7 = r4.f14384h
        L74:
            if (r7 != 0) goto L7a
            java.lang.String r1 = ""
            goto L116
        L7a:
            android.content.res.Resources r8 = r6.getResources()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L97
            r6 = 2131820561(0x7f110011, float:1.927384E38)
            java.lang.String r6 = r8.getString(r6)
            r9.append(r6)
        L97:
            boolean r5 = r5.n()
            if (r5 == 0) goto La0
            int r4 = r4.f14385k
            goto La2
        La0:
            int r4 = r4.i
        La2:
            r5 = 2131820557(0x7f11000d, float:1.9273832E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 65536(0x10000, float:9.18355E-41)
            l.C1211n.c(r4, r6, r5, r9)
            r5 = 2131820553(0x7f110009, float:1.9273824E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 4096(0x1000, float:5.74E-42)
            l.C1211n.c(r4, r6, r5, r9)
            r5 = 2131820552(0x7f110008, float:1.9273822E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 2
            l.C1211n.c(r4, r6, r5, r9)
            r5 = 2131820558(0x7f11000e, float:1.9273834E38)
            java.lang.String r5 = r8.getString(r5)
            l.C1211n.c(r4, r3, r5, r9)
            r3 = 2131820560(0x7f110010, float:1.9273838E38)
            java.lang.String r3 = r8.getString(r3)
            r5 = 4
            l.C1211n.c(r4, r5, r3, r9)
            r3 = 2131820556(0x7f11000c, float:1.927383E38)
            java.lang.String r3 = r8.getString(r3)
            l.C1211n.c(r4, r1, r3, r9)
            if (r7 == r1) goto L108
            r1 = 10
            if (r7 == r1) goto Lfd
            r1 = 32
            if (r7 == r1) goto Lf2
            r9.append(r7)
            goto L112
        Lf2:
            r1 = 2131820559(0x7f11000f, float:1.9273836E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L112
        Lfd:
            r1 = 2131820555(0x7f11000b, float:1.9273828E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L112
        L108:
            r1 = 2131820554(0x7f11000a, float:1.9273826E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
        L112:
            java.lang.String r1 = r9.toString()
        L116:
            r0.setText(r1)
        L119:
            android.widget.TextView r0 = r10.f9081v
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L126
            android.widget.TextView r0 = r10.f9081v
            r0.setVisibility(r2)
        L126:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f14391q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(l.n):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.y
    public C1211n getItemData() {
        return this.f9076q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f9085z);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f9079t = textView;
        int i = this.f9069A;
        if (i != -1) {
            textView.setTextAppearance(this.f9070B, i);
        }
        this.f9081v = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f9082w = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f9072D);
        }
        this.f9083x = (ImageView) findViewById(R.id.group_divider);
        this.f9084y = (LinearLayout) findViewById(R.id.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        if (this.f9077r != null && this.f9071C) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9077r.getLayoutParams();
            int i8 = layoutParams.height;
            if (i8 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i8;
            }
        }
        super.onMeasure(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f9078s == null && this.f9080u == null) {
            return;
        }
        if ((this.f9076q.f14398x & 4) != 0) {
            if (this.f9078s == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f9078s = radioButton;
                LinearLayout linearLayout = this.f9084y;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f9078s;
            view = this.f9080u;
        } else {
            if (this.f9080u == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f9080u = checkBox;
                LinearLayout linearLayout2 = this.f9084y;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f9080u;
            view = this.f9078s;
        }
        if (z5) {
            compoundButton.setChecked(this.f9076q.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f9080u;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f9078s;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if ((this.f9076q.f14398x & 4) != 0) {
            if (this.f9078s == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f9078s = radioButton;
                LinearLayout linearLayout = this.f9084y;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f9078s;
        } else {
            if (this.f9080u == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f9080u = checkBox;
                LinearLayout linearLayout2 = this.f9084y;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f9080u;
        }
        compoundButton.setChecked(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setForceShowIcon(boolean z5) {
        this.f9075G = z5;
        this.f9071C = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.f9083x;
        if (imageView != null) {
            imageView.setVisibility((this.f9073E || !z5) ? 8 : 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(Drawable drawable) {
        MenuC1209l menuC1209l = this.f9076q.f14388n;
        boolean z5 = this.f9075G;
        if (z5 || this.f9071C) {
            ImageView imageView = this.f9077r;
            if (imageView == null && drawable == null && !this.f9071C) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f9077r = imageView2;
                LinearLayout linearLayout = this.f9084y;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f9071C) {
                this.f9077r.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f9077r;
            if (!z5) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f9077r.getVisibility() != 0) {
                this.f9077r.setVisibility(0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f9079t.getVisibility() != 8) {
                this.f9079t.setVisibility(8);
            }
        } else {
            this.f9079t.setText(charSequence);
            if (this.f9079t.getVisibility() != 0) {
                this.f9079t.setVisibility(0);
            }
        }
    }
}
