.class public final LD4/e;
.super LE4/a;
.source "SourceFile"


# instance fields
.field public final d:LE4/f;

.field public final e:LS3/e;

.field public final synthetic f:LD4/f;


# direct methods
.method public constructor <init>(LD4/f;LS3/e;)V
    .locals 3

    .line 1
    new-instance v0, LE4/f;

    .line 2
    .line 3
    const-string v1, "OnRequestInstallCallback"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LD4/e;->f:LD4/f;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, LE4/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const-string p1, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback"

    .line 16
    .line 17
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LD4/e;->d:LE4/f;

    .line 21
    .line 22
    iput-object p2, p0, LD4/e;->e:LS3/e;

    .line 23
    .line 24
    return-void
.end method
