.class public final LE4/i;
.super LE4/g;
.source "SourceFile"


# instance fields
.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LE4/i;->r:I

    iput-object p2, p0, LE4/i;->s:Ljava/lang/Object;

    invoke-direct {p0}, LE4/g;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget v0, p0, LE4/i;->r:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE4/i;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LE4/j;

    .line 9
    .line 10
    iget-object v0, v0, LE4/j;->r:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LE4/k;

    .line 13
    .line 14
    iget-object v1, v0, LE4/k;->b:LE4/f;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [Ljava/lang/Object;

    .line 18
    .line 19
    const-string v4, "unlinkToDeath"

    .line 20
    .line 21
    invoke-virtual {v1, v4, v3}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, LE4/k;->m:LE4/e;

    .line 25
    .line 26
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v3, v0, LE4/k;->j:LE4/h;

    .line 31
    .line 32
    invoke-interface {v1, v3, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-object v1, v0, LE4/k;->m:LE4/e;

    .line 37
    .line 38
    iput-boolean v2, v0, LE4/k;->g:Z

    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    iget-object v0, p0, LE4/i;->s:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LE4/k;

    .line 44
    .line 45
    iget-object v1, v0, LE4/k;->m:LE4/e;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    iget-object v1, v0, LE4/k;->b:LE4/f;

    .line 50
    .line 51
    const-string v2, "Unbind from service."

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    new-array v4, v3, [Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v1, v2, v4}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, LE4/k;->a:Landroid/content/Context;

    .line 60
    .line 61
    iget-object v2, v0, LE4/k;->l:LE4/j;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 64
    .line 65
    .line 66
    iput-boolean v3, v0, LE4/k;->g:Z

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    iput-object v1, v0, LE4/k;->m:LE4/e;

    .line 70
    .line 71
    iput-object v1, v0, LE4/k;->l:LE4/j;

    .line 72
    .line 73
    :cond_0
    invoke-virtual {v0}, LE4/k;->b()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
