package s4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import r4.C1579a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f16545d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(ArrayList arrayList, Matrix matrix) {
        this.f16544c = arrayList;
        this.f16545d = matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.t
    public final void a(Matrix matrix, C1579a c1579a, int i, Canvas canvas) {
        ArrayList arrayList = this.f16544c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((t) obj).a(this.f16545d, c1579a, i, canvas);
        }
    }
}
