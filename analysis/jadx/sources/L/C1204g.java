package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1204g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14337a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1205h f14338b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1204g(C1205h c1205h) {
        this.f14338b = c1205h;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        MenuC1209l menuC1209l = this.f14338b.f14341s;
        C1211n c1211n = menuC1209l.f14369v;
        if (c1211n != null) {
            menuC1209l.i();
            ArrayList arrayList = menuC1209l.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1211n) arrayList.get(i)) == c1211n) {
                    this.f14337a = i;
                    return;
                }
            }
        }
        this.f14337a = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1211n getItem(int i) {
        C1205h c1205h = this.f14338b;
        MenuC1209l menuC1209l = c1205h.f14341s;
        menuC1209l.i();
        ArrayList arrayList = menuC1209l.j;
        c1205h.getClass();
        int i7 = this.f14337a;
        if (i7 >= 0 && i >= i7) {
            i++;
        }
        return (C1211n) arrayList.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getCount() {
        C1205h c1205h = this.f14338b;
        MenuC1209l menuC1209l = c1205h.f14341s;
        menuC1209l.i();
        int size = menuC1209l.j.size();
        c1205h.getClass();
        return this.f14337a < 0 ? size : size - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f14338b.f14340r.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).b(getItem(i));
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
