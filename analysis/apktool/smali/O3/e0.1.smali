.class public final LO3/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/lang/String;

.field public d:Z

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LO3/h0;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO3/e0;->e:Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Lx3/A;->d(Ljava/lang/String;)V

    iput-object p2, p0, LO3/e0;->c:Ljava/lang/String;

    iput-boolean p3, p0, LO3/e0;->a:Z

    return-void
.end method

.method public constructor <init>(LR4/k1;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO3/e0;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, LO3/e0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR4/k1;

    .line 4
    .line 5
    iget-object v1, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 6
    .line 7
    invoke-virtual {p0}, LO3/e0;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    iget-object v1, v0, LR4/k1;->M:LO3/e0;

    .line 14
    .line 15
    iget-object v1, v1, LO3/e0;->c:Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, ""

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v0, v0, LR4/k1;->e:LT1/u;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, LT1/u;->c()V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :cond_1
    iget-object v0, v0, LR4/k1;->M:LO3/e0;

    .line 34
    .line 35
    iput-object v2, v0, LO3/e0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, LO3/e0;->c()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-boolean v2, p0, LO3/e0;->a:Z

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/app/Activity;->finishAndRemoveTask()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 49
    .line 50
    .line 51
    :cond_3
    const/4 v1, 0x1

    .line 52
    iput-boolean v1, p0, LO3/e0;->a:Z

    .line 53
    .line 54
    iget-object v0, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 55
    .line 56
    const-string v1, "Press again to exit"

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 64
    .line 65
    .line 66
    new-instance v0, Landroid/os/Handler;

    .line 67
    .line 68
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lg5/k;

    .line 76
    .line 77
    invoke-direct {v1, p0, v2}, Lg5/k;-><init>(LO3/e0;I)V

    .line 78
    .line 79
    .line 80
    const-wide/16 v2, 0x7d0

    .line 81
    .line 82
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public b()Z
    .locals 7

    .line 1
    iget-object v0, p0, LO3/e0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR4/k1;

    .line 4
    .line 5
    iget-object v1, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 6
    .line 7
    const-string v2, "connectivity"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "null cannot be cast to non-null type android.net.ConnectivityManager"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, v0, LR4/k1;->d:LR4/i;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, v2, LR4/i;->b:LR4/F1;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v2, v3

    .line 33
    :goto_0
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v2, :cond_9

    .line 36
    .line 37
    iget-object v2, v0, LR4/k1;->e:LT1/u;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v2, v2, LT1/u;->b:LW1/j;

    .line 42
    .line 43
    invoke-virtual {v2}, LW1/j;->f()LT1/p;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    iget-object v2, v2, LT1/p;->r:LW1/l;

    .line 50
    .line 51
    iget-object v2, v2, LW1/l;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v2, v3

    .line 57
    :goto_1
    const-string v6, "splashScreen"

    .line 58
    .line 59
    invoke-static {v2, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_9

    .line 64
    .line 65
    iget-object v2, v0, LR4/k1;->e:LT1/u;

    .line 66
    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    iget-object v2, v2, LT1/u;->b:LW1/j;

    .line 70
    .line 71
    invoke-virtual {v2}, LW1/j;->f()LT1/p;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    iget-object v2, v2, LT1/p;->r:LW1/l;

    .line 78
    .line 79
    iget-object v2, v2, LW1/l;->e:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Ljava/lang/String;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move-object v2, v3

    .line 85
    :goto_2
    if-eqz v2, :cond_9

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_3

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_3
    if-nez v1, :cond_9

    .line 95
    .line 96
    iget-boolean v1, p0, LO3/e0;->d:Z

    .line 97
    .line 98
    if-nez v1, :cond_b

    .line 99
    .line 100
    iget-object v1, v0, LR4/k1;->e:LT1/u;

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    iget-object v1, v1, LT1/u;->b:LW1/j;

    .line 105
    .line 106
    invoke-virtual {v1}, LW1/j;->f()LT1/p;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v1, :cond_4

    .line 111
    .line 112
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 113
    .line 114
    iget-object v1, v1, LW1/l;->e:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Ljava/lang/String;

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move-object v1, v3

    .line 120
    :goto_3
    invoke-static {v1, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-nez v1, :cond_b

    .line 125
    .line 126
    iget-object v1, v0, LR4/k1;->e:LT1/u;

    .line 127
    .line 128
    if-eqz v1, :cond_5

    .line 129
    .line 130
    iget-object v1, v1, LT1/u;->b:LW1/j;

    .line 131
    .line 132
    invoke-virtual {v1}, LW1/j;->f()LT1/p;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 139
    .line 140
    iget-object v1, v1, LW1/l;->e:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Ljava/lang/String;

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    move-object v1, v3

    .line 146
    :goto_4
    if-eqz v1, :cond_b

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_6

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_6
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 156
    .line 157
    if-eqz v1, :cond_7

    .line 158
    .line 159
    iget-object v3, v1, LR4/i;->b:LR4/F1;

    .line 160
    .line 161
    :cond_7
    if-eqz v3, :cond_b

    .line 162
    .line 163
    iget-boolean v1, p0, LO3/e0;->d:Z

    .line 164
    .line 165
    if-nez v1, :cond_b

    .line 166
    .line 167
    iput-boolean v4, p0, LO3/e0;->d:Z

    .line 168
    .line 169
    invoke-virtual {p0}, LO3/e0;->b()Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_8

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_8
    iget-object v0, v0, LR4/k1;->e:LT1/u;

    .line 177
    .line 178
    if-eqz v0, :cond_b

    .line 179
    .line 180
    const-string v1, "noInternetScreen"

    .line 181
    .line 182
    invoke-static {v0, v1}, LT1/u;->b(LT1/u;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return v5

    .line 186
    :cond_9
    :goto_5
    if-nez v1, :cond_c

    .line 187
    .line 188
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 189
    .line 190
    if-eqz v0, :cond_a

    .line 191
    .line 192
    iget-object v3, v0, LR4/i;->b:LR4/F1;

    .line 193
    .line 194
    :cond_a
    if-nez v3, :cond_b

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_b
    :goto_6
    return v5

    .line 198
    :cond_c
    :goto_7
    return v4
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, LO3/e0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR4/k1;

    .line 4
    .line 5
    invoke-virtual {p0}, LO3/e0;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    iget-boolean v1, p0, LO3/e0;->b:Z

    .line 12
    .line 13
    if-nez v1, :cond_4

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p0, LO3/e0;->b:Z

    .line 17
    .line 18
    iget-object v1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/webkit/WebView;->reload()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v1, v2

    .line 36
    :goto_0
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-object v1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-string v2, "https://www.smspariaz.com"

    .line 48
    .line 49
    :cond_3
    :goto_1
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    const/4 v0, 0x0

    .line 60
    iput-boolean v0, p0, LO3/e0;->d:Z

    .line 61
    .line 62
    new-instance v0, Landroid/os/Handler;

    .line 63
    .line 64
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lg5/k;

    .line 72
    .line 73
    const/4 v2, 0x1

    .line 74
    invoke-direct {v1, p0, v2}, Lg5/k;-><init>(LO3/e0;I)V

    .line 75
    .line 76
    .line 77
    const-wide/16 v2, 0x64

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 80
    .line 81
    .line 82
    :cond_5
    return-void
.end method

.method public d()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, LO3/e0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LO3/e0;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, LO3/e0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LO3/h0;

    .line 11
    .line 12
    iget-object v1, p0, LO3/e0;->c:Ljava/lang/String;

    .line 13
    .line 14
    iget-boolean v2, p0, LO3/e0;->a:Z

    .line 15
    .line 16
    invoke-virtual {v0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput-boolean v0, p0, LO3/e0;->d:Z

    .line 25
    .line 26
    :cond_0
    iget-boolean v0, p0, LO3/e0;->d:Z

    .line 27
    .line 28
    return v0
.end method

.method public e(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LO3/e0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LO3/h0;

    .line 4
    .line 5
    invoke-virtual {v0}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, LO3/e0;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 19
    .line 20
    .line 21
    iput-boolean p1, p0, LO3/e0;->d:Z

    .line 22
    .line 23
    return-void
.end method
