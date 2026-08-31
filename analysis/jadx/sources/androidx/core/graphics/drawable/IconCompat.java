package androidx.core.graphics.drawable;

import A1.k;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f9432k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9434b;
    public String j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9433a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f9435c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f9436d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9437e = 0;
    public int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f9438g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f9439h = f9432k;
    public String i = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static IconCompat a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9435c = null;
        iconCompat.f9436d = null;
        iconCompat.f = 0;
        iconCompat.f9438g = null;
        iconCompat.f9439h = f9432k;
        iconCompat.i = null;
        iconCompat.f9433a = 2;
        iconCompat.f9437e = i;
        iconCompat.f9434b = "";
        iconCompat.j = "";
        return iconCompat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        int i = this.f9433a;
        if (i != -1) {
            if (i == 2) {
                return this.f9437e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = this.f9434b;
        if (i7 >= 28) {
            return k.d(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon resource", e8);
            return 0;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon resource", e9);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Uri c() {
        int i = this.f9433a;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f9434b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = this.f9434b;
        if (i7 >= 28) {
            return k.m(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon uri", e8);
            return null;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon uri", e9);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        if (this.f9433a == -1) {
            return String.valueOf(this.f9434b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f9433a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f9433a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f9434b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f9434b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f9437e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f9434b);
                break;
        }
        if (this.f9438g != null) {
            sb.append(" tint=");
            sb.append(this.f9438g);
        }
        if (this.f9439h != f9432k) {
            sb.append(" mode=");
            sb.append(this.f9439h);
        }
        sb.append(")");
        return sb.toString();
    }
}
