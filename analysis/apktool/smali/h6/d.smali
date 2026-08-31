.class public final Lh6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LO3/Y;

.field public final b:Ld6/a;

.field public final c:Lh6/h;

.field public d:LU/l;

.field public e:LW1/l;

.field public f:I

.field public g:I

.field public h:I

.field public i:Ld6/x;


# direct methods
.method public constructor <init>(LO3/Y;Ld6/a;Lh6/h;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lh6/d;->a:LO3/Y;

    .line 10
    .line 11
    iput-object p2, p0, Lh6/d;->b:Ld6/a;

    .line 12
    .line 13
    iput-object p3, p0, Lh6/d;->c:Lh6/h;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(IIIZZ)Lh6/j;
    .locals 12

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lh6/d;->c:Lh6/h;

    .line 2
    .line 3
    iget-boolean v0, v0, Lh6/h;->C:Z

    .line 4
    .line 5
    if-nez v0, :cond_23

    .line 6
    .line 7
    iget-object v0, p0, Lh6/d;->c:Lh6/h;

    .line 8
    .line 9
    iget-object v1, v0, Lh6/h;->x:Lh6/j;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-boolean v3, v1, Lh6/j;->j:Z

    .line 17
    .line 18
    if-nez v3, :cond_2

    .line 19
    .line 20
    iget-object v3, v1, Lh6/j;->b:Ld6/x;

    .line 21
    .line 22
    iget-object v3, v3, Ld6/x;->a:Ld6/a;

    .line 23
    .line 24
    iget-object v3, v3, Ld6/a;->h:Ld6/n;

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Lh6/d;->b(Ld6/n;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v3, v2

    .line 34
    goto :goto_2

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_4

    .line 38
    :cond_2
    :goto_1
    iget-object v3, p0, Lh6/d;->c:Lh6/h;

    .line 39
    .line 40
    invoke-virtual {v3}, Lh6/h;->j()Ljava/net/Socket;

    .line 41
    .line 42
    .line 43
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :goto_2
    monitor-exit v1

    .line 45
    iget-object v4, p0, Lh6/d;->c:Lh6/h;

    .line 46
    .line 47
    iget-object v4, v4, Lh6/h;->x:Lh6/j;

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    :goto_3
    move/from16 v2, p5

    .line 54
    .line 55
    goto/16 :goto_10

    .line 56
    .line 57
    :cond_3
    const-string p1, "Check failed."

    .line 58
    .line 59
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p2

    .line 65
    :cond_4
    if-eqz v3, :cond_5

    .line 66
    .line 67
    invoke-static {v3}, Le6/b;->c(Ljava/net/Socket;)V

    .line 68
    .line 69
    .line 70
    goto :goto_5

    .line 71
    :goto_4
    monitor-exit v1

    .line 72
    throw p1

    .line 73
    :cond_5
    :goto_5
    const/4 v1, 0x0

    .line 74
    iput v1, p0, Lh6/d;->f:I

    .line 75
    .line 76
    iput v1, p0, Lh6/d;->g:I

    .line 77
    .line 78
    iput v1, p0, Lh6/d;->h:I

    .line 79
    .line 80
    iget-object v3, p0, Lh6/d;->a:LO3/Y;

    .line 81
    .line 82
    iget-object v4, p0, Lh6/d;->b:Ld6/a;

    .line 83
    .line 84
    iget-object v5, p0, Lh6/d;->c:Lh6/h;

    .line 85
    .line 86
    invoke-virtual {v3, v4, v5, v2, v1}, LO3/Y;->a(Ld6/a;Lh6/h;Ljava/util/ArrayList;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    iget-object v1, p0, Lh6/d;->c:Lh6/h;

    .line 93
    .line 94
    iget-object v1, v1, Lh6/h;->x:Lh6/j;

    .line 95
    .line 96
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    iget-object v3, p0, Lh6/d;->i:Ld6/x;

    .line 101
    .line 102
    if-eqz v3, :cond_7

    .line 103
    .line 104
    iput-object v2, p0, Lh6/d;->i:Ld6/x;

    .line 105
    .line 106
    :goto_6
    move-object v4, v2

    .line 107
    goto/16 :goto_f

    .line 108
    .line 109
    :cond_7
    iget-object v3, p0, Lh6/d;->d:LU/l;

    .line 110
    .line 111
    if-eqz v3, :cond_9

    .line 112
    .line 113
    invoke-virtual {v3}, LU/l;->g()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_9

    .line 118
    .line 119
    iget-object v1, p0, Lh6/d;->d:LU/l;

    .line 120
    .line 121
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, LU/l;->g()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_8

    .line 129
    .line 130
    iget-object v3, v1, LU/l;->r:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Ljava/util/ArrayList;

    .line 133
    .line 134
    iget v4, v1, LU/l;->q:I

    .line 135
    .line 136
    add-int/lit8 v5, v4, 0x1

    .line 137
    .line 138
    iput v5, v1, LU/l;->q:I

    .line 139
    .line 140
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    move-object v3, v1

    .line 145
    check-cast v3, Ld6/x;

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_9
    iget-object v3, p0, Lh6/d;->e:LW1/l;

    .line 155
    .line 156
    if-nez v3, :cond_a

    .line 157
    .line 158
    new-instance v3, LW1/l;

    .line 159
    .line 160
    iget-object v4, p0, Lh6/d;->b:Ld6/a;

    .line 161
    .line 162
    iget-object v5, p0, Lh6/d;->c:Lh6/h;

    .line 163
    .line 164
    iget-object v6, v5, Lh6/h;->q:Ld6/q;

    .line 165
    .line 166
    iget-object v6, v6, Ld6/q;->O:Lk3/d;

    .line 167
    .line 168
    invoke-direct {v3, v4, v6, v5}, LW1/l;-><init>(Ld6/a;Lk3/d;Lh6/h;)V

    .line 169
    .line 170
    .line 171
    iput-object v3, p0, Lh6/d;->e:LW1/l;

    .line 172
    .line 173
    :cond_a
    invoke-virtual {v3}, LW1/l;->d()Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_22

    .line 178
    .line 179
    new-instance v4, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    :cond_b
    iget v5, v3, LW1/l;->a:I

    .line 185
    .line 186
    iget-object v6, v3, LW1/l;->e:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v6, Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-ge v5, v6, :cond_18

    .line 195
    .line 196
    iget-object v5, v3, LW1/l;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v5, Ld6/a;

    .line 199
    .line 200
    const-string v6, "No route to "

    .line 201
    .line 202
    iget v7, v3, LW1/l;->a:I

    .line 203
    .line 204
    iget-object v8, v3, LW1/l;->e:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v8, Ljava/util/List;

    .line 207
    .line 208
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    if-ge v7, v8, :cond_17

    .line 213
    .line 214
    iget-object v7, v3, LW1/l;->e:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v7, Ljava/util/List;

    .line 217
    .line 218
    iget v8, v3, LW1/l;->a:I

    .line 219
    .line 220
    add-int/lit8 v9, v8, 0x1

    .line 221
    .line 222
    iput v9, v3, LW1/l;->a:I

    .line 223
    .line 224
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    check-cast v7, Ljava/net/Proxy;

    .line 229
    .line 230
    new-instance v8, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object v8, v3, LW1/l;->f:Ljava/lang/Object;

    .line 236
    .line 237
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    sget-object v10, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 242
    .line 243
    if-eq v9, v10, :cond_f

    .line 244
    .line 245
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    sget-object v10, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 250
    .line 251
    if-ne v9, v10, :cond_c

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_c
    invoke-virtual {v7}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    instance-of v10, v9, Ljava/net/InetSocketAddress;

    .line 259
    .line 260
    if-eqz v10, :cond_e

    .line 261
    .line 262
    const-string v10, "proxyAddress"

    .line 263
    .line 264
    invoke-static {v9, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    check-cast v9, Ljava/net/InetSocketAddress;

    .line 268
    .line 269
    const-string v10, "<this>"

    .line 270
    .line 271
    invoke-static {v9, v10}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    if-nez v10, :cond_d

    .line 279
    .line 280
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    const-string v11, "hostName"

    .line 285
    .line 286
    invoke-static {v10, v11}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_d
    invoke-virtual {v10}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    const-string v11, "address.hostAddress"

    .line 295
    .line 296
    invoke-static {v10, v11}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    :goto_7
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getPort()I

    .line 300
    .line 301
    .line 302
    move-result v9

    .line 303
    goto :goto_9

    .line 304
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    const-string p2, "Proxy.address() is not an InetSocketAddress: "

    .line 307
    .line 308
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw p2

    .line 332
    :cond_f
    :goto_8
    iget-object v9, v5, Ld6/a;->h:Ld6/n;

    .line 333
    .line 334
    iget-object v10, v9, Ld6/n;->d:Ljava/lang/String;

    .line 335
    .line 336
    iget v9, v9, Ld6/n;->e:I

    .line 337
    .line 338
    :goto_9
    if-gt v0, v9, :cond_16

    .line 339
    .line 340
    const/high16 v11, 0x10000

    .line 341
    .line 342
    if-ge v9, v11, :cond_16

    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    sget-object v11, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 349
    .line 350
    if-ne v6, v11, :cond_10

    .line 351
    .line 352
    invoke-static {v10, v9}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    goto :goto_c

    .line 360
    :cond_10
    sget-object v6, Le6/b;->a:[B

    .line 361
    .line 362
    const-string v6, "<this>"

    .line 363
    .line 364
    invoke-static {v10, v6}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    sget-object v6, Le6/b;->e:LJ5/k;

    .line 368
    .line 369
    invoke-virtual {v6, v10}, LJ5/k;->c(Ljava/lang/CharSequence;)Z

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    if-eqz v6, :cond_11

    .line 374
    .line 375
    invoke-static {v10}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    goto :goto_a

    .line 384
    :cond_11
    iget-object v6, v5, Ld6/a;->a:Ld6/b;

    .line 385
    .line 386
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    :try_start_1
    invoke-static {v10}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    const-string v11, "getAllByName(hostname)"

    .line 394
    .line 395
    invoke-static {v6, v11}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    invoke-static {v6}, Ln5/k;->R0([Ljava/lang/Object;)Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 402
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 403
    .line 404
    .line 405
    move-result v11

    .line 406
    if-nez v11, :cond_15

    .line 407
    .line 408
    move-object v5, v6

    .line 409
    :goto_a
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    if-eqz v6, :cond_12

    .line 418
    .line 419
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v6

    .line 423
    check-cast v6, Ljava/net/InetAddress;

    .line 424
    .line 425
    new-instance v10, Ljava/net/InetSocketAddress;

    .line 426
    .line 427
    invoke-direct {v10, v6, v9}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    goto :goto_b

    .line 434
    :cond_12
    :goto_c
    iget-object v5, v3, LW1/l;->f:Ljava/lang/Object;

    .line 435
    .line 436
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v6

    .line 444
    if-eqz v6, :cond_14

    .line 445
    .line 446
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    check-cast v6, Ljava/net/InetSocketAddress;

    .line 451
    .line 452
    new-instance v8, Ld6/x;

    .line 453
    .line 454
    iget-object v9, v3, LW1/l;->b:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v9, Ld6/a;

    .line 457
    .line 458
    invoke-direct {v8, v9, v7, v6}, Ld6/x;-><init>(Ld6/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 459
    .line 460
    .line 461
    iget-object v6, v3, LW1/l;->d:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v6, Lk3/d;

    .line 464
    .line 465
    monitor-enter v6

    .line 466
    :try_start_2
    iget-object v9, v6, Lk3/d;->r:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v9, Ljava/util/LinkedHashSet;

    .line 469
    .line 470
    invoke-interface {v9, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 474
    monitor-exit v6

    .line 475
    if-eqz v9, :cond_13

    .line 476
    .line 477
    iget-object v6, v3, LW1/l;->c:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v6, Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    goto :goto_d

    .line 485
    :cond_13
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    goto :goto_d

    .line 489
    :catchall_1
    move-exception v0

    .line 490
    move-object p1, v0

    .line 491
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 492
    throw p1

    .line 493
    :cond_14
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 494
    .line 495
    .line 496
    move-result v5

    .line 497
    if-nez v5, :cond_b

    .line 498
    .line 499
    goto :goto_e

    .line 500
    :cond_15
    new-instance p1, Ljava/net/UnknownHostException;

    .line 501
    .line 502
    new-instance p2, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 505
    .line 506
    .line 507
    iget-object p3, v5, Ld6/a;->a:Ld6/b;

    .line 508
    .line 509
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    const-string p3, " returned no addresses for "

    .line 513
    .line 514
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object p2

    .line 524
    invoke-direct {p1, p2}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    throw p1

    .line 528
    :catch_0
    move-exception v0

    .line 529
    move-object p1, v0

    .line 530
    new-instance p2, Ljava/net/UnknownHostException;

    .line 531
    .line 532
    const-string p3, "Broken system behaviour for dns lookup of "

    .line 533
    .line 534
    invoke-virtual {p3, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object p3

    .line 538
    invoke-direct {p2, p3}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 542
    .line 543
    .line 544
    throw p2

    .line 545
    :cond_16
    new-instance p1, Ljava/net/SocketException;

    .line 546
    .line 547
    new-instance p2, Ljava/lang/StringBuilder;

    .line 548
    .line 549
    invoke-direct {p2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    const/16 p3, 0x3a

    .line 556
    .line 557
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    const-string p3, "; port is out of range"

    .line 564
    .line 565
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object p2

    .line 572
    invoke-direct {p1, p2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw p1

    .line 576
    :cond_17
    new-instance p1, Ljava/net/SocketException;

    .line 577
    .line 578
    new-instance p2, Ljava/lang/StringBuilder;

    .line 579
    .line 580
    invoke-direct {p2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    iget-object p3, v5, Ld6/a;->h:Ld6/n;

    .line 584
    .line 585
    iget-object p3, p3, Ld6/n;->d:Ljava/lang/String;

    .line 586
    .line 587
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    const-string p3, "; exhausted proxy configurations: "

    .line 591
    .line 592
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    iget-object p3, v3, LW1/l;->e:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast p3, Ljava/util/List;

    .line 598
    .line 599
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object p2

    .line 606
    invoke-direct {p1, p2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    throw p1

    .line 610
    :cond_18
    :goto_e
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 611
    .line 612
    .line 613
    move-result v5

    .line 614
    if-eqz v5, :cond_19

    .line 615
    .line 616
    iget-object v5, v3, LW1/l;->c:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v5, Ljava/util/ArrayList;

    .line 619
    .line 620
    invoke-static {v4, v5}, Ln5/q;->e0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 621
    .line 622
    .line 623
    iget-object v3, v3, LW1/l;->c:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v3, Ljava/util/ArrayList;

    .line 626
    .line 627
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 628
    .line 629
    .line 630
    :cond_19
    new-instance v3, LU/l;

    .line 631
    .line 632
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 633
    .line 634
    .line 635
    iput-object v4, v3, LU/l;->r:Ljava/lang/Object;

    .line 636
    .line 637
    iput-object v3, p0, Lh6/d;->d:LU/l;

    .line 638
    .line 639
    iget-object v5, p0, Lh6/d;->c:Lh6/h;

    .line 640
    .line 641
    iget-boolean v5, v5, Lh6/h;->C:Z

    .line 642
    .line 643
    if-nez v5, :cond_21

    .line 644
    .line 645
    iget-object v5, p0, Lh6/d;->a:LO3/Y;

    .line 646
    .line 647
    iget-object v6, p0, Lh6/d;->b:Ld6/a;

    .line 648
    .line 649
    iget-object v7, p0, Lh6/d;->c:Lh6/h;

    .line 650
    .line 651
    invoke-virtual {v5, v6, v7, v4, v1}, LO3/Y;->a(Ld6/a;Lh6/h;Ljava/util/ArrayList;Z)Z

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    if-eqz v1, :cond_1a

    .line 656
    .line 657
    iget-object v1, p0, Lh6/d;->c:Lh6/h;

    .line 658
    .line 659
    iget-object v1, v1, Lh6/h;->x:Lh6/j;

    .line 660
    .line 661
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_3

    .line 665
    .line 666
    :cond_1a
    invoke-virtual {v3}, LU/l;->g()Z

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    if-eqz v1, :cond_20

    .line 671
    .line 672
    iget v1, v3, LU/l;->q:I

    .line 673
    .line 674
    add-int/lit8 v5, v1, 0x1

    .line 675
    .line 676
    iput v5, v3, LU/l;->q:I

    .line 677
    .line 678
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    move-object v3, v1

    .line 683
    check-cast v3, Ld6/x;

    .line 684
    .line 685
    :goto_f
    new-instance v5, Lh6/j;

    .line 686
    .line 687
    iget-object v1, p0, Lh6/d;->a:LO3/Y;

    .line 688
    .line 689
    invoke-direct {v5, v1, v3}, Lh6/j;-><init>(LO3/Y;Ld6/x;)V

    .line 690
    .line 691
    .line 692
    iget-object v1, p0, Lh6/d;->c:Lh6/h;

    .line 693
    .line 694
    iput-object v5, v1, Lh6/h;->E:Lh6/j;

    .line 695
    .line 696
    :try_start_4
    iget-object v10, p0, Lh6/d;->c:Lh6/h;

    .line 697
    .line 698
    move v6, p1

    .line 699
    move v7, p2

    .line 700
    move v8, p3

    .line 701
    move/from16 v9, p4

    .line 702
    .line 703
    invoke-virtual/range {v5 .. v10}, Lh6/j;->c(IIIZLh6/h;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 704
    .line 705
    .line 706
    iget-object v1, p0, Lh6/d;->c:Lh6/h;

    .line 707
    .line 708
    iput-object v2, v1, Lh6/h;->E:Lh6/j;

    .line 709
    .line 710
    iget-object v1, p0, Lh6/d;->c:Lh6/h;

    .line 711
    .line 712
    iget-object v1, v1, Lh6/h;->q:Ld6/q;

    .line 713
    .line 714
    iget-object v1, v1, Ld6/q;->O:Lk3/d;

    .line 715
    .line 716
    monitor-enter v1

    .line 717
    :try_start_5
    iget-object v2, v1, Lk3/d;->r:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 720
    .line 721
    invoke-interface {v2, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 722
    .line 723
    .line 724
    monitor-exit v1

    .line 725
    iget-object v1, p0, Lh6/d;->a:LO3/Y;

    .line 726
    .line 727
    iget-object v2, p0, Lh6/d;->b:Ld6/a;

    .line 728
    .line 729
    iget-object v6, p0, Lh6/d;->c:Lh6/h;

    .line 730
    .line 731
    invoke-virtual {v1, v2, v6, v4, v0}, LO3/Y;->a(Ld6/a;Lh6/h;Ljava/util/ArrayList;Z)Z

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    if-eqz v1, :cond_1b

    .line 736
    .line 737
    iget-object v1, p0, Lh6/d;->c:Lh6/h;

    .line 738
    .line 739
    iget-object v1, v1, Lh6/h;->x:Lh6/j;

    .line 740
    .line 741
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    iput-object v3, p0, Lh6/d;->i:Ld6/x;

    .line 745
    .line 746
    iget-object v2, v5, Lh6/j;->d:Ljava/net/Socket;

    .line 747
    .line 748
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    invoke-static {v2}, Le6/b;->c(Ljava/net/Socket;)V

    .line 752
    .line 753
    .line 754
    goto/16 :goto_3

    .line 755
    .line 756
    :cond_1b
    monitor-enter v5

    .line 757
    :try_start_6
    iget-object v1, p0, Lh6/d;->a:LO3/Y;

    .line 758
    .line 759
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    sget-object v2, Le6/b;->a:[B

    .line 763
    .line 764
    iget-object v2, v1, LO3/Y;->e:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 767
    .line 768
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    iget-object v2, v1, LO3/Y;->c:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast v2, Lg6/c;

    .line 774
    .line 775
    iget-object v1, v1, LO3/Y;->d:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v1, Lg6/b;

    .line 778
    .line 779
    const-wide/16 v3, 0x0

    .line 780
    .line 781
    invoke-virtual {v2, v1, v3, v4}, Lg6/c;->c(Lg6/a;J)V

    .line 782
    .line 783
    .line 784
    iget-object v1, p0, Lh6/d;->c:Lh6/h;

    .line 785
    .line 786
    invoke-virtual {v1, v5}, Lh6/h;->b(Lh6/j;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 787
    .line 788
    .line 789
    monitor-exit v5

    .line 790
    move/from16 v2, p5

    .line 791
    .line 792
    move-object v1, v5

    .line 793
    :goto_10
    invoke-virtual {v1, v2}, Lh6/j;->i(Z)Z

    .line 794
    .line 795
    .line 796
    move-result v3

    .line 797
    if-eqz v3, :cond_1c

    .line 798
    .line 799
    return-object v1

    .line 800
    :cond_1c
    invoke-virtual {v1}, Lh6/j;->k()V

    .line 801
    .line 802
    .line 803
    iget-object v1, p0, Lh6/d;->i:Ld6/x;

    .line 804
    .line 805
    if-nez v1, :cond_0

    .line 806
    .line 807
    iget-object v1, p0, Lh6/d;->d:LU/l;

    .line 808
    .line 809
    if-eqz v1, :cond_1d

    .line 810
    .line 811
    invoke-virtual {v1}, LU/l;->g()Z

    .line 812
    .line 813
    .line 814
    move-result v1

    .line 815
    goto :goto_11

    .line 816
    :cond_1d
    move v1, v0

    .line 817
    :goto_11
    if-nez v1, :cond_0

    .line 818
    .line 819
    iget-object v1, p0, Lh6/d;->e:LW1/l;

    .line 820
    .line 821
    if-eqz v1, :cond_1e

    .line 822
    .line 823
    invoke-virtual {v1}, LW1/l;->d()Z

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    :cond_1e
    if-eqz v0, :cond_1f

    .line 828
    .line 829
    goto/16 :goto_0

    .line 830
    .line 831
    :cond_1f
    new-instance p1, Ljava/io/IOException;

    .line 832
    .line 833
    const-string p2, "exhausted all routes"

    .line 834
    .line 835
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    throw p1

    .line 839
    :catchall_2
    move-exception v0

    .line 840
    move-object p1, v0

    .line 841
    monitor-exit v5

    .line 842
    throw p1

    .line 843
    :catchall_3
    move-exception v0

    .line 844
    move-object p1, v0

    .line 845
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 846
    throw p1

    .line 847
    :catchall_4
    move-exception v0

    .line 848
    move-object p1, v0

    .line 849
    iget-object p2, p0, Lh6/d;->c:Lh6/h;

    .line 850
    .line 851
    iput-object v2, p2, Lh6/h;->E:Lh6/j;

    .line 852
    .line 853
    throw p1

    .line 854
    :cond_20
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 855
    .line 856
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 857
    .line 858
    .line 859
    throw p1

    .line 860
    :cond_21
    new-instance p1, Ljava/io/IOException;

    .line 861
    .line 862
    const-string p2, "Canceled"

    .line 863
    .line 864
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    throw p1

    .line 868
    :cond_22
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 869
    .line 870
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 871
    .line 872
    .line 873
    throw p1

    .line 874
    :cond_23
    new-instance p1, Ljava/io/IOException;

    .line 875
    .line 876
    const-string p2, "Canceled"

    .line 877
    .line 878
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    throw p1
.end method

.method public final b(Ld6/n;)Z
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/d;->b:Ld6/a;

    .line 7
    .line 8
    iget-object v0, v0, Ld6/a;->h:Ld6/n;

    .line 9
    .line 10
    iget v1, p1, Ld6/n;->e:I

    .line 11
    .line 12
    iget v2, v0, Ld6/n;->e:I

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Ld6/n;->d:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, v0, Ld6/n;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lh6/d;->i:Ld6/x;

    .line 8
    .line 9
    instance-of v0, p1, Lk6/A;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lk6/A;

    .line 15
    .line 16
    iget v0, v0, Lk6/A;->q:I

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget p1, p0, Lh6/d;->f:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    iput p1, p0, Lh6/d;->f:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    instance-of p1, p1, Lk6/a;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget p1, p0, Lh6/d;->g:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    iput p1, p0, Lh6/d;->g:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget p1, p0, Lh6/d;->h:I

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    iput p1, p0, Lh6/d;->h:I

    .line 45
    .line 46
    return-void
.end method
