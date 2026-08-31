package n4;

import android.content.Context;
import android.view.SubMenu;
import l.C1211n;
import l.MenuC1209l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends MenuC1209l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f15241A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Class f15242z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(Context context, Class cls, int i) {
        super(context);
        this.f15242z = cls;
        this.f15241A = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l
    public final C1211n a(int i, int i7, int i8, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i9 = this.f15241A;
        if (size <= i9) {
            w();
            C1211n c1211nA = super.a(i, i7, i8, charSequence);
            c1211nA.f(true);
            v();
            return c1211nA;
        }
        String simpleName = this.f15242z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i9);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(k1.i.k(sb, simpleName, "#getMaxItemCount()"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l, android.view.Menu
    public final SubMenu addSubMenu(int i, int i7, int i8, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f15242z.getSimpleName().concat(" does not support submenus"));
    }
}
