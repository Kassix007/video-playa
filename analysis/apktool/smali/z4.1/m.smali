.class public final Lz4/m;
.super Lz4/k;
.source "SourceFile"


# instance fields
.field public final synthetic r:Landroid/os/IBinder;

.field public final synthetic s:LE4/j;


# direct methods
.method public constructor <init>(LE4/j;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4/m;->s:LE4/j;

    .line 2
    .line 3
    iput-object p2, p0, Lz4/m;->r:Landroid/os/IBinder;

    .line 4
    .line 5
    invoke-direct {p0}, Lz4/k;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lz4/m;->s:LE4/j;

    .line 2
    .line 3
    iget-object v0, v0, LE4/j;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lz4/n;

    .line 6
    .line 7
    sget v1, Lz4/f;->d:I

    .line 8
    .line 9
    iget-object v1, p0, Lz4/m;->r:Landroid/os/IBinder;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v2, "com.google.android.play.core.appupdate.protocol.IAppUpdateService"

    .line 16
    .line 17
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    instance-of v3, v2, Lz4/g;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    move-object v1, v2

    .line 26
    check-cast v1, Lz4/g;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance v2, Lz4/e;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Lz4/e;-><init>(Landroid/os/IBinder;)V

    .line 32
    .line 33
    .line 34
    move-object v1, v2

    .line 35
    :goto_0
    check-cast v1, Lz4/g;

    .line 36
    .line 37
    iput-object v1, v0, Lz4/n;->m:Lz4/g;

    .line 38
    .line 39
    iget-object v1, v0, Lz4/n;->b:LE1/t;

    .line 40
    .line 41
    const-string v2, "linkToDeath"

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    new-array v4, v3, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v1, v2, v4}, LE1/t;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :try_start_0
    iget-object v2, v0, Lz4/n;->m:Lz4/g;

    .line 50
    .line 51
    invoke-interface {v2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v4, v0, Lz4/n;->j:LE4/h;

    .line 56
    .line 57
    invoke-interface {v2, v4, v3}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception v2

    .line 62
    new-array v4, v3, [Ljava/lang/Object;

    .line 63
    .line 64
    const-string v5, "linkToDeath failed"

    .line 65
    .line 66
    invoke-virtual {v1, v2, v5, v4}, LE1/t;->c(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    iput-boolean v3, v0, Lz4/n;->g:Z

    .line 70
    .line 71
    iget-object v1, v0, Lz4/n;->d:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    :goto_2
    if-ge v3, v2, :cond_2

    .line 78
    .line 79
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    check-cast v4, Ljava/lang/Runnable;

    .line 86
    .line 87
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    iget-object v0, v0, Lz4/n;->d:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 94
    .line 95
    .line 96
    return-void
.end method
