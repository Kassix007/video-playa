package q2;

import E.c0;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: q2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1496a extends AbstractC1509n {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f15931S;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayList f15929Q = new ArrayList();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f15930R = true;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f15932T = false;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f15933U = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1496a() {
        L(1);
        I(new C1503h(2));
        I(new C1501f());
        I(new C1503h(1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void B(AbstractC1918b abstractC1918b) {
        this.f15933U |= 8;
        int size = this.f15929Q.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1509n) this.f15929Q.get(i)).B(abstractC1918b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void D(O3.B b7) {
        super.D(b7);
        this.f15933U |= 4;
        if (this.f15929Q != null) {
            for (int i = 0; i < this.f15929Q.size(); i++) {
                ((AbstractC1509n) this.f15929Q.get(i)).D(b7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void E() {
        this.f15933U |= 2;
        int size = this.f15929Q.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1509n) this.f15929Q.get(i)).E();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void F(long j) {
        this.f15983r = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final String H(String str) {
        String strH = super.H(str);
        for (int i = 0; i < this.f15929Q.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strH);
            sb.append("\n");
            sb.append(((AbstractC1509n) this.f15929Q.get(i)).H(str + "  "));
            strH = sb.toString();
        }
        return strH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(AbstractC1509n abstractC1509n) {
        this.f15929Q.add(abstractC1509n);
        abstractC1509n.f15990y = this;
        long j = this.f15984s;
        if (j >= 0) {
            abstractC1509n.A(j);
        }
        if ((this.f15933U & 1) != 0) {
            abstractC1509n.C(this.f15985t);
        }
        if ((this.f15933U & 2) != 0) {
            abstractC1509n.E();
        }
        if ((this.f15933U & 4) != 0) {
            abstractC1509n.D(this.f15981L);
        }
        if ((this.f15933U & 8) != 0) {
            abstractC1509n.B(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: A(J)V */
    @Override // q2.AbstractC1509n
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void A(long j) {
        ArrayList arrayList;
        this.f15984s = j;
        if (j < 0 || (arrayList = this.f15929Q) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1509n) this.f15929Q.get(i)).A(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: C(Landroid/animation/TimeInterpolator;)V */
    @Override // q2.AbstractC1509n
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void C(TimeInterpolator timeInterpolator) {
        this.f15933U |= 1;
        ArrayList arrayList = this.f15929Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1509n) this.f15929Q.get(i)).C(timeInterpolator);
            }
        }
        this.f15985t = timeInterpolator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(int i) {
        if (i == 0) {
            this.f15930R = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(k1.i.i(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f15930R = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void c() {
        super.c();
        int size = this.f15929Q.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1509n) this.f15929Q.get(i)).c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void d(C1517v c1517v) {
        if (t(c1517v.f16003b)) {
            ArrayList arrayList = this.f15929Q;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AbstractC1509n abstractC1509n = (AbstractC1509n) obj;
                if (abstractC1509n.t(c1517v.f16003b)) {
                    abstractC1509n.d(c1517v);
                    c1517v.f16004c.add(abstractC1509n);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void f(C1517v c1517v) {
        int size = this.f15929Q.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1509n) this.f15929Q.get(i)).f(c1517v);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void g(C1517v c1517v) {
        if (t(c1517v.f16003b)) {
            ArrayList arrayList = this.f15929Q;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AbstractC1509n abstractC1509n = (AbstractC1509n) obj;
                if (abstractC1509n.t(c1517v.f16003b)) {
                    abstractC1509n.g(c1517v);
                    c1517v.f16004c.add(abstractC1509n);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // q2.AbstractC1509n
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC1509n clone() {
        C1496a c1496a = (C1496a) super.clone();
        c1496a.f15929Q = new ArrayList();
        int size = this.f15929Q.size();
        for (int i = 0; i < size; i++) {
            AbstractC1509n abstractC1509nClone = ((AbstractC1509n) this.f15929Q.get(i)).clone();
            c1496a.f15929Q.add(abstractC1509nClone);
            abstractC1509nClone.f15990y = c1496a;
        }
        return c1496a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void l(ViewGroup viewGroup, c0 c0Var, c0 c0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f15983r;
        int size = this.f15929Q.size();
        for (int i = 0; i < size; i++) {
            AbstractC1509n abstractC1509n = (AbstractC1509n) this.f15929Q.get(i);
            if (j > 0 && (this.f15930R || i == 0)) {
                long j7 = abstractC1509n.f15983r;
                if (j7 > 0) {
                    abstractC1509n.F(j7 + j);
                } else {
                    abstractC1509n.F(j);
                }
            }
            abstractC1509n.l(viewGroup, c0Var, c0Var2, arrayList, arrayList2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void w(View view) {
        super.w(view);
        int size = this.f15929Q.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1509n) this.f15929Q.get(i)).w(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final AbstractC1509n x(InterfaceC1507l interfaceC1507l) {
        super.x(interfaceC1507l);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void y(View view) {
        super.y(view);
        int size = this.f15929Q.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1509n) this.f15929Q.get(i)).y(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void z() {
        if (this.f15929Q.isEmpty()) {
            G();
            m();
            return;
        }
        C1514s c1514s = new C1514s();
        c1514s.f16000b = this;
        ArrayList arrayList = this.f15929Q;
        int size = arrayList.size();
        int i = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((AbstractC1509n) obj).a(c1514s);
        }
        this.f15931S = this.f15929Q.size();
        if (this.f15930R) {
            ArrayList arrayList2 = this.f15929Q;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((AbstractC1509n) obj2).z();
            }
            return;
        }
        for (int i8 = 1; i8 < this.f15929Q.size(); i8++) {
            ((AbstractC1509n) this.f15929Q.get(i8 - 1)).a(new C1514s((AbstractC1509n) this.f15929Q.get(i8)));
        }
        AbstractC1509n abstractC1509n = (AbstractC1509n) this.f15929Q.get(0);
        if (abstractC1509n != null) {
            abstractC1509n.z();
        }
    }
}
