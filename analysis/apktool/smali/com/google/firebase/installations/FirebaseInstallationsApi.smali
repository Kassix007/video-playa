.class public interface abstract Lcom/google/firebase/installations/FirebaseInstallationsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract delete()LS3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LS3/d;"
        }
    .end annotation
.end method

.method public abstract getId()LS3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LS3/d;"
        }
    .end annotation
.end method

.method public abstract getToken(Z)LS3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "LS3/d;"
        }
    .end annotation
.end method

.method public abstract registerFidListener(Lcom/google/firebase/installations/internal/FidListener;)Lcom/google/firebase/installations/internal/FidListenerHandle;
    .annotation build Lcom/google/firebase/annotations/DeferredApi;
    .end annotation
.end method
