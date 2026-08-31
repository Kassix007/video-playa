.class public final LD4/d;
.super LE4/g;
.source "SourceFile"


# instance fields
.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LE4/j;Landroid/os/IBinder;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LD4/d;->r:I

    .line 2
    iput-object p1, p0, LD4/d;->t:Ljava/lang/Object;

    iput-object p2, p0, LD4/d;->s:Ljava/lang/Object;

    invoke-direct {p0}, LE4/g;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;LS3/e;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LD4/d;->r:I

    iput-object p1, p0, LD4/d;->t:Ljava/lang/Object;

    iput-object p3, p0, LD4/d;->s:Ljava/lang/Object;

    invoke-direct {p0, p2}, LE4/g;-><init>(LS3/e;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget v0, p0, LD4/d;->r:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const-string v2, "PlayCore"

    .line 5
    .line 6
    iget-object v3, p0, LD4/d;->s:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, LD4/d;->t:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, LE4/j;

    .line 15
    .line 16
    iget-object v0, v4, LE4/j;->r:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LE4/k;

    .line 19
    .line 20
    check-cast v3, Landroid/os/IBinder;

    .line 21
    .line 22
    sget v4, LE4/d;->d:I

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v4, "com.google.android.play.core.inappreview.protocol.IInAppReviewService"

    .line 29
    .line 30
    invoke-interface {v3, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    instance-of v6, v4, LE4/e;

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    move-object v3, v4

    .line 39
    check-cast v3, LE4/e;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance v4, LE4/c;

    .line 43
    .line 44
    invoke-direct {v4, v3}, LE4/c;-><init>(Landroid/os/IBinder;)V

    .line 45
    .line 46
    .line 47
    move-object v3, v4

    .line 48
    :goto_0
    check-cast v3, LE4/e;

    .line 49
    .line 50
    iput-object v3, v0, LE4/k;->m:LE4/e;

    .line 51
    .line 52
    iget-object v3, v0, LE4/k;->b:LE4/f;

    .line 53
    .line 54
    const-string v4, "linkToDeath"

    .line 55
    .line 56
    new-array v6, v5, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v3, v4, v6}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :try_start_0
    iget-object v3, v0, LE4/k;->m:LE4/e;

    .line 62
    .line 63
    invoke-interface {v3}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget-object v4, v0, LE4/k;->j:LE4/h;

    .line 68
    .line 69
    invoke-interface {v3, v4, v5}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_0
    move-exception v3

    .line 74
    iget-object v4, v0, LE4/k;->b:LE4/f;

    .line 75
    .line 76
    new-array v6, v5, [Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    iget-object v1, v4, LE4/f;->b:Ljava/lang/String;

    .line 88
    .line 89
    const-string v4, "linkToDeath failed"

    .line 90
    .line 91
    invoke-static {v1, v4, v6}, LE4/f;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v2, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_1
    iput-boolean v5, v0, LE4/k;->g:Z

    .line 99
    .line 100
    iget-object v1, v0, LE4/k;->d:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    :goto_2
    if-ge v5, v2, :cond_3

    .line 107
    .line 108
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    add-int/lit8 v5, v5, 0x1

    .line 113
    .line 114
    check-cast v3, Ljava/lang/Runnable;

    .line 115
    .line 116
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    iget-object v0, v0, LE4/k;->d:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_0
    check-cast v4, LE4/k;

    .line 127
    .line 128
    check-cast v3, LD4/d;

    .line 129
    .line 130
    iget-object v0, v4, LE4/k;->m:LE4/e;

    .line 131
    .line 132
    iget-object v1, v4, LE4/k;->b:LE4/f;

    .line 133
    .line 134
    iget-object v2, v4, LE4/k;->d:Ljava/util/ArrayList;

    .line 135
    .line 136
    if-nez v0, :cond_6

    .line 137
    .line 138
    iget-boolean v0, v4, LE4/k;->g:Z

    .line 139
    .line 140
    if-nez v0, :cond_6

    .line 141
    .line 142
    const-string v0, "Initiate binding to the service."

    .line 143
    .line 144
    new-array v6, v5, [Ljava/lang/Object;

    .line 145
    .line 146
    invoke-virtual {v1, v0, v6}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    new-instance v0, LE4/j;

    .line 153
    .line 154
    invoke-direct {v0, v5, v4}, LE4/j;-><init>(ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iput-object v0, v4, LE4/k;->l:LE4/j;

    .line 158
    .line 159
    const/4 v3, 0x1

    .line 160
    iput-boolean v3, v4, LE4/k;->g:Z

    .line 161
    .line 162
    iget-object v6, v4, LE4/k;->a:Landroid/content/Context;

    .line 163
    .line 164
    iget-object v7, v4, LE4/k;->h:Landroid/content/Intent;

    .line 165
    .line 166
    invoke-virtual {v6, v7, v0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_8

    .line 171
    .line 172
    new-array v0, v5, [Ljava/lang/Object;

    .line 173
    .line 174
    const-string v3, "Failed to bind to the service."

    .line 175
    .line 176
    invoke-virtual {v1, v3, v0}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iput-boolean v5, v4, LE4/k;->g:Z

    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    :cond_4
    :goto_3
    if-ge v5, v0, :cond_5

    .line 186
    .line 187
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    add-int/lit8 v5, v5, 0x1

    .line 192
    .line 193
    check-cast v1, LE4/g;

    .line 194
    .line 195
    new-instance v4, LC2/e;

    .line 196
    .line 197
    invoke-direct {v4, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    iget-object v1, v1, LE4/g;->q:LS3/e;

    .line 201
    .line 202
    if-eqz v1, :cond_4

    .line 203
    .line 204
    invoke-virtual {v1, v4}, LS3/e;->a(Ljava/lang/Exception;)V

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_6
    iget-boolean v0, v4, LE4/k;->g:Z

    .line 213
    .line 214
    if-eqz v0, :cond_7

    .line 215
    .line 216
    const-string v0, "Waiting to bind to the service."

    .line 217
    .line 218
    new-array v4, v5, [Ljava/lang/Object;

    .line 219
    .line 220
    invoke-virtual {v1, v0, v4}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_7
    invoke-virtual {v3}, LE4/g;->run()V

    .line 228
    .line 229
    .line 230
    :cond_8
    :goto_4
    return-void

    .line 231
    :pswitch_1
    check-cast v3, LS3/e;

    .line 232
    .line 233
    check-cast v4, LD4/f;

    .line 234
    .line 235
    :try_start_1
    iget-object v0, v4, LD4/f;->a:LE4/k;

    .line 236
    .line 237
    iget-object v0, v0, LE4/k;->m:LE4/e;

    .line 238
    .line 239
    iget-object v5, v4, LD4/f;->b:Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {}, LD4/g;->a()Landroid/os/Bundle;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    new-instance v7, LD4/e;

    .line 246
    .line 247
    invoke-direct {v7, v4, v3}, LD4/e;-><init>(LD4/f;LS3/e;)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v0, v5, v6, v7}, LE4/e;->G(Ljava/lang/String;Landroid/os/Bundle;LD4/e;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :catch_1
    move-exception v0

    .line 255
    sget-object v5, LD4/f;->c:LE4/f;

    .line 256
    .line 257
    iget-object v4, v4, LD4/f;->b:Ljava/lang/String;

    .line 258
    .line 259
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_9

    .line 271
    .line 272
    iget-object v1, v5, LE4/f;->b:Ljava/lang/String;

    .line 273
    .line 274
    const-string v5, "error requesting in-app review for %s"

    .line 275
    .line 276
    invoke-static {v1, v5, v4}, LE4/f;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 281
    .line 282
    .line 283
    :cond_9
    new-instance v1, Ljava/lang/RuntimeException;

    .line 284
    .line 285
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v1}, LS3/e;->a(Ljava/lang/Exception;)V

    .line 289
    .line 290
    .line 291
    :goto_5
    return-void

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
