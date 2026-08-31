.class public final synthetic LR4/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;


# direct methods
.method public synthetic constructor <init>(LR4/k1;I)V
    .locals 0

    .line 1
    iput p2, p0, LR4/j1;->q:I

    iput-object p1, p0, LR4/j1;->r:LR4/k1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LR4/j1;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/j1;->r:LR4/k1;

    .line 7
    .line 8
    iget-object v1, v0, LR4/k1;->e:LT1/u;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, LT1/u;->a()LT1/d;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v1, LT1/d;->r:LT1/p;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    if-nez v1, :cond_1

    .line 23
    .line 24
    iget-object v1, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, v0, LR4/k1;->e:LT1/u;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, LT1/u;->c()V

    .line 34
    .line 35
    .line 36
    :cond_2
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    iget-object v0, p0, LR4/j1;->r:LR4/k1;

    .line 40
    .line 41
    iget-object v0, v0, LR4/k1;->o0:LR4/V;

    .line 42
    .line 43
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    iget-object v0, p0, LR4/j1;->r:LR4/k1;

    .line 47
    .line 48
    iget-object v1, v0, LR4/k1;->L:Lcom/web2native/OrufyConnectHandlerUtil;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lcom/web2native/OrufyConnectHandlerUtil;->showConversation(Landroid/app/Activity;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_2
    iget-object v0, p0, LR4/j1;->r:LR4/k1;

    .line 61
    .line 62
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 63
    .line 64
    const-string v1, "bluetooth"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "null cannot be cast to non-null type android.bluetooth.BluetoothManager"

    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    check-cast v0, Landroid/bluetooth/BluetoothManager;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
