.class public final LC/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LP/o;LQ/a;LP/z0;LP/V;)V
    .locals 0

    const/4 p4, 0x6

    iput p4, p0, LC/k;->q:I

    .line 1
    iput-object p1, p0, LC/k;->r:Ljava/lang/Object;

    iput-object p2, p0, LC/k;->s:Ljava/lang/Object;

    iput-object p3, p0, LC/k;->t:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LC/k;->q:I

    iput-object p1, p0, LC/k;->r:Ljava/lang/Object;

    iput-object p2, p0, LC/k;->s:Ljava/lang/Object;

    iput-object p3, p0, LC/k;->t:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LC/k;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/k;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw/j;

    .line 9
    .line 10
    iget-object v1, v0, Lw/j;->I:LE/k;

    .line 11
    .line 12
    :goto_0
    iget-object v2, v1, LE/k;->a:LR/e;

    .line 13
    .line 14
    iget v3, v2, LR/e;->s:I

    .line 15
    .line 16
    sget-object v4, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    add-int/lit8 v3, v3, -0x1

    .line 24
    .line 25
    iget-object v2, v2, LR/e;->q:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v2, v2, v3

    .line 28
    .line 29
    check-cast v2, Lw/g;

    .line 30
    .line 31
    iget-object v2, v2, Lw/g;->a:LG/a;

    .line 32
    .line 33
    invoke-virtual {v2}, LG/a;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Li0/c;

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    move v2, v5

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-wide v6, v0, Lw/j;->M:J

    .line 44
    .line 45
    invoke-virtual {v0, v2, v6, v7}, Lw/j;->z0(Li0/c;J)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    :goto_1
    if-eqz v2, :cond_2

    .line 50
    .line 51
    iget-object v2, v1, LE/k;->a:LR/e;

    .line 52
    .line 53
    iget v3, v2, LR/e;->s:I

    .line 54
    .line 55
    sub-int/2addr v3, v5

    .line 56
    invoke-virtual {v2, v3}, LR/e;->m(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lw/g;

    .line 61
    .line 62
    iget-object v2, v2, Lw/g;->b:LM5/h;

    .line 63
    .line 64
    invoke-virtual {v2, v4}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 69
    .line 70
    const-string v1, "MutableVector is empty."

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_2
    iget-boolean v1, v0, Lw/j;->K:Z

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0}, Lw/j;->y0()Li0/c;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/4 v2, 0x0

    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    iget-wide v6, v0, Lw/j;->M:J

    .line 88
    .line 89
    invoke-virtual {v0, v1, v6, v7}, Lw/j;->z0(Li0/c;J)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-ne v1, v5, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move v5, v2

    .line 97
    :goto_2
    if-eqz v5, :cond_4

    .line 98
    .line 99
    iput-boolean v2, v0, Lw/j;->K:Z

    .line 100
    .line 101
    :cond_4
    iget-object v1, p0, LC/k;->s:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, Lw/j1;

    .line 104
    .line 105
    iget-object v2, p0, LC/k;->t:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Lw/c;

    .line 108
    .line 109
    invoke-static {v0, v2}, Lw/j;->x0(Lw/j;Lw/c;)F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iput v0, v1, Lw/j1;->e:F

    .line 114
    .line 115
    return-object v4

    .line 116
    :pswitch_0
    iget-object v0, p0, LC/k;->r:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Ld6/e;

    .line 119
    .line 120
    iget-object v0, v0, Ld6/e;->b:Ll6/d;

    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, LC/k;->s:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Ld6/k;

    .line 128
    .line 129
    invoke-virtual {v1}, Ld6/k;->a()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v2, p0, LC/k;->t:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, Ld6/a;

    .line 136
    .line 137
    iget-object v2, v2, Ld6/a;->h:Ld6/n;

    .line 138
    .line 139
    iget-object v2, v2, Ld6/n;->d:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v0, v2, v1}, Ll6/d;->l(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0

    .line 146
    :pswitch_1
    iget-object v0, p0, LC/k;->s:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Ljava/util/List;

    .line 149
    .line 150
    iget-object v1, p0, LC/k;->r:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Ld6/e;

    .line 153
    .line 154
    iget-object v1, v1, Ld6/e;->b:Ll6/d;

    .line 155
    .line 156
    if-eqz v1, :cond_5

    .line 157
    .line 158
    iget-object v2, p0, LC/k;->t:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v2, Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v1, v2, v0}, Ll6/d;->l(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    :cond_5
    check-cast v0, Ljava/lang/Iterable;

    .line 167
    .line 168
    new-instance v1, Ljava/util/ArrayList;

    .line 169
    .line 170
    const/16 v2, 0xa

    .line 171
    .line 172
    invoke-static {v0, v2}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_6

    .line 188
    .line 189
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Ljava/security/cert/Certificate;

    .line 194
    .line 195
    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 196
    .line 197
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_6
    return-object v1

    .line 207
    :pswitch_2
    iget-object v0, p0, LC/k;->r:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, LP/o;

    .line 210
    .line 211
    iget-object v1, v0, LP/o;->L:LQ/b;

    .line 212
    .line 213
    iget-object v2, p0, LC/k;->s:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v2, LQ/a;

    .line 216
    .line 217
    iget-object v3, p0, LC/k;->t:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v3, LP/z0;

    .line 220
    .line 221
    iget-object v4, v1, LQ/b;->b:LQ/a;

    .line 222
    .line 223
    :try_start_0
    iput-object v2, v1, LQ/b;->b:LQ/a;

    .line 224
    .line 225
    iget-object v2, v0, LP/o;->F:LP/z0;

    .line 226
    .line 227
    iget-object v5, v0, LP/o;->n:[I

    .line 228
    .line 229
    iget-object v6, v0, LP/o;->u:Lr/v;

    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    iput-object v7, v0, LP/o;->n:[I

    .line 233
    .line 234
    iput-object v7, v0, LP/o;->u:Lr/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 235
    .line 236
    :try_start_1
    iput-object v3, v0, LP/o;->F:LP/z0;

    .line 237
    .line 238
    iget-boolean v3, v1, LQ/b;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    :try_start_2
    iput-boolean v7, v1, LQ/b;->e:Z

    .line 242
    .line 243
    const/4 v7, 0x0

    .line 244
    throw v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 245
    :catchall_0
    move-exception v7

    .line 246
    :try_start_3
    iput-boolean v3, v1, LQ/b;->e:Z

    .line 247
    .line 248
    throw v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 249
    :catchall_1
    move-exception v3

    .line 250
    :try_start_4
    iput-object v2, v0, LP/o;->F:LP/z0;

    .line 251
    .line 252
    iput-object v5, v0, LP/o;->n:[I

    .line 253
    .line 254
    iput-object v6, v0, LP/o;->u:Lr/v;

    .line 255
    .line 256
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 257
    :catchall_2
    move-exception v0

    .line 258
    iput-object v4, v1, LQ/b;->b:LQ/a;

    .line 259
    .line 260
    throw v0

    .line 261
    :pswitch_3
    iget-object v0, p0, LC/k;->r:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, LM/I0;

    .line 264
    .line 265
    iget-object v0, v0, LM/I0;->c:LN/r;

    .line 266
    .line 267
    iget-object v0, v0, LN/r;->d:LB5/c;

    .line 268
    .line 269
    sget-object v1, LM/J0;->r:LM/J0;

    .line 270
    .line 271
    invoke-interface {v0, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_7

    .line 282
    .line 283
    iget-object v0, p0, LC/k;->s:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, LM5/w;

    .line 286
    .line 287
    new-instance v1, LM/b0;

    .line 288
    .line 289
    iget-object v2, p0, LC/k;->t:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v2, LM/I0;

    .line 292
    .line 293
    const/4 v3, 0x0

    .line 294
    invoke-direct {v1, v2, v3}, LM/b0;-><init>(LM/I0;Lq5/c;)V

    .line 295
    .line 296
    .line 297
    const/4 v2, 0x3

    .line 298
    invoke-static {v0, v3, v3, v1, v2}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 299
    .line 300
    .line 301
    :cond_7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_4
    iget-object v0, p0, LC/k;->r:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, LM/I0;

    .line 307
    .line 308
    iget-object v1, v0, LM/I0;->c:LN/r;

    .line 309
    .line 310
    iget-object v1, v1, LN/r;->d:LB5/c;

    .line 311
    .line 312
    sget-object v2, LM/J0;->q:LM/J0;

    .line 313
    .line 314
    invoke-interface {v1, v2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    check-cast v1, Ljava/lang/Boolean;

    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_8

    .line 325
    .line 326
    iget-object v1, p0, LC/k;->s:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v1, LM5/w;

    .line 329
    .line 330
    new-instance v2, LM/W;

    .line 331
    .line 332
    const/4 v3, 0x0

    .line 333
    invoke-direct {v2, v0, v3}, LM/W;-><init>(LM/I0;Lq5/c;)V

    .line 334
    .line 335
    .line 336
    const/4 v4, 0x3

    .line 337
    invoke-static {v1, v3, v3, v2, v4}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    new-instance v2, LM/X;

    .line 342
    .line 343
    iget-object v3, p0, LC/k;->t:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v3, LB5/a;

    .line 346
    .line 347
    const/4 v4, 0x0

    .line 348
    invoke-direct {v2, v0, v3, v4}, LM/X;-><init>(LM/I0;LB5/a;I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v2}, LM5/i0;->G(LB5/c;)LM5/J;

    .line 352
    .line 353
    .line 354
    :cond_8
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 355
    .line 356
    return-object v0

    .line 357
    :pswitch_5
    iget-object v0, p0, LC/k;->r:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, LG/e;

    .line 360
    .line 361
    iget-object v1, p0, LC/k;->s:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v1, LB0/n0;

    .line 364
    .line 365
    iget-object v2, p0, LC/k;->t:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v2, LB0/K;

    .line 368
    .line 369
    invoke-static {v0, v1, v2}, LG/e;->x0(LG/e;LB0/n0;LB0/K;)Li0/c;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    if-eqz v1, :cond_a

    .line 374
    .line 375
    iget-object v0, v0, LG/e;->E:Lw/j;

    .line 376
    .line 377
    iget-wide v2, v0, Lw/j;->M:J

    .line 378
    .line 379
    const-wide/16 v4, 0x0

    .line 380
    .line 381
    invoke-static {v2, v3, v4, v5}, LW0/k;->a(JJ)Z

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-eqz v2, :cond_9

    .line 386
    .line 387
    const-string v2, "Expected BringIntoViewRequester to not be used before parents are placed."

    .line 388
    .line 389
    invoke-static {v2}, Lz/a;->c(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    :cond_9
    iget-wide v2, v0, Lw/j;->M:J

    .line 393
    .line 394
    invoke-virtual {v0, v1, v2, v3}, Lw/j;->B0(Li0/c;J)J

    .line 395
    .line 396
    .line 397
    move-result-wide v2

    .line 398
    const-wide v4, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    xor-long/2addr v2, v4

    .line 404
    invoke-virtual {v1, v2, v3}, Li0/c;->e(J)Li0/c;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    goto :goto_4

    .line 409
    :cond_a
    const/4 v0, 0x0

    .line 410
    :goto_4
    return-object v0

    .line 411
    :pswitch_6
    new-instance v0, LF/w;

    .line 412
    .line 413
    iget-object v1, p0, LC/k;->r:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v1, LP/W;

    .line 416
    .line 417
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    check-cast v1, LB5/g;

    .line 422
    .line 423
    iget-object v2, p0, LC/k;->s:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v2, LP/W;

    .line 426
    .line 427
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    check-cast v2, LB5/c;

    .line 432
    .line 433
    iget-object v3, p0, LC/k;->t:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v3, LB5/a;

    .line 436
    .line 437
    invoke-interface {v3}, LB5/a;->invoke()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    check-cast v3, Ljava/lang/Number;

    .line 442
    .line 443
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    invoke-direct {v0, v1, v2, v3}, LF/w;-><init>(LB5/g;LB5/c;I)V

    .line 448
    .line 449
    .line 450
    return-object v0

    .line 451
    :pswitch_7
    iget-object v0, p0, LC/k;->r:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, LC0/a;

    .line 454
    .line 455
    iget-object v1, p0, LC/k;->s:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v1, LC0/D;

    .line 458
    .line 459
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 460
    .line 461
    .line 462
    iget-object v1, p0, LC/k;->t:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v1, LC0/Z0;

    .line 465
    .line 466
    const-string v2, "listener"

    .line 467
    .line 468
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-static {v0}, Ll6/d;->r(Landroid/view/View;)LB1/a;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    iget-object v0, v0, LB1/a;->a:Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 481
    .line 482
    return-object v0

    .line 483
    :pswitch_8
    iget-object v0, p0, LC/k;->r:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v0, LP/C;

    .line 486
    .line 487
    invoke-virtual {v0}, LP/C;->getValue()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    check-cast v0, LC/g;

    .line 492
    .line 493
    new-instance v1, LE/Y;

    .line 494
    .line 495
    iget-object v2, p0, LC/k;->s:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v2, LC/A;

    .line 498
    .line 499
    iget-object v3, v2, LC/A;->d:LC/u;

    .line 500
    .line 501
    iget-object v3, v3, LC/u;->f:LE/F;

    .line 502
    .line 503
    invoke-virtual {v3}, LE/F;->getValue()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    check-cast v3, LG5/d;

    .line 508
    .line 509
    invoke-direct {v1, v3, v0}, LE/Y;-><init>(LG5/d;LE/C;)V

    .line 510
    .line 511
    .line 512
    new-instance v3, LC/h;

    .line 513
    .line 514
    iget-object v4, p0, LC/k;->t:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v4, LC/c;

    .line 517
    .line 518
    invoke-direct {v3, v2, v0, v4, v1}, LC/h;-><init>(LC/A;LC/g;LC/c;LE/Y;)V

    .line 519
    .line 520
    .line 521
    return-object v3

    .line 522
    nop

    .line 523
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
