.class public final synthetic LU4/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/k;
.implements Landroidx/concurrent/futures/l;
.implements LS3/a;


# instance fields
.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/E;->q:Ljava/lang/Object;

    iput-object p2, p0, LU4/E;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LU4/E;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR4/k1;

    .line 4
    .line 5
    iget-object v1, p0, LU4/E;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LR4/X1;

    .line 8
    .line 9
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    invoke-virtual {v1, v0}, Lo2/m;->setRefreshing(Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public b(Landroidx/concurrent/futures/k;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LU4/E;->q:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, LU4/E;->r:Ljava/lang/Object;

    check-cast v1, LB5/a;

    invoke-static {v0, v1, p1}, Landroidx/work/WorkerKt;->c(Ljava/util/concurrent/Executor;LB5/a;Landroidx/concurrent/futures/k;)Lm5/y;

    move-result-object p1

    return-object p1
.end method

.method public onComplete(LS3/d;)V
    .locals 10

    .line 1
    iget-object v0, p0, LU4/E;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB0/o;

    .line 4
    .line 5
    iget-object v1, p0, LU4/E;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LB0/G0;

    .line 8
    .line 9
    const-string v2, "task"

    .line 10
    .line 11
    invoke-static {p1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, LS3/d;->d()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, LS3/d;->c()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, LD4/a;

    .line 25
    .line 26
    iget-object v1, v1, LB0/G0;->s:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lcom/web2native/MainActivity;

    .line 29
    .line 30
    check-cast p1, LD4/b;

    .line 31
    .line 32
    iget-boolean v2, p1, LD4/b;->r:Z

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    new-instance p1, LS3/k;

    .line 37
    .line 38
    invoke-direct {p1}, LS3/k;-><init>()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, v0}, LS3/k;->g(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v2, Landroid/content/Intent;

    .line 47
    .line 48
    const-class v3, Lcom/google/android/play/core/common/PlayCoreDialogWrapperActivity;

    .line 49
    .line 50
    invoke-direct {v2, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 51
    .line 52
    .line 53
    const-string v3, "confirmation_intent"

    .line 54
    .line 55
    iget-object p1, p1, LD4/b;->q:Landroid/app/PendingIntent;

    .line 56
    .line 57
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    const-string v3, "window_flags"

    .line 73
    .line 74
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 75
    .line 76
    .line 77
    new-instance p1, LS3/e;

    .line 78
    .line 79
    invoke-direct {p1}, LS3/e;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v3, LD4/c;

    .line 83
    .line 84
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Landroid/os/Handler;

    .line 87
    .line 88
    invoke-direct {v3, v0, p1}, LD4/c;-><init>(Landroid/os/Handler;LS3/e;)V

    .line 89
    .line 90
    .line 91
    const-string v0, "result_receiver"

    .line 92
    .line 93
    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p1, LS3/e;->a:LS3/k;

    .line 100
    .line 101
    :goto_0
    const-string v0, "launchReviewFlow(...)"

    .line 102
    .line 103
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    new-instance v0, LC0/Z0;

    .line 107
    .line 108
    const/16 v1, 0x11

    .line 109
    .line 110
    invoke-direct {v0, v1}, LC0/Z0;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, LS3/k;->e(LS3/a;)LS3/k;

    .line 114
    .line 115
    .line 116
    new-instance v0, LC0/Z0;

    .line 117
    .line 118
    const/16 v1, 0x12

    .line 119
    .line 120
    invoke-direct {v0, v1}, LC0/Z0;-><init>(I)V

    .line 121
    .line 122
    .line 123
    sget-object v1, LS3/f;->a:LO3/Q0;

    .line 124
    .line 125
    new-instance v2, LS3/h;

    .line 126
    .line 127
    invoke-direct {v2, v1, v0}, LS3/h;-><init>(Ljava/util/concurrent/Executor;LS3/b;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p1, LS3/k;->b:Lcom/google/android/gms/internal/measurement/O1;

    .line 131
    .line 132
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/O1;->e(LS3/i;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, LS3/k;->i()V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_1

    .line 139
    .line 140
    :cond_1
    const-string p1, "in app review not supported"

    .line 141
    .line 142
    const-string v0, "FallBack, in app review not supported"

    .line 143
    .line 144
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    iget-object p1, v1, LB0/G0;->t:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p1, Landroid/content/SharedPreferences;

    .line 150
    .line 151
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    const-string v0, "inAppReviewPermission"

    .line 155
    .line 156
    const/4 v2, 0x1

    .line 157
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_2

    .line 162
    .line 163
    new-instance v0, Ljava/util/Date;

    .line 164
    .line 165
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    const-string v0, "inAppReview"

    .line 173
    .line 174
    const-wide/16 v4, 0x0

    .line 175
    .line 176
    invoke-interface {p1, v0, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 177
    .line 178
    .line 179
    move-result-wide v6

    .line 180
    const-wide/32 v8, 0x4d3f6400

    .line 181
    .line 182
    .line 183
    sub-long v6, v2, v6

    .line 184
    .line 185
    sub-long/2addr v6, v8

    .line 186
    cmp-long v4, v6, v4

    .line 187
    .line 188
    if-lez v4, :cond_2

    .line 189
    .line 190
    const-string v4, "show rate app fall back dialog"

    .line 191
    .line 192
    const-string v5, "true"

    .line 193
    .line 194
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    new-instance v4, Li4/b;

    .line 198
    .line 199
    iget-object v5, v1, LB0/G0;->r:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v5, Lcom/web2native/MainActivity;

    .line 202
    .line 203
    invoke-direct {v4, v5}, Li4/b;-><init>(Lcom/web2native/MainActivity;)V

    .line 204
    .line 205
    .line 206
    iget-object v5, v4, LU/l;->r:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v5, Lh/b;

    .line 209
    .line 210
    const-string v6, "Rate App"

    .line 211
    .line 212
    iput-object v6, v5, Lh/b;->d:Ljava/lang/CharSequence;

    .line 213
    .line 214
    const-string v6, "If you enjoy using the app, kindly rate it on Play Store. Thanks!"

    .line 215
    .line 216
    iput-object v6, v5, Lh/b;->f:Ljava/lang/String;

    .line 217
    .line 218
    new-instance v6, Ll5/a;

    .line 219
    .line 220
    const/4 v7, 0x0

    .line 221
    invoke-direct {v6, v1, v7}, Ll5/a;-><init>(LB0/G0;I)V

    .line 222
    .line 223
    .line 224
    const-string v7, "RATE NOW"

    .line 225
    .line 226
    iput-object v7, v5, Lh/b;->g:Ljava/lang/String;

    .line 227
    .line 228
    iput-object v6, v5, Lh/b;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 229
    .line 230
    new-instance v6, Ll5/a;

    .line 231
    .line 232
    const/4 v7, 0x1

    .line 233
    invoke-direct {v6, v1, v7}, Ll5/a;-><init>(LB0/G0;I)V

    .line 234
    .line 235
    .line 236
    const-string v1, "NO, THANKS"

    .line 237
    .line 238
    iput-object v1, v5, Lh/b;->i:Ljava/lang/String;

    .line 239
    .line 240
    iput-object v6, v5, Lh/b;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 241
    .line 242
    new-instance v1, LR4/K;

    .line 243
    .line 244
    const/4 v6, 0x2

    .line 245
    invoke-direct {v1, v6}, LR4/K;-><init>(I)V

    .line 246
    .line 247
    .line 248
    const-string v6, "REMIND ME LATER"

    .line 249
    .line 250
    iput-object v6, v5, Lh/b;->k:Ljava/lang/String;

    .line 251
    .line 252
    iput-object v1, v5, Lh/b;->l:LR4/K;

    .line 253
    .line 254
    new-instance v1, Ll5/b;

    .line 255
    .line 256
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 257
    .line 258
    .line 259
    iput-object v1, v5, Lh/b;->n:Ll5/b;

    .line 260
    .line 261
    invoke-virtual {v4}, Li4/b;->f()Lh/f;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 266
    .line 267
    .line 268
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    const-string v1, "edit(...)"

    .line 273
    .line 274
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-interface {p1, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 278
    .line 279
    .line 280
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 281
    .line 282
    .line 283
    :cond_2
    :goto_1
    const-string p1, "review request"

    .line 284
    .line 285
    const-string v0, "complete"

    .line 286
    .line 287
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    return-void
.end method
