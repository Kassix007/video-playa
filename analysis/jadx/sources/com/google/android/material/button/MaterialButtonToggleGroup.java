package com.google.android.material.button;

import C0.L;
import I2.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.datepicker.i;
import com.google.android.material.timepicker.f;
import com.wnapp.smspariaz.R;
import d4.C1007d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k3.d;
import l4.m;
import s4.j;
import s4.k;
import w1.AbstractC1835K;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f11431A = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f11432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f11433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f11434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final L f11435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer[] f11436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11439x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f11440y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashSet f11441z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f11432q = new ArrayList();
        this.f11433r = new d(25, this);
        this.f11434s = new LinkedHashSet();
        this.f11435t = new L(2, this);
        this.f11437v = false;
        this.f11441z = new HashSet();
        TypedArray typedArrayG = m.g(getContext(), attributeSet, V3.a.f7985n, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayG.getBoolean(3, false));
        this.f11440y = typedArrayG.getResourceId(1, -1);
        this.f11439x = typedArrayG.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayG.getBoolean(0, true));
        typedArrayG.recycle();
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        setImportantForAccessibility(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getVisibleButtonCount() {
        int i = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if ((getChildAt(i7) instanceof MaterialButton) && c(i7)) {
                i++;
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f11433r);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f11421E);
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f11432q.add(new C1007d(shapeAppearanceModel.f16529e, shapeAppearanceModel.f16531h, shapeAppearanceModel.f, shapeAppearanceModel.f16530g));
        materialButton.setEnabled(isEnabled());
        AbstractC1835K.m(materialButton, new i(1, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, boolean z5) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f11441z);
        if (z5 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f11438w && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z5 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f11439x || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Set set) {
        HashSet hashSet = this.f11441z;
        this.f11441z = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f11437v = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f11437v = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f11434s.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f11435t);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f11436u = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        C1007d c1007d;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                j jVarE = materialButton.getShapeAppearanceModel().e();
                C1007d c1007d2 = (C1007d) this.f11432q.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z5 = getOrientation() == 0;
                    s4.a aVar = C1007d.f12290e;
                    if (i == firstVisibleChildIndex) {
                        c1007d = z5 ? m.f(this) ? new C1007d(aVar, aVar, c1007d2.f12292b, c1007d2.f12293c) : new C1007d(c1007d2.f12291a, c1007d2.f12294d, aVar, aVar) : new C1007d(c1007d2.f12291a, aVar, c1007d2.f12292b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        c1007d = z5 ? m.f(this) ? new C1007d(c1007d2.f12291a, c1007d2.f12294d, aVar, aVar) : new C1007d(aVar, aVar, c1007d2.f12292b, c1007d2.f12293c) : new C1007d(aVar, c1007d2.f12294d, aVar, c1007d2.f12293c);
                    } else {
                        c1007d2 = null;
                    }
                    c1007d2 = c1007d;
                }
                if (c1007d2 == null) {
                    jVarE.f16520e = new s4.a(0.0f);
                    jVarE.f = new s4.a(0.0f);
                    jVarE.f16521g = new s4.a(0.0f);
                    jVarE.f16522h = new s4.a(0.0f);
                } else {
                    jVarE.f16520e = c1007d2.f12291a;
                    jVarE.f16522h = c1007d2.f12294d;
                    jVarE.f = c1007d2.f12292b;
                    jVarE.f16521g = c1007d2.f12293c;
                }
                materialButton.setShapeAppearanceModel(jVarE.a());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCheckedButtonId() {
        if (!this.f11438w || this.f11441z.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f11441z.iterator().next()).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f11441z.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i7) {
        Integer[] numArr = this.f11436u;
        if (numArr != null && i7 < numArr.length) {
            return numArr[i7].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f11440y;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) l.a(1, getVisibleButtonCount(), this.f11438w ? 1 : 2).f2365a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        e();
        a();
        super.onMeasure(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f11432q.remove(iIndexOfChild);
        }
        e();
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSelectionRequired(boolean z5) {
        this.f11439x = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSingleSelection(boolean z5) {
        if (this.f11438w != z5) {
            this.f11438w = z5;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f11438w ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
