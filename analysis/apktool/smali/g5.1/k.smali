.class public final synthetic Lg5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LO3/e0;


# direct methods
.method public synthetic constructor <init>(LO3/e0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg5/k;->q:I

    iput-object p1, p0, Lg5/k;->r:LO3/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lg5/k;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg5/k;->r:LO3/e0;

    .line 7
    .line 8
    iget-object v1, v0, LO3/e0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LR4/k1;

    .line 11
    .line 12
    iget-object v2, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 13
    .line 14
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/webkit/WebView;->getProgress()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x46

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-lt v2, v3, :cond_2

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    iput-object v2, v0, LO3/e0;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, v1, LR4/k1;->e:LT1/u;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v3, v3, LT1/u;->b:LW1/j;

    .line 34
    .line 35
    invoke-virtual {v3}, LW1/j;->f()LT1/p;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    iget-object v2, v3, LT1/p;->r:LW1/l;

    .line 42
    .line 43
    iget-object v2, v2, LW1/l;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    :cond_0
    const-string v3, "noInternetScreen"

    .line 48
    .line 49
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    iget-object v1, v1, LR4/k1;->e:LT1/u;

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v1}, LT1/u;->c()V

    .line 60
    .line 61
    .line 62
    :cond_1
    iput-boolean v4, v0, LO3/e0;->b:Z

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iput-boolean v4, v0, LO3/e0;->d:Z

    .line 66
    .line 67
    new-instance v1, Landroid/os/Handler;

    .line 68
    .line 69
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 74
    .line 75
    .line 76
    new-instance v2, Lg5/k;

    .line 77
    .line 78
    const/4 v3, 0x1

    .line 79
    invoke-direct {v2, v0, v3}, Lg5/k;-><init>(LO3/e0;I)V

    .line 80
    .line 81
    .line 82
    const-wide/16 v3, 0x64

    .line 83
    .line 84
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 85
    .line 86
    .line 87
    :goto_0
    return-void

    .line 88
    :pswitch_0
    iget-object v0, p0, Lg5/k;->r:LO3/e0;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    iput-boolean v1, v0, LO3/e0;->a:Z

    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
