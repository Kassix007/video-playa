package com.airbnb.lottie;

import C0.RunnableC0089m;
import C0.S;
import J2.x;
import Z.m;
import a3.AbstractC0623b;
import a3.C;
import a3.C0627f;
import a3.C0629h;
import a3.C0631j;
import a3.C0632k;
import a3.D;
import a3.EnumC0622a;
import a3.EnumC0630i;
import a3.F;
import a3.G;
import a3.H;
import a3.I;
import a3.InterfaceC0621B;
import a3.InterfaceC0624c;
import a3.J;
import a3.K;
import a3.l;
import a3.o;
import a3.s;
import a3.y;
import a3.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.wnapp.smspariaz.R;
import f3.C1063a;
import g3.e;
import j3.c;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import k1.AbstractC1175c;
import k1.i;
import m.C1338w;
import n3.g;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends C1338w {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0627f f10269G = new C0627f();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f10270A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10271B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f10272C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final HashSet f10273D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final HashSet f10274E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public F f10275F;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0631j f10276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0631j f10277u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0621B f10278v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f10280x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f10281y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10282z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        String string;
        super(context, attributeSet, 0);
        this.f10276t = new C0631j(this, 1);
        this.f10277u = new C0631j(this, 0);
        this.f10279w = 0;
        y yVar = new y();
        this.f10280x = yVar;
        this.f10270A = false;
        this.f10271B = false;
        this.f10272C = true;
        HashSet hashSet = new HashSet();
        this.f10273D = hashSet;
        this.f10274E = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, H.f8804a, R.attr.lottieAnimationViewStyle, 0);
        this.f10272C = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.f10271B = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            yVar.f8921r.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f = typedArrayObtainStyledAttributes.getFloat(15, 0.0f);
        if (zHasValue4) {
            hashSet.add(EnumC0630i.f8825r);
        }
        yVar.u(f);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        HashSet hashSet2 = (HashSet) yVar.f8887B.f14122r;
        z zVar = z.f8930q;
        boolean zAdd = z5 ? hashSet2.add(zVar) : hashSet2.remove(zVar);
        if (yVar.f8920q != null && zAdd) {
            yVar.c();
        }
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            yVar.a(new e("**"), C.f8764F, new m(new J(AbstractC1175c.b(getContext(), typedArrayObtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            int i = typedArrayObtainStyledAttributes.getInt(17, 0);
            setRenderMode(I.values()[i >= I.values().length ? 0 : i]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int i7 = typedArrayObtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(EnumC0622a.values()[i7 >= I.values().length ? 0 : i7]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setCompositionTask(F f) {
        D d5 = f.f8800d;
        y yVar = this.f10280x;
        if (d5 != null && yVar == getDrawable() && yVar.f8920q == d5.f8793a) {
            return;
        }
        this.f10273D.add(EnumC0630i.f8824q);
        this.f10280x.d();
        b();
        f.b(this.f10276t);
        f.a(this.f10277u);
        this.f10275F = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        F f = this.f10275F;
        if (f != null) {
            C0631j c0631j = this.f10276t;
            synchronized (f) {
                f.f8797a.remove(c0631j);
            }
            F f7 = this.f10275F;
            C0631j c0631j2 = this.f10277u;
            synchronized (f7) {
                f7.f8798b.remove(c0631j2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC0622a getAsyncUpdates() {
        EnumC0622a enumC0622a = this.f10280x.f8913b0;
        return enumC0622a != null ? enumC0622a : EnumC0622a.f8809q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getAsyncUpdatesEnabled() {
        EnumC0622a enumC0622a = this.f10280x.f8913b0;
        if (enumC0622a == null) {
            enumC0622a = EnumC0622a.f8809q;
        }
        return enumC0622a == EnumC0622a.f8810r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getClipTextToBoundingBox() {
        return this.f10280x.f8896K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getClipToCompositionBounds() {
        return this.f10280x.f8889D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0632k getComposition() {
        Drawable drawable = getDrawable();
        y yVar = this.f10280x;
        if (drawable == yVar) {
            return yVar.f8920q;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getDuration() {
        C0632k composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getFrame() {
        return (int) this.f10280x.f8921r.f15169x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getImageAssetsFolder() {
        return this.f10280x.f8927x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getMaintainOriginalImageBounds() {
        return this.f10280x.f8888C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getMaxFrame() {
        return this.f10280x.f8921r.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getMinFrame() {
        return this.f10280x.f8921r.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G getPerformanceTracker() {
        C0632k c0632k = this.f10280x.f8920q;
        if (c0632k != null) {
            return c0632k.f8833a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getProgress() {
        return this.f10280x.f8921r.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I getRenderMode() {
        return this.f10280x.f8898M ? I.f8807s : I.f8806r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getRepeatCount() {
        return this.f10280x.f8921r.getRepeatCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getRepeatMode() {
        return this.f10280x.f8921r.getRepeatMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getSpeed() {
        return this.f10280x.f8921r.f15165t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof y) {
            boolean z5 = ((y) drawable).f8898M;
            I i = I.f8807s;
            if ((z5 ? i : I.f8806r) == i) {
                this.f10280x.invalidateSelf();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        y yVar = this.f10280x;
        if (drawable2 == yVar) {
            super.invalidateDrawable(yVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f10271B) {
            return;
        }
        this.f10280x.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C0629h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0629h c0629h = (C0629h) parcelable;
        super.onRestoreInstanceState(c0629h.getSuperState());
        this.f10281y = c0629h.f8817q;
        HashSet hashSet = this.f10273D;
        EnumC0630i enumC0630i = EnumC0630i.f8824q;
        if (!hashSet.contains(enumC0630i) && !TextUtils.isEmpty(this.f10281y)) {
            setAnimation(this.f10281y);
        }
        this.f10282z = c0629h.f8818r;
        if (!hashSet.contains(enumC0630i) && (i = this.f10282z) != 0) {
            setAnimation(i);
        }
        boolean zContains = hashSet.contains(EnumC0630i.f8825r);
        y yVar = this.f10280x;
        if (!zContains) {
            yVar.u(c0629h.f8819s);
        }
        EnumC0630i enumC0630i2 = EnumC0630i.f8829v;
        if (!hashSet.contains(enumC0630i2) && c0629h.f8820t) {
            hashSet.add(enumC0630i2);
            yVar.k();
        }
        if (!hashSet.contains(EnumC0630i.f8828u)) {
            setImageAssetsFolder(c0629h.f8821u);
        }
        if (!hashSet.contains(EnumC0630i.f8826s)) {
            setRepeatMode(c0629h.f8822v);
        }
        if (hashSet.contains(EnumC0630i.f8827t)) {
            return;
        }
        setRepeatCount(c0629h.f8823w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z5;
        C0629h c0629h = new C0629h(super.onSaveInstanceState());
        c0629h.f8817q = this.f10281y;
        c0629h.f8818r = this.f10282z;
        y yVar = this.f10280x;
        n3.e eVar = yVar.f8921r;
        n3.e eVar2 = yVar.f8921r;
        c0629h.f8819s = eVar.a();
        if (yVar.isVisible()) {
            z5 = eVar2.f15160C;
        } else {
            int i = yVar.f8919h0;
            z5 = i == 2 || i == 3;
        }
        c0629h.f8820t = z5;
        c0629h.f8821u = yVar.f8927x;
        c0629h.f8822v = eVar2.getRepeatMode();
        c0629h.f8823w = eVar2.getRepeatCount();
        return c0629h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAnimation(final int i) {
        F f;
        this.f10282z = i;
        this.f10281y = null;
        if (isInEditMode()) {
            f = new F(new Callable() { // from class: a3.g
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f8815a;
                    boolean z5 = lottieAnimationView.f10272C;
                    int i7 = i;
                    if (!z5) {
                        return o.g(lottieAnimationView.getContext(), i7, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return o.g(context, i7, o.l(context, i7));
                }
            }, true);
        } else if (this.f10272C) {
            Context context = getContext();
            f = o.f(context, i, o.l(context, i));
        } else {
            f = o.f(getContext(), i, null);
        }
        setCompositionTask(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(o.a(null, new x(1, byteArrayInputStream), new RunnableC0089m(7, byteArrayInputStream)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAnimationFromUrl(String str) {
        F fA;
        int i = 0;
        String str2 = null;
        if (this.f10272C) {
            Context context = getContext();
            HashMap map = o.f8857a;
            String strW = S.w("url_", str);
            fA = o.a(strW, new l(context, str, strW, i), null);
        } else {
            fA = o.a(null, new l(getContext(), str, str2, i), null);
        }
        setCompositionTask(fA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setApplyingOpacityToLayersEnabled(boolean z5) {
        this.f10280x.f8894I = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setApplyingShadowToLayersEnabled(boolean z5) {
        this.f10280x.f8895J = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAsyncUpdates(EnumC0622a enumC0622a) {
        this.f10280x.f8913b0 = enumC0622a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCacheComposition(boolean z5) {
        this.f10272C = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setClipTextToBoundingBox(boolean z5) {
        y yVar = this.f10280x;
        if (z5 != yVar.f8896K) {
            yVar.f8896K = z5;
            yVar.invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setClipToCompositionBounds(boolean z5) {
        y yVar = this.f10280x;
        if (z5 != yVar.f8889D) {
            yVar.f8889D = z5;
            c cVar = yVar.f8890E;
            if (cVar != null) {
                cVar.f13778L = z5;
            }
            yVar.invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setComposition(C0632k c0632k) {
        y yVar = this.f10280x;
        yVar.setCallback(this);
        this.f10270A = true;
        boolean zN = yVar.n(c0632k);
        if (this.f10271B) {
            yVar.k();
        }
        this.f10270A = false;
        if (getDrawable() != yVar || zN) {
            if (!zN) {
                n3.e eVar = yVar.f8921r;
                boolean z5 = eVar != null ? eVar.f15160C : false;
                setImageDrawable(null);
                setImageDrawable(yVar);
                if (z5) {
                    yVar.m();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f10274E.iterator();
            if (it.hasNext()) {
                throw i.h(it);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDefaultFontFileExtension(String str) {
        y yVar = this.f10280x;
        yVar.f8886A = str;
        L0.l lVarI = yVar.i();
        if (lVarI != null) {
            lVarI.f3124a = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFailureListener(InterfaceC0621B interfaceC0621B) {
        this.f10278v = interfaceC0621B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFallbackResource(int i) {
        this.f10279w = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFontAssetDelegate(AbstractC0623b abstractC0623b) {
        L0.l lVar = this.f10280x.f8928y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFontMap(Map<String, Typeface> map) {
        y yVar = this.f10280x;
        if (map == yVar.f8929z) {
            return;
        }
        yVar.f8929z = map;
        yVar.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFrame(int i) {
        this.f10280x.o(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z5) {
        this.f10280x.f8923t = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setImageAssetDelegate(InterfaceC0624c interfaceC0624c) {
        C1063a c1063a = this.f10280x.f8926w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setImageAssetsFolder(String str) {
        this.f10280x.f8927x = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1338w, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f10282z = 0;
        this.f10281y = null;
        b();
        super.setImageBitmap(bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1338w, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f10282z = 0;
        this.f10281y = null;
        b();
        super.setImageDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1338w, android.widget.ImageView
    public void setImageResource(int i) {
        this.f10282z = 0;
        this.f10281y = null;
        b();
        super.setImageResource(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaintainOriginalImageBounds(boolean z5) {
        this.f10280x.f8888C = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxFrame(int i) {
        this.f10280x.p(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxProgress(float f) {
        y yVar = this.f10280x;
        C0632k c0632k = yVar.f8920q;
        if (c0632k == null) {
            yVar.f8925v.add(new s(yVar, f, 0));
            return;
        }
        n3.e eVar = yVar.f8921r;
        eVar.i(eVar.f15171z, g.f(c0632k.f8841l, c0632k.f8842m, f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinAndMaxFrame(String str) {
        this.f10280x.r(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinFrame(int i) {
        this.f10280x.s(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinProgress(float f) {
        y yVar = this.f10280x;
        C0632k c0632k = yVar.f8920q;
        if (c0632k == null) {
            yVar.f8925v.add(new s(yVar, f, 1));
        } else {
            yVar.s((int) g.f(c0632k.f8841l, c0632k.f8842m, f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOutlineMasksAndMattes(boolean z5) {
        y yVar = this.f10280x;
        if (yVar.f8893H == z5) {
            return;
        }
        yVar.f8893H = z5;
        c cVar = yVar.f8890E;
        if (cVar != null) {
            cVar.q(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPerformanceTrackingEnabled(boolean z5) {
        y yVar = this.f10280x;
        yVar.f8892G = z5;
        C0632k c0632k = yVar.f8920q;
        if (c0632k != null) {
            c0632k.f8833a.f8801a = z5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setProgress(float f) {
        this.f10273D.add(EnumC0630i.f8825r);
        this.f10280x.u(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRenderMode(I i) {
        y yVar = this.f10280x;
        yVar.f8897L = i;
        yVar.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRepeatCount(int i) {
        this.f10273D.add(EnumC0630i.f8827t);
        this.f10280x.f8921r.setRepeatCount(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRepeatMode(int i) {
        this.f10273D.add(EnumC0630i.f8826s);
        this.f10280x.f8921r.setRepeatMode(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSafeMode(boolean z5) {
        this.f10280x.f8924u = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSpeed(float f) {
        this.f10280x.f8921r.f15165t = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextDelegate(K k7) {
        this.f10280x.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setUseCompositionFrameRate(boolean z5) {
        this.f10280x.f8921r.f15161D = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            boolean r0 = r4.f10270A
            r1 = 0
            if (r0 != 0) goto L19
            a3.y r2 = r4.f10280x
            if (r5 != r2) goto L19
            n3.e r3 = r2.f8921r
            if (r3 != 0) goto Lf
            r3 = r1
            goto L11
        Lf:
            boolean r3 = r3.f15160C
        L11:
            if (r3 == 0) goto L19
            r4.f10271B = r1
            r2.j()
            goto L2e
        L19:
            if (r0 != 0) goto L2e
            boolean r0 = r5 instanceof a3.y
            if (r0 == 0) goto L2e
            r0 = r5
            a3.y r0 = (a3.y) r0
            n3.e r2 = r0.f8921r
            if (r2 != 0) goto L27
            goto L29
        L27:
            boolean r1 = r2.f15160C
        L29:
            if (r1 == 0) goto L2e
            r0.j()
        L2e:
            super.unscheduleDrawable(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setMaxFrame(String str) {
        this.f10280x.q(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setMinFrame(String str) {
        this.f10280x.t(str);
    }

    public void setAnimation(final String str) {
        F fA;
        this.f10281y = str;
        this.f10282z = 0;
        int i = 1;
        if (isInEditMode()) {
            fA = new F(new Callable() { // from class: a3.e
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f8813a;
                    boolean z5 = lottieAnimationView.f10272C;
                    String str2 = str;
                    if (!z5) {
                        return o.b(lottieAnimationView.getContext(), str2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    HashMap map = o.f8857a;
                    return o.b(context, str2, "asset_" + str2);
                }
            }, true);
        } else {
            String str2 = null;
            if (this.f10272C) {
                Context context = getContext();
                HashMap map = o.f8857a;
                String strW = S.w("asset_", str);
                fA = o.a(strW, new l(context.getApplicationContext(), str, strW, i), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = o.f8857a;
                fA = o.a(null, new l(context2.getApplicationContext(), str, str2, i), null);
            }
        }
        setCompositionTask(fA);
    }
}
