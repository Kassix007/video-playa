package P;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import u.AbstractC1663q;
import u.C1624C;
import u.InterfaceC1622A;
import u.InterfaceC1669x;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements InterfaceC0347c, u.D0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f5382s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y(Context context, XmlResourceParser xmlResourceParser) {
        this.f5382s = new ArrayList();
        this.f5381r = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g1.r.f13031h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f5380q = typedArrayObtainStyledAttributes.getResourceId(index, this.f5380q);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5381r);
                this.f5381r = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new g1.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void c(int i, Object obj) {
        ((InterfaceC0347c) this.f5382s).c(i + (this.f5381r == 0 ? this.f5380q : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void d(Object obj) {
        this.f5381r++;
        ((InterfaceC0347c) this.f5382s).d(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public AbstractC1663q g(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return ((E.c0) this.f5382s).g(j, abstractC1663q, abstractC1663q2, abstractC1663q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void h(int i, Object obj) {
        ((InterfaceC0347c) this.f5382s).h(i + (this.f5381r == 0 ? this.f5380q : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void i(int i, int i7, int i8) {
        int i9 = this.f5381r == 0 ? this.f5380q : 0;
        ((InterfaceC0347c) this.f5382s).i(i + i9, i7 + i9, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public Object j() {
        return ((InterfaceC0347c) this.f5382s).j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void k(int i, int i7) {
        ((InterfaceC0347c) this.f5382s).k(i + (this.f5381r == 0 ? this.f5380q : 0), i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.D0
    public int l() {
        return this.f5381r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.D0
    public int m() {
        return this.f5380q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public AbstractC1663q n(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return ((E.c0) this.f5382s).n(j, abstractC1663q, abstractC1663q2, abstractC1663q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void o() {
        if (!(this.f5381r > 0)) {
            AbstractC0373p.c("OffsetApplier up called with no corresponding down");
        }
        this.f5381r--;
        ((InterfaceC0347c) this.f5382s).o();
    }

    public Y() {
        this.f5382s = new Y[256];
        this.f5380q = 0;
        this.f5381r = 0;
    }

    public Y(int i, int i7) {
        this.f5382s = null;
        this.f5380q = i;
        int i8 = i7 & 7;
        this.f5381r = i8 == 0 ? 8 : i8;
    }

    public Y(InterfaceC0347c interfaceC0347c, int i) {
        this.f5382s = interfaceC0347c;
        this.f5380q = i;
    }

    public Y(int i, int i7, InterfaceC1669x interfaceC1669x) {
        this.f5380q = i;
        this.f5381r = i7;
        this.f5382s = new E.c0((InterfaceC1622A) new C1624C(i, i7, interfaceC1669x));
    }
}
