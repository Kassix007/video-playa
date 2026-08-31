package J4;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2808c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(String str, Object obj, int i) {
        this.f2806a = i;
        this.f2807b = str;
        this.f2808c = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.platforminfo.LibraryVersionComponent.a(java.lang.String, com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor, com.google.firebase.components.ComponentContainer):com.google.firebase.platforminfo.LibraryVersion */
    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.tracing.ComponentMonitor.a(java.lang.String, com.google.firebase.components.Component, com.google.firebase.components.ComponentContainer):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f2806a) {
            case 0:
                return ComponentMonitor.lambda$processRegistrar$0(this.f2807b, (Component) this.f2808c, componentContainer);
            default:
                return LibraryVersionComponent.lambda$fromContext$0(this.f2807b, (LibraryVersionComponent.VersionExtractor) this.f2808c, componentContainer);
        }
    }
}
