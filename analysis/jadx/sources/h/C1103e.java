package h;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.wnapp.smspariaz.R;
import g.AbstractC1066a;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: h.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1103e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f13264A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f13265B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final HandlerC1101c f13266C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC1104f f13269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f13270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f13271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13272e;
    public AlertController$RecycleListView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f13273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f13274h;
    public Message i;
    public Button j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f13275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Message f13276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f13277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f13278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Message f13279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public NestedScrollView f13280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f13281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f13282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f13283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f13284t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f13285u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ListAdapter f13286v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f13288x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f13289y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f13290z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13287w = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final com.google.android.material.datepicker.k f13267D = new com.google.android.material.datepicker.k(1, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1103e(Context context, DialogInterfaceC1104f dialogInterfaceC1104f, Window window) {
        this.f13268a = context;
        this.f13269b = dialogInterfaceC1104f;
        this.f13270c = window;
        HandlerC1101c handlerC1101c = new HandlerC1101c();
        handlerC1101c.f13263a = new WeakReference(dialogInterfaceC1104f);
        this.f13266C = handlerC1101c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1066a.f12790e, R.attr.alertDialogStyle, 0);
        this.f13288x = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f13289y = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f13290z = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f13264A = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f13265B = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC1104f.e().g(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, String str, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f13266C.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f13278n = str;
            this.f13279o = messageObtainMessage;
        } else if (i == -2) {
            this.f13275k = str;
            this.f13276l = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f13274h = str;
            this.i = messageObtainMessage;
        }
    }
}
