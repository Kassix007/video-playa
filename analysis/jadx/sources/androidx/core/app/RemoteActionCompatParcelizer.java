package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import s2.a;
import s2.b;
import s2.c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f9421a;
        boolean z5 = true;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f9421a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f9422b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f16449e);
        }
        remoteActionCompat.f9422b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f9423c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f16449e);
        }
        remoteActionCompat.f9423c = charSequence2;
        remoteActionCompat.f9424d = (PendingIntent) aVar.f(remoteActionCompat.f9424d, 4);
        boolean z6 = remoteActionCompat.f9425e;
        if (aVar.e(5)) {
            z6 = ((b) aVar).f16449e.readInt() != 0;
        }
        remoteActionCompat.f9425e = z6;
        boolean z7 = remoteActionCompat.f;
        if (!aVar.e(6)) {
            z5 = z7;
        } else if (((b) aVar).f16449e.readInt() == 0) {
            z5 = false;
        }
        remoteActionCompat.f = z5;
        return remoteActionCompat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f9421a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f9422b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f16449e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f9423c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f9424d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z5 = remoteActionCompat.f9425e;
        aVar.h(5);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = remoteActionCompat.f;
        aVar.h(6);
        parcel.writeInt(z6 ? 1 : 0);
    }
}
