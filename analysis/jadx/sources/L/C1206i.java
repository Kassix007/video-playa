package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1206i extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuC1209l f14345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14346b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f14349e;
    public final int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1206i(MenuC1209l menuC1209l, LayoutInflater layoutInflater, boolean z5, int i) {
        this.f14348d = z5;
        this.f14349e = layoutInflater;
        this.f14345a = menuC1209l;
        this.f = i;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        MenuC1209l menuC1209l = this.f14345a;
        C1211n c1211n = menuC1209l.f14369v;
        if (c1211n != null) {
            menuC1209l.i();
            ArrayList arrayList = menuC1209l.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1211n) arrayList.get(i)) == c1211n) {
                    this.f14346b = i;
                    return;
                }
            }
        }
        this.f14346b = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1211n getItem(int i) {
        ArrayList arrayListL;
        boolean z5 = this.f14348d;
        MenuC1209l menuC1209l = this.f14345a;
        if (z5) {
            menuC1209l.i();
            arrayListL = menuC1209l.j;
        } else {
            arrayListL = menuC1209l.l();
        }
        int i7 = this.f14346b;
        if (i7 >= 0 && i >= i7) {
            i++;
        }
        return (C1211n) arrayListL.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z5 = this.f14348d;
        MenuC1209l menuC1209l = this.f14345a;
        if (z5) {
            menuC1209l.i();
            arrayListL = menuC1209l.j;
        } else {
            arrayListL = menuC1209l.l();
        }
        return this.f14346b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z5 = false;
        if (view == null) {
            view = this.f14349e.inflate(this.f, viewGroup, false);
        }
        int i7 = getItem(i).f14379b;
        int i8 = i - 1;
        int i9 = i8 >= 0 ? getItem(i8).f14379b : i7;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f14345a.m() && i7 != i9) {
            z5 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z5);
        y yVar = (y) view;
        if (this.f14347c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i));
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
