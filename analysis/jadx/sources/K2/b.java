package K2;

import java.io.IOException;
import java.util.ArrayList;
import q6.x;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f2864b = new long[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2865c = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2866d = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2867e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f2868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2869h;
    public final /* synthetic */ f i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(f fVar, String str) {
        this.i = fVar;
        this.f2863a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f2865c.add(this.i.f2882q.e(sb.toString()));
            sb.append(".tmp");
            this.f2866d.add(this.i.f2882q.e(sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c a() {
        if (!this.f2867e || this.f2868g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.f2865c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            f fVar = this.i;
            if (i >= size) {
                this.f2869h++;
                return new c(fVar, this);
            }
            if (!fVar.f2881G.v((x) arrayList.get(i))) {
                try {
                    fVar.G(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
