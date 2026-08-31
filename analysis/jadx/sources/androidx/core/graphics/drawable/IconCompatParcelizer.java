package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.nio.charset.Charset;
import s2.a;
import s2.b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f9433a;
        if (aVar.e(1)) {
            i = ((b) aVar).f16449e.readInt();
        }
        iconCompat.f9433a = i;
        byte[] bArr = iconCompat.f9435c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f16449e;
            int i7 = parcel.readInt();
            if (i7 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i7];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f9435c = bArr;
        iconCompat.f9436d = aVar.f(iconCompat.f9436d, 3);
        int i8 = iconCompat.f9437e;
        if (aVar.e(4)) {
            i8 = ((b) aVar).f16449e.readInt();
        }
        iconCompat.f9437e = i8;
        int i9 = iconCompat.f;
        if (aVar.e(5)) {
            i9 = ((b) aVar).f16449e.readInt();
        }
        iconCompat.f = i9;
        iconCompat.f9438g = (ColorStateList) aVar.f(iconCompat.f9438g, 6);
        String string = iconCompat.i;
        if (aVar.e(7)) {
            string = ((b) aVar).f16449e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f16449e.readString();
        }
        iconCompat.j = string2;
        iconCompat.f9439h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f9433a) {
            case IconicsAnimationProcessor.INFINITE /* -1 */:
                Parcelable parcelable = iconCompat.f9436d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f9434b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f9436d;
                if (parcelable2 != null) {
                    iconCompat.f9434b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f9435c;
                iconCompat.f9434b = bArr3;
                iconCompat.f9433a = 3;
                iconCompat.f9437e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f9435c, Charset.forName("UTF-16"));
                iconCompat.f9434b = str;
                if (iconCompat.f9433a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f9434b = iconCompat.f9435c;
                return iconCompat;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.f9439h.name();
        switch (iconCompat.f9433a) {
            case IconicsAnimationProcessor.INFINITE /* -1 */:
                iconCompat.f9436d = (Parcelable) iconCompat.f9434b;
                break;
            case 1:
            case 5:
                iconCompat.f9436d = (Parcelable) iconCompat.f9434b;
                break;
            case 2:
                iconCompat.f9435c = ((String) iconCompat.f9434b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f9435c = (byte[]) iconCompat.f9434b;
                break;
            case 4:
            case 6:
                iconCompat.f9435c = iconCompat.f9434b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f9433a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).f16449e.writeInt(i);
        }
        byte[] bArr = iconCompat.f9435c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f16449e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f9436d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f16449e.writeParcelable(parcelable, 0);
        }
        int i7 = iconCompat.f9437e;
        if (i7 != 0) {
            aVar.h(4);
            ((b) aVar).f16449e.writeInt(i7);
        }
        int i8 = iconCompat.f;
        if (i8 != 0) {
            aVar.h(5);
            ((b) aVar).f16449e.writeInt(i8);
        }
        ColorStateList colorStateList = iconCompat.f9438g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f16449e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f16449e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f16449e.writeString(str2);
        }
    }
}
