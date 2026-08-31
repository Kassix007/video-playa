.class public final Li6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld6/o;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld6/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li6/a;->a:I

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld6/q;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li6/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static d(Ld6/u;I)I
    .locals 1

    .line 1
    const-string v0, "Retry-After"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ld6/u;->a(Ld6/u;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    const-string p1, "\\d+"

    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "compile(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "valueOf(header)"

    .line 36
    .line 37
    invoke-static {p0, p1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_1
    const p0, 0x7fffffff

    .line 46
    .line 47
    .line 48
    return p0
.end method


# virtual methods
.method public final a(Li6/f;)Ld6/u;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Li6/a;->a:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Li6/f;->e:Ld6/s;

    .line 11
    .line 12
    iget-object v3, v2, Li6/f;->a:Lh6/h;

    .line 13
    .line 14
    sget-object v4, Ln5/s;->q:Ln5/s;

    .line 15
    .line 16
    move-object v8, v4

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    move-object v4, v0

    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    const-string v11, "request"

    .line 22
    .line 23
    invoke-static {v4, v11}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v11, v3, Lh6/h;->y:LL/s;

    .line 27
    .line 28
    if-nez v11, :cond_f

    .line 29
    .line 30
    monitor-enter v3

    .line 31
    :try_start_0
    iget-boolean v11, v3, Lh6/h;->A:Z

    .line 32
    .line 33
    if-nez v11, :cond_e

    .line 34
    .line 35
    iget-boolean v11, v3, Lh6/h;->z:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    .line 37
    if-nez v11, :cond_d

    .line 38
    .line 39
    monitor-exit v3

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    new-instance v0, Lh6/d;

    .line 43
    .line 44
    iget-object v11, v3, Lh6/h;->s:LO3/Y;

    .line 45
    .line 46
    iget-object v12, v4, Ld6/s;->a:Ld6/n;

    .line 47
    .line 48
    iget-object v13, v3, Lh6/h;->q:Ld6/q;

    .line 49
    .line 50
    iget-boolean v14, v12, Ld6/n;->i:Z

    .line 51
    .line 52
    if-eqz v14, :cond_1

    .line 53
    .line 54
    iget-object v14, v13, Ld6/q;->E:Ljavax/net/ssl/SSLSocketFactory;

    .line 55
    .line 56
    if-eqz v14, :cond_0

    .line 57
    .line 58
    iget-object v15, v13, Ld6/q;->I:Lp6/c;

    .line 59
    .line 60
    iget-object v7, v13, Ld6/q;->J:Ld6/e;

    .line 61
    .line 62
    move-object/from16 v24, v7

    .line 63
    .line 64
    move-object/from16 v22, v14

    .line 65
    .line 66
    move-object/from16 v23, v15

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v2, "CLEARTEXT-only client"

    .line 72
    .line 73
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_1
    const/16 v22, 0x0

    .line 78
    .line 79
    const/16 v23, 0x0

    .line 80
    .line 81
    const/16 v24, 0x0

    .line 82
    .line 83
    :goto_2
    new-instance v17, Ld6/a;

    .line 84
    .line 85
    iget-object v7, v12, Ld6/n;->d:Ljava/lang/String;

    .line 86
    .line 87
    iget v12, v12, Ld6/n;->e:I

    .line 88
    .line 89
    iget-object v14, v13, Ld6/q;->A:Ld6/b;

    .line 90
    .line 91
    iget-object v15, v13, Ld6/q;->D:Ljavax/net/SocketFactory;

    .line 92
    .line 93
    iget-object v5, v13, Ld6/q;->C:Ld6/b;

    .line 94
    .line 95
    iget-object v6, v13, Ld6/q;->H:Ljava/util/List;

    .line 96
    .line 97
    move-object/from16 v25, v5

    .line 98
    .line 99
    iget-object v5, v13, Ld6/q;->G:Ljava/util/List;

    .line 100
    .line 101
    iget-object v13, v13, Ld6/q;->B:Ljava/net/ProxySelector;

    .line 102
    .line 103
    move-object/from16 v27, v5

    .line 104
    .line 105
    move-object/from16 v26, v6

    .line 106
    .line 107
    move-object/from16 v18, v7

    .line 108
    .line 109
    move/from16 v19, v12

    .line 110
    .line 111
    move-object/from16 v28, v13

    .line 112
    .line 113
    move-object/from16 v20, v14

    .line 114
    .line 115
    move-object/from16 v21, v15

    .line 116
    .line 117
    invoke-direct/range {v17 .. v28}, Ld6/a;-><init>(Ljava/lang/String;ILd6/b;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ld6/e;Ld6/b;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v5, v17

    .line 121
    .line 122
    invoke-direct {v0, v11, v5, v3}, Lh6/d;-><init>(LO3/Y;Ld6/a;Lh6/h;)V

    .line 123
    .line 124
    .line 125
    iput-object v0, v3, Lh6/h;->w:Lh6/d;

    .line 126
    .line 127
    :cond_2
    :try_start_1
    iget-boolean v0, v3, Lh6/h;->C:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    if-nez v0, :cond_c

    .line 130
    .line 131
    :try_start_2
    invoke-virtual {v2, v4}, Li6/f;->b(Ld6/s;)Ld6/u;

    .line 132
    .line 133
    .line 134
    move-result-object v0
    :try_end_2
    .catch Lh6/k; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    if-eqz v9, :cond_4

    .line 136
    .line 137
    :try_start_3
    invoke-virtual {v0}, Ld6/u;->b()Ld6/t;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v9}, Ld6/u;->b()Ld6/t;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    const/4 v5, 0x0

    .line 146
    iput-object v5, v4, Ld6/t;->g:Ld6/w;

    .line 147
    .line 148
    invoke-virtual {v4}, Ld6/t;->a()Ld6/u;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    iget-object v6, v4, Ld6/u;->w:Ld6/w;

    .line 153
    .line 154
    if-nez v6, :cond_3

    .line 155
    .line 156
    iput-object v4, v0, Ld6/t;->j:Ld6/u;

    .line 157
    .line 158
    invoke-virtual {v0}, Ld6/t;->a()Ld6/u;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :goto_3
    move-object v9, v0

    .line 163
    goto :goto_4

    .line 164
    :catchall_0
    move-exception v0

    .line 165
    const/4 v6, 0x1

    .line 166
    goto/16 :goto_7

    .line 167
    .line 168
    :cond_3
    const-string v0, "priorResponse.body != null"

    .line 169
    .line 170
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 171
    .line 172
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v2

    .line 176
    :cond_4
    const/4 v5, 0x0

    .line 177
    goto :goto_3

    .line 178
    :goto_4
    iget-object v0, v3, Lh6/h;->y:LL/s;

    .line 179
    .line 180
    invoke-virtual {v1, v9, v0}, Li6/a;->b(Ld6/u;LL/s;)Ld6/s;

    .line 181
    .line 182
    .line 183
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 184
    if-nez v4, :cond_5

    .line 185
    .line 186
    const/4 v6, 0x0

    .line 187
    invoke-virtual {v3, v6}, Lh6/h;->f(Z)V

    .line 188
    .line 189
    .line 190
    return-object v9

    .line 191
    :cond_5
    :try_start_4
    iget-object v0, v9, Ld6/u;->w:Ld6/w;

    .line 192
    .line 193
    if-eqz v0, :cond_6

    .line 194
    .line 195
    invoke-static {v0}, Le6/b;->b(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 196
    .line 197
    .line 198
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 199
    .line 200
    const/16 v0, 0x14

    .line 201
    .line 202
    if-gt v10, v0, :cond_7

    .line 203
    .line 204
    const/4 v6, 0x1

    .line 205
    invoke-virtual {v3, v6}, Lh6/h;->f(Z)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_7
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    .line 211
    .line 212
    new-instance v2, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const-string v4, "Too many follow-up requests: "

    .line 218
    .line 219
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :catch_0
    move-exception v0

    .line 234
    const/4 v5, 0x0

    .line 235
    instance-of v6, v0, Lk6/a;

    .line 236
    .line 237
    const/4 v7, 0x1

    .line 238
    xor-int/2addr v6, v7

    .line 239
    invoke-virtual {v1, v0, v3, v4, v6}, Li6/a;->c(Ljava/io/IOException;Lh6/h;Ld6/s;Z)Z

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    if-eqz v6, :cond_8

    .line 244
    .line 245
    check-cast v8, Ljava/util/Collection;

    .line 246
    .line 247
    invoke-static {v8, v0}, Ln5/l;->v0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 248
    .line 249
    .line 250
    move-result-object v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 251
    invoke-virtual {v3, v7}, Lh6/h;->f(Z)V

    .line 252
    .line 253
    .line 254
    const/4 v0, 0x0

    .line 255
    goto/16 :goto_1

    .line 256
    .line 257
    :cond_8
    :try_start_6
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_9

    .line 266
    .line 267
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    check-cast v4, Ljava/lang/Exception;

    .line 272
    .line 273
    invoke-static {v0, v4}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_9
    throw v0

    .line 278
    :catch_1
    move-exception v0

    .line 279
    const/4 v5, 0x0

    .line 280
    iget-object v6, v0, Lh6/k;->r:Ljava/io/IOException;

    .line 281
    .line 282
    const/4 v7, 0x0

    .line 283
    invoke-virtual {v1, v6, v3, v4, v7}, Li6/a;->c(Ljava/io/IOException;Lh6/h;Ld6/s;Z)Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-eqz v6, :cond_a

    .line 288
    .line 289
    check-cast v8, Ljava/util/Collection;

    .line 290
    .line 291
    iget-object v0, v0, Lh6/k;->q:Ljava/io/IOException;

    .line 292
    .line 293
    invoke-static {v8, v0}, Ln5/l;->v0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 294
    .line 295
    .line 296
    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 297
    const/4 v6, 0x1

    .line 298
    invoke-virtual {v3, v6}, Lh6/h;->f(Z)V

    .line 299
    .line 300
    .line 301
    move v0, v7

    .line 302
    goto/16 :goto_1

    .line 303
    .line 304
    :cond_a
    :try_start_7
    iget-object v0, v0, Lh6/k;->q:Ljava/io/IOException;

    .line 305
    .line 306
    const-string v2, "<this>"

    .line 307
    .line 308
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-eqz v4, :cond_b

    .line 320
    .line 321
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    check-cast v4, Ljava/lang/Exception;

    .line 326
    .line 327
    invoke-static {v0, v4}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 328
    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_b
    throw v0

    .line 332
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 333
    .line 334
    const-string v2, "Canceled"

    .line 335
    .line 336
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 340
    :goto_7
    invoke-virtual {v3, v6}, Lh6/h;->f(Z)V

    .line 341
    .line 342
    .line 343
    throw v0

    .line 344
    :cond_d
    :try_start_8
    const-string v0, "Check failed."

    .line 345
    .line 346
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 347
    .line 348
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw v2

    .line 352
    :catchall_1
    move-exception v0

    .line 353
    goto :goto_8

    .line 354
    :cond_e
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 355
    .line 356
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 357
    .line 358
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 362
    :goto_8
    monitor-exit v3

    .line 363
    throw v0

    .line 364
    :cond_f
    const-string v0, "Check failed."

    .line 365
    .line 366
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 367
    .line 368
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v2

    .line 372
    :pswitch_0
    const-string v0, "Content-Encoding"

    .line 373
    .line 374
    const-string v3, "User-Agent"

    .line 375
    .line 376
    iget-object v4, v1, Li6/a;->b:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v4, Ld6/b;

    .line 379
    .line 380
    const-string v5, "gzip"

    .line 381
    .line 382
    const-string v6, "Accept-Encoding"

    .line 383
    .line 384
    const-string v7, "Connection"

    .line 385
    .line 386
    const-string v8, "Host"

    .line 387
    .line 388
    const-string v9, "Transfer-Encoding"

    .line 389
    .line 390
    const-string v10, "Content-Type"

    .line 391
    .line 392
    const-string v11, "Content-Length"

    .line 393
    .line 394
    iget-object v12, v2, Li6/f;->e:Ld6/s;

    .line 395
    .line 396
    invoke-virtual {v12}, Ld6/s;->b()LL0/l;

    .line 397
    .line 398
    .line 399
    move-result-object v13

    .line 400
    iget-object v14, v12, Ld6/s;->c:Ld6/l;

    .line 401
    .line 402
    iget-object v15, v12, Ld6/s;->a:Ld6/n;

    .line 403
    .line 404
    iget-object v1, v12, Ld6/s;->d:Lk3/c;

    .line 405
    .line 406
    move-object/from16 v16, v0

    .line 407
    .line 408
    move-object/from16 v17, v1

    .line 409
    .line 410
    const-wide/16 v0, -0x1

    .line 411
    .line 412
    if-eqz v17, :cond_11

    .line 413
    .line 414
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v17 .. v17}, Lk3/c;->c()J

    .line 418
    .line 419
    .line 420
    move-result-wide v17

    .line 421
    cmp-long v19, v17, v0

    .line 422
    .line 423
    if-eqz v19, :cond_10

    .line 424
    .line 425
    invoke-static/range {v17 .. v18}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v13, v11, v0}, LL0/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    iget-object v0, v13, LL0/l;->d:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v0, Lc3/c;

    .line 435
    .line 436
    invoke-virtual {v0, v9}, Lc3/c;->e(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    goto :goto_9

    .line 440
    :cond_10
    const-string v0, "chunked"

    .line 441
    .line 442
    invoke-virtual {v13, v9, v0}, LL0/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    iget-object v0, v13, LL0/l;->d:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v0, Lc3/c;

    .line 448
    .line 449
    invoke-virtual {v0, v11}, Lc3/c;->e(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    :cond_11
    :goto_9
    invoke-virtual {v14, v8}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    const/4 v1, 0x0

    .line 457
    if-nez v0, :cond_12

    .line 458
    .line 459
    invoke-static {v15, v1}, Le6/b;->s(Ld6/n;Z)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v13, v8, v0}, LL0/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    :cond_12
    invoke-virtual {v14, v7}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    if-nez v0, :cond_13

    .line 471
    .line 472
    const-string v0, "Keep-Alive"

    .line 473
    .line 474
    invoke-virtual {v13, v7, v0}, LL0/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    :cond_13
    invoke-virtual {v14, v6}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    if-nez v0, :cond_14

    .line 482
    .line 483
    const-string v0, "Range"

    .line 484
    .line 485
    invoke-virtual {v14, v0}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    if-nez v0, :cond_14

    .line 490
    .line 491
    invoke-virtual {v13, v6, v5}, LL0/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    const/4 v1, 0x1

    .line 495
    :cond_14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    const-string v0, "url"

    .line 499
    .line 500
    invoke-static {v15, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v14, v3}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    if-nez v0, :cond_15

    .line 508
    .line 509
    const-string v0, "okhttp/4.12.0"

    .line 510
    .line 511
    invoke-virtual {v13, v3, v0}, LL0/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    :cond_15
    invoke-virtual {v13}, LL0/l;->c()Ld6/s;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-virtual {v2, v0}, Li6/f;->b(Ld6/s;)Ld6/u;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    iget-object v2, v0, Ld6/u;->v:Ld6/l;

    .line 523
    .line 524
    invoke-static {v4, v15, v2}, Li6/e;->b(Ld6/b;Ld6/n;Ld6/l;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0}, Ld6/u;->b()Ld6/t;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    iput-object v12, v3, Ld6/t;->a:Ld6/s;

    .line 532
    .line 533
    if-eqz v1, :cond_16

    .line 534
    .line 535
    move-object/from16 v1, v16

    .line 536
    .line 537
    invoke-static {v0, v1}, Ld6/u;->a(Ld6/u;Ljava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v4

    .line 541
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 542
    .line 543
    .line 544
    move-result v4

    .line 545
    if-eqz v4, :cond_16

    .line 546
    .line 547
    invoke-static {v0}, Li6/e;->a(Ld6/u;)Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-eqz v4, :cond_16

    .line 552
    .line 553
    iget-object v4, v0, Ld6/u;->w:Ld6/w;

    .line 554
    .line 555
    if-eqz v4, :cond_16

    .line 556
    .line 557
    new-instance v5, Lq6/q;

    .line 558
    .line 559
    invoke-virtual {v4}, Ld6/w;->O()Lq6/i;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    invoke-direct {v5, v4}, Lq6/q;-><init>(Lq6/G;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Ld6/l;->h()Lc3/c;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-virtual {v2, v1}, Lc3/c;->e(Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v11}, Lc3/c;->e(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2}, Lc3/c;->d()Ld6/l;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    invoke-virtual {v1}, Ld6/l;->h()Lc3/c;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    iput-object v1, v3, Ld6/t;->f:Lc3/c;

    .line 585
    .line 586
    invoke-static {v0, v10}, Ld6/u;->a(Ld6/u;Ljava/lang/String;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    new-instance v1, Li6/g;

    .line 591
    .line 592
    invoke-static {v5}, La/a;->j(Lq6/G;)Lq6/A;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    const-wide/16 v4, -0x1

    .line 597
    .line 598
    invoke-direct {v1, v0, v4, v5, v2}, Li6/g;-><init>(Ljava/lang/String;JLq6/A;)V

    .line 599
    .line 600
    .line 601
    iput-object v1, v3, Ld6/t;->g:Ld6/w;

    .line 602
    .line 603
    :cond_16
    invoke-virtual {v3}, Ld6/t;->a()Ld6/u;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    return-object v0

    .line 608
    nop

    .line 609
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ld6/u;LL/s;)Ld6/s;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-object v1, p2, LL/s;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lh6/j;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, v1, Lh6/j;->b:Ld6/x;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    :goto_0
    iget v2, p1, Ld6/u;->t:I

    .line 15
    .line 16
    iget-object v3, p1, Ld6/u;->q:Ld6/s;

    .line 17
    .line 18
    iget-object v3, v3, Ld6/s;->b:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    const/16 v6, 0x134

    .line 23
    .line 24
    const/16 v7, 0x133

    .line 25
    .line 26
    if-eq v2, v7, :cond_c

    .line 27
    .line 28
    if-eq v2, v6, :cond_c

    .line 29
    .line 30
    const/16 v8, 0x191

    .line 31
    .line 32
    if-eq v2, v8, :cond_b

    .line 33
    .line 34
    const/16 v8, 0x1a5

    .line 35
    .line 36
    if-eq v2, v8, :cond_9

    .line 37
    .line 38
    const/16 p2, 0x1f7

    .line 39
    .line 40
    if-eq v2, p2, :cond_7

    .line 41
    .line 42
    const/16 p2, 0x197

    .line 43
    .line 44
    if-eq v2, p2, :cond_5

    .line 45
    .line 46
    const/16 p2, 0x198

    .line 47
    .line 48
    if-eq v2, p2, :cond_1

    .line 49
    .line 50
    packed-switch v2, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    iget-object v1, p0, Li6/a;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ld6/q;

    .line 58
    .line 59
    iget-boolean v1, v1, Ld6/q;->v:Z

    .line 60
    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_2
    iget-object v1, p1, Ld6/u;->z:Ld6/u;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    iget v1, v1, Ld6/u;->t:I

    .line 70
    .line 71
    if-ne v1, p2, :cond_3

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    invoke-static {p1, v4}, Li6/a;->d(Ld6/u;I)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-lez p2, :cond_4

    .line 80
    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_4
    iget-object p1, p1, Ld6/u;->q:Ld6/s;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, v1, Ld6/x;->b:Ljava/net/Proxy;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 96
    .line 97
    if-ne p1, p2, :cond_6

    .line 98
    .line 99
    iget-object p1, p0, Li6/a;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Ld6/q;

    .line 102
    .line 103
    iget-object p1, p1, Ld6/q;->C:Ld6/b;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    .line 110
    .line 111
    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 112
    .line 113
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :cond_7
    iget-object v1, p1, Ld6/u;->z:Ld6/u;

    .line 118
    .line 119
    if-eqz v1, :cond_8

    .line 120
    .line 121
    iget v1, v1, Ld6/u;->t:I

    .line 122
    .line 123
    if-ne v1, p2, :cond_8

    .line 124
    .line 125
    goto/16 :goto_3

    .line 126
    .line 127
    :cond_8
    const p2, 0x7fffffff

    .line 128
    .line 129
    .line 130
    invoke-static {p1, p2}, Li6/a;->d(Ld6/u;I)I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-nez p2, :cond_11

    .line 135
    .line 136
    iget-object p1, p1, Ld6/u;->q:Ld6/s;

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_9
    if-eqz p2, :cond_11

    .line 140
    .line 141
    iget-object v1, p2, LL/s;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lh6/d;

    .line 144
    .line 145
    iget-object v1, v1, Lh6/d;->b:Ld6/a;

    .line 146
    .line 147
    iget-object v1, v1, Ld6/a;->h:Ld6/n;

    .line 148
    .line 149
    iget-object v1, v1, Ld6/n;->d:Ljava/lang/String;

    .line 150
    .line 151
    iget-object v2, p2, LL/s;->e:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v2, Lh6/j;

    .line 154
    .line 155
    iget-object v2, v2, Lh6/j;->b:Ld6/x;

    .line 156
    .line 157
    iget-object v2, v2, Ld6/x;->a:Ld6/a;

    .line 158
    .line 159
    iget-object v2, v2, Ld6/a;->h:Ld6/n;

    .line 160
    .line 161
    iget-object v2, v2, Ld6/n;->d:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_a

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_a
    iget-object p2, p2, LL/s;->e:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p2, Lh6/j;

    .line 173
    .line 174
    monitor-enter p2

    .line 175
    :try_start_0
    iput-boolean v5, p2, Lh6/j;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    .line 177
    monitor-exit p2

    .line 178
    iget-object p1, p1, Ld6/u;->q:Ld6/s;

    .line 179
    .line 180
    return-object p1

    .line 181
    :catchall_0
    move-exception p1

    .line 182
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 183
    throw p1

    .line 184
    :cond_b
    iget-object p1, p0, Li6/a;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p1, Ld6/q;

    .line 187
    .line 188
    iget-object p1, p1, Ld6/q;->w:Ld6/b;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    return-object v0

    .line 194
    :cond_c
    :pswitch_0
    const-string p2, "PROPFIND"

    .line 195
    .line 196
    iget-object v1, p0, Li6/a;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, Ld6/q;

    .line 199
    .line 200
    iget-boolean v2, v1, Ld6/q;->x:Z

    .line 201
    .line 202
    if-nez v2, :cond_d

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_d
    const-string v2, "Location"

    .line 206
    .line 207
    invoke-static {p1, v2}, Ld6/u;->a(Ld6/u;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    iget-object v8, p1, Ld6/u;->q:Ld6/s;

    .line 212
    .line 213
    if-nez v2, :cond_e

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_e
    iget-object v9, v8, Ld6/s;->a:Ld6/n;

    .line 217
    .line 218
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    :try_start_2
    new-instance v10, Ld6/m;

    .line 222
    .line 223
    invoke-direct {v10}, Ld6/m;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v10, v9, v2}, Ld6/m;->c(Ld6/n;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :catch_0
    move-object v10, v0

    .line 231
    :goto_1
    if-eqz v10, :cond_f

    .line 232
    .line 233
    invoke-virtual {v10}, Ld6/m;->a()Ld6/n;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    goto :goto_2

    .line 238
    :cond_f
    move-object v2, v0

    .line 239
    :goto_2
    if-nez v2, :cond_10

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_10
    iget-object v9, v2, Ld6/n;->a:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v10, v8, Ld6/s;->a:Ld6/n;

    .line 245
    .line 246
    iget-object v10, v10, Ld6/n;->a:Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v9, v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v9

    .line 252
    if-nez v9, :cond_12

    .line 253
    .line 254
    iget-boolean v1, v1, Ld6/q;->y:Z

    .line 255
    .line 256
    if-nez v1, :cond_12

    .line 257
    .line 258
    :cond_11
    :goto_3
    return-object v0

    .line 259
    :cond_12
    invoke-virtual {v8}, Ld6/s;->b()LL0/l;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v3}, LD5/a;->A(Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    if-eqz v9, :cond_17

    .line 268
    .line 269
    iget p1, p1, Ld6/u;->t:I

    .line 270
    .line 271
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    if-nez v9, :cond_13

    .line 276
    .line 277
    if-eq p1, v6, :cond_13

    .line 278
    .line 279
    if-ne p1, v7, :cond_14

    .line 280
    .line 281
    :cond_13
    move v4, v5

    .line 282
    :cond_14
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    if-nez p2, :cond_15

    .line 287
    .line 288
    if-eq p1, v6, :cond_15

    .line 289
    .line 290
    if-eq p1, v7, :cond_15

    .line 291
    .line 292
    const-string p1, "GET"

    .line 293
    .line 294
    invoke-virtual {v1, p1, v0}, LL0/l;->o(Ljava/lang/String;Lk3/c;)V

    .line 295
    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_15
    if-eqz v4, :cond_16

    .line 299
    .line 300
    iget-object v0, v8, Ld6/s;->d:Lk3/c;

    .line 301
    .line 302
    :cond_16
    invoke-virtual {v1, v3, v0}, LL0/l;->o(Ljava/lang/String;Lk3/c;)V

    .line 303
    .line 304
    .line 305
    :goto_4
    if-nez v4, :cond_17

    .line 306
    .line 307
    const-string p1, "Transfer-Encoding"

    .line 308
    .line 309
    iget-object p2, v1, LL0/l;->d:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p2, Lc3/c;

    .line 312
    .line 313
    invoke-virtual {p2, p1}, Lc3/c;->e(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    const-string p1, "Content-Length"

    .line 317
    .line 318
    iget-object p2, v1, LL0/l;->d:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast p2, Lc3/c;

    .line 321
    .line 322
    invoke-virtual {p2, p1}, Lc3/c;->e(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const-string p1, "Content-Type"

    .line 326
    .line 327
    iget-object p2, v1, LL0/l;->d:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast p2, Lc3/c;

    .line 330
    .line 331
    invoke-virtual {p2, p1}, Lc3/c;->e(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    :cond_17
    iget-object p1, v8, Ld6/s;->a:Ld6/n;

    .line 335
    .line 336
    invoke-static {p1, v2}, Le6/b;->a(Ld6/n;Ld6/n;)Z

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    if-nez p1, :cond_18

    .line 341
    .line 342
    const-string p1, "Authorization"

    .line 343
    .line 344
    iget-object p2, v1, LL0/l;->d:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast p2, Lc3/c;

    .line 347
    .line 348
    invoke-virtual {p2, p1}, Lc3/c;->e(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    :cond_18
    iput-object v2, v1, LL0/l;->b:Ljava/lang/Object;

    .line 352
    .line 353
    invoke-virtual {v1}, LL0/l;->c()Ld6/s;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    return-object p1

    .line 358
    nop

    .line 359
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/io/IOException;Lh6/h;Ld6/s;Z)Z
    .locals 3

    .line 1
    iget-object p3, p0, Li6/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Ld6/q;

    .line 4
    .line 5
    iget-boolean p3, p3, Ld6/q;->v:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_0
    if-eqz p4, :cond_1

    .line 13
    .line 14
    instance-of p3, p1, Ljava/io/FileNotFoundException;

    .line 15
    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    instance-of p3, p1, Ljava/net/ProtocolException;

    .line 20
    .line 21
    if-eqz p3, :cond_2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_2
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    .line 25
    .line 26
    if-eqz p3, :cond_3

    .line 27
    .line 28
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 29
    .line 30
    if-eqz p1, :cond_10

    .line 31
    .line 32
    if-nez p4, :cond_10

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 36
    .line 37
    if-eqz p3, :cond_4

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    instance-of p3, p3, Ljava/security/cert/CertificateException;

    .line 44
    .line 45
    if-eqz p3, :cond_4

    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 50
    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    return v0

    .line 54
    :cond_5
    :goto_0
    iget-object p1, p2, Lh6/h;->w:Lh6/d;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget p2, p1, Lh6/d;->f:I

    .line 60
    .line 61
    const/4 p3, 0x1

    .line 62
    if-nez p2, :cond_6

    .line 63
    .line 64
    iget p4, p1, Lh6/d;->g:I

    .line 65
    .line 66
    if-nez p4, :cond_6

    .line 67
    .line 68
    iget p4, p1, Lh6/d;->h:I

    .line 69
    .line 70
    if-nez p4, :cond_6

    .line 71
    .line 72
    move p1, v0

    .line 73
    goto :goto_4

    .line 74
    :cond_6
    iget-object p4, p1, Lh6/d;->i:Ld6/x;

    .line 75
    .line 76
    if-eqz p4, :cond_7

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_7
    const/4 p4, 0x0

    .line 80
    if-gt p2, p3, :cond_c

    .line 81
    .line 82
    iget p2, p1, Lh6/d;->g:I

    .line 83
    .line 84
    if-gt p2, p3, :cond_c

    .line 85
    .line 86
    iget p2, p1, Lh6/d;->h:I

    .line 87
    .line 88
    if-lez p2, :cond_8

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_8
    iget-object p2, p1, Lh6/d;->c:Lh6/h;

    .line 92
    .line 93
    iget-object p2, p2, Lh6/h;->x:Lh6/j;

    .line 94
    .line 95
    if-nez p2, :cond_9

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_9
    monitor-enter p2

    .line 99
    :try_start_0
    iget v1, p2, Lh6/j;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    if-eqz v1, :cond_a

    .line 102
    .line 103
    monitor-exit p2

    .line 104
    goto :goto_1

    .line 105
    :cond_a
    :try_start_1
    iget-object v1, p2, Lh6/j;->b:Ld6/x;

    .line 106
    .line 107
    iget-object v1, v1, Ld6/x;->a:Ld6/a;

    .line 108
    .line 109
    iget-object v1, v1, Ld6/a;->h:Ld6/n;

    .line 110
    .line 111
    iget-object v2, p1, Lh6/d;->b:Ld6/a;

    .line 112
    .line 113
    iget-object v2, v2, Ld6/a;->h:Ld6/n;

    .line 114
    .line 115
    invoke-static {v1, v2}, Le6/b;->a(Ld6/n;Ld6/n;)Z

    .line 116
    .line 117
    .line 118
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    if-nez v1, :cond_b

    .line 120
    .line 121
    monitor-exit p2

    .line 122
    goto :goto_1

    .line 123
    :cond_b
    :try_start_2
    iget-object p4, p2, Lh6/j;->b:Ld6/x;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    monitor-exit p2

    .line 126
    goto :goto_1

    .line 127
    :catchall_0
    move-exception p1

    .line 128
    monitor-exit p2

    .line 129
    throw p1

    .line 130
    :cond_c
    :goto_1
    if-eqz p4, :cond_d

    .line 131
    .line 132
    iput-object p4, p1, Lh6/d;->i:Ld6/x;

    .line 133
    .line 134
    :goto_2
    move p1, p3

    .line 135
    goto :goto_4

    .line 136
    :cond_d
    iget-object p2, p1, Lh6/d;->d:LU/l;

    .line 137
    .line 138
    if-eqz p2, :cond_e

    .line 139
    .line 140
    invoke-virtual {p2}, LU/l;->g()Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-ne p2, p3, :cond_e

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_e
    iget-object p1, p1, Lh6/d;->e:LW1/l;

    .line 148
    .line 149
    if-nez p1, :cond_f

    .line 150
    .line 151
    :goto_3
    goto :goto_2

    .line 152
    :cond_f
    invoke-virtual {p1}, LW1/l;->d()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    :goto_4
    if-nez p1, :cond_11

    .line 157
    .line 158
    :cond_10
    :goto_5
    return v0

    .line 159
    :cond_11
    return p3
.end method
