package androidx.work.impl.model;

import P5.InterfaceC0397h;
import androidx.lifecycle.G;
import androidx.work.impl.model.WorkSpec;
import j2.InterfaceC1160f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface RawWorkInfoDao {
    List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(InterfaceC1160f interfaceC1160f);

    InterfaceC0397h getWorkInfoPojosFlow(InterfaceC1160f interfaceC1160f);

    G getWorkInfoPojosLiveData(InterfaceC1160f interfaceC1160f);
}
