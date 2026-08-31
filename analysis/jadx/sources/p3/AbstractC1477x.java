package p3;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: p3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1477x extends Y implements W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f15858h = new ArrayList();
    public Boolean i;
    public Matrix j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15860l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.W
    public final List f() {
        return this.f15858h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.W
    public final void j(AbstractC1446a0 abstractC1446a0) throws A0 {
        if (abstractC1446a0 instanceof Q) {
            this.f15858h.add(abstractC1446a0);
            return;
        }
        throw new A0("Gradient elements cannot contain " + abstractC1446a0 + " elements.");
    }
}
