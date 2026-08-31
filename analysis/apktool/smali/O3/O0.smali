.class public final synthetic LO3/O0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LO3/b1;


# direct methods
.method public synthetic constructor <init>(LO3/b1;I)V
    .locals 0

    .line 1
    iput p2, p0, LO3/O0;->q:I

    iput-object p1, p0, LO3/O0;->r:LO3/b1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, LO3/O0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/O0;->r:LO3/b1;

    .line 7
    .line 8
    invoke-virtual {v0}, LO3/b1;->K()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LO3/O0;->r:LO3/b1;

    .line 13
    .line 14
    invoke-virtual {v0}, LO3/C;->o()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LO3/t0;

    .line 20
    .line 21
    iget-object v2, v1, LO3/t0;->u:LO3/h0;

    .line 22
    .line 23
    iget-object v3, v1, LO3/t0;->v:LO3/X;

    .line 24
    .line 25
    invoke-static {v2}, LO3/t0;->j(LO3/D0;)V

    .line 26
    .line 27
    .line 28
    iget-object v4, v2, LO3/h0;->K:LO3/e0;

    .line 29
    .line 30
    invoke-virtual {v4}, LO3/e0;->d()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    iget-object v2, v2, LO3/h0;->L:LO3/f0;

    .line 37
    .line 38
    invoke-virtual {v2}, LO3/f0;->a()J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    const-wide/16 v7, 0x1

    .line 43
    .line 44
    add-long/2addr v7, v5

    .line 45
    invoke-virtual {v2, v7, v8}, LO3/f0;->b(J)V

    .line 46
    .line 47
    .line 48
    const-wide/16 v7, 0x5

    .line 49
    .line 50
    cmp-long v2, v5, v7

    .line 51
    .line 52
    if-ltz v2, :cond_0

    .line 53
    .line 54
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v3, LO3/X;->z:LO3/V;

    .line 58
    .line 59
    const-string v1, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."

    .line 60
    .line 61
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    invoke-virtual {v4, v0}, LO3/e0;->e(Z)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    iget-object v2, v0, LO3/b1;->K:LO3/P0;

    .line 70
    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    new-instance v2, LO3/P0;

    .line 74
    .line 75
    const/4 v3, 0x3

    .line 76
    invoke-direct {v2, v0, v1, v3}, LO3/P0;-><init>(LO3/b1;LO3/F0;I)V

    .line 77
    .line 78
    .line 79
    iput-object v2, v0, LO3/b1;->K:LO3/P0;

    .line 80
    .line 81
    :cond_1
    iget-object v0, v0, LO3/b1;->K:LO3/P0;

    .line 82
    .line 83
    const-wide/16 v1, 0x0

    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, LO3/o;->b(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v3, LO3/X;->D:LO3/V;

    .line 93
    .line 94
    const-string v1, "Deferred Deep Link already retrieved. Not fetching again."

    .line 95
    .line 96
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    return-void

    .line 100
    :pswitch_1
    iget-object v0, p0, LO3/O0;->r:LO3/b1;

    .line 101
    .line 102
    iget-object v0, v0, LO3/b1;->I:LO3/r0;

    .line 103
    .line 104
    iget-object v1, v0, LO3/r0;->q:LO3/t0;

    .line 105
    .line 106
    iget-object v2, v1, LO3/t0;->w:LO3/p0;

    .line 107
    .line 108
    iget-object v3, v1, LO3/t0;->C:LO3/b1;

    .line 109
    .line 110
    iget-object v4, v1, LO3/t0;->u:LO3/h0;

    .line 111
    .line 112
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, LO3/p0;->o()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, LO3/r0;->d()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_3

    .line 123
    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_3
    invoke-virtual {v0}, LO3/r0;->c()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    const-string v2, "_cc"

    .line 131
    .line 132
    const/4 v5, 0x0

    .line 133
    if-eqz v0, :cond_4

    .line 134
    .line 135
    invoke-static {v4}, LO3/t0;->j(LO3/D0;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, v4, LO3/h0;->N:LK2/a;

    .line 139
    .line 140
    invoke-virtual {v0, v5}, LK2/a;->f(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    new-instance v0, Landroid/os/Bundle;

    .line 144
    .line 145
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v1, "source"

    .line 149
    .line 150
    const-string v5, "(not set)"

    .line 151
    .line 152
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const-string v1, "medium"

    .line 156
    .line 157
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const-string v1, "_cis"

    .line 161
    .line 162
    const-string v5, "intent"

    .line 163
    .line 164
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const-wide/16 v5, 0x1

    .line 168
    .line 169
    invoke-virtual {v0, v2, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 170
    .line 171
    .line 172
    invoke-static {v3}, LO3/t0;->k(LO3/H;)V

    .line 173
    .line 174
    .line 175
    const-string v1, "auto"

    .line 176
    .line 177
    const-string v2, "_cmpx"

    .line 178
    .line 179
    invoke-virtual {v3, v1, v2, v0}, LO3/b1;->v(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_4

    .line 183
    .line 184
    :cond_4
    invoke-static {v4}, LO3/t0;->j(LO3/D0;)V

    .line 185
    .line 186
    .line 187
    iget-object v0, v4, LO3/h0;->N:LK2/a;

    .line 188
    .line 189
    invoke-virtual {v0}, LK2/a;->e()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-eqz v7, :cond_5

    .line 198
    .line 199
    iget-object v1, v1, LO3/t0;->v:LO3/X;

    .line 200
    .line 201
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 202
    .line 203
    .line 204
    iget-object v1, v1, LO3/X;->x:LO3/V;

    .line 205
    .line 206
    const-string v2, "Cache still valid but referrer not found"

    .line 207
    .line 208
    invoke-virtual {v1, v2}, LO3/V;->b(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_5
    iget-object v1, v4, LO3/h0;->O:LO3/f0;

    .line 213
    .line 214
    invoke-virtual {v1}, LO3/f0;->a()J

    .line 215
    .line 216
    .line 217
    move-result-wide v7

    .line 218
    const-wide/32 v9, 0x36ee80

    .line 219
    .line 220
    .line 221
    div-long/2addr v7, v9

    .line 222
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    new-instance v6, Landroid/os/Bundle;

    .line 227
    .line 228
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 229
    .line 230
    .line 231
    new-instance v11, Landroid/util/Pair;

    .line 232
    .line 233
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    invoke-direct {v11, v12, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    if-eqz v13, :cond_6

    .line 253
    .line 254
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v13

    .line 258
    check-cast v13, Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v1, v13}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    invoke-virtual {v6, v13, v14}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_6
    const-wide/16 v12, -0x1

    .line 269
    .line 270
    add-long/2addr v7, v12

    .line 271
    mul-long/2addr v7, v9

    .line 272
    iget-object v1, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v1, Landroid/os/Bundle;

    .line 275
    .line 276
    invoke-virtual {v1, v2, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 277
    .line 278
    .line 279
    iget-object v1, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 280
    .line 281
    if-nez v1, :cond_7

    .line 282
    .line 283
    const-string v1, "app"

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_7
    check-cast v1, Ljava/lang/String;

    .line 287
    .line 288
    :goto_2
    invoke-static {v3}, LO3/t0;->k(LO3/H;)V

    .line 289
    .line 290
    .line 291
    iget-object v2, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v2, Landroid/os/Bundle;

    .line 294
    .line 295
    const-string v6, "_cmp"

    .line 296
    .line 297
    invoke-virtual {v3, v1, v6, v2}, LO3/b1;->v(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 298
    .line 299
    .line 300
    :goto_3
    invoke-virtual {v0, v5}, LK2/a;->f(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :goto_4
    invoke-static {v4}, LO3/t0;->j(LO3/D0;)V

    .line 304
    .line 305
    .line 306
    iget-object v0, v4, LO3/h0;->O:LO3/f0;

    .line 307
    .line 308
    const-wide/16 v1, 0x0

    .line 309
    .line 310
    invoke-virtual {v0, v1, v2}, LO3/f0;->b(J)V

    .line 311
    .line 312
    .line 313
    :goto_5
    return-void

    .line 314
    :pswitch_2
    iget-object v0, p0, LO3/O0;->r:LO3/b1;

    .line 315
    .line 316
    invoke-virtual {v0}, LO3/b1;->K()V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    nop

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
