package n4;

import B0.G0;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.I1;
import com.wnapp.smspariaz.R;
import i1.C1134a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.x;
import l.z;
import l4.m;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f15282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b4.b f15283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f15284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k.h f15285t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f15286u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(Context context) {
        super(x4.a.a(context, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), null, R.attr.bottomNavigationStyle);
        g gVar = new g();
        gVar.f15279r = false;
        this.f15284s = gVar;
        Context context2 = getContext();
        G0 g0H = m.h(context2, null, V3.a.f7995x, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 12, 10);
        d dVar = new d(context2, getClass(), getMaxItemCount());
        this.f15282q = dVar;
        b4.b bVar = new b4.b(context2);
        this.f15283r = bVar;
        gVar.f15278q = bVar;
        gVar.f15280s = 1;
        bVar.setPresenter(gVar);
        dVar.b(gVar, dVar.f14351a);
        getContext();
        gVar.f15278q.f15265U = dVar;
        TypedArray typedArray = (TypedArray) g0H.f235s;
        if (typedArray.hasValue(6)) {
            bVar.setIconTintList(g0H.w(6));
        } else {
            bVar.setIconTintList(bVar.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(g0H.w(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListA = AbstractC0597a.A(background);
        if (background == null || colorStateListA != null) {
            s4.g gVar2 = new s4.g(s4.k.b(context2, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (colorStateListA != null) {
                gVar2.k(colorStateListA);
            }
            gVar2.i(context2);
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            setBackground(gVar2);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(I1.Y(context2, g0H, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            bVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(I1.Y(context2, g0H, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, V3.a.f7994w);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(I1.Z(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(s4.k.a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new s4.a(0)).a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            gVar.f15279r = true;
            getMenuInflater().inflate(resourceId3, dVar);
            gVar.f15279r = false;
            gVar.h(true);
        }
        g0H.R();
        addView(bVar);
        dVar.f14355e = new C1134a(6, (b4.e) this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private MenuInflater getMenuInflater() {
        if (this.f15285t == null) {
            this.f15285t = new k.h(getContext());
        }
        return this.f15285t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getActiveIndicatorLabelPadding() {
        return this.f15283r.getActiveIndicatorLabelPadding();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f15283r.getItemActiveIndicatorColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemActiveIndicatorHeight() {
        return this.f15283r.getItemActiveIndicatorHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f15283r.getItemActiveIndicatorMarginHorizontal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s4.k getItemActiveIndicatorShapeAppearance() {
        return this.f15283r.getItemActiveIndicatorShapeAppearance();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemActiveIndicatorWidth() {
        return this.f15283r.getItemActiveIndicatorWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getItemBackground() {
        return this.f15283r.getItemBackground();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f15283r.getItemBackgroundRes();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemIconSize() {
        return this.f15283r.getItemIconSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getItemIconTintList() {
        return this.f15283r.getIconTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemPaddingBottom() {
        return this.f15283r.getItemPaddingBottom();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemPaddingTop() {
        return this.f15283r.getItemPaddingTop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getItemRippleColor() {
        return this.f15283r.getItemRippleColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemTextAppearanceActive() {
        return this.f15283r.getItemTextAppearanceActive();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemTextAppearanceInactive() {
        return this.f15283r.getItemTextAppearanceInactive();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getItemTextColor() {
        return this.f15283r.getItemTextColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getLabelVisibilityMode() {
        return this.f15283r.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Menu getMenu() {
        return this.f15282q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z getMenuView() {
        return this.f15283r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g getPresenter() {
        return this.f15284s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSelectedItemId() {
        return this.f15283r.getSelectedItemId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof s4.g) {
            C3.a.Q(this, (s4.g) background);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f1163q);
        Bundle bundle = jVar.f15281s;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15282q.f14368u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = xVar.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    xVar.d(parcelable2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableK;
        j jVar = new j(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        jVar.f15281s = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15282q.f14368u;
        if (copyOnWriteArrayList.isEmpty()) {
            return jVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = xVar.getId();
                if (id > 0 && (parcelableK = xVar.k()) != null) {
                    sparseArray.put(id, parcelableK);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return jVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActiveIndicatorLabelPadding(int i) {
        this.f15283r.setActiveIndicatorLabelPadding(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof s4.g) {
            ((s4.g) background).j(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f15283r.setItemActiveIndicatorColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.f15283r.setItemActiveIndicatorEnabled(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorHeight(int i) {
        this.f15283r.setItemActiveIndicatorHeight(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f15283r.setItemActiveIndicatorMarginHorizontal(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorShapeAppearance(s4.k kVar) {
        this.f15283r.setItemActiveIndicatorShapeAppearance(kVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorWidth(int i) {
        this.f15283r.setItemActiveIndicatorWidth(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemBackground(Drawable drawable) {
        this.f15283r.setItemBackground(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemBackgroundResource(int i) {
        this.f15283r.setItemBackgroundRes(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemIconSize(int i) {
        this.f15283r.setItemIconSize(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f15283r.setIconTintList(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemPaddingBottom(int i) {
        this.f15283r.setItemPaddingBottom(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemPaddingTop(int i) {
        this.f15283r.setItemPaddingTop(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f15283r.setItemRippleColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemTextAppearanceActive(int i) {
        this.f15283r.setItemTextAppearanceActive(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.f15283r.setItemTextAppearanceActiveBoldEnabled(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemTextAppearanceInactive(int i) {
        this.f15283r.setItemTextAppearanceInactive(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemTextColor(ColorStateList colorStateList) {
        this.f15283r.setItemTextColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLabelVisibilityMode(int i) {
        b4.b bVar = this.f15283r;
        if (bVar.getLabelVisibilityMode() != i) {
            bVar.setLabelVisibilityMode(i);
            this.f15284s.h(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnItemSelectedListener(i iVar) {
        this.f15286u = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSelectedItemId(int i) {
        d dVar = this.f15282q;
        MenuItem menuItemFindItem = dVar.findItem(i);
        if (menuItemFindItem == null || dVar.q(menuItemFindItem, this.f15284s, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setOnItemReselectedListener(h hVar) {
    }
}
