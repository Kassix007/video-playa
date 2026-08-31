package F3;

import d3.j;
import d3.m;
import java.util.ArrayList;
import java.util.List;
import o3.C1415a;
import p3.C1466l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h3.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1947q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f1948r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(int i) {
        this.f1947q = i;
        switch (i) {
            case 2:
                this.f1948r = null;
                break;
            default:
                this.f1948r = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(C1466l c1466l) {
        if (this.f1948r == null) {
            this.f1948r = new ArrayList();
        }
        for (int i = 0; i < this.f1948r.size(); i++) {
            if (((C1466l) this.f1948r.get(i)).f15785a.f15789b > c1466l.f15785a.f15789b) {
                this.f1948r.add(i, c1466l);
                return;
            }
        }
        this.f1948r.add(c1466l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(c cVar) {
        if (cVar.f1948r == null) {
            return;
        }
        if (this.f1948r == null) {
            this.f1948r = new ArrayList(cVar.f1948r.size());
        }
        ArrayList arrayList = cVar.f1948r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a((C1466l) obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h3.e
    public d3.e f() {
        ArrayList arrayList = this.f1948r;
        return ((C1415a) arrayList.get(0)).c() ? new j(1, arrayList) : new m(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h3.e
    public List h() {
        return this.f1948r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h3.e
    public boolean i() {
        ArrayList arrayList = this.f1948r;
        return arrayList.size() == 1 && ((C1415a) arrayList.get(0)).c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f1947q) {
            case 2:
                if (this.f1948r == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = this.f1948r;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    sb.append(((C1466l) obj).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public c(ArrayList arrayList) {
        this.f1947q = 1;
        this.f1948r = arrayList;
    }
}
