.class public final LL/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LL/s;->b:Ljava/lang/Object;

    .line 8
    new-instance v0, LO3/D;

    const/16 v1, 0x1b

    .line 9
    invoke-direct {v0, v1}, LO3/D;-><init>(I)V

    .line 10
    iput-object v0, p0, LL/s;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LL/s;->a:Z

    return-void
.end method

.method public constructor <init>(ZLB5/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LL/s;->a:Z

    check-cast p2, Lkotlin/jvm/internal/n;

    iput-object p2, p0, LL/s;->b:Ljava/lang/Object;

    .line 2
    new-instance p1, Lu/c;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    sget-object v0, Lu/A0;->a:LZ/m;

    const v1, 0x3c23d70a    # 0.01f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 3
    invoke-direct {p1, p2, v0, v1}, Lu/c;-><init>(Ljava/lang/Object;LZ/m;Ljava/lang/Object;)V

    .line 4
    iput-object p1, p0, LL/s;->c:Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LL/s;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 1

    .line 1
    iget-object v0, p0, LL/s;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh6/h;

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p3}, LL/s;->g(Ljava/io/IOException;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0, p0, p2, p1, p3}, Lh6/h;->h(LL/s;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public b()LZ/m;
    .locals 9

    .line 1
    iget-object v0, p0, LL/s;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Intent;

    .line 4
    .line 5
    const-string v1, "android.support.customtabs.extra.SESSION"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string v1, "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"

    .line 26
    .line 27
    iget-boolean v2, p0, LL/s;->a:Z

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LL/s;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, LO3/D;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v1, Landroid/os/Bundle;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, LL/s;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Landroid/os/Bundle;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    :cond_1
    const-string v1, "androidx.browser.customtabs.extra.SHARE_STATE"

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 63
    .line 64
    invoke-static {}, Lq/b;->a()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_3

    .line 73
    .line 74
    const-string v5, "com.android.browser.headers"

    .line 75
    .line 76
    invoke-virtual {v0, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0, v5}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    new-instance v6, Landroid/os/Bundle;

    .line 88
    .line 89
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 90
    .line 91
    .line 92
    :goto_0
    const-string v7, "Accept-Language"

    .line 93
    .line 94
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-nez v8, :cond_3

    .line 99
    .line 100
    invoke-virtual {v6, v7, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    :cond_3
    const/16 v4, 0x22

    .line 107
    .line 108
    if-lt v1, v4, :cond_5

    .line 109
    .line 110
    iget-object v1, p0, LL/s;->d:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, Landroid/app/ActivityOptions;

    .line 113
    .line 114
    if-nez v1, :cond_4

    .line 115
    .line 116
    invoke-static {}, Lq/a;->a()Landroid/app/ActivityOptions;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, p0, LL/s;->d:Ljava/lang/Object;

    .line 121
    .line 122
    :cond_4
    iget-object v1, p0, LL/s;->d:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Landroid/app/ActivityOptions;

    .line 125
    .line 126
    invoke-static {v1, v2}, Lq/c;->a(Landroid/app/ActivityOptions;Z)V

    .line 127
    .line 128
    .line 129
    :cond_5
    iget-object v1, p0, LL/s;->d:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Landroid/app/ActivityOptions;

    .line 132
    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    :cond_6
    new-instance v1, LZ/m;

    .line 140
    .line 141
    const/16 v2, 0x17

    .line 142
    .line 143
    invoke-direct {v1, v2, v0, v3}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-object v1
.end method

.method public c(LB0/N;FJ)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v2, LB0/N;->q:Ll0/b;

    .line 6
    .line 7
    iget-object v3, v1, LL/s;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lu/c;

    .line 10
    .line 11
    invoke-virtual {v3}, Lu/c;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    cmpl-float v4, v3, v4

    .line 23
    .line 24
    if-lez v4, :cond_1

    .line 25
    .line 26
    move-wide/from16 v4, p3

    .line 27
    .line 28
    invoke-static {v4, v5, v3}, Lj0/o;->b(JF)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    iget-boolean v5, v1, LL/s;->a:Z

    .line 33
    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    invoke-interface {v0}, Ll0/d;->d()J

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    invoke-static {v5, v6}, Li0/e;->d(J)F

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    invoke-interface {v0}, Ll0/d;->d()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    invoke-static {v5, v6}, Li0/e;->b(J)F

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    iget-object v13, v0, Ll0/b;->r:LB0/G0;

    .line 53
    .line 54
    invoke-virtual {v13}, LB0/G0;->E()J

    .line 55
    .line 56
    .line 57
    move-result-wide v14

    .line 58
    invoke-virtual {v13}, LB0/G0;->t()Lj0/m;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Lj0/m;->k()V

    .line 63
    .line 64
    .line 65
    :try_start_0
    iget-object v0, v13, LB0/G0;->r:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Li1/a;

    .line 68
    .line 69
    iget-object v0, v0, Li1/a;->r:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, LB0/G0;

    .line 72
    .line 73
    invoke-virtual {v0}, LB0/G0;->t()Lj0/m;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v9, 0x0

    .line 79
    const/4 v12, 0x1

    .line 80
    invoke-interface/range {v7 .. v12}, Lj0/m;->g(FFFFI)V

    .line 81
    .line 82
    .line 83
    const-wide/16 v6, 0x0

    .line 84
    .line 85
    const/16 v8, 0x7c

    .line 86
    .line 87
    move/from16 v5, p2

    .line 88
    .line 89
    invoke-static/range {v2 .. v8}, Ll0/d;->V(Ll0/d;JFJI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    invoke-virtual {v13}, LB0/G0;->t()Lj0/m;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Lj0/m;->i()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v13, v14, v15}, LB0/G0;->X(J)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    invoke-virtual {v13}, LB0/G0;->t()Lj0/m;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-interface {v2}, Lj0/m;->i()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13, v14, v15}, LB0/G0;->X(J)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_0
    const-wide/16 v6, 0x0

    .line 116
    .line 117
    const/16 v8, 0x7c

    .line 118
    .line 119
    move-object/from16 v2, p1

    .line 120
    .line 121
    move/from16 v5, p2

    .line 122
    .line 123
    invoke-static/range {v2 .. v8}, Ll0/d;->V(Ll0/d;JFJI)V

    .line 124
    .line 125
    .line 126
    :cond_1
    return-void
.end method

.method public d(Ly/h;LM5/w;)V
    .locals 7

    .line 1
    iget-object v0, p0, LL/s;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    instance-of v1, p1, Ly/f;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    instance-of v2, p1, Ly/g;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    move-object v2, p1

    .line 18
    check-cast v2, Ly/g;

    .line 19
    .line 20
    iget-object v2, v2, Ly/g;->a:Ly/f;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    instance-of v2, p1, Ly/d;

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    instance-of v2, p1, Ly/e;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    move-object v2, p1

    .line 39
    check-cast v2, Ly/e;

    .line 40
    .line 41
    iget-object v2, v2, Ly/e;->a:Ly/d;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    instance-of v2, p1, Ly/b;

    .line 48
    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    instance-of v2, p1, Ly/c;

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    move-object v2, p1

    .line 60
    check-cast v2, Ly/c;

    .line 61
    .line 62
    iget-object v2, v2, Ly/c;->a:Ly/b;

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_5
    instance-of v2, p1, Ly/a;

    .line 69
    .line 70
    if-eqz v2, :cond_10

    .line 71
    .line 72
    move-object v2, p1

    .line 73
    check-cast v2, Ly/a;

    .line 74
    .line 75
    iget-object v2, v2, Ly/a;->a:Ly/b;

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-static {v0}, Ln5/l;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ly/h;

    .line 85
    .line 86
    iget-object v2, p0, LL/s;->e:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Ly/h;

    .line 89
    .line 90
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_10

    .line 95
    .line 96
    const/4 v2, 0x3

    .line 97
    const/4 v3, 0x2

    .line 98
    const/4 v4, 0x0

    .line 99
    if-eqz v0, :cond_c

    .line 100
    .line 101
    iget-object v5, p0, LL/s;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v5, Lkotlin/jvm/internal/n;

    .line 104
    .line 105
    invoke-interface {v5}, LB5/a;->invoke()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, LL/g;

    .line 110
    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    iget p1, v5, LL/g;->c:F

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    instance-of v1, p1, Ly/d;

    .line 117
    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    iget p1, v5, LL/g;->b:F

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_7
    instance-of p1, p1, Ly/b;

    .line 124
    .line 125
    if-eqz p1, :cond_8

    .line 126
    .line 127
    iget p1, v5, LL/g;->a:F

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_8
    const/4 p1, 0x0

    .line 131
    :goto_1
    sget-object v1, LL/l;->a:Lu/z0;

    .line 132
    .line 133
    instance-of v5, v0, Ly/f;

    .line 134
    .line 135
    if-eqz v5, :cond_9

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_9
    instance-of v5, v0, Ly/d;

    .line 139
    .line 140
    const/16 v6, 0x2d

    .line 141
    .line 142
    if-eqz v5, :cond_a

    .line 143
    .line 144
    new-instance v1, Lu/z0;

    .line 145
    .line 146
    sget-object v5, Lu/y;->b:LC0/Z0;

    .line 147
    .line 148
    invoke-direct {v1, v6, v5, v3}, Lu/z0;-><init>(ILu/x;I)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_a
    instance-of v5, v0, Ly/b;

    .line 153
    .line 154
    if-eqz v5, :cond_b

    .line 155
    .line 156
    new-instance v1, Lu/z0;

    .line 157
    .line 158
    sget-object v5, Lu/y;->b:LC0/Z0;

    .line 159
    .line 160
    invoke-direct {v1, v6, v5, v3}, Lu/z0;-><init>(ILu/x;I)V

    .line 161
    .line 162
    .line 163
    :cond_b
    :goto_2
    new-instance v3, LL/q;

    .line 164
    .line 165
    invoke-direct {v3, p0, p1, v1, v4}, LL/q;-><init>(LL/s;FLu/k;Lq5/c;)V

    .line 166
    .line 167
    .line 168
    invoke-static {p2, v4, v4, v3, v2}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_c
    iget-object p1, p0, LL/s;->e:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p1, Ly/h;

    .line 175
    .line 176
    sget-object v1, LL/l;->a:Lu/z0;

    .line 177
    .line 178
    instance-of v5, p1, Ly/f;

    .line 179
    .line 180
    if-eqz v5, :cond_d

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_d
    instance-of v5, p1, Ly/d;

    .line 184
    .line 185
    if-eqz v5, :cond_e

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_e
    instance-of p1, p1, Ly/b;

    .line 189
    .line 190
    if-eqz p1, :cond_f

    .line 191
    .line 192
    new-instance v1, Lu/z0;

    .line 193
    .line 194
    const/16 p1, 0x96

    .line 195
    .line 196
    sget-object v5, Lu/y;->b:LC0/Z0;

    .line 197
    .line 198
    invoke-direct {v1, p1, v5, v3}, Lu/z0;-><init>(ILu/x;I)V

    .line 199
    .line 200
    .line 201
    :cond_f
    :goto_3
    new-instance p1, LL/r;

    .line 202
    .line 203
    invoke-direct {p1, p0, v1, v4}, LL/r;-><init>(LL/s;Lu/k;Lq5/c;)V

    .line 204
    .line 205
    .line 206
    invoke-static {p2, v4, v4, p1, v2}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 207
    .line 208
    .line 209
    :goto_4
    iput-object v0, p0, LL/s;->e:Ljava/lang/Object;

    .line 210
    .line 211
    :cond_10
    return-void
.end method

.method public e(LZ/m;LC0/A;Z)I
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LL/s;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LC0/H0;

    .line 6
    .line 7
    iget-object v2, v1, LL/s;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LB0/t;

    .line 10
    .line 11
    iget-boolean v3, v1, LL/s;->a:Z

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    return v4

    .line 17
    :cond_0
    const/4 v3, 0x1

    .line 18
    :try_start_0
    iput-boolean v3, v1, LL/s;->a:Z

    .line 19
    .line 20
    iget-object v5, v1, LL/s;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Li3/a;

    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    move-object/from16 v7, p2

    .line 27
    .line 28
    invoke-virtual {v5, v6, v7}, Li3/a;->s(LZ/m;LC0/A;)Lcom/google/android/gms/internal/measurement/O1;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, v5, Lcom/google/android/gms/internal/measurement/O1;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, Lr/q;

    .line 35
    .line 36
    invoke-virtual {v6}, Lr/q;->g()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    move v8, v4

    .line 41
    :goto_0
    if-ge v8, v7, :cond_3

    .line 42
    .line 43
    invoke-virtual {v6, v8}, Lr/q;->h(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    check-cast v9, Lv0/l;

    .line 48
    .line 49
    iget-boolean v10, v9, Lv0/l;->d:Z

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    iget-boolean v9, v9, Lv0/l;->h:Z

    .line 54
    .line 55
    if-eqz v9, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_2
    :goto_1
    move v7, v4

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v7, v3

    .line 67
    :goto_2
    invoke-virtual {v6}, Lr/q;->g()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    move v9, v4

    .line 72
    :goto_3
    if-ge v9, v8, :cond_6

    .line 73
    .line 74
    invoke-virtual {v6, v9}, Lr/q;->h(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, Lv0/l;

    .line 79
    .line 80
    if-nez v7, :cond_4

    .line 81
    .line 82
    invoke-static {v10}, Lv0/v;->a(Lv0/l;)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-eqz v11, :cond_5

    .line 87
    .line 88
    :cond_4
    iget-object v11, v1, LL/s;->b:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v12, v11

    .line 91
    check-cast v12, LB0/L;

    .line 92
    .line 93
    iget-wide v13, v10, Lv0/l;->c:J

    .line 94
    .line 95
    iget-object v11, v1, LL/s;->e:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v15, v11

    .line 98
    check-cast v15, LB0/t;

    .line 99
    .line 100
    iget v11, v10, Lv0/l;->i:I

    .line 101
    .line 102
    const/16 v17, 0x1

    .line 103
    .line 104
    move/from16 v16, v11

    .line 105
    .line 106
    invoke-virtual/range {v12 .. v17}, LB0/L;->y(JLB0/t;IZ)V

    .line 107
    .line 108
    .line 109
    iget-object v11, v2, LB0/t;->q:Lr/C;

    .line 110
    .line 111
    invoke-virtual {v11}, Lr/C;->g()Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-nez v11, :cond_5

    .line 116
    .line 117
    iget-wide v11, v10, Lv0/l;->a:J

    .line 118
    .line 119
    invoke-static {v10}, Lv0/v;->a(Lv0/l;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    invoke-virtual {v0, v11, v12, v2, v10}, LC0/H0;->a(JLjava/util/List;Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, LB0/t;->clear()V

    .line 127
    .line 128
    .line 129
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move/from16 v2, p3

    .line 133
    .line 134
    invoke-virtual {v0, v5, v2}, LC0/H0;->c(Lcom/google/android/gms/internal/measurement/O1;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    iget-boolean v2, v5, Lcom/google/android/gms/internal/measurement/O1;->a:Z

    .line 139
    .line 140
    if-eqz v2, :cond_8

    .line 141
    .line 142
    :cond_7
    move v2, v4

    .line 143
    goto :goto_5

    .line 144
    :cond_8
    invoke-virtual {v6}, Lr/q;->g()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    move v5, v4

    .line 149
    :goto_4
    if-ge v5, v2, :cond_7

    .line 150
    .line 151
    invoke-virtual {v6, v5}, Lr/q;->h(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Lv0/l;

    .line 156
    .line 157
    invoke-static {v7, v3}, Lv0/v;->f(Lv0/l;Z)J

    .line 158
    .line 159
    .line 160
    move-result-wide v8

    .line 161
    const-wide/16 v10, 0x0

    .line 162
    .line 163
    invoke-static {v8, v9, v10, v11}, Li0/b;->b(JJ)Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-nez v8, :cond_9

    .line 168
    .line 169
    invoke-virtual {v7}, Lv0/l;->b()Z

    .line 170
    .line 171
    .line 172
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    if-eqz v7, :cond_9

    .line 174
    .line 175
    move v2, v3

    .line 176
    goto :goto_5

    .line 177
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :goto_5
    shl-int/2addr v2, v3

    .line 181
    or-int/2addr v0, v2

    .line 182
    iput-boolean v4, v1, LL/s;->a:Z

    .line 183
    .line 184
    return v0

    .line 185
    :goto_6
    iput-boolean v4, v1, LL/s;->a:Z

    .line 186
    .line 187
    throw v0
.end method

.method public f(Z)Ld6/t;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LL/s;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li6/d;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Li6/d;->f(Z)Ld6/t;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iput-object p0, p1, Ld6/t;->m:LL/s;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :catch_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object p1

    .line 17
    :goto_0
    invoke-virtual {p0, p1}, LL/s;->g(Ljava/io/IOException;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public g(Ljava/io/IOException;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LL/s;->a:Z

    .line 3
    .line 4
    iget-object v1, p0, LL/s;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lh6/d;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Lh6/d;->c(Ljava/io/IOException;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LL/s;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Li6/d;

    .line 14
    .line 15
    invoke-interface {v1}, Li6/d;->g()Lh6/j;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, LL/s;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lh6/h;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    instance-of v3, p1, Lk6/A;

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    move-object v3, p1

    .line 29
    check-cast v3, Lk6/A;

    .line 30
    .line 31
    iget v3, v3, Lk6/A;->q:I

    .line 32
    .line 33
    const/16 v4, 0x8

    .line 34
    .line 35
    if-ne v3, v4, :cond_0

    .line 36
    .line 37
    iget p1, v1, Lh6/j;->n:I

    .line 38
    .line 39
    add-int/2addr p1, v0

    .line 40
    iput p1, v1, Lh6/j;->n:I

    .line 41
    .line 42
    if-le p1, v0, :cond_5

    .line 43
    .line 44
    iput-boolean v0, v1, Lh6/j;->j:Z

    .line 45
    .line 46
    iget p1, v1, Lh6/j;->l:I

    .line 47
    .line 48
    add-int/2addr p1, v0

    .line 49
    iput p1, v1, Lh6/j;->l:I

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_2

    .line 54
    :cond_0
    check-cast p1, Lk6/A;

    .line 55
    .line 56
    iget p1, p1, Lk6/A;->q:I

    .line 57
    .line 58
    const/16 v3, 0x9

    .line 59
    .line 60
    if-ne p1, v3, :cond_1

    .line 61
    .line 62
    iget-boolean p1, v2, Lh6/h;->C:Z

    .line 63
    .line 64
    if-nez p1, :cond_5

    .line 65
    .line 66
    :cond_1
    iput-boolean v0, v1, Lh6/j;->j:Z

    .line 67
    .line 68
    iget p1, v1, Lh6/j;->l:I

    .line 69
    .line 70
    add-int/2addr p1, v0

    .line 71
    iput p1, v1, Lh6/j;->l:I

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget-object v3, v1, Lh6/j;->g:Lk6/n;

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    move v3, v0

    .line 79
    goto :goto_0

    .line 80
    :cond_3
    const/4 v3, 0x0

    .line 81
    :goto_0
    if-eqz v3, :cond_4

    .line 82
    .line 83
    instance-of v3, p1, Lk6/a;

    .line 84
    .line 85
    if-eqz v3, :cond_5

    .line 86
    .line 87
    :cond_4
    iput-boolean v0, v1, Lh6/j;->j:Z

    .line 88
    .line 89
    iget v3, v1, Lh6/j;->m:I

    .line 90
    .line 91
    if-nez v3, :cond_5

    .line 92
    .line 93
    iget-object v2, v2, Lh6/h;->q:Ld6/q;

    .line 94
    .line 95
    iget-object v3, v1, Lh6/j;->b:Ld6/x;

    .line 96
    .line 97
    invoke-static {v2, v3, p1}, Lh6/j;->d(Ld6/q;Ld6/x;Ljava/io/IOException;)V

    .line 98
    .line 99
    .line 100
    iget p1, v1, Lh6/j;->l:I

    .line 101
    .line 102
    add-int/2addr p1, v0

    .line 103
    iput p1, v1, Lh6/j;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    :cond_5
    :goto_1
    monitor-exit v1

    .line 106
    return-void

    .line 107
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    throw p1
.end method
