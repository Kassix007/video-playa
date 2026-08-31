package L4;

import android.content.res.Resources;
import android.graphics.Canvas;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import n5.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends K4.d {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f3263H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(Resources resources, Resources.Theme theme) {
        super(resources, theme);
        this.f3263H = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // K4.d, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        m.e(canvas, "canvas");
        ArrayList arrayList = this.f3263H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IconicsAnimationProcessor) obj).processPreDraw(canvas, this.f2944c, this.f, this.f2946e, this.f2945d);
        }
        super.draw(canvas);
        Iterator it = l.w0(arrayList).iterator();
        while (it.hasNext()) {
            ((IconicsAnimationProcessor) it.next()).processPostDraw(canvas);
        }
    }
}
