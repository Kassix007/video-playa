.class public final synthetic LR4/L0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/m;
.implements Le/b;
.implements Lo2/k;
.implements Landroidx/concurrent/futures/l;
.implements LS3/c;
.implements LS3/b;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LR4/L0;->q:I

    iput-object p2, p0, LR4/L0;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR4/X1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lo2/m;->setRefreshing(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public b(Landroidx/concurrent/futures/k;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LM5/B;

    .line 4
    .line 5
    new-instance v1, LA/Y;

    .line 6
    .line 7
    const/16 v2, 0x14

    .line 8
    .line 9
    invoke-direct {v1, v2, p1, v0}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LM5/i0;->G(LB5/c;)LM5/J;

    .line 13
    .line 14
    .line 15
    const-string p1, "Deferred.asListenableFuture"

    .line 16
    .line 17
    return-object p1
.end method

.method public c(Landroid/view/View;Lw1/o0;)Lw1/o0;
    .locals 3

    .line 1
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR4/s0;

    .line 4
    .line 5
    const-string v1, "view"

    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, v0, LR4/s0;->b:LR4/k1;

    .line 11
    .line 12
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 13
    .line 14
    invoke-static {p1}, Landroidx/lifecycle/X;->f(Lcom/web2native/MainActivity;)Landroidx/lifecycle/s;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v1, LR4/M0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, v0, p2, v2}, LR4/M0;-><init>(LR4/s0;Lw1/o0;Lq5/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-static {p1, v2, v2, v1, v0}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 26
    .line 27
    .line 28
    return-object p2
.end method

.method public d(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR4/k1;

    .line 4
    .line 5
    check-cast p1, Le/a;

    .line 6
    .line 7
    const-string v1, "result"

    .line 8
    .line 9
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, LR4/k1;->I:LB0/o;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LY4/d;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, Lorg/json/JSONObject;

    .line 24
    .line 25
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "type"

    .line 29
    .line 30
    const-string v3, "updateApplication"

    .line 31
    .line 32
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    iget p1, p1, Le/a;->q:I

    .line 36
    .line 37
    const/4 v2, -0x1

    .line 38
    const-string v3, "updateStatus"

    .line 39
    .line 40
    if-eq p1, v2, :cond_0

    .line 41
    .line 42
    const-string p1, "UPDATE_CANCELLED"

    .line 43
    .line 44
    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    iget-object p1, v0, LY4/d;->h:Lk3/c;

    .line 48
    .line 49
    invoke-static {}, La/a;->B()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v3, "value"

    .line 57
    .line 58
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p1, Lk3/c;->q:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Landroid/content/SharedPreferences;

    .line 64
    .line 65
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v3, "STORED_DATE"

    .line 70
    .line 71
    invoke-interface {p1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const-string p1, "UPDATE_STARTED"

    .line 80
    .line 81
    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    :goto_0
    iget-boolean p1, v0, LY4/d;->f:Z

    .line 85
    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    iget-object p1, v0, LY4/d;->c:LR4/Z0;

    .line 89
    .line 90
    invoke-virtual {p1, v1}, LR4/Z0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    iput-boolean p1, v0, LY4/d;->f:Z

    .line 95
    .line 96
    :cond_1
    return-void
.end method

.method public e()V
    .locals 9

    .line 1
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB5/e;

    .line 4
    .line 5
    sget-object v1, La0/n;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v2, La0/n;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/lang/Iterable;

    .line 11
    .line 12
    const-string v3, "<this>"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v4, 0xa

    .line 20
    .line 21
    invoke-static {v2, v4}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v4, 0x0

    .line 33
    move v5, v4

    .line 34
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_2

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const/4 v7, 0x1

    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    invoke-static {v6, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-eqz v8, :cond_1

    .line 52
    .line 53
    move v5, v7

    .line 54
    move v7, v4

    .line 55
    :cond_1
    if-eqz v7, :cond_0

    .line 56
    .line 57
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    sput-object v3, La0/n;->g:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    monitor-exit v1

    .line 64
    return-void

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    monitor-exit v1

    .line 67
    throw v0
.end method

.method public f(Li1/a;ILandroid/os/Bundle;)Z
    .locals 7

    .line 1
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm/t;

    .line 4
    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x19

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-lt v1, v2, :cond_1

    .line 12
    .line 13
    and-int/2addr p2, v4

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-object p2, p1, Li1/a;->r:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Ly1/f;

    .line 19
    .line 20
    invoke-interface {p2}, Ly1/f;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    iget-object p2, p1, Li1/a;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p2, Ly1/f;

    .line 26
    .line 27
    invoke-interface {p2}, Ly1/f;->b()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Landroid/os/Parcelable;

    .line 32
    .line 33
    if-nez p3, :cond_0

    .line 34
    .line 35
    new-instance p3, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v2, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    move-object p3, v2

    .line 47
    :goto_0
    const-string v2, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 48
    .line 49
    invoke-virtual {p3, v2, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    const-string p2, "InputConnectionCompat"

    .line 55
    .line 56
    const-string p3, "Can\'t insert content from IME; requestPermission() failed"

    .line 57
    .line 58
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    return v3

    .line 62
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 63
    .line 64
    iget-object p1, p1, Li1/a;->r:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ly1/f;

    .line 67
    .line 68
    invoke-interface {p1}, Ly1/f;->a()Landroid/content/ClipDescription;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v5, Landroid/content/ClipData$Item;

    .line 73
    .line 74
    invoke-interface {p1}, Ly1/f;->c()Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-direct {v5, v6}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, v2, v5}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 82
    .line 83
    .line 84
    const/16 v2, 0x1f

    .line 85
    .line 86
    const/4 v5, 0x2

    .line 87
    if-lt v1, v2, :cond_2

    .line 88
    .line 89
    new-instance v1, Li1/a;

    .line 90
    .line 91
    invoke-direct {v1, p2, v5}, Li1/a;-><init>(Landroid/content/ClipData;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    new-instance v1, Lw1/d;

    .line 96
    .line 97
    invoke-direct {v1}, Lw1/d;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, v1, Lw1/d;->r:Landroid/content/ClipData;

    .line 101
    .line 102
    iput v5, v1, Lw1/d;->s:I

    .line 103
    .line 104
    :goto_2
    invoke-interface {p1}, Ly1/f;->e()Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {v1, p1}, Lw1/c;->k(Landroid/net/Uri;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v1, p3}, Lw1/c;->setExtras(Landroid/os/Bundle;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v1}, Lw1/c;->build()Lw1/f;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v0, p1}, Lw1/K;->i(Landroid/view/View;Lw1/f;)Lw1/f;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-nez p1, :cond_3

    .line 123
    .line 124
    return v4

    .line 125
    :cond_3
    return v3
.end method

.method public g(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LR4/L0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LY4/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LY4/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LY4/b;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LY4/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LY4/b;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LY4/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    iget-object v0, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LY4/b;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, LY4/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object p1, p0, LR4/L0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LY4/d;

    .line 4
    .line 5
    iget-object v0, p1, LY4/d;->e:Lorg/json/JSONObject;

    .line 6
    .line 7
    const-string v1, "isUpdateAvailable"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    iget-object v0, p1, LY4/d;->c:LR4/Z0;

    .line 14
    .line 15
    iget-object p1, p1, LY4/d;->e:Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LR4/Z0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method
