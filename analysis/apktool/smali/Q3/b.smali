.class public final LQ3/b;
.super Lcom/google/android/gms/internal/measurement/K1;
.source "SourceFile"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LQ3/b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/content/Context;Landroid/os/Looper;Lp3/z0;Ljava/lang/Object;Lu3/e;Lu3/f;)Lu3/b;
    .locals 8

    .line 1
    iget v0, p0, LQ3/b;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p6}, Lcom/google/android/gms/internal/measurement/K1;->g(Landroid/content/Context;Landroid/os/Looper;Lp3/z0;Ljava/lang/Object;Lu3/e;Lu3/f;)Lu3/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v5, p5

    .line 14
    move-object v6, p6

    .line 15
    new-instance v0, Lcom/google/android/gms/internal/clearcut/z0;

    .line 16
    .line 17
    const/16 v3, 0x28

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    move-object v4, p3

    .line 21
    invoke-direct/range {v0 .. v7}, Lx3/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILp3/z0;Lu3/e;Lu3/f;I)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_1
    invoke-static {p4}, Lk1/i;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    throw p1

    .line 30
    :pswitch_2
    move-object v1, p1

    .line 31
    move-object v2, p2

    .line 32
    move-object v5, p5

    .line 33
    move-object v6, p6

    .line 34
    check-cast p4, LQ3/a;

    .line 35
    .line 36
    new-instance v0, LR3/a;

    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object p1, p3, Lp3/z0;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/Integer;

    .line 44
    .line 45
    new-instance v4, Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string p2, "com.google.android.gms.signin.internal.clientRequestedAccount"

    .line 51
    .line 52
    const/4 p4, 0x0

    .line 53
    invoke-virtual {v4, p2, p4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 54
    .line 55
    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    const-string p2, "com.google.android.gms.common.internal.ClientSettings.sessionId"

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v4, p2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    :cond_0
    const-string p1, "com.google.android.gms.signin.internal.offlineAccessRequested"

    .line 68
    .line 69
    const/4 p2, 0x0

    .line 70
    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string p1, "com.google.android.gms.signin.internal.idTokenRequested"

    .line 74
    .line 75
    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string p1, "com.google.android.gms.signin.internal.serverClientId"

    .line 79
    .line 80
    invoke-virtual {v4, p1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string p1, "com.google.android.gms.signin.internal.usePromptModeForAuthCode"

    .line 84
    .line 85
    const/4 p5, 0x1

    .line 86
    invoke-virtual {v4, p1, p5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string p1, "com.google.android.gms.signin.internal.forceCodeForRefreshToken"

    .line 90
    .line 91
    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string p1, "com.google.android.gms.signin.internal.hostedDomain"

    .line 95
    .line 96
    invoke-virtual {v4, p1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string p1, "com.google.android.gms.signin.internal.logSessionId"

    .line 100
    .line 101
    invoke-virtual {v4, p1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string p1, "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"

    .line 105
    .line 106
    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    move-object v3, p3

    .line 110
    invoke-direct/range {v0 .. v6}, LR3/a;-><init>(Landroid/content/Context;Landroid/os/Looper;Lp3/z0;Landroid/os/Bundle;Lu3/e;Lu3/f;)V

    .line 111
    .line 112
    .line 113
    return-object v0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic h(Landroid/content/Context;Landroid/os/Looper;Lp3/z0;Ljava/lang/Object;Lv3/o;Lv3/o;)Lu3/b;
    .locals 7

    .line 1
    iget v0, p0, LQ3/b;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p6}, Lcom/google/android/gms/internal/measurement/K1;->h(Landroid/content/Context;Landroid/os/Looper;Lp3/z0;Ljava/lang/Object;Lv3/o;Lv3/o;)Lu3/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    move-object v4, p4

    .line 12
    check-cast v4, Lx3/n;

    .line 13
    .line 14
    new-instance v0, Lz3/c;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    move-object v2, p2

    .line 18
    move-object v3, p3

    .line 19
    move-object v5, p5

    .line 20
    move-object v6, p6

    .line 21
    invoke-direct/range {v0 .. v6}, Lz3/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Lp3/z0;Lx3/n;Lv3/o;Lv3/o;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
