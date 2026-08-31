package s4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1918b f16525a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1918b f16526b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1918b f16527c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC1918b f16528d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f16529e = new a(0.0f);
    public c f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f16530g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f16531h = new a(0.0f);
    public e i;
    public e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f16532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f16533l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k() {
        int i = 0;
        this.i = new e(i);
        this.j = new e(i);
        this.f16532k = new e(i);
        this.f16533l = new e(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static j a(Context context, int i, int i7, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i7 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i7);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(V3.a.f7968A);
        try {
            int i8 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i9 = typedArrayObtainStyledAttributes.getInt(3, i8);
            int i10 = typedArrayObtainStyledAttributes.getInt(4, i8);
            int i11 = typedArrayObtainStyledAttributes.getInt(2, i8);
            int i12 = typedArrayObtainStyledAttributes.getInt(1, i8);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            j jVar = new j();
            AbstractC1918b abstractC1918bR = C3.a.r(i9);
            jVar.f16516a = abstractC1918bR;
            j.b(abstractC1918bR);
            jVar.f16520e = cVarC2;
            AbstractC1918b abstractC1918bR2 = C3.a.r(i10);
            jVar.f16517b = abstractC1918bR2;
            j.b(abstractC1918bR2);
            jVar.f = cVarC3;
            AbstractC1918b abstractC1918bR3 = C3.a.r(i11);
            jVar.f16518c = abstractC1918bR3;
            j.b(abstractC1918bR3);
            jVar.f16521g = cVarC4;
            AbstractC1918b abstractC1918bR4 = C3.a.r(i12);
            jVar.f16519d = abstractC1918bR4;
            j.b(abstractC1918bR4);
            jVar.f16522h = cVarC5;
            return jVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static j b(Context context, AttributeSet attributeSet, int i, int i7) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V3.a.f7990s, i, i7);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i7 = typedValuePeekValue.type;
            if (i7 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i7 == 6) {
                return new h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(RectF rectF) {
        boolean z5 = this.f16533l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f16532k.getClass().equals(e.class);
        float fA = this.f16529e.a(rectF);
        return z5 && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f16531h.a(rectF) > fA ? 1 : (this.f16531h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f16530g.a(rectF) > fA ? 1 : (this.f16530g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f16526b instanceof i) && (this.f16525a instanceof i) && (this.f16527c instanceof i) && (this.f16528d instanceof i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final j e() {
        j jVar = new j();
        jVar.f16516a = this.f16525a;
        jVar.f16517b = this.f16526b;
        jVar.f16518c = this.f16527c;
        jVar.f16519d = this.f16528d;
        jVar.f16520e = this.f16529e;
        jVar.f = this.f;
        jVar.f16521g = this.f16530g;
        jVar.f16522h = this.f16531h;
        jVar.i = this.i;
        jVar.j = this.j;
        jVar.f16523k = this.f16532k;
        jVar.f16524l = this.f16533l;
        return jVar;
    }
}
