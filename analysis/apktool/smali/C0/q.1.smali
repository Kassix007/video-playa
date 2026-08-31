.class public final synthetic LC0/q;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, LC0/q;->q:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/j;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LC0/q;->q:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lh0/h;

    .line 11
    .line 12
    iget-object v2, v1, Lh0/h;->j:Lh0/o;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v1, Lh0/h;->d:Lh0/o;

    .line 17
    .line 18
    invoke-virtual {v2}, Lh0/o;->z0()Lh0/n;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sget-object v3, Lh0/n;->t:Lh0/n;

    .line 23
    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, Lh0/h;->b:LC0/q;

    .line 27
    .line 28
    invoke-virtual {v1}, LC0/q;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_1
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    iget-object v1, v0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lh0/e;

    .line 37
    .line 38
    iget-object v2, v1, Lh0/e;->d:Lr/H;

    .line 39
    .line 40
    iget-object v3, v1, Lh0/e;->e:Lr/H;

    .line 41
    .line 42
    iget-object v4, v1, Lh0/e;->c:LC0/u;

    .line 43
    .line 44
    invoke-virtual {v4}, LC0/u;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lh0/o;

    .line 49
    .line 50
    const/4 v12, 0x0

    .line 51
    const/16 v13, 0x8

    .line 52
    .line 53
    const/4 v14, 0x0

    .line 54
    if-nez v4, :cond_5

    .line 55
    .line 56
    iget-object v4, v3, Lr/H;->b:[Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v15, v3, Lr/H;->a:[J

    .line 59
    .line 60
    const-wide/16 v16, 0x80

    .line 61
    .line 62
    array-length v5, v15

    .line 63
    add-int/lit8 v5, v5, -0x2

    .line 64
    .line 65
    if-ltz v5, :cond_12

    .line 66
    .line 67
    move v6, v14

    .line 68
    const-wide/16 v18, 0xff

    .line 69
    .line 70
    :goto_0
    aget-wide v7, v15, v6

    .line 71
    .line 72
    const/16 v20, 0x7

    .line 73
    .line 74
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    not-long v9, v7

    .line 80
    shl-long v9, v9, v20

    .line 81
    .line 82
    and-long/2addr v9, v7

    .line 83
    and-long v9, v9, v21

    .line 84
    .line 85
    cmp-long v9, v9, v21

    .line 86
    .line 87
    if-eqz v9, :cond_4

    .line 88
    .line 89
    sub-int v9, v6, v5

    .line 90
    .line 91
    not-int v9, v9

    .line 92
    ushr-int/lit8 v9, v9, 0x1f

    .line 93
    .line 94
    rsub-int/lit8 v9, v9, 0x8

    .line 95
    .line 96
    move v10, v14

    .line 97
    :goto_1
    if-ge v10, v9, :cond_3

    .line 98
    .line 99
    and-long v23, v7, v18

    .line 100
    .line 101
    cmp-long v11, v23, v16

    .line 102
    .line 103
    if-ltz v11, :cond_2

    .line 104
    .line 105
    shr-long/2addr v7, v13

    .line 106
    add-int/lit8 v10, v10, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    shl-int/lit8 v1, v6, 0x3

    .line 110
    .line 111
    add-int/2addr v1, v10

    .line 112
    aget-object v1, v4, v1

    .line 113
    .line 114
    check-cast v1, LB0/d;

    .line 115
    .line 116
    invoke-virtual {v1}, LB0/d;->y0()V

    .line 117
    .line 118
    .line 119
    throw v12

    .line 120
    :cond_3
    if-ne v9, v13, :cond_12

    .line 121
    .line 122
    :cond_4
    if-eq v6, v5, :cond_12

    .line 123
    .line 124
    add-int/lit8 v6, v6, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_5
    const-wide/16 v16, 0x80

    .line 128
    .line 129
    const-wide/16 v18, 0xff

    .line 130
    .line 131
    const/16 v20, 0x7

    .line 132
    .line 133
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    iget-boolean v5, v4, Lc0/l;->D:Z

    .line 139
    .line 140
    if-eqz v5, :cond_12

    .line 141
    .line 142
    invoke-virtual {v2, v4}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_6

    .line 147
    .line 148
    invoke-virtual {v4}, Lh0/o;->A0()V

    .line 149
    .line 150
    .line 151
    :cond_6
    invoke-virtual {v4}, Lh0/o;->z0()Lh0/n;

    .line 152
    .line 153
    .line 154
    iget-object v5, v4, Lc0/l;->q:Lc0/l;

    .line 155
    .line 156
    iget-boolean v5, v5, Lc0/l;->D:Z

    .line 157
    .line 158
    if-nez v5, :cond_7

    .line 159
    .line 160
    const-string v5, "visitAncestors called on an unattached node"

    .line 161
    .line 162
    invoke-static {v5}, Ly0/a;->b(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_7
    iget-object v5, v4, Lc0/l;->q:Lc0/l;

    .line 166
    .line 167
    invoke-static {v4}, LB0/g;->u(LB0/m;)LB0/L;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    move v6, v14

    .line 172
    :goto_2
    if-eqz v4, :cond_e

    .line 173
    .line 174
    iget-object v7, v4, LB0/L;->U:LB0/g0;

    .line 175
    .line 176
    iget-object v7, v7, LB0/g0;->e:Lc0/l;

    .line 177
    .line 178
    iget v7, v7, Lc0/l;->t:I

    .line 179
    .line 180
    and-int/lit16 v7, v7, 0x1400

    .line 181
    .line 182
    if-eqz v7, :cond_c

    .line 183
    .line 184
    :goto_3
    if-eqz v5, :cond_c

    .line 185
    .line 186
    iget v7, v5, Lc0/l;->s:I

    .line 187
    .line 188
    and-int/lit16 v8, v7, 0x1400

    .line 189
    .line 190
    if-eqz v8, :cond_b

    .line 191
    .line 192
    and-int/lit16 v7, v7, 0x400

    .line 193
    .line 194
    if-eqz v7, :cond_8

    .line 195
    .line 196
    add-int/lit8 v6, v6, 0x1

    .line 197
    .line 198
    :cond_8
    instance-of v7, v5, LB0/d;

    .line 199
    .line 200
    if-eqz v7, :cond_b

    .line 201
    .line 202
    invoke-virtual {v3, v5}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-nez v7, :cond_9

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_9
    const/4 v1, 0x1

    .line 210
    if-gt v6, v1, :cond_a

    .line 211
    .line 212
    check-cast v5, LB0/d;

    .line 213
    .line 214
    invoke-virtual {v5}, LB0/d;->y0()V

    .line 215
    .line 216
    .line 217
    throw v12

    .line 218
    :cond_a
    check-cast v5, LB0/d;

    .line 219
    .line 220
    invoke-virtual {v5}, LB0/d;->y0()V

    .line 221
    .line 222
    .line 223
    throw v12

    .line 224
    :cond_b
    :goto_4
    iget-object v5, v5, Lc0/l;->u:Lc0/l;

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_c
    invoke-virtual {v4}, LB0/L;->s()LB0/L;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    if-eqz v4, :cond_d

    .line 232
    .line 233
    iget-object v5, v4, LB0/L;->U:LB0/g0;

    .line 234
    .line 235
    if-eqz v5, :cond_d

    .line 236
    .line 237
    iget-object v5, v5, LB0/g0;->d:LB0/B0;

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_d
    move-object v5, v12

    .line 241
    goto :goto_2

    .line 242
    :cond_e
    iget-object v4, v3, Lr/H;->b:[Ljava/lang/Object;

    .line 243
    .line 244
    iget-object v5, v3, Lr/H;->a:[J

    .line 245
    .line 246
    array-length v6, v5

    .line 247
    add-int/lit8 v6, v6, -0x2

    .line 248
    .line 249
    if-ltz v6, :cond_12

    .line 250
    .line 251
    move v7, v14

    .line 252
    :goto_5
    aget-wide v8, v5, v7

    .line 253
    .line 254
    not-long v10, v8

    .line 255
    shl-long v10, v10, v20

    .line 256
    .line 257
    and-long/2addr v10, v8

    .line 258
    and-long v10, v10, v21

    .line 259
    .line 260
    cmp-long v10, v10, v21

    .line 261
    .line 262
    if-eqz v10, :cond_11

    .line 263
    .line 264
    sub-int v10, v7, v6

    .line 265
    .line 266
    not-int v10, v10

    .line 267
    ushr-int/lit8 v10, v10, 0x1f

    .line 268
    .line 269
    rsub-int/lit8 v10, v10, 0x8

    .line 270
    .line 271
    move v11, v14

    .line 272
    :goto_6
    if-ge v11, v10, :cond_10

    .line 273
    .line 274
    and-long v23, v8, v18

    .line 275
    .line 276
    cmp-long v15, v23, v16

    .line 277
    .line 278
    if-ltz v15, :cond_f

    .line 279
    .line 280
    shr-long/2addr v8, v13

    .line 281
    add-int/lit8 v11, v11, 0x1

    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_f
    shl-int/lit8 v1, v7, 0x3

    .line 285
    .line 286
    add-int/2addr v1, v11

    .line 287
    aget-object v1, v4, v1

    .line 288
    .line 289
    check-cast v1, LB0/d;

    .line 290
    .line 291
    invoke-virtual {v1}, LB0/d;->y0()V

    .line 292
    .line 293
    .line 294
    throw v12

    .line 295
    :cond_10
    if-ne v10, v13, :cond_12

    .line 296
    .line 297
    :cond_11
    if-eq v7, v6, :cond_12

    .line 298
    .line 299
    add-int/lit8 v7, v7, 0x1

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_12
    iget-object v4, v1, Lh0/e;->b:LC0/q;

    .line 303
    .line 304
    invoke-virtual {v4}, LC0/q;->invoke()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Lr/H;->b()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3}, Lr/H;->b()V

    .line 311
    .line 312
    .line 313
    iput-boolean v14, v1, Lh0/e;->f:Z

    .line 314
    .line 315
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 316
    .line 317
    return-object v1

    .line 318
    :pswitch_1
    iget-object v1, v0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v1, Lb/A;

    .line 321
    .line 322
    invoke-virtual {v1}, Lb/A;->e()V

    .line 323
    .line 324
    .line 325
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 326
    .line 327
    return-object v1

    .line 328
    :pswitch_2
    iget-object v1, v0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, Lb/A;

    .line 331
    .line 332
    invoke-virtual {v1}, Lb/A;->e()V

    .line 333
    .line 334
    .line 335
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 336
    .line 337
    return-object v1

    .line 338
    :pswitch_3
    iget-object v1, v0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v1, LC0/A;

    .line 341
    .line 342
    invoke-virtual {v1}, LC0/A;->D()Li0/c;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    return-object v1

    .line 347
    :pswitch_4
    iget-object v1, v0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v1, LC0/A;

    .line 350
    .line 351
    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-nez v2, :cond_15

    .line 356
    .line 357
    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    if-eqz v2, :cond_13

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_13
    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    if-eqz v2, :cond_16

    .line 369
    .line 370
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    if-eqz v2, :cond_14

    .line 375
    .line 376
    invoke-virtual {v2}, Landroid/view/View;->clearFocus()V

    .line 377
    .line 378
    .line 379
    :cond_14
    invoke-virtual {v1}, Landroid/view/ViewGroup;->clearFocus()V

    .line 380
    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_15
    :goto_7
    invoke-virtual {v1}, Landroid/view/ViewGroup;->clearFocus()V

    .line 384
    .line 385
    .line 386
    :cond_16
    :goto_8
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 387
    .line 388
    return-object v1

    .line 389
    :pswitch_5
    iget-object v1, v0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v1, Landroid/view/View;

    .line 392
    .line 393
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 394
    .line 395
    const/16 v3, 0x1e

    .line 396
    .line 397
    if-lt v2, v3, :cond_17

    .line 398
    .line 399
    invoke-static {v1}, LE0/e;->f(Landroid/view/View;)V

    .line 400
    .line 401
    .line 402
    :cond_17
    const/16 v3, 0x1d

    .line 403
    .line 404
    if-lt v2, v3, :cond_19

    .line 405
    .line 406
    invoke-static {v1}, LE0/b;->a(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    if-nez v2, :cond_18

    .line 411
    .line 412
    goto :goto_9

    .line 413
    :cond_18
    new-instance v3, LE0/c;

    .line 414
    .line 415
    invoke-direct {v3, v2, v1}, LE0/c;-><init>(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)V

    .line 416
    .line 417
    .line 418
    goto :goto_a

    .line 419
    :cond_19
    :goto_9
    const/4 v3, 0x0

    .line 420
    :goto_a
    return-object v3

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
