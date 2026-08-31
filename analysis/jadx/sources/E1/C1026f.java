package e1;

import java.util.ArrayList;

/* JADX INFO: renamed from: e1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1026f implements InterfaceC1024d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1035o f12521d;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12523g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1035o f12518a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12519b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12520c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12522e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12524h = 1;
    public C1027g i = null;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f12525k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f12526l = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1026f(AbstractC1035o abstractC1035o) {
        this.f12521d = abstractC1035o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.InterfaceC1024d
    public final void a(InterfaceC1024d interfaceC1024d) {
        ArrayList arrayList = this.f12526l;
        int size = arrayList.size();
        int i = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!((C1026f) obj).j) {
                return;
            }
        }
        this.f12520c = true;
        AbstractC1035o abstractC1035o = this.f12518a;
        if (abstractC1035o != null) {
            abstractC1035o.a(this);
        }
        if (this.f12519b) {
            this.f12521d.a(this);
            return;
        }
        int size2 = arrayList.size();
        C1026f c1026f = null;
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList.get(i8);
            i8++;
            C1026f c1026f2 = (C1026f) obj2;
            if (!(c1026f2 instanceof C1027g)) {
                i++;
                c1026f = c1026f2;
            }
        }
        if (c1026f != null && i == 1 && c1026f.j) {
            C1027g c1027g = this.i;
            if (c1027g != null) {
                if (!c1027g.j) {
                    return;
                } else {
                    this.f = this.f12524h * c1027g.f12523g;
                }
            }
            d(c1026f.f12523g + this.f);
        }
        AbstractC1035o abstractC1035o2 = this.f12518a;
        if (abstractC1035o2 != null) {
            abstractC1035o2.a(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(AbstractC1035o abstractC1035o) {
        this.f12525k.add(abstractC1035o);
        if (this.j) {
            abstractC1035o.a(abstractC1035o);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.f12526l.clear();
        this.f12525k.clear();
        this.j = false;
        this.f12523g = 0;
        this.f12520c = false;
        this.f12519b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f12523g = i;
        ArrayList arrayList = this.f12525k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            InterfaceC1024d interfaceC1024d = (InterfaceC1024d) obj;
            interfaceC1024d.a(interfaceC1024d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12521d.f12540b.f11864h0);
        sb.append(":");
        switch (this.f12522e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.f12523g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f12526l.size());
        sb.append(":d=");
        sb.append(this.f12525k.size());
        sb.append(">");
        return sb.toString();
    }
}
