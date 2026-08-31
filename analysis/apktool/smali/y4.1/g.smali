.class public abstract Ly4/g;
.super LE4/a;
.source "SourceFile"

# interfaces
.implements Lz4/h;


# instance fields
.field public final d:LE1/t;

.field public final e:LS3/e;

.field public final synthetic f:Ly4/j;


# direct methods
.method public constructor <init>(Ly4/j;LE1/t;LS3/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly4/g;->f:Ly4/j;

    .line 2
    .line 3
    const/4 p1, 0x4

    .line 4
    invoke-direct {p0, p1}, LE4/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-string p1, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback"

    .line 8
    .line 9
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Ly4/g;->d:LE1/t;

    .line 13
    .line 14
    iput-object p3, p0, Ly4/g;->e:LS3/e;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ly4/g;->f:Ly4/j;

    .line 2
    .line 3
    iget-object p1, p1, Ly4/j;->a:Lz4/n;

    .line 4
    .line 5
    iget-object v0, p0, Ly4/g;->e:LS3/e;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lz4/n;->c(LS3/e;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    new-array p1, p1, [Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, p0, Ly4/g;->d:LE1/t;

    .line 14
    .line 15
    const-string v1, "onCompleteUpdate"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, LE1/t;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public f(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ly4/g;->f:Ly4/j;

    .line 2
    .line 3
    iget-object p1, p1, Ly4/j;->a:Lz4/n;

    .line 4
    .line 5
    iget-object v0, p0, Ly4/g;->e:LS3/e;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lz4/n;->c(LS3/e;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    new-array p1, p1, [Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, p0, Ly4/g;->d:LE1/t;

    .line 14
    .line 15
    const-string v1, "onRequestInfo"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, LE1/t;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
